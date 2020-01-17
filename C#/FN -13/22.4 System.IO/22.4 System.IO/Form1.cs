using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace _22._4_System.IO
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void botaoGrava_Click(object sender, EventArgs e)
        {
            Stream saida = File.Open("texto.txt", FileMode.Create);
            StreamWriter escritor = new StreamWriter(saida);
            escritor.Write(textoConteudo.Text);
            escritor.Close();
            saida.Close();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            if (File.Exists("texto.txt"))
            {
                Stream entrada = File.Open("texto.txt", FileMode.Open);
                StreamReader leitor = new StreamReader(entrada);
                string linha = leitor.ReadLine();
                while(linha != null)
                {
                    textoConteudo.Text += linha;
                    linha = leitor.ReadLine();
                }
                entrada.Close();
                leitor.Close();
            }
            else
            {
                File.Create("texto.txt");
            }
        }
    }
}
