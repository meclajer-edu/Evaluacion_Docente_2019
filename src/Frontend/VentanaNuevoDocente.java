package Frontend;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class VentanaNuevoDocente extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNuevoDocente frame = new VentanaNuevoDocente();
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
	public VentanaNuevoDocente() {
		getContentPane().setBackground(new Color(240, 248, 255));
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(25, 130, 400, 25);
		getContentPane().add(textField);
		
		JLabel label = new JLabel("Departamento");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(25, 95, 400, 25);
		getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(25, 60, 400, 25);
		getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("Nombre Completo");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(25, 25, 400, 25);
		getContentPane().add(label_1);
		
		JPanel panelMaterias = new JPanel();
		panelMaterias.setBounds(25, 175, 400, 358);
		getContentPane().add(panelMaterias);
		panelMaterias.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 400, 358);
		panelMaterias.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAgregar.setBounds(25, 555, 400, 35);
		getContentPane().add(btnAgregar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(25, 609, 400, 35);
		getContentPane().add(btnCancelar);
		setBounds(100, 100, 464, 694);

	}
}
