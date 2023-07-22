package com.tallcraft.nerfphantoms.hook;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.tallcraft.nerfphantoms.NerfPhantoms;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class NerfPhantomsPlaceholderExpansion extends PlaceholderExpansion {
    private static final NerfPhantoms PLUGIN = NerfPhantoms.getPlugin(NerfPhantoms.class);
    private static final String IDENTIFIER = "nerfphantoms";
    private static final String AUTHOR = String.join(",", PLUGIN.getDescription().getAuthors());
    private static final String VERSION = PLUGIN.getDescription().getVersion();

    @Override
    public @NotNull String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public @NotNull String getAuthor() {
        return AUTHOR;
    }

    @Override
    public @NotNull String getVersion() {
        return VERSION;
    }

    @Override
    public @Nullable String onPlaceholderRequest(Player player, @NotNull String params) {
        if (params.equalsIgnoreCase("disabled"))
            return Boolean.toString(PLUGIN.isPhantomDisabled(player));
        return null;
    }
}
