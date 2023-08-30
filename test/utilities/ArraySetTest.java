package utilities;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
		ArraySet<Integer> addTest = new ArraySet<Integer>();
		//makes sure the test set is empty
		assertTrue (addTest.isEmpty());
		//test the add functions return value
		assertTrue (addTest.add(2));
		//test that add actually adds
		assertTrue (addTest.contains(2));
		//test if false is returned when trying to enter identical values
		assertFalse (addTest.add(2));
		//verifies that two wasn't added
		assertEquals (1, addTest.size());
		//
		assertTrue (addTest.add(-247));
		
		assertTrue (addTest.contains(-247));
		assertTrue (addTest.remove((Object) 2));
		
		
		
		
	}

	@Test
	void testAddAll()
	{
		ArraySet<Integer> set = new ArraySet<Integer>();
		assertTrue (set.addAll(Arrays.asList(1, 2, 3, 4)));
		assertTrue (set.addAll(Arrays.asList(-1, 2, -3, -5)));
		assertTrue (set.addAll(Arrays.asList(0, 0, 3, 75)));
		set.addAll(Arrays.asList(7, -12, 45, 13));
		

		
	}

	@Test
	void testRetainAll()
	{
		ArraySet<Integer> retainAllTest = new ArraySet<Integer>();
		List<Integer> retainAllCollection = new ArrayList<>();
		retainAllCollection.add(1);
		retainAllCollection.add(3);

		retainAllTest.addAll(Arrays.asList(1, 2, 3, 5));
		assertTrue (retainAllTest.retainAll(retainAllCollection));
		assertEquals (2, retainAllTest.size());
//		ArraySet<Integer> retainAllList = new ArraySet<Integer>();
//		retainAllList.addAll(Arrays.asList(1, 2, 3, 4));
//		Collection collection = new ArrayList();
//		collection.add(1);
//		collection.add(3);
//		assertTrue (retainAllList.retainAll(collection));
//		
	}

	@Test
	void testRemoveAll()	{
		ArraySet<Integer> removeAllTest = new ArraySet<Integer>();
		List<Integer> removeAllCollection = new ArrayList<>();
		removeAllCollection.addAll(Arrays.asList(7, 13));
		removeAllTest.addAll(Arrays.asList(7, 12, 45, 13));
		assertTrue (removeAllTest.removeAll(removeAllCollection));
		assertEquals (2, removeAllTest.size());
		
		
	}

}
