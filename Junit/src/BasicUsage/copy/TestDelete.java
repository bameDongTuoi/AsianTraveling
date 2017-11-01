package BasicUsage.copy;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestDelete {

	

//	public class TestUnit {


			
//		   String message = "Hello World";	
//		   MessageUtil messageUtil = new MessageUtil(message);

		   @Test
		   public void testPrintMessage() {
			   GetPatientCount cnt = new GetPatientCount();
			int   count=cnt.countPt();
			   DeletePatientID  p = new DeletePatientID();
			  
				p.deletePt();	
				
		    //  message = "New Word";
		      assertEquals(count-1,cnt.countPt());
		      
		      
		   }
		}