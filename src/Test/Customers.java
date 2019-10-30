package Test;

public class Customers implements Comparable<Customers>{
    private String fullname;
    private int year;
    private String address;

    public Customers(){

    }

    /**
     *
     * @param fullname
     * @param year
     * @param address
     */
    public Customers(String fullname, int year, String address) {
        this.fullname = fullname;
        this.year = year;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "full name is"+this.getFullname()+"\n year:"+this.getYear()+"\n Address:"+this.getAddress();
    }

    @Override
    public int compareTo(Customers otherCus){
        int kq = this.getFullname().compareTo(otherCus.getFullname());
        // neu như ten mà giống nhau thì so sánh tiếp năm sinh
        if(kq!=0)
        return kq;
        kq=this.getAddress().compareTo(otherCus.getAddress());
        return kq;
    }
}
