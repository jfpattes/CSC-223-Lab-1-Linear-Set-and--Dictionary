	package utilities;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
* Tests some of the methods for the parrallel array Dictionary class.
*
*
* @author <Jalen Livingston, Jack Patterson>
* @date <98/30/2023>
*/
class ParallelArrayDictionaryTest
{
	/**
	 * Tests the constructor method from public array dictionary.
	 */
	@Test
	void testParallelArrayDictionary()
	{
		ParallelArrayDictionary<Integer, Integer> dictionary=new ParallelArrayDictionary<Integer, Integer>();
		assertEquals (0, dictionary.size());
	}

	/**
	 * Tests the get method from public array dictionary.
	 */
	@Test
	void testGet()
	{
		//creates sets for the keys and values
		ArraySet<Integer> _keys=new ArraySet<Integer>();
		ArraySet<Integer> _values=new ArraySet<Integer>();
		//creates collection of keys
		List<Integer> keyCollection = new ArrayList<>();
		keyCollection.add(1);
		keyCollection.add(3);
		_keys.addAll(keyCollection);
		//creates collection of values
		List<Integer> valueCollection = new ArrayList<>();
		valueCollection.add(4);
		valueCollection.add(5);
		_values.addAll(valueCollection);
		//tests if get works for a valid key and value
		assertEquals (keyCollection.get(1), (Object) 3);
//		assertEquals ((Object) 4, keyCollection.get(1));
//		assertEquals (keyCollection.get(5), null);
	}

	/**
	 * Tests the put method from public array dictionary.
	 *
	 *
	 */
	@Test
	void testPut()
	{
		
		ParallelArrayDictionary<Integer, Integer> dict=new ParallelArrayDictionary<Integer, Integer>();
		//tests that put works and that it updates
		assertEquals (new Integer (4), dict.put(2, 4));
		assertEquals (1, dict.size());
		assertEquals (new Integer (5), dict.put(2, 5));
		assertEquals (1, dict.size());
		//tests that we can add multiple sets of keys and values using put
		assertEquals (new Integer (6), dict.put(3, 6));
		assertEquals (2, dict.size());
		
	}

	/**
	 * Tests the remove method from public array dictionary.
	 *
	 */
	@Test
	void testRemove()
	{
		//creates dictionary and map to use and adds the keys and values
		ParallelArrayDictionary<Integer, Integer> dict=new ParallelArrayDictionary<Integer, Integer>();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 101);
		m.put(2, 102);
		dict.putAll(m);
		assertEquals (2, dict.size());
//		ensures removes is working
		dict.remove(1);
		assertEquals (1, dict.size());
		
	}

	/**
	 * Tests the putAll method from public array dictionary.
	 *
	 *
	 */
	@Test
	void testPutAll()
	{
		//creates dictionary and map to use and adds the keys and values
		ParallelArrayDictionary<Integer, Integer> dict=new ParallelArrayDictionary<Integer, Integer>();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 101);
		m.put(2, 102);
		dict.putAll(m);
		//ensures that putAll works
		assertEquals(2, dict.size());
		m.put(1, 103);
		m.put(3, 104);
		dict.putAll(m);
		//ensures that it doesn't add multiple sets of keys
		assertEquals(3, dict.size());
		m.put(4, 101);
		m.put(5, 105);
		dict.putAll(m);
		//ensures that multiple values can be added
		assertEquals(5, dict.size());
		assertEquals(new Integer (101), dict.get(4));
	};

	/**
	 * Tests the clear method from public array dictionary.
	 *
	 *
	 */
	@Test
	void testClear()
	{
		//creates dictionary and map to use and adds the keys and values
		ParallelArrayDictionary<Integer, Integer> dict=new ParallelArrayDictionary<Integer, Integer>();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 101);
		m.put(2, 102);
		dict.putAll(m);
		//tests clears method
		assertEquals (2, dict.size());
		dict.clear();
		assertEquals (0, dict.size());
	}
}
