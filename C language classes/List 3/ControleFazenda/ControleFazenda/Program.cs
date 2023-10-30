﻿using System.Collections;
using System.Collections.Generic;

class Program
{
    struct Nascimento
    {
        public int mes;
        public int ano;
    }
    struct Gado
    {
        public int codigo;
        public double leite; 
        public double alim; 
        public Nascimento nasc;
        public char abate; 
    }

    static void gerarDados(List<Gado> lista)
    {
        Random random = new Random();
        int codigo = 0;

        for (int i = 0; i < 100; i++)
        {
            Gado gado = new Gado();
            gado.codigo = ++codigo;
            gado.leite = random.Next(30, 100);
            gado.alim = random.Next(15, 50);
            gado.nasc.mes = random.Next(1, 13);
            gado.nasc.ano = random.Next(2016, 2023);
            if (2023 - gado.nasc.ano > 5 || gado.leite < 40)
            {
                gado.abate = 'S';
            }
            else
            {
                gado.abate = 'N';
            }
            lista.Add(gado);
        }
    }

    static void totalLeite(List<Gado> lista)
    {
        int qtd = lista.Count;
        double leiteSemanal = 0;

        for (int i = 0; i < qtd; i++)
        {
            leiteSemanal += lista[i].leite;
        }
        Console.WriteLine("Total de leite produzido em uma semana: " + leiteSemanal.ToString("F1") + "L");
    }

    static void totalAlimento(List<Gado> lista)
    {
        int qtd = lista.Count;
        double totalAlim = 0;

        foreach (Gado gado in lista)
        {
            totalAlim += gado.alim;
        }
        Console.WriteLine("Total de alimento consumido em uma semana: " + totalAlim.ToString("F1") + "KG");
    }

    static void listaAbate(List<Gado> lista)
    {
        int qtd = lista.Count;

        for (int i = 0; i < qtd; i++)
        {
            if (lista[i].abate == 'S')
            {
                Console.WriteLine($"Código animal: {lista[i].codigo}"); ;
            }
        }
    }

    static void salvarDados(List<Gado> lista, string codigoArquivo)
    {

        using (StreamWriter writer = new StreamWriter(codigoArquivo))
        {
            foreach (Gado gado in lista)
            {
                writer.WriteLine($"{gado.codigo},{gado.leite},{gado.alim},{gado.nasc.mes},{gado.nasc.ano},{gado.abate}");
            }
        }
        Console.WriteLine("Dados salvos com sucesso!");
    }


    static void carregarDados(List<Gado> lista, string codigoArquivo)
    {
        if (File.Exists(codigoArquivo))
        {
            lista.Clear();

            string[] linhas = File.ReadAllLines(codigoArquivo);
            foreach (string linha in linhas)
            {
                string[] campos = linha.Split(',');
                Gado gado = new Gado
                {
                    codigo = Convert.ToInt32(campos[0]),
                    leite = Convert.ToDouble(campos[1]),
                    alim = Convert.ToDouble(campos[2]),
                    nasc = new Nascimento { mes = Convert.ToInt32(campos[3]), ano = Convert.ToInt32(campos[4]) },
                    abate = Convert.ToChar(campos[5]),

                };
                lista.Add(gado);
            }
            Console.WriteLine("Dados carregados com sucesso!");
        }
        else
        {
            Console.WriteLine("Arquivo não encontrado :(");
        }
    }
    static int menu()
    {
        Console.WriteLine("Menu Principal");
        Console.WriteLine("1 - Total de leite produzido em uma semana");
        Console.WriteLine("2 - Total de alimento consumido em uma semana");
        Console.WriteLine("3 - Listar animais para abate");
        Console.WriteLine("4 - Salvar dados em arquivo");
        Console.WriteLine("5 - Carregar dados do arquivo");
        Console.WriteLine("0 - Sair");
        Console.Write("Digite a opção desejada: ");

        int op = int.Parse(Console.ReadLine());
        return op;
    }
    static void Main()
    {
        List<Gado> listaGado = new List<Gado>();

        gerarDados(listaGado);

        int op;

        do
        {
            op = menu();

            switch (op)
            {
                case 1:
                    totalLeite(listaGado);
                    break;
                case 2:
                    totalAlimento(listaGado);
                    break;
                case 3:
                    listaAbate(listaGado);
                    break;
                case 4:
                    salvarDados(listaGado, "dados.txt");
                    break;
                case 5:
                    carregarDados(listaGado, "dados.txt");
                    break;
                case 0:
                    Console.WriteLine("Saindo");
                    break;
                default:
                    Console.WriteLine("ERRO: Opção Inválida");
                    break;
            }

            Console.ReadKey();
            Console.Clear();

        } while (op != 0);
    }
}