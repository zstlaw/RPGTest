package calendar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

import calendar.Event.Locale;

public class Main {
	static Collection<Event> events = new TreeSet<Event>();
	static Collection<Calendar> calendars = new ArrayList<Calendar>();

	/**
	 * Add root calendar
	 */
	static public Calendar addCalendar(final String pShortName, final String pName) {
		Calendar root = new Calendar(pShortName, pName);
	    calendars.add(root);
		addEventHeading(root, Locale.Sula, 0, "Start of " + pName);
		return root;
	}

	/**
	 * Add a new calendar
	 */
	static public Calendar addCalendar(final Calendar pParent, final int pStart, final String pShortName, final String pName) {
		Calendar cal = new Calendar(pParent, pStart, pShortName, pName);
		calendars.add(cal);
		addEventHeading(pParent, Locale.Sula, pStart,
				"Start of " + pName +" (" + pShortName + " 0)");
		return cal;
	}


	/**
	 * Used to add major event headings (THE AGE OF MAN, etc)
	 * @param pLocale locale for which event applies.
	 * @param pYear year in calendar
	 * @param pEvent description of event.
	 */
	static public void addEventHeading(final Calendar pCal, final Locale pLocale, final int pYear,
			final String pEvent) {
		events.add(new Event (pLocale, pCal.on(pYear), pEvent));
	}

	/**
	 * Used to add major event headings with multiyear period.
	 * @param pLocale locale for which event applies.
	 * @param pYear year in calendar
	 * @param pEvent description of event.
	 */
	static public void addEventHeading(final Calendar pCal, final Locale pLocale, final int pYear,
			final int pEnd, final String pEvent,
			final String pDesc) {
		events.add(new Event (pLocale, pCal.on(pYear),
				pCal.on(pEnd), pEvent, pDesc));
	}

	/**
	 * Used to add events to calendar
	 * @param pLocale locale for which event applies.
	 * @param pYear year in calendar
	 * @param pEvent description of event.
	 */
	static public void addEvent(final Calendar pCal, final Locale pLocale, final int pYear,
			final String pEvent) {
		events.add(new Event (pLocale, pCal.on(pYear), pEvent));
	}

	/**
	 * Used to add events to calendar
	 * @param pLocale locale for which event applies.
	 * @param pYear year in calendar
	 * @param pEvent description of event.
	 */
	static public void addEvent(final Calendar pCal, final Locale pLocale, final int pYear,
			final String pEvent, String pDesc) {
		events.add(new Event (pLocale, pCal.on(pYear), pCal.on(pYear), pEvent, pDesc));
	}

	/**
	 * Used to add multiyear event to calendar.
	 * @param pLocale locale for which event applies.
	 * @param pYear year in calendar
	 * @param pEvent description of event.
	 */
	static public void addEvent(final Calendar pCal, final Locale pLocale, final int pYear,
			final int pEnd, final String pEvent,
			final String pDesc) {
		events.add(new Event (pLocale, pCal.on(pYear),
				pCal.on(pEnd), pEvent, pDesc));
	}

