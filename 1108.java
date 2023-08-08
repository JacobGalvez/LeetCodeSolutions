class Solution {
    public String defangIPaddr(String address) {
        String defanged;
        defanged = address.replace(".", "[.]");
        return defanged;
    }
}