import java.util.*;

//https://leetcode.com/problems/sliding-window-maximum/description/
//need revision
public class Main{
	public static void main(String[] args){
		solution();
	}

	public static void solution(){
		//Write Solution here
		
		//1. first calculate the next greatest element
		int[] arr = {1,3,-1,-3,5,3,6,7}; 
		int[] nge = nextGreatestElement(arr);

		int[] ans = slidingWindow(nge,arr,3);
		for(int i = 0; i < ans.length; i++){
			System.out.print(ans[i]+" ");
		}
		System.out.println();
	}

	public static int[] nextGreatestElement(int[] arr){
		int n = arr.length;
		Stack<Integer> st = new Stack<>();
		int[] nge = new int[n];

		nge[n-1] = n;
		st.push(n-1);

		for(int i = n-2; i >= 0; i--){
			while(st.size() > 0 && arr[i] >= arr[st.peek()]){
				st.pop();
			}

			if(st.size() == 0){
				nge[i] = n;
			}else{
				nge[i] = st.peek();
			}
			st.push(i);
		}

		return nge;
	}

	public static int[] slidingWindow(int[] nge, int[] arr, int k){
		int j = 0;
		int n = arr.length;

		int[] ans = new int[n-k+1];
		for(int i = 0; i <= n-k; i++){
			if(j < i) j = i;

			while(nge[j] < i+k){
				j = nge[j];
			}

			ans[i] = arr[j];
		}
		return ans;
	}

}
