import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class ManipulacaodeStringseDatas {

    public static void main(String[] args) {
        String nome = "Shirley";

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        Locale brasil = new Locale("pt", "BRA");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Ola";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n,", nome, diaSemana, saudacao.toUpperCase());
    }
}