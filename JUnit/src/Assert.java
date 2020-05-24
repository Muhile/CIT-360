import org.junit.Test;
import static org.junit.Assert.*;

public class Assert {

	@Test
	   public void testRelationShipStatus() {
		  String relationshipStatusA = new String ("Single");
	      String relationshipStatusB = new String ("Single");
	      //Check that the two are both Single
	      assertEquals(relationshipStatusA, relationshipStatusB);
	   }
	   @Test
	   public void city() {
		   String cityA = "Salt Lake City";
		   String cityB ="Salt Lake City";
	      //Check that the two are both in the same city
	      assertSame(cityA, cityB);
	   }
	   @Test
	   public void testAge() {
	      int ageA = 25;
	      int ageB = 28;
	      //Check if the two are not the same age.
	      assertNotSame(ageA, ageB);
	   }
	   @Test
	   public void testCoSocialMedia() {
		  String socialMediaA = null;
		  String socialMediaB = "Facebook";	
	      //Check if profileB has a social media account
	      assertNotNull(socialMediaB);
	      //Check if profileA doesn't have a social media account.
	      assertNull(socialMediaA);
	   }
	   @Test
	   public void testPriorities() {
	      String[] priorityA = {"fun", "travel", "foodie"};
	      String[] priorityB =  {"fun", "travel", "foodie"};
	      //Check whether the two has the same list and order of priorities.
	      assertArrayEquals(priorityA, priorityB);
	   }
	   @Test
	   public void checkHeight() {
	      int heightA = 5;
	      int heightB = 6;
	      //Check if profileA is taller than profileB
	      assertFalse(heightA > heightB);
	      //Check if profileB is taller than profileA
	      assertTrue (heightB > heightA);
	   }
	   
}
