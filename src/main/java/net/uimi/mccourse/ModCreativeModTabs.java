package net.uimi.mccourse;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.uimi.mccourse.block.ModBlocks;
import net.uimi.mccourse.item.ModItems;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB_ITEMS = CREATIVE_MOD_TABS.register("course_tab_items",
            () -> CreativeModeTab.builder()
                    .withTabsAfter(ModCreativeModTabs.COURSE_TAB_BLOCKS.getKey(), ModCreativeModTabs.COURSE_TAB_ORES.getKey()).icon(
                            () -> new ItemStack(ModItems.ALEXANDRITE.get())).title(Component.translatable("creativetab.course_tab_items")).displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModItems.PEAT_BRICK.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> COURSE_TAB_BLOCKS = CREATIVE_MOD_TABS.register("course_tab_blocks",
            () -> CreativeModeTab.builder().icon(
                    () -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get())).title(Component.translatable("creativetab.course_tab_blocks")).displayItems((itemDisplayParameters, output) -> {
                output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
                output.accept(ModBlocks.SOUND_BLOCK.get());
                output.accept(ModBlocks.ALEXANDRITE_STAIRS.get());
                output.accept(ModBlocks.ALEXANDRITE_SLAB.get());
                output.accept(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.ALEXANDRITE_BUTTON.get());
            }).build());
    public static final RegistryObject<CreativeModeTab> COURSE_TAB_ORES = CREATIVE_MOD_TABS.register("course_tab_ores",
            () -> CreativeModeTab.builder().withTabsAfter(ModCreativeModTabs.COURSE_TAB_FOOD.getKey()).icon(
                    () -> new ItemStack(ModBlocks.ALEXANDRITE_ORE.get())).title(Component.translatable("creativetab.course_tab_ores")).displayItems((itemDisplayParameters, output) -> {
                output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());
                output.accept(ModBlocks.NETHER_ALEXANDRITE_ORE.get());
                output.accept(ModBlocks.END_STONE_ALEXANDRITE_ORE.get());
            }).build());
    public static final RegistryObject<CreativeModeTab> COURSE_TAB_FOOD = CREATIVE_MOD_TABS.register("course_tab_food",
            () -> CreativeModeTab.builder().icon(
                    () -> new ItemStack(ModItems.KOHLRABI.get())).title(Component.translatable("creativetab.course_tab_food")).displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.KOHLRABI.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
