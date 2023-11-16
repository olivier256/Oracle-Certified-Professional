import java.time.DayOfWeek;

public class Chapter3Exercice10 {
	private DayOfWeek getWeekDay(int day, final int thursday) {
		int otherDay = day;
		int Sunday = 0;
		switch(otherDay) {
			default:
			case 1: continue;
			case thursday: return DayOfWeek.THURSDAY;
			case 2,10: break;
			case Sunday: return DayOfWeek.SUNDAY;
			case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
		}
		return DayOfWeek.MONDAY;
	}
}
