public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Table createTable() {
        System.out.println("Modern Table created");
        return new ModernTable();
    }

    @Override
    public Chair createChair() {
        System.out.println("Modern Chair created");
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Modern Sofa created");
        return new ModernSofa();
    }
}
