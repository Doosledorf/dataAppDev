import static  org.junit.Assert.*;
import main.EdgeConvertCreateDDL;
import main.EdgeField;
import main.EdgeTable;

import org.junit.Before;
import  org.junit.Test;

public class EdgeConvertCreateDDLTest extends EdgeConvertCreateDDL{
	
	EdgeConvertCreateDDLTest testObj;
		
	
	public void createDDL(){
		System.out.println("CreateDDL");
	}
	public String getSQLString(){
		System.out.println("GetSQLString");
		return "GetSQLString";	
	}
	public String getProductName(){
		System.out.println("GetProductName");
		return "GetProductName";
	}
	public String getDatabaseName(){
		System.out.println("GetDatabaseName");
		return "GetDatabaseName";
	}	

//	public EdgeConvertCreateDDLTest(EdgeTable[] tables, EdgeField[] fields){
//		super(tables,fields);
     	
		
	
	public EdgeConvertCreateDDLTest(){
		super();
	}	

	
	

	@Before
	public void setUp() throws Exception{
		EdgeField[] inputFields = new EdgeField[1];
		EdgeTable[] inputTables = new EdgeTable[1];
		
		testObj = new EdgeConvertCreateDDLTest();
	}
	
	@Test	
	public void testInitialize(){
		System.out.println("testing init");
		testObj.initialize();
	}
	@Test
	public void testTable(){
		System.out.println("Checking if tables are null...");
		assertNotNull("Tables are null",testObj.tables);
	}
	@Test
	public void testField(){
		System.out.println("Checking if fields are null...");
		assertNotNull("Fields is null",testObj.fields);
	}	
	@Test
	public void testNumBoundTables(){
		System.out.println("Checking if numBoundTables is null...");
		assertNotNull("numBoundTables is null",testObj.numBoundTables);
	}
	@Test 
	public void testMaxBound(){
		System.out.println("Checking if maxBound is null...");
		assertNotNull("maxBound is null",testObj.maxBound);
	}
	@Test 
	public void testStringBuffer(){
		System.out.println("Checking if StringBuffer is null...");
		assertNotNull("StringBuffer is null",testObj.sb);
	}

	@Test 
	public void testSeleceted(){
		System.out.println("Checking if selected is null");
		assertNotNull("Selected is null",testObj.selected);
	}
}
