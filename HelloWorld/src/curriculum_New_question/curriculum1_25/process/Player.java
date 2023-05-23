package curriculum_New_question.curriculum1_25.process;
import java.util.Random;

// サブクラス
public class Player extends Status{
	// ランダムな数字を生成
	public int Random() {
		Random random = new Random();
		int rand = random.nextInt(1000)+1;
		return rand;
	}
	
	// サブクラスのコンストラクタ
	public Player() {
		this.setHp(this.Random());
		this.setMp(this.Random());
		this.setAttack(this.Random());
		this.setSpeed(this.Random());
		this.setDefense(this.Random());
	}
}