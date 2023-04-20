package curriculum_New_question;

public class Curriculum_New_1_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		問題．switch文を使用し、以下のプログラムを作成してください。
				変数に数値を代入
				
			①2の場合は、「（変数）月は28日です。」
				出力結果：2月は28日です。
			
			②4，6，9，11の場合は、「（変数）月は30日です。」
				出力例：4月は30日です。
				
			③その他の場合は、「（変数）月は31日です。」
				出力例：1月は31日です。
	*/
		int month = 2;
		
		switch (month) {
		case 2:
			System.out.println(month + "月は28日です。");
			break;
		case 4,6,9,11:
			System.out.println(month + "月は30日です。");
			break;
		default:
			System.out.println(month + "月は31日です。");
		}
	}

}
