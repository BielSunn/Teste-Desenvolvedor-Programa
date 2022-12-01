namespace OliveiraTrade.Web.Models
{
    public interface IUsuarioRepositorio
    {
        Usuario BuscarPorLogin(string login);
        List<Usuario> BuscarTodos();
        Usuario BuscarPorId(int id);
        Usuario Adicionar(Usuario usuario);
        Usuario Atualizar(Usuario usuario);
        bool apagar(int id);

    }
}
