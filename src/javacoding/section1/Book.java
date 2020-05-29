package javacoding.section1;

public class Book {
	private int noofpages;// member vaibleor instance varible

	// creating constructor
	public Book() {
		// assigning the default value to the constructor
		// this.noofpages=5;//one way to call the default value to the constructor
		this(5);// here throug this another constructor Book wiil called
	}

	public Book(int noofpages) {

		this.noofpages = noofpages;
	}

	public int getNoofpages() {
		return noofpages;
	}

	public void setNoofpages(int noofpages) {
		if (noofpages > 0)
			this.noofpages = noofpages;
		// System.out.println(noofpages);
		// System.out.println(this.noofpages);

	}

	public void incresepages(int byhowmuch) {
		// here to prevent from duplication we are calling setnoofpages
		setNoofpages(this.noofpages + byhowmuch);
	}

	public void decreasepages(int byhowmuch) {
		setNoofpages(this.noofpages - byhowmuch);
	}

	// here no of pages local varible

	void read() {
		System.out.println("i am reading the book");
	}

	void learn() {
		System.out.println("i have learn so many things");
	}

}
