package Backend;


import java.awt.Color;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica extends JFrame{
	  JPanel panel;
	 
	public Grafica() {setTitle("Grafica");
    setSize(800,600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(HIDE_ON_CLOSE);
    setVisible(true);
    init();
    }
	  
	private void init() {
		  
	            panel = new JPanel();
	            getContentPane().add(panel);
	            // Fuente de Datos
	            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	            			// cantidad,  fila,  columna
	            dataset.addValue(1, "Negocio 1", "Lunes");
	            dataset.addValue(2, "Negocio 1", "Martes");
	            dataset.addValue(3, "Negocio 1", "Miércoles");
	            dataset.addValue(4, "Negocio 2", "Jueves");
	            dataset.addValue(1, "Negocio 1", "Jueves");
	            dataset.addValue(5, "Negocio 1", "Viernes");
	            dataset.addValue(6, "Negocio 1", "Sábado");
	            dataset.addValue(7, "Negocio 1", "Domingo");
	           
	            // Creando el Grafico
	            JFreeChart chart = ChartFactory.createBarChart3D
	                ("Grafica de muestra", "Negocio", "Dia",
	                        dataset, PlotOrientation.VERTICAL, true,true, false);
	            chart.setBackgroundPaint(new Color(100,34,250));
	            chart.getTitle().setPaint(Color.black);
	            CategoryPlot p = chart.getCategoryPlot();
	            p.setRangeGridlinePaint(Color.BLUE);
	            // Mostrar Grafico
	            ChartPanel chartPanel = new ChartPanel(chart);
	            panel.add(chartPanel);
		  
	}
	
	public static void main(String args[]) {
		new Grafica();
	}
	
}
