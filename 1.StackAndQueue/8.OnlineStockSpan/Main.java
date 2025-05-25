import java.util.*;


public class Main{
	public static void main(String[] args){
		solution();
	}

	public static void solution(){
		//Write Solution here
		Main outer = new Main();
		StockSpanner st = outer.new StockSpanner();
		int a1 = st.next(100);
		int a2 = st.next(80);
		int a3 = st.next(60);
		int a4 = st.next(70);
		int a5 = st.next(60);
		int a6 = st.next(75);
		int a7 = st.next(85);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
	}

	class StockSpanner {
		private ArrayList<Integer> al;
		private Stack<Integer> st;

		public StockSpanner(){
			al = new ArrayList<>();
			st = new Stack<>();
		}

		public int next(int price){
			int size = al.size();

			while(st.size() > 0 && al.get(st.peek()) <= price){
				st.pop();
			}
                        int ans = 0;
			if(st.size() == 0) ans = size+1;
			else ans = size - st.peek();

			al.add(price);
			st.push(size);
			return ans;
		}
	}
}
