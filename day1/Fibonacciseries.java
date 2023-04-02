package week1.day1;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n= 11;
		int f= 0, s= 1, t ;
		
			System.out.println(f);
			System.out.println(s);
			for(int i= 1 ; i<=n ; i= i+1) {
			t=f+s;
			System.out.println(t);
			f= s;
			s= t;
		}

	}

}
