package mattsmc.extratorches.block;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class TorchBlock extends Block {

	public TorchBlock() {
		super(Material.sand);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(0.1F);
		setResistance(.1F);
		setLightLevel(2F);
		setLightOpacity(5);
		setBlockName("blockTorchBlock");
		setBlockTextureName("ExtraTorches:blockTorchBlock");
	}

}
