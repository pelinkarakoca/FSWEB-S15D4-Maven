package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WorkintechList extends ArrayList {

	public WorkintechList(int initialCapacity) {
		super(initialCapacity);
	}

	public WorkintechList() {
	}

	public WorkintechList(Collection c) {
		super(c);
	}

	@Override
	public boolean add(Object o) {
		if (!contains(o)) {
			return super.add(o);
		}
		return false;
	}

	public void sort() {
		Collections.sort(this);
	}

	@Override
	public boolean remove(Object o) {
		boolean result = super.remove(o);
		sort();
		return result;
	}
}
