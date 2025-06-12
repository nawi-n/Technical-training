import java.util.Scanner;

//to check year on the range of 1900 - 9999 
public class date_checker {
    public static void main(String[] args) {
        String date;
        int dd,mm,yy;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date on the format of dd/mm/yy : ");
        date = sc.nextLine();
        String arr[] = new String[3];
        arr = date.split("/");
        dd= Integer.parseInt(arr[0]);
        mm= Integer.parseInt(arr[1]);
        yy= Integer.parseInt(arr[2]);


        sc.close();
        if(yy>=1900 && yy<=9999){
            if(mm>=1 && mm<=12){
                if((dd>=1 && dd<=31) && (mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)){
                    System.out.println("valid date");
                }
                else if ((dd>=1 && dd<=30) && (mm==4||mm==6||mm==9||mm==11)){
                    System.out.println("valid date");

                }
                else if ((dd>=1 && dd<=28) && (mm==4)){
                    System.out.println("valid date");

                }
                else if ((dd>=0 && dd<=29) && ((yy%4==0 & yy%100!=0 ) || (yy%400==0))){
                    System.out.println("valid date & also its a leap year");

                }
                else{
                    System.out.println("invalid day");
                }
            }
            else{
                System.out.println("invalid month");
            }
        }
        else{
            System.out.println("invalid year");
        }

    
    }
}
