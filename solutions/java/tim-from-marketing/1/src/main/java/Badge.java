class Badge {
    public String print(Integer id, String name, String department) {
        String result;
        if(department==null)
        {
            if(id==null){
                 result = String.format("%s - OWNER",name);
                return result;
            }
            else
            {
                result = String.format("[%d] - %s - OWNER",id,name);
                return result;
            }
        }
        if(id==null){
             result = String.format("%s - %s",name,department.toUpperCase());
        return result;
        }
       
        result = String.format("[%d] - %s - %s",id,name,department.toUpperCase());
        return result;
        
    }
}
