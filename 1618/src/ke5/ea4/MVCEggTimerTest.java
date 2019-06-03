package ke5.ea4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MVCEggTimerTest {
	public static void main(String[] args) {
		EggTimerModel etModel = new EggTimerModel(7);
		EggTimerCanvas etCanvas = new EggTimerCanvas(etModel);
		EggTimerController etController = new EggTimerController(etModel, etCanvas);
		Frame frame = new Frame("Kurzzeitwecker");
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});
		frame.add(etCanvas, BorderLayout.CENTER);
		Button bStart = new Button("Start");
		bStart.addActionListener(etController);
		frame.add(bStart, BorderLayout.SOUTH);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
