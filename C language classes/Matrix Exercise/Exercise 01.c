#include <stdio.h>

#define NUM_DIAS 10

int main() {
    double dados[NUM_DIAS][2];
    double mediaMaxima = 0.0, mediaMinima = 0.0;
    double maiorAmplitude = 0.0;
    int diaMaiorAmplitude = 1;
    int diasAbaixoLimiar = 0;
    double limiar = 10.0;

    FILE *arquivo = fopen("temperaturas.txt", "r");

    if (arquivo == NULL) {
        printf("Erro ao abrir o arquivo.\n");
        return 1;
    }

    for (int i = 0; i < NUM_DIAS; i++) {
        fscanf(arquivo, "%lf %lf", &dados[i][0], &dados[i][1]);
    }

    fclose(arquivo);

    int opcao;

    do {
        printf("\nMenu:\n");
        printf("1. Calcular Médias\n");
        printf("2. Maior Amplitude Térmica\n");
        printf("3. Dias Abaixo do Limiar\n");
        printf("4. Sair\n");
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                for (int i = 0; i < NUM_DIAS; i++) {
                    mediaMaxima += dados[i][0];
                    mediaMinima += dados[i][1];
                }
                mediaMaxima /= NUM_DIAS;
                mediaMinima /= NUM_DIAS;

                printf("a) Média máxima: %.2lf\n", mediaMaxima);
                printf("b) Média mínima: %.2lf\n", mediaMinima);
                break;

            case 2:
                for (int i = 0; i < NUM_DIAS; i++) {
                    double amplitude = dados[i][0] - dados[i][1];
                    if (amplitude > maiorAmplitude) {
                        maiorAmplitude = amplitude;
                        diaMaiorAmplitude = i + 1;
                    }
                }
                printf("c) Dia maior amplitude: Dia %d\n", diaMaiorAmplitude);
                break;

            case 3:
                for (int i = 0; i < NUM_DIAS; i++) {
                    if (dados[i][1] < limiar) {
                        diasAbaixoLimiar++;
                    }
                }
                printf("d) Dias abaixo de %.2lf°C: %d\n", limiar, diasAbaixoLimiar);
                break;

            case 4:
                printf("Encerrando.\n");
                break;

            default:
                printf("Opção inválida. Tente novamente.\n");
        }

    } while (opcao != 4);

    return 0;
}