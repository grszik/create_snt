package dev.grosik.create_snt.init;

import dev.grosik.create_snt.CreateSNT;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateSNT.MODID);

    // Donuts
    public static final RegistryObject<Item> DONUT_PAN = registerItem("donut_pan", new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> FILLED_DONUT_PAN = registerItem("filled_donut_pan", new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.COMMON));

    public static final RegistryObject<Item> DONUT = registerItem("donut", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(1/6f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> APPLE_DONUT = registerItem("apple_donut", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(1/3f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> SWEET_DONUT = registerItem("sweet_donut", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(1/6f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> HONEY_DONUT = registerItem("honey_donut", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(1/6f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> CHOCOLATE_DONUT = registerItem("chocolate_donut", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(1/6f)
                    .build())
            .rarity(Rarity.COMMON));

    // Muffins

    public static final RegistryObject<Item> MUFFIN_PAN = registerItem("muffin_pan", new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> FILLED_MUFFIN_PAN = registerItem("filled_muffin_pan", new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.COMMON));

    public static final RegistryObject<Item> MUFFIN = registerItem("muffin", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationMod(0.5f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> APPLE_MUFFIN = registerItem("apple_muffin", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationMod(1f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> SWEET_MUFFIN = registerItem("sweet_muffin", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationMod(0.5f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> HONEY_MUFFIN = registerItem("honey_muffin", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationMod(0.5f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> CHOCOLATE_MUFFIN = registerItem("chocolate_muffin", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationMod(0.5f)
                    .build())
            .rarity(Rarity.COMMON));

    // Pies

    public static final RegistryObject<Item> CAKE_PAN = registerItem("cake_pan", new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> FILLED_CAKE_PAN = registerItem("filled_cake_pan", new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.COMMON));

    public static final RegistryObject<Item> PIE = registerItem("pie", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(1.4f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> APPLE_PIE = registerItem("apple_pie", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(2.8f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> SWEET_PIE = registerItem("sweet_pie", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(1.4f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> HONEY_PIE = registerItem("honey_pie", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(1.4f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> CHOCOLATE_PIE = registerItem("chocolate_pie", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(1.4f)
                    .build())
            .rarity(Rarity.COMMON));

    // Cinder

    public static final RegistryObject<Item> CINDER_DOUGH = registerItem("cinder_dough", new Item.Properties()
            .stacksTo(64)
            .rarity(Rarity.COMMON));

    public static final RegistryObject<Item> CINDER_BREAD = registerItem("cinder_bread", new Item.Properties()
            .stacksTo(64)
            .food(new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationMod(1.5f)
                    .build())
            .rarity(Rarity.COMMON));

    public static final RegistryObject<Item> CINDER_ROLL = registerItem("cinder_roll", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationMod(0.5f)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120*20, 0), 1f)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 30*20, 1), 0.9f)
                    .build())
            .rarity(Rarity.UNCOMMON));

    // Gunpowder Cake

    public static final RegistryObject<Item> GUNPOWDER_CAKE = registerItem("gunpowder_cake", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(1f)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2*20, 4), 1f)
                    .alwaysEat()
                    .build())
            .rarity(Rarity.UNCOMMON));

    // Sugar Cookie

    public static final RegistryObject<Item> SUGAR_COOKIE = registerItem("sugar_cookie", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(0.2f)
                    .build())
            .rarity(Rarity.COMMON));

    // Gumdrops

    public static final RegistryObject<Item> BLUE_GUMDROP = registerItem("blue_gumdrop", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationMod(3f)
                    .build())
            .rarity(Rarity.COMMON));

    public static final RegistryObject<Item> GREEN_GUMDROP = registerItem("green_gumdrop", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationMod(3f)
                    .build())
            .rarity(Rarity.COMMON));

    public static final RegistryObject<Item> RED_GUMDROP = registerItem("red_gumdrop", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationMod(3f)
                    .build())
            .rarity(Rarity.COMMON));

    public static final RegistryObject<Item> YELLOW_GUMDROP = registerItem("yellow_gumdrop", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationMod(3f)
                    .build())
            .rarity(Rarity.COMMON));

    // Rock Candy

    public static final RegistryObject<Item> BLUE_ROCK_CANDY = registerItem("blue_rock_candy", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.2f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> GREEN_ROCK_CANDY = registerItem("green_rock_candy", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.2f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> ORANGE_ROCK_CANDY = registerItem("orange_rock_candy", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.2f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> PINK_ROCK_CANDY = registerItem("pink_rock_candy", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.2f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> PURPLE_ROCK_CANDY = registerItem("purple_rock_candy", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.2f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> RED_ROCK_CANDY = registerItem("red_rock_candy", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.2f)
                    .build())
            .rarity(Rarity.COMMON));
    public static final RegistryObject<Item> YELLOW_ROCK_CANDY = registerItem("yellow_rock_candy", new Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.2f)
                    .build())
            .rarity(Rarity.COMMON));

    public static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
        return CreativeTab.addToTab(ITEMS.register(name, () -> new Item(properties)));
    }
}
