package ir.yzn.size;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	@Override
	 public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		// Form Window size UI
		FormWindowSimple scale = new FormWindowSimple("Scale", "please select your size want");
		scale.addButton(new ElementButton("scale x 1"));
		scale.addButton(new ElementButton("scale x 2"));
		scale.addButton(new ElementButton("scale x 3"));
		scale.addButton(new ElementButton("scale x 4"));
		scale.addButton(new ElementButton("scale x 5"));
		scale.addButton(new ElementButton("scale x 6"));
		scale.addButton(new ElementButton("scale x 7"));
		scale.addButton(new ElementButton("scale x 8"));
		scale.addButton(new ElementButton("scale x 9"));
		scale.addButton(new ElementButton("scale x 10"));
		Player p = (Player) sender;
		switch (command.getName().toLowerCase()) {
		case "scale":
			if(!(sender instanceof Player)) {
				sender.sendMessage("you can using this command in game !");
				return false;
			}
			if(!(p.hasPermission("scale.change"))) {
				p.sendMessage("you dont have permission for usig this command !");
				return false;
			}
			
			p.showFormWindow(scale);
		}
		return true;
	}
	@EventHandler
    public void onResponse(PlayerFormRespondedEvent event) {
        Player player = event.getPlayer();

        if (!(event.getWindow() instanceof FormWindowSimple)) return;
        FormWindowSimple fw = (FormWindowSimple) event.getWindow();
        if (fw.getTitle().equals("Scale")) {
            if(fw.getResponse().getClickedButton().getText().equals("scale x 1")) {
            	player.setScale(1);
            }
            if(fw.getResponse().getClickedButton().getText().equals("scale x 2")) {
            	player.setScale(2);
            }
            if(fw.getResponse().getClickedButton().getText().equals("scale x 3")) {
            	player.setScale(3);
            }
            if(fw.getResponse().getClickedButton().getText().equals("scale x 4")) {
            	player.setScale(4);
            }
            if(fw.getResponse().getClickedButton().getText().equals("scale x 5")) {
            	player.setScale(5);
            }
            if(fw.getResponse().getClickedButton().getText().equals("scale x 6")) {
            	player.setScale(6);
            }
            if(fw.getResponse().getClickedButton().getText().equals("scale x 7")) {
            	player.setScale(7);
            }
            if(fw.getResponse().getClickedButton().getText().equals("scale x 8")) {
            	player.setScale(8);
            }
            if(fw.getResponse().getClickedButton().getText().equals("scale x 9")) {
            	player.setScale(9);
            }
            if(fw.getResponse().getClickedButton().getText().equals("scale x 10")) {
            	player.setScale(10);
            }
        }
    }
}

