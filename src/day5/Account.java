package day5;

public class Account {
    public Account()
    {

    }
    private String AccHolder;
    private int AccNum;

    public String getAccHolder() {
        return AccHolder;
    }

    public void setAccHolder(String accHolder) {
        AccHolder = accHolder;
    }

    public int getAccNum() {
        return AccNum;
    }

    public void setAccNum(int accNum) {
        AccNum = accNum;
    }

    int accn=getAccNum();
    public int hashcode()
    {
        final int prime=31;
        int res=1;
        res=prime*res+accn;
        return res;
    }
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        if(obj==null)
        {
            return false;
        }
        if(getClass() !=obj.getClass())
        {
            return false;
        }
        Account other =(Account) obj;
        return false;
    }
}
