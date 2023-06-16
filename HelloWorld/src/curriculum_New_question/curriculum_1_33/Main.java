package curriculum_New_question.curriculum_1_33;

class Main{
	public static void main(String[] args){
		// Personクラスをインスタンス化し変数を代入
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// print呼び出し
		person1.print();

		// Personクラスをインスタンス化し変数を代入
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// print呼び出し
		person2.print();

		// 合計人数
		Person.printCount();
	}
}