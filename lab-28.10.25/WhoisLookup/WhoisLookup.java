package lab2_19_08_25;

import java.io.*;
import java.net.*;

public class WhoisLookup {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
           
            System.out.print("Enter a domain name: ");
            String domain = reader.readLine();

          
            Socket socket = new Socket("whois.internic.net", 43);
            System.out.println("Connected to whois.internic.net...");

         
            OutputStream out = socket.getOutputStream();
            out.write((domain + "\r\n").getBytes());
            out.flush();

            
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            System.out.println("\nWHOIS Response:\n-------------------------");
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

    
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
