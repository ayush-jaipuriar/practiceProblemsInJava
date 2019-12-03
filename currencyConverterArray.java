import java.io.*;
class currencyConverterArray
{
static void printArray(int[] num)
{
	for (int i=0;i<num.length; i++)
	{
	System.out.println("The value of array at "+i+" is "+num[i]);
	
	
	}

}


public static void main(String[] args)
{
int arr[] =new int [10];
for (int i=0;i<arr.length;i++)
{
arr[i]=0;
}

printArray(arr);
int[] arr2=new int[]{1,2,3,4,5};
printArray(arr2);
}
}
