package by.htp.library.entity;

public class Library {
	private Book[] bookStorage;
	private static final int INITIAL_LIBRARY_SIZE = 0;

	public Library() {
		this.bookStorage = new Book[INITIAL_LIBRARY_SIZE];
	}

	public Library(int storageSize) {
		this.bookStorage = new Book[storageSize];
	}

	public Book[] getLibrary() {
		return bookStorage;
	}

	public void setLibrary(Book[] bookStorage) {
		this.bookStorage = bookStorage;
	}

	// methods for adding new book
	private void addBook(Book newBook) {
		Book[] bookStorageTemp = new Book[this.bookStorage.length + 1];
		for (int i = 0; i < this.bookStorage.length; i++) {
			bookStorageTemp[i] = this.bookStorage[i];
		}
		bookStorageTemp[this.bookStorage.length] = newBook;
		this.bookStorage = bookStorageTemp;
	}

	public void addBook(String title, int year, String author) {
		Book newBook = new Book(title, year, author);
		this.addBook(newBook);
	}

	public void removeBook(String title) {
		Library alteredStorage = new Library();
		for (int i = 0; i < this.bookStorage.length; i++) {
			if (!this.bookStorage[i].getTitle().equals(title)) {
				alteredStorage.addBook(this.bookStorage[i]);
			} else
				continue;
		}
		this.setLibrary(alteredStorage.bookStorage);
	}

	public void sortLibrary() {
		Library sortedLibrary = new Library(this.bookStorage.length);
		for (int i = 0; i < sortedLibrary.getLibrary().length; i++) {
			sortedLibrary.getLibrary()[i] = this.bookStorage[i];
		}
		Book temp;
		for (int i = 0; i < sortedLibrary.getLibrary().length - 1; i++) {
			for (int j = i + 1; j < sortedLibrary.getLibrary().length; j++) {
				if (sortedLibrary.getLibrary()[i].getYear() > sortedLibrary.getLibrary()[j].getYear()) {
					temp = sortedLibrary.getLibrary()[i];
					sortedLibrary.getLibrary()[i] = sortedLibrary.getLibrary()[j];
					sortedLibrary.getLibrary()[j] = temp;
				}
			}
		}
		this.setLibrary(sortedLibrary.bookStorage);
	}

	public Library findBook(String author) {
		Library searchResults = new Library();
		for (int i = 0; i < this.bookStorage.length; i++) {
			if (this.bookStorage[i].getAuthor().contains(author)) {
				searchResults.addBook(this.bookStorage[i]);
			}
		}
		return searchResults;
	}

	public Library findBook(String authorFirst, String authorSecond) {
		Library searchResults = new Library();
		for (int i = 0; i < this.bookStorage.length; i++) {
			if (this.bookStorage[i].getAuthor().contains(authorFirst)
					& this.bookStorage[i].getAuthor().contains(authorSecond)) {
				searchResults.addBook(this.bookStorage[i]);
			}
		}
		return searchResults;
	}

	public void printLibrary() {
		for (int i = 0; i < this.bookStorage.length; i++) {
			this.bookStorage[i].printBook();
		}

	}
}
