
public class CheckArraySort {
    public static void main (String[] args){
       int[] n1={1,2,3,4};
       int[] n2={1,3,2,3};
       int[] n3={1,2,2,3};
       System.out.println(sort(n1));
       System.out.println(sort(n2));
       System.out.println(sort(n3));
        
    }

    static boolean sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
