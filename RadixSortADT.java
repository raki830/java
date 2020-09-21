import java.util.*;
public class RadixSortADT
{
                public static void main(String args[])
                {
                           Scanner sc=new Scanner(System.in);
                           System.out.println("enter size");
                           int n=sc.nextInt();
                           int a[]=new int[n];
                          System.out.println("enter elements");
                           for(int i=0;i<n;i++)
                                      a[i]=sc.nextInt();
                           System.out.println("before sorting");
                           display(a,n);
                           radixsort(a,n);
                           System.out.println("after sorting");
                           display(a,n);
                }
               public static void display(int a[],int n)
               {
                          for(int i=0;i<n;i++)
                                  System.out.print(a[i]+" ");
               }
              public static void radixsort(int a[],int n)
              {
                   int bucket[][]=new int[10][15];
                   int b[]=new int[10];
                   int big,count,div,digit;
                   int i,j,k,p;
                   big=a[0];
                   for(i=0;i<n;i++)
                   {
                             if(big<a[i])
                                    big=a[i];
                   }
                    count=0;
                   while(big>0)
                   {
                        big=big/10;
                        count++;
                    }
                  div=1;
                  for(p=0;p<count;p++ )
                  {          
                             
                             for(i=0;i<n;i++)
                             {
                                digit=(a[i]/div)%10;
                                bucket[digit][b[digit]++]=a[i];
                             }
                             i=0;
                             for(k=0;k<10;k++)
                             {
                                      for(j=0;j<b[k];j++)
                                      {
                                               a[i]=bucket[k][j];
                                               i++;
                                       }
                              }
                              
                              div=div*10;
                  }
            }

      }                          