package cn.sx.xa.bqq.hqz.yjg.second.material;

import cn.sx.xa.bqq.hqz.yjg.second.biscuit.BeiJingBiscuit;
import cn.sx.xa.bqq.hqz.yjg.second.biscuit.Biscuit;

//抽象工厂1 //单例模式 饿汉式
public class BeiJingBiscuitFactory implements Material, BiscuitFactory {

	private String type;

	private static String AREA = "北京";

	// volatile 当onlyone被初始化实例的时候，多线程可见正确使用它们。
	private volatile static BeiJingBiscuitFactory onlyone;

	@Override
	public String getRawMaterial() {

		return type;
	}

	public String getArea() {

		return AREA;
	}

	private BeiJingBiscuitFactory(String type) {
		this.type = type;
	}

	// 单例模式
	public static BeiJingBiscuitFactory getInsterance(String type) {
		if (onlyone == null) {
			synchronized (BeiJingBiscuitFactory.class) {
				onlyone = new BeiJingBiscuitFactory(type);
			}
		}
		return onlyone;
	}

	private BeiJingBiscuit creatBeiJingBiscuit(String type) {
		String[] result = type.split(",");
		BasicMaterial material = new BasicMaterial();
		for (int i = 0; i < result.length; i++) {
				if (result[i].equals("大麦")) {
					material = new BigFlourMaterial(material);
				} else if (result[i].equals("小麦")) {
					material = new SmallFlourMaterial(material);
				} else if (result[i].equals("红豆")) {
					material = new RedCornMaterial(material);
				} else if (result[i].equals("黑豆")) {
					material = new BlackCornMaterial(material);
				} else {
					System.out.println("没有货");
			}
		}

		return new BeiJingBiscuit(material,AREA);
	}

	@Override
	public Biscuit creatBiscuit(String type) {
		// TODO Auto-generated method stub
		return creatBeiJingBiscuit(type);
	}
}
