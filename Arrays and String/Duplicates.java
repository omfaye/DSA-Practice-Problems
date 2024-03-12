public class Duplicates
{   
    public static void removeDuplicate(String str)
    {
        StringBuilder newstr = new StringBuilder("");
        boolean map[] = new boolean[26];
        for(int i=0;i<str.length();i++)
        {
            char currChar = str.charAt(i);
            if(map[currChar-'a']==true)
            {
                continue;
            }
            else
            {
                map[currChar-'a']=true;
                newstr.append(currChar);
            }
        }
        System.out.println(newstr);
    }
    public static void main(String args[])
    {
        String str = "ommfaaye";
        removeDuplicate(str);
    }
}
