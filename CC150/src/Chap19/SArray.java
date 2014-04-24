package Chap19;
public class SArray {
    static final int maxn = 26;
    int[] wa = new int[maxn];
    int[] wb = new int[maxn];
    int[] ws = new int[maxn];
    int[] wv = new int[maxn];
    boolean cmp(int[] r,int a,int b,int l)
    {return r[a]==r[b]&&r[a+l]==r[b+l];}
    void da(int[] r,int[] sa,int n,int m)
    {
        int i,j,p;
        int[] x=wa; int[] y=wb; int[] t;
        for(i=0;i<m;i++) ws[i]=0;
        for(i=0;i<n;i++) ws[x[i]=r[i]]++;
        for(i=1;i<m;i++) ws[i]+=ws[i-1];
        for(i=n-1;i>=0;i--) sa[--ws[x[i]]]=i;
        for(j=1,p=1;p<n;j*=2,m=p)
        {
            for(p=0,i=n-j;i<n;i++) y[p++]=i;
            for(i=0;i<n;i++) if(sa[i]>=j) y[p++]=sa[i]-j;
            for(i=0;i<n;i++) wv[i]=x[y[i]];
            for(i=0;i<m;i++) ws[i]=0;
            for(i=0;i<n;i++) ws[wv[i]]++;
            for(i=1;i<m;i++) ws[i]+=ws[i-1];
            for(i=n-1;i>=0;i--) sa[--ws[wv[i]]]=y[i];
            for(t=x,x=y,y=t,p=1,x[sa[0]]=0,i=1;i<n;i++)
                x[sa[i]]=cmp(y,sa[i-1],sa[i],j)?p-1:p++;
        }
        for(int s : r) {
            System.out.print(s+" ");
        }
        System.out.println();
        for(int s : sa) {
            System.out.print(s+" ");
        }
    }
}

