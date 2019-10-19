package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import junit.framework.TestCase;
import model.*;


public class TestHuman1 extends TestCase {
	private Human human1;
	
	private String name1;
	private String id1;
	
	private void setupEscenario1() {
	     

        String name1 = "Pepe";
        String id1 = "111";

        human1 = new Human( name1, id1);
         
         
	}
    private void setupEscenario2( ) {
        setupEscenario1( );
        
        String name = "Paco";
        String id = "222";

        Human human2 = new Human( name, id );

        try {
        	human1.insertHuman( human2 );
        }
        
        catch( MyException my ){
            fail( "no se agrego el viewer" );
        }
    }
    private void setupEscenario3( ) {
        setupEscenario2( );
        
        String name = "Pablo";
        String id = "555";

        Human human3 = new Human( name, id );

        try {
        	human1.insertHuman( human3 );
        }
        
        catch( MyException my ){
            fail( "no se agrego el viewer" );
        }
    }

	
    public void testInsertIfIsLeft(){
    	
        setupEscenario2( );
        
       
        assertEquals( human1.weight(),2 );
      
        assertEquals( human1.Height(),2);
  
    }
    public void testInsertIfIsRight(){
        setupEscenario3( );
        
        
        assertEquals( human1.weight(),3);
        
        assertEquals( human1.Height(),3);
  
    }
    
    public void testWeight(){
        setupEscenario3( );
        
        
      
        assertEquals( human1.weight(),3);
  
    }
    
    
    public void testHeight(){
        setupEscenario3( );
        
        
      
        assertEquals( human1.Height(),3);
  
    }
    
    public void testSearchId( ){
        setupEscenario3( );

        Human c;
        
        
        c = human1.searchId( "111" );
        assertNotNull( c );
        assertEquals( "111", c.getId( ) );
        
        

    }
    
    public void testTheTreeWorks() {
    	setupEscenario1( );
    	
        assertEquals( name1, id1 );
        
        assertEquals( 1, human1.Height( ) );
        
        assertEquals( 1, human1.weight( ) );
    }
}
