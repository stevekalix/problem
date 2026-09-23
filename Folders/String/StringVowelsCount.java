package Folders.String;

public class StringVowelsCount {
    

    public static void main(String[] args) {
        String str = "civic";


        int arr[]=  new int[26];
        int vowel =0;
        for(char ch : str.toCharArray()){
            arr[ch-'a']++;
            if(ch =='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
        }

        
    }
}
