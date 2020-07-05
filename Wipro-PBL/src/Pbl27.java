
class Pbl27
{
public static void main(String args[])
{
int n = args.length;
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i] = Integer.parseInt(args[i]); 
}
int end = arr.length;

    for (int i = 0; i < end; i++) {
        for (int j = i + 1; j < end; j++) {
            if (arr[i] == arr[j]) {                  
                int shiftLeft = j;
                for (int k = j+1; k < end; k++, shiftLeft++) {
                    arr[shiftLeft] = arr[k];
                }
                end--;
                j--;
            }
        }
    }

    int[] whitelist = new int[end];
    for(int i = 0; i < end; i++){
        whitelist[i] = arr[i];
    }
System.out.println("Array after removing duplicate elements : ");
for(int i=0;i<end;i++)
{
System.out.print(whitelist[i]+" ");
}
}
}
