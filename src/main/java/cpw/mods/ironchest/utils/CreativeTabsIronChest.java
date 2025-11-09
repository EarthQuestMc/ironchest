package cpw.mods.ironchest.utils;

import cpw.mods.ironchest.IronChest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabsIronChest extends CreativeTabs {
    public CreativeTabsIronChest(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(IronChest.ironChestBlock);
    }
}