package ke5.ea3;

public class TimerTest {
	public static void main(String[] args) {
		EggTimerModel etModel = new EggTimerModel(7);
		EggTimerController etController = new EggTimerController(etModel);
	}
}
