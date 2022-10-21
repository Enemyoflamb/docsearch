import org.junit.*;
import org.junit.Assert.*;
public class DocSearchTest{
    @Test 
    public void aTest(){
        try{
            new DocSearchServer.Handler("./technical");
        }
        catch(Exception e){
            fail();
        }

    }
}