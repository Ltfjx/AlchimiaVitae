package me.apeiros.alchimiavitae.setup;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.apeiros.alchimiavitae.utils.PotionUtils;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import net.kyori.adventure.text.serializer.craftbukkit.BukkitComponentSerializer;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.Map;

import static me.apeiros.alchimiavitae.AlchimiaVitae.MM;

public class Items {

    public static final SlimefunItemStack SOUL_COLLECTOR = new SlimefunItemStack("AV_SOUL_COLLECTOR",
            Material.DIAMOND_SWORD, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#6baefa:#7145b0>灵魂收集者</gradient>")),
            "&b收集灵魂", "&b用这个杀死任何怪物", "&b来抽取它的灵魂");

    static {
        ItemMeta meta = SOUL_COLLECTOR.getItemMeta();
        meta.setUnbreakable(true);

        SOUL_COLLECTOR.setItemMeta(meta);
        SOUL_COLLECTOR.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
    }

    public static final SlimefunItemStack CONDENSED_SOUL = new SlimefunItemStack("AV_CONDENSED_SOUL",
            Material.LIGHT_BLUE_DYE, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#6baefa:#7145b0>凝魂</gradient>")),
            "&b一个灵魂, 凝聚成一颗球", "&9&o也许有方法", "&9&o可以操纵它的力量...");