	/**
	 * Method to set up campaign timeline and track mutiple calendars
	 */
    public static void main(String[] args) {

    	Calendar base = addCalendar("", "Creation Calendar");
        addEventHeading(base, Locale.Sula, -999999, 0, "AGE OF DREAMS", "All existence is one realm of Powerful entities and Prey.");
        addEvent(base, Locale.Sula, -1, "Titans escape");
        addEvent(base, Locale.Sula, 0, 0, "Bastion formed", "{gobins, apes, dragons, titans}");
        addEvent(base, Locale.Sula, 0, "Time invented and locked into a single direction.");
        addEvent(base, Locale.Sula, 1, 13, "Universe created", "Power supplied by Yaweh.  Control/cooperation from titans led by Dionysus.");
        addEventHeading(base, Locale.Sula, 0, "AGE OF TITANS");
        addEvent(base, Locale.Sula, 986, "Elves created as watchers.");
        addEvent(base, Locale.Sula, 4697, "Dionysus imprisoned");
        addEvent(base, Locale.Sula, 4906, "Giants created as servants of Titans.");
        addEvent(base, Locale.Sula, 10358, "Primitive elemental forces created by Yaweh");
        addEventHeading(base, Locale.Sula, 12454, 12454, "AGE OF GODS", "humans, goblins, giants, elves, fae, dragons, titans");
        addEvent(base, Locale.Sula, 12684, "Schism in Titan community");
        addEvent(base, Locale.Sula, 12702, "First elven rebellion");
        addEvent(base, Locale.Sula, 12985, "Advesary Admitted");
        addEvent(base, Locale.Sula, 13118, "God titan war");
        addEvent(base, Locale.Sula, 13702, "Second Elven rebellion", "Light elves joined side of gods while the dark elves fought on the side of the titans.  Original Elven race ends as remaining elves are redesigned in the war by respective sides");
        addEvent(base, Locale.Sula, 14067, "Last titan defeated");
        addEvent(base, Locale.Sula, 14008, "First civilized god (fire, water, war)");
        addEventHeading(base, Locale.Sula, 14500, "AGE OF DEMONS");
        addEvent(base, Locale.Sula, 14586, "Advesary corrupts angels");
        addEvent(base, Locale.Sula, 15084, "Attack on high god");
        addEvent(base, Locale.Sula, 15584, "The fall | Heavens war");
        addEvent(base, Locale.Sula, 15592, "Modern Pantheon genesis");
        addEvent(base, Locale.Sula, 15674, "\"Mortal gods\" Are created and divided into cliques");
        addEvent(base, Locale.Sula, 16036, "Advesaries power shattered (contained , guarded)");
        addEvent(base, Locale.Sula, 16132, "Highgod/Yahweh retreats from reality");
        addEvent(base, Locale.Sula, 16231, "Outer plains become residence of celestials / infernals");

        Calendar giant = addCalendar(base, 16236, "G", "Giant Calendar");
		addEventHeading(giant, Locale.Sula, 0, "CREATION OF GIANT EMPIRE");
		addEvent(giant, Locale.Sula, 86, "Arts society and science established several thriving capitols were built.");
		addEvent(giant, Locale.Sula, 2301, 2301, "Fall of Giant Civilization", "This collapse was due to internal philosophy calling for less contact between giants to reduce intergiant violence.  Also some bad allignments caused issues that resulted in widespead abandonment and societal collapse");

		addEvent(base, Locale.Sula, 19561, "Rize of mortal civilazations", "(multiple non-interacting cultures arise. Each with own ethos, and religions)");

        Calendar sula = addCalendar(base, 21128, "S", "Sulanese Calendar");
        addEventHeading(sula, Locale.Sula, 0, "CREATION OF SULANESE FIRST EMPIRE");
        addEvent(sula, Locale.Sula, 86, "Arts society and science established");
        addEvent(sula, Locale.Sula, 102, "Mortals learn magic");
        addEvent(sula, Locale.Sula, 572, "{rise of magic power - i.e. tide up}");
        addEvent(sula, Locale.Sula, 896, "Rise in cults and religions");
        addEvent(sula, Locale.Sula, 942, "Corruption of Sulanese Empire");
        addEvent(sula, Locale.Sula, 999, "Destruction of Sulanese Empire");
        addEventHeading(sula, Locale.Sula, 999, "THE THREE EMPIRES");
        addEvent(sula, Locale.Sula, 999, "Religion fractures into multiple regional pantheons");
        addEvent(sula, Locale.Sula, 999, "Three empires form out of the ruins of the Sulanese Empire.");
        addEvent(sula, Locale.Albienne, 999, "Albienne forms near the old core of the empire.", "Originally called New Sula renamed Albienne after Emperor Albin.  Preserved administrative and logistical parts of the old empire.");
        addEvent(sula, Locale.Sula, 999, "Helen forms in the resource rich sothern regions.", "More a loosly allied group of cities than a real empire. Sulanese Heartland. Very rich in natural resources.");
        addEvent(sula, Locale.Sula, 999, "Lothia coalesces at far reach of empire.", "Lothinarious crowned first emperor - bard of yore instrumental in forming the alliance.  Considered a loose alliance formed based on mutual aid and tolerance");
        addEvent(sula, Locale.Sula, 999, 999, "Halfmen appear", "Created by mortal gods");
        addEvent(sula, Locale.Sula, 999, "Barbarian invasion (Second Empire?!?)");
        addEventHeading(sula, Locale.Sula, 1000, "FIRST INVASION - HUNDRED YEARS WAR");
        addEvent(sula, Locale.Sula, 1071, "Helen sacked");
        addEvent(sula, Locale.Sula, 1071, "Albiene threatened");
        addEvent(sula, Locale.Sula, 1071, "Lothia decimated");
        addEvent(sula, Locale.Sula, 1071, "Pantheons of Gods meet and put aside differences for first time.");
        addEvent(sula, Locale.Sula, 1071, "United Confederacy formed to drive off barbarians");
        addEvent(sula, Locale.Sula, 1071, "Barbarians driven off continental Sula nursing grudge.", "Land is salted behind them creating the great central wastes.");
        addEvent(sula, Locale.Albienne, 1071, "Albienne tries to reform Sula.");
        addEvent(sula, Locale.Sula, 1071, "Gods stop speaking to angels");
        addEvent(sula, Locale.Sula, 1071, "New pantheon formed");
        addEventHeading(sula, Locale.Sula, 1170, "ALBIENNE LOTHIAN WAR | HEAVENS WAR");
        addEvent(sula, Locale.Albienne, 1170, "Albienne Reconconquers land lost in war", "Albienne takes much of what remains of Helen");
        addEvent(sula, Locale.Albienne, 1170, "Magic fearing nationalistic govt takes power in Albienne.");
        addEvent(sula, Locale.Albienne, 1171, 1171, "Racially motivated indentured service begin in Albienne lands", "Citizens of mixed blood or unclear ethnicity are forced to serve in Foriegn legion (Roaming legion) of the Albienne army.");
        addEvent(sula, Locale.Lothia, 1170, 1175, "Lothian class struggles and civic unrest.", "Caused by high taxation to pay off war debt as well as Albienne support of unrest.");
        addEvent(sula, Locale.Lothia, 1170, "Lothian Government feels that loose alliance failed in face of superior threat. Begins restructuring into more nationalistic entity.");
        addEvent(sula, Locale.Lothia, 1170, "influx of refugees from Albienne lands straining Lothian social system.");
        addEvent(sula, Locale.Lothia, 1173, 1173, "Lothian Lower classes bore brunt of war and upset with the elvin \"nobility\"", "To appease peasents and settle class disputes education is made free to all classes");
        addEvent(sula, Locale.Lothia, 1175, "Lothian councils consists of a nobels house, and the council of mages");
        addEvent(sula, Locale.Lothia, 1185, "Lothian council now has 3 houses a nobels house, mages house and now a house of educated commoners.");
        addEvent(sula, Locale.Sula, 1200, "Pantheons of Lothain/Albienne Gods begin to fight and die.");
        addEvent(sula, Locale.Sula, 1202, "Albienne Presses Lothia in war", "Albienne takes western edge of Lothian lands by force.");
        addEvent(sula, Locale.Lothia, 1203, "Albienne Armies posed to enter Lothian capitol");
        addEvent(sula, Locale.Lothia, 1205, "Council of mages propose a great working to defeat the Albienne army which did not employ its own spellcasers so had little defense against it.");
        addEvent(sula, Locale.Lothia, 1206, "Side effect of powers unleased form dragonspire mountains.");
        addEvent(sula, Locale.Lothia, 1206, "Ripple effect that causes flooding, famine, and drought");
        addEvent(sula, Locale.Lothia, 1206, "War won, but Lothia citezens unhappy with power and destruction.");
        addEvent(sula, Locale.Lothia, 1206, "Call for limits on mage power.");
        addEvent(sula, Locale.Sula, 1206, "Ashardalon rises to godhood.");
        addEvent(sula, Locale.Lothia, 1206, "Lothia works on mages oath to balence mage power vs individual rights.");

        Calendar ab = addCalendar(sula, 1206, "AB", "After Breaking Reckoning");
        addEventHeading(ab, Locale.Sula, 0, "CREATION OF BROKEN DRAGON MOUNTAINS.");
        addEvent(ab, Locale.Sula, 0, "Great working suceeds Lothia mages destroy the Albienne army with horrific powers.");
        addEvent(ab, Locale.Sula, 2, "Barbarian invaders from Burgandry return, but better organized.");
		addEvent(ab, Locale.Albienne, 2, "The Albienne territories that were Helen fall first.");
        addEvent(ab, Locale.Lothia, 4, "Lothia empire meets barbarian empire.", "This time the Barbarians brought new type of spellcasters from beyond sea.");
        addEventHeading(ab, Locale.Sula, 4, "THULE WAR | SECOND INVASION");
        addEvent(ab, Locale.Helen, 4, "Helen sacked , Albienne loses rich southern lands.");
        addEvent(ab, Locale.Albienne, 4, 4, "Albienne foriegn legion armies are caught halfway across continent from capitol.", "Albienne legion was made mainly of \"undesirables\" not called back home after the war.  The cut-off units become countryless people known as the Romani.");
        addEvent(ab, Locale.Albienne, 4, "Thule army cuts off communication between capitol and army.");
        addEvent(ab, Locale.Albienne, 4, "Albiene threatened", "The Albienne gov't which is still bebuilding their army is no match for invaders. Albienne gov't shrunk to a few defensive holds and a name.");
        addEvent(ab, Locale.Outerplanar, 4, "Ashardelon rampant in heaven");
        addEvent(ab, Locale.Lothia, 4, "Lothian tactics hampered by new mage oath", "Foreigner invaders are able to pick off leaders since their magic is undetectable by conventional means.");
        addEvent(ab, Locale.Outerplanar, 7, "Dydd kills Ashardalon body.  Ashardalon rends Dydds spirit into pieces.");
        addEvent(ab, Locale.Sula, 8, "First record of Lycanthropic Curse.");
        addEvent(ab, Locale.Lothia, 12, "Death cult of Kyra-Shirat brings back dead heros to searve in lothian defense", "In retalliation Thule pick off Kyra-Shirat Cultist with extreme prejudice. Kyra-Shirat \"dies\"");
        addEvent(ab, Locale.Lothia, 18, 18, "Loth is \"resurrected\"", "(Note first elf raised).  Brought back from elvin afterlife which was a BAD thing.");
        addEvent(ab, Locale.Sula, 18, "The risen or \"Undead\" prove immune to powers of the Thule.");
        addEvent(ab, Locale.Lothia, 18, "Lothian capitol of Ipsus moves out of Dragon Pass near barbarian blockade into Lothian heartland.");
        addEvent(ab, Locale.Lothia, 19, "Joleth (Lothian god of Justice) deemed dead.");
        addEvent(ab, Locale.Lothia, 20, "Barbarians invaders are captured and converted into risen fighters and sent back against country men.");
        addEvent(ab, Locale.Lothia, 21, "Barbarian forces retreat past broken dragon spires and a truce is made.");
        addEventHeading(ab, Locale.Sula, 21, "END OF THULE WAR");
        addEvent(ab, Locale.Sula, 22, "Southern invaders become known as Thule");
        addEvent(ab, Locale.Thule, 23, "Thule rebellion against Burgandry");

		// following are mostly lothian internal concerns.
        addEvent(ab, Locale.Lothia, 34, "King Gerard of Lothia dies", "Questions of foul play. Several internal ministers are executed.");
        addEvent(ab, Locale.Lothia, 36, "Duke Falme attains the thrown");
        addEvent(ab, Locale.Lothia, 36, "Treasury empty gov't bond are annuled", "Military service annuities can not be paid. Unrest as entire military divisions demand restitution / back pay");
        addEvent(ab, Locale.Lothia, 38, "Northern trading houses dispute the Lothian Kings regency. Proclaim alliance with Northern Elvin Kingdom.");
        addEvent(ab, Locale.Lothia, 38, "Southern shipping houses refuse to pay new tariffs.");
        addEvent(ab, Locale.Lothia, 38, "Execution and imprisonment of ringleaders but many become privateer disrupting shipping");
        addEvent(ab, Locale.Lothia, 38, "Disorder in military complicated by \"walking dead\" left over from war.");
        addEvent(ab, Locale.Lothia, 41, "Undead re-internment plan begins", "But Intellegent undead resist re-internment");
        addEvent(ab, Locale.Lothia, 41, "Death of Falme");
        addEvent(ab, Locale.Lothia, 82, "Great Fire (Ipsus)");
        addEvent(ab, Locale.Lothia, 140, "Rinewald takes throne but is never accepted by populance");
        addEvent(ab, Locale.Lothia, 141, 189, "Reign of Prince Rinewald \"the Moron\" in Lothia", "");
        addEvent(ab, Locale.Lothia, 142, "Food Tax Fiasco");
        addEvent(ab, Locale.Lothia, 171, "Rinewald attempts to instate an official state religion.", "Results in Southern Conservatives denounce state church and refuse to pay taxes.");
        addEvent(ab, Locale.Lothia, 171, "Intellegent undead seize Lothian Council Chambers and \"Negotiate\" an end to reinternment plan", "Lothian Citizenship extended to undead");
        addEvent(ab, Locale.Lothia, 175, "Lothia institutes changes in Church due to corruption.");
        addEvent(ab, Locale.Lothia, 176, "Southern conservatives in Terino province form Terino Theocracy");
        addEvent(ab, Locale.Lothia, 176, "War with Lothian Gov't (Rinewald uses Mercenaries from southern Free cities.)");
        addEvent(ab, Locale.Lothia, 176, "Exiled shipping houses declaire themselves Kingdom of Isles", "Hire mercenaries armies away from Lothia.  Mercenary forces used to clear Lothian Garrison from southern port towns");
        addEvent(ab, Locale.Lothia, 176, "Trade battle with Kingdom of the Isles", "KOI establish trading ties with Terino and supply them through the war.");
		addEvent(ab, Locale.Lothia, 185, "Lothinarius (an undead) becomes Regent to Rinewald");
        addEvent(ab, Locale.Lothia, 189, 189, "Death of Prince Rinewald when he drowns in his own bathtub.", "Regent and several members of both houses were reportedly present.");
        addEvent(ab, Locale.Lothia, 189, "Hostilities cease between Lothia and former Lothian Territories");
        addEvent(ab, Locale.Lothia, 189, "Southern conservatives refuse to recognize undead govener and join Terino Theocracy", "Southern lands join Terino uprising");
        addEvent(ab, Locale.Lothia, 206, "Lothian empire crumbles to its smallest point");
        addEvent(ab, Locale.Lothia, 206, "Loth's 50th anniversary as \"Regent\" marked by elvin assasination attempt");

        Calendar br = addCalendar(ab, 206, "B", "Break-up of Lothia");
        addEvent(br, Locale.Lothia, 26, "Lothian treasuries rebuilt");
        addEvent(br, Locale.Lothia, 26, "Lothia back at 25% of pre-war size.");
        addEvent(br, Locale.Lothia, 68, "Battle of Dragon Pass between Thule and Lothian forces");
        addEvent(br, Locale.Sula, 81, "### IAP Campaign took place ###");
        addEvent(br, Locale.Lothia, 81, 81, "Death of Tirellian Scion starts Undead leadership race in house of nobels", "(nobility positions are for life + undead nobels do not die = more influence for family.)");
        addEvent(br, Locale.Lothia, 81, "Republic of Winn reunited with Lothia");
        addEvent(br, Locale.Sula, 101, "### Book Deal Campaign took place ###");
        addEvent(br, Locale.Lothia, 116, "Terino First Invasion of Baronies");
        addEvent(br, Locale.Lothia, 116, 116, "Diplomatic Incident between Elven Nation and Lothia", "Elvin Diplomatic representation to Lothia eradicated in assasination attempt on Loth.");
        addEvent(br, Locale.Lothia, 143, "Great Drought across Eastern Coast");
        addEvent(br, Locale.Lothia, 146, "Great Fire savages Northern Elvin kingdom");
        addEvent(br, Locale.Sula, 200, "### Mini-Baronies campaign takes place ###");
        addEvent(br, Locale.Lothia, 200, "Terino Second Invasion of Baronies.");
        addEvent(br, Locale.Sula, 200, "Birth of Alexsander legendary craftsman.");
        addEvent(br, Locale.Lothia, 203, "Lothia rebulding alliances with former states.");
        addEventHeading(br, Locale.Sula, 216, "AGE OF CHAOS (unreliable magic, fall of churches)");
        addEvent(br, Locale.Sula, 216, "### Baronies Campaign Starts ###");
        addEvent(br, Locale.Sula, 216, "Demon Gate Incedent in Baronies", "Lothia occupation of Baronies to prevent reoccurence.");
        addEvent(br, Locale.Sula, 216, "Great Nerfing", "Psionics reduced by outside force. Magic becomes erratic and a number of old spells end.");
        addEvent(br, Locale.Lothia, 216, "Freecities Halfman incursion", "Ask players about the cursed axe");
		addEvent(br, Locale.Sula, 216, "Gnomes appear on material plane");
        addEvent(br, Locale.Lothia, 216, "Boccob god of magic dies.");
        addEvent(br, Locale.Lothia, 216, "Weejas releases Death Domain to become Jaas God of art, magic, and divination.");
        addEvent(br, Locale.Lothia, 216, "Constatine loses position in house of Magic.");
        addEvent(br, Locale.Sula, 217, "Herunaro appears and declares himself the new god to prove his powers he floods Sangtha");
        addEvent(br, Locale.Sula, 217, 218, "Alexsander produces legendary equipment for gods and men.", "Items are still featured in legend.");
        addEvent(br, Locale.Sula, 217, "Massive number of still births across world.");
        addEvent(br, Locale.Lothia, 217, "Shadow invasion of Ipsus");
        addEvent(br, Locale.Lothia, 217, "Constatine regains position in House of Magic.");
        addEvent(br, Locale.Lothia, 217, "Joleth Returns as god of Law and Death.");
        addEvent(br, Locale.Sula, 217, "Constatine the Trickster dies.", "Mortal agents are blamed.  Church of Constatine eradicated in a series of raids.");
        addEvent(br, Locale.Sula, 217, "Death of Ashardalon/Nyogtha");
        addEventHeading(br, Locale.Sula, 217, 218, "END OF MORTAL GODS.", "Groups of humans and elves said to have ascended to godhood but revoked the mantle of gods.");

        Calendar ad = addCalendar(sula, 1629, "AD", "After death");
        addEventHeading(ad, Locale.Sula, 0, 55, "MAGIC BECOMES ERRATIC", "{Approaching low tide}");
        addEventHeading(ad, Locale.Sula, 1, "ELVIN MIGRATION TO THE FAR LANDS");
        addEvent(ad, Locale.Lothia, 1, "Lothian Regent steps out of Political spotlight said to have ascended into heaven");
        addEvent(ad, Locale.Lothia, 1, "Terrino Economy collapses", "Clerical powers were essential part of economic engine");
        addEvent(ad, Locale.Sula, 1, "Halfman plague", "Most halfmen die off.  Weakened immune system after death of gods.  Also interbreeding with halfling curse partly to blame.");
        addEvent(ad, Locale.Lothia, 3, "Lothian Territorial wars", "Also known as two capitals incident.  Loch gets upper hand quickly and becomes new indisputed ruler of Lothia");
        addEvent(ad, Locale.Lothia, 3, "Dragon mountains found to be shrinking due to acid rain.", "Runoff from the moutains kills surrounding bodies of water.");
        addEvent(ad, Locale.Lothia, 26, "Dragon mountains reduced to hills with acrid canyons around them.", "Dragon Mounts now called Acrid Canyons or Great Divide. Acid rain over the Dragon mounts / Great rift finally ends.");
        addEvent(ad, Locale.Gian, 42, "Thule internal conflict", "Gian Confederace, Thule, and Northern Lothia kingdoms unite under Empress Jaenelle");

        addEventHeading(ad, Locale.Sula, 55, 159, "MAGIC GONE", "{low tide}");
        addEvent(ad, Locale.Sula, 123, "### Cowboys Campaign ###");


        addEventHeading(ad, Locale.Sula, 151, 259, "MAGIC RETURN", "{corrupted tide}");
        addEvent(ad, Locale.Helen, 177, 191, "First Mage War", "Early adopters of magic inspiring fear and loathing among those without powers");
        addEvent(ad, Locale.Albienne, 178, "First aware Warforged Created");
        addEvent(ad, Locale.Sula, 200, "Balifar the Mad Duke executed. Sadist/Canibal killed by his own council.");
        addEvent(ad, Locale.Helen, 202, 209, "Mage Wars II", "People compelled to willingly go beyond capabilities to act as living bombs in enemy cities.");
        addEvent(ad, Locale.Albienne, 203, "Warforged Mass Produced");
        addEvent(ad, Locale.Sula, 205, "Sanga-Thule inheritance Dispute");
        addEvent(ad, Locale.Helen, 223, "### Witchhunter Campaign ###");
        addEvent(ad, Locale.Isles, 260, "Tar-Baphon's attempt at Ascention rips hole in reality", "Causes the storm now known as the Eye");
        addEvent(ad, Locale.Sula, 260, "Contamination of Magic clears up");

        addEvent(ad, Locale.Gian, 283, "### Thule's Gold Campaign ###");
        addEvent(ad, Locale.Thule, 284, "New Thule clan formed - Mae clan", "First clan with female first ancestor.  Also only clan where ancestors may manifest externally");
        addEvent(ad, Locale.Sula, 284, "Titan Besmira freed from captivity at bottom of ocean", "Coastal cities are flooded.");
		Calendar bp = addCalendar(sula, 1913, "BP", "Besmirian Pantheon");
        addEvent(bp, Locale.Sula, 0, "Besmirian pantheon formed with gods and titans working together to repair reality");
        addEvent(bp, Locale.Isles, 18, "### Besmira's Wake Mini-Run ###");
        addEvent(bp, Locale.Isles, 88, "### Pirate Campaign ###");

        // calender is thule/burgandry affairs
		Calendar shi = addCalendar(base, 21881, "Shi", "Rule of Divine Shi Emperor");
		addEvent(shi, Locale.Burgandry, 0, 100, "God walks earth as first Shi emperor.", "First emperor lived 100 years and was undefeated in battle");
		addEventHeading(shi, Locale.Burgandry, 0, "1ST DYNASTY - SHI.");
		addEvent(shi, Locale.Burgandry, 1, "Southern war leader Shi Huangdi started conquing neighboring states");
		addEvent(shi, Locale.Burgandry, 30, "Tan general responsible for many military sucesses.");
		addEvent(shi, Locale.Burgandry, 90, "No male offspring of Shi.");
		addEvent(shi, Locale.Burgandry, 100, "Shi assasinated. (Many enemies due to conquering of other clans)");
		addEventHeading(shi, Locale.Burgandry, 100, 120, "2ND DYNASTY - TAN.", "Tan Lords are still known as Great generals.");
		addEvent(shi, Locale.Burgandry, 100, "Shi's senior general suceeded him.");
		addEvent(shi, Locale.Burgandry, 101, "Expanded lands conquered by first emperor.");
		addEvent(shi, Locale.Burgandry, 110, "Leadership was declared right of senior General.");
		addEvent(shi, Locale.Burgandry, 119, "Death of Tan Emperor with no children Han General suceeded Tan ");
		addEventHeading(shi, Locale.Burgandry, 120, 210, "3RD DYNASTY - HAN.", "Long Dynasty.");
		addEvent(shi, Locale.Burgandry, 120, "Han Returns to Hereditary rule");
		addEvent(shi, Locale.Burgandry, 210, "Coalition falls apart when Eastern lords support Tan clan against Western Lords.");
		addEvent(shi, Locale.Burgandry, 213, "Return to state of individual clans");
		addEventHeading(shi, Locale.Burgandry, 218, 238, "4TH DYNASTY - ZHANG.", "Northern Lords Invade South");
		addEvent(shi, Locale.Burgandry, 223, 239, "Zhang rules with an iron fist.", "");
		addEvent(shi, Locale.Burgandry, 223, "Men from south are sent off to fight wars against other states,  ");
		addEvent(shi, Locale.Burgandry, 228, 228, "Zhang conquer remaining south",  "Local garrisons are always foreign clan.");
		addEvent(shi, Locale.Burgandry, 235, "Zhang experiences difficulty taking northern lords.");
		addEvent(shi, Locale.Burgandry, 238, "Zhang homeland threatened by Shing and Xu.  Lose control of South.");
		addEvent(shi, Locale.Burgandry, 239, "Shing and Xu do not wish rule of South so assign management to Eastern Lord unpopular with West.");
		addEventHeading(shi, Locale.Burgandry, 240, 257, "5TH DYNASTY - CHU RULING FOR SHING/XU.", "");
		addEvent(shi, Locale.Burgandry, 240, "Southern startes left under rule of Chu.");
		addEvent(shi, Locale.Burgandry, 243, "Unrest in West, Chu rulership is not popular.");
		addEvent(shi, Locale.Thule, 247, 247, "Burgandry Invasion of Sula Begins.", "Xu, Yuan, and Shing invade northern continent (Sula).");
		addEvent(shi, Locale.Thule, 257, "Invasion is sucessful, but 3 lords can not supply enough troops.");
		addEvent(shi, Locale.Burgandry, 257, "While North is distracted with invasion Western Lords Reject Chu.");
		addEvent(shi, Locale.Burgandry, 257, "Rebellion leaders in west are Cao, Shu Wu, Wei, Lee and Chen ");
		addEvent(shi, Locale.Burgandry, 257, "Loyalists in east are is Tan, Lu, Chu, and Sun.");
		addEvent(shi, Locale.Burgandry, 257, "Han stay neutral in rebellion due to percieved risk from North.");
		addEventHeading(shi, Locale.Burgandry, 258, "6TH DYNASTY - CAO.");
		addEvent(shi, Locale.Burgandry, 258, "Western rebellion forces Chu from capitol. Tang defects to West for status in new court.");
		addEvent(shi, Locale.Burgandry, 258, "Chu leaders and Sun Allies hold out in Sun lands.");
		addEvent(shi, Locale.Burgandry, 258, "Cao take power in south.");
		addEvent(shi, Locale.Thule, 260, "Shing / Xu fighting two sided war.  ");
		addEvent(shi, Locale.Thule, 272, "Shing concintrates on conqueing Sula ");
		addEvent(shi, Locale.Burgandry, 272, "Xu strains to put down rebellion in south.");
		addEvent(shi, Locale.Burgandry, 283, "Chu Lu Sun and Xu put down Cao emperor and start reclaiming Western Lands.");
		addEventHeading(shi, Locale.Burgandry, 284, "7TH DYNASTY - ZHANG/HAN ALLIANCE.");
		addEvent(shi, Locale.Burgandry, 284, "Zhang forges alliance with Han in south. ");
		addEvent(shi, Locale.Burgandry, 284, "While Other Northern Lords are fighting in Sula Zhang attacks and takes north.");
		addEvent(shi, Locale.Burgandry, 285, "Han / Zhang Alliance takes control.");
		addEvent(shi, Locale.Burgandry, 313, "Shing elders are in Sula, forces left behind are demolished.");
		addEvent(shi, Locale.Burgandry, 300, "Power consolidation by Han.");
		addEvent(shi, Locale.Burgandry, 309, "Han long considered most powerful southern clan becomes dominant in south.");
		addEvent(shi, Locale.Burgandry, 311, "Xu make peace with Zhang and become linked militarily to keep Han from becoming too powerful.");
		addEvent(shi, Locale.Thule, 318, 318, "End of Burgandry Invasion.", "Zhang makes peace with Shing elders who were forced to retreat from Sula after supplies were cut off.");
		addEventHeading(shi, Locale.Burgandry, 399, 952, "8TH DYNASTY - ZHAO ALLIANCE.", "Deft play of clans against one another characterizes Zhao alliance.");
		addEvent(shi, Locale.Burgandry, 399, "Zhang and Han families inter-marry and the combined decendants are called Zhou.");
		addEvent(shi, Locale.Burgandry, 402, "Zhou balances other states off against one another deftly keeping any clans from having real power.");
		addEvent(shi, Locale.Burgandry, 427, "Instates practice of Clans reporting to capitol on bi-yearly basis to strain clan resources.");
		addEvent(shi, Locale.Thule, 455, 474, "Second Invasion of Sula.", "To control population growth in south Zhou forces southern lords to conduct invasion of Sula under command of Xu.");
		addEvent(shi, Locale.Thule, 455, "Main forces of army are Chu, Tan, Shing, and Xu.  All southern clans required to supply levy of 500 men,");
		addEvent(shi, Locale.Thule, 455, "Xu family in command of invasion but Burgandry family held hostage.");
		addEvent(shi, Locale.Thule, 457, "Northern conquest goes very well due to northern lands being in turmoil.");
		addEvent(shi, Locale.Thule, 460, "War against Lothia goes poorly.  Lothia has favorable terain and several very astute generals.");
		addEvent(shi, Locale.Thule, 462, "Athena raids through heartland are seen as an afface to Xu.  Tan forces have to be commited to stop.");
		addEvent(shi, Locale.Thule, 462, "Loss of best generals make Dragon spire battles draw to a crawl.");
		addEvent(shi, Locale.Thule, 465, "Lothia starts using Thule undead breaking moral of clans who hold spirits as sacred.");
		addEvent(shi, Locale.Thule, 472, "Tan stop Athenian band, but give fallen enemies highest honors for valor costing Xu more face.");
		addEvent(shi, Locale.Thule, 473, "Xu attempt to punish Tan, ");
		addEvent(shi, Locale.Thule, 473, "Rebellion - Shing and Chu forces turn on Xu and free Tan forces.");
		addEvent(shi, Locale.Thule, 473, "Xu leaders are executed, Xu forces are disbanded. ");
		addEvent(shi, Locale.Thule, 474, "Remaining invading clans make peace with Lothia and set about establishing their own empire.");
		addEvent(shi, Locale.Burgandry, 480, 519, "Embarrasment from northern sucession puts strain on Zhao control.", "Period of turmoil as Zhao struggle to rexert supremacy in Burgandry.");
		addEvent(shi, Locale.Burgandry, 481, "Xu disbanded and lands placed under Zhang control");
		addEvent(shi, Locale.Burgandry, 481, "Zhao war of honor on Chu, Shing, and Tan states.");
		addEvent(shi, Locale.Burgandry, 482, "Tan (whom had no warning and had commited most of their forces to Sula) were eradicated.");
		addEvent(shi, Locale.Burgandry, 515, "Chu fares well against Han forces.  ");
		addEvent(shi, Locale.Burgandry, 517, "Shing manage to kill Zhao leader during battle.");
		addEvent(shi, Locale.Burgandry, 519, "Zhao put end to rebellion in Burgandry.");
		addEvent(shi, Locale.Burgandry, 629, "Burgandry Internal religious wars rock nation.");
		addEvent(shi, Locale.Burgandry, 717, "Split in Zhou house results in cival war.");
		addEvent(shi, Locale.Burgandry, 733, "End of Zhou/Zhou war.");
		addEvent(shi, Locale.Burgandry, 847, "Period of rampant Xenophobia.");
		addEvent(shi, Locale.Burgandry, 875, "Unrest in Burgandry due to changes in psionics.");
		addEvent(shi, Locale.Burgandry, 876, "Burgandry in religious turmoil due to ancestorial chain being broken.");
		addEvent(shi, Locale.Burgandry, 968, 952, "Zhang internal dispute of Succession.  Multiple canidates tied for sucession.", "Zhang traditional canidate, Zhao canidate that was a cousin of previous emperor, Han canidate that was Brother to Emperess as a leading Han canidate.  Zhang Han and Zhao canidates all have strong positions and military support.");
		addEventHeading(shi, Locale.Burgandry, 953, "9TH DYNASTY - WARRING STATES.");
		addEvent(shi, Locale.Burgandry, 953, 968, "In Burgandry several clans refuse to pay tribute or provide troops until sucession is cleared up.", "States that are \"rebelling\" by waiting to see results of internal dispute include Chen, Wei, Wu, Sun, Lu, Shu, Lee, Yuan");
		addEvent(shi, Locale.Burgandry, 960, "Xu province rebels under a Xu leader against Zhang control.  ");
		addEvent(shi, Locale.Burgandry, 968, "Branch of Zhang Dynasty wiped out in Battle at Xu Lau Gate.");


		/**
		 * Print list of all events that occur in this calendar
		 */
		Date lastEvent = null;
		boolean asHtml = true;
		for(Event event : events) {
			if (event.locale == Locale.Burgandry) continue; 
			if (asHtml) System.out.print("<div style=\"white-space:pre\">");
			if ((null == lastEvent) || (event.getDate().compareTo(lastEvent) != 0)) {
				lastEvent = event.getDate();
				if (asHtml) System.out.print("<strong>");
				System.out.print(lastEvent.getAbsoluteYear());
				if (asHtml) System.out.print("</strong>");
			} else {
				System.out.print('\t');
			}
			System.out.println(event.toString());
			if (asHtml) System.out.print("</div>");
		}

	}
}
