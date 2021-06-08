package Test;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.platform.*;
import org.junit.runner.*;

@RunWith(Suite.class)
@SuiteClasses({CalculadoraTest.class,RelojTest.class})
public class AllTests {

}
