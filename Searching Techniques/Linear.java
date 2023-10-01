class Linear{
     public static void main(String[] args) {
          
          // linear search 
          // it is searching technique
          // it use to find particular element in array
          // it generaly use for unsorted array
          
          // pseudocode
          /*
               for each element in the list/array:
               if element == target:
                    return index
               return not found
           */

          int arr[] = {2,3,4,5,6,7,89,4};
          int target = 9;
           for(int i = 0 ;i< arr.length;i++){
               if(arr[i] == target){
                    System.out.println("element found at index : "+ i);
               } 
           }
     }
}