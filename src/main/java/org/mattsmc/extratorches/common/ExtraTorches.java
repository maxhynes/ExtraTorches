package org.mattsmc.extratorches.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.mattsmc.extratorches.block.BetterCoal;
import org.mattsmc.extratorches.block.TorchBlock;
import org.mattsmc.extratorches.block.worldgen.BetterCoalWG;
import org.mattsmc.extratorches.creativetab.ExtraTorchesTab;
import org.mattsmc.extratorches.creativetab.placeholder.ExtraTorchesTabPlaceHolder;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "ExtraTorches", name = "ExtraTorches", version = "0.1")
public class ExtraTorches {
	@SidedProxy(clientSide = "org.mattsmc.extratorches.common.ClientProxy", serverSide = "org.mattsmc.extratorches.common.CommonProxy")
	public static CommonProxy proxy;

	public static BetterCoalWG worldgen1 = new BetterCoalWG();
	
	//Creative Tabs//
	public static CreativeTabs ExtraTorchesTab = new ExtraTorchesTab(CreativeTabs.getNextID(), "ExtraTorches");
	public static Item ExtraTorchesTabPlaceHolder = new ExtraTorchesTabPlaceHolder().setUnlocalizedName("ExtraTorchesTabPlaceHolder");
	
	//Blocks//
	public static Block TorchBlock = new TorchBlock(Material.sand)
			.setBlockName("blockTorchBlock").setBlockTextureName(
					"ExtraTorches:blockTorchBlock");
	public static Block BetterCoal = new BetterCoal(Material.rock)
			.setBlockName("blockBetterCoal").setBlockTextureName(
					"ExtraTorches:blockBetterCoal");

	
	public ExtraTorches() {
		//Register Items
		GameRegistry.registerItem(ExtraTorchesTabPlaceHolder, "ExtraTorchesTabPlaceHolder");
		
		//Register Blocks
		GameRegistry.registerBlock(TorchBlock, "TorchBlock");
		GameRegistry.registerBlock(BetterCoal, "BetterCoal");
		
		//Register WorldGen//
		GameRegistry.registerWorldGenerator(worldgen1, 1);

	}

}
