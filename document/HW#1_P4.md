```java
static Object serach(int[] arr, int v) {
		Object result = null;
		int i = 0;
			while (result == null && i < arr.length) {
				if (arr[i] == v) {
					result = i;
				}
				i++;
			}
		return result;
	}
```
loop-invariant : arr[0,i-1]에 v값이 없으면, result는 null이다. 

1. initialization	
	- i가 0부터 시작하므로 앞에 있는 원소가 없다.
	- 원소가 존재하지 않으므로 v 또한 존재하지 않는다.
	- 이 시점에서 코드 2번째 줄이 result를 null로 초기화하고 있으므로
	- loop-invariant는 참이다.
2. maintenance	
	- while-loop에서 v를 찾기 위해 arr[i]의 값과 v값을 비교한다.
	- v값을 찾으면 result=i가 되면서 loop가 종료된다.
	- v값을 찾지못하면 arr[0,i]에 있는 원소들엔 v값이 없으며 result=null이다.
	- 따라서 반복 1회 실행 후에도 loop-invariant는 참이다.
3. Termination		
	- i가 length가 되거나, result가 null이 아니면 loop가 종료된다.
	- i가 length가 되는 경우, 이 시점에 arr[0,i-1]까지의 원소들엔 v가 없다.
	- 따라서 i대신 length를 넣어보면 arr[0,length-1]까지의 원소들은 입력배열에 있던 원소들이고 v값이 아니며 result=null이다.
	- 또한 result가 null이 아닌 경우, arr[i]가 v이고, result는 i이다.
	- 이 때 arr[0,i-1]까지의 원소들엔 v가 없으며 result=null이다.
	- 따라서 이 알고리즘은 correct하다.
