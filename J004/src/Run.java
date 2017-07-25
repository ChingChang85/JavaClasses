public class Run {
	public static void main(String[] args) {
		EnglishSpeaker englishSpeaker = new EnglishSpeaker();
		for (int id = 0; id < 10; id++) {
			englishSpeaker.speakRandomNum();

		}
		ChineseSpeaker chineseSpeaker = new ChineseSpeaker();
		for (int id = 0; id < 10; id++) {
			chineseSpeaker.speakRandomNum();

		}
	}
}