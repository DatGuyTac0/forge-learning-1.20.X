package net.datguytaco.hilmstore.item;

import net.datguytaco.hilmstore.Hilmstore;
import net.datguytaco.hilmstore.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Hilmstore.MODID);

    public static final RegistryObject<CreativeModeTab> HILMSTORE_TAB = CREATIVE_MODE_TABS.register("hilmstore_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.hilmstore_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.GREEN_BEAN_BLOCK.get());
                        output.accept(ModBlocks.COOKED_BEAN_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
