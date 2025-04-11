package SortingTechniques;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,5,9,2,8};
        int n=arr.length;
        System.out.println("before selection sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Selection(arr,n);

        System.out.println("after selection sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Selection(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }

    }
}
