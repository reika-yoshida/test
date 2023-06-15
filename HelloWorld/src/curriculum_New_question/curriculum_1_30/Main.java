package curriculum_New_question.curriculum_1_30;

class Main {
	public static void main(String[] args) {
		// 問題5：Main.javaの引数にweightの60を入れてください
		Person person = new Person("鈴木太郎", 20, 1.7,60);

		// print呼び出し
		person.print();
		// 問題10：人数の合計を「合計○人です」と出力してください。
		System.out.println("合計" + person.num + "人です");
	}
}