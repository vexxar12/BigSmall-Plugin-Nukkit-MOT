package com.example.myplugin;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.Player;
import cn.nukkit.utils.TextFormat;

public final class Main extends PluginBase {
    @Override
    public void onEnable() {
        this.getLogger().info("Плагин запущен");
    }
    @Override
    public void onDisable() {
        this.getLogger().info("Плагин отключен");
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(command.getName().equalsIgnoreCase("big")) {
            player.setScale(4.0f);
            player.sendMessage(TextFormat.LIGHT_PURPLE + "Вы успешно стали большим!");
            return true;
        }
        if(command.getName().equalsIgnoreCase("small")) {
            player.setScale(0.3f);
            player.sendMessage(TextFormat.LIGHT_PURPLE + "Вы успешно стали маленьким!");
            return true;
        }
        return false;
    }
}