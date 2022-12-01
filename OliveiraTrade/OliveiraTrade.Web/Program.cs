using Microsoft.EntityFrameworkCore;
using OliveiraTrade.Web.Persistencia;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllersWithViews();

//Obter a string de conex�o do arquivo appsettings.json
var connection = builder.Configuration.GetConnectionString("conexao");

//Configurar o servi�o de DbContext para a inje��o de dependencia
builder.Services.AddDbContext<OliveiraTradeContext>(op => op.UseSqlServer(connection));

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
}
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Login}/{action=Index}/{id?}");

app.Run();
