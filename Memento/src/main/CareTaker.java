package main;

import java.util.Stack;

public class CareTaker { // Caretaker

	Stack<Card.CartMemento> history = new Stack<>();
	
	public void save(Card card) {
		history.push(card.save());
	}
	
	public void revert(Card card) {
		
		if(!history.isEmpty()) {
			card.revert(history.pop());
		
		} else {
			System.out.println("Cannot undo!");
		}
	}
}
