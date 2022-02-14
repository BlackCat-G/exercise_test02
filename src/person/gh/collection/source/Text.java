package person.gh.collection.source;

import javax.swing.*;

public class Text implements ViTree{

    @Override
    public void getImage() {

    }

    @Override
    public void getText() {

    }

    @Override
    public void OnGlobalLayoutListener() {

    }

    public  void say(){
        System.out.println("我是你爹");
    }
    public void addOnGlobalLayoutListener(ViTree viTree){
       viTree.OnGlobalLayoutListener();
    }
}
