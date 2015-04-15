 insertion Sort Test Case 작성
 ```java
 void insertion_sort(int[] arr) {
   int idx, subIdx, key;

   for(idx = 1; idx < arr.length; idx++) {
    key = arr[idx];
    subIdx = idx – 1;
    while( subIdx >= 0 && arr[subIdx] > key) {
      arr[subIdx + 1] = arr[subIdx];
      subIdx--;
    }
   arr[subIdx + 1] = key;
   }
 }
 ```
 loop invariant = 0부터 idx-1의 원소들은 입력 배열에서 0부터 idx-1
사이에 있던 원소들이고 정렬되어 있다.
 
 Array.insert
 1. 원소갯수관점
  1. 원소갯수가 0개인 배열을 테스트해본다.
   ```java
    int[] arr = new int[0];
    insertion_sort(arr);
   ```
  2. 원소갯수가 1개인 배열을 테스트해본다.
   ```java
    int[] arr = new int[1] {1};
    insertion_sort(arr);
   ```
  3. 원소갯수가 2개인 배열을 테스트해본다.
   ```java
    int[] arr = new int[2] {2,1};
    insertion_sort(arr);
   ```
  4. 원소갯수가 3개이상인 임의의 숫자 n인 배열을 테스트해본다.
   ```java
    int[] arr = {1,6,3,7,8,2};
    insertion_sort(arr);
   ```
 2. 입력특성관점
  1. 정렬이 이미 맞춰져있는 배열을 테스트해본다.
   ```java
    int[] arr = {1,2,3,4,5,6,7};
    insertion_sort(arr);
   ```
  2. 정렬이 역순으로 되어있는 배열을 테스트해본다.
   ```java
    int[] arr = {7,6,5,4,3,2,1};
    insertion_sort(arr);
   ```
  3. 랜덤하게 정렬되어 있는 배열을 테스트해본다.
   ```java
    int[] arr = {4,3,2,1,5,6,7,8};
    insertion_sort(arr);
   ```
  4. 동일한 숫자가 있는 배열을 테스트해본다.
   ```java
  	int[] arr = {1,2,3,2};
  	insertion_sort(arr);
   ```
    
    
    
