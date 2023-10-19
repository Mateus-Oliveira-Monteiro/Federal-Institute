using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Financing_Interest_Calculator
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void lblTaxaDeJuros_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnCalcularParcelas_Click(object sender, EventArgs e)
        {
            double taxaDeJurosMes = (Convert.ToDouble(lblTaxaDeJuros.Text)/100) / 12;
            double valorDaParcela = Convert.ToDouble(lblValorPrincipal.Text) * (taxaDeJurosMes / (1 - Math.Pow(1 + Convert.ToDouble(lblTaxaDeJuros.Text), - Convert.ToDouble(lblNumeroParcelas.Text))));
            double totalPago = valorDaParcela * Convert.ToDouble(lblNumeroParcelas.Text);
            double valorDoJuros = totalPago - Convert.ToDouble(lblValorPrincipal.Text);
            lblResultado.Text = 
                  "Valor das parcelas: " + valorDaParcela.ToString("N2")
                + "\nValor total a ser pago: " + totalPago.ToString("N2")
                + "\nValor total dos juros: " + valorDoJuros.ToString("N2");

        }
    }
}
