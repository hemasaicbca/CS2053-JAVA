import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            // Connect to server at localhost, port 5000
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            // Streams for input/output
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Chat loop
            String message, response;
            while (true) {
                System.out.print("You: ");
                message = input.readLine();
                out.println(message);

                if (message.equalsIgnoreCase("bye")) {
                    System.out.println("Chat ended.");
                    break;
                }

                response = in.readLine();
                System.out.println(response);
            }

            // Close resources
            input.close();
            out.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
