import java.util.*;


public class Main{
	public static void main(String[] args){
		//solution1();
		solution2();
	}

	public static void solution1(){
		//This my approach I have used the ArrayList(Stack) to store the miminimum element so far
		int[] nums = {9,8,1,0,1,9,4,0,4,1};
		int n = nums.length;
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		int ans = 0;
		for(int i = 1; i < n; i++){
			int size = al.size();
			for(int j = size-1; j >= 0; j--){
				if(nums[i] >= nums[al.get(j)]){
					ans = Math.max(i - al.get(j),ans);
				}else{
					break;
				}
			}

			if(nums[al.get(size-1)] > nums[i]) al.add(i);
		}
		System.out.println(ans);
	}

	public static void solution2(){
		// in this approach, we have used the concept related to sliding window where we used two pointer to determine the maximum ramp by iterating over the maximum element array
		int[] nums = {6,0,8,2,1,5};
		int n = nums.length;
		int[] max = new int[n];
		max[n-1] = nums[n-1];
		for(int i = n - 2; i >= 0; i--){
			max[i] = Math.max(nums[i],max[i+1]);
		}
		int left = 0;
		int right = 1;
		int ans = 0;
		while(right < n){
			while(right < n && nums[left] <= max[right]){
				ans = Math.max(right-left,ans);
				right++;
			}
			left++;
		}

		System.out.println(ans);
	}
}
