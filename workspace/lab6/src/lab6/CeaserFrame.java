package lab6;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class CeaserFrame extends JFrame{
	private JComboBox<Character> combo;
	private JTextField answer;
	private JButton button;
	
	public class OkButtonActionListener implements ActionListener{
		JTextField t;
		JComboBox c;
		public OkButtonActionListener(JTextField t, JComboBox<Character> c)
		{
			this.t=t;
			this.c=c;
		}
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource()==button)
			{
				answer.setText(ceaserCode(t.getText(), (char) c.getSelectedItem()));
				
			}
		}
		
	}
	
	CeaserFrame()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		setTitle("SwingLab");
		setSize(400,110);
		setResizable(false);
		
		JPanel North = new JPanel();
		North.setLayout(new FlowLayout());
		JPanel South = new JPanel();
		South.setLayout(new BorderLayout());
		
		Character[] alphabet = {'A','B','C','D','E','F','G','H',
				'I','J','K','L','M','N','O','P','Q','R','S','T',
				'U','V','W','X','W','Z'};
		
		combo = new JComboBox<Character>(alphabet);
		button = new JButton("Code");
		JTextField text = new JTextField(20);//size 20
		JLabel label = new JLabel("Output:");
		answer = new JTextField(20);
		
		answer.setEditable(false);//the answer text field is not editable
		
		North.add(combo,FlowLayout.LEFT);
		North.add(text,FlowLayout.CENTER);
		
		North.add(button,FlowLayout.RIGHT);
		
		South.add(label,BorderLayout.WEST);
		South.add(answer,BorderLayout.CENTER);
		
		add(North);//sets the panel up north
		add(South);//sets the panel north
		
		
		OkButtonActionListener listener = new OkButtonActionListener(text,combo);
		button.addActionListener(listener);
		
		
	}
		private static String ceaserCode(String input, char offset)
		{
			String output = null;
			char[] t = null;
			input = input.toUpperCase();
			t = input.toCharArray();
			for(int i=0;i<t.length;i++)
			{
				if(t[i]+(offset-65)>90)
				{
					t[i] = (char) ((t[i]+offset)%91);
				}
				else
				{
					t[i] = (char) (t[i]+(offset-65));
				}
			}
			output = String.valueOf(t);
			return output;
		}
	}

