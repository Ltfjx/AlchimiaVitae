package me.apeiros.alchimiavitae.setup.items.general;

import me.apeiros.alchimiavitae.setup.Items;
import me.apeiros.alchimiavitae.utils.RecipeTypes;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class CondensedSoul extends SlimefunItem {

    public CondensedSoul(Category c) {

        super(c, Items.CONDENSED_SOUL, RecipeTypes.SOUL_COLLECTOR_TYPE, new ItemStack[] {
                null, null, null,
                null, new CustomItem(Material.DROWNED_SPAWN_EGG, "&bAny Mob"), null,
                null, null, null
        });

    }

}
