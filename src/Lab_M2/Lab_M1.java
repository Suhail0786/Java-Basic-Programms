/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_M2;

/**
 *
 * @author USER
 */
public class Lab_M1 {
    public static void main(String[] args){
        
        //task5
        /*int n=75;
        if(n>=90 && n<100)
        {
            System.out.println("Grade A");
        }
        else if(n>=75 && n<90)
        {
            System.out.println("Grade B");
        }
        else if(n>=50 && n<75)
        {;
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }*/
        
        //task6
        /*int a=16,b=45,c=16;
        if(a>=b && c<=b)
        {
            System.out.println(b);
        }
        else if(a>=c && b<=c)
        {
            System.out.println(c);
        }
        else if(c>=a && c<=b)
        {
            System.out.println(c);
        }
        else if(b>=a && b<=c)
        {
            System.out.println(b);
        }
        else if(c>=a && b<=a)
        {
            System.out.println(a);
        }
        else if(a>=c && a<=b)
        {
            System.out.println(a);
        }*/
        
        //task7
        /*int n=5;
        int m=1;
        int x=3;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            m=m*x;
            sum=sum+m;
        }
        System.out.println(sum);*/
        
        //task8
        /*int n=3,x=10;
        int y=1;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            y=y*x;
            sum=sum+y;
        }
        System.out.println(sum);*/
        
        //task9
        /*int a=7,b=5;
        int c=2;
        int m;
        String str="";
        for(int i=1;i<=b;i++)
        {
            m=c*a;
            c++;
            str=m+"#";
            System.out.print(str);
        }*/
        
        //task10
        /*int n=7;
        int m=1;
        int x;
        String str="";
        for(int i=1;i<=n-1;i++)
        {
            x=m*(n*(n-1));
            m++;
            str=x+"#";
            System.out.print(str);
        }*/
        
        //task11
        /*int n=8;
        String str="";
        for(int i=n;i>=1;i--)
        {
            if(i%3==0)
            {
                str=str+"x";
            }
            else
            {
                str=str+i;
            }
            System.out.println(str);
        }*/
        
        //task12
        /*int n=1;
        int x=0;
        String str="";
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                x=x-i;
                str=str+"-"+i;
            }
            if(i%2!=0)
            {
                x=x+i;
                str=str+"+"+i;
            }
        }
        System.out.print(str+"="+x);*/
        
        //task13
        /*int n=9;
        String str="";
        String str1="";
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                str=str+i+"#";
            }
            if(n%i!=0)
            {
                str1=str1+i+"#";
            }
        }
        System.out.println("Divide:"+str);
        System.out.println("Not Divide:"+str1);*/
        
        //task14 failed due to largest number 
        /*int x=20,y=50;
        int num;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0 && y%i==0)
            {
               System.out.println(i);
            }
        }*/
        
        //task15
        /*int n=5;
        String str="";
        for(int i=1;i<=n;i++)
        {
            str=str+"#";
            System.out.print(i+str);
        }*/
        
        //task16
        /*int n=1234;
        int rem;
        int sum=0;
        int temp;
        for(int i=1;i<=4;i++)
        {
            rem=n%10;
            sum=sum+rem;
            temp=n/10;
            n=temp;
        }
        System.out.println(sum);*/
        
        //task17
        /*int a=10,b=20,c=15;
        if(a>b && a>c)
        {
            if((b+c)>a)
            {
                System.out.println("Triangle:Yes");
            }
            else
            {
                System.out.println("Triangle:No");
            }
        }
        else if(b>a && b>c)
        {
            if((a+c)>b)
            {
                System.out.println("Triangle:Yes");
            }
            else
            {
                System.out.println("Triangle:No");
            }
        }
        else if(c>a && c>b)
        {
            if((a+b)>c)
            {
                System.out.println("Triangle:Yes");
            }
            else
            {
                System.out.println("Triangle:No");
            }
        }*/
        
        //task18
        /*int a=10,b=20,c=15;
        if(a>b && a>c)
        {
            if(((b*b)+(c*c))==(a*a))
            {
                System.out.println("Right Angled Triangle:Yes");
            }
            else
            {
                System.out.println("Right Angled Triangle:No");
            }
        }
        else if(b>a && b>c)
        {
            if(((a*a)+(c*c))==(b*b))
            {
                System.out.println("Right Angled Triangle:Yes");
            }
            else
            {
                System.out.println("Right Angled Triangle:No");
            }
        }
        else if(c>a && c>b)
        {
            if(((b*b)+(a*a))==(c*c))
            {
                System.out.println("Right Angled Triangle:Yes");
            }
            else
            {
                System.out.println("Right Angled Triangle:No");
            }
        }*/
    }
}
