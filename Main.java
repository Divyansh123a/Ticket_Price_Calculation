import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		Ticket obj = new Ticket();
		System.out.println("Enter no of bookings:");
		int nb = sc.nextInt();
		System.out.println("Enter the available tickets:");
		int a = sc.nextInt();
		obj.setAvailableTickets(a);
		while(nb>0){
		System.out.println("Enter the ticketid:");
		int i = sc.nextInt();
		obj.setTicketid(i);
		System.out.println("Enter the no of tickets:");
		int nt = sc.nextInt();
		if(obj.calculateTicketCost(nt)==-1)
		{
		    continue;
		}
		    System.out.println("Available Tickets :"+obj.getAvailableTickets());
	    	System.out.println("Total amount:"+obj.calculateTicketCost(nt));
     		System.out.println("Available ticket after booking:"+obj.getAvailableTickets());
		nb--;
		}
	}

}
