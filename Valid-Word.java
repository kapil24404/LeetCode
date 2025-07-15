class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3) return false;
        int vowels=0,consonants=0;
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z'){
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U' ||
                ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
            else if (!Character.isDigit(ch)) {
                return false; 
            }
        }
        return vowels>=1 && consonants>=1;
    }
}