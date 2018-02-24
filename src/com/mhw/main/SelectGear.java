package com.mhw.main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectGear {

	private String selection;
	private JFrame gearSelector = new JFrame();
	private JPanel gearSelectorPanel = new JPanel();
	private JButton Build = new JButton("Build");

	public static void main(String[] args) {
		new SelectGear();
	}

	private void gearSelection(String selection) {
		new GearBuilder();
	}

	private SelectGear() {

		

		Build.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection = "feetboots";
				gearSelector.setVisible(false);
				new SelectGear().gearSelection(selection);
			}
		});

		Build.setPreferredSize(new Dimension(80, 30));
		Build.setFont(new Font("Arial", Font.PLAIN, 40));
		gearSelectorPanel.setLayout(new GridLayout(5, 1));
		gearSelectorPanel.add(Build);

		gearSelector.add(gearSelectorPanel);

		gearSelector.setTitle("Choose gear type");
		gearSelector.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gearSelector.setLocationRelativeTo(null);
		gearSelector.setPreferredSize(new Dimension(700, 500));
		gearSelector.pack();

		gearSelector.setVisible(true);
	}
}
