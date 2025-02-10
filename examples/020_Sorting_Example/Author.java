public class Author {
    private String first;
    private String last;
    
    // Boolean function to compare Author objects first and last
    public boolean compareTo( Author a ){
        // If compare last 
        if( last.compareTo(a.last) < 0){
            return true;
        }
        // If compare first
        if( first.compareTo(a.first) < 0){
            return true;
        }
        return false;
    }
}
    