import java.util.*;

public class Selection_Sort{
   public static void main(String [] args){
     int [] arr={5, 3, 7, 0, 1, 9, 6};

    for(int i=0; i<6; i++){
        int index= i; 
        for(int j=i+1; j<7; j++){
            if(arr[j]<arr[index]){
                index= j; 
            }
        }
        swap(arr, i, index);
    }
    for(int i=0; i<7; i++){
        System.out.print(arr[i] + " ");
    }
  }
 public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}