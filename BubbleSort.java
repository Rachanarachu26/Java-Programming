package SortingTechniques;

public class BubbleSort {
    public static void main(String[] args) {
       int arr[]={5,4,3,2,1};
       int n=arr.length;
        System.out.println("Before sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("after sort");
        Bubble(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void Bubble(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
            int swap=0;
            int count=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=1;
                    count+=1;
                }
            }
            if(swap==0);
            System.out.println(count);
            break;
        }
    }
}
