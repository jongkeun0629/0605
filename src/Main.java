public class Main {
    public static void main(String[] args) {
        String color = "보라";

        String choiceColor = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : (color == "초록") ? "초록" : "보라";

        // if문 변환
        /*if(color == "빨강"){
            choiceColor = "빨강";
        } else if (color == "파랑") {
            choiceColor = "파랑";
        } else if (color == "초록") {
            choiceColor = "초록";
        } else{
            choiceColor = "보라";
        }*/

        System.out.println(choiceColor);
    }
}