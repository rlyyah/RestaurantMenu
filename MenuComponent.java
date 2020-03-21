public abstract class MenuComponent{

    // Composite Methods
    public void add(MenuComponent menuComopnent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    // "operation" methods used by the MenuItems
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    // print is "operation" method that both our Menus and MenuItems will implement
    public void print(){
        throw new UnsupportedOperationException();
    }
}