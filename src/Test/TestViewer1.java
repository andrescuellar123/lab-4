package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import model.*;



public class TestViewer1 {

	private Viewer view1;
	
	
    private void setupEscenario1(){
        view1 = new Viewer();
    }
	
    private String name1 = "Pepe" ;
    private String id1 = "222" ;
   
    
    public void testAddHuman() {
        setupEscenario1( );

        assertEquals( 1, view1.getSize( ) );

        try
        {
        	view1.addHuman( name1, id1 );
        }
        catch( MyException e )
        {
            fail( "no se agrego el humano" );
        }

    }
    
    public void testSearchId() {
    	setupEscenario1( );
        Human hum = view1.searchId( name1 );
        assertNotNull( hum );
        assertEquals( view1, hum.getId( ) );
    }
    
}
