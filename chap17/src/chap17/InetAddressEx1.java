package chap17;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.naver.co.kr");
		System.out.println("getByName 메서드 호출");
		System.out.println("hostname : "+ ip.getHostName());
		System.out.println("hostaddress : " + ip.getHostAddress());
		InetAddress[] ips = InetAddress.getAllByName("www.naver.co.kr");
		System.out.println("getAllByName 메서드 호출");
		for(InetAddress i : ips) {
			System.out.println("ip 주소" + i);
		}
		System.out.println("getLocalHost 메서드 호출");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터 : " +  local);
	}
}
