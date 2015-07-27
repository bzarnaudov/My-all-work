package all;

import java.util.Scanner;

public class UrlExtraction {
	public static void main(String[] args) {
	System.out.println("Please write your address like this : [protocol]://[server]/[resource] ");
	Scanner input = new Scanner(System.in);
	String address = input.nextLine();
	
	String protocol[] = address.split(":", 2);
	String server[] = address.split("/", 4);
	
	
	System.out.println(address);
	System.out.println(protocol[0]);
	System.out.println(server[2]);
	server[3] = "/" + server[3];
	System.out.println(server[3]);
	
	input.close();
	}
}
