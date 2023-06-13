package curriculum_New_question.curriculum_1_30;

class Main {
	public static void main(String[] args) {
		Person person = new Person("鈴木太郎", 20, 1.7,60);

		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.height);
		System.out.println("");

		// print呼び出し
		person.print();
	}
}