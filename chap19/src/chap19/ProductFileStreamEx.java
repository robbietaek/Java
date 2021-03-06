package chap19;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Car {
	private int month;
	private int con;
	private String car;
	private int qty;
	private String remark;

	public Car(int month, int con, String car, int qty, String remark) {
		super();
		this.month = month;
		this.con = con;
		this.car = car;
		this.qty = qty;
		this.remark = remark;
	}

	public int getMonth() {
		return month;
	}

	public int getCon() {
		return con;
	}

	public String getCar() {
		return car;
	}

	public int getQty() {
		return qty;
	}

	public String getRemark() {
		return remark;
	}

//	@Override
//	public String toString() {
//		return "Car [month=" + month + ", con=" + con + ", car=" + car + ", qty=" + qty + ", remark=" + remark + "]";
//	}

	
}

public class ProductFileStreamEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		// 월별 판매 수량을 Map 객체로 생성하기
		Map<Integer, Long> map = br.lines().map(s -> {
			String[] str = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			} catch (ArrayIndexOutOfBoundsException e) {
				temp = "";
			}
			return new Car(Integer.parseInt(str[0]), Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]), temp);
		}).filter(s -> s.getCon() == 2)
				.collect(Collectors.groupingBy(Car::getMonth, Collectors.summingLong(Car::getQty)));
		System.out.println(map);

//		BufferedReader br2 = new BufferedReader(new FileReader("product.txt"));
//		//반품개수 구하기
//		Map<Integer,Long> map2 = br2.lines().map(s -> {
//			String[] str = s.split(",");
//			String temp = "";
//			try {
//				temp = str[4];
//			} catch (ArrayIndexOutOfBoundsException e) {
//				temp = "";
//			}
//			return new Car(Integer.parseInt(str[0]), Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]), temp);
//		}).filter(s -> s.getCon() == 3)
//				.collect(Collectors.groupingBy(Car::getMonth, Collectors.summingLong(Car::getQty)));
//		
//		System.out.println(map2);
	}
}
