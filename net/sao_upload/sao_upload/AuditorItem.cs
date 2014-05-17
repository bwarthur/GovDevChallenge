using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace sao_upload
{
    public class Auditor
    {
        [JsonProperty("paymentDate")]
        public DateTime PaymentDate { get; set; }
        [JsonProperty("type")]
        public string Type { get; set; }
        [JsonProperty("warrantEFTAmt")]
        public decimal WarrantEFTAmt { get; set; }
        [JsonProperty("warrantEFTAmtSign")]
        public string WarrantEFTAmtSign { get; set; }
        [JsonProperty("lineAmt")]
        public decimal LineAmt { get; set; }
        [JsonProperty("lineAmtSign")]
        public string LineAmtSign { get; set; }
        [JsonProperty("vendor")]
        public string Vendor { get; set; }
        [JsonProperty("vendorName")]
        public string VendorName { get; set; }
        [JsonProperty("dept")]
        public string Dept { get; set; }
        [JsonProperty("document")]
        public string Document { get; set; }
        [JsonProperty("invoice")]
        public string Invoice { get; set; }
        [JsonProperty("paymentDescription")]
        public string PaymentDescription { get; set; }
        [JsonProperty("deptName")]
        public string DeptName { get; set; }
        [JsonProperty("deptContact")]
        public string DeptContact { get; set; }
        [JsonProperty("warrantEFT")]
        public string WarrantEFT { get; set; }

        public override string ToString()
        {
            var s = new StringBuilder();

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
