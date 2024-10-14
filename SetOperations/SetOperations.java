
public class SetOperations {
	
	import java.util.ArrayList;
	
	public static ArrayList<E> union(ArrayList<E> setOne, ArrayList<E> setTwo) {
		ArrayList<E> resultSet = new ArrayList<E>();
		for (E element : setOne) {
			if (!setTwo.contains(element)) resultSet.addelement();
		}
		resultSet.add(setTwo);
		return resultSet;
	}
	
	public static ArrayList<E> intersect(ArrayList<E> setOne, ArrayList<E> setTwo) {
		ArrayList<E> resultSet = new ArrayList<E>();
		for (E element : setOne) {
			if (setTwo.contains(element)) resultSet.add(element);
		}
		return resultSet;
	}
	
	public static ArrayList<E> complement(ArrayList<E> inputSet, ArrayList<E> globalSet) {
		ArrayList<E> resultSet = new ArrayList<E>();
		for (E element : globalSet) {
			if (!globalSet.contains(element)) resultSet.add(element);
		}
		return resultSet;
	}
}
