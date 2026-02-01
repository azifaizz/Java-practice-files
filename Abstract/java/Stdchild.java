package Abstract.java;

class Stdchild extends Stdparent{
	private int total() {
		return getM1()+getM2()+getM3()+getM4()+getM5();
	}
	public void grade() {
		int t = total();
		System.out.println("Tot marks="+t);
		if(t>450) {
			System.out.println("Grade A");
		}else if(t>=350) {
			System.out.println("Grade B");
		}else if(t>=250) {
			System.out.println("Grade C");
		}else {
			System.out.println("Fail");
		}
	}
}
