package mattsmc.extratorches.block;

import java.util.Random;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BetterCoalOre extends BlockOre {
	
    public Item getItemDropped(int i, Random random, int j)
    {
        return ExtraTorches.BetterCoal;
    }
    
    public int quantityDropped(Random rand){
    	return rand.nextInt(2) + 1;
    }
	
	public BetterCoalOre() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(.5F);
		setLightOpacity(5);
		setHarvestLevel("pickaxe", 2);
		setBlockTextureName("ExtraTorches:blockBetterCoal");
		setBlockName("blockBetterCoal");
	}
}
