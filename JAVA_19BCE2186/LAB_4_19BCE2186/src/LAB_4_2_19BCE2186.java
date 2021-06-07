import java.util.*;
import java.io.*;
class Rooms_19BCE2186 implements Serializable {
    int size;
    int roomno;
    int all_no;
    Rooms_19BCE2186() {
        size = 2;
    }
    Rooms_19BCE2186(int roomno,int size) {
        this.roomno = roomno;
        this.size = size;
        this.all_no = 0;
    }
}
class Student_reg_19BCE2186 implements Serializable {
    String personName;
    String registration_number;
    float GradePoint;
    int roomNum;
    int room_alloc;
    Student_reg_19BCE2186(String personName,String registration_number,float GradePoint,int roomNum) {
        this.personName = personName;
        this.registration_number = registration_number;
        this.GradePoint = GradePoint;
        this.roomNum = roomNum;
    }
}

class MensHostel_19BCE2186 implements Serializable {
    String bl_person_name;
    Rooms_19BCE2186 r[] = new Rooms_19BCE2186[2];
    static int choose;
    MensHostel_19BCE2186(String bl_person_name,int n) {
        this.bl_person_name = bl_person_name;
        for(int i = 0;i<n;i++) {
            r[i] = new Rooms_19BCE2186();
        }
        r[0] = new Rooms_19BCE2186(612,2);
        r[1] = new Rooms_19BCE2186(613,2);

    }
    synchronized int bkk(Student_reg_19BCE2186[] sort_CGPA) throws InterruptedException {
        for(Student_reg_19BCE2186 sort_CGPA1:sort_CGPA) {
            if(sort_CGPA1.room_alloc == 0) {
                for(Rooms_19BCE2186 r1:r) {
                    if((sort_CGPA1.roomNum == r1.roomno)&&(r1.all_no < r1.size)) {
                        sort_CGPA1.room_alloc = sort_CGPA1.roomNum;
                        r1.all_no += 1;
                        choose =+ 1;
                        if(choose == 1) {
                            wait();
                        }
                        if(choose > 1 && choose < sort_CGPA.length-2) {
                            notifyAll();
                            wait();
                        }
                        System.out.println("Alloted Scenario!!!");
                        for(Student_reg_19BCE2186 oo1:sort_CGPA) {
                            System.out.println(oo1.registration_number+" "+oo1.personName+" "+oo1.GradePoint+" "+oo1.room_alloc+" "+oo1.roomNum);
                        }
                    }
                }
                if(choose == sort_CGPA.length-1)
                    return 1;
                return 0;
            }
        }
        return 0;
    }
}
class ChiefWarden extends Thread {
    MensHostel_19BCE2186 mh1;
    Student_reg_19BCE2186[] sort_CGPA = new Student_reg_19BCE2186[5];
    ChiefWarden(MensHostel_19BCE2186 mh1,Student_reg_19BCE2186[] sort_CGPA) {
        this.mh1 = mh1;
        this.sort_CGPA = sort_CGPA;
    }
    @Override
    public void run() {
        int h = 0;
        try{
            h = mh1.bkk(sort_CGPA);
            if(h == 1){
                interrupt();
            }
        }
        catch(Exception ex) {
            System.out.println("Interrupt! " +ex);
        }
    }
}
public class LAB_4_2_19BCE2186 {
    public static void main(String[] args) throws Exception {
        ArrayList<Student_reg_19BCE2186> MyList = new ArrayList<>();
        MyList.add(new Student_reg_19BCE2186("19BCE0262","JAY",8.2f,612));
        MyList.add(new Student_reg_19BCE2186("19BCE2021","ARYAN",9.1f,613));
        MyList.add(new Student_reg_19BCE2186("19BCE2365","UTKARSH",7.5f,614));

        FileOutputStream fout = new FileOutputStream("D:\\JAVA\\HostelReg.txt");
        ObjectOutputStream ot = new ObjectOutputStream(fout);
        ot.writeObject(MyList);
        ot.close();
        System.out.println(">room alloted!");
        FileInputStream fin = new FileInputStream("D:\\JAVA\\HostelReg.txt");
        ObjectInputStream on = new ObjectInputStream(fin);
        ArrayList<Student_reg_19BCE2186> sdList = new ArrayList<>();
        while(fin.available()!=0) {
            sdList = (ArrayList<Student_reg_19BCE2186>)on.readObject();
        }
        sdList.sort((oo1,oo2)->{return(int)(oo1.GradePoint-oo2.GradePoint);});
        Collections.reverse(sdList);
        sdList.forEach(o->System.out.println(o.registration_number+" "+o.personName+" "+o.GradePoint+" "+o.room_alloc+" "+o.roomNum));
        on.close();
        Student_reg_19BCE2186[] sort_CGPA = sdList.toArray(new Student_reg_19BCE2186[sdList.size()]);
        MensHostel_19BCE2186 mh1 = new MensHostel_19BCE2186("Space 1",2);
        ChiefWarden cw1 = new ChiefWarden(mh1,sort_CGPA);
        ChiefWarden cw2 = new ChiefWarden(mh1,sort_CGPA);
        cw1.start();
        cw2.start();
    }
}