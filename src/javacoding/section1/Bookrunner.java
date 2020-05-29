package javacoding.section1;

public class Bookrunner {

	public static void main(String[] args) {
		Book artofcomputerprogramming = new Book(150);
		Book effectivejava = new Book(100);
		Book cleancode = new Book(200);
		Book java = new Book();
		System.out.println(java.getNoofpages());

		effectivejava.learn();
		cleancode.read();

		effectivejava.setNoofpages(100);
		effectivejava.incresepages(100);
		System.out.println(effectivejava.getNoofpages());
		effectivejava.decreasepages(50);
		System.out.println(effectivejava.getNoofpages());
		// System.out.println(effectivejava.getNoofpages());

		// cleancode.setNoofpages(120);
		// System.out.println(cleancode.getNoofpages());

	}

}
