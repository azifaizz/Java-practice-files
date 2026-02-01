package wtt.aseel.java;
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,6};
		for(int i = 0;i<arr.length;i++) {
			if (arr[i]!=i+1){
                System.out.println("Missing number:"+(i+1));
                break;
			}
		}
	}
}
