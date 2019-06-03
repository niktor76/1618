package ke5.ea4;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class EggTimerCanvas extends Canvas {
	EggTimerModel etModel;

	public EggTimerCanvas(EggTimerModel etModel) {
		this.etModel = etModel;
		setPreferredSize(new Dimension(320, 320));
		setBackground(Color.BLACK);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(10, 10, 300, 300);
		g.setColor(Color.GREEN);
		int arc = (int) (etModel.getElapsedPart() * -360);
		g.fillArc(10, 10, 300, 300, 90, arc);
	}
}
