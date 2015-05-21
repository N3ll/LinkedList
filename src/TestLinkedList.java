public class TestLinkedList {

	public static void main(String[] args) {

		SingleLinkedList<String> list = new SingleLinkedList<>();
		System.out.println(list.size());
		list.insert("Bob");
		System.out.println(list.size());
		list.print();
		list.insert("Al");
		System.out.println(list.size());
		list.print();
		list.insert("Zen");
		list.insert("Men");
		System.out.println(list.size());
		list.print();
		
		list.delete("Bob");
		System.out.println(list.size());
		list.print();
		
		list.delete("Al");
		System.out.println(list.size());
		list.print();
		
		SingleLinkedList<String> list2 = new SingleLinkedList<>();
		list2.insert("Deci");
		list2.insert("Ceci");
		list2.print();
		
		System.out.println("\n");
		list.insertAll(list2);
		list.print();
	}

}
