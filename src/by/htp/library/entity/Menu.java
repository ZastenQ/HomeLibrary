package by.htp.library.entity;

import java.util.Scanner;

public class Menu {
	private MenuItem[] items;
	private Library myBooks;

	public Menu(Library mybooks) {
		this.myBooks = mybooks;
		items = new MenuItem[] { new MenuItem(1, "To see all books"), new MenuItem(2, "To sort books"),
				new MenuItem(3, "Find books by author"), new MenuItem(4, "Close Menu") };
	}

	public void print() {
		this.myBooks.printLibrary();
	}

	public void sortAndPrint() {
		this.myBooks.sortLibrary();
		this.myBooks.printLibrary();
	}

	public void findAndPrint(String author) {
		this.myBooks.findBook(author).printLibrary();
	}

	public void startMenu() {
		System.out.println("Write a number from a list below:");
		for (int i = 0; i < this.items.length; i++) {
			System.out.println(this.items[i].getIndex() + " - " + this.items[i].getText());
		}
		boolean repeatMenu = true;
		do {
			Scanner input = new Scanner(System.in);
			switch (input.nextInt()) {
			case 1:
				this.print();
				break;
			case 2:
				this.sortAndPrint();
				break;
			case 3:
				Scanner authorInput = new Scanner(System.in);
				System.out.println("Write the Name of author:");
				this.findAndPrint(authorInput.nextLine());
				break;
			case 4:
				repeatMenu = false;
				input.close();
				System.out.println("GoodBye!");
				break;
			default:
				System.out.println("Write a number from 1 to 4:");
			}
		} while (repeatMenu);
	}
}
