import java.net.*;
import java.io.*;
import java.util.*;

public class HttpHeaderAnalyzer {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a URL: ");
            String urlString = reader.readLine();

            // Create URL and open connection
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Display request method, response code and message
            System.out.println("\n--- HTTP Header Information ---");
            System.out.println("Request Method: " + connection.getRequestMethod());
            System.out.println("Response Code: " + connection.getResponseCode());
            System.out.println("Response Message: " + connection.getResponseMessage());

            // Display all HTTP headers
            System.out.println("\n--- Response Headers ---");
            Map<String, List<String>> headerFields = connection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String headerName = entry.getKey();
                List<String> headerValues = entry.getValue();

                if (headerName != null) {
                    System.out.println(headerName + ": " + String.join(", ", headerValues));
                } else {
                    // Status line (HTTP/1.1 200 OK)
                    System.out.println(String.join(", ", headerValues));
                }
            }

            connection.disconnect();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
