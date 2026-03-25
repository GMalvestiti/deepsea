package net.riser876.deepsea.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.riser876.deepsea.registry.DeepSeaTags;

import java.util.concurrent.CompletableFuture;

public class DeepSeaEnglishLanguageProvider extends FabricLanguageProvider {

    public DeepSeaEnglishLanguageProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registries, TranslationBuilder translationBuilder) {
        translationBuilder.add(DeepSeaTags.DEEP_SEA_BOAT, "Deep Sea Boat");
        translationBuilder.add(DeepSeaTags.DEEP_SEA_BIOME, "Deep Sea Ocean Biome");
    }
}