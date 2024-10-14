package set;

public class Set {
	private String[] arr = new String[10];
	private int size = 0;
	private int currentIndex = 0;
	private String next, previous;
	public boolean hasNext, hasPrevious;
	
	public Set() {
		
	}
	
	public Set(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			add(arr[i]);
		}
	}
	
	public boolean add(String element) {
		if (contains(element)) {
			return false;
		}
		if (size >= arr.length) {
			increaseArraySize();
		}
		if (next == null) {
			next = element;
		}
		arr[size++] = element;
		return true;
	}
	
	private void increaseArraySize() {
		String[] newArr = new String[arr.length*2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	
	public String next() {
		if (hasNext()) {
			currentIndex++;
			return next;
		} else {
			return null;
		}
	}
	
	public String previous() {
		if (hasPrevious()) {
			currentIndex--;
			if (currentIndex <= -1) {
				hasPrevious = false;
			}
			previous = arr[currentIndex];
			return previous;
		} else {
			return null;
		}
	}
	
	public boolean hasPrevious() {
		return hasPrevious();
	}
	
	public boolean hasNext() {
		if (currentIndex < size) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public Set union(Set set) {
		Set newSet = new Set();
		set.setToStart();
		while (set.hasNext()) {
			String next = set.next();
			if (!newSet.contains(next)) {
				newSet.add(next);
			}
		}
		return newSet;
	}
	
	public Set intersect(Set set) {
		Set newSet = new Set();
		set.setToStart();
		while (set.hasNext()) {
			String next = set.next();
			if (newSet.contains(next)) {
				newSet.add(next);
			}
		}
		return newSet;
	}
	
	public Set complement(Set wholeSet) {
		Set newSet = new Set();
		wholeSet.setToStart();
		while (wholeSet.hasNext()) {
			String next = wholeSet.next();
			if (!contains(next)) {
				newSet.add(next);
			}
		}
		return newSet;
	}
	
	private void setToStart() {
		while (hasPrevious()) {
			previous();
		}
	}
	
	public boolean contains(String element) {
		for (int i = 0; i < size; i++) {
			if (arr[i].equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	public int getSize() {
		return size;
	}
	
	public void clear() {
		size = 0;
	}
	
	public String toString() {
		if (size <= 0) {
			return "";
		}
		String toReturn = "[";
		for (int i = 0; i < size; i++) {
			toReturn += ("\"" + arr[i] + "\", ");
		}
		return (toReturn + "]");
	}
	
	public boolean remove(String element) {
		boolean foundElement = false;
		for (int i = 0; i < size; i++) {
			if (foundElement) {
				arr[i-1] = arr[i];
			}
			if (arr[i].equals(element)) {
				foundElement = true;
				size--;
			}
		}
		return foundElement;
	}
}
