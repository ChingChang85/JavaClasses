import java.util.Random;

public abstract class ThinkRandom {
	protected int getRandomNum(){
		Random random = new Random();
		int ran =random.nextInt(10)+1;
		return ran;
	}
	public abstract void speakRandomNum();
}