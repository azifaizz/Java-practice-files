package wtt.aseel.java;
public class Largessmll {
    public static void main(String[] args) {
        int[]arr={7,2,9,4,1,6};
        int smallest=arr[0];
        int largest=arr[0];
        int num=5;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<num){
                smallest = arr[i];
            }
            if(arr[i]>num){
                largest=arr[i];
            }
        }
        System.out.println("Smallest:"+smallest);
        System.out.println("Largest:"+largest);
    }
}

