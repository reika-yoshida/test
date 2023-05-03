package curriculum_New_question;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1呼び出し
		hello();
		// Q2呼び出し
		calculate(1,2);
		// Q3呼び出し
		// 引数として整数の配列を渡す
		int[] num = {1,2,3};
		test(num);
		// Q4呼び出し
		calculate(1.1,1.2);
		// Q5呼び出し
		// 引数に整数を渡す
		int count = 5;
		int[] numbers = rndNumbers(count);
		// Q6呼び出し
		// 引数にQ5の戻り値を代入
		int[] total = rndNumbers(count);
		average(total);	
		// Q7呼びだし
		// 引数にQ6の戻り値を代入
		double total2 = average(total);
		// 条件
		if(cc(total2)) {
			// 受け取った値が50以上ならばtrue
			System.out.println("true");
		}else {
			// それ以外はfalseを返しコンソールに出力
			System.out.println("false");
		}
	}
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	// Q1のメソッド
	public static void hello() {
		// コンソールに出力する値を代入
		String s = "Hello JavaSE ";
		int i = 11;
		// コンソールに出力
		System.out.println(s + i);
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	// Q2のメソッド
	public static void calculate(int x,int y) {
		// 引数に整数を渡すと渡した値同士を乗算
		int ans = x*y;
		// コンソールに出力
		System.out.println(ans);
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	// Q3のメソッド
	public static void test(int[] num) {
		// 受け取った値を順番にコンソールに出力
		for(int num2 : num) {
			System.out.println(num2);	
		}
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	// Q4のメソッド
	public static void calculate(double x,double y) {
		// 引数同士を和算
		double ans = x+y;
		// 結果をコンソール出力
		System.out.println(ans);
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	// Q5のメソッド
	public static int[] rndNumbers(int count) {
		// 引数に整数を代入
		int[] numbers = new int [count];
		// 1〜100までのランダムな数字を作成・格納
		Random rand = new Random();
		int score = rand.nextInt(100)+1;
		
		for(int j = 0;j < count;j++) {	
			// 引数の回数分格納
			numbers[j] = score;
			// 格納した値を順番にコンソールで出力		
			System.out.println(score+j);
		}
		// 格納した値を返す
		return numbers;
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	// Q6のメソッド
	public static double average(int[] total) {
		// 戻り値の合計を出す
		int num = Arrays.stream(total).sum();
		// 平均を定義
		double bb = num / total.length;
		// コンソールに出力
		System.out.println("");
		System.out.println(bb);
		// 平均値を返す
		return bb;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	// Q7のメソッド
	public static boolean cc(double total2) {
		// 条件の定義
		return total2 >= 50;
	}
}