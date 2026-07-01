package com.fewixwasright.tc4r.block;

import com.fewixwasright.tc4r.ThaumCraft4Rekindled;
import com.fewixwasright.tc4r.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ThaumCraft4Rekindled.MODID);

    public static final DeferredBlock<Block> THAUMIUM_BLOCK = registerBlock("thaumium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .destroyTime(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
            ));

    public static final DeferredBlock<Block> AMBER_BRICKS = registerBlock("amber_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .destroyTime(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.SHROOMLIGHT)
            ));

    public static final DeferredBlock<Block> AMBER_ORE = registerBlock("amber_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .destroyTime(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));

    public static final DeferredBlock<Block> CINNABAR_ORE = registerBlock("cinnabar_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .destroyTime(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));

    public static final DeferredBlock<Block> FLESH_BLOCK = registerBlock("flesh_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .destroyTime(3f)
                    .sound(SoundType.SLIME_BLOCK)
            ));

    public static final DeferredBlock<Block> GREATWOOD_LEAVES = registerBlock("greatwood_leaves",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .destroyTime(2f)
                    .sound(SoundType.AZALEA_LEAVES)
            ));

    public static final DeferredBlock<Block> GREATWOOD_PLANKS = registerBlock("greatwood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .destroyTime(2f)
                    .sound(SoundType.WOOD)
            ));

    public static final DeferredBlock<Block> SILVERWOOD_LEAVES = registerBlock("silverwood_leaves",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .destroyTime(2f)
                    .sound(SoundType.AZALEA_LEAVES)
            ));

    public static final DeferredBlock<Block> SILVERWOOD_PLANKS = registerBlock("silverwood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .destroyTime(2f)
                    .sound(SoundType.WOOD)
            ));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
