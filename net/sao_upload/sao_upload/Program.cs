using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Linq.Expressions;
using System.Net;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using CsvHelper;
using Newtonsoft.Json;

namespace sao_upload
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Processing file...");
            List<Auditor> list = GetValue();
            Console.WriteLine("complete");


            const int batchCount = 1000;
            string url = "http://localhost.:8888/_ah/api/auditorEndpoint/v1/putList";
            //string url = "https://1-dot-team03-govchal00.appspot.com/_ah/api/auditorEndpoint/v1/putList";

            for (int i = 0; i < list.Count/batchCount; i++)
            {
                var subList = list.Skip(batchCount*i).Take(batchCount);

                string json = "{ \"items\": " + JsonConvert.SerializeObject(subList) + " }";

                var webClient = new WebClient();
                webClient.Headers["Content-Type"] = "application/json;charset=UTF-8";
                Console.Write("#");
                webClient.UploadString(url, json);
               
                if (i > 10)
                    break;
            }

        }

        private static List<Auditor> GetValue()
        {
            string path = @"C:\projects\GovDevChallenge\net\data\Vendor Payments - ETS Data Request.csv";

            var list = new List<Auditor>();

            using (TextReader textReader = new StreamReader(path))
            {
                using (var csvReader = new CsvReader(textReader))
                {
                    while (csvReader.Read())
                    {
                        var auditorItem = new Auditor();

                        auditorItem.PaymentDate = csvReader.GetField<DateTime>(0);
                        auditorItem.Type = csvReader.GetField<string>(1);
                        auditorItem.WarrantEFTAmt =
                            Convert.ToDecimal(csvReader.GetField<string>(2).Replace(",", "").Replace(@"\", ""));
                        auditorItem.WarrantEFTAmtSign = csvReader.GetField<string>(3);
                        auditorItem.LineAmt = Convert.ToDecimal(csvReader.GetField<string>(4).Replace(",", "").Replace(@"\", ""));
                        auditorItem.LineAmtSign = csvReader.GetField<string>(5);
                        auditorItem.Vendor = csvReader.GetField<string>(6);
                        auditorItem.VendorName = csvReader.GetField<string>(7);
                        auditorItem.Dept = csvReader.GetField<string>(8);
                        auditorItem.Document = csvReader.GetField<string>(9);
                        auditorItem.Invoice = csvReader.GetField<string>(10);
                        auditorItem.PaymentDescription = csvReader.GetField<string>(11);
                        auditorItem.DeptName = csvReader.GetField<string>(12);
                        auditorItem.DeptContact = csvReader.GetField<string>(13);
                        auditorItem.WarrantEFT = csvReader.GetField<string>(14);

                        list.Add(auditorItem);
                    }
                }
            }

            return list;
        }
    }
}
