import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Frame extends JFrame implements ActionListener{
	TextField text;
	JButton button;
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource()==button)
		{
			System.out.println(text.getText());
		}
		
	}
	Frame()
	{
		this.setSize(400,300);
		this.setLayout(new BorderLayout());
		text = new TextField();
		button = new JButton("Click me");
		
		
		this.add(button,BorderLayout.EAST);
		this.add(text,BorderLayout.WEST);
		
		button.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setVisible(true);

	}

	

}
