class Pbl26
{
public static void main(String args[])
{
int arr[] = new int[]{96,135,78,100,45,23,67,35};
int temp = 0;
for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
System.out.println("Sorted Array Elements are : ");
for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }   
}
}
