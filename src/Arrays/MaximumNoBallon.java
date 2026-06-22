package Arrays;

class Soln{
    public int maxNumberOfBalloons(String text) {

        int [] count=new int [26];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            count[ch-'a']++;


        }
        int b=count['b'-'a'];
        int a=count['a'-'a'];
        int l=count['l'-'a']/2;
        int o=count['o'-'a']/2;
        int n=count['n'-'a'];


        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))))  ;
    }
}
public class MaximumNoBallon{
    public static void main(String[] args){
Soln sol=new Soln();
String text="nlaebolko";
int result=sol.maxNumberOfBalloons(text);
System.out.println(result);
    }
}