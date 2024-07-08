// shift + f10 현재 설정된 파일 실행
// ctrl + shift + f10 열려진 파일 실행
// ctrl + alt + L 자동정렬
// 인텔리j는 폴더에 하나라도 오류가 있으면 실행이 안됨

//alt +1 프로젝트 경로로 커서감
//alt + insert 파일 생성
// esc 누르면 소스에 커서가 감

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.println(j);
            }
        }
    }
}