package monopoly;

import java.lang.Math;

public class Player {
	String name;			//玩家名
	int money = 10000;		//錢
	int bank_money = 10000; //銀行錢
	int position = 0;		//位置
	
	Player(String name)
	{
		this.name = name;
	}
	
	Player(){}
	
	void go()	//前進
	{
		position += (int)(Math.random()*12)+1;
		if(position>=56)	//經過起點
		{
			position -= 56;	
			money += 5000;	//錢+5000
		}
		return;
	}
/*	
	void pay_money(Land land)	//付過路費
	{
		money -= land.pass_price[land.house];
		land.landlord.money += land.pass_price[land.house];
		System.out.println(name+"付"+land.pass_price[land.house]+"給"+land.name);
	}
*/
}
