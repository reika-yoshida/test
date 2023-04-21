package curriculum_New_question;

public class Curriculum_New_1_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		string型の配列を作成し、アルファベットa～jまでを格納してください。
		//		brake文を使用し、a～dまで表示してください。
		//	
		//		 出力結果：a
		//		           b
		//		           c
		//		           d
		//		          
		//		cotinue文を使用し、i以外を表示してください。
		//	
		//		 出力結果：a
		//		           b
		//		           c
		//		           d
		//		           e
		//		           f
		//		           g
		//		           h
		//		           j
		
		// String型配列へ格納
		String s[] = {"a","b","c","d","e","f","g","h","i","j"};
		// break文
		for(int i = 0;i<s.length;i++) {
			System.out.println(s[i]);
			if(i == 3) {
				System.out.println("");
				break;
			}
		}
		
		// iを代入
		String str = "i";
		// continue文
		for(int i = 0;i<s.length;i++) {
			if(s[i].equals(str)) {
				continue;
			}
			System.out.println(s[i]);
		}
	}

}
