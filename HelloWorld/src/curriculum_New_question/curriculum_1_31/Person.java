package curriculum_New_question.curriculum_1_31;

class Person{
	// インスタンスフィールドを定義
	public String firstName;
	public String lastName;

	// コンストラクタを定義
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// fullName
	public String fullName(){
		return this.firstName + this.lastName;
	}

	// コンソール出力
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
	}
	
	// 問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	public void buy(Car car) {
		// 問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
		car.setOwner(this.fullName());
		// 問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	// 問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
