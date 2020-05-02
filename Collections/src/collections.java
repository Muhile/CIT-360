import java.util.*;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/******************
		 * List Collection
		 ******************/
		
		System.out.println("-- List Collection --");
		List list = new ArrayList();
		list.add("Banana");
		list.add("Cookie dough");
		list.add("French vanilla");
		list.add("Peppermint");
		list.add("Pistachio pineapple");
		list.add("Strawberry");
		list.add("Peanut butter");
		list.add("Bubble gum");
		list.add("Buttermilk");
		list.add("Pralines and Cream");
		list.add("Peppermint");

		for (Object str : list) {
			System.out.println((String) str);
		}

		/******************
		 * Set Collection
		 ******************/

		System.out.println("-- Set Collection --");
		Set set = new TreeSet();
		set.add("Banana");
		set.add("Cookie dough");
		set.add("French vanilla");
		set.add("Peppermint");
		set.add("Pistachio pineapple");
		set.add("Strawberry");
		set.add("Peanut butter");
		set.add("Bubble gum");
		set.add("Buttermilk");
		set.add("Pralines and Cream");
		set.add("Peppermint");

		for (Object str : set) {
			System.out.println((String) str);
		}

		/******************
		 * Queue Collection
		 ******************/

		System.out.println("-- Queue --");
		Queue queue = new PriorityQueue();
		queue.add("Banana");
		queue.add("Cookie dough");
		queue.add("French vanilla");
		queue.add("Peppermint");
		queue.add("Pistachio pineapple");
		queue.add("Strawberry");
		queue.add("Peanut butter");
		queue.add("Bubble gum");
		queue.add("Buttermilk");
		queue.add("Pralines and Cream");
		queue.add("Peppermint");

		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(queue.poll());
		}

		/******************
		 * Map Collection
		 ******************/

		System.out.println("-- Map --");
		Map map = new HashMap();
		map.put(1, "Banana");
		map.put(2, "Cookie dough");
		map.put(3, "French vanilla");
		map.put(4, "Peppermint");
		map.put(5, "Pistachio pineapple");
		map.put(6, "Strawberry");
		map.put(7, "Peanut butter");
		map.put(8, "Bubble gum");
		map.put(9, "Buttermilk");
		map.put(10, "Pralines and Cream");
		map.put(11, "Peppermint");
		map.put(3, "Mango");
		

		for (int i = 1; i <= 11; i++) {
			String result = (String) map.get(i);
			System.out.println(result);
		}
		
		
		System.out.println("-- List using Generics --");
        List<location> myList = new LinkedList<location>();
        myList.add(new location("Utah", "Salt Lake City", "Matt Donovan"));
        myList.add(new location("Utah", "Logan", "Bonnie Bennet"));
        myList.add(new location("Arizona", "Gilbert", "Stephan Salvatore"));
        myList.add(new location("California", "San Diego", "Carmen Sandiego"));
        myList.add(new location("California", "Los Angeles", "Damon Salvator"));
        myList.add(new location("Kansas", "Wichita", "Freya Mickaelson"));
        myList.add(new location("Louisiana", "Baton Rouge", "Marcel Gerard"));

        for (location shop : myList) {
            System.out.println(shop);
        }
	}

}
