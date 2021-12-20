import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.InputMismatchException;

class HotelBooking extends maintrav{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=s.next();
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		System.out.println("Enter your gender: ");
		char g=s.next().charAt(0);
		System.out.println("Enter the city you want to travel to:");
		String city=s.next();	
		System.out.println("How many travelers: ");
		int num=s.nextInt();
		for(int i=1; i<=num; i++){
		System.out.println("Details of person "+i+" :");
		System.out.println("Enter name: ");
		String name1=s.next();
		System.out.println("Enter age: ");
		int age1=s.nextInt();
		System.out.println("Enter gender: ");
		char g1=s.next().charAt(0);
}
		System.out.println("If you are one of the travellers then enter 1 else enter 2.");
		int ch=s.nextInt();
		if(ch==1){
		HotelBooking hb=new HotelBooking();
		hb.msg();
}
		else
		System.out.println("You are not included in travellers' list.");
		System.out.println("Enter the number alongside hotel you want to stay in-- 1.Marriott 2.ITC 3.Taj Palace 4.AirBnb");
		int n=s.nextInt();
		System.out.println("How many room(s) do you need: ");
		int room=s.nextInt();
		System.out.println("Price of each room: Rs.5400");
		int tp=5400*room;
		System.out.println("Total Price: "+tp);
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("-------BILL------");
		System.out.println("Booking id: "+g+tp+age);
		int discount=1000;
		if(tp>10000){
				tp=tp-1000;
				System.out.println("Price after discount: Rs."+tp);
		}
		else 
		System.out.println("Get Rs.1000 off for billing over Rs.10000");
		System.out.println("You just booked yourself in ");
		if(n==1)
		System.out.println("Marriott");
		else if(n==2)
		System.out.println("ITC");
		else if(n==3)
		System.out.println("Taj Palace");
		else
		System.out.println("AirBnb");
		System.out.println("Thank you for booking with us, do visit again.");
}
}
class maintrav{
	void msg(){
	System.out.println("You've been added as one of the travellers too.");
}
}