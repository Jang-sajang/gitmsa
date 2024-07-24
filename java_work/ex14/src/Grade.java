import java.util.ArrayList;
import java.util.Scanner;

public class Grade {
    private String name;
    private double[] grades;

    public Grade(String name, double... grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        return Math.round(average * 100) / 100.0; // 소수점 둘째 자리에서 반올림
    }

    public void printGrades() {
        System.out.print(name + ": ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }
}

class GradeManagementSystem {
    private static ArrayList<Grade> grades = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        grades.add(new Grade("강백호", 90.0, 85.5, 70.0));
        grades.add(new Grade("채치수", 82.0, 92.0, 60.5));

        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    printAverage();
                    break;
                case 3:
                    printAllStudents();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("성적관리 프로그램");
        System.out.println("1. 학생 추가");
        System.out.println("2. 평균 계산");
        System.out.println("3. 전체 학생 목록 출력");
        System.out.println("4. 종료");
        System.out.print("선택: ");
    }

    private static void addStudent() {
        System.out.print("학생 이름: ");
        String name = scanner.nextLine();
        System.out.print("성적 (세 과목): ");
        double grade1 = scanner.nextDouble();
        double grade2 = scanner.nextDouble();
        double grade3 = scanner.nextDouble();
        scanner.nextLine(); // consume the newline
        grades.add(new Grade(name, grade1, grade2, grade3));
        System.out.println(name + " 학생이 추가되었습니다.");
    }

    private static void printAverage() {
        System.out.print("평균을 계산할 학생 이름: ");
        String name = scanner.nextLine();
        Grade student = findStudent(name);
        if (student == null) {
            System.out.println("학생을 찾을 수 없습니다.");
            return;
        }
        System.out.println(name + " 학생의 평균 성적: " + student.getAverage());
    }

    private static void printAllStudents() {
        if (grades.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        System.out.println("전체 학생 목록:");
        for (Grade grade : grades) {
            grade.printGrades();
        }
    }

    private static Grade findStudent(String name) {
        for (Grade grade : grades) {
            if (grade.getName().equalsIgnoreCase(name)) {
                return grade;
            }
        }
        return null;
    }
}
