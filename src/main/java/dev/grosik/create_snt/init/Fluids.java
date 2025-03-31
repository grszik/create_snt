package dev.grosik.create_snt.init;

import dev.grosik.create_snt.CreateSNT;
import dev.grosik.create_snt.base.FluidContainer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Fluids {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateSNT.MODID);
    public static final DeferredRegister<net.minecraft.world.level.material.Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.Keys.FLUIDS, CreateSNT.MODID);

    public static final FluidContainer APPLE_SYRUP = new FluidContainer("apple_syrup", FluidType.Properties.create().canSwim(false).canDrown(true).canPushEntity(true).supportsBoating(false).density(200000), () -> FluidContainer.createExtension(new FluidContainer.ClientExtensions(CreateSNT.MODID, "apple_syrup").overlay(null).tint(0xFF7C2B).still("apple_syrup_still").flowing("apple_syrup_flow").overlay("apple_syrup_still")), BlockBehaviour.Properties.copy(Blocks.WATER));
}
