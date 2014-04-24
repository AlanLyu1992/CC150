package Chap17;
public static Book {
    Trie trie;
    Book(String path) {
        trie = new Trie();
        File file = new File("book.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                                new FileInputStream(file)));
        String s;
        while((s = reader.readLine())!= null) {
            for(String word : line.toLowerCase().split("[^a-z]+")) {
                trie.add(word);
            }
        }
        /*
        Scanner reader = new Scanner(file);
        while(reader.hasNext()) {
            trie.add(reader.next());
        }
        */
        public int findWord(String word) {
            return trie.find(word);
        }
    }
}
