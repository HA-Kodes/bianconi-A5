package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];  // Thank you Kevin - was toying with the Test Run and forgot to revert it :)
	int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = doubleSizeOfBackingArray();
		}
		items[size] = item;
		size++;
		return true;
	}

	public Object[] doubleSizeOfBackingArray() {
		Object[] newArray = new Object[size * 2];
        if (size >= 0) System.arraycopy(items, 0, newArray, 0, size);
		return newArray;  // my line is this: for (int i = 0; i < size; i++) {
	}			  // versus what IntelliJ suggested (line20), as far as 'clean up code'

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= size)
			throw new IndexOutOfBoundsException("The index, " + index + ", is out of the bounds of the array with size " + size);

		return (T) items[index];
	}

}
