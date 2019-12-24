package donguyennhathan.com;

import java.util.Random;
import java.util.Scanner;

public class BaiTapveNha {

	/**
	 * Đây là hàm tạo mảng random
	 * @param M là mảng bạn muốn tạo
	 */
	static void taoMang(int[] M)
	{
		Random rd= new Random();
		for(int i=0; i<M.length; i++)
		{
			M[i]=rd.nextInt(101);
		}
	}
	
	/**
	 * Đây là hàm dùng để xuất mảng
	 * @param M là mảng bạn muốn xu
	 */
	static void xuatMang(int[] M)
	{
		System.out.println("Mảng M là:\t");
		for(int i=0; i<M.length; i++)
		{
			System.out.print(M[i]+"\t");
		}
	}
	
	/**
	 * Đây là hàm kiểm tra số lẻ trong mảng
	 * @param M
	 */
	static void kiemTraSoLe(int[] M)
	{
		int dem=0;
		System.out.println("Số lẻ là: ");
		for(int i=0; i<M.length;i++)
		{
			if(M[i]%2!=0)
			{
				dem++;
				System.out.print(M[i]+"\t");
			}
		}
		System.out.println();
		System.out.println("--> Có "+dem+" số lẻ");
	}
	
	/**
	 * Đây là hàm kiểm tra số chẵn trong mảng
	 * @param M
	 */
	static void kiemTraSoChan(int[] M)
	{
		int dem=0;
		System.out.println("Số chẵn là: ");
		for(int i=0; i<M.length;i++)
		{
			if(M[i]%2==0)
			{
				dem++;
				System.out.print(M[i]+"\t");
			}
		}
		System.out.println();
		System.out.println("--> Có "+dem+" số chẵn");
	}
	
	/**
	 * Đây là hàm kiểm tra số nguyên tố
	 * @param M
	 */
	static void kiemTraSoNguyenTo(int[] M)
	{
		int dem=0;
		System.out.println("Số Nguyên Tố là: ");
		for(int i=0; i<M.length;i++)
		{
			dem=0;
			if(M[i]<2)
			{
				continue;
			}
			for(int j = 1;j<=Math.sqrt(M[i]);j++)
			{
				if(M[i]%j==0)
				{
					dem++;
				}
			}
			if(dem==1)
			{
				System.out.print(M[i]+"\t");
			}
		}
	}
	
	/**
	 * Đây là hàm kiểm tra các số không phải là số nguyên tố
	 * @param M
	 */
	static void kiemTraSoKhacNguyenTo(int[] M)
	{
		int dem=0;
		System.out.println("Số khác số nguyên tố là: ");
		for(int i=0; i<M.length;i++)
		{
			dem=0;
			if(M[i]<2)
			{
				continue;
			}
			for(int j = 1;j<=Math.sqrt(M[i]);j++)
			{
				if(M[i]%j==0)
				{
					dem++;
				}
			}
			if(dem>1)
			{
				System.out.print(M[i]+"\t");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Nhập số phần tử bạn muốn tạo cho mảng M: ");
		int n= new Scanner(System.in).nextInt();
		int[] M= new int[n];
		taoMang(M);
		xuatMang(M);
		System.out.println();
		kiemTraSoLe(M);
		kiemTraSoChan(M);
		kiemTraSoNguyenTo(M);
		System.out.println();
		kiemTraSoKhacNguyenTo(M);
	}

}
