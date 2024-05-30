package dansavagegames.astraea.module.movement;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module {

    public Sprint(){
        super("Sprint", Category.Movement);
        description = "Automatically sprints for you";
        key = Keyboard.KEY_Z;
    }

    @SubscribeEvent
    public void onEnable(TickEvent.ClientTickEvent event){
        super.onEnable();
        if(event.phase == TickEvent.Phase.END && mc.thePlayer.movementInput.moveForward > 0 && toggled){
            mc.thePlayer.setSprinting(true);
        }
    }

    @Override
    public void onDisable(){
        super.onDisable();
    }
}
