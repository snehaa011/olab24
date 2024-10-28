package generic;

import newshelf.FictionType;

public sealed interface IBook<T> extends Comparable<T> permits Comic, Fiction, TextBook{

}

record Comic(String title, int ageOfMainCharacter) implements IBook<Comic>{
    public int compareTo(Comic a){
        return this.title.compareTo(a.title);
    }
};

record Fiction(String name, FictionType type) implements IBook<Fiction>{
    public int compareTo(Fiction b){
        return b.hashCode()-this.hashCode();
    }
};

record TextBook(String subject) implements IBook<TextBook>{
    public int compareTo(TextBook b){
        return b.subject.compareTo(this.subject);
    }
};