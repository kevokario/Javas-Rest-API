package karioPackage;

public class karioLogic {

    private int option;

    public karioLogic() {

    }

    public karioLogic(int opt) {
        this.option = opt;
    }

    public void setOption(int opt) {
        this.option = opt;
    }

    public int getOption() {
        return this.option;
    }

    public void Brains() {
        int opt = getOption();
        if (opt == 1) {
           
        } else if (opt == 2) {

        } else if (opt == 3) {
            new karioWorker().addFriends();
        }
    }
}
