package net.xdpp.kaleidoscopetfctavern.init;

import com.github.ysbbbbbb.kaleidoscopetavern.item.JuiceBucketItem;
import net.xdpp.kaleidoscopetfctavern.Kaleidoscopetfctavern;
import net.xdpp.kaleidoscopetfctavern.item.CustomDrinkBlockItem;
import net.xdpp.kaleidoscopetfctavern.item.GrapevineLocatorItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * 物品注册类
 * <p>
 * 注册所有葡萄藤相关的物品
 * 尽可能复用 Kaleidoscope Tavern 已实现的物品
 */
public interface ModItems {
    /**
     * 物品延迟注册表
     */
    DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Kaleidoscopetfctavern.MODID);

    /**
     * 野生紫葡萄藤物品
     */
    RegistryObject<Item> WILD_GRAPEVINE_PURPLE = ITEMS.register("wild_grapevine_purple",
            () -> new BlockItem(ModBlocks.WILD_GRAPEVINE_PURPLE.get(), new Item.Properties()));
    
    /**
     * 野生红葡萄藤物品
     */
    RegistryObject<Item> WILD_GRAPEVINE_RED = ITEMS.register("wild_grapevine_red",
            () -> new BlockItem(ModBlocks.WILD_GRAPEVINE_RED.get(), new Item.Properties()));
    
    /**
     * 野生白葡萄藤物品
     */
    RegistryObject<Item> WILD_GRAPEVINE_WHITE = ITEMS.register("wild_grapevine_white",
            () -> new BlockItem(ModBlocks.WILD_GRAPEVINE_WHITE.get(), new Item.Properties()));
    
    /**
     * 野生绿葡萄藤物品
     */
    RegistryObject<Item> WILD_GRAPEVINE_GREEN = ITEMS.register("wild_grapevine_green",
            () -> new BlockItem(ModBlocks.WILD_GRAPEVINE_GREEN.get(), new Item.Properties()));

    /**
     * 食物属性配置
     * <p>
     * 快速食用的水果
     */
    static final FoodProperties GRAPE_FOOD_PROPERTIES = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.5f)
            .fast()
            .build();

    /**
     * 紫葡萄物品
     */
    RegistryObject<Item> GRAPE_PURPLE = ITEMS.register("grape_purple",
            () -> new Item(new Item.Properties().food(GRAPE_FOOD_PROPERTIES)));
    
    /**
     * 红葡萄物品
     */
    RegistryObject<Item> GRAPE_RED = ITEMS.register("grape_red",
            () -> new Item(new Item.Properties().food(GRAPE_FOOD_PROPERTIES)));
    
    /**
     * 白葡萄物品
     */
    RegistryObject<Item> GRAPE_WHITE = ITEMS.register("grape_white",
            () -> new Item(new Item.Properties().food(GRAPE_FOOD_PROPERTIES)));
    
    /**
     * 绿葡萄物品
     */
    RegistryObject<Item> GRAPE_GREEN = ITEMS.register("grape_green",
            () -> new Item(new Item.Properties().food(GRAPE_FOOD_PROPERTIES)));

    /**
     * 葡萄藤定位器物品
     */
    RegistryObject<Item> GRAPEVINE_LOCATOR = ITEMS.register("grapevine_locator",
            () -> new GrapevineLocatorItem(new Item.Properties()));

    /**
     * 紫葡萄汁桶物品
     */
    RegistryObject<Item> PURPLE_GRAPE_BUCKET = ITEMS.register("purple_grape_bucket",
            () -> new JuiceBucketItem(ModFluids.PURPLE_GRAPE_JUICE));
    
    /**
     * 红葡萄汁桶物品
     */
    RegistryObject<Item> RED_GRAPE_BUCKET = ITEMS.register("red_grape_bucket",
            () -> new JuiceBucketItem(ModFluids.RED_GRAPE_JUICE));
    
    /**
     * 白葡萄汁桶物品
     */
    RegistryObject<Item> WHITE_GRAPE_BUCKET = ITEMS.register("white_grape_bucket",
            () -> new JuiceBucketItem(ModFluids.WHITE_GRAPE_JUICE));
    
    /**
     * 绿葡萄汁桶物品
     */
    RegistryObject<Item> GREEN_GRAPE_BUCKET = ITEMS.register("green_grape_bucket",
            () -> new JuiceBucketItem(ModFluids.GREEN_GRAPE_JUICE));

    /**
     * 紫葡萄酒物品
     */
    RegistryObject<Item> PURPLE_WINE = ITEMS.register("purple_wine",
            () -> new CustomDrinkBlockItem(ModBlocks.PURPLE_WINE.get()));

    /**
     * 红葡萄酒物品
     */
    RegistryObject<Item> RED_WINE = ITEMS.register("red_wine",
            () -> new CustomDrinkBlockItem(ModBlocks.RED_WINE.get()));

    /**
     * 白葡萄酒物品
     */
    RegistryObject<Item> WHITE_WINE = ITEMS.register("white_wine",
            () -> new CustomDrinkBlockItem(ModBlocks.WHITE_WINE.get()));

    /**
     * 冰紫葡萄酒物品
     */
    RegistryObject<Item> ICE_PURPLE_WINE = ITEMS.register("ice_purple_wine",
            () -> new CustomDrinkBlockItem(ModBlocks.ICE_PURPLE_WINE.get()));

    /**
     * 冰红葡萄酒物品
     */
    RegistryObject<Item> ICE_RED_WINE = ITEMS.register("ice_red_wine",
            () -> new CustomDrinkBlockItem(ModBlocks.ICE_RED_WINE.get()));

    /**
     * 冰白葡萄酒物品
     */
    RegistryObject<Item> ICE_WHITE_WINE = ITEMS.register("ice_white_wine",
            () -> new CustomDrinkBlockItem(ModBlocks.ICE_WHITE_WINE.get()));

    /**
     * 花酿紫葡萄酒物品
     */
    RegistryObject<Item> FLOWER_PURPLE_WINE = ITEMS.register("flower_purple_wine",
            () -> new CustomDrinkBlockItem(ModBlocks.FLOWER_PURPLE_WINE.get()));

    /**
     * 花酿红葡萄酒物品
     */
    RegistryObject<Item> FLOWER_RED_WINE = ITEMS.register("flower_red_wine",
            () -> new CustomDrinkBlockItem(ModBlocks.FLOWER_RED_WINE.get()));

    /**
     * 花酿白葡萄酒物品
     */
    RegistryObject<Item> FLOWER_WHITE_WINE = ITEMS.register("flower_white_wine",
            () -> new CustomDrinkBlockItem(ModBlocks.FLOWER_WHITE_WINE.get()));

    /**
     * 威士忌物品
     */
    RegistryObject<Item> WHISKEY = ITEMS.register("whiskey",
            () -> new CustomDrinkBlockItem(ModBlocks.WHISKEY.get()));

    /**
     * 玉米威士忌物品
     */
    RegistryObject<Item> CORN_WHISKEY = ITEMS.register("corn_whiskey",
            () -> new CustomDrinkBlockItem(ModBlocks.CORN_WHISKEY.get()));

    /**
     * 黑麦威士忌物品
     */
    RegistryObject<Item> RYE_WHISKEY = ITEMS.register("rye_whiskey",
            () -> new CustomDrinkBlockItem(ModBlocks.RYE_WHISKEY.get()));

    /**
     * 啤酒物品
     */
    RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new CustomDrinkBlockItem(ModBlocks.BEER.get()));

    /**
     * 苹果酒物品
     */
    RegistryObject<Item> CIDER = ITEMS.register("cider",
            () -> new CustomDrinkBlockItem(ModBlocks.CIDER.get()));

    /**
     * 朗姆酒物品
     */
    RegistryObject<Item> RUM = ITEMS.register("rum",
            () -> new CustomDrinkBlockItem(ModBlocks.RUM.get()));

    /**
     * 清酒物品
     */
    RegistryObject<Item> SAKE = ITEMS.register("sake",
            () -> new CustomDrinkBlockItem(ModBlocks.SAKE.get()));

    /**
     * 伏特加物品
     */
    RegistryObject<Item> VODKA = ITEMS.register("vodka",
            () -> new CustomDrinkBlockItem(ModBlocks.VODKA.get()));

    /**
     * Wine1 物品
     */
    RegistryObject<Item> WINE_1 = ITEMS.register("wine1",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_1.get()));

    /**
     * Wine2 物品
     */
    RegistryObject<Item> WINE_2 = ITEMS.register("wine2",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_2.get()));

    /**
     * Wine3 物品
     */
    RegistryObject<Item> WINE_3 = ITEMS.register("wine3",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_3.get()));

    /**
     * Wine4 物品
     */
    RegistryObject<Item> WINE_4 = ITEMS.register("wine4",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_4.get()));

    /**
     * Wine5 物品
     */
    RegistryObject<Item> WINE_5 = ITEMS.register("wine5",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_5.get()));

    /**
     * Wine6 物品
     */
    RegistryObject<Item> WINE_6 = ITEMS.register("wine6",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_6.get()));

    /**
     * Wine7 物品
     */
    RegistryObject<Item> WINE_7 = ITEMS.register("wine7",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_7.get()));

    /**
     * Wine8 物品
     */
    RegistryObject<Item> WINE_8 = ITEMS.register("wine8",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_8.get()));

    /**
     * Wine9 物品
     */
    RegistryObject<Item> WINE_9 = ITEMS.register("wine9",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_9.get()));

    /**
     * Wine10 物品
     */
    RegistryObject<Item> WINE_10 = ITEMS.register("wine10",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_10.get()));

    /**
     * Wine11 物品
     */
    RegistryObject<Item> WINE_11 = ITEMS.register("wine11",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_11.get()));

    /**
     * Wine12 物品
     */
    RegistryObject<Item> WINE_12 = ITEMS.register("wine12",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_12.get()));

    /**
     * Wine13 物品
     */
    RegistryObject<Item> WINE_13 = ITEMS.register("wine13",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_13.get()));

    /**
     * Wine14 物品
     */
    RegistryObject<Item> WINE_14 = ITEMS.register("wine14",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_14.get()));

    /**
     * Wine15 物品
     */
    RegistryObject<Item> WINE_15 = ITEMS.register("wine15",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_15.get()));

    /**
     * Wine16 物品
     */
    RegistryObject<Item> WINE_16 = ITEMS.register("wine16",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_16.get()));

    /**
     * Wine17 物品
     */
    RegistryObject<Item> WINE_17 = ITEMS.register("wine17",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_17.get()));

    /**
     * Wine18 物品
     */
    RegistryObject<Item> WINE_18 = ITEMS.register("wine18",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_18.get()));

    /**
     * Wine19 物品
     */
    RegistryObject<Item> WINE_19 = ITEMS.register("wine19",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_19.get()));

    /**
     * Wine20 物品
     */
    RegistryObject<Item> WINE_20 = ITEMS.register("wine20",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_20.get()));

    /**
     * Wine21 物品
     */
    RegistryObject<Item> WINE_21 = ITEMS.register("wine21",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_21.get()));

    /**
     * Wine22 物品
     */
    RegistryObject<Item> WINE_22 = ITEMS.register("wine22",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_22.get()));

    /**
     * Wine23 物品
     */
    RegistryObject<Item> WINE_23 = ITEMS.register("wine23",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_23.get()));

    /**
     * Wine24 物品
     */
    RegistryObject<Item> WINE_24 = ITEMS.register("wine24",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_24.get()));

    /**
     * Wine25 物品
     */
    RegistryObject<Item> WINE_25 = ITEMS.register("wine25",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_25.get()));

    /**
     * Wine26 物品
     */
    RegistryObject<Item> WINE_26 = ITEMS.register("wine26",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_26.get()));

    /**
     * Wine27 物品
     */
    RegistryObject<Item> WINE_27 = ITEMS.register("wine27",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_27.get()));

    /**
     * Wine28 物品
     */
    RegistryObject<Item> WINE_28 = ITEMS.register("wine28",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_28.get()));

    /**
     * Wine29 物品
     */
    RegistryObject<Item> WINE_29 = ITEMS.register("wine29",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_29.get()));

    /**
     * Wine30 物品
     */
    RegistryObject<Item> WINE_30 = ITEMS.register("wine30",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_30.get()));

    /**
     * Wine31 物品
     */
    RegistryObject<Item> WINE_31 = ITEMS.register("wine31",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_31.get()));

    /**
     * Wine32 物品
     */
    RegistryObject<Item> WINE_32 = ITEMS.register("wine32",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_32.get()));

    /**
     * Wine33 物品
     */
    RegistryObject<Item> WINE_33 = ITEMS.register("wine33",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_33.get()));

    /**
     * Wine34 物品
     */
    RegistryObject<Item> WINE_34 = ITEMS.register("wine34",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_34.get()));

    /**
     * Wine35 物品
     */
    RegistryObject<Item> WINE_35 = ITEMS.register("wine35",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_35.get()));

    /**
     * Wine36 物品
     */
    RegistryObject<Item> WINE_36 = ITEMS.register("wine36",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_36.get()));

    /**
     * Wine37 物品
     */
    RegistryObject<Item> WINE_37 = ITEMS.register("wine37",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_37.get()));

    /**
     * Wine38 物品
     */
    RegistryObject<Item> WINE_38 = ITEMS.register("wine38",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_38.get()));

    /**
     * Wine39 物品
     */
    RegistryObject<Item> WINE_39 = ITEMS.register("wine39",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_39.get()));

    /**
     * Wine40 物品
     */
    RegistryObject<Item> WINE_40 = ITEMS.register("wine40",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_40.get()));

    /**
     * Wine41 物品
     */
    RegistryObject<Item> WINE_41 = ITEMS.register("wine41",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_41.get()));

    /**
     * Wine42 物品
     */
    RegistryObject<Item> WINE_42 = ITEMS.register("wine42",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_42.get()));

    /**
     * Wine43 物品
     */
    RegistryObject<Item> WINE_43 = ITEMS.register("wine43",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_43.get()));

    /**
     * Wine44 物品
     */
    RegistryObject<Item> WINE_44 = ITEMS.register("wine44",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_44.get()));

    /**
     * Wine45 物品
     */
    RegistryObject<Item> WINE_45 = ITEMS.register("wine45",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_45.get()));

    /**
     * Wine46 物品
     */
    RegistryObject<Item> WINE_46 = ITEMS.register("wine46",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_46.get()));

    /**
     * Wine47 物品
     */
    RegistryObject<Item> WINE_47 = ITEMS.register("wine47",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_47.get()));

    /**
     * Wine48 物品
     */
    RegistryObject<Item> WINE_48 = ITEMS.register("wine48",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_48.get()));

    /**
     * Wine49 物品
     */
    RegistryObject<Item> WINE_49 = ITEMS.register("wine49",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_49.get()));

    /**
     * Wine50 物品
     */
    RegistryObject<Item> WINE_50 = ITEMS.register("wine50",
            () -> new CustomDrinkBlockItem(ModBlocks.WINE_50.get()));
}
