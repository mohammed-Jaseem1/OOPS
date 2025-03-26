import java.util.Scanner;
import java.util.Arrays;
class binarysearch1{
void defines(int arr[],int n,int item){
Arrays.sort(arr);
int l = 0;
int h = n - 1;
boolean found = false;
while ( l <= h) {
int m = (l+h) / 2;
if (arr[m] == item){
System.out.println("item has found"+(m+1));
found = true;
break;
}
else if (arr[m]<item){
l = m + 1;
}
else{
h = m - 1;
}
}
if(!found){
System.out.println("item not found");
}
}
public  static  void main(String args[]){
int n,item,i;
Scanner sc = new Scanner (System.in);
binarysearch1 binsearch = new binarysearch1();
System.out.println("enter the number of elements:");
n = sc.nextInt();
int[] arr = new int[n];
System.out.println("enter" + n + "numbers:");
for (i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("enter the number to be search:");
item = sc.nextInt();
binsearch.defines(arr,n,item);
}
}


 
