package tpRESeau;
import java.io.*;
import java.net.*;
public class tp2Q2minusclient {
	
	
			    public static void main(String[] args) {
			        try {
			            Socket server = new Socket("localhost", 5559);

			        
			            BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
			            PrintWriter out = new PrintWriter(server.getOutputStream(), true);

			         
			            String prompt = in.readLine();
			            System.out.print(prompt);
			            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			            String username = stdin.readLine();
			            out.println(username);

			        
			            prompt = in.readLine();
			            System.out.print(prompt);
			            String password = stdin.readLine();
			            out.println(password);

			        
			            prompt = in.readLine();
			            System.out.print(prompt);
			            int size = Integer.parseInt(stdin.readLine());
			            out.println(size);

			         
			            for (int i = 0; i < size; i++) {
			                for (int j = 0; j < size; j++) {
			                    prompt = in.readLine();
			                    System.out.print(prompt);
			                    double value = Double.parseDouble(stdin.readLine());
			                    out.println(value);
			                }
			            }


			            prompt = in.readLine();
			            System.out.println(prompt);
			            for (int i = 0; i < size; i++) {
			                for (int j = 0; j < size; j++) {
			                    

			                	
			                	
			                	
			                	double value = 0.0;
			                	String input = in.readLine();
			                	if (input != null && input.matches("-?\\d+(\\.\\d+)?")) {
			                	    value = Double.parseDouble(input);
			                	} else {
			                	    System.out.println(" " + input);
			                	}

			                	
			                	
			                	
			                    System.out.print(value + "\t");
			                }
			                System.out.println();
			            }

			            server.close();
			        } catch (IOException e) {
			            System.out.println("Error: " + e.getMessage());
			        }
			    }
			}








