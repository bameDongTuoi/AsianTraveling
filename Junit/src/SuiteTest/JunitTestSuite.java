package SuiteTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//public class JunitTestSuite {

	

	@RunWith(Suite.class)

	@Suite.SuiteClasses({
	   TestJunit1.class,
	   TestJunit2.class
	})

	public class JunitTestSuite {   
	}  	

