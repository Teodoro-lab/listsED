package Link;

/**
 * Esta solo es una clase de prueba , se utiliza en los métodos de
 * testeo, nótese la implementación del método toStrin e equals.
 */
class Person{
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()){
            return false;
        }
        
        Person person = (Person)obj;

        if(!person.getName().equals(this.getName())){
            return false;
        }

        if(person.getAge() != this.getAge()){
            return false;
        }

        return true;
    }

}


/**
 * LinkedListTest
 */
class LinkedListTest {
    public static Person teo = new Person("Teo", 19);
    public static Person ana = new Person("ana", 29);
    public static Person luis = new Person("luis", 31);
    public static Person soto = new Person("soto", 27);
    public static Person juan = new Person("Juan", 32);


    /** 
     * TODO
     *
     * returnElement()
     * insertInOrder(ascendant = true/false)
     * deleteObject()
     *
     * */
    public static void main(String[] args){
        //checkGetFirstGetLast();
        
        //checkInsertAfter();

        //checkInsertBefore();
        
        //checkClear();

        //checkFindIndex();
        
        //checkReplace();
    }

    public static void checkGetFirstGetLast(){
        System.out.println("checking getFirst & getLast");
        LinkList<Person> lista = new LinkList<>();

        lista.insertFirst(teo);
        lista.insertFirst(juan);
        lista.insertFirst(ana);
        lista.displayList();

        System.out.println(lista.getFirst());
        System.out.println(lista.getLast());
    }
    
    /**
     * FIXME 
     * After the insertion of a node, the following nodes of that
     * node dissapear, check the corresponding function, please :)
     *
     * DONT FORGET TO DELETE THIS ANNOTATION AFTER FIXING
     * */
    public static void checkInsertAfter(){
        System.out.println("checking insertAfter");

        LinkList<Person> lista = new LinkList<>();

        lista.insertFirst(teo);
        lista.insertFirst(juan);
        lista.insertFirst(ana);
        lista.displayList();

        lista.insertAfter(teo, soto);
        lista.insertAfter(ana, luis);
        lista.displayList();
    }

    public static void checkInsertBefore(){
        System.out.println("checking insertBefore");

        LinkList<Person> lista = new LinkList<>();

        lista.insertFirst(teo);
        lista.insertFirst(juan);
        lista.insertFirst(ana);
        lista.displayList();

        lista.insertBefore(teo, soto);
        lista.insertBefore(ana, luis);
        lista.displayList();
    }

    public static void checkFindIndex(){
        LinkList<Person> lista = new LinkList<>();

        lista.insertFirst(teo);
        lista.insertFirst(juan);
        lista.insertFirst(ana);
        lista.displayList();

        System.out.println(lista.findIndex(teo));
        System.out.println(lista.findIndex(juan));
        System.out.println(lista.findIndex(ana));
        System.out.println(lista.findIndex(soto));

   }

   public static void checkClear(){
        System.out.println("checking clear");

        LinkList<Person> lista = new LinkList<>();

        lista.insertFirst(teo);
        lista.insertFirst(juan);
        lista.insertFirst(ana);
        lista.displayList();
        
        lista.clear();
        lista.displayList();
   }

   public static void checkReplace(){
        LinkList<Person> lista = new LinkList<>();

        lista.insertFirst(teo);
        lista.insertFirst(juan);
        lista.displayList();

    	lista.replace(1, luis);
        lista.displayList();

        lista.replace(0, soto);
        lista.displayList();
   }
}
