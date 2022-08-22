package fr.diskmth.template;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public void onEnable()
    {
        getLogger().info(ChatColor.GREEN + "Enable Spigot Template");

        getCommand("hello").setExecutor(new HelloCommand());
    }

    @Override
    public void onDisable()
    {
        getLogger().info(ChatColor.RED + "Disable Spigot Template");
    }
}
