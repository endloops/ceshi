package cn.sx.xa.bqq.hqz.yjg.second.material;

import cn.sx.xa.bqq.hqz.yjg.second.biscuit.BeiJingBiscuit;
import cn.sx.xa.bqq.hqz.yjg.second.biscuit.Biscuit;
//抽象工厂源
public interface BiscuitFactory {
	Biscuit creatBiscuit(String type);
}
