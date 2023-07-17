package Strings;

public class ShortestPath {
    static float getShortestPath(String path){
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            if (direction == 'W'){
                x--;
            } else if (direction=='E') {
                x++;
            } else if (direction == 'N') {
                y++;
            } else if (direction=='S') {
                y--;
            }
        }
        return (float) (Math.sqrt(x*x + y*y));

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float ans = getShortestPath(path);
        System.out.println(ans);

    }
}
