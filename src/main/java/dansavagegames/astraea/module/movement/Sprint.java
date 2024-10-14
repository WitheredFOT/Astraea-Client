package dansavagegames.astraea.module.movement;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class Sprint extends Module {

    public Sprint(){
        super("Sprint", Category.Movement);
        description = "Automatically sprints for you";
    }

    @SubscribeEvent
    public void onEnable(TickEvent.ClientTickEvent event){
        super.onEnable();
        if(event.phase == TickEvent.Phase.END && mc.thePlayer.movementInput.moveForward > 0 && isPlayerInWorld() && toggled){
            mc.thePlayer.setSprinting(true);
        }
    }

    @Override
    public void onDisable(){
        super.onDisable();
    }
}
