package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public final class AttackMove extends Move{

    final Piece attackedPiece;

    public AttackMove(final Board board,
                      final Piece movedPiece,
                      final int destinationCoordinate,
                      final Piece attackedPiece) {
        super(board, movedPiece, destinationCoordinate);
        this.attackedPiece = attackedPiece;
    }

    @Override
    public Board execute() {
        return null;
    }
}
