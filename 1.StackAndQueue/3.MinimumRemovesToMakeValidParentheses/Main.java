import java.util.*;

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/
public class Main{
	public static void main(String[] args){
		solution();
		//Maintain a variable to extra open bracket
		//replace close bracket with *
	}


	public static void solution(){
		 String s = "lee(t)cod)e";
		 String ans = minRemoveToMakeValid(s);
		 System.out.println(ans);
	}

	public static String minRemoveToMakeValid(String s){
		// Not my approach

		int n = s.length();
		char[] ch = s.toCharArray();

		int open = 0;

		for(int i = 0; i < n; i++){
			if(ch[i] == '('){
				open++;
			}else if(ch[i] == ')'){
				if(open > 0){
					open--;
				}else{
					ch[i] = '*';
				}
			}
		}

		StringBuilder ans = new StringBuilder("");
		for(int i = n - 1; i >= 0; i--){

			if(ch[i] == '*') continue;

			if(ch[i] == '('){
				if(open > 0){
					open--;
					continue;
				}
			}

			ans.append(ch[i]);
		}

		return ans.reverse().toString();
	}
}
