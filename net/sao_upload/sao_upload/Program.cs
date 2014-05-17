using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Linq.Expressions;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using CsvHelper;

namespace sao_upload
{
    class Program
    {
        static void Main(string[] args)
        {         
            string path = @"C:\projects\GovDevChallenge\net\data\Vendor Payments - ETS Data Request.csv";

            var list = new List<AuditorItem>();

            using (TextReader textReader = new StreamReader(path))
            {
                using (var csvReader = new CsvReader(textReader))
                {
                    while (csvReader.Read())
                    {
                        var auditorItem = new AuditorItem();

                        auditorItem.PaymentDate = csvReader.GetField<string>(0);
                        auditorItem.Type = csvReader.GetField<string>(1);
                        auditorItem.WarrantEFTAmt = Convert.ToDecimal(csvReader.GetField<string>(2).Remove(',').Remove('\\'));
                        auditorItem.WarrantEFTAmtSign = csvReader.GetField<string>(3);
                        auditorItem.LineAmt = csvReader.GetField<string>(4);
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

            //new CsvReader()

            //using (var streamReader = new StreamReader(path))
            //{
            //    string line;
            //    var lineCount = 0;
            //    while((line = streamReader.ReadLine()) != null)
            //    {
            //        if (lineCount > 0 && lineCount < 10)
            //        {
            //            var lineSplit = line.Split(',');
            //            var auditorItem = new AuditorItem()
            //            {
            //                PaymentDate = Convert.ToDateTime(lineSplit[0]),
            //                Type = lineSplit[1],
            //                WarrantEFTAmt = Convert.ToDecimal(lineSplit[2]),
            //                WarrantEFTAmtSign = lineSplit[3],
            //                LineAmt = lineSplit[4],
            //                LineAmtSign = lineSplit[5],
            //                Vendor = lineSplit[6],
            //                VendorName = lineSplit[7],
            //                Dept = lineSplit[8],
            //                Document = lineSplit[9],
            //                Invoice = lineSplit[10],
            //                PaymentDescription = lineSplit[11],
            //                DeptName = lineSplit[12],
            //                DeptContact = lineSplit[13],
            //                WarrantEFT = lineSplit[14]
            //            };

            //            list.Add(auditorItem);
            //        }
                    
            //        lineCount += 1;
            //    }
            //}

            //foreach (var line in list)
            //{
            //    Trace.WriteLine(line);
            //}
            //int i = 0;
        }
    }
}
