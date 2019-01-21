package de.B1GSt4R.Events;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class NPCInteractionEvent implements Listener {
	private de.B1GSt4R.Main.System plugin;
	public NPCInteractionEvent(de.B1GSt4R.Main.System System) {
		this.plugin = System;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onInteract(PlayerInteractAtEntityEvent e){
		Player p = e.getPlayer();
		Player target = (Player) e.getRightClicked();
		
		//if(target.getLocation().getBlockX() == x && target.getLocation().getBlockY() == y && target.getLocation().getBlockZ() == z){
			if(target.getName().equalsIgnoreCase("B‰nker")){
				Inventory inv = Bukkit.createInventory(null, 27, "ß6CoinBanking");
				
				ItemStack leer = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
				ItemMeta leerMeta = leer.getItemMeta();
				leerMeta.setDisplayName("ß0");
				leer.setItemMeta(leerMeta);
				
				ItemStack close = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
				ItemMeta closeMeta = close.getItemMeta();
				closeMeta.setDisplayName("ß4Schlieﬂen");
				close.setItemMeta(closeMeta);
				
				ItemStack Deposit = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
				SkullMeta DepositMeta = (SkullMeta) Deposit.getItemMeta();
				DepositMeta.setDisplayName("ß2Einzahlen");
				DepositMeta.setOwner("MHF_ArrowUp");
				Deposit.setItemMeta(DepositMeta);
				
				ItemStack Withdraw = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
				SkullMeta WithdrawMeta = (SkullMeta) Withdraw.getItemMeta();
				WithdrawMeta.setDisplayName("ß5Abheben");
				WithdrawMeta.setOwner("MHF_ArrowDown");
				Withdraw.setItemMeta(WithdrawMeta);
				
				ItemStack stats = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
				SkullMeta statsMeta = (SkullMeta) stats.getItemMeta();
				statsMeta.setDisplayName("ß6Informationen");
				statsMeta.setOwner(p.getName());
				@SuppressWarnings("rawtypes")
				ArrayList stat = new ArrayList<>();
				stat.add("");
				int G = plugin.$.get(p.getName()); // <--- irgendwo nen Fehler
				stat.add("ß7Guthaben: ß6"+G);
				stat.add("ß7BarGeld: ß60");
				statsMeta.setLore(stat);
				stats.setItemMeta(statsMeta);
				
				inv.setItem(10, Deposit);
				inv.setItem(13, stats);
				inv.setItem(16, Withdraw);
				inv.setItem(26, close);
				
				inv.setItem(0, leer);
				inv.setItem(1, leer);
				inv.setItem(2, leer);
				inv.setItem(3, leer);
				inv.setItem(4, leer);
				inv.setItem(5, leer);
				inv.setItem(6, leer);
				inv.setItem(7, leer);
				inv.setItem(8, leer);
				
				inv.setItem(9, leer);
				inv.setItem(11, leer);
				inv.setItem(12, leer);
				inv.setItem(14, leer);
				inv.setItem(15, leer);
				inv.setItem(17, leer);
				
				inv.setItem(18, leer);
				inv.setItem(19, leer);
				inv.setItem(20, leer);
				inv.setItem(21, leer);
				inv.setItem(22, leer);
				inv.setItem(23, leer);
				inv.setItem(24, leer);
				inv.setItem(25, leer);
				
				p.openInventory(inv);
			}
		//}
	}
	
}
