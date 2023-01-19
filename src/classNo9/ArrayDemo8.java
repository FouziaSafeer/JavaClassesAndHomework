package classNo9;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int count=0;
        double[] arr={10.5,12.0,45,10.5,23,10.5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==10.5){
                count=count+1;//count++; we can do this too
            }
        }
        System.out.println(count);
    }
}
