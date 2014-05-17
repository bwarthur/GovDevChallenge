using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sao_upload
{
    public class AuditorItem
    {
        public string PaymentDate { get; set; }
        public string Type { get; set; }
        public decimal WarrantEFTAmt { get; set; }
        public string WarrantEFTAmtSign { get; set; }
        public string LineAmt { get; set; }
        public string LineAmtSign { get; set; }
        public string Vendor { get; set; }
        public string VendorName { get; set; }
        public string Dept { get; set; }
        public string Document { get; set; }
        public string Invoice { get; set; }
        public string PaymentDescription { get; set; }
        public string DeptName { get; set; }
        public string DeptContact { get; set; }
        public string WarrantEFT { get; set; }

        public override string ToString()
        {
            StringBuilder s = new StringBuilder();

            s.Append(PaymentDate + Environment.NewLine);
            s.Append(Type + Environment.NewLine);
            s.Append(WarrantEFTAmt + Environment.NewLine);
            s.Append(WarrantEFTAmtSign + Environment.NewLine);
            s.Append(LineAmt + Environment.NewLine);
            s.Append(LineAmtSign + Environment.NewLine);
            s.Append(Vendor + Environment.NewLine);
            s.Append(VendorName + Environment.NewLine);
            s.Append(Dept + Environment.NewLine);
            s.Append(Document + Environment.NewLine);
            s.Append(Invoice + Environment.NewLine);
            s.Append(PaymentDescription + Environment.NewLine);
            s.Append(DeptName + Environment.NewLine);
            s.Append(DeptContact + Environment.NewLine);
            s.Append(WarrantEFT + Environment.NewLine);

            return s.ToString();
        }
    }
}
