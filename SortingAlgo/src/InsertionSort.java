public class InsortionSort {

     public  static int[]   Insort( int []arr ) {

         for (int i = 0; i < arr.length-1; i++) {
              int j = i-1  ;
              int temp = arr[i] ;
              while ( j>= 0 && arr[j] > temp  ) {
                   arr[j+1] = arr[j] ;
                   j-- ;
              }
              arr[j+1] = temp ;
         }
   return  arr  ;
     }
    public static void main(String[] args) {
        int arr [] = { 9,8,6,3,5,7,4,12,0} ;
          int [] res  =  Insort( arr ) ;
          for (int n  : arr ) {
              System.out.print(n + "  ");
          }
    }
}
