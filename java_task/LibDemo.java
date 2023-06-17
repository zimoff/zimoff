import java.util.Scanner;
import java.util.ArrayList;
class LibDemo {

    //BOOK 1
    String name1 = "Sapiens";
    String author1 = "Yuval Noah Harari"; 
    String description1 = "One of the world's preeminent historians and thinkers," + 
            "Yuval Noah Harari challenges everything we know about being human." + 
            "Earth is 4.5 billion years old. In just a fraction of that time," + 
            "one species among countless others has conquered it: us.In this bold and provocative book," + 
            "Yuval Noah Harari explores who we are, how we got here and where we're going.";

    int pageNum1 = 555;


    //BOOK 2
    String name2 = "How the World Really Works";
    String author2 = "Vaclav Smil";
    String description2 = "We have never had so much information at our fingertips and" + 
                "yet most of us don't know how the world really works." + 
                "This book explains seven of the most fundamental realities governing our survival and prosperity." + 
                "From energy and food production, through our material world and its globalization," + 
                "to risks, our environment and its future, How the World Really Works offers a much-needed reality check - " + 
                "because before we can tackle problems effectively, we must understand the facts.";
    int pageNum2 = 444;

    //BOOK 3
    String name3 = "The Self-Taught Computer Scientist";
    String author3 = "C Althoff";
    String description3 = "Fresh out of college and with just a year of self-study behind him," + 
           "Cory Althoff was offered a dream first job as a software engineer" + 
           "for a well-known tech company, but he quickly found himself overwhelmed by the amount" +
           "of things he needed to know, but hadn't learned yet.";
    int pageNum3 = 777;

    //BOOK 4
    String name4 = "Becoming a Data Head";
    String author4 = "Alex J. Gutman";
    String description4 = "Turn yourself into a Data Head." + 
        "You will become a more valuable employee and make your organization more successful." + 
        "Thomas H. Davenport, Research Fellow, Author of Competing on Analytics, Big Data Work," + 
        "and The AI Advantage You've heard the hype around data-now get the facts." + 
        "In Becoming a Data Head: How to Think, Speak, and Understand Data Science, Statistics," + 
        "and Machine Learning, award-winning data scientists";
    int pageNum4 = 565;

    //BOOK 5
    String name5 = "Numbers Don't Lie";
    String author5 = "Vaclav Smil";
    String description5 = "From Earth's nations and inhabitants," + 
           "through the fuels and foods that energize them, to the transportation" + 
           "and inventions of our modern world - and how all of this affects" + 
           "the planet itself - in Numbers Don't Lie, Professor Vaclav Smil takes" + 
           "us on a fact-finding adventure.";
    int pageNum5 = 888;

    //BOOK 6
    String name6 = "Homo Deus";
    String author6 = "Yuval Noah Harari";
    String description6 = "The world-renowned historian and intellectual Yuval Noah Harari" + 
        "envisions a near future in which we face a new set of challenges." + 
        "Homo Deus explores the projects, dreams and nightmares that will shape the twenty-first century" + 
        "and beyond - from overcoming death to creating artificial life.";
    int pageNum6 = 787;

    //BOOK 7
    String name7 = "What If?"; 
    String author7 = "Randall Munroe";
    String description7 = "Munroe runs computer simulations, pores over stacks of" + 
        "declassified military research memos, solves differential equations and" + 
        "consults nuclear reactor operators. His responses are masterpieces of" + 
        "clarity and hilarity, complemented by comics. They often predict the" + 
        "complete annihilation of humankind, or at least a really big explosion.";
    int pageNum7 = 999;


    ArrayList addLib() {
    ArrayList<Book> booksDemo = new ArrayList<Book>();
    booksDemo.add(new Book(author1, name1, description1, pageNum1));
    booksDemo.add(new Book(author2, name2, description2, pageNum2));
    booksDemo.add(new Book(author3, name3, description3, pageNum3));
    booksDemo.add(new Book(author4, name4, description4, pageNum4));
    booksDemo.add(new Book(author5, name5, description5, pageNum5));
    booksDemo.add(new Book(author6, name6, description6, pageNum6));
    booksDemo.add(new Book(author7, name7, description7, pageNum7));
    return booksDemo;
    }

}
