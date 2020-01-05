package chap9;

interface RemoteControl {

	void turnOn();

	void turnOff();

	default void setMute(boolean state) {
		if (state) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음을 해제합니다.");
		}
	}

	void setVolume(int Volume);

	static void ChangeBattery() {
		System.out.println("배터리를 교체합니다.");
	}

}

class Audio implements RemoteControl {
	int setVolume;

	Audio() {
	}

	@Override
	public void turnOn() {
		System.out.println("오디오의 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오 전원을 끕니다.");

	}

	@Override
	public void setVolume(int Volume) {
		System.out.println("볼륨은 " + Volume + "입니다.");
	}

}

class Television implements RemoteControl {

	int setVolume;

	Television() {
	}

	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");

	}

	@Override
	public void setVolume(int Volume) {
		System.out.println("볼륨은 " + Volume + "입니다.");

	}

}

public class problem3 {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn(); // TV를 켭니다.1
		rc.setVolume(10); // TV 볼륨을 10으로 설정합니다.
		rc.turnOff(); // TV를 끕니다.
		rc.setMute(true); // 무음을 해제합니다.
		rc = new Audio();
		rc.turnOn(); // Audio를 켭니다.
		rc.setVolume(20); // Audio의 볼륨을 20으로 설정합니다.
		rc.turnOff(); // Audio를 끕니다.
		rc.setMute(false); // 무음을 해제합니다.
		RemoteControl.ChangeBattery(); // 건전지를 교환합니다.

	}

}
