using Microsoft.AspNetCore.Mvc;
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

        public IActionResult Index()
        {
            var lista = _context.Usuarios.ToList();
            return View(lista);
        }
    }
}
