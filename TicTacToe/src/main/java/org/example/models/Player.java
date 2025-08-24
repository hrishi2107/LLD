package org.example.models;

import org.example.piece;

public class Player {
    public String name;
    public piece myPiece;
    public piece getMyPiece() {
        return myPiece;
    }

    public String getName() {
        return name;
    }

    Player(playerBuilder builder)
    {
        this.name = builder.name;
        this.myPiece = builder.myPiece;
    }
    public static class playerBuilder{
        private String name;
        private piece myPiece;

        public playerBuilder setName(String name)
        {
            this.name = name;
            return this;
        }
        public playerBuilder setMyPiece(piece myPiece)
        {
            this.myPiece = myPiece;
            return this;
        }
        public Player build()
        {
            return new Player(this);
        }


    }
}
