package com.oop.lab5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Screen extends JFrame implements ActionListener, MouseListener{
	JPanel topPanel;
	JPanel bottomPanel;
	JPanel panel;
	JButton button1;
	JButton button2;
	JLabel label1;
	JLabel label2;
	JCheckBox checkBox1;
	JTextField textField1;
	
	public Screen(String title) {
		super(title);
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		topPanel = new JPanel();
		bottomPanel = new JPanel();
		panel = new JPanel();
		panel.setBackground(Color.red);
		button1 = new JButton("button 1");
		button2 = new JButton("button 2");
		label1 = new JLabel("Top");
		label2 = new JLabel("panel");
		checkBox1 = new JCheckBox("Box");
		textField1 = new JTextField("Name");
		textField1.setToolTipText("Enter your name here");

		button1.addActionListener(this);
		button2.addActionListener(this);
		textField1.addActionListener(this);
		panel.addMouseListener(this);
		
		topPanel.add(label1);
		topPanel.add(checkBox1);
		topPanel.add(textField1);
		bottomPanel.add(button1);
		bottomPanel.add(button2);
		panel.add(label2);

		add(topPanel, BorderLayout.NORTH);
		add(bottomPanel, BorderLayout.SOUTH);
		add(panel, BorderLayout.CENTER);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(this, "you pressed button 1");
		}
		else if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(this, "you pressed button 2");
		}
		else if (e.getSource() == textField1) {
			JOptionPane.showMessageDialog(this, "you entered " + textField1.getText());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == panel) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				label2.setText("Mouse left clicked");
			}
			if (e.getButton() == MouseEvent.BUTTON3) {
				label2.setText("Mouse right clicked");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == panel) {
			label2.setText("Mouse entered panel");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == panel) {
			label2.setText("Mouse exited panel");
		}
	}
}
