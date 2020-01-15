using System;
using System.Collections.Generic;
using System.Text;

namespace Aula_08___Prova_Funcionarios
{
    abstract class Funcionario
    {
        public Funcionario(string nome, int idade, double salario)
        {
            Nome = nome;
            Idade = idade;
            Salario = salario;
        }
        public string Nome { get; set; }
        public int Idade { get; set; }
        public double Salario { get; set; }

        public virtual double Bonificacao()
        {
            return Salario;
        }

        public override string ToString()
        {
            return "-----------------\nNome: " + Nome + "\nIdade: " + Idade + "\nSalario: R$" + Salario + "\nBonificação: R$" + Bonificacao();
        }

    }
}
