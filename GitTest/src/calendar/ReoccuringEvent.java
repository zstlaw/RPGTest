package calendar;

public class ReoccuringEvent {
	/** first alignment */
	protected int startDate = 0;
	/** last alignment 0 means never */
	protected int endDate = 0;
	/** time in days between alignments */
	protected int period = 336;
	/** length of days of alignment */
	protected int length = 1;
	/** name or reoccuring event */
	protected String name = "";
	/** Miscellanious description information */
	protected String description = "";
	
	public ReoccuringEvent(final int pPeriod, final int pLength, 
			final String pName) {
		period = pPeriod;
		length = pLength;
		name = pName;		
	}
	
	/** is this a reoccuring event period (either aligned or remote) */
	public boolean isEvent(int pDate) {
		return isAlignment(pDate) || isRemote(pDate);
	}

	/** is this a alignment period */
	public boolean isAlignment(int pDate) {
		return (pDate % period) < length;
	}

	/** is this a alignment period */
	public boolean isRemote(int pDate) {
		int daysToEvent = (pDate % period) - (period / 2);
		return daysToEvent > 0 && daysToEvent < length;
	}

	/** is this a alignment period */
	public String getDesc(int pDate) {
		if (isRemote(pDate)) {
			return (name + " remote");			
		} else if (isAlignment(pDate)) {
			return (name + " alligned");			
		}
		return "";
	}
}
