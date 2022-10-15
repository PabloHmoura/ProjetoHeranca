package herancapessoas;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(17);
        System.out.println(v1.detalhes());

        Aluno a1 = new Aluno();
        a1.setNome("Pablo");
        a1.setIdade(21);
        a1.setCurso("CC");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("João");
        b1.setIdade(18);
        b1.pagarMensalidade();

    }
}
