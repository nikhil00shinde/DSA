import java.util.*;


public class Main{
	
	public static void main(String[] args){
		solution();
	}

	public static void solution(){
		//Write Solution here
		int[] temp = {73,74,75,71,69,72,76,73};
		int[] ans = dailyTemperature(temp);
		for(int i = 0; i < 8; i++){
			System.out.print(ans[i]+" ");
		}
		System.out.println();
	}

	public static int[] dailyTemperature(int[] temp){
		int n = temp.length;
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();

		for(int i = 0; i < n; i++){
			while(st.size() > 0 && temp[st.peek()] < temp[i]){
				ans[st.peek()] = i - st.peek();
				st.pop();
			}
			st.push(i);
		}
		return ans;
	}
}
