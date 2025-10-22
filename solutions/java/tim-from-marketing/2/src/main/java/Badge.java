class Badge {
    public String print(Integer id, String name, String department) {
        String result;
        if (department == null) {
            if (id == null) {
                result = name + " - OWNER";
                return result;
            } else {
                result = "[" + id + "] - " + name + " - OWNER";
                return result;
            }
        }

        if (id == null) {
            result = name + " - " + department.toUpperCase();
            return result;
        }

        result = "[" + id + "] - " + name + " - " + department.toUpperCase();
        return result;
    }
    
}
