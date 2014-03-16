package org.mattsmc.extratorches.block;

import org.mattsmc.extratorches.common.ExtraTorches;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class TorchBlock extends Block {

	public TorchBlock(Material material) {
		super(material);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(0.1F);
		setResistance(.1F);
		setLightLevel(2F);
		setLightOpacity(5);
	}

}
