package de.B1GSt4R.Events;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class InvClickEvent implements Listener {
	private de.B1GSt4R.Main.System plugin;
	public InvClickEvent(de.B1GSt4R.Main.System System) {
		this.plugin = System;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onInvClick(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		
		if(e.getInventory().getName().contains("§6CoinBanking §7-> §5Abheben")){
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§61$ <- 1 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 1);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().addItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§65$ <- 5 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 5);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().addItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§610$ <- 10 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 10);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().addItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§616$ <- 16 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 16);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().addItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§632$ <- 32 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 32);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().addItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§648$ <- 48 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 48);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().addItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§664$ <- 64 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 64);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().addItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6max$ <- max Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 0);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().addItem(gold);
			}
		}
		
		if(e.getInventory().getName().contains("§6CoinBanking §7-> §2Einzahlen")){
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§61$ -> 1 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 1);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().removeItem(gold);
				
				if(plugin.$.containsKey(p.getName())){
					int i = plugin.$.get(p.getName());
					i = i+1;
					plugin.$.remove(p.getName());
					plugin.$.put(p.getName(), i);
				}else{
					plugin.$.put(p.getName(), 1);
				}
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§65$ -> 5 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 5);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().removeItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§610$ -> 10 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 10);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().removeItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§616$ -> 16 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 16);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().removeItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§632$ -> 32 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 32);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().removeItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§648$ -> 48 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 48);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().removeItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§664$ -> 64 Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 64);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().removeItem(gold);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6max$ -> max Nugget")){
				
				ItemStack gold = new ItemStack(Material.GOLD_NUGGET, 0);
				ItemMeta goldMeta = gold.getItemMeta();
				gold.setItemMeta(goldMeta);
				p.getInventory().removeItem(gold);
			}
		}
		
		if(e.getInventory().getName().contains("§6CoinBanking §7-> §2Einzahlen") || e.getInventory().getName().contains("§6CoinBanking §7-> §5Abheben")){
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§4Zurück")){
				p.closeInventory();
				Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
					@Override
					public void run() {
						Inventory inv = Bukkit.createInventory(null, 27, "§6CoinBanking");
						
						ItemStack leer = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
						ItemMeta leerMeta = leer.getItemMeta();
						leerMeta.setDisplayName("§0");
						leer.setItemMeta(leerMeta);
						
						ItemStack close = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
						ItemMeta closeMeta = close.getItemMeta();
						closeMeta.setDisplayName("§4Schließen");
						close.setItemMeta(closeMeta);
						
						ItemStack Deposit = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
						SkullMeta DepositMeta = (SkullMeta) Deposit.getItemMeta();
						DepositMeta.setDisplayName("§2Einzahlen");
						DepositMeta.setOwner("MHF_ArrowUp");
						Deposit.setItemMeta(DepositMeta);
						
						ItemStack Withdraw = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
						SkullMeta WithdrawMeta = (SkullMeta) Withdraw.getItemMeta();
						WithdrawMeta.setDisplayName("§5Abheben");
						WithdrawMeta.setOwner("MHF_ArrowDown");
						Withdraw.setItemMeta(WithdrawMeta);
						
						ItemStack stats = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
						SkullMeta statsMeta = (SkullMeta) stats.getItemMeta();
						statsMeta.setDisplayName("§6Informationen");
						statsMeta.setOwner(p.getName());
						@SuppressWarnings("rawtypes")
						ArrayList stat = new ArrayList<>();
						stat.add("");
						stat.add("§7Guthaben: §60");
						stat.add("§7BarGeld: §60");
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
				},1);
			}
		}
		
		if(e.getInventory().getName().contains("§6CoinBanking")){
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§5Abheben")){
				p.closeInventory();
				Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
					@Override
					public void run() {
						Inventory inv = Bukkit.createInventory(null, 9, "§6CoinBanking §7-> §5Abheben");
						
						ItemStack close = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 1);
						ItemMeta closeMeta = close.getItemMeta();
						closeMeta.setDisplayName("§4Schließen");
						close.setItemMeta(closeMeta);
						
						ItemStack eins = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 2);
						ItemMeta einsMeta = eins.getItemMeta();
						einsMeta.setDisplayName("§61$ <- 1 Nugget");
						eins.setItemMeta(einsMeta);
						
						ItemStack zwei = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3);
						ItemMeta zweiMeta = zwei.getItemMeta();
						zweiMeta.setDisplayName("§65$ <- 5 Nugget");
						zwei.setItemMeta(zweiMeta);
						
						ItemStack drei = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 4);
						ItemMeta dreiMeta = drei.getItemMeta();
						dreiMeta.setDisplayName("§610$ <- 10 Nugget");
						drei.setItemMeta(dreiMeta);
						
						ItemStack vier = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
						ItemMeta vierMeta = vier.getItemMeta();
						vierMeta.setDisplayName("§616$ <- 16 Nugget");
						vier.setItemMeta(vierMeta);
						
						ItemStack fünf = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 6);
						ItemMeta fünfMeta = fünf.getItemMeta();
						fünfMeta.setDisplayName("§632$ <- 32 Nugget");
						fünf.setItemMeta(fünfMeta);
						
						ItemStack sechs = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
						ItemMeta sechsMeta = sechs.getItemMeta();
						sechsMeta.setDisplayName("§648$ <- 48 Nugget");
						sechs.setItemMeta(sechsMeta);
						
						ItemStack sieben = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 8);
						ItemMeta siebenMeta = sieben.getItemMeta();
						siebenMeta.setDisplayName("§664$ <- 64 Nugget");
						sieben.setItemMeta(siebenMeta);
						
						ItemStack acht = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 8);
						ItemMeta achtMeta = acht.getItemMeta();
						achtMeta.setDisplayName("§6max$ <- max Nugget");
						acht.setItemMeta(achtMeta);
						
						ItemStack neun = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 10);
						ItemMeta neunMeta = neun.getItemMeta();
						neunMeta.setDisplayName("§4Zurück");
						neun.setItemMeta(neunMeta);
						
						inv.setItem(0, eins);
						inv.setItem(1, zwei);
						inv.setItem(2, drei);
						inv.setItem(3, vier);
						inv.setItem(4, fünf);
						inv.setItem(5, sechs);
						inv.setItem(6, sieben);
						inv.setItem(7, acht);
						inv.setItem(8, neun);
						
						p.openInventory(inv);
					}
				}, 1);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§2Einzahlen")){
				p.closeInventory();
				Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
					@Override
					public void run() {
						Inventory inv = Bukkit.createInventory(null, 9, "§6CoinBanking §7-> §2Einzahlen");
						
						ItemStack close = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 1);
						ItemMeta closeMeta = close.getItemMeta();
						closeMeta.setDisplayName("§4Schließen");
						close.setItemMeta(closeMeta);
						
						ItemStack eins = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 2);
						ItemMeta einsMeta = eins.getItemMeta();
						einsMeta.setDisplayName("§61$ -> 1 Nugget");
						eins.setItemMeta(einsMeta);
						
						ItemStack zwei = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3);
						ItemMeta zweiMeta = zwei.getItemMeta();
						zweiMeta.setDisplayName("§65$ -> 5 Nugget");
						zwei.setItemMeta(zweiMeta);
						
						ItemStack drei = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 4);
						ItemMeta dreiMeta = drei.getItemMeta();
						dreiMeta.setDisplayName("§610$ -> 10 Nugget");
						drei.setItemMeta(dreiMeta);
						
						ItemStack vier = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
						ItemMeta vierMeta = vier.getItemMeta();
						vierMeta.setDisplayName("§616$ -> 16 Nugget");
						vier.setItemMeta(vierMeta);
						
						ItemStack fünf = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 6);
						ItemMeta fünfMeta = fünf.getItemMeta();
						fünfMeta.setDisplayName("§632$ -> 32 Nugget");
						fünf.setItemMeta(fünfMeta);
						
						ItemStack sechs = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
						ItemMeta sechsMeta = sechs.getItemMeta();
						sechsMeta.setDisplayName("§648$ -> 48 Nugget");
						sechs.setItemMeta(sechsMeta);
						
						ItemStack sieben = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 8);
						ItemMeta siebenMeta = sieben.getItemMeta();
						siebenMeta.setDisplayName("§664$ -> 64 Nugget");
						sieben.setItemMeta(siebenMeta);
						
						ItemStack acht = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 8);
						ItemMeta achtMeta = acht.getItemMeta();
						achtMeta.setDisplayName("§6max$ -> max Nugget");
						acht.setItemMeta(achtMeta);
						
						ItemStack neun = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 10);
						ItemMeta neunMeta = neun.getItemMeta();
						neunMeta.setDisplayName("§4Zurück");
						neun.setItemMeta(neunMeta);
						
						inv.setItem(0, eins);
						inv.setItem(1, zwei);
						inv.setItem(2, drei);
						inv.setItem(3, vier);
						inv.setItem(4, fünf);
						inv.setItem(5, sechs);
						inv.setItem(6, sieben);
						inv.setItem(7, acht);
						inv.setItem(8, neun);
						
						p.openInventory(inv);
					}
				}, 1);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Informationen")){
				p.closeInventory();
				Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
					@Override
					public void run() {
						Inventory inv = Bukkit.createInventory(null, 27, "§6CoinBanking");
						
						ItemStack leer = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
						ItemMeta leerMeta = leer.getItemMeta();
						leerMeta.setDisplayName("§0");
						leer.setItemMeta(leerMeta);
						
						ItemStack close = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
						ItemMeta closeMeta = close.getItemMeta();
						closeMeta.setDisplayName("§4Schließen");
						close.setItemMeta(closeMeta);
						
						ItemStack Deposit = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
						SkullMeta DepositMeta = (SkullMeta) Deposit.getItemMeta();
						DepositMeta.setDisplayName("§2Einzahlen");
						DepositMeta.setOwner("MHF_ArrowUp");
						Deposit.setItemMeta(DepositMeta);
						
						ItemStack Withdraw = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
						SkullMeta WithdrawMeta = (SkullMeta) Withdraw.getItemMeta();
						WithdrawMeta.setDisplayName("§5Abheben");
						WithdrawMeta.setOwner("MHF_ArrowDown");
						Withdraw.setItemMeta(WithdrawMeta);
						
						ItemStack stats = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
						SkullMeta statsMeta = (SkullMeta) stats.getItemMeta();
						statsMeta.setDisplayName("§6Informationen");
						statsMeta.setOwner(p.getName());
						@SuppressWarnings("rawtypes")
						ArrayList stat = new ArrayList<>();
						stat.add("");
						stat.add("§7Guthaben: §60");
						stat.add("§7BarGeld: §60");
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
				}, 1);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§4Schließen")){
				p.closeInventory();
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§0")){
				p.closeInventory();
				Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
					@Override
					public void run() {
						Inventory inv = Bukkit.createInventory(null, 27, "§6CoinBanking");
						
						ItemStack leer = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
						ItemMeta leerMeta = leer.getItemMeta();
						leerMeta.setDisplayName("§0");
						leer.setItemMeta(leerMeta);
						
						ItemStack close = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
						ItemMeta closeMeta = close.getItemMeta();
						closeMeta.setDisplayName("§4Schließen");
						close.setItemMeta(closeMeta);
						
						ItemStack Deposit = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
						SkullMeta DepositMeta = (SkullMeta) Deposit.getItemMeta();
						DepositMeta.setDisplayName("§2Einzahlen");
						DepositMeta.setOwner("MHF_ArrowUp");
						Deposit.setItemMeta(DepositMeta);
						
						ItemStack Withdraw = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
						SkullMeta WithdrawMeta = (SkullMeta) Withdraw.getItemMeta();
						WithdrawMeta.setDisplayName("§5Abheben");
						WithdrawMeta.setOwner("MHF_ArrowDown");
						Withdraw.setItemMeta(WithdrawMeta);
						
						ItemStack stats = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
						SkullMeta statsMeta = (SkullMeta) stats.getItemMeta();
						statsMeta.setDisplayName("§6Informationen");
						statsMeta.setOwner(p.getName());
						@SuppressWarnings("rawtypes")
						ArrayList stat = new ArrayList<>();
						stat.add("");
						stat.add("§7Guthaben: §60");
						stat.add("§7BarGeld: §60");
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
				}, 1);
			}
		}
	}
}
