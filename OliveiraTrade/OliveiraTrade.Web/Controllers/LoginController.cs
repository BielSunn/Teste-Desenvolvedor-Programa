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
        public IActionResult Cadastrar(Usuario usuario)
        {
            try
            {

                if (ModelState.IsValid)
                {
                    _context.Usuarios.Add(usuario);
                    _context.SaveChanges();
                    TempData["msg"] = "Usuário Cadastrado";
                }
            }
            catch (Exception erro)
            {
                TempData["MensagemErro"] = $"Ops, não conseguimos realizar seu cadastro, tente novamente, detalhe do erro: {erro.Message}";
                return View();
            }

            return View();
        }

        [HttpGet]
        public IActionResult Cadastrar()
        {
            return View();
        }


        [HttpPost]
        public IActionResult Entrar(LoginModel loginModel)
        {
            try
            {
                Console.WriteLine($"loginModel EMAIL: {loginModel.Email}");
                Console.WriteLine($"loginModel Senha: {loginModel.Senha}");
                Console.WriteLine($"ModelState.IsValid: {ModelState.IsValid}");

                if (ModelState.IsValid)
                {
                    var usuario = _context.Usuarios
                        .FirstOrDefault(x => x.Email == loginModel.Email);

                    Console.WriteLine($"usuario EMAIL: {usuario.Email}");
                    Console.WriteLine($"usuario Senha: {usuario.Senha}");


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
                else
                {
                    Console.WriteLine($"NAO ENTROU NO IF");
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
