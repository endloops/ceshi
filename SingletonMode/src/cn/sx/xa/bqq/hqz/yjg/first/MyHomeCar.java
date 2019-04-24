package cn.sx.xa.bqq.hqz.yjg.first;

public class MyHomeCar {

	private String name;

	private String color;

	private volatile static MyHomeCar mycar;

	private MyHomeCar() {
	}

	public static MyHomeCar getCar(String name, String color) {
		if (mycar == null) {
			synchronized (MyHomeCar.class) {
				mycar = new MyHomeCar();
				mycar.color = color;
				mycar.name = name;
			}
		}
		return mycar;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}
}
