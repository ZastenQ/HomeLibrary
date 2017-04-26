package by.htp.library;

import by.htp.library.entity.Library;
import by.htp.library.entity.Menu;

public class Main {

	public static void main(String[] args) {

		Library homeLibrary = new Library();
		homeLibrary.addBook("Java", 2012, "Lowrence, Gates");
		homeLibrary.addBook("Guns, Germs, and Steel: The Fates of Human Societies", 1997, "Diamond");
		homeLibrary.addBook("Bible", 1900, "NA");
		homeLibrary.addBook("Title", 2000, "Author");
		homeLibrary.addBook("TitleAnotherOne", 2016, "Author");

		homeLibrary.removeBook("Bible");
		homeLibrary.sortLibrary();
		homeLibrary.findBook("Author").printLibrary();
		homeLibrary.findBook("Lowrence", "Gates").printLibrary();

		Menu menu = new Menu(homeLibrary);
		menu.startMenu();
	}

}
