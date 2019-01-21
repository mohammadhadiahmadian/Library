public class ReturnError extends Exception {

    public ReturnError(Member member, Source source) {
        this.getMessage(member, source);
    }

    public String getMessage(Member member, Source source) {
        return source.getTitle() + "is not borrowed by" + member.getFirstName() + member.getLastName() + "or is not borrowed at all.";
    }

}
