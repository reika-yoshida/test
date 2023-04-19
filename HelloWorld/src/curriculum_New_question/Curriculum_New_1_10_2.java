package curriculum_New_question;

public class Curriculum_New_1_10_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*	
		問題.for文を使用して九九の計算を出力してください。
			※出力例 	1×1=1 1×2=2…1×9=9
						2×1=2 2×2=4…2×9=18
								・
								・
								・
						9×1=9 9×2=18…9×9=81
		 */
		//　1~9を格納
		int num[] = {1,2,3,4,5,6,7,8,9};
		//掛け算ループ表示
		for(int i =0;i < num.length;i++) {
			for(int j = 0;j <num.length;j++) {
				int kuku = num[i]*num[j];
				System.out.println(num[i] + "×" + num[j] + "=" + kuku);
			}
		}
	}

}
