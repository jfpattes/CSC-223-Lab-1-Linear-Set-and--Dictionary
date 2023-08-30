package utilities;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class ArraySetTest
{
	@Test
	void testArraySetCollectionOfE()
	{
		
	}

	@Test
	void testAddE()
	{
		ArraySet<Integer> testSet = new ArraySet<Integer>();
		//makes sure the test set is empty
		assertTrue (testSet.isEmpty());
		//test the add functions return value
		assertTrue (testSet.add(2));
		//test that add actually adds
		assertTrue (testSet.contains(2));
		//test if false is returned when trying to enter identical values
		assertFalse (testSet.add(2));
		//verifies that two wasn't added
		assertEquals (1, testSet.size());
		//
		assertTrue (testSet.add(-247));
		assertTrue (testSet.contains(-247));
		assertTrue (testSet.remove((Object) 2));
		
		
		
		
	}

	@Test
	void testAddAll()
	{
	}

	@Test
	void testRetainAll()
	{
	}

	@Test
	void testRemoveAll()
	{
	}

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
	}
}
