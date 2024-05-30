package dansavagegames.astraea.module.movement;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

import static net.minecraftforge.fml.common.gameevent.TickEvent.Phase.END;

public class Jetpack extends Module {

    public Jetpack(){
        super("AirJump", Category.Movement);
        description = "As the name says, it functions like a Jetpack";
        key = Keyboard.KEY_L;
    }

    @SubscribeEvent
    public void onEnable(TickEvent.ClientTickEvent event){
        super.onEnable();
        if(event.phase == END && Keyboard.isKeyDown(Keyboard.KEY_SPACE) && toggled) {
            mc.thePlayer.jump();
        }
    }

    @Override
    public void onDisable(){
        super.onDisable();
    }
}
