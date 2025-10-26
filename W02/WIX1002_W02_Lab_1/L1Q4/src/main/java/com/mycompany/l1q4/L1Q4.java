/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q4;

/**
 *
 * @author Tay
 */

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class L1Q4 extends JFrame {
    public L1Q4() {
        setTitle("Sales by Month (2016)");

        // Step 1: Create dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("January 2016 = 2500", 2500);
        dataset.setValue("February 2016 = 1600", 1600);
        dataset.setValue("March 2016 = 2000", 2000);
        dataset.setValue("April 2016 = 2700", 2700);
        dataset.setValue("May 2016 = 3200", 3200);
        dataset.setValue("June 2016 = 800", 800);

        // Step 2: Create chart
        JFreeChart chart = ChartFactory.createPieChart(
                "Sales Distribution (2016)",
                dataset,
                true,   // include legend
                true,
                false
        );

        // Step 3: Customize chart
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);

        // This shows only percentage *inside* slices
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
                "{2}", new DecimalFormat("0"), new DecimalFormat("0.0%")
        ));

        // Keeps labels inside the slices
        plot.setSimpleLabels(false);
        plot.setInteriorGap(0.04);
        plot.setLabelFont(new Font("Arial", Font.BOLD, 14));
        plot.setLabelBackgroundPaint(new Color(255, 255, 255, 180));

        // Step 4: Wrap in panel
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            L1Q4 frame = new L1Q4();
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
    
}
