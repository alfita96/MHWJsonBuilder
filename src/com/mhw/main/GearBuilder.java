package com.mhw.main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import org.json.simple.JSONObject;

import com.mhw.gear.Gear;

public class GearBuilder {

	GearBuilder() {
		Gear gear = new Gear();

		JFrame gearFrame = new JFrame();
		JPanel gearPanel = new JPanel(new SpringLayout());

		String[] labels = { "Gear Name", "Price", "Defense(int)", "First Slot(int)", "Second Slot(int)",
				"Third Slot(int)", "Fire Defense", "Water Defense", "Thunder Defense", "Ice Defense", "Dragon Defense",
				"First Skill Name", "First Skill Quantity(int)", "Second Skill Name", "Second Skill Quantity(int)",
				"First Material", "Quantity", "Second Material", "Quantity", "Third Material", "Quantity",
				"Fourth Material", "Quantity" };
		int numPairs = labels.length;
		int i = 0;

		JTextField name = new JTextField();
		name.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel nameLabel = new JLabel(labels[i], JLabel.TRAILING);
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(nameLabel);
		nameLabel.setLabelFor(name);
		gearPanel.add(name);

		JTextField price = new JTextField();
		price.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel priceLabel = new JLabel(labels[++i], JLabel.TRAILING);
		priceLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(priceLabel);
		priceLabel.setLabelFor(price);
		gearPanel.add(price);

		JTextField defense = new JTextField();
		defense.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel defenseLabel = new JLabel(labels[++i], JLabel.TRAILING);
		defenseLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(defenseLabel);
		defenseLabel.setLabelFor(defense);
		gearPanel.add(defense);

		JTextField slotType1 = new JTextField();
		slotType1.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel slotType1Label = new JLabel(labels[++i], JLabel.TRAILING);
		slotType1Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(slotType1Label);
		slotType1Label.setLabelFor(slotType1);
		gearPanel.add(slotType1);

		JTextField slotType2 = new JTextField();
		slotType2.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel slotType2Label = new JLabel(labels[++i], JLabel.TRAILING);
		slotType2Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(slotType2Label);
		slotType2Label.setLabelFor(slotType2);
		gearPanel.add(slotType2);

		JTextField slotType3 = new JTextField();
		slotType3.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel slotType3Label = new JLabel(labels[++i], JLabel.TRAILING);
		slotType3Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(slotType3Label);
		slotType3Label.setLabelFor(slotType3);
		gearPanel.add(slotType3);

		JTextField fireDef = new JTextField();
		fireDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel fireDefLabel = new JLabel(labels[++i], JLabel.TRAILING);
		fireDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(fireDefLabel);
		fireDefLabel.setLabelFor(fireDef);
		gearPanel.add(fireDef);

		JTextField waterDef = new JTextField();
		waterDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel waterDefLabel = new JLabel(labels[++i], JLabel.TRAILING);
		waterDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(waterDefLabel);
		waterDefLabel.setLabelFor(waterDef);
		gearPanel.add(waterDef);

		JTextField thunderDef = new JTextField();
		thunderDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel thunderDefLabel = new JLabel(labels[++i], JLabel.TRAILING);
		thunderDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(thunderDefLabel);
		thunderDefLabel.setLabelFor(thunderDef);
		gearPanel.add(thunderDef);

		JTextField iceDef = new JTextField();
		iceDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel iceDefLabel = new JLabel(labels[++i], JLabel.TRAILING);
		iceDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(iceDefLabel);
		iceDefLabel.setLabelFor(iceDef);
		gearPanel.add(iceDef);

		JTextField dragonDef = new JTextField();
		dragonDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel dragonDefLabel = new JLabel(labels[++i], JLabel.TRAILING);
		dragonDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(dragonDefLabel);
		dragonDefLabel.setLabelFor(dragonDef);
		gearPanel.add(dragonDef);

		JTextField skill1Name = new JTextField();
		skill1Name.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel skill1NameLabel = new JLabel(labels[++i], JLabel.TRAILING);
		skill1NameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(skill1NameLabel);
		skill1NameLabel.setLabelFor(skill1Name);
		gearPanel.add(skill1Name);

		JTextField skill1Quantity = new JTextField();
		skill1Quantity.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel skill1QuantityLabel = new JLabel(labels[++i], JLabel.TRAILING);
		skill1QuantityLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(skill1QuantityLabel);
		skill1QuantityLabel.setLabelFor(skill1Quantity);
		gearPanel.add(skill1Quantity);

		JTextField skill2Name = new JTextField();
		skill2Name.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel skill2NameLabel = new JLabel(labels[++i], JLabel.TRAILING);
		skill2NameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(skill2NameLabel);
		skill2NameLabel.setLabelFor(skill2Name);
		gearPanel.add(skill2Name);

		JTextField skill2Quantity = new JTextField();
		skill2Quantity.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel skill2QuantityLabel = new JLabel(labels[++i], JLabel.TRAILING);
		skill2QuantityLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(skill2QuantityLabel);
		skill2QuantityLabel.setLabelFor(skill2Quantity);
		gearPanel.add(skill2Quantity);

		JTextField materials1 = new JTextField();
		materials1.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel materials1Label = new JLabel(labels[++i], JLabel.TRAILING);
		materials1Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(materials1Label);
		materials1Label.setLabelFor(materials1);
		gearPanel.add(materials1);

		JTextField materials1Quantity = new JTextField();
		materials1Quantity.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel materials1QuantityLabel = new JLabel(labels[++i], JLabel.TRAILING);
		materials1QuantityLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(materials1QuantityLabel);
		materials1QuantityLabel.setLabelFor(materials1Quantity);
		gearPanel.add(materials1Quantity);

		JTextField materials2 = new JTextField();
		materials2.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel materials2Label = new JLabel(labels[++i], JLabel.TRAILING);
		materials2Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(materials2Label);
		materials2Label.setLabelFor(materials2);
		gearPanel.add(materials2);

		JTextField materials2Quantity = new JTextField();
		materials2Quantity.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel materials2QuantityLabel = new JLabel(labels[++i], JLabel.TRAILING);
		materials2QuantityLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(materials2QuantityLabel);
		materials2QuantityLabel.setLabelFor(materials2Quantity);
		gearPanel.add(materials2Quantity);

		JTextField materials3 = new JTextField();
		materials3.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel materials3Label = new JLabel(labels[++i], JLabel.TRAILING);
		materials3Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(materials3Label);
		materials3Label.setLabelFor(materials3);
		gearPanel.add(materials3);

		JTextField materials3Quantity = new JTextField();
		materials3Quantity.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel materials3QuantityLabel = new JLabel(labels[++i], JLabel.TRAILING);
		materials3QuantityLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(materials3QuantityLabel);
		materials3QuantityLabel.setLabelFor(materials3Quantity);
		gearPanel.add(materials3Quantity);

		JTextField materials4 = new JTextField();
		materials4.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel materials4Label = new JLabel(labels[++i], JLabel.TRAILING);
		materials4Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(materials4Label);
		materials4Label.setLabelFor(materials4);
		gearPanel.add(materials4);

		JTextField materials4Quantity = new JTextField();
		materials4Quantity.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel materials4QuantityLabel = new JLabel(labels[++i], JLabel.TRAILING);
		materials4QuantityLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(materials4QuantityLabel);
		materials4QuantityLabel.setLabelFor(materials4Quantity);
		gearPanel.add(materials4Quantity);

		JTextField[] textField = { name, price, defense, slotType1, slotType2, slotType3, fireDef, waterDef, thunderDef,
				iceDef, dragonDef, skill1Name, skill1Quantity, skill2Name, skill2Quantity, materials1,
				materials1Quantity, materials2, materials2Quantity, materials3, materials3Quantity, materials4,
				materials4Quantity };

		JButton headGear = new JButton("Head");
		headGear.setFont(new Font("Arial", Font.PLAIN, 30));
		headGear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				gear.setName(textField[i].getText());
				gear.setPrice(textField[++i].getText());
				gear.setDefense(textField[++i].getText());
				gear.setSlotType1(textField[++i].getText());
				gear.setSlotType2(textField[++i].getText());
				gear.setSlotType3(textField[++i].getText());
				gear.setFireDef(textField[++i].getText());
				gear.setWaterDef(textField[++i].getText());
				gear.setThunderDef(textField[++i].getText());
				gear.setIceDef(textField[++i].getText());
				gear.setDragonDef(textField[++i].getText());
				gear.setSkill1Name(textField[++i].getText());
				gear.setSkill1Quantity(textField[++i].getText());
				gear.setSkill2Name(textField[++i].getText());
				gear.setSkill2Quantity(textField[++i].getText());
				gear.setMaterial1(textField[++i].getText());
				gear.setMaterial1Quantity(textField[++i].getText());
				gear.setMaterial2(textField[++i].getText());
				gear.setMaterial2Quantity(textField[++i].getText());
				gear.setMaterial3(textField[++i].getText());
				gear.setMaterial3Quantity(textField[++i].getText());
				gear.setMaterial4(textField[++i].getText());
				gear.setMaterial4Quantity(textField[++i].getText());
				new JsonBuilder(gear, "headgear");
			}
		});

		JButton chestGear = new JButton("Chest");
		chestGear.setFont(new Font("Arial", Font.PLAIN, 30));
		chestGear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				gear.setName(textField[i].getText());
				gear.setPrice(textField[++i].getText());
				gear.setDefense(textField[++i].getText());
				gear.setSlotType1(textField[++i].getText());
				gear.setSlotType2(textField[++i].getText());
				gear.setSlotType3(textField[++i].getText());
				gear.setFireDef(textField[++i].getText());
				gear.setWaterDef(textField[++i].getText());
				gear.setThunderDef(textField[++i].getText());
				gear.setIceDef(textField[++i].getText());
				gear.setDragonDef(textField[++i].getText());
				gear.setSkill1Name(textField[++i].getText());
				gear.setSkill1Quantity(textField[++i].getText());
				gear.setSkill2Name(textField[++i].getText());
				gear.setSkill2Quantity(textField[++i].getText());
				gear.setMaterial1(textField[++i].getText());
				gear.setMaterial1Quantity(textField[++i].getText());
				gear.setMaterial2(textField[++i].getText());
				gear.setMaterial2Quantity(textField[++i].getText());
				gear.setMaterial3(textField[++i].getText());
				gear.setMaterial3Quantity(textField[++i].getText());
				gear.setMaterial4(textField[++i].getText());
				gear.setMaterial4Quantity(textField[++i].getText());
				new JsonBuilder(gear,"chestgear");
			}
		});

		JButton gauntletGear = new JButton("Gauntlet");
		gauntletGear.setFont(new Font("Arial", Font.PLAIN, 30));
		gauntletGear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				gear.setName(textField[i].getText());
				gear.setPrice(textField[++i].getText());
				gear.setDefense(textField[++i].getText());
				gear.setSlotType1(textField[++i].getText());
				gear.setSlotType2(textField[++i].getText());
				gear.setSlotType3(textField[++i].getText());
				gear.setFireDef(textField[++i].getText());
				gear.setWaterDef(textField[++i].getText());
				gear.setThunderDef(textField[++i].getText());
				gear.setIceDef(textField[++i].getText());
				gear.setDragonDef(textField[++i].getText());
				gear.setSkill1Name(textField[++i].getText());
				gear.setSkill1Quantity(textField[++i].getText());
				gear.setSkill2Name(textField[++i].getText());
				gear.setSkill2Quantity(textField[++i].getText());
				gear.setMaterial1(textField[++i].getText());
				gear.setMaterial1Quantity(textField[++i].getText());
				gear.setMaterial2(textField[++i].getText());
				gear.setMaterial2Quantity(textField[++i].getText());
				gear.setMaterial3(textField[++i].getText());
				gear.setMaterial3Quantity(textField[++i].getText());
				gear.setMaterial4(textField[++i].getText());
				gear.setMaterial4Quantity(textField[++i].getText());
				new JsonBuilder(gear, "gauntletgear");
			}
		});

		JButton waistGear = new JButton("Waist");
		waistGear.setFont(new Font("Arial", Font.PLAIN, 30));
		waistGear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				gear.setName(textField[i].getText());
				gear.setPrice(textField[++i].getText());
				gear.setDefense(textField[++i].getText());
				gear.setSlotType1(textField[++i].getText());
				gear.setSlotType2(textField[++i].getText());
				gear.setSlotType3(textField[++i].getText());
				gear.setFireDef(textField[++i].getText());
				gear.setWaterDef(textField[++i].getText());
				gear.setThunderDef(textField[++i].getText());
				gear.setIceDef(textField[++i].getText());
				gear.setDragonDef(textField[++i].getText());
				gear.setSkill1Name(textField[++i].getText());
				gear.setSkill1Quantity(textField[++i].getText());
				gear.setSkill2Name(textField[++i].getText());
				gear.setSkill2Quantity(textField[++i].getText());
				gear.setMaterial1(textField[++i].getText());
				gear.setMaterial1Quantity(textField[++i].getText());
				gear.setMaterial2(textField[++i].getText());
				gear.setMaterial2Quantity(textField[++i].getText());
				gear.setMaterial3(textField[++i].getText());
				gear.setMaterial3Quantity(textField[++i].getText());
				gear.setMaterial4(textField[++i].getText());
				gear.setMaterial4Quantity(textField[++i].getText());
				new JsonBuilder(gear, "waistgear");
			}
		});

		JButton feetGear = new JButton("Feet");
		feetGear.setFont(new Font("Arial", Font.PLAIN, 30));
		feetGear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				gear.setName(textField[i].getText());
				gear.setPrice(textField[++i].getText());
				gear.setDefense(textField[++i].getText());
				gear.setSlotType1(textField[++i].getText());
				gear.setSlotType2(textField[++i].getText());
				gear.setSlotType3(textField[++i].getText());
				gear.setFireDef(textField[++i].getText());
				gear.setWaterDef(textField[++i].getText());
				gear.setThunderDef(textField[++i].getText());
				gear.setIceDef(textField[++i].getText());
				gear.setDragonDef(textField[++i].getText());
				gear.setSkill1Name(textField[++i].getText());
				gear.setSkill1Quantity(textField[++i].getText());
				gear.setSkill2Name(textField[++i].getText());
				gear.setSkill2Quantity(textField[++i].getText());
				gear.setMaterial1(textField[++i].getText());
				gear.setMaterial1Quantity(textField[++i].getText());
				gear.setMaterial2(textField[++i].getText());
				gear.setMaterial2Quantity(textField[++i].getText());
				gear.setMaterial3(textField[++i].getText());
				gear.setMaterial3Quantity(textField[++i].getText());
				gear.setMaterial4(textField[++i].getText());
				gear.setMaterial4Quantity(textField[++i].getText());
				new JsonBuilder(gear, "feetgear");
			}
		});
		gearFrame.setVisible(true);
		gearPanel.add(headGear);
		gearPanel.add(chestGear);
		gearPanel.add(gauntletGear);
		gearPanel.add(waistGear);
		gearPanel.add(feetGear);
		gearPanel.setLayout(new GridLayout(numPairs + 3, 3));
		gearFrame.add(gearPanel);
		gearFrame.setTitle("Enter gear properties");
		gearFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gearFrame.setPreferredSize(new Dimension(1920, 2160));
//		gearFrame.setPreferredSize(new Dimension(960, 1040));
		gearFrame.setLocation(0, 0);
		gearFrame.pack();

	}
}
