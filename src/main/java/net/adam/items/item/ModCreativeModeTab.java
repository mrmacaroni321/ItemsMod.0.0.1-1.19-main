package net.adam.items.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab INGOTS = new CreativeModeTab("Ingots") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MITHRIL.get());
        }
    };
}
