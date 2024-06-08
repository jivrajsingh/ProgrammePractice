package AllStringProgramms;

public class RotetedVersionOfString {

	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "J2eeStrutsHibernateJava";
		if(s1.length() != s2.length()) {
			System.out.println("String s1 is not roteted version");
		}
		else {
			String s3 = s1+s1;
			if(s3.contains(s2)) {
				System.out.println("s2 is roted version of s1");
			}
			else {
				System.out.println("s2 is not roted version of s1");
			}
		}

	}

}
