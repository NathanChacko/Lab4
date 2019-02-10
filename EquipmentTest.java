public class EquipmentTest{
	
	//Test a full constructor
	public void fullConstructorTest() throws AssertException
	    {   
    		//Create new object for testing/assertions
	    	Equipment testEquipment = new Equipment("Batmobile/1,2000.1,1000,very fast");
	    	
	    	
	    	//Assertions for testing each element of object
		    Assert.assertTrue(testEquipment.getName().equals("Batmobile"));
		    Assert.assertEquals(1, testEquipment.getCount(), 0.01);
		    Assert.assertEquals(2000.1, testEquipment.getTotalWeight(), 0.01);
		    Assert.assertEquals(1000.0, testEquipment.getTotalPrice(), 0.01);
		    Assert.assertTrue(testEquipment.getDescription().equals("very fast"));
		    
	    }
	
	//Test Getters
	/**public void getterTest() throws AssertException {
		
		
	}*/
	
	//Test toString
	public void toStringTest() throws AssertException {
		
		//Created new object for testing toString
		Equipment toStringTest = new Equipment("Batrang/10, 10.7, 60,hurts alot");
		
		//String for actual and expected for perfecting output
		String expected = "Name: Batrang, Number: 10, Weight: 10.70 lbs, Price: $60.00 - hurts alot";
		String actual = toStringTest.toString();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	

}