package dansavagegames.astraea.module.movement;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Speed extends Module {

    private double lastMoveSpeed;

    public Speed() {
        super("Speed", Category.Movement);
    }

    @SubscribeEvent
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
