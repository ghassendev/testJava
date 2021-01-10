import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class mathTest {

    @BeforeEach
    void init(){


        System.out.println("hello i came");
    }

    @Test
    void testAdd(){

        math Math = new math();
        int expected=9;
        int actual =  Math.add(5,4);
        assertEquals(expected,actual,"add Problem");
    }
    @Test
    void testMoins(){

        math Math = new math();
        int expected=1;
        int actual =  Math.moins(5,4);
        assertEquals(expected,actual,"substruction problem");
    }
    @Test
    void testProduit(){

        math Math = new math();
        int expected=20;
        int actual =  Math.produit(5,4);
        assertEquals(expected,actual,"produit problem");
    }

}
