package chap9;

/*
 * 매개변수를 인터페이스형으로 사용하는 경우 = > 허용의 의미로 많이 사용됨
 */

interface Repairable{}

class Unit{
	int hp;
	final int MAX;
	Unit(int hp){
		this.hp = hp;
		MAX = hp;
	}
}


class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank() {
		super(150);
	}
	public String toString() {
		return "Tank";
	}
}

class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(125);
	}
	public String toString() {
		return "Dropship";
	}
	
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
	}
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r; //r 에는 아무것도 구현되어있지 않다. r이 참조하고 있는 객체가 Unit객체이다 라는 뜻이다.
			u.hp = u.MAX;
			System.out.println(r + "수리 완료");
		}
	}
	public String toString() {
		return "SCV";
	}
}
public class problem2 {

	public static void main(String[] args) {
	 
		Tank t= new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		s.repair(d);
//		s.repair(m);
		s.repair(s);
		
	}
}
