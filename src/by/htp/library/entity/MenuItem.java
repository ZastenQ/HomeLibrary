package by.htp.library.entity;

public class MenuItem {
	private int index;
	private String text;

	public MenuItem(int index, String text) {
		this.index = index;
		this.text = text;
	}

	public int getIndex() {
		return index;
	}

	public String getText() {
		return text;
	}

}
