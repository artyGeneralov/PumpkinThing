import java.util.Random;

public class Pumpkin extends Thread {

	private final int SLEEP_TIME = 2000;

	private String pumpID;
	private int current_height = 0;
	private int max_height;

	public Pumpkin(String pumpID, int height) {
		this.pumpID = pumpID;
		this.max_height = height;
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep(SLEEP_TIME);
				Random rnd = new Random();
				int toGrow = (rnd.nextInt(9) + 1);
				this.current_height += toGrow;
				if (this.current_height > this.max_height) {
					High.theBigPumpkin(this);
					return;
				}
				System.out.printf("%s:\t %d cm to Max height\n", this.pumpID, this.max_height - this.current_height);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String getPumpID() {
		return pumpID;

	}
}
