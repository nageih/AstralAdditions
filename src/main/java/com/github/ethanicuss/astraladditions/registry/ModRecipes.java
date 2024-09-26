package com.github.ethanicuss.astraladditions.registry;


import com.github.ethanicuss.astraladditions.AstralAdditions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(AstralAdditions.MOD_ID, DesizerRecipe.Serializer.ID),
                DesizerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(AstralAdditions.MOD_ID, DesizerRecipe.Type.ID),
                DesizerRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(AstralAdditions.MOD_ID, ChromaticVacuumRecipe.Serializer.ID),
                ChromaticVacuumRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(AstralAdditions.MOD_ID, ChromaticVacuumRecipe.Type.ID),
                ChromaticVacuumRecipe.Type.INSTANCE);
    }
}