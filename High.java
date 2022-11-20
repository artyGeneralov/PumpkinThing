
public class High {

	private static int position = 1;

	public static synchronized void theBigPumpkin(Pumpkin p) {
		System.out.printf("-----\n%s is position %d\n-----\n", p.getPumpID(), position);
		position++;
	}
}
