import java.util.Scanner;
import java.util.Arrays;
class consecutiveones{
public static int conseccutives(int arr[],int n){
      
int count=0;
int max_count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==1){
count++;
}
else{
count=0;
}
max_count = Math.max(max_count, count);
}
return max_count;
}
public static void main(String []args)
{

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n=scanner.nextInt();
		System.out.println("enter the value of x:");
                 
		int arr[]=new int[n];
		System.out.println("enter the elements of an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
        int result=conseccutives(arr,n);

System.out.println("max conseccutive ones in an array:" +result);
                          
}
}
//Time Complexity: O(N) since the solution involves only a single pass.

//Space Complexity: O(1) because no extra space is used.
