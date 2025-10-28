import java.net.*;
import java.io.*;
import java.util.*;

public class WebsiteInfoViewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Get URL from user
            System.out.print("Enter a URL (example: https://www.google.com): ");
            String urlString = sc.nextLine();

            // Create URL object
            URL url = new URL(urlString);

            // Open connection
            URLConnection conn = url.openConnection();

            // Display basic info
            System.out.println("\n--- Website Information ---");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Content Type: " + conn.getContentType());
            System.out.println("Date: " + new Date(conn.getDate()));
            System.out.println("Last Modified: " + new Date(conn.getLastModified()));
            System.out.println("Content Length: " + conn.getContentLengthLong() + " bytes");

            // Display first few lines of content
            System.out.println("\n--- First Few Lines of Webpage Content ---");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            String line;
            int count = 0;
            while ((line = br.readLine()) != null && count < 10) {
                System.out.println(line);
                count++;
            }

            br.close();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL format.");
        } catch (IOException e) {
            System.out.println("Error reading from the URL.");
        }
    }
}
