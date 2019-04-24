package cn.sx.xa.bqq.hqz.yjg.second.material;

import cn.sx.xa.bqq.hqz.yjg.second.biscuit.Biscuit;
import cn.sx.xa.bqq.hqz.yjg.second.biscuit.XiAnBiscuit;
//抽象工厂2 单利模式  懒汉
public class XianBiscuitFactory implements Material,BiscuitFactory{
	
	private static XianBiscuitFactory onlyXian = new XianBiscuitFactory();
	
	private String type;
	
	private static String AREA = "西安"; 
	
	@Override
	public String getRawMaterial() {
		
		return type;
	}

	public String getArea() {
		
		return AREA;
	}

	private XianBiscuitFactory() {
	}
	public static XianBiscuitFactory getInstance(String type){
		onlyXian.type = type;
		return onlyXian;
	}
	//这是抽象工厂方法的实现
	public XiAnBiscuit creatXianBiscuit(String type){
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

		return new XiAnBiscuit(material,AREA);
	}
	//这个方法是抽象工厂的

	@Override
	public Biscuit creatBiscuit(String type) {
		// TODO Auto-generated method stub
		return creatXianBiscuit(type);
	}
	
}
