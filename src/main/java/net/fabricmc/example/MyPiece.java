
package net.fabricmc.example;

import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.loot.LootTables;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.structure.SimpleStructurePiece;
import net.minecraft.structure.Structure;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.processor.BlockIgnoreStructureProcessor;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorldAccess;

import java.util.Random;

public class MyPiece extends SimpleStructurePiece {
    public final Identifier loot = new Identifier("loot");
    private final BlockRotation rotation;
    private final Identifier template;

    public MyPiece(StructureManager structureManager, CompoundTag compoundTag) {
         super(ExampleMod.MY_PIECE, compoundTag);
        this.template = new Identifier(compoundTag.getString("Template"));
        this.rotation = BlockRotation.valueOf(compoundTag.getString("Rot"));
        this.initializeStructureData(structureManager);
    }

    public MyPiece(StructureManager structureManager, BlockPos pos, Identifier template, BlockRotation rotation) {
        super(ExampleMod.MY_PIECE, 0);
        this.pos = pos;
        this.rotation = rotation;
        this.template = template;

        this.initializeStructureData(structureManager);
    }

    private void initializeStructureData(StructureManager structureManager) {
        Structure structure = structureManager.getStructureOrBlank(this.template);
        StructurePlacementData placementData = (new StructurePlacementData())
                .setRotation(this.rotation)
                .setMirror(BlockMirror.NONE)
                .addProcessor(BlockIgnoreStructureProcessor.IGNORE_STRUCTURE_BLOCKS);
        this.setStructureData(structure, this.pos, placementData);
    }

    protected void toNbt(CompoundTag tag) {
        super.toNbt(tag);
        tag.putString("Template", this.template.toString());
        tag.putString("Rot", this.rotation.name());
    }

    public void handleMetadata(String metadata, BlockPos pos, ServerWorldAccess serverWorldAccess, Random random, BlockBox boundingBox) {
        if ("chest".equals(metadata)) {
            serverWorldAccess.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
            BlockEntity blockEntity = serverWorldAccess.getBlockEntity(pos.down());
            if (blockEntity instanceof ChestBlockEntity) {
                ((ChestBlockEntity)blockEntity).setLootTable(loot, random.nextLong());
            }

        }
    }
}
