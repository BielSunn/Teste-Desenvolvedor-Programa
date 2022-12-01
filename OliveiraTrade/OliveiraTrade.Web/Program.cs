using Microsoft.AspNetCore.Localization;
using Microsoft.EntityFrameworkCore;
using OliveiraTrade.Web.Persistencia;
using System.Globalization;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllersWithViews();

//Obter a string de conexão do arquivo appsettings.json
var connection = builder.Configuration.GetConnectionString("conexao");

//Configurar o serviço de DbContext para a injeção de dependencia
builder.Services.AddDbContext<OliveiraTradeContext>(op => op.UseSqlServer(connection));

var app = builder.Build();

//data pt-Br
var supportedCultures = new[] { new CultureInfo("pt-BR") };
app.UseRequestLocalization(new RequestLocalizationOptions
{
    DefaultRequestCulture = new RequestCulture(culture: "pt-BR", uiCulture: "pt-BR"),
    SupportedCultures = supportedCultures,
    SupportedUICultures = supportedCultures
});

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
