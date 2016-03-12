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

	@Before
	public void setUp() throws Exception{ 
		EdgeField[] inputFields = new EdgeField[10];
		EdgeTable[] inputTables = new EdgeTable[10];
		testObj = new CreateDDLMySQL(inputTables,inputFields);
	}

	@Test
	public void testCreateDDL(){
		System.out.println("Hello. In Test");

		testObj.createDDL();
		System.out.println("Out createDDL");

		//assertEquals("input = 1, should recieve a 1 back",1,testObj.convertStrBooleanToInt("1"));
	//	assertEquals("input = 'Bob', should recieve a 0 back",0,testObj.convertStrBooleanToInt("Bob"));
		JOptionPane.showMessageDialog(null,"Set Database name to Bob");
		assertEquals("User inputed database name to Bob","Bob",testObj.generateDatabaseName());
		assertEquals("User set databaseName to Bob","Bob",testObj.getDatabaseName());
		assertEquals("Product is MySQL","MySQL",testObj.getProductName());
		String sqlString = testObj.getSQLString();
		JOptionPane.showMessageDialog(null, "SQL String:  "+sqlString);
		assertEquals("SQLString =sqlString",sqlString,testObj.getSQLString());
	}
}	
