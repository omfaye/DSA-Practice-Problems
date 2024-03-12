class Solutions {
    public static int maximumNumberOfStringPairs(String[] words) {
       
        int count = 0;
        
        
        for(int i=0; i<words.length ;i++)
        {   
            String reverse = "";
            String str = words[i];
            for(int j=str.length()-1; j>=0; j--)
            {
                reverse = reverse + str.charAt(j);
            }
            for(int j=i+1; j<str.length() ; j++)
            {
                if(reverse.equals(words[j]))
                {
                    count++;
                }
            }
        
        }
        return count;   

    }
    public static void main(String args[])
    {
        String words[] = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }
}