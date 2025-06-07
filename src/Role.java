
public enum Role {
    ADMIN, USER, GUEST,OCTAVIO;
public static Role fromString(String input){
    return Role.valueOf(input.toUpperCase());
    }

    public static void main(String[] args) {
      dameNivelDeAccesos(OCTAVIO);
    }

    public static void dameNivelDeAccesos(Role role){
        switch (role){
            case ADMIN:
                System.out.println("Eres administrador tienes los accesos");
                break;
            case USER:
                System.out.println("Tienes ciertos accesos");
                break;
            case GUEST:
                System.out.println("No tienes acceso a nada");
                break;

            default:
                System.out.println("No tienes acceso a nada porque eres un intruso");
                break;
        }
    }
}
