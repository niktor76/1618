package ke5.ea4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EggTimerController implements TickListener, ActionListener {
	private EggTimerModel etModel;
	private EventBasedTimer ebTimer;
	private EggTimerCanvas etCanvas;
	private boolean timerStarted;

	public EggTimerController(EggTimerModel etModel, EggTimerCanvas etCanvas) {
		this.etModel = etModel;
		this.etCanvas = etCanvas;
		ebTimer = new EventBasedTimer();
		ebTimer.addTickListener(this);
	}

	@Override
	public void tickPerformed() {
		etModel.increaseElapsedTime();
		etCanvas.repaint();
		if (etModel.getElapsedPart() >= 1) {
			ebTimer.stop();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// die Methode start() nur ein einziges mal aufrufen
		if(!timerStarted) {
			ebTimer.start();
			timerStarted = true;
		}
	}
}
