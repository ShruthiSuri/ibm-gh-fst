package ibm;

abstract  class Book {
	String title;
	public abstract void setTitle(String name);
	public  String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	public  void setTitle(String name) {
		title=name;
		
	}

}

public class Activity5{
	public static void main(String[] args) {
		MyBook myBook=new MyBook();
		myBook.setTitle("Wings Of Fire");
		String bookTitle=myBook.getTitle();
		System.out.println(bookTitle);
	}
}
