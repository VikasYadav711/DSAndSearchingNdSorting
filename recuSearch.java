public class recuSearch {

    public static void srch(int arr[],int n,int key)
    {
        if(n==0)
        {
            return;
        }
        srch(arr,n-1,key);
        if(arr[n]==key)
        {
            System.out.print(n+" ");
        }

    }
    
    public static void main(String args[])
    {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;

        srch(arr, arr.length-1, key);
    }
}
