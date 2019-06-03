package ke5.ea2;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EggTimerCanvasTest {
	public static void main(String[] args) {
		// Erzeugen eines EggTimerModel für eine Laufzeit von 60 Sekunden.
		EggTimerModel etModel = new EggTimerModel(60);

		// Erzeugen eines EggTimerCanvas, das das oben erzeugte Model verwendet.
		EggTimerCanvas etCanvas = new EggTimerCanvas(etModel);

		// Erzeugen eines Haupfensters mit dem Titel "Kurzzeitwecker".
		Frame frame = new Frame("Kurzzeitwecker");

		// Anmelden eines "anonymen" Listeners, der beim Schließen des
		// Hauptfensters die Anwendung beendet.
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});

		// Einfügen des EggTimerCanvas im Zentralbereich des Hauptfensters.
		frame.add(etCanvas, BorderLayout.CENTER);
		
		// Dieser Aufruf sorgt dafür, dass dass der LayoutManager des Hauptfensters
		// dessen Größe gemäß der Wunschgrößen der auf diesem angeordneten
		// Komponenten berechnet. Hier müssen Sie nichts einfügen.
		frame.pack();

		// Positionieren des Fensters in der Bildschirmmitte
		// (siehe Ad-hoc-Aufgabe 4 der KE5).
		frame.setLocationRelativeTo(null);
		
		// Sichtbarmachen des Fensters.
		frame.setVisible(true);
		
		// Sorgt für eine Pause von vier Sekunden (wird in KE6 näher erläutert).
		// Hier müssen Sie nichts einfügen.
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		// viermaliges "Hochzählen" des Models.
		etModel.increaseElapsedTime();
		etModel.increaseElapsedTime();
		etModel.increaseElapsedTime();
		etModel.increaseElapsedTime();

		// Anstoßen eines Neuzeichnens des EggTimerCanvas.
		etCanvas.repaint();
	}
}