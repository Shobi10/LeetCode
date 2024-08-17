class Solution {
    public String reverseWords(String s) {
        String c="";
        String[] d=s.trim().split("\\s+");
        for(int i=d.length-1;i>=0;i--)
        {
            c=c+d[i]+" ";
        }
       return c.trim();
    }
}