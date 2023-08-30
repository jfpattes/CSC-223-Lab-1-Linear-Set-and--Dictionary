	package utilities;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class ParallelArrayDictionaryTest
{
	@Test
	void testParallelArrayDictionary()
	{
		
	}

	@Test
	void testGet()
	{
		ArraySet<Integer> _keys=new ArraySet<Integer>();
		ArraySet<Integer> _values=new ArraySet<Integer>();
		List<Integer> keyCollection = new ArrayList<>();
		keyCollection.add(1);
		keyCollection.add(3);
		_keys.addAll(keyCollection);
		List<Integer> valueCollection = new ArrayList<>();
		valueCollection.add(4);
		valueCollection.add(5);
		_values.addAll(valueCollection);
		assertEquals (keyCollection.get(1), (Object) 3);     
	}

	@Test
	void testPut()
	{
		ParallelArrayDictionary<Integer, Integer> dict=new ParallelArrayDictionary<Integer, Integer>();
		assertEquals (new Integer (4), dict.put(2, 4));
		
		
//		ArraySet<Integer> _keys=new ArraySet<Integer>();
//		_keys.addAll(Arrays.asList(10, 28, 9));
//		assertEquals (3, _keys.size());
//		assertEquals (_keys, _keys.keySet());
	}

	@Test
	void testRemove()
	{
	}

	@Test
	void testPutAll()
	{
		ParallelArrayDictionary<Integer, Integer> dict=new ParallelArrayDictionary<Integer, Integer>();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 101);
		m.put(2, 102);
		dict.putAll(m);
		assertEquals(2, dict.size());
	}

	@Test
	void testClear()
	{
	}
}
