namespace _21._7_LINQ
{
    partial class FormRelatorios
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.listaResultado = new System.Windows.Forms.ListBox();
            this.botaoFiltroSaldo = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // listaResultado
            // 
            this.listaResultado.FormattingEnabled = true;
            this.listaResultado.Location = new System.Drawing.Point(12, 12);
            this.listaResultado.Name = "listaResultado";
            this.listaResultado.Size = new System.Drawing.Size(230, 134);
            this.listaResultado.TabIndex = 0;
            // 
            // botaoFiltroSaldo
            // 
            this.botaoFiltroSaldo.Location = new System.Drawing.Point(12, 152);
            this.botaoFiltroSaldo.Name = "botaoFiltroSaldo";
            this.botaoFiltroSaldo.Size = new System.Drawing.Size(116, 23);
            this.botaoFiltroSaldo.TabIndex = 1;
            this.botaoFiltroSaldo.Text = "Saldo maior que 500";
            this.botaoFiltroSaldo.UseVisualStyleBackColor = true;
            this.botaoFiltroSaldo.Click += new System.EventHandler(this.botaoFiltroSaldo_Click);
            // 
            // FormRelatorios
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(254, 183);
            this.Controls.Add(this.botaoFiltroSaldo);
            this.Controls.Add(this.listaResultado);
            this.Name = "FormRelatorios";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Relatorios";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.ListBox listaResultado;
        private System.Windows.Forms.Button botaoFiltroSaldo;
    }
}

