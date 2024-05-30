package dansavagegames.astraea.module.movement;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class Flight extends Module {

    float velocity = 3;

    public Flight(){
        super("Flight", Category.Movement);
        description = "Allows you to Fly";
        key = Keyboard.KEY_R;
    }

    @SubscribeEvent
    public void onEnable(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END && toggled){
            mc.thePlayer.capabilities.isFlying = true;
        }
    }

    @Override
    public void onDisable(){
        mc.thePlayer.capabilities.isFlying = false;
    }

}
