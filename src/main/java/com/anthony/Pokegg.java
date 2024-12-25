package com.anthony;

import net.fabricmc.api.ModInitializer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pokegg implements ModInitializer {
    public static final String MOD_ID = "pokegg";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        PokeggItems.initialize();
    }
}