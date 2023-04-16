package dansavagegames.astraea.modules;

import java.util.ArrayList;

public class Module {
	
	public int keyCode;
	public boolean toggled = false;
	public String description;
	public final String moduleName;
	public final ModuleCategory moduleCategory;
	
	public Module(String n, ModuleCategory mC, String d, int k) {
		this.moduleName = n;
		this.moduleCategory = mC;
		this.description = d;
		this.keyCode = k;
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public ModuleCategory moduleCategory() {
		return this.moduleCategory;
	}
	
	public enum ModuleCategory {
		combat,
		movement,
		render,
		player,
		skyblock,
		scripts,
		miscellaneous;
	}

}
