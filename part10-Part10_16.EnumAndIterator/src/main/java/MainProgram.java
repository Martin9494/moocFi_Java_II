




public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
/*        ArrayList<Person> personList = new ArrayList<>();
        Person anna = new Person("Anna", Education.PHD);
        Person wolfgang = new Person("Wolfgang", Education.PHD);
        Person martin = new Person("Martin", Education.BA);
        Person julia = new Person("Julia", Education.BA);
        Person seba = new Person("Seba", Education.MA);
        Person gutfried = new Person("Gutfried", Education.HS);
        Person ggo = new Person("Ggo", Education.PHD);

        personList.add(anna);
        personList.add(wolfgang);
        personList.add(ggo);
        personList.add(gutfried);
        personList.add(seba);
        personList.add(julia);
        personList.add(martin);
        Employees employees = new Employees();
        employees.add(personList);
        
        employees.print(Education.HS);*/

        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
        
    }
}

