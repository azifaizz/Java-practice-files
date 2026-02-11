package Q100;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        int[] unique=new int[n];
        System.out.println("Enter sorted numbers:");
        for (int i=0;i<n;i++) {
            nums[i]=sc.nextInt();
        }
        int k=0;
        for (int i=0;i<n;i++){
            if (i==0||nums[i]!=nums[i-1]){
                unique[k]=nums[i];
                k++;
            }
        }
        System.out.println("Unique count:"+ k);
        System.out.println("Unique elements:");
        for (int i=0;i<k;i++){
            System.out.print(unique[i]+" ");
        }
        sc.close();
    }
}
