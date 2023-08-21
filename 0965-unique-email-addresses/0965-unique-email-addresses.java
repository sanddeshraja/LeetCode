class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String localName = parts[0].replace(".", "").split("\\+")[0];
            String modifiedEmail = localName + "@" + parts[1];
            uniqueEmails.add(modifiedEmail);
        }

        return uniqueEmails.size();
    }
}
