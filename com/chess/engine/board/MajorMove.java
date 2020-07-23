package com.chess.engine.board;

import com.chess.engine.pieces.Piece;
import static com.chess.engine.board.Board.*;

public final class MajorMove extends Move{

    public MajorMove(final Board board,
                     final Piece movedPiece,
                     final int destinationCoordinate) {
        super(board, movedPiece, destinationCoordinate);
    }

    @Override
    public Board execute() {
        final Builder builder = new Builder();
        for(final Piece piece : this.board.currentPlayer().getActivePieces()) {
            //TODO hashcode and equals for pieces
            if(!this.movedPiece.equals(piece)) {
                builder.setPiece(piece);
            }
        }
        for(final Piece piece : this.board.currentPlayer().getOpponent().getActivePieces()) {
            builder.setPiece(piece);
        }
        //move the moved piece!
        builder.setPiece(this.movedPiece.movePiece(this));
        builder.setMoveMaker(this.board.currentPlayer().getOpponent().getAlliance());
        return null;
    }
}
