using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _21._7_LINQ
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            List<Conta> contas = new List<Conta>();

            contas.Add(new Conta("Rodrigo", 14108, 2257));
            contas.Add(new Conta("Ricardo", 435, 6457));

            contas[0].Deposita(600);

            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new FormRelatorios(contas));
        }
    }
}
