package Day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces =
                {ChessPiece.PAWN_BLACK,
                 ChessPiece.PAWN_BLACK,
                 ChessPiece.PAWN_BLACK,
                 ChessPiece.PAWN_BLACK,
                 ChessPiece.ROOK_BLACK,
                 ChessPiece.ROOK_BLACK,
                 ChessPiece.ROOK_BLACK,
                 ChessPiece.ROOK_BLACK};
        for (ChessPiece pieces: chessPieces) {
            System.out.print(pieces);
        }
    }
}
