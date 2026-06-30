    class SubStr{
        public static void main(String[] args) {
            String str="Programming";
            String st="a";
            boolean flag = false;
            for(int i=0;i<=str.length()-st.length();i++){
                String sub = str.substring(i,st.length()+i);
                if(st.equals(sub)){
                    flag=true;
                }
            
            }
            System.out.println(flag);
            
        }
    }