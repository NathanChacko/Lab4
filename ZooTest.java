0public class ZooTest{
	
	
	//Test these methods
	//getTotalHeight, getCapacity, and toString methods
	
	public void getTotalHeightTest() throws AssertException {
		
		//Create zoo object for testing
		Zoo totalHeightTest = new Zoo(50);
		
		//Expected and actual variables with comparison
		double expectedHeight = 0.0;
		double actualHeight = totalHeightTest.getTotalHeight();
		
		Assert.assertEquals(expectedHeight, actualHeight, 0.01);
			
	}
	
	public void getCapacityTest() throws AssertException {
		
		//Create zoo object for testing
		Zoo capacityTest = new Zoo(100);
		
		int actualCapacity = 100;
		int expectedCapacity = capacityTest.getCapacity();
		
		Assert.assertEquals(expectedCapacity, actualCapacity);
		
	}

	public void toStringTest() throws AssertException{
		
		//Create zoo object for testing
		Zoo toStringTest = new Zoo(5);
		
		//Created actual and expected for testing
		String actualString = "These animals live in the zoo: \n";
		String expectedString = toStringTest.toString();
		
		//Actual test for toString
		Assert.assertEquals(expectedString, actualString);
	
	
	
	}
}