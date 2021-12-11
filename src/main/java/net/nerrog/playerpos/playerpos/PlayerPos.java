package net.nerrog.playerpos.playerpos;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class PlayerPos extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0)return false;
        Player P = Bukkit.getPlayer(args[0]);
        if (P == null){
            sender.sendMessage("指定されたプレイヤーが見つかりません。");
            return false;
        }
        World W = P.getWorld();
        Location loc = P.getLocation();
        sender.sendMessage(
                P.getName()+"は" +
                "\nワールド: "+W.getName()+
                "\n座標: " +
                "X:"+ (int)loc.getX() +
                "Y:"+ (int)loc.getY() +
                "Z:"+ (int)loc.getZ() +
                "\nにいます:)"
        );
        return true;
    }
}
