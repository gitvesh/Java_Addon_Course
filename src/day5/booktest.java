package day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class booktest {
    public booktest()
    {

    }

    public static void main(String[] args) {
        ArrayList<book> al=new ArrayList<>();
        al.add(new book("Effective java","bhavesh jadhav",300));
        al.add(new book("7 habits","atharv dalvi",323));
        al.add(new book("rich dad poor dad","tejas pandhare",480));
        al.add(new book("money making","jay kadam",280));
        Collections.sort(al);
        for(book bk : al)
        {
            System.out.println(bk);
        }

    }
}
