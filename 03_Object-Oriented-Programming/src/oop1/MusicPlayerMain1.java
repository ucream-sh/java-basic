package oop1;

public class MusicPlayerMain1 {
	public static void main(String[] args) {
		// 절차 지향 음악 플레이어 1
		// 절차에 맞춰서 순서대로 프로그램이 단순하게 돌아간다.

		int volume = 0;
		boolean isOn = false;

		// 음악 플레이어 켜기
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");

		// 볼륨 증가
		volume++;
		System.out.println("음악 플레이어 볼륨: " + volume);
		// 볼륨 증가
		volume++;
		System.out.println("음악 플레이어 볼륨: " + volume);
		// 볼륨 감소
		volume--;
		System.out.println("음악 플레이어 볼륨: " + volume);

		// 음악 플레이어 상태
		System.out.println("음악 플레이어 상태 확인");
		if (isOn) {
			System.out.println("음악 플레이어 ON, 볼륨: " + volume);
		} else {
			System.out.println("음악 플레이어 OFF");
		}

		// 음악 플레이어 끄기
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");

//		음악 플레이어를 시작합니다.
//		음악 플레이어 볼륨: 1
//		음악 플레이어 볼륨: 2
//		음악 플레이어 볼륨: 1
//		음악 플레이어 상태 확인
//		음악 플레이어 ON, 볼륨: 1
//		음악 플레이어를 종료합니다.
	}

}
