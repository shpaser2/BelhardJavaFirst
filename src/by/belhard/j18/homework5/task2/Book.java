package by.belhard.j18.homework5.task2;

public class Book {
    private String name;
    private int pages;
    private Author author;
    private PageFormat format;

    public Book(String name, int pages, String[] authorNames, String[] authorSurnames, int[] authorAges,
                PageFormat format) {
        int authorNamesQuantity = authorNames.length;
        int authorSurnamesQuantity = authorSurnames.length;
        int authorAgesQuantity = authorAges.length;
        int maxLength = 0;
        if(authorNamesQuantity >= authorSurnamesQuantity){
            if(authorNamesQuantity > authorAgesQuantity) {
                maxLength = authorNamesQuantity;
            }else{
                maxLength = authorAgesQuantity;
            }
        }else{
            if(authorSurnamesQuantity > authorAgesQuantity) {
                maxLength = authorSurnamesQuantity;
            }else{
                maxLength = authorAgesQuantity;
            }
        }
        for(int index = 0; index < maxLength; index++){

        }


        //Author author = new Author(authorName, authorSurname, authorAge);
        this.setName(name);
        this.setPages(pages);
        this.author = author;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }else{
            this.name = "empty value";
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages > 2){
            this.pages = pages;
        }else{
            this.pages = 3;
        }
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public PageFormat getFormat() {
        return format;
    }

    public void setFormat(PageFormat format) {
        this.format = format;
    }

    @Override
    public String toString(){
        return "Название книги " + name + ", " +
                "количество страниц " + pages + ", " +
                "имя автора " + author.getName() + ", " +
                "фамилия автора " + author.getSurname() + ", " +
                "возраст автора " + author.getAge() + ", " +
                "формат страниц " + format + ".";
    }
}