    static {
        CONDENSED_SOUL.addUnsafeEnchantment(Enchantment.LUCK, 1);
        CONDENSED_SOUL.addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public static final SlimefunItemStack PLANT_INFUSION_CHAMBER = new SlimefunItemStack("AV_PLANT_INFUSION_CHAMBER",
            Material.LIME_STAINED_GLASS, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#549c64:#1de078>植物浸液室</gradient>")),
            "&b可以为植物注入暗", "&b或光能量, 用于", "&b灵魂与魔法颗粒", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(64));

    public static final SlimefunItemStack GOOD_MAGIC_PLANT = new SlimefunItemStack("AV_GOOD_MAGIC_PLANT",
            Material.OAK_SAPLING, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#2ddae0:#31f876>光魔法植物</gradient>")),
            "&7光魔法 III", "&a散发着至高无上的光芒", "&a发光的与众不同...");

    static {
        GOOD_MAGIC_PLANT.addUnsafeEnchantment(Enchantment.LUCK, 1);
        GOOD_MAGIC_PLANT.addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public static final SlimefunItemStack EVIL_MAGIC_PLANT = new SlimefunItemStack("AV_EVIL_MAGIC_PLANT",
            Material.OAK_SAPLING, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#ff5555:#ffa012>暗魔法植物</gradient>")),
            "&7暗魔法 III", "&c包含了无数的黑暗", "&c魔法被锁在它的木质中...");

    static {
        EVIL_MAGIC_PLANT.addUnsafeEnchantment(Enchantment.LUCK, 1);
        EVIL_MAGIC_PLANT.addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public static final SlimefunItemStack GOOD_ESSENCE = new SlimefunItemStack("AV_GOOD_ESSENCE",
            Material.SUGAR, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#2ddae0:#31f876>光之精华</gradient>")),
            "&7光魔法 III", "&a生命. 照亮身旁. ");

    public static final SlimefunItemStack EVIL_ESSENCE = new SlimefunItemStack("AV_EVIL_ESSENCE",
            Material.GUNPOWDER, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#ff5555:#ffa012>暗之精华</gradient>")),
            "&7暗魔法 III", "&c死亡. 黑暗侵蚀.");

    public static final SlimefunItemStack EXP_CRYSTALLIZER = new SlimefunItemStack("AV_EXP_CRYSTALLIZER",
            Material.LIME_STAINED_GLASS, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#50fa75:#3dd2ff>经验结晶机</gradient>")),
            "&a将经验球转化成晶体状,", "&a耐用并充满活力的形式.",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(32));

    public static final SlimefunItemStack EXP_CRYSTAL = new SlimefunItemStack("AV_EXP_CRYSTAL",
            Material.EMERALD, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#50fa75:#3dd2ff>经验结晶</gradient>")),
            "&a一大块晶莹剔透的经验");

    static {
        EXP_CRYSTAL.addUnsafeEnchantment(Enchantment.LUCK, 1);
        EXP_CRYSTAL.addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public static final SlimefunItemStack ILLUMIUM = new SlimefunItemStack("AV_ILLUMIUM",
            Material.IRON_INGOT, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#2ddae0:#31f876>光明锭</gradient>")),
            "&a它有力的在你手上散发出光芒");

    static {
        ILLUMIUM.addUnsafeEnchantment(Enchantment.LUCK, 1);
        ILLUMIUM.addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public static final SlimefunItemStack DARKSTEEL = new SlimefunItemStack("AV_DARKSTEEL",
            Material.NETHERITE_INGOT, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#ff5555:#ffa012>暗钢锭</gradient>")),
            "&c它散发着... 无尽的黑暗?");

    static {
        DARKSTEEL.addUnsafeEnchantment(Enchantment.LUCK, 1);
        DARKSTEEL.addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public static final SlimefunItemStack DIVINE_ALTAR = new SlimefunItemStack("AV_DIVINE_ALTAR",
            Material.ENCHANTING_TABLE, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#ff5555:#ff6cfd>神圣祭坛</gradient>")),
            "&5用于进行古代仪式", "&5的神圣装置");

    public static final SlimefunItemStack MOLTEN_MYSTERY_METAL = new SlimefunItemStack("AV_MOLTEN_MYSTERY_METAL",
            Material.LAVA_BUCKET, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#ff6745:#ff5555>融化的神秘金属</gradient>")),
            "&6不同于金属的聚合体");

    public static final SlimefunItemStack MYSTERY_METAL = new SlimefunItemStack("AV_MYSTERY_METAL",
            Material.IRON_INGOT, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#ff6745:#ff5555>神秘金属锭</gradient>")),
            "&6含有多种金属");

    public static final SlimefunItemStack POTION_OF_OSMOSIS = new SlimefunItemStack("AV_POTION_OF_OSMOSIS",
            Material.DRAGON_BREATH, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#6274e7:#8752a3>渗透药水</gradient>")),
            "&6吸收你的药水效果", "&6并将它们储存在瓶子中 &e右键点击");

    public static final SlimefunItemStack ORNATE_CAULDRON = new SlimefunItemStack("AV_ORNATE_CAULDRON",
            Material.CAULDRON, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#57ebbe:#f6fa2a>华丽锅釜</gradient>")),
            "&2用于酿造药水的高级锅釜");

    // Make sure to make the int pair at the end {time in seconds * 20, level}
    private static Map<PotionEffectType, int[]> potEffectsMap = new HashMap<>();

    static {
        // Add effects
        potEffectsMap.put(PotionEffectType.DAMAGE_RESISTANCE, new int[]{6000, 1});
        potEffectsMap.put(PotionEffectType.FAST_DIGGING, new int[]{6000, 2});
        potEffectsMap.put(PotionEffectType.REGENERATION, new int[]{6000, 2});
        potEffectsMap.put(PotionEffectType.SPEED, new int[]{6000, 2});
        potEffectsMap.put(PotionEffectType.JUMP, new int[]{6000, 2});
    }

    public static final SlimefunItemStack BENEVOLENT_BREW = PotionUtils.makePotion(MM.parse(
            "<gradient:#2ddae0:#31f876>仁慈酿造</gradient>"), Color.LIME, potEffectsMap);

    static {
        // Clear the map from the previous usage
        potEffectsMap.clear();

        // Add effects
        potEffectsMap.put(PotionEffectType.WEAKNESS, new int[]{6000, 3});
        potEffectsMap.put(PotionEffectType.SLOW, new int[]{3000, 2});
        potEffectsMap.put(PotionEffectType.POISON, new int[]{600, 2});
        potEffectsMap.put(PotionEffectType.BLINDNESS, new int[]{1200, 1});
        potEffectsMap.put(PotionEffectType.HUNGER, new int[]{600, 2});
    }

    public static final SlimefunItemStack MALEVOLENT_CONCOCTION = PotionUtils.makeSplashPotion(MM.parse(
            "<gradient:#ff5555:#ffa012>恶毒的混合物</gradient>"), Color.MAROON, potEffectsMap);

    public static final SlimefunItemStack ALTAR_OF_INFUSION = new SlimefunItemStack("AV_ALTAR_OF_INFUSION",
            Material.LODESTONE, BukkitComponentSerializer.legacy().serialize
            (MM.parse("<gradient:#f78770:#ff607b>灌注祭坛</gradient>")),
            "&5结合科技的祭坛", "&5和巫术来注入物品", "&5具有强大的属性", "&6由于魔法, 我们还没有",
            "&6完全明白, 注入只能", "&6适用于黄金制的工具,",
            "&6铁, 钻石, 或狱髓锭", "&6弓与弩也可以在这个祭坛上使用", "&6出于一些原因我们还不明白");

}
