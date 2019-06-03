package ke5.ea3;

public class EggTimerController implements TickListener {
	EggTimerModel etModel;
	EventBasedTimer ebTimer;

	public EggTimerController(EggTimerModel etModel) {
		this.etModel = etModel;
		ebTimer = new EventBasedTimer();
		ebTimer.addTickListener(this);
		ebTimer.start();
	}

	@Override
	public void tickPerformed() {
		etModel.increaseElapsedTime();
		System.out.println(etModel.getElapsedPart());
		if (etModel.getElapsedPart() >= 1) {
			ebTimer.stop();
		}
	}
}
