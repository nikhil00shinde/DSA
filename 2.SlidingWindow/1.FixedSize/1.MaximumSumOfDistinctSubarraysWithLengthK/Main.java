import java.util.*;


public class Main{
	public static void main(String[] args){
		solution();
	}

	public static void solution(){
		//Write Solution here
		// I was able to do it in hasmap question https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/submissions/1645501795/

		// Using set is quite interesting approach, in which we try to get the similar element prev index, by applying loop
		int[] arr = {1,5,4,2,9,9,9,10,11};
		int k = 3;
		
		Set<Integer> st = new HashSet<>();
		int i = 0;
		int n = arr.length;
		long max = 0;
		long sum = 0;
		for(int j = 0; j < n; j++){
			if(st.contains(arr[j])){
				while(arr[i] != arr[j]){
					sum -= arr[i];
					st.remove(arr[i]);
					i++;
				}
				i++;
			}else{
				sum += arr[j];
				st.add(arr[j]);

				if((j - i + 1) == k){
					max = Math.max(sum,max);
					sum -= arr[i];
					st.remove(arr[i]);
					i++;
				}
			}
		}

		System.out.println(max);
	}
}
