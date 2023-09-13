public class resultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;
        String result = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacão" : "Reprovado";
        System.out.println(result);
    }
}
