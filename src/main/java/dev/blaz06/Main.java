package dev.blaz06;

import org.bukkit.plugin.PluginLoadOrder;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.command.Command;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.LoadOrder;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@Plugin(name = "plugin_but_i_have_no_idea_what_it_does_yet", version = "0.0.0")
@Description("A test plugin")
@LoadOrder(PluginLoadOrder.POSTWORLD)
@Author("blaz06")
@Commands(@Command(name = "yes", desc = "yes", usage = "/<command>"))
@ApiVersion(ApiVersion.Target.v1_20)

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        PluginLogger logger = new PluginLogger(this);
        logger.info("yes");
    }

    @Override
    public void onDisable() {

    }
}