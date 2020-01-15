using System;
using System.Collections.Generic;
using System.Text;

namespace Aula_08___Prova_Funcionarios
{
    class Vendedor : Funcionario
    {
        public Vendedor(string nome, int idade, double salario) : base(nome, idade, salario)
        {

        }

        public override double Bonificacao()
        {
            return base.Bonificacao() + 3000;
        }
    }
}
