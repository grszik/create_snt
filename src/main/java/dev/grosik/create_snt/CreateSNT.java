package dev.grosik.create_snt;

import dev.grosik.create_snt.init.Blocks;
import dev.grosik.create_snt.init.CreativeTab;
import dev.grosik.create_snt.init.Fluids;
import dev.grosik.create_snt.init.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateSNT.MODID)
public class CreateSNT {
    public static final String MODID = "create_snt";

    public CreateSNT() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.ITEMS.register(bus);
        CreativeTab.TABS.register(bus);
        Blocks.BLOCKS.register(bus);
        Fluids.FLUID_TYPES.register(bus);
        Fluids.FLUIDS.register(bus);
    }
}
