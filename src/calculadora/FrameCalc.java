package calculadora;
import java.awt.*;
import javax.swing.*;

public class FrameCalc extends JFrame {
	private static final long serialVersionUID = 1L;

	public FrameCalc(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		JPanel jpnMassa = new JPanel();
		add(jpnMassa);
		
		JPanel jpnAltura = new JPanel();
		add(jpnAltura);
		
		JPanel jpnButtons = new JPanel();
		add(jpnButtons);
		
		jpnMassa.add(new JLabel("Digite sua massa: "));
		JTextField massa = new JTextField(15);
		jpnMassa.add(massa);
		
		jpnAltura.add(new JLabel("Digite sua altura: "));
		JTextField altura = new JTextField(15);
		jpnAltura.add(altura);
		
		JButton btnCalcular = new JButton ("Calcular IMC");
		jpnButtons.add(btnCalcular);
		
		JButton btnLimpar = new JButton ("Limpar");
		jpnButtons.add(btnLimpar);
		
		JButton btnFechar = new JButton ("Fechar");
		jpnButtons.add(btnFechar);
		
		btnCalcular.addActionListener((ev) -> {
			if (altura.getText().equals("0")) {
				JOptionPane.showMessageDialog(null, "Voc� n�o existe");
		    } else if (massa.getText().equals("0")) {
		    	JOptionPane.showMessageDialog(null, "Coma uma ma��");
		    } else {
				float massaFloat = Float.parseFloat(massa.getText());
				float alturaFloat = (Float.parseFloat(altura.getText())/100);
				float imcCalculado = massaFloat / (alturaFloat * alturaFloat);
				JOptionPane.showMessageDialog(null, "Seu �ndice de massa corporal � " + imcCalculado);
			}
		});
		btnFechar.addActionListener((ev) -> System.exit(0)); 
		btnLimpar.addActionListener((ev) -> {
			massa.setText("");
			altura.setText("");
		});
	}
}