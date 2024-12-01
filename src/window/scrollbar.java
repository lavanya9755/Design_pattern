package window;

abstract class scrollbar {
    abstract String getscrollbar();
}

 class PWscrollbar extends scrollbar{
 public String getscrollbar(){
    return "PW scroll bar";
 }
}

class motifscrollbar extends scrollbar{
    public String getscrollbar(){
        return "motif scrollbar";
    }
}
