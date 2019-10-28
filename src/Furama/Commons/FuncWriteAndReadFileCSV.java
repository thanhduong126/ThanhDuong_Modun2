package Furama.Commons;

import Furama.Models.House;
import Furama.Models.Room;
import Furama.Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteAndReadFileCSV {
	private static final char DEFAULT_SEPARATOR = ',';
	private static final char DEFAULT_QUOTE = '"';
	private static final String pathVilla = "src/Furama/Data/Villa.csv";
	private static final String pathHouse = "src/Furama/Data/House.csv";
	private static final String pathRoom = "src/Furama/Data/House.csv";
	private static final int NUM_OF_LINE_SKIP= 1;
	private static String[] headerRecordVilla = new String[]{"id", "tenDichVu", "dienTichSuDung", "chiPhiThue",
			"soLuongNguoiToiDa", "kieuThue", "tieuChuanPhongVilla",
			"tienNghiKhacVilla", "soTangVilla", "dienTichHoBoiVilla"};
	private static String[] headerRecordHouse = new String[]{"id", "tenDichVu", "dienTichSuDung",
			"chiPhiThue", "soLuongNguoiToiDa", "kieuThue",
			"tieuChuanPhongHouse", "tienNghiKhacHouse", "soTangHouse"};
	private static String[] headerRecordRoom = new String[]{"id", "tenDichVu", "dienTichSuDung",
			"chiPhiThue", "soLuongNguoiToiDa", "kieuThue",
			"serviceFreeforRoom"};

	public static void writerVillaToFileVillaCSV(ArrayList<Villa> arrayList) {
		try (Writer writer = new FileWriter(pathVilla);
		     CSVWriter csvWriter = new CSVWriter(writer,
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
						villa.getKieuThue(), villa.getTieuChuanPhongVilla(),
						villa.getTienNghiKhacVilla(),
						String.valueOf(villa.getSoTangVilla()),
						String.valueOf(villa.getDienTichHoBoiVilla())
				});
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void writerVillaToFileHouseCSV(ArrayList<House> arrayList) {
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
						house.getTieuChuanPhongHouse(),
						house.getTienNghiKhacHouse(),
						String.valueOf(house.getSoTangHouse()),

				});
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void writerVillaToFileRoomCSV(ArrayList<Room> arrayList) {
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
						String.valueOf(room.getServiceFreeforRoom())
				});
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static ArrayList<Villa> getVillaFromCSV(){
		Path path = Paths.get(pathVilla);
		if (!Files.exists(path)){
			try {
				Writer writer = new FileWriter(pathVilla);
			}catch (IOException ex){
				System.out.println(ex.getMessage());
			}
		}
		ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(Villa.class);
		strategy.setColumnMapping(headerRecordVilla);
		CsvToBean<Villa> csvToBean = null;
		try{
			csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla)).withMappingStrategy(strategy)
		.withSeparator(DEFAULT_SEPARATOR)
					.withQuoteChar(DEFAULT_QUOTE)
					.withSkipLines(NUM_OF_LINE_SKIP)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
			}catch (FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}
		return (ArrayList<Villa>) csvToBean.parse();
	}
	public static ArrayList<House> getHouseFromCSV(){
		Path path = Paths.get(pathHouse);
		if (!Files.exists(path)){
			try {
				Writer writer = new FileWriter(pathHouse);
			}catch (IOException ex){
				System.out.println(ex.getMessage());
			}
		}
		ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(House.class);
		strategy.setColumnMapping(headerRecordHouse);
		CsvToBean<House> csvToBean = null;
		try{
			csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse)).withMappingStrategy(strategy)
					.withSeparator(DEFAULT_SEPARATOR)
					.withQuoteChar(DEFAULT_QUOTE)
					.withSkipLines(NUM_OF_LINE_SKIP)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
		}catch (FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}
		return (ArrayList<House>) csvToBean.parse();
	}
	public static ArrayList<Room> getRoomFromCSV(){
		Path path = Paths.get(pathRoom);
		if (!Files.exists(path)){
			try {
				Writer writer = new FileWriter(pathRoom);
			}catch (IOException ex){
				System.out.println(ex.getMessage());
			}
		}
		ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(Room.class);
		strategy.setColumnMapping(headerRecordRoom);
		CsvToBean<Room> csvToBean = null;
		try{
			csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom)).withMappingStrategy(strategy)
					.withSeparator(DEFAULT_SEPARATOR)
					.withQuoteChar(DEFAULT_QUOTE)
					.withSkipLines(NUM_OF_LINE_SKIP)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
		}catch (FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}
		return (ArrayList<Room>) csvToBean.parse();
	}

}
