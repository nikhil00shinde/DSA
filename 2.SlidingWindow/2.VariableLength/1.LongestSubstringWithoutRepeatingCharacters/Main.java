import java.util.*;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class Main{
	public static void main(String[] args){
		solution();
	}

	public static void solution(){
		//Write Solution here
		//in this problem we will use the sliding window concept
		String s = "pwwkew";

		int max = 0;
		int i = 0, n = s.length();
		Set<Character> st = new HashSet<>();
		int lon = 0;
		for(int j = 0; j < n; j++){
			char ch = s.charAt(j);
			if(st.contains(ch)){
				st.remove(s.charAt(i));
				i++;
				lon--;
				j--;
			}else{
				st.add(ch);
				lon++;
			}
			max = Math.max(lon, max);

		}
		System.out.println(max);
	}
}
