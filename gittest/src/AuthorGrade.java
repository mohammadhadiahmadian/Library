public enum AuthorGrade {
    UNDERGRADUATE("Undergraduate"),
    MASTERS("Masters"),
    PHD("PHD");

    private final String string;

    AuthorGrade(String string) {
        this.string = string;
    }

   @Override
   public String toString() {
        return this.string;
   }




}