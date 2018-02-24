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
	public void jsonBuilder(Gear gear) throws IOException {
		
		JSONObject headObject = new JSONObject();
		JSONObject slotObject = new JSONObject();
		JSONObject skillsObject = new JSONObject();
		JSONObject skill1Object = new JSONObject();
		JSONObject skill2Object = new JSONObject();
		JSONObject bonusObject = new JSONObject();
		
		headObject.put("name", gear.getName());
		headObject.put("monster", gear.getMonster());
		headObject.put("defense", gear.getDefense());
		
		slotObject.put("slotType1", gear.getSlotType1());
		slotObject.put("slotType2", gear.getSlotType2());
		slotObject.put("slotType3", gear.getSlotType3());
		headObject.put("slots", slotObject);
		
		headObject.put("fireDef", gear.getFireDef());
		headObject.put("waterDef", gear.getWaterDef());
		headObject.put("thunderDef", gear.getThunderDef());
		headObject.put("iceDef", gear.getIceDef());
		headObject.put("draongDef", gear.getDragonDef());
		
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
		
		headObject.put("skills", skillsObject);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\\\ATDEV\\\\workspaces\\\\playground\\\\JSONCreatorMHW\\\\src\\\\gauntletgearLow.json", true))) {
			bw.write(headObject.toJSONString() + ",");
		}
		
		
	}
	
	GearBuilder() {
		Gear headGear = new Gear();
		
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

		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Arial", Font.PLAIN, 30));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				headGear.setName(name.getText());
				headGear.setMonster(monster.getText());
				headGear.setDefense(defense.getText());
				headGear.setSlotType1(slotType1.getText());
				headGear.setSlotType2(slotType2.getText());
				headGear.setSlotType3(slotType3.getText());
				headGear.setFireDef(fireDef.getText());
				headGear.setWaterDef(waterDef.getText());
				headGear.setThunderDef(thunderDef.getText());
				headGear.setIceDef(iceDef.getText());
				headGear.setDragonDef(dragonDef.getText());
				headGear.setSkill1Name(skill1Name.getText());
				headGear.setSkill1Quantity(skill1Quantity.getText());
				headGear.setSkill2Name(skill2Name.getText());
				headGear.setSkill2Quantity(skill2Quantity.getText());
				headGear.setBonusName(bonusName.getText());
				headGear.setBonusRequiredPieces(bonusRequiredPieces.getText());
				try {
					new GearBuilder().jsonBuilder(headGear);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				gearFrame.setVisible(false);
			}
		});

		gearPanel.add(submit);
		gearPanel.setLayout(new GridLayout(numPairs + 1 ,2));
		gearFrame.add(gearPanel);
		gearFrame.setTitle("Enter gear properties");
		gearFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gearFrame.setLocationRelativeTo(null);
		gearFrame.setPreferredSize(new Dimension(700, 500));
		
		gearFrame.setVisible(true);
		
	}

}
