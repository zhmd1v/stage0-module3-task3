package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //write code here
        int first, second, third, linkToFirst, linkToSecond, linkToThird;
        first = 1;
        second = 10;
        third = 100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        linkToFirst = first;
        linkToSecond = second;
        linkToThird = third;

        first = 15;
        second = 6;
        third = 4;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);


    }
}
