package curriculum_New_question.curriculum_1_30;

class Person{
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// BMI
	public double bmi() {
		double bmi = weight / (height * height);
		return bmi;
	}

	// コンソール出力
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + (String.format("%.1f",this.bmi())) + "です");
		System.out.println("合計○人です");
	}
}