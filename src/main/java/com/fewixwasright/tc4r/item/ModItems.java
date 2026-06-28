package com.fewixwasright.tc4r.item;

import com.fewixwasright.tc4r.ThaumCraft4Rekindled;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ThaumCraft4Rekindled.MODID);

    public static final DeferredItem<Item> THAUMIUM = ITEMS.register("thaumium_ingot", () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);



    }






}
