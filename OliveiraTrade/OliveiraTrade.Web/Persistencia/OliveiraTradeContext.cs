using Microsoft.EntityFrameworkCore;
using OliveiraTrade.Web.Models;

namespace OliveiraTrade.Web.Persistencia
{
    public class OliveiraTradeContext : DbContext
    {
        public DbSet<Usuario> Usuarios { get; set; }


        public OliveiraTradeContext(DbContextOptions options) : base(options)
        {
        }

    }
}
