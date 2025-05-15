import java.util.*;


public class Main{
	public static void main(String[] args){
		solution();
	}

	public static void solution(){
		//Write Solution here
		String s = "(ed(et(oc))el)";
		String ans = reverseParentheses(s);
		System.out.println(ans);
	}

	public static String reverseParentheses(String s){
		int n = s.length();
                
		char[] ch = s.toCharArray();
                Stack<Character> st = new Stack<>();
                Queue<Character> qu = new LinkedList<>();

		for(int i = 0; i < n; i++){
			if(ch[i] == ')'){
                        	while(st.peek() != '('){
					qu.add(st.pop());
				}
				st.pop();
				while(qu.size() > 0){
					st.push(qu.remove());
				}
			}else{
                          st.push(ch[i]);
			}
		}
		StringBuilder ans = new StringBuilder("");
                while(!st.isEmpty()){
			ans.append(st.pop());
		}
		return ans.reverse().toString();

	}

	public static void reverse(char[] arr, int st, int ed){
		while(st < ed){
			char temp = arr[st];
			arr[st] = arr[ed];
			arr[ed] = temp;
			st++;
			ed--;
		}
	}


}
