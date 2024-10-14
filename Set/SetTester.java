package set;

public class SetTester {
	public static void main(String[] args) {
		Set set = new Set();
		set.add("hi");
		set.add("hi");
		set.previous();
		set.previous();
		System.out.println(set);
		set.remove("hi");
		System.out.println(set);
	}
}