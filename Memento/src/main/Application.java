package main;

/*
 * 03 Pillers
 * 
 * Originator 	– this is the source object, so to speak. In this pattern, its inner state is to be remembered.
 * Memento 		– this is the part that memorises information, usually the inner Originator data.
 * Caretaker	– this is an element that works with memento pattern elements.*/

public class Application {

	public static void main(String[] args) {
		
		CareTaker careTaker = new CareTaker();
		Card card = new Card();
		
		card.addItem(new Item("book"));
		card.addItem(new Item("pen"));
		careTaker.save(card);
		System.out.println(card);
		
		card.addItem(new Item("pencil"));
		careTaker.save(card);
		System.out.println(card);
		
		card.addItem(new Item("phone"));
		careTaker.save(card);
		System.out.println(card);
		
		card.addItem(new Item("notebook"));
		//careTaker.save(card); // avoid showing twice
		System.out.println(card);
		
		careTaker.revert(card);
		System.out.println(card);
		
		card.addItem(new Item("ipad"));
		//careTaker.save(card);
		System.out.println(card);
		
		careTaker.revert(card);
		System.out.println(card);
		
		careTaker.revert(card);
		System.out.println(card);
		
		careTaker.revert(card);
		System.out.println(card);
		
	}
}
