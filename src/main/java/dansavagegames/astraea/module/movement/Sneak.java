package dansavagegames.astraea.module.movement;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class Sneak extends Module {

    static boolean canSneak = true;

    public Sneak(){
        super("Sprint", Category.Movement);
        description = "Automatically sprints for you";
    }

    @SubscribeEvent
    public void onEnable(TickEvent.ClientTickEvent event){
        super.onEnable();
        if(event.phase == TickEvent.Phase.END && isPlayerInWorld() && toggled && canSneak){

            mc.thePlayer.setSneaking(true);
        }
    }

    @Override
    public void onDisable(){
        super.onDisable();
    }
}