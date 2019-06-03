package ke5.ea3;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class EventBasedTimer {
	private Timer internalTimer;

	private List<TickListener> listeners = new ArrayList<TickListener>();

	// Meldet einen TickListener beim Timer an.
	public void addTickListener(TickListener listener) {
		listeners.add(listener);
	}

	// Startet diesen Timer.
	public void start() {
		internalTimer = new Timer();
		internalTimer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				for (TickListener tickListener : listeners) {
					tickListener.tickPerformed();
				}
			}
		}, 1000, 1000);
	}

	// Stoppt diesen Timer.
	public void stop() {
		internalTimer.cancel();
	}
}