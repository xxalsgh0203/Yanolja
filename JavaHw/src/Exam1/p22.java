package Exam1;



public class p22 {
    private class Book{
        private String title;
        private String company;
        private String name;
        private int price;

        Book(String title, String company, String name, int price){
            this.title = title;
            this.company = company;
            this.name = name;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString(){
            return title + " " + company + " " + name + " " + price;
        }
    }
    public static void main(String[] args) {

    }
}
