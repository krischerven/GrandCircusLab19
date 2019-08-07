package co.grandcircus;

public class GrandCircusLab19 {
	public static void main(String[] args) {
		CustomList a = new MyArrayList();
		a = new MyLinkedList();
		a.addItem("a");
		a.addItem("b");
		System.out.println(a.count("c"));
		a.addItem("c");
		System.out.println(a.count("c"));
		a.addItem("c");
		System.out.println(a.count("c"));
		a.removeAt(2);
		System.out.println(a.count("c"));
		a.insertAt(2, "d");
		a.insertAt(3, "d");
		a.insertAt(4, "a");
		System.out.println(a.getFrequencyMap());
	}
}