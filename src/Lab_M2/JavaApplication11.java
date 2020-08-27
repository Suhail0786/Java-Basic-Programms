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
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //task1
         /*String str="hello#2$$BD*";
         int count=0;
         int len=str.length();
         for(int i=0;i<len;i++)
         {
             char ch=str.charAt(i);
             if(ch>='a' && ch<='z')
             {
                 count=count;
             }
             else if(ch>='A' && ch<='Z')
             {
                 count=count;
             }
             else if(ch>='0' && ch<='9')
             {
                 count=count;
             }
             else
             {
                 count=count+1;
             }
         }
         System.out.println(count);*/
         
         
        //task2
        /*String str="123";
        String str1="";
        String str2="";
        int n=0;
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            for(int j=0;j<=n;j++)
            {
              str1=str1+ch;
              str2="#";
            }
            System.out.println(str1+str2);     
        }*/
        //System.out.println(str2);
        
        //task3
        /*String str="1234567890";
        int len=str.length();
        String str1="";
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='1')
            {
               ch='A';
            }
            if(ch=='2')
            {
                ch='b';
            }
            if(ch=='3')
            {
                ch='c';
            }
                
            if(ch>='4' && ch<='9')
            {
                ch='x';
                str1=str1+ch;
            }
            else
            {
                ch=ch;
                str1=str1+ch;
            }
        }
        System.out.println(str1);*/
        
        //task4
        /*String str="BAD CAR";
        String str1="";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A')
            {
                ch='B';
            }
            else if(ch=='B')
            {
                ch='A';
            }
            if(ch!='C' && ch!='D')
            {
                str1=str1+ch;
            }
        }
        System.out.println(str1);*/
        
        //task5failed
        /*String str="TRISECT";
        String str1="";
        String str2="";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i+(len/2));
            if((len-1)%2==0)
            {
                str1=str1+ch;
                
            }
            else if((len-1)%2!=0)
            {
                str1=str1+ch;
                str2=str2+ch1;
            }
        }
        System.out.println(str1+str2);*/
        
        //task6
        /*String str="JobReadyJava";
        int len=str.length();
        String str1="";
        String str2="";
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            
            if(i%2!=0)
            {
                str1=str1+ch;
            }
        }
        System.out.println("Odd:"+str1);
        for(int j=0;j<len;j++)
        {
            char ch=str.charAt(j);
            if(j%2==0)
            {
                str2=str2+ch;
            }
        }
        System.out.println("Even:"+str2);*/
        
        //task7failduetoprintmultipletimesyes
        String str="123123";
        String str1="";
        int len=str.length();
        for(int i=0;i<len/2;i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i+(len/2));
            if(ch==ch1)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        
        //task8
        /*String str="Job Ready";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            String str1="";
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            {
                str1=str1+ch;
                System.out.print(str1);
            }
            if(ch==' ')
            {
                System.out.println();   
            }
        }*/
        
        //task9
        /*String str="Job Ready Java";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            String str1="";
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            {
                str1=str1+ch;
                System.out.print(str1);
            }
            else
            {
                System.out.println();
            }
        }*/
        
        //task10
        /*String str="My Name Is";
        int len=str.length();
        String str1="";
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                char ch1=Character.toLowerCase(ch);
                str1=str1+ch1;
                
            }
            else
            {
                str1=str1+ch;
            }
        }
        System.out.println(str1);*/
        
        //task11
        /*String str="My Name Is";
        String str1="";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                char ch1=Character.toUpperCase(ch);
                str1=str1+ch1;
            }
            else
            {
                str1=str1+ch;
            }
        }
        System.out.println(str1);*/
        
        //task12
        /*String str="12 oranges NICE";
        String str1="";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                char ch1=Character.toUpperCase(ch);
                str1=str1+ch1;
            }
            else if(ch>='A' && ch<='Z')
            {
                char ch2=Character.toLowerCase(ch);
                str1=str1+ch2;
            }
            else
            {
                str1=str1+ch;
            }
        }
        System.out.println(str1);*/
        
        //task13 failed
        /*String str1="ABCBD";
        String str2="ABDDD";
        int len=str1.length();
        int len1=str2.length();
        int marks=0;
        for(int i=0;i<len;i++)
        {
            char ch=str1.charAt(i);
            for(int j=0;j<i;j++)
            {
                char ch1=str2.charAt(j);
                if(ch==ch1)
                {
                    marks=marks+4;
                }
                else if(ch!=ch1)
                {
                    marks=marks-1;
                }
                else
                {
                    marks=marks;
                }
            }
        }
        System.out.println(marks);*/
    }
    
}
