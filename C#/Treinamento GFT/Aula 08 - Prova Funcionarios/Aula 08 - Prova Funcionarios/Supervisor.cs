﻿using System;
using System.Collections.Generic;
using System.Text;

namespace Aula_08___Prova_Funcionarios
{
    class Supervisor : Funcionario
    {
        public Supervisor(string nome, int idade, double salario) : base(nome, idade, salario)
        {

        }

        public override double Bonificacao()
        {
            return base.Bonificacao() + 5000;
        }
    }
}
