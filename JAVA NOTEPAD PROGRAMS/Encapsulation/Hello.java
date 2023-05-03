class Encap {
	public int a;
	private String b;

	public void setData() {
		String id = System.console().readLine("Enter the ID --> ");
		// System.out.println("Enter the ID --> ");
		this.b = id;
	}

	public void getData() {
		System.out.println("*** This is Your Data *** " + this.b);

	}
}

class Hello {
	public static void main(String args[]) {
		Encap obj1 = new Encap();
		obj1.setData();
		obj1.getData();
		obj1.a = 10;
		System.out.println("The  Value of A  ---> " + obj1.a);
	}
}