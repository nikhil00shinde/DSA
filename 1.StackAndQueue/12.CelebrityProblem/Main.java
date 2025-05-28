import java.util.*;


public class Main{
	public static void main(String[] args){
		solution();
	}

	public static void solution(){
		//Write Solution here
		//A celebrity is person 
		//1. everyone knows him
		//2. he knows no one

		//we are given 2d matrix
		int[][] mat = {{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
		
		//We will use elimination method (learn it)

		Stack<Integer> st = new Stack<>();
		int n = 4;
		for(int i = 0; i < n; i++){
			st.push(i);
		}

		while(st.size() >= 2){
			int i = st.pop();
			int j = st.pop();

			if(mat[i][j] == 1){
				// if i knows j -> i is not a celebrity
				st.push(j);
			}else{
				//if i doesn't know j -> i is a celebrity
				st.push(i);
			}
		}
		
		//we got the potential candidate that can be celebrity
		//we need to make sure he celebrity by checking that he knows no one and everyone knows him

		//he knows no one
		int p = st.pop();
		boolean flag = true;
		for(int i = 0; i < n; i++){
			if(mat[p][0] == 1){
				flag = false;
				break;
			}
		}

		//everyone know him
		for(int i = 0; i < n; i++){
			if(i != p && mat[i][p] == 0){
				flag = false;
				break;
			}
		}

		if(flag){
			System.out.println(p);
		}else{
 			System.out.println("None");
		}
	}
}
