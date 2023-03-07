package tpRESeau;
import java.io.*;
import java.net.*;





	public class tp1Q1client {
	    public static void main(String[] args) {
	        try {
	            Socket socket = new Socket("localhost", 9999);
	            System.out.println("Connecté au serveur : " + socket.getInetAddress().getHostAddress());

	            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
	            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

	            double[][] matrice1 = {{1, 2, 3}, {4, 5, 6}};
	            double[][] matrice2 = {{7, 8}, {9, 10}, {11, 12}};

	            out.writeObject(matrice1);
	            out.writeObject(matrice2);

	            double[][] resultat = (double[][]) in.readObject();

	            System.out.println("Résultat :");
	            for (int i = 0; i < resultat.length; i++) {
	                for (int j = 0; j < resultat[0].length; j++) {
	                    System.out.print(resultat[i][j] + " ");
	                }
	                System.out.println();
	            }

	            out.close();
	            in.close();
	            socket.close();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	
}
