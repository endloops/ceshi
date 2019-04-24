package cn.sx.xa.bqq.hqz.yjg.third.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import cn.sx.xa.bqq.hqz.yjg.third.MeunItem;

public class PancakeHouseMenuIterator implements Iterator<MeunItem>{

	ArrayList<MeunItem> meunItem;
	
	int position = 0;
	@Override
	public boolean hasNext() {
		
		if(position>=meunItem.size()){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public MeunItem next() {
		MeunItem houseMenu = meunItem.get(position);
		position++;
		return houseMenu;
	}

	public PancakeHouseMenuIterator(ArrayList<MeunItem> meunItem) {
		super();
		this.meunItem = meunItem;
	}

	
}
