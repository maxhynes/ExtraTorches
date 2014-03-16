package mattsmc.extratorches.block.worldgen;

import java.util.Random;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class BetterCoalWG implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1 : generateNether(world, random, chunkX*16, chunkZ*16);
		case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
		
		
		}
		
	}

	public void generateSurface(World world, Random random, int x, int z) {
		for(int i = 0; i < 13; i++){
			int Xcords = x + random.nextInt(16);
			int Ycords = random.nextInt(256);
			int Zcords = z + random.nextInt(16);
			new WorldGenMinable(ExtraTorches.BetterCoalOre, 50).generate(world, random, Xcords, Ycords, Zcords);
		}			
	}

	public void generateNether(World world, Random random, int i, int j) {
		
	}

}
