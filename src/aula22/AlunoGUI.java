package aula22;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AlunoGUI {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCurso;
	private JTextField tfID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlunoGUI window = new AlunoGUI();
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
	public AlunoGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 53, 66, 31);
		frame.getContentPane().add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfNome.setBounds(70, 61, 305, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Curso:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 95, 66, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfCurso = new JTextField();
		tfCurso.setBounds(70, 95, 305, 20);
		frame.getContentPane().add(tfCurso);
		tfCurso.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno(
						Integer.parseInt(tfID.getText()), 
						tfNome.getText(), 
						tfCurso.getText());
				try {
					aluno.salvar();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(
							btnNewButton.getParent(), 
							e1.getMessage(), 
							"Erro", 0);
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(
						btnNewButton.getParent(), 
						"Aluno "+tfID.getText()+" cadastrado", 
						"Sucesso", 0);
			}
		});
		btnNewButton.setBounds(69, 158, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pesquisar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				
				try {
					aluno = aluno.pesquisar(
							Integer.parseInt(
									tfID.getText()));
					
					if (aluno == null) {
						JOptionPane.showMessageDialog(
								btnNewButton.getParent(), 
								"Aluno "+tfID.getText()+
								" não encontrado!",								
								"Erro", 0);						
					} else {
						tfNome.setText(aluno.getNome());
						tfCurso.setText(aluno.getCurso());
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(200, 158, 115, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(36, 28, 25, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfID = new JTextField();
		tfID.setBounds(70, 28, 86, 20);
		frame.getContentPane().add(tfID);
		tfID.setColumns(10);
	}
}
