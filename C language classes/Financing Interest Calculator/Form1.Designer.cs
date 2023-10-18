namespace Financing_Interest_Calculator
{
    partial class Form1
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblValorPrincipal = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.lblTaxaDeJuros = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.lblNumeroParcelas = new System.Windows.Forms.TextBox();
            this.btnCalcularParcelas = new System.Windows.Forms.Button();
            this.lblResultado = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lblValorPrincipal
            // 
            this.lblValorPrincipal.BackColor = System.Drawing.Color.White;
            this.lblValorPrincipal.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.lblValorPrincipal.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblValorPrincipal.Location = new System.Drawing.Point(332, 44);
            this.lblValorPrincipal.Name = "lblValorPrincipal";
            this.lblValorPrincipal.Size = new System.Drawing.Size(96, 26);
            this.lblValorPrincipal.TabIndex = 0;
            this.lblValorPrincipal.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(261, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(249, 20);
            this.label1.TabIndex = 1;
            this.label1.Text = "Valor Principal do Empréstimo";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(294, 86);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(172, 20);
            this.label2.TabIndex = 3;
            this.label2.Text = "Taxa de Juros Anual";
            // 
            // lblTaxaDeJuros
            // 
            this.lblTaxaDeJuros.BackColor = System.Drawing.Color.White;
            this.lblTaxaDeJuros.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.lblTaxaDeJuros.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTaxaDeJuros.Location = new System.Drawing.Point(332, 118);
            this.lblTaxaDeJuros.Name = "lblTaxaDeJuros";
            this.lblTaxaDeJuros.Size = new System.Drawing.Size(96, 26);
            this.lblTaxaDeJuros.TabIndex = 2;
            this.lblTaxaDeJuros.TextChanged += new System.EventHandler(this.lblTaxaDeJuros_TextChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(294, 159);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(170, 20);
            this.label3.TabIndex = 5;
            this.label3.Text = "Número de Parcelas";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // lblNumeroParcelas
            // 
            this.lblNumeroParcelas.BackColor = System.Drawing.Color.White;
            this.lblNumeroParcelas.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.lblNumeroParcelas.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNumeroParcelas.Location = new System.Drawing.Point(332, 193);
            this.lblNumeroParcelas.Name = "lblNumeroParcelas";
            this.lblNumeroParcelas.Size = new System.Drawing.Size(96, 26);
            this.lblNumeroParcelas.TabIndex = 4;
            this.lblNumeroParcelas.TextChanged += new System.EventHandler(this.textBox3_TextChanged);
            // 
            // btnCalcularParcelas
            // 
            this.btnCalcularParcelas.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcularParcelas.ForeColor = System.Drawing.Color.IndianRed;
            this.btnCalcularParcelas.Location = new System.Drawing.Point(298, 246);
            this.btnCalcularParcelas.Name = "btnCalcularParcelas";
            this.btnCalcularParcelas.Size = new System.Drawing.Size(156, 44);
            this.btnCalcularParcelas.TabIndex = 6;
            this.btnCalcularParcelas.Text = "Calcular Parcelas";
            this.btnCalcularParcelas.UseVisualStyleBackColor = true;
            this.btnCalcularParcelas.Click += new System.EventHandler(this.btnCalcularParcelas_Click);
            // 
            // lblResultado
            // 
            this.lblResultado.AutoSize = true;
            this.lblResultado.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblResultado.ForeColor = System.Drawing.Color.SeaGreen;
            this.lblResultado.Location = new System.Drawing.Point(296, 342);
            this.lblResultado.Name = "lblResultado";
            this.lblResultado.Size = new System.Drawing.Size(170, 20);
            this.lblResultado.TabIndex = 7;
            this.lblResultado.Text = "Número de Parcelas";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lblResultado);
            this.Controls.Add(this.btnCalcularParcelas);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.lblNumeroParcelas);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.lblTaxaDeJuros);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblValorPrincipal);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox lblValorPrincipal;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox lblTaxaDeJuros;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox lblNumeroParcelas;
        private System.Windows.Forms.Button btnCalcularParcelas;
        private System.Windows.Forms.Label lblResultado;
    }
}

