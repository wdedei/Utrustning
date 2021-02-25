package net.fabricmc.example;

import net.minecraft.structure.*;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class MyGenerator {
    private static final Identifier IPG = new Identifier("1");
    public static void addPieces(StructureManager manager, BlockPos pos, BlockRotation rotation, List<StructurePiece> pieces) {
        pieces.add(new MyPiece(manager, pos, IPG, rotation));
    }
}
