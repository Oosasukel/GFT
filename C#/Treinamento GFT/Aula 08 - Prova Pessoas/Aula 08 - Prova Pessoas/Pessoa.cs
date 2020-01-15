using System;
using System.Collections.Generic;
using System.Text;

namespace Aula_08___Prova_Pessoas
{
    class Pessoa
    {
        public Pessoa(string nome, int idade)
        {
            Nome = nome;
            Idade = idade;
        }

        public string Nome { get; }
        public int Idade { get; }
    }
}
