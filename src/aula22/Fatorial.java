package aula22;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fatorial {

	private JFrame frame;
	private JTextField tfNumero;
	private JTextField tfResultado;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fatorial window = new Fatorial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fatorial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(28, 29, 77, 38);
		frame.getContentPane().add(lblNewLabel);
		
		tfNumero = new JTextField();
		tfNumero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfNumero.setBounds(118, 38, 86, 20);
		frame.getContentPane().add(tfNumero);
		tfNumero.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 89, 93, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfResultado = new JTextField();
		tfResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfResultado.setEditable(false);
		tfResultado.setBounds(118, 92, 148, 20);
		frame.getContentPane().add(tfResultado);
		tfResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular Fatorial");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.parseInt(
						tfNumero.getText()
						), 
					fatorial = 1;
				
				while (numero > 1) {
					fatorial *= numero;
					numero--;
				}
				tfResultado.setText(
						String.valueOf(fatorial));
			}
		});
		btnNewButton.setBounds(28, 146, 176, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Somar Quadrados");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.parseInt(
						tfNumero.getText()
						);
				tfResultado.setText(
						String.valueOf(numero*numero));
			}
		});
		btnNewButton_1.setBounds(28, 194, 225, 20);
		frame.getContentPane().add(btnNewButton_1);
	}
}
