using System;

namespace Aula_08___Prova_Funcionarios
{
    class Program
    {
        static void Main(string[] args)
        {
            Gerente gerente = new Gerente("Sérgio", 20, 30000);
            Supervisor supervisor = new Supervisor("Paulo", 28, 20000);
            Vendedor vendedor = new Vendedor("Amanda", 19, 10000);

            Console.WriteLine(gerente);
            Console.WriteLine(supervisor);
            Console.WriteLine(vendedor);

            
        }
    }
}
