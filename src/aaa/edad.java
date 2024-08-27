package aaa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class edad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField edad;
	private static ArrayList <String> edades = new ArrayList<String>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					edad frame = new edad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public edad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		edad = new JTextField();
		edad.setBounds(107, 11, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ingrese edad:");
		lblNewLabel.setBounds(24, 14, 86, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				edades.add(edad.getText());
			}
		});
		btnNewButton.setBounds(117, 42, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("lista");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listado miVentanaLista = new listado(edades);
				
				miVentanaLista.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(24, 42, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
