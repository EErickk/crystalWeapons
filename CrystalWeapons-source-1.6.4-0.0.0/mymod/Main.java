package mymod;

import mymod.proxies.CommonProxy;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;


/* 	MOD INFO */
	@Mod( modid = "mymod", name = "Crystal Weapons", version = "0.0.1")
	@NetworkMod(clientSideRequired=true, serverSideRequired=false)	


public class Main {

/*	PROXY INFO */
	@SidedProxy(clientSide = "mymod.proxies.ClientProxy", serverSide = "mymod.proxies.CommonProxy")
	public static CommonProxy proxy;
		
	
/**	
 * DECLARATION SECTION 
 * *********************************************************** */
      //Crystal Sword
      public static Item crystal_sword;
      //Crystal Pickaxe
      public static Item crystal_pickaxe;
      //public static EnumToolMaterial MyToolMaterial = EnumHelper.addToolMaterial("Awesomeness", 3, 1561, 8.0F, 3.0F, 10);



/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	


@EventHandler	
	public  void preInit( FMLPreInitializationEvent event ) 
	{
/**	
 * LOAD SECTION 
 * *********************************************************** */ 
           crystal_sword = new CrystalSword(2021, EnumToolMaterial.EMERALD, "crystal_sword");
        GameRegistry.registerItem(crystal_sword, "crystal_sword");
        LanguageRegistry.addName(crystal_sword, "Crystal Sword");
        
                crystal_pickaxe = new CrystalPickaxe(2022, EnumToolMaterial.EMERALD, "MyPickaxe_1");
        GameRegistry.registerItem(crystal_pickaxe, "crystal_pickaxe");
        LanguageRegistry.addName(crystal_pickaxe, "Crystal Pickaxe");


	
/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	

	}

@EventHandler
	public static void init( FMLInitializationEvent event ) 
	{
	
/**	
 * RECIPES SECTION 
 * *********************************************************** */
 // Crystal sword recipe
        GameRegistry.addRecipe(new ItemStack(crystal_sword, 1), new Object[]
        {
                " X ",
                " X ",
                " S ",
            'S', Item.swordDiamond,
            'X', Item.netherStar,
        }); 
        
          GameRegistry.addRecipe(new ItemStack(crystal_pickaxe, 1), new Object[]
        {
                "YXY",
                " S ",
                " S ",
            'S', Block.obsidian,
            'X', Item.netherStar,
            'Y', Block.blockDiamond,
        }); 


	

/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	

	
/**	
 * EXTRA METHODS SECTION 
 * *********************************************************** */


        


/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	

	
	}

@EventHandler
	public static void postInit( FMLPostInitializationEvent event ) 
	{

	}
	
}
