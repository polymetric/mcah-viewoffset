package net.nodium.mcmods.viewoffset;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ViewOffsetMod implements ModInitializer {
	private static KeyBinding toggleOffset;
	public static boolean offsetEnabled = true;

    @Override
    public void onInitialize() {
		toggleOffset = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"key.viewoffset.toggle",
				InputUtil.Type.KEYSYM,
				GLFW.GLFW_KEY_U,
				"category.viewoffset"
		));

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (toggleOffset.wasPressed()) {

			}
		});
    }
}
