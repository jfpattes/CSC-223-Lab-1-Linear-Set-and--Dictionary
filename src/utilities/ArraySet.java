 package utilities;
 
 /**
 * Allows for an array set to be created and manipulated similarly to a list.
 *
 *
 * @author <Jalen Livingston, Jack Patterson>
 * @date <98/30/2023>
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;
public class ArraySet<E> implements List<E>, Set<E>
{
	protected ArrayList<E> _list;
	
	public ArraySet() {
		_list=new ArrayList<E>();
	}

	 /**
	 * adds parameter to a set, ensuring no repetition.
	 *
	 *
	 * @param a generic type
	 * @return boolean of whether it added or not
	 * @Override
	 */
	public boolean add(E e) {
		//ensures no repetition
		if (_list.contains(e)==true) {
			return false;
		}
		else {
			return _list.add(e);
		}
	}

	/**
	 * adds multiple parameters to a set, ensuring no repetition.
	 *
	 *
	 * @param a collection of a generic type
	 * @return boolean of whether it added any of the generics
	 * @Override
	 */
	public boolean addAll(Collection<? extends E> c) {
		//initializes return value as false
		boolean holder=false;
		//iterates through collection and makes sure values aren't repeated
		for (E item: c) {
			if (_list.contains(item)==false) {
				_list.add(item);
				//changes value to be returned
				holder=true;
			}
		}
		return holder;
	}

	@Override
	public int size() {
		return _list.size();
	}

	@Override
	public boolean isEmpty() {
		return _list.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		
		return _list.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		
		return _list.iterator();	
	}

	@Override
	public Object[] toArray() {
		return _list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return _list.toArray(a);
	}

	@Override
	public boolean remove(Object o) {
		return _list.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return _list.containsAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		
		return _list.addAll(index, c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return _list.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		
		return _list.retainAll(c);
	}

	@Override
	public void clear() {
		_list.clear();
	}

	@Override
	public E get(int index) {
		return _list.get(index);
	}

	@Override
	public E set(int index, E element) {
		return _list.set(index, element);
	}

	@Override
	public void add(int index, E element) {
		_list.add(index, element);
	}

	public E remove(int index) {
		return _list.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return _list.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return _list.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return _list.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return _list.listIterator(index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return _list.subList(fromIndex, toIndex);
	}

	@Override
	public Spliterator<E> spliterator() {
		// TODO Auto-generated method stub
		return List.super.spliterator();
	}
	
}