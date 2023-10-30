using System.Collections.Generic;

class Program
{
    struct Livros
    {
        public string titulo;
        public string autor;
        public int ano;
        public int prateleira;
    }

    static void add_Livro(List<Livros> lista)
    {
        Livros novolivro = new Livros();
        Console.WriteLine("Insira o título do livro: ");
        novolivro.titulo = Console.ReadLine();
        Console.WriteLine("Insira o autor do livro: ");
        novolivro.autor = Console.ReadLine();
        Console.WriteLine("Insira o ano do livro: ");
        novolivro.ano = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Insira o prateleira do livro: ");
        novolivro.prateleira = Convert.ToInt32(Console.ReadLine());
        lista.Add(novolivro);
    }

    static void procura_Livro(List<Livros> lista, string buscaTitulo)
    {
        int qtd = lista.Count();

        for(int i = 0; i < qtd; i++)
        {
            if (lista[i].titulo.ToUpper().Equals(buscaTitulo.ToUpper()))
            {
                Console.WriteLine("Nome do Livro: " + lista[i].titulo);
                Console.WriteLine("Prateleira de Número: " + lista[i].prateleira);
            } 
        }
    }

    static void listar_Livros(List<Livros> lista) 
    {
        int qtd = lista.Count();
        for (int i = 0; i < qtd; i++)
        {
            Console.WriteLine("Nome do Livro: " + lista[i].titulo);
            Console.WriteLine("Nome do Livro: " + lista[i].autor);
            Console.WriteLine("Nome do Livro: " + lista[i].ano);
            Console.WriteLine("Prateleira de Número: " + lista[i].prateleira);
        }
    }

    static void procura_Ano(List<Livros> lista, int buscaLivro)
    {
        int qtd = lista.Count();
        for (int i = 0; i < qtd; i++)
        {
            if (lista[i].ano > (buscaLivro))
            {
                Console.WriteLine("Nome do Livro: " + lista[i].titulo);
                Console.WriteLine("Nome do Livro: " + lista[i].autor);
                Console.WriteLine("Nome do Livro: " + lista[i].ano);
                Console.WriteLine("Prateleira de Número: " + lista[i].prateleira);
            }
        }
    }

    static int menu()
    {
        Console.WriteLine("Menu: ");
        Console.WriteLine("1 - Adicionar Livro: ");
        Console.WriteLine("2 - Procurar por Título: ");
        Console.WriteLine("3 - Mostrar todos os Livros: ");
        Console.WriteLine("4 - procurar por Ano: ");
        Console.WriteLine("0 - Sair");
        int opcao = Convert.ToInt32(Console.ReadLine());
        return opcao;   
    }

    static void salvarDados(List<Livros> lista, string nomeArquivo)
    {

        using (StreamWriter writer = new StreamWriter(nomeArquivo))
        {
            foreach (Livros Livros in lista)
            {
                writer.WriteLine($"{Livros.titulo},{Livros.autor},{Livros.ano},{Livros.prateleira}");
            }
        }
        Console.WriteLine("Dados salvos com sucesso!");


    }

    static void carregarDados(List<Livros> lista, string nomeArquivo)
    {
        if (File.Exists(nomeArquivo))
        {
            string[] linhas = File.ReadAllLines(nomeArquivo);
            foreach (string linha in linhas)
            {
                string[] campos = linha.Split(',');
                Livros Livros = new Livros
                {
                    titulo = campos[0],
                    autor = campos[1],
                    ano = int.Parse(campos[2]),
                    prateleira = int.Parse(campos[3])
                };
                lista.Add(Livros);
            }
            Console.WriteLine("Dados carregados com sucesso!");
        }
        else
        {
            Console.WriteLine("Arquivo não encontrado :(");
        }
    }

    static void Main()
    {
        List<Livros> listaLivros = new List<Livros>();


        int opcao;
        do
        {
            opcao = menu();

            switch (opcao) 
            {

                case 1:
                    add_Livro(listaLivros);
                    break;
                case 2:
                    Console.WriteLine("Digite o Título");
                    string titulo = Console.ReadLine();
                    procura_Livro(listaLivros, titulo);
                    break;
                case 3:
                    listar_Livros(listaLivros);
                    break;
                case 4:
                    Console.WriteLine("Digite o Ano: ");
                    int ano = Convert.ToInt32(Console.ReadLine());
                    procura_Ano(listaLivros, ano);
                    break;
                case 0:
                    salvarDados(listaLivros, "dados.txt");
                    break;
                default:
                    Console.WriteLine("Erro: opcao inválida");
                    break;

            }
            Console.ReadKey();  
            Console.Clear();
        }while(opcao != 0); 
    }
}