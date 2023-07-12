
import java.util.*;
public class Sets
{
	public static int[] intersec(int[] a, int[] b){
	    List<Integer> lis=new ArrayList<>();
	    for(int i=0;i<a.length;i++){
	        for(int j=0;j<b.length;j++){
	            if(a[i]==b[j]){
	                lis.add(a[i]);
	            }
	        }
	    }
	    int[] c=new int[lis.size()];
	    for(int i=0;i<lis.size();i++){
	        c[i]=lis.get(i);
	    }
	    return c;
	}
    public static int[] union(int[] a, int[] b,int[] c){
        List<Integer> lis2=new ArrayList<>();
        for(int n : a){
	        lis2.add(n);
	    }
        for(int n : b){
            if(!lis2.contains(n)){
	            lis2.add(n);
	       }
        }
        for(int n : c){
            if(!lis2.contains(n)){
	            lis2.add(n);
	       }
        }
        int [] uni=new int[lis2.size()];
        for(int i=0;i<lis2.size();i++){
            uni[i]=lis2.get(i);
        }
        Arrays.sort(uni);
        return uni;
	    
    }
    public static int[] c(int[] a){
	    List<Integer> list = new ArrayList<>();
	    for(int num : a){
	        if(!list.contains(num)){
	            list.add(num);
	        }
	    }
	    int unq[] = new int[list.size()];
	    for(int i=0;i<list.size();i++){
	        unq[i]=list.get(i);
	    }
	    return unq;
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		int[] b=new int[5];
	    System.out.println("enter 5 elements of array a");
		for(int i=0;i<a.length;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println("enter 5 elements of array b");
		for(int i=0;i<b.length;i++){
		    b[i]=sc.nextInt();
		}
		a=c(a);
		b=c(b);
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("Sorted sets a and b are:");
		for(int i=0;i<a.length;i++){
		    System.out.printf("%d ",a[i]);
		}
		System.out.println();
		for(int i=0;i<b.length;i++){
		    System.out.printf("%d ",b[i]);
		}
		System.out.println();
// 		intersection of a and b
        System.out.println("intersection of the sets a and b are:");

	    int [] inter=new int[a.length];
	    inter=intersec(a,b);
	    System.out.println();
	    for(int i=0;i<inter.length;i++){
	        System.out.printf("%d ",inter[i]);
		}
				System.out.println();

// 		union of the given two sets a and b
        System.out.println("Union of the sets a and b are:");
		int [] uni=new int[2*a.length];
		uni=union(inter,a,b);
		for(int i=0;i<uni.length;i++){
		    System.out.printf("%d ",uni[i]);
		}
	}
}
