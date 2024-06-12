
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> personList;

    public Employees(){
        this.personList = new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.personList.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        this.personList.addAll(peopleToAdd);
    }

    public void print(){
        /*StringBuilder stringBuilder = new StringBuilder();
        for (Person person : personList) {
            stringBuilder.append(person);
        }
        System.out.println(stringBuilder);*/

        //should be iterator 
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
            
        }
    }
    public void print(Education education){
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation().equals(education)){
                System.out.println(nextPerson);
            }
            
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation().equals(education)){
                iterator.remove();
            }
            
        }
    }


}
