    /* Daffodils */
    static boolean isDaffodils(int params){
        int hundred = params / 100;
        int decade = params /10 % 10;
        int unit = params % 10;

        double sum = Math.pow(hundred,3) + Math.pow(decade,3) + Math.pow(unit,3);
        if (sum == params){
            return true;
        }
        return  false;
    }
