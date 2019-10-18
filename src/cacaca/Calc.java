package cacaca;
import javax.swing.*;

public class Calc {
	public static void main (String[] args) {
		JFrame frame = new FrameCalc("Calculadora de IMC");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
