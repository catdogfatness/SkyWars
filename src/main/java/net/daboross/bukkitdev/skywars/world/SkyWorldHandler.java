/*
 * Copyright (C) 2013 Dabo Ross <www.daboross.net>
 */
package net.daboross.bukkitdev.skywars.world;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;

/**
 *
 * @author daboross
 */
public class SkyWorldHandler {

    private final World world;
    private final World warriors;

    public SkyWorldHandler() {
        this.world = createWorld();
        this.warriors = createWarriorsWorld();
    }

    private World createWorld() {
        WorldCreator wc = new WorldCreator("SkyWarsArenaWorld");
        wc.generateStructures(false);
        wc.generator(new VoidGenerator());
        wc.type(WorldType.FLAT);
        wc.seed(0);
        return wc.createWorld();
    }

    private World createWarriorsWorld() {
        WorldCreator wc = new WorldCreator("SkyblockWarriors");
        wc.generateStructures(false);
        wc.generator(new VoidGenerator());
        wc.type(WorldType.FLAT);
        wc.seed(0);
        return wc.createWorld();
    }

    public World getWorld() {
        return world;
    }

    /**
     * @param id The ID for the arena
     * @return A list of player spawn positions
     */
    public Location[] createArena(int id) {
        return new Location[4];
    }
}