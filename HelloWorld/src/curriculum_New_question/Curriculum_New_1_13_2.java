package curriculum_New_question;

public class Curriculum_New_1_13_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		①配列aを作成し、1～5を格納してください。
		
		②参照型配列bを作成し、3を表示してください。
			出力結果：3
			
		③配列a[3]を10で上書きし表示してください。
			出力結果：10
			
		④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
			出力結果：配列aの要素数は、５です。
	*/
		// 配列の格納
		int a[] = {1,2,3,4,5};
		// 参照型配列作成
		int b[] = a;
		System.out.println(b[2]);
		// 配列の上書き
		a[3] = 10;
		System.out.println(a[3]);
		// 配列の要素数表示
		int num = a.length;
		System.out.println("配列aの要素数は," + num + "です。");
	}

}
