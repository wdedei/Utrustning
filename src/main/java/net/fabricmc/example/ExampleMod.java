package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.item.rstone;
import net.fabricmc.example.items.r;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.structure.StructurePieceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;

import static net.fabricmc.fabric.api.biome.v1.BiomeModifications.*;
import static net.fabricmc.fabric.api.biome.v1.BiomeSelectors.*;

public class ExampleMod implements ModInitializer {
	private static Enchantment FROST = Registry.register(
			Registry.ENCHANTMENT,
			new Identifier("p", "frost"),
			new hE()
	);
	public static final StructurePieceType MY_PIECE = (a,b) -> new MyPiece(a,b);
	private static final StructureFeature<DefaultFeatureConfig> MY_STRUCTURE = new MyFeature(DefaultFeatureConfig.CODEC);
	private static final ConfiguredStructureFeature<?, ?> MY_CONFIGURED = MY_STRUCTURE.configure(DefaultFeatureConfig.DEFAULT);
	public static final Item BSTONE = new Item(new FabricItemSettings());
	public static final Item BN = new Item(new FabricItemSettings());
	public static final Item BPILE = new Item(new FabricItemSettings());
	public static final BowItem BBOW = new bow1(new FabricItemSettings().maxCount(1));
	public static final BowItem BBBOW = new bow2(new FabricItemSettings().maxCount(1));
	public static final BowItem BBCBOW = new bow3(new FabricItemSettings().maxCount(1));
	public static final BowItem BBDCBOW = new bow4(new FabricItemSettings().maxCount(1));
	public static final Block BBLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(25.0f).resistance(14));
	public static final Block BBCLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(65.0f).resistance(20));
	public static final Block BBDCLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(150.0f).resistance(45));
	public static final Block BORE = new Block(FabricBlockSettings.of(Material.METAL).hardness(19.0f).resistance(12));
	public static final tnt1 MATU_TNT = new tnt1(FabricBlockSettings.of(Material.METAL).hardness(1.5f).resistance(4));
	public static final tnt2 NULL_TNT = new tnt2(FabricBlockSettings.of(Material.METAL).hardness(3.5f).resistance(7));
	public static final ToolItem BPAXE = new paxe(tool.INSTANCE, 2, -2.2F, new Settings());
	public static final ToolItem BBPAXE = new paxe1(tool1.INSTANCE, 3, -1.2F, new Settings());
	public static final ToolItem BBCPAXE = new paxe2(tool2.INSTANCE, 4, -0.2F, new Settings());
	public static final ToolItem BBDCPAXE = new paxe3(tool3.INSTANCE, 6, 2.2F, new Settings());
	public static ToolItem BAXE = new axe(tool.INSTANCE, (int) 6.0F, -2.6F, new Settings());
	public static ToolItem BBAXE = new axe1(tool1.INSTANCE, (int) 8.0F, -0.6F, new Settings());
	public static ToolItem BBCAXE = new axe2(tool2.INSTANCE, (int) 9.0F, 1.6F, new Settings());
	public static ToolItem BBDCAXE = new axe3(tool3.INSTANCE, (int) 11.0F, 3.6F, new Settings());
	public static ToolItem BSHOVEL = new ShovelItem(tool.INSTANCE, 2.5F, -2.2F, new Settings());
	public static ToolItem BBSHOVEL = new shovel(tool1.INSTANCE, (int) 3.5F, -1.2F, new Settings());
	public static ToolItem BBCSHOVEL = new shovel1(tool2.INSTANCE, (int) 4.5F, -0.2F, new Settings());
	public static ToolItem BBDCSHOVEL = new shovel2(tool3.INSTANCE, (int) 6.5F, 2.2F, new Settings());
	public static ToolItem BSWORD = new SwordItem(tool.INSTANCE, 4, -1.6F, new Settings());
	public static ToolItem BBSWORD = new sword(tool1.INSTANCE, 5, -0.6F, new Settings());
	public static ToolItem BBCSWORD = new sword1(tool2.INSTANCE, 6, 2.6F, new Settings());
	public static ToolItem BBDCSWORD = new sword2(tool3.INSTANCE, 8, 5.0F, new Settings());
	public static ToolItem BHOE = new hoe(tool.INSTANCE, -3, 1F, new Settings());
	public static ToolItem BBHOE = new hoe1(tool1.INSTANCE, -2, 2F, new Settings());
	public static ToolItem BBCHOE = new hoe2(tool2.INSTANCE, -1, 3F, new Settings());
	public static ToolItem BBDCHOE = new hoe3(tool3.INSTANCE, 1, 5F, new Settings());
	public static final Item GH = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.0F)
					.alwaysEdible()
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.SPEED,200,0),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,400,0),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600,1),0.1F)
					.build())
			.maxCount(16));
	public static final Item BA = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(10)
					.saturationModifier(0.6F)
					.alwaysEdible()
					.statusEffect(new StatusEffectInstance(StatusEffects.SPEED,400,0),0.01F)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,400,5),0.01F)
					.statusEffect(new StatusEffectInstance(StatusEffects.POISON,800,2),0.05F)
					.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,100,0),1.0F)
					.build())
			.maxCount(64));
	public static final ItemGroup BS = FabricItemGroupBuilder.create(
			new Identifier("p", "bs"))
			.icon(() -> new ItemStack(BSTONE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(BSTONE));
				stacks.add(new ItemStack(BN));
				stacks.add(new ItemStack(GH));
				stacks.add(new ItemStack(BA));
				stacks.add(new ItemStack(BBLOCK));
				stacks.add(new ItemStack(BBCLOCK));
				stacks.add(new ItemStack(BBDCLOCK));
				stacks.add(new ItemStack(BORE));
				stacks.add(new ItemStack(BSWORD));
				stacks.add(new ItemStack(BPAXE));
				stacks.add(new ItemStack(BAXE));
				stacks.add(new ItemStack(BSHOVEL));
				stacks.add(new ItemStack(BHOE));
				stacks.add(new ItemStack(r.B_HELMET));
				stacks.add(new ItemStack(r.B_CHESTPLATE));
				stacks.add(new ItemStack(r.B_LEGGINGS));
				stacks.add(new ItemStack(r.B_BOOTS));
				stacks.add(new ItemStack(BPILE));
				stacks.add(new ItemStack(BBOW));
				stacks.add(new ItemStack(BBSWORD));
				stacks.add(new ItemStack(BBPAXE));
				stacks.add(new ItemStack(BBAXE));
				stacks.add(new ItemStack(BBSHOVEL));
				stacks.add(new ItemStack(BBHOE));
				stacks.add(new ItemStack(r.BB_HELMET));
				stacks.add(new ItemStack(r.BB_CHESTPLATE));
				stacks.add(new ItemStack(r.BB_LEGGINGS));
				stacks.add(new ItemStack(r.BB_BOOTS));
				stacks.add(new ItemStack(BBBOW));
				stacks.add(new ItemStack(BBCSWORD));
				stacks.add(new ItemStack(BBCPAXE));
				stacks.add(new ItemStack(BBCAXE));
				stacks.add(new ItemStack(BBCSHOVEL));
				stacks.add(new ItemStack(BBCHOE));
				stacks.add(new ItemStack(r.BBC_HELMET));
				stacks.add(new ItemStack(r.BBC_CHESTPLATE));
				stacks.add(new ItemStack(r.BBC_LEGGINGS));
				stacks.add(new ItemStack(r.BBC_BOOTS));
				stacks.add(new ItemStack(BBCBOW));
				stacks.add(new ItemStack(BBDCSWORD));
				stacks.add(new ItemStack(BBDCPAXE));
				stacks.add(new ItemStack(BBDCAXE));
				stacks.add(new ItemStack(BBDCSHOVEL));
				stacks.add(new ItemStack(BBDCHOE));
				stacks.add(new ItemStack(r.BBDC_HELMET));
				stacks.add(new ItemStack(r.BBDC_CHESTPLATE));
				stacks.add(new ItemStack(r.BBDC_LEGGINGS));
				stacks.add(new ItemStack(r.BBDC_BOOTS));
				stacks.add(new ItemStack(BBDCBOW));
			})
			.build();
	public static final rstone RSTONE = new rstone(new FabricItemSettings());
	public static final rarrow RARROW = new rarrow(new FabricItemSettings());
	public static final Block RORE = new Block(FabricBlockSettings.of(Material.METAL).hardness(15.0f).resistance(9));
	public static final Block RBLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(19.0f).resistance(13).lightLevel(7));
	public static rsword RSWORD = new rsword(tool4r.INSTANCE, 5, 13.0F, new Settings());
	public static ToolItem RAXE = new raxe(tool4r.INSTANCE, (int) 6.0F, 13.0F, new Settings());
	public static final ToolItem RPAXE = new rpaxe(tool4r.INSTANCE, 4, 13.0F, new Settings());
	public static ToolItem RSHOVEL = new rshovel(tool4r.INSTANCE, 3.0F, 13.0F, new Settings());
	public static ToolItem RHOE = new rhoe(tool4r.INSTANCE, 0, 13.0F, new Settings());
	public static final BowItem RBOW = new rbow(new FabricItemSettings().maxCount(1));
	public static final ItemGroup RS = FabricItemGroupBuilder.create(
			new Identifier("p", "rs"))
			.icon(() -> new ItemStack(RSTONE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(RSTONE));
				stacks.add(new ItemStack(MATU_TNT));
				stacks.add(new ItemStack(NULL_TNT));
				stacks.add(new ItemStack(RORE));
				stacks.add(new ItemStack(RBLOCK));
				stacks.add(new ItemStack(RARROW));
				stacks.add(new ItemStack(RSWORD));
				stacks.add(new ItemStack(RPAXE));
				stacks.add(new ItemStack(RAXE));
				stacks.add(new ItemStack(RSHOVEL));
				stacks.add(new ItemStack(RHOE));
				stacks.add(new ItemStack(r.R_HELMET));
				stacks.add(new ItemStack(r.R_CHESTPLATE));
				stacks.add(new ItemStack(r.R_LEGGINGS));
				stacks.add(new ItemStack(r.R_BOOTS));
				stacks.add(new ItemStack(RBOW));
			})
			.build();
	private static ConfiguredFeature<?, ?> ORE_WOOL_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BORE.getDefaultState(),
					9)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0,
					0,
					88)))
			.spreadHorizontally()
			.repeat(18);
	private static ConfiguredFeature<?, ?> WOOL_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					RORE.getDefaultState(),
					15)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0,
					0,
					255)))
			.spreadHorizontally()
			.repeat(68);
	@Override
	public void onInitialize() {
		r.register();
		RegistryKey<ConfiguredFeature<?, ?>> oreWoolOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("p", "ore_wool_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWoolOverworld.getValue(), ORE_WOOL_OVERWORLD);
		addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreWoolOverworld);
		RegistryKey<ConfiguredFeature<?, ?>> WoolOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("p", "wool_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, WoolOverworld.getValue(), WOOL_OVERWORLD);
		addFeature(includeByKey(BiomeKeys.OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		addFeature(includeByKey(BiomeKeys.FROZEN_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		addFeature(includeByKey(BiomeKeys.DEEP_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		addFeature(includeByKey(BiomeKeys.WARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		addFeature(includeByKey(BiomeKeys.LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		addFeature(includeByKey(BiomeKeys.COLD_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		addFeature(includeByKey(BiomeKeys.DEEP_WARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		addFeature(includeByKey(BiomeKeys.DEEP_LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		addFeature(includeByKey(BiomeKeys.DEEP_COLD_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		addFeature(includeByKey(BiomeKeys.DEEP_FROZEN_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, WoolOverworld);
		Registry.register(Registry.ITEM, new Identifier("p", "bstone"), BSTONE);
		Registry.register(Registry.ITEM, new Identifier("p", "rstone"), RSTONE);
		Registry.register(Registry.ITEM, new Identifier("p", "gh"), GH);
		Registry.register(Registry.ITEM, new Identifier("p", "bn"), BN);
		Registry.register(Registry.ITEM, new Identifier("p", "ba"), BA);
		Registry.register(Registry.ITEM, new Identifier("p", "bpile"), BPILE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbow"), BBOW);
		Registry.register(Registry.ITEM, new Identifier("p", "bbbow"), BBBOW);
		Registry.register(Registry.ITEM, new Identifier("p", "bbcbow"), BBCBOW);
		Registry.register(Registry.ITEM, new Identifier("p", "bbdcbow"), BBDCBOW);
		Registry.register(Registry.ITEM, new Identifier("p", "bpaxe"), BPAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbpaxe"), BBPAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbcpaxe"), BBCPAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbdcpaxe"), BBDCPAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "baxe"), BAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbaxe"), BBAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbcaxe"), BBCAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbdcaxe"), BBDCAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "bshovel"), BSHOVEL);
		Registry.register(Registry.ITEM, new Identifier("p", "bbshovel"), BBSHOVEL);
		Registry.register(Registry.ITEM, new Identifier("p", "bbcshovel"), BBCSHOVEL);
		Registry.register(Registry.ITEM, new Identifier("p", "bbdcshovel"), BBDCSHOVEL);
		Registry.register(Registry.ITEM, new Identifier("p", "bsword"), BSWORD);
		Registry.register(Registry.ITEM, new Identifier("p", "bbsword"), BBSWORD);
		Registry.register(Registry.ITEM, new Identifier("p", "bbcsword"), BBCSWORD);
		Registry.register(Registry.ITEM, new Identifier("p", "bbdcsword"), BBDCSWORD);
		Registry.register(Registry.ITEM, new Identifier("p", "bhoe"), BHOE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbhoe"), BBHOE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbchoe"), BBCHOE);
		Registry.register(Registry.ITEM, new Identifier("p", "bbdchoe"), BBDCHOE);
		Registry.register(Registry.BLOCK, new Identifier("p", "b_block"), BBLOCK);
		Registry.register(Registry.BLOCK, new Identifier("p", "bc_block"), BBCLOCK);
		Registry.register(Registry.BLOCK, new Identifier("p", "bdc_block"), BBDCLOCK);
		Registry.register(Registry.BLOCK, new Identifier("p", "b_ore"), BORE);
		Registry.register(Registry.BLOCK, new Identifier("p", "matu_tnt"), MATU_TNT);
		Registry.register(Registry.BLOCK, new Identifier("p", "null_tnt"), NULL_TNT);
		Registry.register(Registry.BLOCK, new Identifier("p", "r_ore"), RORE);
		Registry.register(Registry.BLOCK, new Identifier("p", "r_block"), RBLOCK);
		Registry.register(Registry.ITEM, new Identifier("p", "b_block"), new BlockItem(BBLOCK, new Settings()));
		Registry.register(Registry.ITEM, new Identifier("p", "bc_block"), new BlockItem(BBCLOCK, new Settings()));
		Registry.register(Registry.ITEM, new Identifier("p", "bdc_block"), new BlockItem(BBDCLOCK, new Settings()));
		Registry.register(Registry.ITEM, new Identifier("p", "b_ore"), new BlockItem(BORE, new Settings()));
		Registry.register(Registry.ITEM, new Identifier("p", "matu_tnt"), new BlockItem(MATU_TNT, new Settings().maxCount(32)));
		Registry.register(Registry.ITEM, new Identifier("p", "null_tnt"), new BlockItem(NULL_TNT, new Settings().maxCount(16)));
		Registry.register(Registry.ITEM, new Identifier("p", "r_ore"), new BlockItem(RORE, new Settings()));
		Registry.register(Registry.ITEM, new Identifier("p", "r_block"), new BlockItem(RBLOCK, new Settings()));
		Registry.register(Registry.ITEM, new Identifier("p", "rsword"), RSWORD);
		Registry.register(Registry.ITEM, new Identifier("p", "rpaxe"), RPAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "raxe"), RAXE);
		Registry.register(Registry.ITEM, new Identifier("p", "rshovel"), RSHOVEL);
		Registry.register(Registry.ITEM, new Identifier("p", "rhoe"), RHOE);
		Registry.register(Registry.ITEM, new Identifier("p", "rbow"), RBOW);
		Registry.register(Registry.ITEM, new Identifier("p", "rarrow"), RARROW);
		Registry.register(Registry.STRUCTURE_PIECE, new Identifier("p", "hhh"), MY_PIECE);
		FabricStructureBuilder.create(new Identifier("p", "horse"), MY_STRUCTURE)
				.step(GenerationStep.Feature.SURFACE_STRUCTURES)
				.defaultConfig(25, 8, 12345)
				.adjustsSurface()
				.register();

		RegistryKey<ConfiguredStructureFeature<?, ?>> myConfigured = RegistryKey.of(Registry.CONFIGURED_STRUCTURE_FEATURE_WORLDGEN,
				new Identifier("p", "yes"));
		BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, myConfigured.getValue(), MY_CONFIGURED);
		addStructure(includeByKey(BiomeKeys.PLAINS),myConfigured);
	}
}
