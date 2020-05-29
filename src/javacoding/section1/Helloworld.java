package javacoding.section1;

public class Helloworld {

	void method1() {
		// method3(5, 10, 15);
		method2(4);

	}

	void method2(int table) {
		method3(table, 5, 13);

	}

	void method3(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d*%d=%d", table, i, table * i).println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Helloworld tab = new Helloworld();
		// tab.method3(70, 20, 30);
		// tab.method2(5);
		tab.method1();

	}

}
