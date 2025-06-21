class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int m=0,n=arr.length-1;
        while(m<n)
        {
            if(!isvowel(arr[m])){
                m++;
            }
            else if(!isvowel(arr[n])){
                n--;
            }
            else{
                swap(m,n,arr);
                m++;
                n--;
            }
        }  
        return new String(arr);
    }
    public boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
    public void swap(int i,int j,char arr[]){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}