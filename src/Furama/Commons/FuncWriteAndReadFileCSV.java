package Furama.Commons;

import Furama.Models.*;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class FuncWriteAndReadFileCSV {
	private static final char DEFAULT_SEPARATOR = ',';
	private static final char DEFAULT_QUOTE = '"';
	private static final String pathVilla = "src/Furama/Data/Villa.csv";
	private static final String pathHouse = "src/Furama/Data/House.csv";
	private static final String pathRoom = "src/Furama/Data/Room.csv";
	private static final String pathCustomer = "src/Furama/Data/Customer.csv";
	private static final String pathBooking = "src/Furama/Data/Booking.csv";
	private static final int NUM_OF_LINE_SKIP = 1;
	private static String[] headerRecordVilla = new String[]{"id", "tenDichVu", "dienTichSuDung",
			"chiPhiThue", "soLuongNguoiToiDa", "kieuThue", "dichVuDiKem", "tieuChuanPhongVilla",
			"tienNghiKhacVilla", "soTangVilla", "dienTichHoBoiVilla"};
	private static String[] headerRecordHouse = new String[]{"id", "tenDichVu", "dienTichSuDung",
			"chiPhiThue", "soLuongNguoiToiDa", "kieuThue", "dichVuDiKem",
			"tieuChuanPhongHouse", "tienNghiKhacHouse", "soTangHouse"};
	private static String[] headerRecordRoom = new String[]{"id", "tenDichVu", "dienTichSuDung",
			"chiPhiThue", "soLuongNguoiToiDa", "kieuThue", "dichVuDiKem"};
	private static String[] headerRecordCustomer = new String[]{"id", "hoTen", "ngaySinh", "gioiTinh",
			"soCmnd", "soDt", "email", "loaiKhach", "diaChi"};
	private static String[] headerRecordBooking = new String[]{"id","hoTen","ngaySinh","gioiTinh",
			"soCmnd","soDt","email","loaiKhach","diaChi","id","tenDichVu","dienTichSuDung","chiPhiThue",
			"soLuongNguoiToiDa","kieuThue","dichVuDiKem"
			};
	//Customer
	public static void writerCustomerToFileCustomerCSV(ArrayList<Customer> arrayList) {
		try (Writer writer = new FileWriter(pathCustomer);
		     CSVWriter csvWriter = new CSVWriter(
				     writer,
				     CSVWriter.DEFAULT_SEPARATOR,
				     CSVWriter.DEFAULT_QUOTE_CHARACTER,
				     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
				     CSVWriter.DEFAULT_LINE_END)) {
			csvWriter.writeNext(headerRecordCustomer);
			for (Customer customer : arrayList) {
				csvWriter.writeNext(new String[]{
						customer.getiD(),
						customer.getHoTen(),
						customer.getNgaySinh(),
						customer.getGioiTinh(),
						customer.getSoCmnd(),
						String.valueOf(customer.getSoDt()),
						customer.getEmail(),
						customer.getLoaiKhach(),
						customer.getDiaChi(),
				});
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
//Customer
	public static ArrayList<Customer> getCustomerFromCSV() {
		Path path = Paths.get(pathCustomer);
		if (!Files.exists(path)) {
			try {
				Writer writer = new FileWriter(pathCustomer);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(Customer.class);
		strategy.setColumnMapping(headerRecordCustomer);
		CsvToBean<Customer> csvToBean = null;
		try {
			csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
					.withMappingStrategy(strategy)
					.withSeparator(DEFAULT_SEPARATOR)
					.withQuoteChar(DEFAULT_QUOTE)
					.withSkipLines(NUM_OF_LINE_SKIP)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return (ArrayList<Customer>) csvToBean.parse();
	}
//Villa
	public static void writerServiceToFileVillaCSV(ArrayList<Villa> arrayList) {
		try (Writer writer = new FileWriter(pathVilla);
		     CSVWriter csvWriter = new CSVWriter(
				     writer,
				     CSVWriter.DEFAULT_SEPARATOR,
				     CSVWriter.DEFAULT_QUOTE_CHARACTER,
				     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
				     CSVWriter.DEFAULT_LINE_END)) {
			csvWriter.writeNext(headerRecordVilla);
			for (Villa villa : arrayList) {
				csvWriter.writeNext(new String[]{
						villa.getId(), villa.getTenDichVu(),
						String.valueOf(villa.getDienTichSuDung()),
						String.valueOf(villa.getChiPhiThue()),
						String.valueOf(villa.getSoLuongNguoiToiDa()),
						villa.getKieuThue(),
						villa.getDichVuDiKem(),
						villa.getTieuChuanPhongVilla(),
						villa.getTienNghiKhacVilla(),
						String.valueOf(villa.getSoTangVilla()),
						String.valueOf(villa.getDienTichHoBoiVilla()),
				});
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	//House
	public static void writerServiceToFileHouseCSV(ArrayList<House> arrayList) {
		try (Writer writer = new FileWriter(pathHouse);
		     CSVWriter csvWriter = new CSVWriter(writer,
				     CSVWriter.DEFAULT_SEPARATOR,
				     CSVWriter.DEFAULT_QUOTE_CHARACTER,
				     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
				     CSVWriter.DEFAULT_LINE_END)) {
			csvWriter.writeNext(headerRecordHouse);
			for (House house : arrayList) {
				csvWriter.writeNext(new String[]{
						house.getId(),
						house.getTenDichVu(),
						String.valueOf(house.getDienTichSuDung()),
						String.valueOf(house.getChiPhiThue()),
						String.valueOf(house.getSoLuongNguoiToiDa()),
						house.getKieuThue(),
						house.getDichVuDiKem(),
						house.getTieuChuanPhongHouse(),
						house.getTienNghiKhacHouse(),
						String.valueOf(house.getSoTangHouse()),

				});
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
		//Room
	public static void writerServiceToFileRoomCSV(ArrayList<Room> arrayList) {
		try (Writer writer = new FileWriter(pathRoom);
		     CSVWriter csvWriter = new CSVWriter(writer,
				     CSVWriter.DEFAULT_SEPARATOR,
				     CSVWriter.DEFAULT_QUOTE_CHARACTER,
				     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
				     CSVWriter.DEFAULT_LINE_END)) {
			csvWriter.writeNext(headerRecordRoom);
			for (Room room : arrayList) {
				csvWriter.writeNext(new String[]{
						room.getId(),
						room.getTenDichVu(),
						String.valueOf(room.getDienTichSuDung()),
						String.valueOf(room.getChiPhiThue()),
						String.valueOf(room.getSoLuongNguoiToiDa()),
						room.getKieuThue(),
						room.getDichVuDiKem(),
				});
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	//Villa
	public static ArrayList<Villa> getVillaFromCSV() {
		Path path = Paths.get(pathVilla);
		if (!Files.exists(path)) {
			try {
				Writer writer = new FileWriter(pathVilla);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(Villa.class);
		strategy.setColumnMapping(headerRecordVilla);
		CsvToBean<Villa> csvToBean = null;
		try {
			csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
					.withMappingStrategy(strategy)
					.withSeparator(DEFAULT_SEPARATOR)
					.withQuoteChar(DEFAULT_QUOTE)
					.withSkipLines(NUM_OF_LINE_SKIP)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return (ArrayList<Villa>) csvToBean.parse();
	}
//		House
	public static ArrayList<House> getHouseFromCSV() {
		Path path = Paths.get(pathHouse);
		if (!Files.exists(path)) {
			try {
				Writer writer = new FileWriter(pathHouse);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(House.class);
		strategy.setColumnMapping(headerRecordHouse);
		CsvToBean<House> csvToBean = null;
		try {
			csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse)).withMappingStrategy(strategy)
					.withSeparator(DEFAULT_SEPARATOR)
					.withQuoteChar(DEFAULT_QUOTE)
					.withSkipLines(NUM_OF_LINE_SKIP)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return (ArrayList<House>) csvToBean.parse();
	}
		//Room
	public static ArrayList<Room> getRoomFromCSV() {
		Path path = Paths.get(pathRoom);
		if (!Files.exists(path)) {
			try {
				Writer writer = new FileWriter(pathRoom);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(Room.class);
		strategy.setColumnMapping(headerRecordRoom);
		CsvToBean<Room> csvToBean = null;
		try {
			csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
					.withMappingStrategy(strategy)
					.withSeparator(DEFAULT_SEPARATOR)
					.withQuoteChar(DEFAULT_QUOTE)
					.withSkipLines(NUM_OF_LINE_SKIP)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return (ArrayList<Room>) csvToBean.parse();
	}


	//Booking
	public static ArrayList<Customer> getBookingFromCSV() {

		Path path = Paths.get(pathBooking);
		if (!Files.exists(path)) {
			try {
				Writer writer = new FileWriter(pathBooking);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(Customer.class);
		strategy.setColumnMapping(headerRecordBooking);
		CsvToBean<Customer> csvToBean = null;
		try {
			csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathBooking))
					.withMappingStrategy(strategy)
					.withSeparator(DEFAULT_SEPARATOR)
					.withQuoteChar(DEFAULT_QUOTE)
					.withSkipLines(NUM_OF_LINE_SKIP)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return (ArrayList<Customer>) csvToBean.parse();
	}


	public static void writerCustomerToFileBookingCSV(ArrayList<Customer> arrayList) {
		try (Writer writer = new FileWriter(pathBooking);
		     CSVWriter csvWriter = new CSVWriter(writer,
				     CSVWriter.DEFAULT_SEPARATOR,
				     CSVWriter.DEFAULT_QUOTE_CHARACTER,
				     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
				     CSVWriter.DEFAULT_LINE_END)) {
			csvWriter.writeNext(headerRecordBooking);
			for (Customer customer : arrayList) {
				csvWriter.writeNext(new String[]{
						customer.getiD(),customer.getHoTen(),customer.getGioiTinh(),
						customer.getSoCmnd(), String.valueOf(customer.getSoDt()),
						customer.getEmail(),customer.getLoaiKhach(),customer.getDiaChi(),
						customer.getService().getId(),customer.getService().getTenDichVu(),
						String.valueOf(customer.getService().getDienTichSuDung()),
						String.valueOf(customer.getService().getChiPhiThue()),
						String.valueOf(customer.getService().getSoLuongNguoiToiDa()),
						customer.getService().getKieuThue(),
						customer.getService().getDichVuDiKem()

//				private String iD;
//				private String hoTen;
//				private String ngaySinh;
//				private String gioiTinh;
//				private String soCmnd;
//				private int soDt;
//				private String email;
//				private String loaiKhach;
//				private String diaChi;
//						"id","hoTen","ngaySinh","gioiTinh",
//						"soCmnd","soDt","email","loaiKhach","diaChi","id","tenDichVu",
//						"dienTichSuDung","chiPhiThue",
//						"soLuongNguoiToiDa","kieuThue","dichVuDiKem"
				});
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static String getNameServicesFromFile(String csvLine){
		String name ="";
		if (csvLine!=null){
			String[] splitData = csvLine.split(",");
			name=splitData[1];
		}
		return name;
	}
	public static TreeSet<String> getAllNameServiceFromCSV(String path){
		BufferedReader br =null;
		TreeSet<String> result = new TreeSet<String>();
		try{
			String line;
			br =new BufferedReader(new FileReader(path));
			while ((br.readLine() != null)){
				line = br.readLine();
				if (getNameServicesFromFile(line).equals("tenDichVu")){
					continue;
				}
				result.add(getNameServicesFromFile(line));
			}
		}catch (IOException ex){
			System.out.println(ex.getMessage());
		}
		return result;
	}

}
