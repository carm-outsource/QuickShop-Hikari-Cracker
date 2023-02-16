package cc.carm.plugin.quickshopcracker;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onLoad() {
        System.setProperty("com.ghostchu.quickshop.util.envcheck.EnvironmentChecker.skip.LEGAL_COMPLIANCE_CHECK", "true");
    }

}
