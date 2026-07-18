public class recursion1 {
    static int arr[] = {10,20,30};
    public static void main(String[] args) {
        printArray();
        printArray1(2);
    }
    public static void printArray(){
        for(int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void printArray1(int idx){
        if(idx < 0) return;
        else{
            printArray1(idx-1);
            System.out.println(arr[idx]);
        }
    }
}
