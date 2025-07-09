class Logger {

    private static Logger instancia;

    private Logger() {
        System.out.println("Logger instanciado pela primeira vez");

    }

    public static Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();

        }
        return instancia;

    }

    public  void log(String mensagem) {
        System.out.println("LOG: " + mensagem);

    }

}
