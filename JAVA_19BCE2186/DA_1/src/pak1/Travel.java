package pak1;

import java.util.*;
abstract class Travel {
    String name,phn_no,address;
    int age;
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    abstract public void getmethord();
    abstract public void printmethord();
}