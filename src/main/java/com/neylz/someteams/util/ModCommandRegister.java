package com.neylz.someteams.util;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import com.neylz.someteams.command.JoinTeamCommand;
import com.neylz.someteams.command.CreateTeamCommand;


public class ModCommandRegister {
    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(JoinTeamCommand::register);
        CommandRegistrationCallback.EVENT.register(CreateTeamCommand::register);
    }
}
