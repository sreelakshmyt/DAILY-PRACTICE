package com.example;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Dialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name=JOptionPane.showInputDialog("ENTER NAME");
//		JOptionPane.showMessageDialog(jb,"HI "+name+" welcome");
		int s1 =Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		int s2 =Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		JOptionPane.showMessageDialog(null,"THE ADDITION IS"+(s1+s2));
		
	}

}
