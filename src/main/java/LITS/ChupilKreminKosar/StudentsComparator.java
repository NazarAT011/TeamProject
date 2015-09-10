package LITS.ChupilKreminKosar;

import java.util.Comparator;

public class StudentsComparator implements Comparator<Student>{

    public int compare(Student o1, Student o2) {
        if (o1.getSurname().contentEquals(o2.getSurname()))
            return Integer.compare(o1.getAge(), o2.getAge());
        return o1.getSurname().compareTo(o2.getSurname());
    }
}

