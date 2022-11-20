import java.util.Scanner;

public class PumpComp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert maximum height: ");
		int height = in.nextInt();
		
		Pumpkin p1 = new Pumpkin("Pump1", height);
		Pumpkin p2 = new Pumpkin("Pump2", height);
		Pumpkin p3 = new Pumpkin("Pump3", height);
		Pumpkin p4 = new Pumpkin("Pump4", height);
		Pumpkin p5 = new Pumpkin("Pump5", height);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		in.close();
	}
	
}
