class Connection {

    void open() {
        System.out.println("Connection opened");
    }

    void use() {
        throw new RuntimeException("Error during operation");
    }

    void close() {
        System.out.println("Connection closed");
    }
}

class ResourceCleanupDemo {

    public static void main(String[] args) {
        Connection conn = new Connection();

        try {
            conn.open();
            conn.use();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            conn.close();
        }
    }
}
