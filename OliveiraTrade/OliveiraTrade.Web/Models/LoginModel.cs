using System.ComponentModel.DataAnnotations;

namespace OliveiraTrade.Web.Models
{
    public class LoginModel
    {
        [Required(ErrorMessage = "Digite o e-mail")]
        [EmailAddress(ErrorMessage = "O e-mail informado não é válido"), StringLength(50)]
        public string? Email { get; set; }

        [Required(ErrorMessage = "Digite a senha"), DataType(DataType.Password), StringLength(20)]
        public string? Senha { get; set; }

    }
}
