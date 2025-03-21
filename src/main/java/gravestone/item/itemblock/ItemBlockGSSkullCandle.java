package gravestone.item.itemblock;

import gravestone.block.enums.EnumSkullCandle;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockGSSkullCandle extends ItemBlock {

    public ItemBlockGSSkullCandle(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return EnumSkullCandle.values()[itemStack.getItemDamage()].getUnLocalizedName();
    }
}
