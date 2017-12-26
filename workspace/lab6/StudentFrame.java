package swingmvclab;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * The main window.
 */
public class StudentFrame extends JFrame {
    private JTable table;
    private JScrollPane scrollpane;
    private JTextField nameField;
    private JTextField neptunField;
    private JButton button;
    /*
     * This object stores the student data.
     * When the program is started it loads the data from the file,
     * when it is closed, it saves the data.
     * 
     * DO NOT MODIFY THIS ATTRIBUTE!
     */
    private StudentData data;

    /*
     * This function should create the components of the window.
     * E.g. table, labels, text fields, etc.
     */
	public class OkButtonActionListener implements ActionListener{
		JTextField t;
		JTextField c;
		public OkButtonActionListener(JTextField t, JTextField c)
		{
			this.t=t;
			this.c=c;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button)
			{
					data.addStudent(t.getText(), c.getText());	
			}
		}
		
	}
    private void initComponents() {
        this.setLayout(new BorderLayout());
        table = new JTable(data);
        scrollpane = new JScrollPane(table);
        this.add(scrollpane, BorderLayout.CENTER);
        JPanel south = new JPanel();
        south.setLayout(new FlowLayout());
        button = new JButton("New Student");
        JLabel Name = new JLabel("Name:");
        JLabel Neptun = new JLabel("Neptun:");
        nameField = new  JTextField(20);
        neptunField = new JTextField(6);
        table.setFillsViewportHeight(true);	//table occupies the entire window
        
     
        
        
        south.add(Name);
        south.add(nameField);
        south.add(Neptun);
        south.add(neptunField);
        south.add(button);
        
        this.add(south, BorderLayout.SOUTH);
       
		ActionListener listener = new OkButtonActionListener(nameField,neptunField);
		button.addActionListener(listener);
        
    }
    
    
    /*
     * Constructor of the window.
     * 
     * DO NOT MODIFY THIS CONSTRUCTOR!
     */
    @SuppressWarnings("unchecked")
    public StudentFrame() {
        super("Student administration");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Load data at startup:
        try {
            data = new StudentData();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"));
            data.students = (List<Object[]>)ois.readObject();
            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        // Save data at shutdown:
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"));
                    oos.writeObject(data.students);
                    oos.close();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Build the window:
        setMinimumSize(new Dimension(400, 300));
        initComponents();
        pack();
    }

    /*
     * Entry point of the program.
     * 
     * DO NOT MODIFY THIS FUNCTION!
     */
    public static void main(String[] args) {
        // Show the window:
        StudentFrame sf = new StudentFrame();
        sf.setVisible(true);
    }
    
}
