using Microsoft.AspNetCore.Mvc;
using OliveiraTrade.Web.Models;
using OliveiraTrade.Web.Persistencia;

namespace OliveiraTrade.Web.Controllers
{
    public class UsuarioController : Controller
    {
        private OliveiraTradeContext _context;

        public UsuarioController(OliveiraTradeContext context)
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

        public IActionResult Index()
        {
            var lista = _context.Usuarios.ToList();
            return View(lista);
        }
    }
}
