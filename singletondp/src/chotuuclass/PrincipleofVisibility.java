package chotuuclass;

class PrincipleofVisibility {

	public String message() {
		Object s1 = new String("Hello").hashCode();
		int s = s1.hashCode();
		
		System.out.println(s1);

		String s2 = new String("Hello");
		int ss = s2.hashCode();
		System.out.println(ss);
		System.out.println(s1.equals(s2));// content comparision

		System.out.println(s1 == s2); // object reference comparision

		return "hey Amit";
	}

	@Override
	public String toString() {
		return "PrincipleofVisibility []";
	}

}
