class Solution {
    public String interpret(String command) {
        String translated;
        translated = command.replace("()", "o");
        translated = translated.replace("(al)", "al");

        return translated;
    }
}