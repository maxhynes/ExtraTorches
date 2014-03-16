package org.mattsmc.extratorches.block;

import org.mattsmc.extratorches.common.ExtraTorches;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BetterCoal extends Block {
	public BetterCoal(Material material) {
		super(material);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(.5F);
		setLightOpacity(5);
		
	}

}
