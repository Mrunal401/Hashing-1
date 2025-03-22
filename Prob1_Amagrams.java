class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //this approach is using hashMap
        /*
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str:strs){
            char[] sortedArr = str.toCharArray();//O(k)
            Arrays.sort(sortedArr); //(k log k)
            String sortedStr = String.valueOf(sortedArr); //O(k)

            if(!map.containsKey(sortedStr)){ //O(k)
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);//O(k)
        }
        return new ArrayList<>(map.values());
        */

        //----------------
        //this approach is by creating your own hash function using the prime numbers  
        HashMap<Double, List<String>> map = new HashMap<>();

        double hash = getHash(str);

        if(!map.containsKey(hash)){ //O(k)
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);//O(k)
        }
        return new ArrayList<>(map.values());
    }

    public double getHash(String str){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        //for a more optimized solution, u can also write a code to create the prime nos on your own.

        double hash = 1;

        for(char c: str.toCharArray()){
            hash = hash * primes[c-'a']; //(1). primes[0] -> 97-97.  ; (2). primes[1] -> 98-97
        }
        return hash;
    }
    
}
