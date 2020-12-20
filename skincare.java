import java.io.*;
import java.util.Scanner;
class consult {
    String line = " \n";
    void cform() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient name");
        String pname = sc.nextLine();
        try {
            FileOutputStream fout = new FileOutputStream(pname + ".txt");
            pname = "Name : "+pname;
            fout.write(pname.getBytes());
            fout.write(line.getBytes());
            System.out.println("Enter your Profession");
            String prof = sc.nextLine();
            prof = "Profession : "+prof;
            fout.write(prof.getBytes());
            fout.write(line.getBytes());

            System.out.println("Enter your Date of Birth in DD/MM/YYYY format");
            String dob = sc.nextLine();
            dob = "Date of birth : "+dob;
            fout.write(dob.getBytes());
            fout.write(line.getBytes());
            System.out.println("Enter your Age");
            String age = sc.nextLine();
            age = "Age : "+age;
            fout.write(age.getBytes());
            fout.write(line.getBytes());
            System.out.println("Enter your Contact number");
            String contact = sc.nextLine();
            contact = "Contact No : "+contact;
            fout.write(contact.getBytes());
            fout.write(line.getBytes());
            System.out.println("Do you have any medication history ?\n" +
                    "- Allergy\n" +
                    "- Blood Pressure\n" +
                    "- Diabeties\n" +
                    "- Epilepsy" +
                    "- Heart disease\n" +
                    "- Skin condition\n" +
                    " --- Enter if any");
            String med_history=sc.nextLine();
            med_history = " Medication History : "+med_history;
            fout.write(med_history.getBytes());
            fout.write(line.getBytes());

            System.out.println("Any current Medication ? Mention if any");
            String c_med = sc.nextLine();
            c_med="Current Medication :"+c_med;
            fout.write(c_med.getBytes());
            fout.write(line.getBytes());

            System.out.println("Any Previous Medication ? Mention if any");
            String p_med = sc.nextLine();
            p_med="Previous Medication :"+p_med;
            fout.write(p_med.getBytes());
            fout.write(line.getBytes());

            System.out.println("Within last year have you been under a permatologist or physical care ?");
            String p_care = sc.nextLine();
            p_care="Permatological / Physical care :"+p_care;
            fout.write(p_care.getBytes());
            fout.write(line.getBytes());

            System.out.println("Within last 9 months have you under gone any surgery ? Mention if any");
            String surg= sc.nextLine();
            surg = "Surgery in last 9 months :"+surg;
            fout.write(surg.getBytes());
            fout.write(line.getBytes());

            System.out.println("Do you wear contact lens ?");
            String lens= sc.nextLine();
            lens = "Contact Lens :"+lens;
            fout.write(lens.getBytes());
            fout.write(line.getBytes());

            System.out.println("what skin care product are you currently using ? Mention if any\n" +
                    "- Soap/Facewash\n" +
                    "- Cleanser\n" +
                    "- Depilatory Products\n" +
                    "- Eye products\n" +
                    "- Exfoliates\n" +
                    "- Mask/Facepack\n" +
                    "- Moisturizer\n" +
                    "- Tanner\n" +
                    "- Toner\n");
            String s_care = sc.nextLine();
            s_care= "Skin care Products :"+s_care;
            fout.write(s_care.getBytes());
            fout.write(line.getBytes());


            System.out.println("Enter name of Skincare service you want to use ?\n" +
                    "- Bleach\n" +
                    "- Facial\n" +
                    "- Manicure\n" +
                    "- Clean up\n" +
                    "- Waxing\n" +
                    "- Threading \n" +
                    "- Body Spa\n" +
                    "please seperate with a comma if multiple");
            String service = sc.nextLine();
            service = "services required : "+service;
            fout.write(service.getBytes());
            fout.write(line.getBytes());
            if (service.toLowerCase().contains("bleach")) {
                System.out.println("Enter type of bleach\n" +
                        "Face\n" +
                        "Partial Body(Hand/Feet)\n" +
                        "Full Body");
                String B_type = sc.nextLine();
                B_type = "Bleach type :" + B_type;
                fout.write(B_type.getBytes());
                fout.write(line.getBytes());
            }
            else if (service.toLowerCase().contains("facial")) {
                System.out.println("Enter type of facial \n" +
                        "Basic\n" +
                        "Skin glow\n" +
                        "Anti tan\n" +
                        "Anti ache\n" +
                        "Anti aging");
                String F_type = sc.nextLine();
                F_type = "Facial type :" + F_type;
                fout.write(F_type.getBytes());
                fout.write(line.getBytes());
            }
            else if (service.toLowerCase().contains("manicure")) {
                System.out.println("Enter type of manicure\n" +
                        "Basic\n" +
                        "Deluxe\n" +
                        "Hand/Foot spa\n");
                String m_type = sc.nextLine();
                m_type = "Manicure type :" + m_type;
                fout.write(m_type.getBytes());
                fout.write(line.getBytes());
            }
            else if (service.toLowerCase().contains("clean up") || service.toLowerCase().contains("cleanup") ) {
                System.out.println("Enter type of Clean up\n" +
                        "Basic\n" +
                        "Aroma\n" +
                        "De-Tan\n");
                String c_type = sc.nextLine();
                c_type = "Clean up type :" + c_type;
                fout.write(c_type.getBytes());
                fout.write(line.getBytes());
            }
            else if (service.toLowerCase().contains("waxing")) {
                System.out.println("Enter type of waxing\n" +
                        "Face\n" +
                        "Hands\n" +
                        "Legs\n" +
                        "Full Body\n");
                String w_type = sc.nextLine();
                w_type = "Waxing type :" + w_type;
                fout.write(w_type.getBytes());
                fout.write(line.getBytes());
            }
             else if (service.toLowerCase().contains("threading")) {
                System.out.println("Enter type of threading \n" +
                        "Eye brow\n" +
                        "Upper lip\n" +
                        "Full face\n");
                String t_type = sc.nextLine();
                t_type = "Threading type :" + t_type;
                fout.write(t_type.getBytes());
                fout.write(line.getBytes());
            }
              else System.out.println(" ");

            System.out.println("\n\n");
            fout.close();
            System.out.println("Record successfully written...........\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void viewData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient name to open report");
        String fname = sc.nextLine();
        try {
            FileInputStream fin = new FileInputStream(fname + ".txt");
//            int i = 0;
//            while ((i = fin.read()) != -1) {
//                System.out.print((char) i);
            Scanner myReader = new Scanner(fin);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
class welcome
{
    Scanner sc = new Scanner(System.in);
    consult cns = new consult();
    quicktips qt= new quicktips();
    int choice ;
    String password ;
    void admin()
    {
        System.out.println("Please enter password to login to admin section");
        password = sc.nextLine();
        if (password.equals("Skincare"))
            do {


                System.out.println("Welcome Admin\n" +
                        "Press 1 to View patients record\n" +
                        "Press 2 to fill a Consultant form\n" +
                        "Press 3 to exit\n");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        cns.viewData();
                        break;
                    case 2:
                        cns.cform();
                        break;
                    case 3: System.exit(0);
                    default:
                        System.out.println("Invalid choice");
                }
            }while (choice!=3);

    }
    void patient() {
        do {


            System.out.println("---------- Welcome to Skincare Software ---------\n");
            System.out.println("Press 1 to fill consultant form\n" +
                    "Press 2 to quick view skincare solutions\n" +
                    "Press 3 to exit\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    cns.cform();
                    break;
                case 2:
                    System.out.println("Press 1 for Dry skin\n" +
                            "Press 2 for Oily skin\n" +
                            "Press 3 for Sensitive skin\n" +
                            "Press 4 for General Tips for All skin types");
                    int skinchoice= sc.nextInt();
                    switch (skinchoice)
                    {
                        case 1: qt.dryskin();
                        break;
                        case 2: qt.oilyskin();
                        break;
                        case 3: qt.sensitiveskin();
                        break;
                        case 4: qt.generaltips();
                        break;
                        default:
                            System.out.println("You have made invalid choice. press 2 to correct");
                    }
                    break;
                case 3: System.exit(0);
                break;
                default:
                    System.out.println("You have made incorrect choice.");

            }
        }while (choice!=3);
    }
}
class quicktips
{
    void dryskin()
    {
        System.out.println("-------- For Dry skin follow this tips --------\n\n" +
                "* Don’t take hot showers or baths. Hot water is not a friend to your\n " +
                " dry skin as it breaks down the lipid barriers in the skin, \n" +
                "which decreases moisture.\n" +
                " To help dry skin, take shorter showers using warm water.\n\n" +
                "* Moisturize! The way you moisturize in the winter is different \n" +
                "than how you moisturize in the summer months. Every time, \n" +
                "after showering or washing your face or hands, \n" +
                "apply a heavier, oil-based moisturizer as it traps existing moisture in your skin.\n\n" +
                "* Skip the lotion and use an ointment or cream.\n " +
                "Lotions can be more irritating and less effective than ointments \n" +
                "and creams for dry skin. When selecting a cream or ointment, look for one \n" +
                " that contains an oil such as olive oil or jojoba oil, or one with shea butter.\n\n" +
                "* Exfoliate. Use a light exfoliate scrub to get rid of the top layer\n " +
                "of dead skin cells and expose newer healthier-looking skin. \n" +
                "Make sure to not over-exfoliate.\n\n" +
                "* Apply lip balm. Shop around for a healing lip balm that" +
                "\n works best and also feels good on your lips.\n\n" +
                "* Plug in a humidifier. Putting moisture back into your home’s air helps prevent extreme dry skin.\n\n" +
                "* When outside, wear gloves and layers. Our hands are the most exposed \n " +
                "body part to the cold weather and, typically, the first to experience dry skin.\n" +
                " Wearing gloves anytime you’re outside will help decrease raw skin. \n" +
                "Also, it is important to wear layers of clothing when being active outside.\n" +
                " If you experience sweating, you can take off layers and reduce  \n" +
                "wet clothes being close to the skin as they can cause irritation.\n\n");
    }
    void oilyskin()
    {
        System.out.println("-------- For Oily skin follow this tips --------\n\n") ;
        System.out.println("* Cleanse Face at Least Twice a Day\n" +
                "A simple way to keep oily skin in check is to cleanse your face regularly. \n" +
                "Wash your face twice a day, both morning and night.\n" +
                "Use a foaming soap or facial cleanser over cream-based or lotion cleansers.\n" +
                " Foaming cleansers do a much better job cleansing away excess oil \n" +
                "and leave your skin feeling fresh and clean.\n\n" +
                "* Use an Astringent\n" +
                "An astringent is another good way to control oil. Astringents are like toners,\n" +
                " except they are made especially for oily skin types.\n" +
                " Astringents help remove excess oil from the skin and tighten the pores (temporarily, at least).\n\n" +
                "* Use Oil-Free and Water-Based Products. Obviously, you don't want to put any more oil\n" +
                " onto your skin than is already there. Look for \"oil-free\" on the label, \n" +
                "especially for those leave-on products like moisturizers, sunscreen, and makeup.\n\n" +
                "* Don't Scrub at Your Skin. Those of us with oily skin seem especially conditioned to scrubbing away,\n" +
                " and it can be a hard habit to break. After all, won't scrubbing at the skin help deep-clean the pores,\n" +
                " clear acne and reduce oiliness? Surprisingly, no. Rubbing the skin with abrasive scrubs, pads,\n" +
                " or washcloths won't make your skin less oily and won't improve acne. It will irritate the skin, though.\n" +
                " Oily or not, be kind to your skin and treat it gently.\n\n" +
                "* Exfoliate and Use Acne Treatments\n" +
                "Acne treatments and exfoliating products reduce excess oil, and can also improve the look of large pores.\n " +
                "Oily skin and large pores often go hand in hand and can be just as frustrating as acne itself.\n" +
                " While you can't permanently shrink your pore size, you can make them look smaller.\n" +
                "Many acne medications pull double-duty and reduce enlarged pores while clearing breakouts. \n" +
                "Topical retinoids, in particular, are good at minimizing large pores.\n" +
                " Over-the-counter salicylic acid is another option.\n\n");
    }
    void sensitiveskin()
    {
        System.out.println("-------- For Sensitive skin follow this tips --------\n\n") ;
        System.out.println("* Cleansing. It is a very important step in the skin care routine for any skin type. \n " +
                " It could be challenging for sensitive skin as you are trying to remove all dirt off\n" +
                " and still not to irritate your reactive skin.\n\n" +
                "DO NOT use hot water.  As simple as it sounds, avoiding hot water could really help \n" +
                "to eliminate breakouts and inflammation.  Hot water is quit hash on the skin and removes\n " +
                "lipid barrier much faster than lukewarm water. So, DO make sure that you are using comfortable\n " +
                "temperature water that will not make your skin angry.\n\n " +
                "DO NOT use foamy cleansers as they contain sodium laurel sulfate which is very harsh on the skin \n" +
                "(in fact, foamy cleansers should not be used regardless the skin type). \n\n" +
                "Consider using milky creamy cleansers or even old-fashioned bar soaps as they contain natural fats and oils.\n\n" +
                "* Toner. Toners do not tone anythings as your might think from the name \n" +
                "(they do not make your skin firmer or stronger). However, toner is an essential step in skin care. \n" +
                " Toner is applied right after cleansing and drying skin with a towel.\n\n" +
                "* Serums or Essences/Ampoules. This is an optional step for you, but you might consider it.\n" +
                "Serums or Essences are infused with concentrated amount of ingredients that are designed\n " +
                "to target specific issues: dehydration, clogged pores, \n" +
                "fine lines and wrinkles, dull and sagging skin, age spots etc.\n\n" +
                "* Moisturizers and Creams. Both toner and serum (if you are using one)  are lightweight\n" +
                " and need to be sealed with either moisturizer or cream depending on how dehydrated your skin is.\n" +
                "Aim for lightweight oil-free, wax-free and lipid free moisturizers and creams.\n\n" +
                "* Sunscreen. You need sun protection from harmful UV and UA rays.\n" +
                "  UVA rays cause premature skin aging, skin dehydration burns and skin cancer (to say the least).\n" +
                "  So if you are anticipating to be exposed to sun for  more than 5 minutes, you need sun screen.\n\n" +
                "Remember, that you cannot just apply sun screen in the morning and hope that it will last \n" +
                "through the day.  You will need to refresh your sun protection before going outdoors.\n\n" +
                "Sunscreen is especially important for sensitive skin as your skin burns and reddens easily, \n" +
                " sun can also cause irritation and breakouts.\n\n" +
                "Sunscreens are usually harsh for any skin type and we use them because benefits outweigh\n" +
                " the harm sun rays cause us.  The best tip for sensitive skin care and sun is to avoid sun exposure\n" +
                " completely by wearing big hats or staying in the shade.\n\n");
    }
    void generaltips()
    {
        System.out.println("-------- Some general tips for all type of skins --------\n\n" );
        System.out.println("1. Use a broad spectrum sunscreen that blocks both UVA and UVB rays.\n" +
                "2. Avoid direct sunlight, and wear a hat and sunglasses.\n" +
                "3. Don't smoke.\n" +
                "4. Stay hydrated.\n" +
                "5. Wash your skin gently but thoroughly every day and never wear makeup to bed.\n" +
                "6. Moisturize.\n" +
                "7. Take care of your mental health.\n" +
                "8. Avoid spicy and oily food. Eat healthy. \n\n");

    }
}
public class skincare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        consult cns = new consult();
        welcome wc= new welcome();
        int choice;
        do {


            System.out.println("Press 1 if you are Admin\n" +
                    "Press 2 if you are a patient\n" +
                    "Press 3 to exit\n");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: wc.admin();
                break;
                case 2: wc.patient();
                break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter correct input");
            }
        }while(choice!=3);

    }
}
