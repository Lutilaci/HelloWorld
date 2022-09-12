import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HelloWorldTest extends HelloWorld{

    @Test
    public void testHelloWorld(){
        Assertions.assertEquals("Hello World", helloWorld());
    }

}
