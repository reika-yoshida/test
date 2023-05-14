package curriculum_New_question.curriculum1_23;

import java.util.Objects;

public class Process {
	// カプセル化　Strign型でrionを宣言
	private String rion;
	// カプセル化　float型でheightを宣言
	private float height;
	// カプセル化　int型でspeedを宣言
	private int speed;
	
	Process (String rion,float height,int speed){
		// rionを定義
		this.rion = rion;
		// heightを定義
		this.height = height;
		// speedを定義
		this.speed = speed;
	}
	
	// rionフィールドのgetterを定義
	public String getRion() {
		return this.rion;
	}
	// rionフィールドのsetterを定義
	public void setRion(String rion) {
		this.rion = rion;
	}
	
	// heightフィールドのgetterを定義
	public float getHeight() {
		return this.height;
	}
	// heightフィールドのsetterを定義
	public void setHeight(float height) {
		this.height = height;
	}
	
	// speedフィールドのgetterを定義
	public int getSpeed() {
		return this.speed;
	}
	// speedフィールドのgetterを定義
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// null判定
	public String rion() {
		if(Objects.isNull(rion)) {
			System.out.println("Erro");
		}
		if(Objects.nonNull(rion)){
			return this.rion;
		}
		return rion;
	}
		
	public void priDate() {
		// Rionを出力
		System.out.println("動物名：" + this.getRion());
		// Heightを出力
		System.out.println("体長：" + this.getHeight() + "m");
		// Speedを出力
		System.out.println("速度：" + this.getSpeed() + "km/h");
	}

}
