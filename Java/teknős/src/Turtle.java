public class Turtle {
    private int posX;
    private int posY;
    private boolean pen;
    private int mapX;
    private int mapY;


    public Turtle(int mapX, int mapY) {
        this.posX = 0;
        this.posY = 0;
        this.pen = false;
        this.mapX = mapX;
        this.mapY = mapY;
    }

    public boolean move(String str) {
        if(str.equals("FEL")){
            if (0<=this.posX){
                posX--;
                return true;
            }
        }
        if(str.equals("LE")){
            if (this.mapY>=this.posX){
                posX++;
                return true;
            }
        }
        if(str.equals("BALRA")){
            if (0<=this.posY){
                posY--;
                return true;
            }
        }
        if(str.equals("JOBBRA")){
            if (this.mapX>=this.posY){
                posY++;
                return true;
            }
        }

return false;
    }


    public void changePen(boolean pen) {
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "Teknő X=" + posX +
                ", Teknő Y=" + posY +
                ", Rajzol-e HE?" + pen +
                ", Pálya X=" + mapX +
                ", Pálya Y=" + mapY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isPen() {
        return pen;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }

    public int getMapX() {
        return mapX;
    }

    public void setMapX(int mapX) {
        this.mapX = mapX;
    }

    public int getMapY() {
        return mapY;
    }

    public void setMapY(int mapY) {
        this.mapY = mapY;
    }

}
