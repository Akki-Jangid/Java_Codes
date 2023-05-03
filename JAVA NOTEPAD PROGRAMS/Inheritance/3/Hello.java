
interface Inter{
	abstract void akki_1();
	abstract void akki_2();
}
interface Inter_1{
	abstract void akki_1(int a);
	abstract void akki_2(String a);
}

class Inter_2 implements Inter,Inter_1{
	public void akki_1() { System.out.println("//\\ This is Inherited Class //\\ CHILD CLASS //\\ Akki_1"); }
	public void akki_2() { System.out.println("//\\ This is Inherited Class //\\ Child Class //\\ Akki_2"); }
	public void akki_1(int a) { System.out.println("//\\ This is Inherited Class //\\ CHILD CLASS //\\ Akki_1 "+a); }
	public void akki_2(String a) { System.out.println("//\\ This is Inherited Class //\\ Child Class //\\ Akki_2 "+a); }
}

class Hello{
	public static void main(String args[]){
	Inter_2 obj1 = new Inter_2();
	obj1.akki_1();
	obj1.akki_2();
	obj1.akki_1(100);
	obj1.akki_2("Akkki");
	}
}