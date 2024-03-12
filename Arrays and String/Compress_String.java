import java.util.*;
public class Compress_String {
        public static int compress(char[] chars) {
            StringBuilder result = new StringBuilder("");
            Integer count = 1;
            char last = chars[0];
            for(int i=1;i<chars.length;i++)
            {
                if(chars[i] == last){
                    count++;
                }else{
                    if(count>1){
                        result.append(last+count.toString());
                    }else{
                        result.append(last);
                    }
                    count=1;
                    last = chars[i];
                }
            }
            if(count>1)
            {
                result.append(last+count.toString());
            }else{
                result.append(last);
            }
            char[] comp = result.toString().toCharArray();
            for(int i=0;i<comp.length;i++){
                chars[i]=comp[i];
            }
            return comp.length;

        } 
        public static void main(String[] args) {
            char chars[] = {"a","a","a","b","b","c","c"};
            compress(chars);

        }
    } 
