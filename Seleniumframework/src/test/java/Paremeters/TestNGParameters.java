package Paremeters;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

 @Test
 @Parameters({"my name"})
public void Test(@Optional("Umar") String name)
{
System.out.println("name is:" + name);	
}
}
