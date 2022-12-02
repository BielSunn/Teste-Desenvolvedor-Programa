using Microsoft.AspNetCore.Mvc;
using OliveiraTrade.Web.Models;
using OliveiraTrade.Web.Persistencia;

namespace OliveiraTrade.Web.Controllers
{
    public class LoginController : Controller
    {
        private OliveiraTradeContext _context;

        public LoginController(OliveiraTradeContext context)
        {
            _context = context;
        }

        [HttpPost]
        public IActionResult Entrar(LoginModel loginModel)
        {
            try
            {
                if (ModelState.IsValid)
                {
                    var usuario = _context.Usuarios
                        .FirstOrDefault(x => x.Email == loginModel.Email);

                    if (usuario != null)
                    {
                        if (usuario.SenhaValida(loginModel.Senha))
                        {
                            return RedirectToAction("Index", "Home");
                        }
                        TempData["MensagemErro"] = $"Senha do usuário inválida. Por favor, tente novamente.";
                    }

                    TempData["MensagemErro"] = $"E-mail e/ou senha inválido(s). Por favor, tente novamente.";

                }
                return View("Index");

            }
            catch (Exception erro)
            {
                TempData["MensagemErro"] = $"Ops, não conseguimos realizar seu login, tente novamente, detalhe do erro: {erro.Message}";
                return RedirectToAction("Index");
            }
        }

        public IActionResult Index()
        {
            return View();
        }
    }
}
