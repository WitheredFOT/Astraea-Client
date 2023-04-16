package dansavagegames.astraea;

import java.util.concurrent.CopyOnWriteArrayList;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Info.MODID, name = Info.NAME, version = Info.VERSION) 
public class Astraea {
	
	public static Minecraft mc = Minecraft.getMinecraft();

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("AstraeaAddons is now up for use!");
	}

}