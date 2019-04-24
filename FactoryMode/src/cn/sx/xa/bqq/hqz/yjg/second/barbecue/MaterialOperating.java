package cn.sx.xa.bqq.hqz.yjg.second.barbecue;

import cn.sx.xa.bqq.hqz.yjg.second.material.fire.Tool;
//命令执行者
public class MaterialOperating {
	
	private Tool tool;
	
	void useFire(){
		tool.useFire();
	}
	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public MaterialOperating(Tool tool) {
		super();
		this.tool = tool;
	}

	public MaterialOperating() {
		
	}
	
}
