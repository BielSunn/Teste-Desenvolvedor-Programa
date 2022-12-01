using Microsoft.AspNetCore.Mvc;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace OliveiraTrade.Web.Models
{
    [Table("TBL_USUARIO")]
    public class Usuario
    {
        [Column("id_usuario"), HiddenInput]
        public int UsuarioId { get; set; }

        [Column("nm_usuario"), StringLength(40)]
        [Required(ErrorMessage = "Digite o nome do usuário")]
        public string? Nome { get; set; }

        [Column("nr_cpf"), StringLength(14), Display(Name = "CPF")]
        [Required(ErrorMessage = "Digite o CPF do usuário")]
        public string? Cpf { get; set; }

        [Column("ds_email"), StringLength(50), Display(Name = "E-mail")]
        [Required(ErrorMessage = "Digite o e-mail do usuário")]
        [EmailAddress(ErrorMessage = "O e-mail informado não é válido")]
        public string? Email { get; set; }

        [Column("dt_nascimento"), DataType(DataType.Date), Display(Name = "Data de nascimento")]
        [Required(ErrorMessage = "Digite a data de nascimento do usuário")]
        public DateTime DataNascimento { get; set; }

        [Column("ds_senha"), StringLength(20), DataType(DataType.Password)]
        [Required(ErrorMessage = "Digite a senha do usuário")]
        public string? Senha { get; set; }

        public bool SenhaValida(string senha)
        {
            return Senha == senha;
        }


    }
}