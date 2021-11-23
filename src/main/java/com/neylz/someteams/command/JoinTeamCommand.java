package com.neylz.someteams.command;


import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.argument.MessageArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;

import static com.mojang.brigadier.arguments.StringArgumentType.getString;
import static com.mojang.brigadier.arguments.StringArgumentType.word;
import static net.minecraft.server.command.CommandManager.literal;
import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.*;
import static com.neylz.someteams.SomeTeams.LOGGER;


public class JoinTeamCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(CommandManager.literal("steams")
                .then(CommandManager.literal("join").executes(JoinTeamCommand::run)));
    }

    public static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        LOGGER.info("Hello Fabric world!");
        return 1;
    }
}
