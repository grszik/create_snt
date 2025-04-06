package dev.grosik.create_snt.init;

import dev.grosik.create_snt.CreateSNT;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.util.Supplier;

import java.util.ArrayList;
import java.util.List;

public class Blocks {
    public static final BlockSetType chocolate = new BlockSetType("chocolate");
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateSNT.MODID);
    public static List<RegistryObject<Item>> BLOCK_ITEMS = new ArrayList<>();

    public static final RegistryObject<Block> BLUE_ROCK_CANDY_BLOCK = registerBlockOnly("blue_rock_candy_block", BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.STONE).mapColor(MapColor.COLOR_BLUE).strength(1.5f));
    public static final RegistryObject<Item> BLUE_ROCK_CANDY = Items.registerBlockItem(BLUE_ROCK_CANDY_BLOCK, "blue_rock_candy_block");
    public static final RegistryObject<Block> BLUE_ROCK_CANDY_BRICKS = registerBlock("blue_rock_candy_bricks", MapColor.COLOR_BLUE);

    public static final RegistryObject<Block> CHISELED_BLUE_ROCK_CANDY_BLOCK = registerBlock("chiseled_blue_rock_candy_block", MapColor.COLOR_BLUE);
    public static final RegistryObject<Block> CHISELED_CHOCOLATE = registerBlock("chiseled_chocolate", MapColor.WOOD); // Adjust color if needed
    public static final RegistryObject<Block> CHISELED_CHOCOLATE_BRICKS = registerBlock("chiseled_chocolate_bricks", MapColor.WOOD); // Adjust color if needed
    public static final RegistryObject<Block> CHISELED_GREEN_ROCK_CANDY_BLOCK = registerBlock("chiseled_green_rock_candy_block", MapColor.COLOR_GREEN);
    public static final RegistryObject<Block> CHISELED_ORANGE_ROCK_CANDY_BLOCK = registerBlock("chiseled_orange_rock_candy_block", MapColor.COLOR_ORANGE);
    public static final RegistryObject<Block> CHISELED_PINK_ROCK_CANDY_BLOCK = registerBlock("chiseled_pink_rock_candy_block", MapColor.COLOR_PINK);
    public static final RegistryObject<Block> CHISELED_PURPLE_ROCK_CANDY_BLOCK = registerBlock("chiseled_purple_rock_candy_block", MapColor.COLOR_PURPLE);
    public static final RegistryObject<Block> CHISELED_RED_ROCK_CANDY_BLOCK = registerBlock("chiseled_red_rock_candy_block", MapColor.COLOR_RED);
    public static final RegistryObject<Block> CHISELED_YELLOW_ROCK_CANDY_BLOCK = registerBlock("chiseled_yellow_rock_candy_block", MapColor.COLOR_YELLOW);
    public static final RegistryObject<Block> CHOCOLATE_COLUMN = registerAxisBlock("chocolate_column", MapColor.WOOD); // Adjust color if needed
    public static final RegistryObject<Block> CHOCOLATE_DOOR = registerItemOnly("chocolate_door", BLOCKS.register("chocolate_door", () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5f).noOcclusion(), BlockSetType.OAK)));
    public static final RegistryObject<Block> CHOCOLATE_TRAPDOOR = registerItemOnly("chocolate_trapdoor",BLOCKS.register("chocolate_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5f).noOcclusion().isValidSpawn((state, getter, pos, type) -> false), new BlockSetType("chocolate"))));
    public static final RegistryObject<Block> GREEN_ROCK_CANDY_BLOCK = registerBlock("green_rock_candy_block", MapColor.COLOR_GREEN);
    public static final RegistryObject<Block> GREEN_ROCK_CANDY_BRICKS = registerBlock("green_rock_candy_bricks", MapColor.COLOR_GREEN);
    public static final RegistryObject<Block> ORANGE_ROCK_CANDY_BLOCK = registerBlock("orange_rock_candy_block", MapColor.COLOR_ORANGE);
    public static final RegistryObject<Block> ORANGE_ROCK_CANDY_BRICKS = registerBlock("orange_rock_candy_bricks", MapColor.COLOR_ORANGE);
    public static final RegistryObject<Block> PINK_ROCK_CANDY_BLOCK = registerBlock("pink_rock_candy_block", MapColor.COLOR_PINK);
    public static final RegistryObject<Block> PINK_ROCK_CANDY_BRICKS = registerBlock("pink_rock_candy_bricks", MapColor.COLOR_PINK);
    public static final RegistryObject<Block> POLISHED_BLUE_ROCK_CANDY_BLOCK = registerBlock("polished_blue_rock_candy_block", MapColor.COLOR_BLUE);
    public static final RegistryObject<Block> POLISHED_CHOCOLATE = registerBlock("polished_chocolate", MapColor.WOOD); // Adjust color if needed
    public static final RegistryObject<Block> POLISHED_GREEN_ROCK_CANDY_BLOCK = registerBlock("polished_green_rock_candy_block", MapColor.COLOR_GREEN);
    public static final RegistryObject<Block> POLISHED_ORANGE_ROCK_CANDY_BLOCK = registerBlock("polished_orange_rock_candy_block", MapColor.COLOR_ORANGE);
    public static final RegistryObject<Block> POLISHED_PINK_ROCK_CANDY_BLOCK = registerBlock("polished_pink_rock_candy_block", MapColor.COLOR_PINK);
    public static final RegistryObject<Block> POLISHED_PURPLE_ROCK_CANDY_BLOCK = registerBlock("polished_purple_rock_candy_block", MapColor.COLOR_PURPLE);
    public static final RegistryObject<Block> POLISHED_RED_ROCK_CANDY_BLOCK = registerBlock("polished_red_rock_candy_block", MapColor.COLOR_RED);
    public static final RegistryObject<Block> POLISHED_YELLOW_ROCK_CANDY_BLOCK = registerBlock("polished_yellow_rock_candy_block", MapColor.COLOR_YELLOW);
    public static final RegistryObject<Block> PURPLE_ROCK_CANDY_BLOCK = registerBlock("purple_rock_candy_block", MapColor.COLOR_PURPLE);
    public static final RegistryObject<Block> PURPLE_ROCK_CANDY_BRICKS = registerBlock("purple_rock_candy_bricks", MapColor.COLOR_PURPLE);
    public static final RegistryObject<Block> RED_ROCK_CANDY_BLOCK = registerBlock("red_rock_candy_block", MapColor.COLOR_RED);
    public static final RegistryObject<Block> RED_ROCK_CANDY_BRICKS = registerBlock("red_rock_candy_bricks", MapColor.COLOR_RED);
    public static final RegistryObject<Block> SMOOTH_CHOCOLATE = registerBlock("smooth_chocolate", MapColor.WOOD); // Adjust color if needed
    public static final RegistryObject<Block> YELLOW_ROCK_CANDY_BLOCK = registerBlock("yellow_rock_candy_block", MapColor.COLOR_YELLOW);
    public static final RegistryObject<Block> YELLOW_ROCK_CANDY_BRICKS = registerBlock("yellow_rock_candy_bricks", MapColor.COLOR_YELLOW);

    public static RegistryObject<Block> registerBlock(String name, MapColor color) {
        return registerBlock(name, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.STONE).mapColor(color).strength(1.5f));
    }
    public static RegistryObject<Block> registerBlock(String name, BlockBehaviour.Properties properties) {
        RegistryObject<Block> block = registerBlockOnly(name, properties);
        BLOCK_ITEMS.add(Items.registerBlockItem(block, name));
        return block;
    }

    public static RegistryObject<Block> registerBlockOnly(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name, () -> new Block(properties));
    }
    public static RegistryObject<Block> registerAxisBlock(String name, MapColor color) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(color).strength(1.5f)));
        BLOCK_ITEMS.add(Items.registerBlockItem(block, name));
        return block;
    }
    public static RegistryObject<Block> registerItemOnly(String name, RegistryObject<Block> block) {
        BLOCK_ITEMS.add(Items.registerBlockItem(block, name));
        return block;
    }
}
