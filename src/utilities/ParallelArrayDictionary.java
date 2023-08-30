package utilities;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
* Allows for an dictionary to be created and with manipulated of array sets.
*
*
* @author <Jalen Livingston, Jack Patterson>
* @date <98/30/2023>
*/
public class ParallelArrayDictionary<Key, Value> implements Map<Key, Value>
{
	protected ArraySet<Key> _keys;
	protected ArraySet<Value> _values;
	
	public ParallelArrayDictionary()
	{
		_keys=new ArraySet<Key>();
		_values=new ArraySet<Value>();
	}
	
	@Override
	public int size() {
		return _keys.size();
	}
	@Override
	public boolean isEmpty() {
		return _keys.isEmpty();
	}
	@Override
	public boolean containsKey(Object key) {
		return _keys.contains(key);
	}
	@Override
	public boolean containsValue(Object value) {
		return _values.contains(value);
	}
	/**
	 * gets the value correlated to a key
	 *
	 *
	 * @param a key
	 * @return boolean of value associated with the key
	 * @Override
	 */
	public Value get(Object key) {
		//returns null if key doesn't exist
		if (_keys.contains(key)==false) {
				return null;
			}
		//returns value if key does exist
		else {
			int i=_keys.indexOf(key);
			return _values.get(i);
		}
	}
		
	/**
	 * adds a key and a value.
	 *
	 *
	 * @param a key and value
	 * @return returns value
	 * @Override
	 */
	public Value put(Key key, Value value) {
		//if key exists removes both key and value
		if (_keys.contains(key)==true){
			int i = _keys.indexOf(key);
			_keys.remove(i);
			_values.remove(i);
		}
		//adds key and value, then returns value
		_keys.add(key);
		_values.add(value);
		int i = _keys.indexOf(key);
		return _values.get(i);
		
	}
	/**
	 * removes value and key, returns value
	 *
	 *
	 * @param key
	 * @return value
	 * @Override
	 */
	public Value remove(Object key) {
		int i = _keys.indexOf(key);
		_keys.remove(i);
		return _values.remove(i);
		
	}
	/**
	 * iterates through map and puts keys and values from map
	 *
	 *
	 * @param map
	 * @Override
	 */
	public void putAll(Map<? extends Key, ? extends Value> m) {
		for (Entry<? extends Key, ? extends Value> pair: m.entrySet()) {
			put(pair.getKey(), pair.getValue());
			
		}
		
	}
	@Override
	public void clear() {
		_keys.clear();
		_values.clear();
		
	}
	@Override
	public Set<Key> keySet() {
		return _keys;
	}
		

	@Override
	public Collection<Value> values() {
		return _values;
	}
	@Override
	public Set<Entry<Key, Value>> entrySet() {
		Map<Key, Value> m = new HashMap<Key, Value>();
		return m.entrySet();
	}
}