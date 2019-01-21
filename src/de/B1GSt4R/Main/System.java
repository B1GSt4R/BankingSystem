package de.B1GSt4R.Main;

import java.util.HashMap;

import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class System extends JavaPlugin implements Listener {
	
	public Server SERVER = this.getServer();
	public ConsoleCommandSender CONSOLE = SERVER.getConsoleSender();
	
	public String name = this.getDescription().getName();
	public String version = this.getDescription().getVersion();
	public String authors = this.getDescription().getAuthors().get(0);
	public String website = this.getDescription().getWebsite();
	
	public String prefix = "§7[§6Banking§7] §8>> §7";
	public String strich = "§5§m---------------§7§m[ §6CoinBanking §7§m]§5§m---------------";
	
	public HashMap<String, Integer> $ = new HashMap<>();
	
	@Override
	public void onEnable(){
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage(strich);
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage("§fPlugin Name: §6"+name);
		CONSOLE.sendMessage("§fPlugin Version: §6"+version);
		CONSOLE.sendMessage("§fPlugin Authors: §6"+authors);
		CONSOLE.sendMessage("§fPlugin website: §6"+website);
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage("§fPlugin Status: §2§lONLINE");
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage("§fFeatures: §6");
		CONSOLE.sendMessage("§6MySQL Connection");
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage(strich);
		CONSOLE.sendMessage(" ");
		
		new de.B1GSt4R.Events.NPCInteractionEvent(this);
		new de.B1GSt4R.Events.InvClickEvent(this);
		
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable(){
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage(strich);
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage("§fPlugin Name: §6"+name);
		CONSOLE.sendMessage("§fPlugin Version: §6"+version);
		CONSOLE.sendMessage("§fPlugin Authors: §6"+authors);
		CONSOLE.sendMessage("§fPlugin website: §6"+website);
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage("§fPlugin Status: §4§lOFFLINE");
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage("§fFeatures: §6");
		CONSOLE.sendMessage("§6MySQL Connection");
		CONSOLE.sendMessage(" ");
		CONSOLE.sendMessage(strich);
		CONSOLE.sendMessage(" ");
	}
}
