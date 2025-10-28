package lab2_19_08_25;

import java.net.*;  

import java.util.Scanner; 



public class ipaddress {

    public static void main(String[] args) {

        try {

            InetAddress myAddress = InetAddress.getLocalHost();

            System.out.println("Your computer's Host Name: " + myAddress.getHostName());

            System.out.println("Your computer's IP Address: " + myAddress.getHostAddress());

            Scanner input = new Scanner(System.in);

            System.out.print("\nEnter a domain name (e.g. www.google.com): ");

            String domainName = input.nextLine();

            InetAddress[] addresses = InetAddress.getAllByName(domainName);

            System.out.println("\nIP addresses for " + domainName + ":");

            for (InetAddress addr : addresses) {

                System.out.println(addr.getHostAddress());

            }

            input.close(); 

        } catch (UnknownHostException e) {

            System.out.println("Could not find IP address for the given domain.");

        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());

        }

    }

}