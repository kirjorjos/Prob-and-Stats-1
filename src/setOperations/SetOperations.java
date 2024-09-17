package setOperations;
import java.util.ArrayList;

public class SetOperations {
	/**
	 * Union 2 array lists
	 * @param list1 The first list
	 * @param list2 The second list
	 * @return unionList The union of the 2 lists
	 */
	public static ArrayList<String> union(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> union = new ArrayList<String>();
		union.addAll(list1);
		
		for (String str : list2) {
			if (!union.contains(str)) {
				union.add(str);
			}
		}
		return union;
	}
	
	/**
	 * Union 2 array lists
	 * @param list1 The first list
	 * @param list2 The second list
	 * @return intersect The intersection of the 2 lists
	 */
	public static ArrayList<String> intersect(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> intersect = new ArrayList<String>();
		for (String str : list1) {
			if (list2.contains(str)) {
				intersect.add(str);
			}
		}
		return intersect;
	}
	
	/**
	 * Complement an array lists
	 * @param list1 The first list
	 * @param list2 The second list
	 * @return complement The complement array list
	 */
	public static ArrayList<String> complement(ArrayList<String> list) {
		ArrayList<String> complement = new ArrayList<String>();
		ArrayList<String> globalList = new ArrayList<String>();
		globalList.add("Monday");
		globalList.add("Tuesday");
		globalList.add("Wednesday");
		globalList.add("Thursday");
		globalList.add("Friday");
		globalList.add("Saturday");
		globalList.add("Sunday");
		
		for (String str : globalList) {
			if (!list.contains(str)) {
				complement.add(str);
			}
		}
		return complement;
	}
}
