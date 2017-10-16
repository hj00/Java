package algorithm;

import java.util.LinkedList;

public class PrintEleofLinkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		
		System.out.println("Linked List Content: " + linkedlist);
		
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList Conten after addition: " + linkedlist);
		
		Object firstvar = linkedlist.get(0);
		System.out.println("First element : " + firstvar);
		
		linkedlist.set(0, "Changed first item");
		
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First element after update by set method: " + firstvar2);
		
		
	}

	

}
