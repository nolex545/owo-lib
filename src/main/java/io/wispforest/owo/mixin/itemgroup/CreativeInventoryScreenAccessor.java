package io.wispforest.owo.mixin.itemgroup;

import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.item.ItemGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(CreativeInventoryScreen.class)
public interface CreativeInventoryScreenAccessor {

    @Accessor("selectedTab")
    static ItemGroup owo$getSelectedTab() {
        throw new IllegalStateException("Mixin stub must not be called");
    }

}
