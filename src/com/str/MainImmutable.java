package com.str;

final class ImmutableClass {
	private final int x;
	private final String str;
	private final A a;

	public ImmutableClass(int x, String str, A a) {
		this.x = x;
		this.str = str;
		A a1=null;
		try {
			a1 = (A) a.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		this.a=a1;
	}

	public int getX() {
		return x;
	}

	public String getStr() {
		return str;
	}

	public A getA() {
		A a1 = null;
		try {
			a1 = (A) a.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return a1;
	}
	
	@Override
	public String toString() {
		return "[x="+this.x+",str="+this.str+",A[i="+this.a.getA()+"]]";
	}
}

class A implements Cloneable {
	int a;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class MainImmutable {
	public static void main(String[] args) {
		A a=new A();
		a.setA(10);
		ImmutableClass obj=new ImmutableClass(5, "Anil", a);
		int x = obj.getX();
		String str=obj.getStr();
		str.concat("Kumar");
		A a1=obj.getA();
		a1.setA(15);
		a.setA(20);
		System.out.println(obj);
		
		
	}
}