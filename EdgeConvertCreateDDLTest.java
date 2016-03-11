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

	public EdgeConvertCreateDDLTest(EdgeTable[] tables, EdgeField[] fields){
		super(tables,fields);
     	
	}		
	
	public EdgeConvertCreateDDLTest(){
		super();
	}	

	
	

	@Before
	public void setUp() throws Exception{
		EdgeField[] inputFields = new EdgeField[10];
		EdgeTable[] inputTables = new EdgeTable[10];
		testObj = new EdgeConvertCreateDDLTest(inputTables,inputFields);
//		testObj = new EdgeConvertCreateDDLTest();		

	}
	
	@Test
	public void testInitialize(){
		System.out.println("testing init");
		testObj.initialize();
	}
	
}
