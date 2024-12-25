package com.anthony;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class PokeggItems {

    private PokeggItems() {}

    public static final Item POKEGG = register("pokegg", Item::new, new Item.Settings());

    public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {

        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("pokegg", path));

        return Items.register(registryKey, factory, settings);
    }

    public static void initialize() {

    }
}
