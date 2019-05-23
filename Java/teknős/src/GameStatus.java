import java.io.*;

public class GameStatus {
    private char[][] savemap;

    public GameStatus(char[][] savemap) {
        this.savemap = savemap;
    }
    public void writeFile(String filePath){

        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)))){

            bufferedWriter.write(this.savemap.length+"\n");
            bufferedWriter.write(this.savemap[0].length+"\n");

            for (int i = 0; i <savemap.length ; i++) {
                for (int j = 0; j <savemap[0].length ; j++) {

                    bufferedWriter.write(this.savemap[i][j]+";");
                }
                bufferedWriter.write("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException d){
            d.printStackTrace();
        }
    }
    public char[][] readFile(String filePath, char[][] arr){
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            int mapWidth = Integer.parseInt(bufferedReader.readLine());
            int mapHeight = Integer.parseInt(bufferedReader.readLine());
            arr = new char[mapWidth][mapHeight];
            for (int i = 0; i <mapWidth ; i++) {
                String[] map1 = bufferedReader.readLine().split(";");
                for (int j = 0; j <map1.length ; j++) {
                    arr[i][j]=map1[j].charAt(0);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return arr;
    }
}
