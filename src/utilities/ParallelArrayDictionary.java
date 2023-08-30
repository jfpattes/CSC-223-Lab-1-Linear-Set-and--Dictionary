package utilities;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
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
	@Override
	public Value get(Object key) {
		int i=_keys.indexOf(key);
		return _values.get(i);
	}
	@Override
	public Value put(Key key, Value value) {
		_keys.add(key);
		_values.add(value);
		return null;
	}
	@Override
	public Value remove(Object key) {
		int i = _keys.indexOf(0);
		Value holder = _values.get(i);
		_keys.remove(key);
		_values.remove(i);
		return holder;
		
	}
	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clear() {
		_keys.clear();
		_values.clear();
		
	}
	@Override
	public Set<Key> keySet() {
		Set<Key> key_values = new ArraySet<Key>();
		for (Key value:_keys) {
			key_values.add(value);		
			}
		return key_values;
	}
		

	}
	@Override
	public Collection<Value> values() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<Entry<Key, Value>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
}