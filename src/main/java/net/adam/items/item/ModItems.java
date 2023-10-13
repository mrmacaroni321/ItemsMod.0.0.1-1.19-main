package net.adam.items.item;

import net.adam.items.Items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Items.MOD_ID);

    public static final RegistryObject<Item> MITHRIL = ITEMS.register("mithril",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INGOTS)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INGOTS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
