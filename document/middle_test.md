# 자료구조 알고리즘 2

### 1. Loop invariant를 이용한 알고리즘 증명 방법에 대해서 간략하게 설명하시오.
loop invariant는 loop가 진행되더라도 변하지 않는 불변 특성이다. loop가 들어간 알고리즘의 correctness를 증명하기 위해 사용된다.
induction의 한 종류로 다음의 특징을 만족해야 한다. 
 
 1. initialization  
 loop 초기진입 시점에 loop invariant가 참이다.
 2. Maintenance		
 반복 수행전 loop invariant가 참이었다면, 반복 수행 후에도 loop invariant가 참이어야 한다.	
 3.	termination		
 loop를 다 돌고서 loop invariant가 알고리즘의 correctness를 증명하는데 도움이 되어야한다.
  
### 2. Divide-and-conquer 전략에 대해서 간략하게 기술하시오.
주어진 문제를 동일한 종류의 작은 문제로 분할해 문제 분할 과정을 재귀적으로 처리하여 답을 구하는 전략이다. 

 1. Divide
 주어진 문제를 동일한 종류의 작은 문제들로 나눈다.
 2. Conquer
 문제가 충분히 작아졌을 땐 직접적으로 해를 구한다.
 3. 합치는 과정
 작은 문제들의 해를 이용해 주어진 문제의 해를 구한다.
 ![divideAndConquerTimeComplexity](../image/DivideAndConquerTC.png)

### 3. Heap 자료구조의 특징과 장단점에 대해서 간략하게 기술하시오.
Max Heap
각 노드의 값이 그 노드의 children 노드의 값보다 크거나 같은 complete binary tree.
(Min Heap 이라면 작거나 같은 complete binary tree)

- 장점
	1. max heap에서는 최대값, min heap에서는 최소값을 Θ(1)의 시간 복잡도로 구할 수 있다.
    2. heap sort는 추가 공간을 Θ(1)정도 필요로 하는 in-placement sorting 알고리즘이다.
    3. 배열을 이용해 구현하면 children node 값을 Θ(1)의 시간복잡도로 찾을 수 있다.
- 단점
	1. node를 삽입하거나 추출할 때 삽입(추출) 후에 max-heap 유지를 위한 추가과정이 필요하다.
    2. serach 에는 적합하지 않다.
    
### 4. Priority queue에 대해서 간략하게 기술하시오.
cpu에게 job을 할당하는, job scheduling 기법의 하나로 우선순위가 높을수록 먼저 cpu에 할당시킨다. max-heap 자료구조를 이용하여 구현할 수 있다.
우선순위 값이 최대인 것은 언제나 root-node 이므로, 가장 우선순위가 높은 job을 쉽게 찾을 수 있다.

### 5. What are the minimum and maximum numbers of elements in a heap if height h?
간략한 답안 <br>
최소값은 1 + 2 + … + 2h-1 + 1 = 2h <br>
최대값은 1 + 2 + … + 2h = 2h+1 - 1

### 6. Fibonacci number 는 다들 아는대로 정의된다. 아래의  방법으로 F(n)을 구하는 알고리즘을 기술하시오.
1. Recursion
```java
	void int fibonacci (int n) {
		if(n < 0) return -1; //error
		if(n < 2) return n; //f(0)=0,f(1)=1
		return fibonacci(n-1) + fibonacci(n-2);
	}
``` 
2. Dynamic Programming
```java
	void int fibonacci (int n) {
		int finonacciArr[n+1];
	    int idx;
	    fibonacciArr[0] = 0;
	    fibonacciArr[1] = 1;
	    for(idx=2; idx<n+1; idx++) {
	     fibonacciArr[idx] =
	     	fibonacciArr[idx-1] + finoacciArr[idx-2];
	    }
	    return fibonacciArr[n];
	}
```
3. Divide and conquer 방법
	{f(n+1),f(n)}={{1,1},{1,0}}^n * {f1,f0} 이다. //행렬의 곱
	따라서 이 문제는 M={{1,1},{1,0}} 일 때, M의 거듭제곱을 Divide and Conquer로 구하는 문제로 바꿀 수 있다.
	M^n = M^(n/2) * M^(n/2) 로 문제를 나누어 해를 구하면 T(n) = T(n/2) + Θ(1)의 알고리즘을 찾을 수 있다.
	
###7.insertion Sort
1.Insertion Sort를 작성하시오.
```java
void insertionSort(int[] arr) {
	int idx,subIdx,key;
	for(i=0;idx<arr.length;i++) {
		key = arr[idx];
		subIdx = idx-1;
		while( subIdx>=0 && arr[subIdx] > key) {
			arr[subIdx+1] = arr[subIdx];
			subIdx--;
		}
		arr[subIdx+1]=key;
	}
}
```
2.TimeComplexity
worst case 일 때, 총 수행횟수는 sigma(1,n-1) 이다.
따라서 n(n-1) / 2 가 되므로 O(n^2)이다.
3.loop-invariant로 증명
- loop-invariant
	0부터 idx-1의 원소들은 입력 배열에서 0부터 idx-1 사이에 있던 원소들이고 정렬되어 있다.
- initialization
	- Idx가 1이면 0부터 idx-1에는 arr[0] 한 개만 있다. 􏰁
	- arr[0]는 입력 배열에서 arr[0]에 있던 원소이다. 
	- 􏰁원소가 1개이므로 정렬되어 있다.
􏰁    - 따라서, for-loop 시작하기 전에 loop invariant가 TRUE이다.
- maintenance
	- while-loop에서 arr[idx]의 올바른 위치를 찾기 위해서 arr[idx- 1], arr[idx-2], arr[idx-3]의 순서로 원소들을 한 칸씩 오른쪽으로 이동한다.
􏰁 	- 찾은 위치에 arr[idx]를 삽입한다.
	- 􏰁0~idx의 원소들은 입력 배열에서 0~idx에 있던 원소들이고 정렬되어 있다.
􏰁 	- 따라서, 반복 1회 수행 후에도 loop invariant가 TRUE이다.
- Termination
	- for-loop는 idx가 length가 되면 종료
	- 이 시점에 0부터 idx – 1 사이의 원소들은 모두 원래 배열에서 0부터 idx – 1 사이에 있는 원소들이고 정렬되어 있음
􏰁 	- 따라서, idx 대신에 length를 넣어보면 0부터 length – 1까지의 원소들은 입력 배열에 있던 원소들이고 정렬되어 있음.
􏰁 	- 결과적으로 insertion sort 알고리즘은 correct함.