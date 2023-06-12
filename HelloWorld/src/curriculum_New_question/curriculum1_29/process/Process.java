package curriculum_New_question.curriculum1_29.process;

public class Process {
	
	// name.town.numを定義
	private String name;
	private String town;
	private int num;
	
	public Process(String name,String town,int num) {
		this.name = name;
		this.town = town;
		this.num = num;
	}
	
	// コンソール表示
	public void date() {
		System.out.println("都道府県名：" + name);
		System.out.println("県庁所在地：" + town);
		System.out.println("面積：" + num + ".0km2");
		System.out.println("");
		
		return;
	}
}