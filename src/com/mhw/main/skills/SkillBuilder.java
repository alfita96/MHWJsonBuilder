package com.mhw.main.skills;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.mhw.objects.Skill;

public class SkillBuilder {

	public void addValues(Skill skill, String[] values) {
	}

	public static void main(String[] args) {
		Skill skill = new Skill();

		JFrame skillFrame = new JFrame();
		JPanel skillPanel = new JPanel(new SpringLayout());

		String[] labels = { "Skill Name", "Max Level", "Level 1 Desc", "Level 2 Desc", "Level 3 Desc", "Level 4 Desc",
				"Level 5 Desc", "Level 6 Desc", "Level 7 Desc" };

		int i = 0;

		JTextField name = new JTextField();
		name.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel nameLabel = new JLabel(labels[i], JLabel.TRAILING);
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		skillPanel.add(nameLabel);
		nameLabel.setLabelFor(name);
		skillPanel.add(name);

		JTextField maxLevel = new JTextField();
		maxLevel.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel maxLevelLabel = new JLabel(labels[++i], JLabel.TRAILING);
		maxLevelLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		skillPanel.add(maxLevelLabel);
		maxLevelLabel.setLabelFor(maxLevel);
		skillPanel.add(maxLevel);

		JTextField l1Desc = new JTextField();
		l1Desc.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel l1DescLabel = new JLabel(labels[++i], JLabel.TRAILING);
		l1DescLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		skillPanel.add(l1DescLabel);
		l1DescLabel.setLabelFor(l1Desc);
		skillPanel.add(l1Desc);

		JTextField l2Desc = new JTextField();
		l2Desc.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel l2DescLabel = new JLabel(labels[++i], JLabel.TRAILING);
		l2DescLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		skillPanel.add(l2DescLabel);
		l2DescLabel.setLabelFor(l2Desc);
		skillPanel.add(l2Desc);

		JTextField l3Desc = new JTextField();
		l3Desc.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel l3DescLabel = new JLabel(labels[++i], JLabel.TRAILING);
		l3DescLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		skillPanel.add(l3DescLabel);
		l3DescLabel.setLabelFor(l3Desc);
		skillPanel.add(l3Desc);

		JTextField l4Desc = new JTextField();
		l4Desc.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel l4DescLabel = new JLabel(labels[++i], JLabel.TRAILING);
		l4DescLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		skillPanel.add(l4DescLabel);
		l4DescLabel.setLabelFor(l4Desc);
		skillPanel.add(l4Desc);

		JTextField l5Desc = new JTextField();
		l5Desc.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel l5DescLabel = new JLabel(labels[++i], JLabel.TRAILING);
		l5DescLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		skillPanel.add(l5DescLabel);
		l5DescLabel.setLabelFor(l5Desc);
		skillPanel.add(l5Desc);

		JTextField l6Desc = new JTextField();
		l6Desc.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel l6DescLabel = new JLabel(labels[++i], JLabel.TRAILING);
		l6DescLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		skillPanel.add(l6DescLabel);
		l6DescLabel.setLabelFor(l6Desc);
		skillPanel.add(l6Desc);

		JTextField l7Desc = new JTextField();
		l7Desc.setFont(new Font("Arial", Font.PLAIN, 30));
		JLabel l7DescLabel = new JLabel(labels[++i], JLabel.TRAILING);
		l7DescLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		skillPanel.add(l7DescLabel);
		l7DescLabel.setLabelFor(l7Desc);
		skillPanel.add(l7Desc);

		JTextField[] textField = { name, maxLevel, l1Desc, l2Desc, l3Desc, l4Desc, l5Desc, l6Desc, l7Desc };
		
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Arial", Font.PLAIN, 30));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				skill.setName(textField[i].getText());
				skill.setMaxLevel(textField[++i].getText());
				skill.setLevel1Desc(textField[++i].getText());
				skill.setLevel2Desc(textField[++i].getText());
				skill.setLevel3Desc(textField[++i].getText());
				skill.setLevel4Desc(textField[++i].getText());
				skill.setLevel5Desc(textField[++i].getText());
				skill.setLevel6Desc(textField[++i].getText());
				skill.setLevel7Desc(textField[++i].getText());
				new JsonBuilder(skill);
			}
		});

		skillPanel.setLayout(new GridLayout(labels.length + 1, 2));
		skillPanel.add(submit);
		skillFrame.setVisible(true);
		skillFrame.add(skillPanel);
		skillFrame.setTitle("Enter skill properties");
		skillFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		skillFrame.setPreferredSize(new Dimension(960, 1040));
		skillFrame.setLocation(0, 0);
		skillFrame.pack();
	}
}
