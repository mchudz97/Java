import org.junit.Test;
import pl.ug.jdbc.DBconn;
import pl.ug.jdbc.User;

import static junit.framework.TestCase.assertEquals;

public class MyTest {
    @Test
    public void  testUno(){
        User u= new User("b", "s", "s");
        assertEquals("s",u.getPassword());

    }
    public void testDuo(){

    }
}
