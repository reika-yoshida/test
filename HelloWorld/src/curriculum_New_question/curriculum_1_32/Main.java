package curriculum_New_question.curriculum_1_32;

class Main{
	public static void main(String[] argos){
		// Personクラスをインスタンス化し変数を代入
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// print呼び出し
		person1.print();
		
		// 問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。
		System.out.println("合計" + Person.count + "人です");

		// Personクラスをインスタンス化し変数を歳入
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		
		// 問題6：クラスメソッド「printCount」を呼び出してください
		person1.printCount();
	}
}