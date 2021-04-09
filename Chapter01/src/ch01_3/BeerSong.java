package ch01_3;

public class BeerSong {
    public static void main(String[] args){
        int beerNum = 99;
        String word = "bottles";

        while(beerNum > 0){
            if(beerNum == 1){
                word = "bottle";
            }
            System.out.print(beerNum + " " + word + " of beer on the wall, ");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.print("Take one down and ");
            System.out.print("pass it around, ");
            beerNum = beerNum -1;
            if(beerNum == 0){
                System.out.println("No more bottles of beer on the wall.");
            }

            if(beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println();
            }else{
                System.out.println();
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }
        System.out.println();
        System.out.println("by 2017250035 이종수");
    }
}