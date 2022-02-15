package person.gh.collection.source;

public class getData {
    private int x;
    private int y;
    public getData(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int add(){
        return  this.x+this.y;
    }
    /**
     * description: implment div
     * version: 1.0
     * date: 2022/2/15 9:48
     * author: Gaohang
     *
     * @param
     * @return int
     */
    public int div(){
        return this.x-this.y; // 下次写代码注意格式
    }
}
