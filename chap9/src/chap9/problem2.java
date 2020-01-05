package chap9;

/*
 * �Ű������� �������̽������� ����ϴ� ��� = > ����� �ǹ̷� ���� ����
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
			Unit u = (Unit)r; //r ���� �ƹ��͵� �����Ǿ����� �ʴ�. r�� �����ϰ� �ִ� ��ü�� Unit��ü�̴� ��� ���̴�.
			u.hp = u.MAX;
			System.out.println(r + "���� �Ϸ�");
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
