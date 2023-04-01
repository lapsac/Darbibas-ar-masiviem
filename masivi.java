import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short[] a = new short[205555555];
		short k=sc.nextInt();
   
if (k<=0){
  for(short i=0;i<a.length; i++){
    a[i]=sc.nextInt();
  }
}

else{
  a[1]=k+1;
  for(short i=1; i<a.length; i++){
    if(a[i-1]+1>k){
    a[i]=a[i-1]+1;
    a[i]=0;
    }
  else{
  a[i]=a[i-1]+1;
  } 
  } 
}
    
for(short i=0;i<a.length;i++){
  System.out.print(a[i]+" ");
}
    
for(short i=0; i<a.length; i++){
  if (a[i]==0){
    for(short j=i; j<a.length; j++){
      if (a[j]!=0){
        a[i]=a[j]; 
        a[j]=0;
        break;
      } 
    }   
  }
}
System.out.println();
    
for(short i=0;i<a.length;i++){
  System.out.print(a[i]+" ");
}
    sc.close();
	}
}
