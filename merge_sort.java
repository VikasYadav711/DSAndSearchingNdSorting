//import javax.swing.text.html.parser.Element;

public class merge_sort {

    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }        
    }

    public static void mergesort(int arr[],int si,int ei)
    {

        if(si>=ei)
            return;

        int mid=si+ (ei-si)/2;
        mergesort(arr,si,mid);// for left part
        mergesort(arr,mid+1,ei);// for right part
       // System.out.println("in mergesort");
        merge(arr,mid,si,ei);

    }

    public static void merge(int arr[],int mid,int si,int ei)
    {
        int[] temp=new int[ei-si+1];

        int i=si; // for right
        int j=mid+1;  // for left
        int k=0; // to move in temp array.

        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        //System.out.println("in merges");


        for(i=si, k=0; k<temp.length; i++, k++)
        {
            arr[i]=temp[k];
        }
    }
    
    public static void main(String args[])
    {
        //int arr[]=new int[]{6,3,9,5,2,8};
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,5);
        printarray(arr);
    }
}
