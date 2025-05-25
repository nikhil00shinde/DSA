import java.util.*;
//https://leetcode.com/problems/merge-intervals/description/

public class Main{
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args){
		solution();
	}

	public static void solution(){
		//Write Solution here
		int[][] intervals = {{1,3} , {2,6}, {8,10}, {15,18}};
		int[][] ans = merge(intervals);
		for(int i = 0; i < ans.length; i++){
			for(int j = 0; j < 2; j++){
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] merge(int[][] intervals){
        	//Sort based on the start interval value
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));

		int n = intervals.length;
		ArrayList<int[]> merged = new ArrayList<>();
		for(int i = 0; i < n; i++){
			if(i == 0){
				merged.add(intervals[i]);
			}else{
				int[] prev = merged.get(merged.size()-1);
				int[] curr = intervals[i];

				if(curr[0] >= prev[0] && curr[0] <= prev[1]){
					prev[0] = Math.min(curr[0],prev[0]);
					prev[1] = Math.max(curr[1],prev[1]);
				}else{
					merged.add(intervals[i]);
				}
			}
		}

		return merged.toArray(new int[merged.size()][]);
	}
}
