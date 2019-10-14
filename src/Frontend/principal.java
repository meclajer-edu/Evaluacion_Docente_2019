package Frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.Window.Type;

public class principal {

	private JFrame frmEvaluacionDocente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
					window.frmEvaluacionDocente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEvaluacionDocente = new JFrame();
		frmEvaluacionDocente.setTitle("Evaluacion Docente");
		frmEvaluacionDocente.setResizable(false);
		frmEvaluacionDocente.setBounds(100, 100, 689, 762);
		frmEvaluacionDocente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		frmEvaluacionDocente.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}

}
