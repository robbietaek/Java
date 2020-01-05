package chap9;

interface RemoteControl {

	void turnOn();

	void turnOff();

	default void setMute(boolean state) {
		if (state) {
			System.out.println("����ó���մϴ�.");
		} else {
			System.out.println("������ �����մϴ�.");
		}
	}

	void setVolume(int Volume);

	static void ChangeBattery() {
		System.out.println("���͸��� ��ü�մϴ�.");
	}

}

class Audio implements RemoteControl {
	int setVolume;

	Audio() {
	}

	@Override
	public void turnOn() {
		System.out.println("������� ������ �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("����� ������ ���ϴ�.");

	}

	@Override
	public void setVolume(int Volume) {
		System.out.println("������ " + Volume + "�Դϴ�.");
	}

}

class Television implements RemoteControl {

	int setVolume;

	Television() {
	}

	@Override
	public void turnOn() {
		System.out.println("TV ������ �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV ������ ���ϴ�.");

	}

	@Override
	public void setVolume(int Volume) {
		System.out.println("������ " + Volume + "�Դϴ�.");

	}

}

public class problem3 {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn(); // TV�� �մϴ�.1
		rc.setVolume(10); // TV ������ 10���� �����մϴ�.
		rc.turnOff(); // TV�� ���ϴ�.
		rc.setMute(true); // ������ �����մϴ�.
		rc = new Audio();
		rc.turnOn(); // Audio�� �մϴ�.
		rc.setVolume(20); // Audio�� ������ 20���� �����մϴ�.
		rc.turnOff(); // Audio�� ���ϴ�.
		rc.setMute(false); // ������ �����մϴ�.
		RemoteControl.ChangeBattery(); // �������� ��ȯ�մϴ�.

	}

}
