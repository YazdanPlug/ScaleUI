package ir.yzn.size;

import cn.nukkit.event.EventHandler;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.window.FormWindow;
import cn.nukkit.Player;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.Plugin;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)this);
    }
    
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final FormWindowSimple scale = new FormWindowSimple("Scale", "please select your size want");
        scale.addButton(new ElementButton("Big scales"));
        scale.addButton(new ElementButton("Small scales"));
        final Player p = (Player)sender;
        final String lowerCase;
        switch (lowerCase = command.getName().toLowerCase()) {
            case "scale": {
                if (!(sender instanceof Player)) {
                    sender.sendMessage("you can using this command in game !");
                    return false;
                }
                if (!p.hasPermission("scale.change")) {
                    p.sendMessage("you dont have permission for usig this command !");
                    return false;
                }
                p.showFormWindow((FormWindow)scale);
                break;
            }
            default:
                break;
        }
        return true;
    }
    
    @EventHandler
    public void onResponse(final PlayerFormRespondedEvent event) {
        final Player player = event.getPlayer();
        final FormWindowSimple small = new FormWindowSimple("Scale small", "change small sizes");
        small.addButton(new ElementButton("scale x 0.1"));
        small.addButton(new ElementButton("scale x 0.2"));
        small.addButton(new ElementButton("scale x 0.3"));
        small.addButton(new ElementButton("scale x 0.4"));
        small.addButton(new ElementButton("scale x 0.5"));
        small.addButton(new ElementButton("scale x 0.6"));
        small.addButton(new ElementButton("scale x 0.7"));
        small.addButton(new ElementButton("scale x 0.8"));
        small.addButton(new ElementButton("scale x 0.9"));
        small.addButton(new ElementButton("scale x 0.10"));
        final FormWindowSimple big = new FormWindowSimple("Scale big", "change big sizes");
        big.addButton(new ElementButton("scale x 1"));
        big.addButton(new ElementButton("scale x 2"));
        big.addButton(new ElementButton("scale x 3"));
        big.addButton(new ElementButton("scale x 4"));
        big.addButton(new ElementButton("scale x 5"));
        big.addButton(new ElementButton("scale x 6"));
        big.addButton(new ElementButton("scale x 7"));
        big.addButton(new ElementButton("scale x 8"));
        big.addButton(new ElementButton("scale x 9"));
        big.addButton(new ElementButton("scale x 10"));
        final FormWindowSimple fw = (FormWindowSimple)event.getWindow();
        if (fw.getTitle().equals("Scale")) {
            if (fw.getResponse().getClickedButton().getText().equals("Big scales")) {
                player.showFormWindow((FormWindow)big);
            }
            if (fw.getResponse().getClickedButton().getText().equals("Small scales")) {
                player.showFormWindow((FormWindow)small);
            }
        }
        else if (fw.getTitle().equals("Scale big")) {
            if (fw.getResponse().getClickedButton().getText().equals("scale x 1")) {
                player.setScale(1.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 1");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 2")) {
                player.setScale(2.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 2");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 3")) {
                player.setScale(3.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 3");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 4")) {
                player.setScale(4.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 4");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 5")) {
                player.setScale(5.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 5");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 6")) {
                player.setScale(6.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 6");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 7")) {
                player.setScale(7.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 7");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 8")) {
                player.setScale(8.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 8");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 9")) {
                player.setScale(9.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 9");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 10")) {
                player.setScale(10.0f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 10");
            }
        }
        else if (fw.getTitle().equals("Scale small")) {
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.1")) {
                player.setScale(0.1f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 0/1");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.2")) {
                player.setScale(0.2f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 0.2");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.3")) {
                player.setScale(0.3f);
                player.sendMessage(TextFormat.AQUA + "scale x 0.1");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.4")) {
                player.setScale(0.4f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 0.4");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.5")) {
                player.setScale(0.5f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 0.5");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.6")) {
                player.setScale(0.6f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 0.6");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.7")) {
                player.setScale(0.7f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 0.7");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.8")) {
                player.setScale(0.8f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 0.8");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.9")) {
                player.setScale(0.9f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 0.9");
            }
            if (fw.getResponse().getClickedButton().getText().equals("scale x 0.01")) {
                player.setScale(0.01f);
                player.sendMessage(TextFormat.AQUA + "Your size is set to 0.01");
            }
        }
    }
}
