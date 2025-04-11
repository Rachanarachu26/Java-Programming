package SortingTechniques;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n=arr.length;
        System.out.println("before insertion sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Insertion(arr,n);
        System.out.println("after insertion sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Insertion(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;

            }

        }
    }
}
