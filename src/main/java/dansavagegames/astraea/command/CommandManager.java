package dansavagegames.astraea.command;

import dansavagegames.astraea.command.commands.openModGui;
import net.minecraft.command.CommandBase;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    public static List<CommandBase> commands = new ArrayList<>();

    public CommandManager() {
        commands.add(new openModGui());
    }
}