package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Informa extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Informa frame = new Informa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Informa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Realizar Login como:");
		
		JRadioButton estudante = new JRadioButton("Estudante");
		JRadioButton professor = new JRadioButton("Professor");
		
		JRadioButton funcionario = new JRadioButton("Funcionário");
		
		buttonGroup.add(funcionario);
		buttonGroup.add(professor);
		buttonGroup.add(estudante); 
		
		estudante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(estudante.isSelected()) {
					professor.setSelected(false);
					funcionario.setSelected(false);
				}
			}
		});
		estudante.setSelected(true);
		

		
		JButton btnProsseguir = new JButton("Prosseguir");
		btnProsseguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(estudante.isSelected()) {
					CadastroAluno aluno = new CadastroAluno();
					aluno.setVisible(true);
				}else if(professor.isSelected()){
					CadastroProfessor cadastroProfessor = new CadastroProfessor();
					cadastroProfessor.setVisible(true);
				}else {
					CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
					cadastroFuncionario.setVisible(true);
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(335, Short.MAX_VALUE)
					.addComponent(btnProsseguir)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(funcionario, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addComponent(professor, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(estudante, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(294, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(estudante)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(professor)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(funcionario)
					.addPreferredGap(ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
					.addComponent(btnProsseguir)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
