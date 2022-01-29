

abstract class Persistences{
    abstract void persist();
}

class FilePersistence extends Persistences{
    @Override
    void persist(){
        System.out.println("FilePersitence");
    }

}

class DatabasePersistence extends Persistences{
    @Override
    void persist(){
        System.out.println("DatabasePersistence");
    }
}

public class Persistence {
    public static void main(String[] args) {
        Persistences filepersistence = new FilePersistence();
        filepersistence.persist();

    }
}
