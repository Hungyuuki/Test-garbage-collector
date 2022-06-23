public class Scope {
    public static void main(String[] args) {
        String one = new String("a");
        //Đối tượng thật sự ở đây là ký tự String "a",
        //one không phải là một đối tượng mà chỉ là tham chiếu trỏ tới đối tượng.
        String two = new String("b");
        one = two;
        //Đối tượng String "a" đã bị dọn đi trong bộ nhớ và lúc này tham chiếu one đã trỏ tới đối tượng String "b" trong heap
        System.out.println(one + " " + two);
        //Đều ra "b" vì cả hai tham chiếu one và two đều đang trỏ tới "b" trong heap
        String three = one;
        System.out.println(one + " " + two + " " + three);
        //Vì one, two đều đang trỏ tới "b" nên three cũng trỏ tới "b"
        one = null;
        System.out.println(one + " " + two + " " + three);
        //Tương tự nhưng lúc này one đang trỏ tới null
    }
}
