using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(GovDevChallenge.Startup))]
namespace GovDevChallenge
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
