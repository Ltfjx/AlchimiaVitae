package me.apeiros.alchimiavitae.utils;

import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import net.kyori.adventure.text.serializer.craftbukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.apeiros.alchimiavitae.AlchimiaVitae.MM;

/**
 * This class holds {@link ItemStack}s
 * that are frequently used in {@link ChestMenu}s
 */
@UtilityClass
public class ChestMenuItems {

    public static final ItemStack BG = ChestMenuUtils.getBackground();

    public static final ItemStack STATUS_BG = new CustomItem(Material.ORANGE_STAINED_GLASS_PANE,
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#ff3b3b:#ff5c74>状态</gradient>")));

    public static final ItemStack OUT_BG = new CustomItem(Material.CYAN_STAINED_GLASS_PANE,
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#39f792:#5c95ff>输出</gradient>")));

    public static final ItemStack OUT_BG_ALT = new CustomItem(Material.BLUE_STAINED_GLASS_PANE,
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#39f792:#5c95ff>输出</gradient>")));

    public static final ItemStack OUT_BG_CLICK_CRAFT = new CustomItem(Material.CYAN_STAINED_GLASS_PANE,
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#39f792:#5c95ff>输出</gradient>")),
            "&a点击制作");

    public static final ItemStack IN_BG = new CustomItem(Material.ORANGE_STAINED_GLASS_PANE,
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#ff68fc:#ff9a5c>输入</gradient>")));

    public static final ItemStack IN_BG_CLICK_CRAFT = new CustomItem(Material.ORANGE_STAINED_GLASS_PANE,
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#ff68fc:#ff9a5c>输入</gradient>")),
            "&a点击制作");

    public static final ItemStack CRAFT_BTN = new CustomItem(Material.LIME_STAINED_GLASS_PANE,
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#39f792:#5c95ff>制作</gradient>")),
            "&a点击制作");

    public static final ItemStack CRAFT_BG = new CustomItem(Material.CYAN_STAINED_GLASS_PANE,
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#39f792:#5c95ff>制作</gradient>")));

}
