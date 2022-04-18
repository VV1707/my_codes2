import java.util.*;
public class qs{
    int temp[];
    int len;
 
    public void sort(int[] num) {
         
        if (num==null || num.length==0) {
            return;
        }
        this.temp=num;
        len = num.length;
        quickSort(0, len - 1);
    }
     public void quickSort(int low_index, int high_index) {
         
        int i = low_index;
        int j = high_index;

        int pivot = temp[low_index+(high_index-low_index)/2];
        
        while (i <= j) {
               while (temp[i] < pivot) {
                i++;
            }
            while (temp[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low_index < j)
            quickSort(low_index, high_index);
        if (i < high_index)
            quickSort(low_index, high_index);
    }
 
    public void swap(int i, int j) {
        int t = temp[i];
        temp[i] = temp[j];
        temp[j] = t;
    }
    public static void main(String args[])
    { 
        qs o=new qs();
        int num[] = {13,45,61,3,78,12,99};
        o.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
