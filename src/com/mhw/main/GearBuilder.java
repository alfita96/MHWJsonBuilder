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
	
	@SuppressWarnings("unchecked")
	public void jsonBuilder(Gear gear, String gearType) throws IOException {
		
		String headPath = "C:\\Users\\John\\git\\MHWJsonBuilder\\src\\headgear.json";
		String chestPath = "C:\\Users\\John\\git\\MHWJsonBuilder\\src\\chestgear.json";
		String gauntletPath = "C:\\Users\\John\\git\\MHWJsonBuilder\\src\\gauntletgear.json";
		String waistPath = "C:\\Users\\John\\git\\MHWJsonBuilder\\src\\waistgear.json";
		String feetPath = "C:\\Users\\John\\git\\MHWJsonBuilder\\src\\feetgear.json";
		
		String path = null;
		
		JSONObject object = new JSONObject();
		JSONObject slotObject = new JSONObject();
		JSONObject skillsObject = new JSONObject();
		JSONObject skill1Object = new JSONObject();
		JSONObject skill2Object = new JSONObject();
		JSONObject bonusObject = new JSONObject();
		
		object.put("name", gear.getName());
		object.put("monster", gear.getMonster());
		object.put("defense", gear.getDefense());
		
		slotObject.put("slotType1", gear.getSlotType1());
		slotObject.put("slotType2", gear.getSlotType2());
		slotObject.put("slotType3", gear.getSlotType3());
		object.put("slots", slotObject);
		
		object.put("fireDef", gear.getFireDef());
		object.put("waterDef", gear.getWaterDef());
		object.put("thunderDef", gear.getThunderDef());
		object.put("iceDef", gear.getIceDef());
		object.put("draongDef", gear.getDragonDef());
		
		skill1Object.put("name", gear.getSkill1Name());
		skill1Object.put("quantity", gear.getSkill1Quantity());
		skillsObject.put("skill1", skill1Object);
		
		if (gear.getSkill2Name() != "") {
			skill2Object.put("name", gear.getSkill2Name());
			skill2Object.put("quantity", gear.getSkill2Quantity());
			skillsObject.put("skill2", skill1Object);
		}
		
		if (gear.getBonusName() != "") {
			bonusObject.put("requiredPieces", gear.getBonusRequiredPieces());
			bonusObject.put("name", gear.getBonusName());
			skillsObject.put("bonus", bonusObject);
		}
		
		object.put("skills", skillsObject);
		
		if (gearType == "headgear") {
			path = headPath;
		} else if (gearType == "chestgear") {
			path = chestPath;
		} else if (gearType == "gauntletgear") {
			path = gauntletPath;
		} else if (gearType == "waistgear") {
			path = waistPath;
		} else if (gearType == "feetgear") {
			path = feetPath;
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.write(object.toJSONString() + ",");
		}
		
		
	}
	
	GearBuilder() {
		JFrame gearFrame = new JFrame();
		JPanel gearPanel = new JPanel(new SpringLayout());
		
		String[] labels = {"Gear Name", "Monster Name", "Defense(int)", "First Slot(int)", "Second Slot(int)", "Third Slot(int)", "Fire Defense", "Water Defense", "Thunder Defense", "Ice Defense", "Dragon Defense", "First Skill Name", "First Skill Quantity(int)", "Second Skill Name", "Second Skill Quantity(int)", "Bonus Skill Name", "Bonus Skill Pieces(int)"};
		int numPairs = labels.length;
		
		JTextField name = new JTextField();
		name.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel nameLabel = new JLabel(labels[0], JLabel.TRAILING);
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(nameLabel);
		nameLabel.setLabelFor(name);
		gearPanel.add(name);
		
		JTextField monster = new JTextField();
		monster.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel monsterLabel = new JLabel(labels[1], JLabel.TRAILING);
		monsterLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(monsterLabel);
		monsterLabel.setLabelFor(monster);
		gearPanel.add(monster);
		
		JTextField defense = new JTextField();
		defense.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel defenseLabel = new JLabel(labels[2], JLabel.TRAILING);
		defenseLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(defenseLabel);
		defenseLabel.setLabelFor(defense);
		gearPanel.add(defense);
		
		JTextField slotType1 = new JTextField();
		slotType1.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel slotType1Label = new JLabel(labels[3], JLabel.TRAILING);
		slotType1Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(slotType1Label);
		slotType1Label.setLabelFor(slotType1);
		gearPanel.add(slotType1);
		
		JTextField slotType2 = new JTextField();
		slotType2.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel slotType2Label = new JLabel(labels[4], JLabel.TRAILING);
		slotType2Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(slotType2Label);
		slotType2Label.setLabelFor(slotType2);
		gearPanel.add(slotType2);
		
		JTextField slotType3 = new JTextField();
		slotType3.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel slotType3Label = new JLabel(labels[5], JLabel.TRAILING);
		slotType3Label.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(slotType3Label);
		slotType3Label.setLabelFor(slotType3);
		gearPanel.add(slotType3);
		
		JTextField fireDef = new JTextField();
		fireDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel fireDefLabel = new JLabel(labels[6], JLabel.TRAILING);
		fireDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(fireDefLabel);
		fireDefLabel.setLabelFor(fireDef);
		gearPanel.add(fireDef);
		
		JTextField waterDef = new JTextField();
		waterDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel waterDefLabel = new JLabel(labels[7], JLabel.TRAILING);
		waterDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(waterDefLabel);
		waterDefLabel.setLabelFor(waterDef);
		gearPanel.add(waterDef);
		
		JTextField thunderDef = new JTextField();
		thunderDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel thunderDefLabel = new JLabel(labels[8], JLabel.TRAILING);
		thunderDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(thunderDefLabel);
		thunderDefLabel.setLabelFor(thunderDef);
		gearPanel.add(thunderDef);
		
		JTextField iceDef = new JTextField();
		iceDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel iceDefLabel = new JLabel(labels[9], JLabel.TRAILING);
		iceDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(iceDefLabel);
		iceDefLabel.setLabelFor(iceDef);
		gearPanel.add(iceDef);
		
		JTextField dragonDef = new JTextField();
		dragonDef.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel dragonDefLabel = new JLabel(labels[10], JLabel.TRAILING);
		dragonDefLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(dragonDefLabel);
		dragonDefLabel.setLabelFor(dragonDef);
		gearPanel.add(dragonDef);
		
		JTextField skill1Name = new JTextField();
		skill1Name.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel skill1NameLabel = new JLabel(labels[11], JLabel.TRAILING);
		skill1NameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(skill1NameLabel);
		skill1NameLabel.setLabelFor(skill1Name);
		gearPanel.add(skill1Name);
		
		JTextField skill1Quantity = new JTextField();
		skill1Quantity.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel skill1QuantityLabel = new JLabel(labels[12], JLabel.TRAILING);
		skill1QuantityLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(skill1QuantityLabel);
		skill1QuantityLabel.setLabelFor(skill1Quantity);
		gearPanel.add(skill1Quantity);
		
		JTextField skill2Name = new JTextField();
		skill2Name.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel skill2NameLabel = new JLabel(labels[13], JLabel.TRAILING);
		skill2NameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(skill2NameLabel);
		skill2NameLabel.setLabelFor(skill2Name);
		gearPanel.add(skill2Name);
		
		JTextField skill2Quantity = new JTextField();
		skill2Quantity.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel skill2QuantityLabel = new JLabel(labels[14], JLabel.TRAILING);
		skill2QuantityLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(skill2QuantityLabel);
		skill2QuantityLabel.setLabelFor(skill2Quantity);
		gearPanel.add(skill2Quantity);
		
		JTextField bonusRequiredPieces = new JTextField();
		bonusRequiredPieces.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel bonusRequiredPiecesLabel = new JLabel(labels[15], JLabel.TRAILING);
		bonusRequiredPiecesLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(bonusRequiredPiecesLabel);
		bonusRequiredPiecesLabel.setLabelFor(bonusRequiredPieces);
		gearPanel.add(bonusRequiredPieces);
		
		JTextField bonusName = new JTextField();
		bonusName.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel bonusNameLabel = new JLabel(labels[16], JLabel.TRAILING);
		bonusNameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		gearPanel.add(bonusNameLabel);
		bonusNameLabel.setLabelFor(bonusName);
		gearPanel.add(bonusName);
		
		JTextField[] textField = {name,monster,defense,slotType1,slotType2,slotType3,fireDef,waterDef,thunderDef,iceDef,dragonDef,skill1Name,skill1Quantity,skill2Name,skill2Quantity,bonusRequiredPieces,bonusName};
		JButton headGear = new GearBuilder().jButton("headgear", textField);
		JButton chestGear = new GearBuilder().jButton("chestgear", textField);
		JButton gauntletGear = new GearBuilder().jButton("gauntletgear", textField);
		JButton waistGear = new GearBuilder().jButton("waistgear", textField);
		JButton feetGear = new GearBuilder().jButton("feetgear", textField);

		gearPanel.add(headGear);
		gearPanel.add(chestGear);
		gearPanel.add(gauntletGear);
		gearPanel.add(waistGear);
		gearPanel.add(feetGear);
		gearPanel.setLayout(new GridLayout(numPairs + 6 ,2));
		gearFrame.add(gearPanel);
		gearFrame.setTitle("Enter gear properties");
		gearFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gearFrame.setLocationRelativeTo(null);
		gearFrame.setPreferredSize(new Dimension(700, 500));
		gearFrame.pack();
		
		gearFrame.setVisible(true);
		
	}
	
	public JButton jButton(String gearType, JTextField[] textField) {
		JButton button = new JButton(gearType);
		Gear gear = new Gear();
		
		button = new JButton(gearType);
		button.setFont(new Font("Arial", Font.PLAIN, 30));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gear.setName(textField[0].getText());
				gear.setMonster(textField[1].getText());
				gear.setDefense(textField[2].getText());
				gear.setSlotType1(textField[3].getText());
				gear.setSlotType2(textField[4].getText());
				gear.setSlotType3(textField[5].getText());
				gear.setFireDef(textField[6].getText());
				gear.setWaterDef(textField[7].getText());
				gear.setThunderDef(textField[8].getText());
				gear.setIceDef(textField[9].getText());
				gear.setDragonDef(textField[10].getText());
				gear.setSkill1Name(textField[11].getText());
				gear.setSkill1Quantity(textField[12].getText());
				gear.setSkill2Name(textField[13].getText());
				gear.setSkill2Quantity(textField[14].getText());
				gear.setBonusName(textField[15].getText());
				gear.setBonusRequiredPieces(textField[16].getText());
				try {
					new GearBuilder().jsonBuilder(gear, gearType);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		return button;
	}

}
