package swingmvclab;

import java.util.List;

import javax.swing.table.AbstractTableModel;

/*
 * Stores student data
 */
public class StudentData extends AbstractTableModel{

    /*
     * This attribute stores the student data.
     * Each item of List<> is an Object array of length 4. 
     * Each of these Object arrays stores the data corresponding
     * to a student in the following order:
     *   Name       (String)
     *   Neptun     (String)
     *   Signature  (Boolean)
     *   Mark       (Integer)
     * 
     * E.g. if the neptun code of the third student is required,
     * it can be accessed as follows:
     *   (String)students.get(2)[1]
     * 
     * DO NOT MODIFY THIS ATTRIBUTE!
     */
    public List<Object[]> students;
    public String[] columns = {"Name", "Neptun", "Signature", "Mark"};
 

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return students.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return students.get(rowIndex)[columnIndex];
	}
	
	public String getColumnName(int index)
	{
		return columns[index];
	}
	
	public boolean isCellEditable(int rowIndex, int columnIndex)
	{
		boolean t=false;
		if(columnIndex==3) {
			t = true;
		}
		else if(columnIndex!=3)
		{
			 t = false;
		}
		return t;
	}
	
	public void setValueAt(Object aValue, int rowIndex, int columnIndex)
	{
		students.get(rowIndex)[columnIndex]=aValue;
	}
	
	public void addStudent(String name, String neptun)
	{
		Object[] temp = {name, neptun, "false", 0};
		students.add(temp);
		fireTableDataChanged();
	}
	
}
