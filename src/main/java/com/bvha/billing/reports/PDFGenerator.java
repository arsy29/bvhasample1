package com.bvha.billing.reports;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;
import com.bvha.billing.reports.pojo.*;
import java.util.List;
import java.util.Map;
import java.io.InputStream;


public class PDFGenerator{
	private JasperPrint print;
	public PDFGenerator(JRBeanCollectionDataSource dateSource, Map mapParameter, String jasperReport) throws Exception{
		try(InputStream stream = getClass().getResourceAsStream(jasperReport)){
			print = JasperFillManager.fillReport(stream, mapParameter, dateSource);
			// JasperPrint print = JasperFillManager.fillReport("C:\\Users\\MrSplendid\\JaspersoftWorkspace\\MyReports\\Blank_A4.jasper", mapParameter, beanCollection);
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	public byte[] getPDF() throws Exception{
		return JasperExportManager.exportReportToPdf(print);
	}


}