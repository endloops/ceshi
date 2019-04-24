package cn.sx.xa.bqq.hqz.yjg.third.iterator;
import java.util.Iterator;

import cn.sx.xa.bqq.hqz.yjg.third.MeunItem;

public class DinerMenuIterator implements Iterator<MeunItem>{

	MeunItem[] items;

	int position = 0;

	@Override
	public boolean hasNext() {
		if(position>=items.length){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public MeunItem next() {
		MeunItem item = items[position];
		position++;
		return item;
	}

	public DinerMenuIterator(MeunItem[] items) {
		this.items = items;
	}
	
}
