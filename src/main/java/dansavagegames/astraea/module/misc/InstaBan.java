package dansavagegames.astraea.module.misc;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

import java.util.Iterator;

import static dansavagegames.astraea.utils.ClientUtils.*;

public class InstaBan extends Module {

    public InstaBan() {
        super("Instaban", Category.Misc);
        description = "For people who want a break from Hypixel Skyblock";
        blatant = true; cheat = true;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        for (Iterator<Entity> entities = mc.theWorld.loadedEntityList.iterator(); entities.hasNext(); ) {
            Object nextEntity = entities.next();
            EntityLivingBase entity = (EntityLivingBase) nextEntity;
            if (entityExistsBase() && entityExistsSP() && entity.isEntityAlive() && entity.canEntityBeSeen(entity)) {
                mc.playerController.attackEntity(mc.thePlayer, entity);
                mc.thePlayer.swingItem();
            }
        }
    }
}