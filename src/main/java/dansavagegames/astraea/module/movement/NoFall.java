package dansavagegames.astraea.module.movement;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

import static dansavagegames.astraea.utils.ClientUtils.willTakeFallDamage;
import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class NoFall extends Module {

    public NoFall(){
        super("NoFall", Category.Movement);
        description = "Attempts to make you not take fall damage";
        cheat = true;
    }

    @SubscribeEvent
    public void onEnable(TickEvent.ClientTickEvent event){
        super.onEnable();
        if(willTakeFallDamage() && event.phase == TickEvent.Phase.END && isPlayerInWorld() && toggled){
            mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
        }
    }

    @Override
    public void onDisable(){
        super.onDisable();
    }

}