import java.util.Arrays;

public class Map {
    char[][] arr;
    Turtle turtle;

    public Map(int i, int j) {
        this.arr = new char[i][j];
        this.turtle = new Turtle(i, j);
        for (char[] row : this.arr)
            Arrays.fill(row, ' ');
        this.arr[0][0] = '$';
    }

    public void draw() {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                System.out.printf(String.valueOf(arr[i][j]));
            }
            System.out.println();
        }
    }

    public void doCommand(String command1) {
        if(command1.equals("tollat le")){
            turtle.changePen(true);
        }else if(command1.equals("tollat fel")){
            turtle.changePen(false);
        }else  if (command1.equals("torol")){
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] =='#'){
                        arr[i][j] =' ';

                    }

                }
            }
}       else if(command1.startsWith("FEL ")){
        moveDir(command1);
        }else if(command1.startsWith("LE ")){
            moveDir(command1);
        }else if(command1.startsWith("JOBBRA ")){
            moveDir(command1);
        }else if(command1.startsWith("BALRA ")){
            moveDir(command1);
        }else if(command1.startsWith("GITPUSH ")){
            String[] commandz = command1.split(" ");
            GameStatus gameStatus= new GameStatus(arr);
            gameStatus.writeFile(commandz[1]);
        }else if(command1.startsWith("GITPULL")){
            String[] commandz = command1.split(" ");
            GameStatus gameStatus= new GameStatus(arr);
            this.arr=gameStatus.readFile(commandz[1],this.arr);
            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j <arr[i].length ; j++) {
                    if(arr[i][j]=='$'){
                        turtle.setPosX(i);
                        turtle.setPosY(j);
                    }
                }

            }
        }
    }

public void moveDir(String command){
    String[] str= command.split(" ");
    if(turtle.getPosY()+Integer.parseInt(str[1])>=10 || turtle.getPosX()+Integer.parseInt(str[1])>=10 ){
System.out.println("túl nagy");
    }else {
        int n = Integer.parseInt(str[1]);
        for (int i = 0; i < n; i++) {
            int x = turtle.getPosX();
            int y = turtle.getPosY();
            if (turtle.isPen()){
                this.arr[x][y]='#';
            } else {
                this.arr[x][y]=' ';
            }
            turtle.move(str[0]);
            this.arr[turtle.getPosX()][turtle.getPosY()]='$';
        }
    }
    }
}