package com.sirma.itt.javacourse.designpattern.iterator;

/**
 * Container which holds integers.
 * 
 * @author radoslav
 */
public class NumContainer implements Container {

	private int[] container;

	/**
	 * 
	 * @param container
	 */
	public NumContainer(int... container) {
		this.container = container;
	}

	@Override
	public Iterator getIterator() {
		return new NumIterator();
	}

	/**
	 * Keeps track of the current position in the traversal of the container.
	 * 
	 * @author radoslav
	 */
	private class NumIterator implements Iterator {

		private int index;

		@Override
		public boolean hasNext() {
			return index < container.length;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return container[index++];
			}
			return null;
		}

	}

}
