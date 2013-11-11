/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package splinepanel;

/*

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
* 
* */
import java.awt.*;       // Using AWT containers and components
import javax.swing.*;    // Using Swing components and containers
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author User
 */
public class SplinePanel{

    public JPanel createContentPane(){
        // This is where we'll put all our widgets
        // in the next tutorials!
        JPanel panel = new JPanel();
        
        /*
        
        SplineFactory s = new SplineFactory(); 
        
        double[] c = new double[12];
    c[0]  =   0.0;  // x0
    c[1]  =   0.0;  // y0
    c[2]  =   0.0;  // z0      
    
    c[3]  =   1.0;  // x1
    c[4]  =   1.0;  // y1
    c[5]  =   0.0;  // z1      

    c[6]  =   2.0;  // x2
    c[7]  =  -1.0;  // y2
    c[8]  =   0.0;  // z2      

    c[9]  =  10.0;  // x3
    c[10] =   0.0;  // y3
    c[11] =   0.0;  // z3      

    double[] spline1 = SplineFactory.createBezier (c,     20);
    double[] spline2 = SplineFactory.createCubic (c,      20);
    double[] spline3 = SplineFactory.createCatmullRom (c, 20); 
    
    /*

    System.out.println ("-- Bezier");
    for (int i = 0; i < spline1.length; i+=3)
      System.out.println (spline1[i] + "," + spline1[i+1] + "," + spline1[i+2]);
    
    System.out.println ("-- Cubic");
    for (int i = 0; i < spline2.length; i+=3)
      System.out.println (spline2[i] + "," + spline2[i+1] + "," + spline2[i+2]);

    System.out.println ("-- Catmull-Rom");
    for (int i = 0; i < spline3.length; i+=3)
      System.out.println (spline3[i] + "," + spline3[i+1] + "," + spline3[i+2]);
  
    */
        
       
        
        panel.setLayout(new BorderLayout());

        XYSeries series = new XYSeries("MyGraph");
        
        /*
        
        System.out.println ("-- Bezier");
        for (int i = 0; i < spline1.length; i+=3)
         System.out.println (spline1[i] + "," + spline1[i+1] + "," + spline1[i+2]);
        // series.add(spline1[i])
    
        System.out.println ("-- Cubic");
        for (int i = 0; i < spline2.length; i+=3)
         System.out.println (spline2[i] + "," + spline2[i+1] + "," + spline2[i+2]);

        System.out.println ("-- Catmull-Rom");
        for (int i = 0; i < spline3.length; i+=3)
         System.out.println (spline3[i] + "," + spline3[i+1] + "," + spline3[i+2]); 
         
         */
         
        /* 
        series.add(0, 1);
        series.add(1, 2);
        series.add(2, 5);
        series.add(7, 8);
        series.add(9, 10);
        */
         
         series.add(0, 1);
        series.add(1, 2);
        series.add(2, 5);
        series.add(7, 8);
        series.add(9, 10);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "XY Chart",
                "x-axis",
                "y-axis",
                dataset, 
                PlotOrientation.VERTICAL,
                true,
                true,
                false
                );
        ChartPanel chartPanel = new ChartPanel(chart);
        
        //chart.getXYPlot().setRenderer(new XYSplineRenderer());
       
        
        
        

        panel.add(chartPanel);
        //panel.setSize(800, 500);
        
        //content panes must be opaque
        
        
        
        panel.setOpaque(true); 
        return panel;  
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] There's a JPanel in here! [=]");

        //Create and set up the content pane.
        SplinePanel demo = new SplinePanel();
        frame.setContentPane(demo.createContentPane());

        // The other bits and pieces that make our program a bit more stable.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 650);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
