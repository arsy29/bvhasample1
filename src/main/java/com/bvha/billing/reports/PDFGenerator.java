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


public class PDFGenerator{
	private byte[] report = null;
	public PDFGenerator(List<Object> listParameter, Map mapParameter, String jasperReport) throws Exception{
		JRBeanCollectionDataSource beanCollection = new JRBeanCollectionDataSource(listParameter);
		try{
			JasperPrint print = JasperFillManager.fillReport(jasperReport, mapParameter, beanCollection);
	        this.report = JasperExportManager.exportReportToPdf(print);
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	public byte[] getPDF(){
		return this.report;
	}


}