package curriculum_New_question.curriculum_1_31;

class Main {
	public static void main(String[] args) {
		// Personクラスをインスタンス化し変数を代入
		Person person1 = new Person("鈴木", "太郎");
		Person person2 = new Person("山田", "花子");

		// Carクラスをインスタンス化し変数を代入
		Car car = new Car();
		// Bicycleクラスをインスタンス化し変数を代入
		Bicycle bicycle = new Bicycle();

		// 問題4：MainクラスからsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定します。
		// 問題4：Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。
		//ownerを設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());
		
		// 問題5：セットできたら、ownerをコンソールに出力してください。
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		// 問題10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。
		person1.buy(car);
		person2.buy(bicycle);
	}
}
