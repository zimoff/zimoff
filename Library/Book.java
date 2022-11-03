class Book {
    private String author;
    private String name;
    private String description;
    private int pageNum;

    Book(String author, String name, String description, int pageNum) {
        this.author = author;
        this.name = name;
        this.description = description;
        this.pageNum = pageNum;
    }

    String getAuthor() { return author;}
    String getName() { return name;}
    void getDescription() { 
        String[] words = description.split(" ");
        int count = 0;
        for(String w1: words) {
            count++;
            System.out.print(w1 + " ");
            //System.out.print("count: " + count);
            if(count == 7) { 
                System.out.println();
                count = 0;
            }
        }
    }

    int getPage() { return pageNum;}

    public String toString() {
        return name; 
    }
}
