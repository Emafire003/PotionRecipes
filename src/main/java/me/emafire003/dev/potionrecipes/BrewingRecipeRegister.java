package me.emafire003.dev.potionrecipes;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BrewingRecipeRegistry.class)
public interface BrewingRecipeRegister {
    /**
     * This method registers a new potion recipe.
     *
     * @param input The potion you want to start from, usually Potions.AWKWARD or your custom potion (which is going to be YourPotions.POTION)
     * @param item The ingredient you need for your potion
     * @param output The potion you want to have as a result of the crafting
     * */
    @Invoker("registerPotionRecipe")
    static void registerPotionRecipe(Potion input, Item item, Potion output) {
        throw new AssertionError();
    }
}
