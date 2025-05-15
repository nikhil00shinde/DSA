import java.util.*;

//https://www.geeksforgeeks.org/implement-two-stacks-in-an-array/

public class Main{
	public static void main(String[] args){
		solution();
	}

	public static void solution(){
		//Write Solution here

		twoStacks ts = new twoStacks(10);
                System.out.println("Working!!!");
		ts.push1(10);
		ts.push1(20);
		ts.push2(30);
		ts.state();
		ts.push2(40);
		ts.push2(50);
		ts.push2(60);
		ts.state();
	}

	static class twoStacks{
		private int[] arr;
		private int size;
		private int top1, top2;

		twoStacks(int n){
                	this.size = n;
			this.arr = new int[n];
			this.top1 = -1;
			this.top2 = n;
		}


                void state(){
			System.out.println("Stack 1");
			for(int i = 0; i <=top1; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();


			System.out.println("Stack 2");
			for(int i = size-1; i >= top2; i--){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		void push1(int x){
                     if(top1 < top2 - 1){
			     top1++;
			     arr[top1] = x;
		     }
		}

		void push2(int x){
			if(top1 < top2 - 1){
				top2--;
				arr[top2] = x;
			}
		}


		int pop1(){
			if(top1 < 0){
				return -1;
			}else{
				int x = arr[top1];
				top1--;
				return x;
			}
		}

		int pop2(){
			if(top2 >= size){
				return -1;
			}else{
				int x = arr[top2];
				top2++;
				return x;
			}
		}
	}
}
