/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString

    public void fullConstructorTest() throws AssertException
    {   
    	
    	//Create new object for testing/assertions
    	Animal newAnimal = new Animal("Orange", "Tony", 200.1, 20);
    	
    	//Using assertions to test each element of object
	    Assert.assertEquals(200.1, newAnimal.getWeight(), 0.01);
	    Assert.assertEquals(20, newAnimal.getHeight(), 0.01);
	    Assert.assertTrue(newAnimal.getName().equals("Tony"));
	    Assert.assertTrue(newAnimal.getColor().equals("Orange"));
    }
    
    /**public void getterTest() throws AssertException{
    	
    	
    }*/
    
    public void toStringTest() throws AssertException{
    	//New animal object for toString testing
    	Animal toStringAnimal = new Animal("black", "Chester", 50.5, 10.0);
    	
    	//String variables for expected an actual outputs
    	String expected = "Chester, a black-colored animal. 50.5 pounds, 10.0 inches\n";
    	String actual = toStringAnimal.toString();
    	
    	//Assert test
    	Assert.assertEquals(expected, actual);
    	
    	
    }
}

