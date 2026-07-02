package com.fewixwasright.tc4r.item;

import com.fewixwasright.tc4r.ThaumCraft4Rekindled;
import com.fewixwasright.tc4r.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeModeTabsTC {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThaumCraft4Rekindled.MODID);

    public static final Supplier<CreativeModeTab> TC_ITEMS_TAB = CREATIVE_MODE_TAB.register("tc_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOGGLES.get()))
                    .title(Component.translatable("creativetab.tc4r.tc_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.THAUMIUM);
                        output.accept(ModItems.GOGGLES);
                        output.accept(ModItems.PRIMAL_CHARM);
                        output.accept(ModItems.ENCHANTED_FABRIC);
                        output.accept(ModItems.THAUMONOMICON);
                        output.accept(ModItems.AMBER);
                        output.accept(ModItems.ALUMENTUM);
                    }).build());

    public static final Supplier<CreativeModeTab> TC_BLOCKS_TAB = CREATIVE_MODE_TAB.register("tc_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.THAUMIUM_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThaumCraft4Rekindled.MODID, "tc_items_tab"))
                    .title(Component.translatable("creativetab.tc4r.tc_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.THAUMIUM_BLOCK);
                        output.accept(ModBlocks.AMBER_ORE);
                        output.accept(ModBlocks.AMBER_BRICKS);
                        output.accept(ModBlocks.CINNABAR_ORE);
                        output.accept(ModBlocks.FLESH_BLOCK);
                        output.accept(ModBlocks.GREATWOOD_LEAVES);
                        output.accept(ModBlocks.GREATWOOD_PLANKS);
                        output.accept(ModBlocks.SILVERWOOD_LEAVES);
                        output.accept(ModBlocks.SILVERWOOD_PLANKS);
                        output.accept(ModBlocks.RESEARCH_TABLE);
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
