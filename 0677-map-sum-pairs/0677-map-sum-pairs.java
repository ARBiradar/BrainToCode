class MapSum {

    private Map<String, Integer> mapSum;
    
    public MapSum() 
    {
     mapSum = new HashMap<>();   
    }
    
    public void insert(String key, int val)
    {
        if(key.length() < 1 || val < 1 || val > 1000)
        {
            return;
        }
        mapSum.put(key,val);
    }
    
    public int sum(String prefix) 
    {
        int sum = 0;
        for(Map.Entry<String,Integer> key: mapSum.entrySet())
        {
            if(key.getKey().startsWith(prefix))
            {
                sum += key.getValue();
            }
        }

        return sum;
        
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */