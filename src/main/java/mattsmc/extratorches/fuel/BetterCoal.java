package mattsmc.extratorches.fuel;

import cpw.mods.fml.common.IFuelHandler;
import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BetterCoal extends Item implements IFuelHandler{
	public BetterCoal() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("BetterCoal");
		setTextureName("ExtraTorches:itemBetterCoal");
	}

	public int getBurnTime(ItemStack fuel) {
		System.out.println(fuel.toString());
		return 3000;
	}

}
