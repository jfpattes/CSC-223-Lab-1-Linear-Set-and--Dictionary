package utilities;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
* Tests some of the methods for the array set class.
*
*
* @author <Jalen Livingston, Jack Patterson>
* @date <98/30/2023>
*/
class ArraySetTest
{
	/**
	 * Tests the constructor method from public array dictionary.
	 */
	@Test
	void testArraySetCollectionOfE()
	{
		ArraySet<Integer> set = new ArraySet<Integer>();
		assertEquals (0, set.size());
	}

	/**
	 * Tests the add method from array set class.
	 *
	 *
	 */
	@Test
	void testAddE()
	{
		ArraySet<Integer> set = new ArraySet<Integer>();
		//makes sure the test set is empty
		assertTrue (set.isEmpty());
		//test the add functions return value
		assertTrue (set.add(2));
		//test that add actually adds
		assertTrue (set.contains(2));
		//test if false is returned when trying to enter identical values
		assertFalse (set.add(2));
		//verifies that two wasn't added
		assertEquals (1, set.size());
		//tests adding negative numbers
		assertTrue (set.add(-247));
		assertTrue (set.contains(-247));
		
		
		
		
	}

	/**
	 * Tests the addAll method from array set class.
	 *
	 *
	 */
	@Test
	void testAddAll()
	{
		//creates a set and collection
		ArraySet<Integer> set = new ArraySet<Integer>();
		List<Integer> collection = new ArrayList<>();
		collection.add(45);
		collection.add(37);
		//ensures add all is working
		assertTrue (set.addAll(Arrays.asList(1, 2, 3, 4)));
		assertEquals (4, set.size());
		//ensures you can add all to an all ready exisiting list and negative values are distinct from positive
		assertTrue (set.addAll(Arrays.asList(-1, 2, -3, -4)));
		assertEquals (7, set.size());
		//ensures that even when adding a list that the same values won't be added
		assertTrue (set.addAll(Arrays.asList(0, 0, 3, 75)));
		assertEquals (9, set.size());
		//tests that we use addAll to add collection
		assertTrue (set.addAll(7, collection));
		

		
	}

	/**
	 * Tests the retainAll method from array set class.
	 *
	 *
	 */
	@Test
	void testRetainAll()
	{
		//creates a set and collection
		ArraySet<Integer> set = new ArraySet<Integer>();
		List<Integer> collection = new ArrayList<>();
		collection.add(1);
		collection.add(3);
		//makes sure that retain all is removing the correct ones
		set.addAll(Arrays.asList(1, 2, 3, 5, 7));
		assertTrue (set.retainAll(collection));
		assertEquals (2, set.size());

	}

	/**
	 * Tests the testRemoveAll method from array set class.
	 *
	 *
	 */
	@Test
	void testRemoveAll()	{
		//creates a set and collection
		ArraySet<Integer> set = new ArraySet<Integer>();
		List<Integer> collection = new ArrayList<>();
		collection.addAll(Arrays.asList(7, 13));
		set.addAll(Arrays.asList(7, 12, 45, 13, -76));
		//test that the correct numbers are getting removed
		assertTrue (set.removeAll(collection));
		assertEquals (3, set.size());
		
		
	}

}
