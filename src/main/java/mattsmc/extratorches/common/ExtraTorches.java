package mattsmc.extratorches.common;

import mattsmc.extratorches.block.BetterCoalOre;
import mattsmc.extratorches.block.BlackholeBlock;
import mattsmc.extratorches.block.TorchBlock;
import mattsmc.extratorches.block.worldgen.BetterCoalWG;
import mattsmc.extratorches.creativetab.ExtraTorchesTab;
import mattsmc.extratorches.creativetab.placeholder.ExtraTorchesTabPlaceHolder;
import mattsmc.extratorches.fuel.BetterCoal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "ExtraTorches", name = "ExtraTorches", version = "0.1")
public class ExtraTorches {
	@SidedProxy(clientSide = "mattsmc.extratorches.common.ClientProxy", serverSide = "mattsmc.extratorches.common.CommonProxy")
	public static CommonProxy proxy;

	public static BetterCoalWG worldgen1 = new BetterCoalWG();
	
	//Creative Tabs//
	public static CreativeTabs ExtraTorchesTab = new ExtraTorchesTab(CreativeTabs.getNextID(), "ExtraTorches");
	public static Item ExtraTorchesTabPlaceHolder = new ExtraTorchesTabPlaceHolder().setUnlocalizedName("ExtraTorchesTabPlaceHolder");
	
	//Blocks//
	public static Block TorchBlock = new TorchBlock();
			
	public static Block BetterCoalOre = new BetterCoalOre();
	
	public static Block BlackholeBlock = new BlackholeBlock();

	public static Item BetterCoal = new BetterCoal();
	
	
	public ExtraTorches() {
		//Register Items
		GameRegistry.registerItem(ExtraTorchesTabPlaceHolder, "ExtraTorchesTabPlaceHolder");
		GameRegistry.registerItem(BetterCoal, "BetterCoal");
		
		//Register Blocks
		GameRegistry.registerBlock(TorchBlock, "TorchBlock");
		GameRegistry.registerBlock(BetterCoalOre, "BetterCoalOre");
		GameRegistry.registerBlock(BlackholeBlock, "BlackholeBlock");
		
		//Register Fuels
		GameRegistry.registerFuelHandler((IFuelHandler) BetterCoal);
		
		//Register WorldGen//
		GameRegistry.registerWorldGenerator(worldgen1, 1);

	}

}
