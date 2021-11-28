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
import net.minecraft.text.LiteralText;

import static com.neylz.someteams.SomeTeams.LOGGER;

public class CreateTeamCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        LiteralCommandNode<ServerCommandSource> register = dispatcher.register(CommandManager.literal("steams")
                .then(CommandManager.literal("new").executes(CreateTeamCommand::run)));
    }

    public static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        IEntityDataSaver player = (IEntityDataSaver)context.getSource().getPlayer();

        CommandManager commandManager = context.getSource().getServer().getCommandManager();
        ServerCommandSource serverCommandSource = context.getSource();
        commandManager.execute(serverCommandSource, "say a");


        LOGGER.info("new team!" + context.getInput());
        return 1;
    }
}