package friend;

public class ComFriend extends Friend{
    private String department;

    public ComFriend(String name, String phone, String department) {
        super(name, phone);
        this.department = department;

    }
    @Override // Annotaion
    public void showInfo(){
        super.showInfo();
        System.out.println("부서 = " + department);
    }

    @Override
    public String toString() {
        return "ComFriend{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}


