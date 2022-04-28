package dio.com.exercicios.loops;

import java.time.LocalDateTime;

public class Animal {

        double peso;
        String raça;
        String proprietário;
        LocalDateTime dataRegistro;

        int tempoRegistro;

        public int calcularIdade() {
        return 0;
        }

        public int tempoRegistro(){
                LocalDateTime agora = LocalDateTime.now();
                int anoAtual = agora.getYear();
                int anoDataRegistro = dataRegistro.getYear();
                System.out.println(anoAtual);
                System.out.println(anoDataRegistro);
                int anoCalculado = anoAtual - anoDataRegistro;
                System.out.println(anoCalculado);
                int mesAtual = agora.getMonthValue();
                int mesRegistro = dataRegistro.getMonthValue();
                int mesCalculado = mesAtual - mesRegistro;
                int dia = agora.getDayOfMonth();
                int diaRegistro = dataRegistro.getDayOfMonth();
                int diaCalculado = dia - diaRegistro;
                int horaAtual = agora.getHour();
                int horaRegistro = dataRegistro.getHour();
                int horaCalculada = horaAtual - horaRegistro;
                int minutoAtual = agora.getMinute();
                int minutoRegistro = dataRegistro.getMinute();
                int minutoCalculado = minutoAtual - minutoRegistro;

                System.out.printf("Você tem %s anos, %s meses, %s dias, %s horas, %s minutos de registro", anoCalculado, mesCalculado, diaCalculado, horaCalculada, minutoCalculado);

                return 0;
        }

        public Animal() { //construtor padão // método disparado para construir o objeto da classe
                dataRegistro = LocalDateTime.now();
                dataRegistro = dataRegistro.minusHours(3);
                dataRegistro = dataRegistro.minusMonths(2);


        }



        @Override
        public String toString() {
                return "Animal{" +
                        "peso=" + peso +
                        ", raça='" + raça + '\'' +
                        ", proprietário='" + proprietário + '\'' +
                        ", dataRegistro=" + dataRegistro +
                        '}';

        }

        public String DadosResumidos(){
                return "Animal{" +
                        "peso=" + peso +
                        ", raça='" + raça + '\'' +
                        '}';
        }
}
