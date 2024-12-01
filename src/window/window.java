package window;

abstract class window {
    abstract String getWindow();
}
class PWwindow extends window{
 public String  getWindow(){
    return "PW window made";
 }
}

class Motifwindow extends window{
    public String getWindow(){
        return "Motif window made";
    }
}
