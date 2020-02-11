package Frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyectos\\EvaluacionDocente\\EvaluacionSemiITSJ\\Evaluacion_Docente_2019\\src\\Imagenes\\ITSJ.png"));
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Evaluacion Docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_Header = new JPanel();
		panel_Header.setBackground(new Color(139, 0, 0));
		contentPane.add(panel_Header, BorderLayout.NORTH);
		
		JLabel lblEvaluacionDocenteSemiescolarizado = new JLabel("Evaluacion Docente Semiescolarizado");
		lblEvaluacionDocenteSemiescolarizado.setForeground(new Color(255, 255, 255));
		lblEvaluacionDocenteSemiescolarizado.setFont(new Font("Dialog", Font.BOLD, 30));
		panel_Header.add(lblEvaluacionDocenteSemiescolarizado);
		
		JPanel panel_Body = new JPanel();
		panel_Body.setBackground(new Color(240, 255, 255));
		contentPane.add(panel_Body, BorderLayout.CENTER);
		panel_Body.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 976, 22);
		panel_Body.add(menuBar);
		
		JMenu mnAsignacion = new JMenu("Asignacion");
		menuBar.add(mnAsignacion);
		
		JMenuItem mntmAsignarMaterias = new JMenuItem("Asignar materias");
		mnAsignacion.add(mntmAsignarMaterias);
		
		JMenu mnMaterias = new JMenu("Materias");
		menuBar.add(mnMaterias);
		
		JMenuItem mntmNuevaMateria = new JMenuItem("Nueva");
		mnMaterias.add(mntmNuevaMateria);
		
		JMenuItem mntmEliminarMateria = new JMenuItem("Eliminar");
		mnMaterias.add(mntmEliminarMateria);
		
		JMenuItem mntmAdministrar = new JMenuItem("Administrar");
		mnMaterias.add(mntmAdministrar);
		
		JMenu mnDocentes = new JMenu("Docentes");
		menuBar.add(mnDocentes);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnDocentes.add(mntmNuevo);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mnDocentes.add(mntmEliminar);
		
		JMenuItem mntmAdministrar_1 = new JMenuItem("Administrar");
		mnDocentes.add(mntmAdministrar_1);
		
		JLabel lblFiltrarPor = new JLabel("Filtrar por:");
		lblFiltrarPor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblFiltrarPor.setBounds(212, 42, 332, 39);
		panel_Body.add(lblFiltrarPor);
		
		JLabel lblPorDocente = new JLabel("Por docente:");
		lblPorDocente.setAlignmentY(100.0f);
		lblPorDocente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPorDocente.setBounds(212, 91, 168, 39);
		panel_Body.add(lblPorDocente);
		
		TextField textFieldPorDocente = new TextField();
		textFieldPorDocente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldPorDocente.setBounds(212, 136, 168, 26);
		panel_Body.add(textFieldPorDocente);
		
		TextField textFieldPorMateria = new TextField();
		textFieldPorMateria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldPorMateria.setBounds(422, 136, 168, 26);
		panel_Body.add(textFieldPorMateria);
		
		JLabel lblPorMateria = new JLabel("Por materia:");
		lblPorMateria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPorMateria.setAlignmentY(100.0f);
		lblPorMateria.setBounds(422, 91, 168, 39);
		panel_Body.add(lblPorMateria);
		
		JLabel lblEvaluadas = new JLabel("Por evaluadas:");
		lblEvaluadas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEvaluadas.setAlignmentY(100.0f);
		lblEvaluadas.setBounds(628, 91, 137, 39);
		panel_Body.add(lblEvaluadas);
		
		Checkbox checkbox = new Checkbox("Evaluados.");
		checkbox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkbox.setBounds(628, 136, 137, 26);
		panel_Body.add(checkbox);
		
		JPanel panel = new JPanel();
		panel.setBounds(212, 183, 553, 270);
		panel_Body.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 553, 270);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		Button buttonEvaluar = new Button("Evaluar Docente");
		buttonEvaluar.setBounds(212, 470, 378, 26);
		panel_Body.add(buttonEvaluar);
		
		Button buttonNuevoDocente = new Button("Nuevo Docente");
		buttonNuevoDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonNuevoDocente.setBounds(607, 470, 158, 26);
		panel_Body.add(buttonNuevoDocente);
	}
}
