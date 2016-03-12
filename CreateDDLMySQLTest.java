import static org.junit.Assert.*;
import main.CreateDDLMySQL;
import main.EdgeField;
import main.EdgeTable;

import org.junit.Before;
import org.junit.Test;
import java.awt.*;
import javax.swing.*;

public class CreateDDLMySQLTest{
	CreateDDLMySQL testObj;
	EdgeField field;
	EdgeTable table;
	
	@Before
	public void setUp() throws Exception{ 
		field  =  new  EdgeField("1|Bob");
		table = new  EdgeTable("1|Bob");
		table.addNativeField(1);
		table.addRelatedTable(1);
		table.makeArrays();
		table.setRelatedField(0,1);
		System.out.println(table.toString());
		field.setTableID(1);
		field.setTableBound(1);
		field.setFieldBound(1);
		field.setDataType(1);	
		EdgeField[] inputFields = {field};
		EdgeTable[] inputTables = {table};
		testObj = new CreateDDLMySQL(inputTables,inputFields);
	}

	@Test
	public void testCreateDDL(){
		testObj.createDDL();
		//assertEquals("input = 1, should recieve a 1 back",1,testObj.convertStrBooleanToInt("1"));
	//	assertEquals("input = 'Bob', should recieve a 0 back",0,testObj.convertStrBooleanToInt("Bob"));
		JOptionPane.showMessageDialog(null,"Set Database name to Bob");
		assertEquals("User inputed database name to Bob","Bob",testObj.generateDatabaseName());
		assertEquals("User set databaseName to Bob","Bob",testObj.getDatabaseName());
		assertEquals("Product is MySQL","MySQL",testObj.getProductName());
	}
}	
