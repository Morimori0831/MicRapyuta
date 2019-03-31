package morimori0831.micrapyuta;

import org.bukkit.plugin.java.JavaPlugin;

public class MicRapyuta extends JavaPlugin {

	/**
	 * Plugin起動時
	 */
	@Override
	public void onEnable(){
		getLogger().info("マイクラピュタ・システム起動...");
	}

	/**
	 * Plugin停止時
	 */
	@Override
	public void onDisable(){
		getLogger().info("...マイクラピュタ・システム終了");
	}
}
