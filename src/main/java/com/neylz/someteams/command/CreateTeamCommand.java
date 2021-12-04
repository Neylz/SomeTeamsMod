package com.neylz.someteams.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.neylz.someteams.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.command.TeamCommand;
import net.minecraft.text.LiteralText;

import static com.neylz.someteams.SomeTeams.LOGGER;

public class CreateTeamCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        LiteralCommandNode<ServerCommandSource> register = dispatcher.register(CommandManager.literal("steams")
                .then(CommandManager.literal("new")
                        .executes( (c) -> run(
                                c.getSource(),
                                c.getSource().getServer().getCommandManager(),
                                c.getSource().getName()
                        ))));
    }

    public static int run(ServerCommandSource source, CommandManager commandManager, String player_name) throws CommandSyntaxException {


        commandManager.execute(source, "say POURQUOI CA MARCHE PAS ????");




        LOGGER.info("command !");
        return 1;
    }
}