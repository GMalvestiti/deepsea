package net.riser876.deepsea.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.biome.Biome;
import net.riser876.deepsea.registry.DeepSeaTags;

import java.util.concurrent.CompletableFuture;

public class DeepSeaBiomeTagProvider extends FabricTagsProvider<Biome> {

    public DeepSeaBiomeTagProvider(FabricPackOutput output,
                                   CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, Registries.BIOME, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(DeepSeaTags.DEEP_SEA_BIOME).addOptionalTag(ConventionalBiomeTags.IS_OCEAN);
    }
}