import org.junit.Test;
import org.junit.Assert;

public class GreeterTest {
  @Test
  public void testFred() {
    String result = Greeter.greeting("Fred");
    Assert.assertEquals("Hello Fred", result);
  }
}
