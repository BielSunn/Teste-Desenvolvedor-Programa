using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace OliveiraTrade.Web.Migrations
{
    /// <inheritdoc />
    public partial class CriadoTabelaUsuario : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "TBL_USUARIO",
                columns: table => new
                {
                    idusuario = table.Column<int>(name: "id_usuario", type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    nmusuario = table.Column<string>(name: "nm_usuario", type: "nvarchar(40)", maxLength: 40, nullable: false),
                    nrcpf = table.Column<string>(name: "nr_cpf", type: "nvarchar(14)", maxLength: 14, nullable: false),
                    dsemail = table.Column<string>(name: "ds_email", type: "nvarchar(50)", maxLength: 50, nullable: false),
                    dtnascimento = table.Column<DateTime>(name: "dt_nascimento", type: "datetime2", nullable: false),
                    dssenha = table.Column<string>(name: "ds_senha", type: "nvarchar(20)", maxLength: 20, nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TBL_USUARIO", x => x.idusuario);
                });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "TBL_USUARIO");
        }
    }
}
