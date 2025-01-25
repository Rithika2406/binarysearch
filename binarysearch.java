import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner S=new Scanner(System.in);
        int key=S.nextInt();
        int arr[]={10,20,30,40,50};
        int lb=0;
        int ub=arr.length-1;
        int flag=0;
        while(lb<=ub)
        {
            int mid=(lb+ub)/2;
            if(arr[mid]==key)
            {
                System.out.println("element found at"+mid);
                flag=1;
                break;
            }
            else if(arr[mid]<key)
            {
                lb=mid+1;
            }
            else
            {
                ub=mid-1;
            }
        }
        
    if(flag==0)
    {
        System.out.println("element not found");
    }
    }
}