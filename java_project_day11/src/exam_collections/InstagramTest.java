package exam_collections;

import java.util.Scanner;

public class InstagramTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InstagramInfo insta = new InstagramInfo();

        System.out.println("회원가입 시작합니다.");
        System.out.print("ID를 입력하세요. : ");
        String id = sc.nextLine();
        System.out.print("Password를 입력하세요. : ");
        String pw = sc.nextLine();
        insta.join(id,pw);
        System.out.println("가입 완료 되었습니다.");

        System.out.print("비밀번호 찾기. ID를 입력하세요 : ");
        id = sc.nextLine();
        System.out.println("비밀번호는 : " + insta.findPw(id));

        System.out.println("사진을 업로드 합니다.");
        System.out.print("제목을 입력하세요 : ");
        String title = sc.nextLine();
        System.out.print("날짜를 입력하세요 : ");
        String date = sc.nextLine();
        Photo p1 = new Photo(title, date);
        insta.uploadPhoto(p1);

        System.out.println("사진을 업로드 합니다.");
        System.out.print("제목을 입력하세요 : ");
         title = sc.nextLine();
        System.out.print("날짜를 입력하세요 : ");
         date = sc.nextLine();
        Photo p2 = new Photo(title, date);
        insta.uploadPhoto(p2);

        System.out.println("사진을 봅시다.");
        insta.getPhotos();
        for (int i = 0; i < insta.getPhotos().size(); i++) {
            System.out.println(insta.getPhotos().get(i).getTitle());
            System.out.println(insta.getPhotos().get(i).getDate());
        }

        System.out.print("지우고 싶은 사진 제목 입력하세요 :");
        title = sc.nextLine();
        insta.deletePhoto(title);

        System.out.println("사진을 봅시다.");
        insta.getPhotos();
        for (int i = 0; i < insta.getPhotos().size(); i++) {
            System.out.println(insta.getPhotos().get(i).getTitle());
            System.out.println(insta.getPhotos().get(i).getDate());
        }

        System.out.println("사진봤으니 탈퇴하세요.");
        System.out.print("ID를 입력하세요. : ");
         id = sc.nextLine();
        System.out.print("Password를 입력하세요. : ");
         pw = sc.nextLine();
        insta.exit(id,pw);

        System.out.println("정말 탈퇴? 아이디 입력");
        id = sc.nextLine();
        String a = insta.findPw(id);
        System.out.println(a);




    }
}
