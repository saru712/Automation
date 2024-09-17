package CodingExamples;

public class CountOfObjects {
	static int  count = 0;

	public CountOfObjects() {
		count++;
	}

	public static int getcount() {
		return count;
	}

	public static void main(String[] args) {
		CountOfObjects obj1 = new CountOfObjects();
		CountOfObjects obj2 = new CountOfObjects();
		CountOfObjects obj3 = new CountOfObjects();
		int c= CountOfObjects.getcount();
		System.out.println("NumberOfObjects created are"+ " "+ c);

	}
}