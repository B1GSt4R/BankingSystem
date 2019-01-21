package de.B1GSt4R.MySQL;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class MySQLFile {
	private de.B1GSt4R.Main.System plugin;
	public void setStandart(){
		FileConfiguration cfg = getFileConfiguration();
		
		cfg.options().copyDefaults(true);
		
		cfg.addDefault("host", "localhost");
		cfg.addDefault("port", "3306");
		cfg.addDefault("dbname", "CoinBankink");
		cfg.addDefault("username", "B1GSt4R");
		cfg.addDefault("password", "YourPassword");
	}
	private File getFile(){
		return new File("plugins/"+plugin.name);
	}
	
	private FileConfiguration getFileConfiguration(){
		return YamlConfiguration.loadConfiguration(getFile());
	}
	public void readData(){
		FileConfiguration cfg = getFileConfiguration();
		MySQL.host = cfg.getString("host");
		MySQL.port = cfg.getString("port");
		MySQL.dbname = cfg.getString("dbname");
		MySQL.username = cfg.getString("username");
		MySQL.pw = cfg.getString("password");
	}
}
