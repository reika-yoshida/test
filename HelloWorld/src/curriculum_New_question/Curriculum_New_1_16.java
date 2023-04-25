package curriculum_New_question;

public class Curriculum_New_1_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。
		char a = 'A';
		System.out.println(a);
		// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
		String s = "Hello Java";
		System.out.println(s);
		// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。
		int c = 3776;
		System.out.println(c);
		// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
		float d = 3.14f;
		System.out.println(d);
		// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。
		int[] nums = {10,100,1000};
		System.out.println(nums[0]);
		// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。
		int[] b = nums;
		b[0] = 8;
		System.out.println(nums[0]);
		System.out.println(b[0]);
	}

}
