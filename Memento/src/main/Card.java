package main;

import java.util.ArrayList;

public class Card { // Originator

	ArrayList<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public ArrayList<Item> getItems() {
		return (ArrayList) items.clone();
	}
	
	public CartMemento save() {
		return new CartMemento(getItems());
	}
	
	public void revert(CartMemento cartMemento) {
		items = cartMemento.getItems();
	}
	
	@Override
	public String toString() {
		return "Card{Items=" + items + "}";
	}
	
	static class CartMemento {
		ArrayList<Item> items;
		
		public CartMemento(ArrayList<Item> items) {
			this.items = items;
		}
		
		private ArrayList<Item> getItems() {
			return items;
		}
	}
}
