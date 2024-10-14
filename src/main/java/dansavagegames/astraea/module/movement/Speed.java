package dansavagegames.astraea.module.movement;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class Speed extends Module {

    private double lastMoveSpeed;

    public Speed() {
        super("Speed", Category.Movement);
        description = "Makes you move faster";
        blatant = true; cheat = true;
    }

    @SubscribeEvent
    public void onEnable() {
        super.onEnable();
        if(isPlayerInWorld() && toggled){

        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}