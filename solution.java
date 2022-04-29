package Lv1;

class solution {
    public static int s(String s) {
        int answer = 0;
        String [] compare = {"zero", "one", "two", "three", "four",
        		"five", "six", "seven", "eight", "nine"};
        String [] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i=0; i<s.length(); i++)
        	s = s.replace(compare[i], num[i]);
        
        answer = Integer.parseInt(s);
        return answer;
    }
    
	public static void main(String[] args) {
		System.out.println(s("23four5six7"));
	}

}
