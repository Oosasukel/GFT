using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _21._7_LINQ
{
    public class Conta
    {
        public Conta(string titular, int numero, int agencia)
        {
            Saldo = 0;
            Titular = titular;
            Numero = numero;
            Agencia = agencia;
        }

        public double Saldo { get; private set; }
        public string Titular { get; }
        public int Numero { get; }
        public int Agencia { get; }

        public override string ToString()
        {
            return string.Format("Titular: {0}, Saldo: {1}", Titular, Saldo);
        }

        public void Saca(double qtd)
        {
            Saldo -= qtd;
        }
        public void Deposita(double qtd)
        {
            Saldo += qtd;
        }
    }
}
