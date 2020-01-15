using System;
using System.Collections.Generic;

namespace Aula_08___Prova_Pessoas
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Pessoa> pessoas = new List<Pessoa>();
            pessoas.Add(new Pessoa("João", 15));
            pessoas.Add(new Pessoa("Leandro", 21));
            pessoas.Add(new Pessoa("Paulo", 17));
            pessoas.Add(new Pessoa("Jessica", 18));

            imprimeNomeMaisVelha(pessoas);

            Console.WriteLine("Pessoas: " + pessoas.Count);

            excluiMenores(pessoas);

            Console.WriteLine("Pessoas: " + pessoas.Count);

            imprimeIdadeSeExistirNome("Jessica", pessoas);

        }

        static void imprimeNomeMaisVelha(List<Pessoa> pessoas)
        {
            int maisVelha = -1;
            int indice = 0;

            for (int i = 0; i < pessoas.Count; i++)
            {
                if (pessoas[i].Idade > maisVelha)
                {
                    indice = i;
                    maisVelha = pessoas[i].Idade;
                }
            }

            Console.WriteLine(pessoas[indice].Nome + " é a pessoa mais velha.");
        }

        static void excluiMenores(List<Pessoa> pessoas)
        {
            for (int i = 0; i < pessoas.Count; i++)
            {
                if (pessoas[i].Idade < 18)
                {
                    pessoas.RemoveAt(i);
                }
            }
        }

        static void imprimeIdadeSeExistirNome(String nome, List<Pessoa> pessoas)
        {
            int a = 0;

            foreach(Pessoa pessoa in pessoas)
            {
                if(pessoa.Nome == nome)
                {
                    Console.WriteLine(pessoa.Idade);
                    a++;
                }
            }

            if(a == 0)
            {
                Console.WriteLine("Não existe essa pessoa na lista. :/");
            }
        }
    }
}
