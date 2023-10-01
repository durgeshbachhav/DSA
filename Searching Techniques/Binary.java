public class Binary {

     static int BinarySearch(int arr[], int low , int high , int target){
          while(low <= high){
               int mid = low + (high -low ) / 2;

               if(arr[mid] == target){
                    return mid;
               }else if(arr[mid] > target){
                    high = mid - 1;
               }else{
                    low = mid + 1;
               }
          }
          return -1;
     }
     public static void main(String[] args) {

          int arr[] = { 1,2,3,4,5,6,7,8,9};

          int low = 0;
          int high = arr.length-1;
          int target = 8;
          int result = BinarySearch(arr, low, high, target);
          System.out.println("element found at index :"+result);

     }
}
/*
Binary search ek efficient search algorithm hai jo sorted array ya list mein kisi element ko search karne ke liye istemal hota hai. Ye algorithm array ko kisi specific element ke liye half karke search karta hai.

**pseudocode**
define arr
define low =0
define high = arr.length - 1; //beacouse array indexing start from zero and length calculate start from 1

define target

BinarySearch(arr, low, high, target):
    while low <= high:
        mid = low + (high - low) // 2

        # Check if target is present at mid
        if arr[mid] == target:
            return mid

        # If target is greater, ignore the left half
        agar target bada hai toh low ko badao
        elif arr[mid] < target:
            low = mid + 1

        # If target is smaller, ignore the right half
        otherwise high ko kam karo
        else:
            high = mid - 1

    # If we reach here, then the element was not present
    return -1


Yahan `arr` ek sorted array hai, `low` starting index hai, `high` ending index hai, aur `target` woh element hai jise aap dhundh rahe hain.

Yeh kaise kaam karta hai:

1. `mid` calculate karta hai, aur dekhta hai ki kya `arr[mid]` woh element hai jise aap dhundh rahe hain.
2. Agar `arr[mid]` target ke barabar hai, toh mid return karta hai.
3. Agar `arr[mid]` target se chhota hai, toh left half ignore hota hai, aur search right half mein continue hota hai.
4. Agar `arr[mid]` target se bada hai, toh right half ignore hota hai, aur search left half mein continue hota hai.
5. Ye process jab tak `low` index `high` index se chhota ya barabar hai, chalta rahega.

Agar element mil jaata hai toh index return hota hai, nahi toh -1 return hota hai.

Yeh ek example ke saath samajhte hain. Suppose aapko 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 is array mein 8 dhundhna hai. Toh aap call karenge `BinarySearch(arr, 0, 9, 8)`, jisme `arr` hai aapka array, `0` hai starting index, `9` hai ending index, aur `8` hai woh element jo aap dhundh rahe hain. Is case mein function 7 return karega, kyun ki 8 index 7 par hai.



Time Complexity Analysis:

Binary search har comparison ke baad array ko adha karta hai. Is tarah se search space continuously reduce hota hai. Iska result log(n) comparisons ke liye aata hai, jahan n array size hai.
Space Complexity Analysis:

Binary search iterative approach mein constant space use karta hai, kyun ki sirf kuch variables ka istemal hota hai jaise ki low, high, mid, target, jo ki fixed size hote hain.


 */