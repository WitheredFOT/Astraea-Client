package dansavagegames.astraea.module;

import dansavagegames.astraea.module.movement.*;
import dansavagegames.astraea.module.render.HUD;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.List;

import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class ModuleManager {

    public static List<Module> modules = new ArrayList<Module>();

    public ModuleManager(){
        // Movement
        modules.add(new AirJump());
        modules.add(new Flight());
        modules.add(new Jetpack());
        modules.add(new NoFall());
        modules.add(new Sprint());

        // Render
        modules.add(new HUD());
    }

    public String getName() {
        for (Module m : modules) {
            return m.getName();
        }
        return null;
    }

    public String getArrayListModules(){
        for(Module m : modules) {
            if(m.isEnabled() && m.visible){
                return m.getName();
            }
        }
        return null;
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event){
        if (event.phase == TickEvent.Phase.END && isPlayerInWorld()) {
            for (Module m : modules) {
                if (Keyboard.isKeyDown(m.getKey()) && m.canBeEnabled){
                    m.toggle();
                    m.canBeEnabled = false;
                } if (!Keyboard.isKeyDown(m.getKey()) && !m.canBeEnabled) m.canBeEnabled = true;
            }
        }
    }
}