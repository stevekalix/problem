
class SubstringCount {
    public static void main(String[] args) {
         String pat = "rain";
         char p[]= pat.toCharArray();
        int num =0;
        for(char ch : p){
            num += (int)ch-'a';
        }
        
        
        
        System.out.println(num);
    }
}