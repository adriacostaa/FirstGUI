import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{ 
	int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() { //construtor
		frame = new JFrame();
		JButton button = new JButton("Clique aqui!");
		button.addActionListener(this); 
		// o this significa que ao clicar vai para esta classe (GUI) e usa o metodo ouvinte da ação
		
		label = new JLabel ("Numero de cliques: 0");
		
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
				
	}
	
	public static void main(String[] args ) {
		new GUI(); //cria um objeto a partir da classe 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Numero de cliques: "+count);
	}

}
