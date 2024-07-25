public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> result = new ArrayList<>();
    int alicePoints = 0;
    int bobPoints = 0;
    for(int i = 0; i < 3; i++){
        if(a.get(i) > b.get(i)){
            alicePoints++;
        }
        else if(a.get(i) < b.get(i)){
            bobPoints++;
        }
    }
    result.add(alicePoints);
    result.add(bobPoints);
    return result;
}
