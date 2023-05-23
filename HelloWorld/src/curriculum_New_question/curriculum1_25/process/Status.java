package curriculum_New_question.curriculum1_25.process;

// スーパークラス
public class Status {
	// カプセル化int型で宣言
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;
	
	// getter(HP)
	public  int getHp() {
		return this.hp;
	}
	
	// getter(MP)
	public int getMp() {
		return this.mp;
	}
	
	// getter(攻撃力）
	public int getAttack() {
		return this.attack;
	}
	
	// getter(素早さ）
	public int getSpeed() {
		return this.speed;
	}
	
	// getter(防御力）
	public int getDefense() {
		return this.defense;
	}
	
	// setter（HP)
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// setter(MP)
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	// setter(攻撃力）
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	// setter(素早さ）
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// setter(防御力）
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	// 出力
	public void priDate(Player player) {
		System.out.println("ステータス");
		System.out.println("HP:" + player.getHp());
		System.out.println("MP:" + player.getMp());
		System.out.println("攻撃力:" + player.getAttack());
		System.out.println("素早さ:" + player.getSpeed());
		System.out.println("防御力:" + player.getDefense());
		System.out.println("さあ冒険に出かけよう！");		
	}
}
