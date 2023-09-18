public class StringMergeSort {

    public static void main(String args[])
    {
        String arr[]={"sun","earth","mars","mercury"};
        mergesort(arr, 0, 3);

        printarr(arr);
    }

    public static void printarr(String arr[])
    {
        System.out.print("{ ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"    ");
        }
        System.out.print("}");
    }

    public static void mergesort(String arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;

        mergesort(arr,si,mid);
        mergesort(arr, mid+1, ei);
        merge(arr,mid,si,ei);

    }

    public static void merge(String arr[],int mid,int si,int ei)
    {
        String[] temp=new String[ei-si+1];
        int i=si,j,k;
        j=mid+1;
        k=0;

        while(i<=mid && j<=ei)
        {
            if(arr[i].compareTo(arr[j])<0)
            {
                temp[k++]=arr[i];
                i++;
            }
            
            
            else if(arr[i].compareTo(arr[j])>0)
            {
                temp[k++]=arr[j];
                j++;
            }
        }

        while(i<=mid)
        {
            temp[k++]=arr[i];
            i++;
        }
        
        while(j<=ei)
        {
            temp[k++]=arr[j];
            j++;
        }

        for(i=si,k=0; k<temp.length; i++,k++)
        {
            arr[i]=temp[k];
        }
    }

    
}
