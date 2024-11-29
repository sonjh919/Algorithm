import java.util.*;

public class Main {
	public static ArrayList<Integer>[] g;
	public static long[] arr;
	public static void main(String[] args) throws Exception {
		int N = readInt();
		g = new ArrayList[N + 1];
		arr = new long[N + 1];
		for (int i = 0; i <= N; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 1; i < N; i++) {
			int u = readInt();
			int v = readInt();
			g[u].add(v);
			g[v].add(u);
		}
		
		for (int i = 1; i <= N; i++) {
			arr[i] = readLong();
		}
		long res = dfs(1,1).score;
		if(res < 0) {
			System.out.println("Cheolmin");
		} else if(res == 0) {
			System.out.println("Draw");
		} else {
			System.out.println("Sehun");
		}
	}
	
	public static Pos dfs(int v , int parents) {
		Pos res = new Pos(arr[v] , 1);
		ArrayList<Long> odd = new ArrayList<>();
		ArrayList<Long> even = new ArrayList<>();

		for (int i = 0; i < g[v].size(); i++) {
			int next = g[v].get(i);
			if(next != parents) {
				Pos p = dfs(next , v);
				res.isEven += p.isEven;
				if(p.isEven == 0) {
					even.add(p.score);
				} else {
					odd.add(p.score);
				}
			}
		}
		
		if(even.isEmpty() && odd.isEmpty()) {
			return res;
		}
		
		Collections.sort(even , Comparator.reverseOrder());
		Collections.sort(odd , Comparator.reverseOrder());

		int evenCnt = 0;
		int evenMax = even.size();
		int oddMax = odd.size();
		while(evenCnt < evenMax && even.get(evenCnt) > 0) {
			res.score -= even.get(evenCnt++);
		}
		
		for (int i = 0; i < oddMax; i++) {
			if((i & 1) == 0) {
				res.score -= odd.get(i);
			} else {
				res.score += odd.get(i);
			}
		}
		
		if((oddMax & 1) == 0) {
			while(evenCnt < evenMax) {
				res.score -= even.get(evenCnt++);
			}
		} else {
			while(evenCnt < evenMax) {
				res.score += even.get(evenCnt++);
			}
		}
		
		res.isEven &= 1;
		return res;
	}
	
	public static int readInt() throws Exception {
		int val = 0;
		int c = System.in.read();
		while (c <= ' ') {
			c = System.in.read();
		}
		boolean flag = (c == '-');
		if (flag)
			c = System.in.read();
		do {
			val = 10 * val + c - 48;
		} while ((c = System.in.read()) >= 48 && c <= 57);

		if (flag)
			return -val;
		return val;
	}

	public static long readLong() throws Exception {
		long val = 0;
		long c = System.in.read();
		while (c <= ' ') {
			c = System.in.read();
		}
		boolean flag = (c == '-');
		if (flag)
			c = System.in.read();
		do {
			val = 10 * val + c - 48;
		} while ((c = System.in.read()) >= 48 && c <= 57);

		if (flag)
			return -val;
		return val;
	}
}

class Pos{
	long score;
	int isEven;
	public Pos(long score, int isEven) {
		this.score = score;
		this.isEven = isEven;
	}
}