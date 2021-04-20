public class MySingleton {

    private static MySingleton instance;

    private MySingleton() {
    }

    // 인스턴스가 하나만 생성되도록 관리한다.
    // 주로 synchronized 키워들로 잠금한다.
    public static synchronized MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
