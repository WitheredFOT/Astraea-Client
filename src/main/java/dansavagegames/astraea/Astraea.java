package dansavagegames.astraea;

import dansavagegames.astraea.module.ModuleManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(
        modid = "AstraeaAddons",
        name = "AstraeaAddons",
        version = "b0.1",
        useMetadata = true
)

public class Astraea {

    public static EventBus evb = MinecraftForge.EVENT_BUS;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        evb.register(new ModuleManager());
        evb.register(this);
    }

    // Error Phone Library + Checker Framework
}
