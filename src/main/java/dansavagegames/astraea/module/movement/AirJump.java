package dansavagegames.astraea.module.movement;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

import static net.minecraftforge.fml.common.gameevent.TickEvent.Phase.END;

public class AirJump extends Module {

    boolean canJump = true;

    public AirJump(){
        super("AirJump", Category.Movement);
        description = "Allows you to jump midair";
        key = Keyboard.KEY_F;
    }

    @SubscribeEvent
    public void onEnable(TickEvent.ClientTickEvent event){
        super.onEnable();
        if(event.phase == END && Keyboard.isKeyDown(Keyboard.KEY_SPACE) && canJump && toggled){
            canJump = false;
            mc.thePlayer.jump();
        } if (!Keyboard.isKeyDown(Keyboard.KEY_SPACE)) canJump = true;
    }

    @Override
    public void onDisable(){
        super.onDisable();
    }
}