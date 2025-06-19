package problems;

import java.util.HashMap;

class Roman_to_integer {
    public int roman_to_int(String s){
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        for(int i=0; i<s.length(); i++){
            int current = romanMap.get(s.charAt(i));

            if(i < s.length()-1 && current < romanMap.get(s.charAt(i+1))){
                total = total - current;
            }
            else {
                total = total + current;
            }
        }
        return  total;
    }

    public static void main(String[] args) {
        Roman_to_integer rom = new Roman_to_integer();
        System.out.println(rom.roman_to_int("MCXDII"));
    }
}