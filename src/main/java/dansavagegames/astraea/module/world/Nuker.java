package dansavagegames.astraea.module.world;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;

public class Nuker extends Module {

    public Nuker(){
        super("Nuker", Category.World);
        description = "Destroys blocks near the player";
        blatant = true; cheat = true;
    }

    public void onEnable(){

    }

    public void onDisable(){

    }
}
