package com.fewixwasright.tc4r.item;

import com.fewixwasright.tc4r.ThaumCraft4Rekindled;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ThaumCraft4Rekindled.MODID);

    //Unidentified Category or MISC
    public static final DeferredItem<Item> PRIMAL_CHARM = ITEMS.register("primal_charm", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BATH_SALT = ITEMS.register("bath_salt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRAIN = ITEMS.register("brain", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BUCKET_OF_LIQUID_DEATH = ITEMS.register("bucket_of_liquid_death", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BUCKET_OF_PURE = ITEMS.register("bucket_of_pure", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMENTUM = ITEMS.register("alumentum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN = ITEMS.register("coin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTAL_ESSENCE = ITEMS.register("crystal_essence", () -> new Item(new Item.Properties()));

    //Cursed af
    public static final DeferredItem<Item> BOTTLED_TAINT = ITEMS.register("bottled_taint", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_RITES = ITEMS.register("crimson_rites", () -> new Item(new Item.Properties()));

    //Crafting Materials
    public static final DeferredItem<Item> ENCHANTED_FABRIC = ITEMS.register("enchanted_fabric", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SALIS_MUNDUS = ITEMS.register("salis_mundus", () -> new Item(new Item.Properties()));

    //Ores
    public static final DeferredItem<Item> THAUMIUM = ITEMS.register("thaumium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CINNABAR_CHUNK = ITEMS.register("cinnabar_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NATIVE_COPPER_CLUSTER = ITEMS.register("native_copper_cluster", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NATIVE_GOLD_CLUSTER = ITEMS.register("native_gold_cluster", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NATIVE_IRON_CLUSTER = ITEMS.register("native_iron_cluster", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NATIVE_CINNABAR_CLUSTER = ITEMS.register("native_cinnabar_cluster", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CINNABAR = ITEMS.register("raw_cinnabar", () -> new Item(new Item.Properties()));

    //Tools, Weapons and Gear
    public static final DeferredItem<Item> GOGGLES = ITEMS.register("goggles", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THAUMONOMICON = ITEMS.register("thaumonomicon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<SwordItem> CRIMSON_BLADE = ITEMS.register("crimson_blade", () -> new SwordItem(Tiers.IRON, new Item.Properties()));
    public static final DeferredItem<Item> AMULET = ITEMS.register("amulet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BELT = ITEMS.register("belt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<BowItem> BONE_BOW = ITEMS.register("bone_bow", () -> new BowItem(new Item.Properties()));
    public static final DeferredItem<Item> TRAVELERS_BOOTS = ITEMS.register("travelers_boots", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_RING = ITEMS.register("iron_ring", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_RING = ITEMS.register("gold_ring", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);



    }






}
