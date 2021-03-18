package projekt;

import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.TimerTask;


public class clicker extends JFrame implements MouseListener{
    JLabel tytuł;
    JLabel tekst;
    JButton przycisk;
    JTextArea tekst2;
    JTextArea nagroda1;
    JTextArea nagroda2;
    JTextArea nagroda3;
    JTextArea nagroda4;
    JTextArea nagroda5;
    JTextArea nagroda6;
    JTextArea nagroda7;
    JTextArea nagroda8;
    JTextArea nagroda9;
    JTextArea nagroda10;
    JTextArea listanagrud;
    JLabel achievement1;
    JLabel achievement2;
    JButton ulepszenie1;
    JButton ulepszenie2;
    JButton ulepszenie3;
    JButton ulepszenie4;
    JButton ulepszenie5;
    JButton ulepszenie6;
    JButton ulepszenie7;
    JButton ulepszenie8;
    JButton ulepszenie9;
    JButton ulepszenie10;
    JLabel ul1;
    JLabel ul2;
    JLabel ul3;
    JLabel ul4;
    JLabel ul5;
    JLabel ul6;
    JLabel ul7;
    JLabel ul8;
    JLabel ul9;
    JLabel ul10;
    JLabel poziom;
    JLabel opis1;
    JLabel opis2;
    JLabel sklep;
    JLabel koszt;
    JLabel koszt1;
    JButton kolor1;
    JButton kolor2;
    JButton kolor3;
    JButton kolor4;
    JButton kolor5;
    JButton kolor6;
    JButton kolor7;
    JButton kolor8;
    JButton kolor9;
    JButton kolor10;
    JLabel autor;



    long k=0;
    int ok;
    int u1=1;
    int u2=0;
    int u3=0;
    int u4=1;
    int kol=0;
    int c1=10;
    int c2=100;
    int c3=20;
    int c4=40;
    int c5=1000;
    int c6=10000;
    int c7=20000;
    int c8=100000;
    int c9=1000000;
    int c10=2147483647;
    int cz=100;
    int poz1=0;
    int poz2=0;
    int poz3=0;
    int poz4=0;
    int poz5=0;
    int poz6=0;
    int poz7=0;
    int poz8=0;
    int poz9=0;
    int poz10=0;
    int los=0;
    int los2=100;
    int x=0;
    int a=0;

    Random e =new Random();
    int g=e.nextInt(100);


        clicker(){
            addMouseListener(this);
            setTitle("Projekt Jacek Sus 2Kg");

            //tytuł
            tytuł=new JLabel("Gra W Klikanie");
            tytuł.setBounds(50, 10, 200, 25);
            tytuł.setFont(new Font("Comic Sans", (Font.BOLD | Font.ITALIC), 20));
            tytuł.setForeground(Color.blue);
            //-------------------------------------------------------

            //autor
            autor=new JLabel("Aurot: Jacek Sus 2Kg");
            autor.setBounds(10,900,500,50);
            autor.setFont(new Font("Comic Sans",(Font.BOLD|Font.ITALIC),40));
            autor.setForeground(Color.RED);
            //-------------------------------------

            //tekst
            tekst=new JLabel();
            tekst.setBounds(85, 30, 200, 20);
            //---------------------------------------------------------

            //tekst2
            tekst2 = new JTextArea();
            tekst2.setBounds(50, 100, 200, 200);
            tekst2.setBackground(Color.white);
            //-------------------------------------------------------

            //opisy
            opis1=new JLabel("opis");
            opis1.setBounds(300,40,100,50);

            opis2=new JLabel(" ");
            opis2.setBounds(300,60,300,50);
            //-------------------------------------------------------

            //achievement
            achievement1=new JLabel("achievementy");
            achievement1.setBounds(530,30,100,50);

            achievement2=new JLabel("liczba kliknięć ogólnie"+ok);
            achievement2.setBounds(530,50,200,50);
            //-------------------------------------------------------------

            //lista nagród
            listanagrud=new JTextArea(" ");
            listanagrud.setBounds(300,100,100,200);
            //---------------------------------------------------------

            //nagrody
            nagroda1=new JTextArea(" ");
            nagroda1.setBounds(530,90,125,70);

            nagroda2=new JTextArea(" ");
            nagroda2.setBounds(530,170,180,120);

            nagroda3=new JTextArea(" ");
            nagroda3.setBounds(530,300,210,210);

            nagroda4=new JTextArea(" ");
            nagroda4.setBounds(530,520,235,235);

            nagroda5=new JTextArea(" ");
            nagroda5.setBounds(530,765,260,220);

            nagroda6=new JTextArea(" ");
            nagroda6.setBounds(800,70,260,200);

            nagroda7=new JTextArea(" ");
            nagroda7.setBounds(800,280,290,225);

            nagroda8=new JTextArea(" ");
            nagroda8.setBounds(800,515,260,240);

            nagroda9=new JTextArea(" ");
            nagroda9.setBounds(800,770,260,220);

            nagroda10=new JTextArea(" ");
            nagroda10.setBounds(1100,70,265,290);

            //------------------------------------------------------------------

            //przycisk
            przycisk = new JButton();
            przycisk.setBounds(50, 50, 100, 50);
            //-------------------------------------------------------

            //poziom
            poziom=new JLabel("poziom wynosi "+kol);
            poziom.setBounds(150, 50, 100, 50);
            //----------------------------------------------------------------

            //ulkepszenie
            ulepszenie1=new JButton("ulepszenie1");
            ulepszenie1.setBounds(50,300,200,50);

            ulepszenie2=new JButton("ulepszenie2 ");
            ulepszenie2.setBounds(50,350,200,50);

            ulepszenie3=new JButton("ulepszenie3");
            ulepszenie3.setBounds(50,400,200,50);

            ulepszenie4=new JButton("ulepszenie4 ");
            ulepszenie4.setBounds(50,450,200,50);

            ulepszenie5=new JButton("ulepszenie5 ");
            ulepszenie5.setBounds(50,500,200,50);

            ulepszenie6=new JButton("ulepszenie6 ");
            ulepszenie6.setBounds(50,550,200,50);

            ulepszenie7=new JButton("ulepszenie7 ");
            ulepszenie7.setBounds(50,600,200,50);

            ulepszenie8=new JButton("ulepszenie8 ");
            ulepszenie8.setBounds(50,650,200,50);

            ulepszenie9=new JButton("ulepszenie9 ");
            ulepszenie9.setBounds(50,700,200,50);

            ulepszenie10=new JButton("ulepszenie10 ");
            ulepszenie10.setBounds(50,750,200,50);

            ul9= new JLabel("> "+"koszt "+c9);
            ul9.setBounds(270,715,200,25);

            ul10= new JLabel("> "+"koszt "+c10);
            ul10.setBounds(270,765,200,25);

            ul8= new JLabel("> "+"koszt "+c8);
            ul8.setBounds(270,665,200,25);

            ul1= new JLabel("> "+"koszt "+c1);
            ul1.setBounds(270,315,200,25);

            ul2=new JLabel("> "+"koszt "+c2);
            ul2.setBounds(270,365,200,25);

            ul3= new JLabel("> "+"koszt "+c3);
            ul3.setBounds(270,415,200,25);

            ul4=new JLabel("> "+"koszt "+c4);
            ul4.setBounds(270,465,200,25);

            ul5=new JLabel("> "+"koszt "+c5);
            ul5.setBounds(270,515,200,25);

            ul6=new JLabel("> "+"koszt "+c6);
            ul6.setBounds(270,565,200,25);

            ul7=new JLabel("> "+"koszt "+c7);
            ul7.setBounds(270,615,200,25);
            //---------------------------------------------------------------

            //sklep
            sklep=new JLabel("Sklep");
            sklep.setBounds(1500,10,100,100);

            koszt=new JLabel("koszt każdego koloru 500");
            koszt.setBounds(1500,30,150,100);

            koszt1=new JLabel(" ");
            koszt1.setBounds(1700,50,150,100);

            kolor1=new JButton("zielony");
            kolor1.setBounds(1500,100,130,20);

            kolor2=new JButton("cyan");
            kolor2.setBounds(1500,125,130,20);

            kolor3=new JButton("czarny");
            kolor3.setBounds(1500,150,130,20);

            kolor4=new JButton("czerwony");
            kolor4.setBounds(1500,175,130,20);

            kolor5=new JButton("szary");
            kolor5.setBounds(1500,200,130,20);

            kolor6=new JButton("pomarańczowy");
            kolor6.setBounds(1500,225,130,20);

            kolor7=new JButton("różowy");
            kolor7.setBounds(1500,250,130,20);

            kolor8=new JButton("biały");
            kolor8.setBounds(1500,275,130,20);

            kolor9=new JButton("żółty");
            kolor9.setBounds(1500,300,130,20);

            kolor10=new JButton("niebieski");
            kolor10.setBounds(1500,325,130,20);
            //---------------------


            przycisk.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent evt){
                    tekst.setText(" ");
                    k=k+u1+u2+u3;
                    tekst2.setText("punkty "+k+"\n"+"\n"+"ulepszenie1 na poziomie "+poz1+"\n"+"ulepszenie2 na poziomie "+poz2+"\n"+"ulepszenie3 na poziomie "+poz3+"\n"+"ulepszenie4 na poziomie "+poz4+"\n"+"ulepszenie5 na poziomie "+poz5+"\n"+"ulepszenie6 na poziomie "+poz6+"\n"+"ulepszenie7 na poziomie "+poz7+"\n"+"ulepszenie8 na poziomie "+poz8+"\n"+"ulepszenie9 na poziomie "+poz9+"\n"+"ulepszenie10 na poziomie "+poz10);
                    ul1.setText("> "+"koszt"+c1);
                    ul2.setText("> "+"koszt"+c2);
                    ul3.setText("> "+"koszt"+c3);
                    ul4.setText("> "+"koszt"+c4);
                    ul5.setText("> "+"koszt"+c5);
                    ul6.setText("> "+"koszt"+c6);
                    ul7.setText("> "+"koszt"+c7);
                    ul8.setText("> "+"koszt"+c8);
                    ul9.setText("> "+"koszt"+c9);
                    ul10.setText("> "+"koszt"+c10);
                    poziom.setText("poziom wynosi "+kol);
                    opis2.setText(" ");
                    koszt1.setText(" ");
                    ok++;
                    achievement2.setText("liczba kliknięć ogólnie"+ok);
                    listanagrud.setText("lista nagród: "+"\n"+"za 10 kliknięć"+"\n"+"za 50 kliknięć"+"\n"+"za 100 kliknięć"+"\n"+"za 500 kliknięć"+"\n"+"za 1000 kliknięć"+"\n"+"za 1500 kliknięć"+"\n"+"za 2000 kliknięć"+"\n"+"za 2500 kliknięć"+"\n"+"za 3000 kliknięć"+"\n"+"za 3500 kliknięć");


                    int g=e.nextInt(100);
                    if(los2<=g) {
                        Random r = new Random();
                        x=r.nextInt(los);
                        k=k+x;
                        tekst.setText("dodano "+x+" bonusu");
                    }
                    if(ok>=10){
                        if(a==0){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==0);
                        }


                        nagroda1.setText(
                                " 　／l、\n" +
                                        "（ﾟ､ ｡ ７　\n" +
                                        "　l、 ~ヽ　 .　~ Meow'\n" +
                                        "　じしl_, )ノ");
                    }
                    if(ok>=50){
                        if(a==1){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==1);
                        }


                        nagroda2.setBackground(Color.yellow);
                        nagroda2.setText(
                                " ／ﾌﾌ 　　　　　 　　 　ム｀ヽ\n" +
                                        "/ ノ)　　 ∧　　∧　　　　）　ヽ\n" +
                                        "/ ｜　　(´・ω ・`）ノ⌒（ゝ._,ノ\n" +
                                        "/　ﾉ⌒＿⌒ゝーく　 ＼　　／\n" +
                                        "丶＿ ノ 　　 ノ､　　|　/\n" +
                                        "　　 `ヽ `ー-‘人`ーﾉ /\n" +
                                        "　　　 丶 ￣ _人’彡ﾉ\n" +
                                        "　　　／｀ヽ _/\\__'\n" +
                                        "　　");
                    }
                    if(ok>=100){
                        if(a==2){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==2);
                        }

                        nagroda3.setBackground(Color.pink);
                        nagroda3.setText(
                                " ⣿⣿⣿⠟⠛⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢋⣩⣉⢻\n" +
                                        "⣿⣿⣿⠀⣿⣶⣕⣈⠹⠿⠿⠿⠿⠟⠛⣛⢋⣰⠣⣿⣿⠀⣿\n" +
                                        "⣿⣿⣿⡀⣿⣿⣿⣧⢻⣿⣶⣷⣿⣿⣿⣿⣿⣿⠿⠶⡝⠀⣿\n" +
                                        "⣿⣿⣿⣷⠘⣿⣿⣿⢏⣿⣿⣋⣀⣈⣻⣿⣿⣷⣤⣤⣿⡐⢿\n" +
                                        "⣿⣿⣿⣿⣆⢩⣝⣫⣾⣿⣿⣿⣿⡟⠿⠿⠦⠀⠸⠿⣻⣿⡄⢻\n" +
                                        "⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣾⣿⣿⣿⣿⠇⣼\n" +
                                        "⣿⣿⣿⣿⣿⣿⡄⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣰\n" +
                                        "⣿⣿⣿⣿⣿⣿⠇⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⣿\n" +
                                        "⣿⣿⣿⣿⣿⠏⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿\n" +
                                        "⣿⣿⣿⣿⠟⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿\n" +
                                        "⣿⣿⣿⠋⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⣿\n" +
                                        "⣿⣿⠋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸\n" +
                                        "⣿⠏⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸");
                    }

                    if(ok>=500){
                        if(a==3){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==3);
                        }

                        nagroda4.setBackground(Color.green);
                        nagroda4.setText("⣿⣿⣿⣿⣿⣿⣿⡿⠛⠉⠉⠉⠉⠛⠻⣿⣿⠿⠛⠛⠙⠛⠻⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⢀⣀⣀⡀⠀⠈⢄⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⠏⠀⠀⠀⠔⠉⠁⠀⠀⠈⠉⠓⢼⡤⠔⠒⠀⠐⠒⠢⠌⠿⢿⣿⣿⣿\n" +
                                "⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⢀⠤⣒⠶⠤⠭⠭⢝⡢⣄⢤⣄⣒⡶⠶⣶⣢⡝⢿⣿\n" +
                                "⡿⠋⠁⠀⠀⠀⠀⣀⠲⠮⢕⣽⠖⢩⠉⠙⣷⣶⣮⡍⢉⣴⠆⣭⢉⠑⣶⣮⣅⢻\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠉⠒⠒⠻⣿⣄⠤⠘⢃⣿⣿⡿⠫⣿⣿⣄⠤⠘⢃⣿⣿⠿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⠤⠭⣥⣀⣉⡩⡥⠴⠃⠀⠈⠉⠁⠈⠉⠁⣴⣾⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠔⠊⠀⠀⠀⠓⠲⡤⠤⠖⠐⢿⣿⣿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⣠⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⢸⣿⡻⢷⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣘⣿⣿\n" +
                                "⠀⠀⠀⠀⠀⠠⡀⠀⠙⢿⣷⣽⣽⣛⣟⣻⠷⠶⢶⣦⣤⣤⣤⣤⣶⠾⠟⣯⣿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠉⠂⠀⠀⠀⠈⠉⠙⠛⠻⠿⠿⠿⠿⠶⠶⠶⠶⠾⣿⣟⣿⣿⣿\n" +
                                "⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣶⣤⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣟⢿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                    }
                    if(ok>=1000){
                        if(a==4){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==4);
                        }

                        nagroda5.setBackground(Color.green);
                        nagroda5.setText("⠄⠄⠄⠄⠄⠄⠄⣠⣴⣶⣿⣿⡿⠶⠄⠄⠄⠄⠐⠒⠒⠲⠶⢄⠄⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠄⣠⣾⡿⠟⠋⠁⠄⢀⣀⡀⠤⣦⢰⣤⣶⢶⣤⣤⣈⣆⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⢰⠟⠁⠄⢀⣤⣶⣿⡿⠿⣿⣿⣊⡘⠲⣶⣷⣶⠶⠶⠶⠦⠤⡀⠄⠄\n" +
                                "⠄⠔⠊⠁⠁⠄⠄⢾⡿⣟⡯⣖⠯⠽⠿⠛⠛⠭⠽⠊⣲⣬⠽⠟⠛⠛⠭⢵⣂⠄\n" +
                                "⡎⠄⠄⠄⠄⠄⠄⠄⢙⡷⠋⣴⡆⠄⠐⠂⢸⣿⣿⡶⢱⣶⡇⠄⠐⠂⢹⣷⣶⠆\n" +
                                "⡇⠄⠄⠄⠄⣀⣀⡀⠄⣿⡓⠮⣅⣀⣀⣐⣈⣭⠤⢖⣮⣭⣥⣀⣤⣤⣭⡵⠂⠄\n" +
                                "⣤⡀⢠⣾⣿⣿⣿⣿⣷⢻⣿⣿⣶⣶⡶⢖⣢⣴⣿⣿⣟⣛⠿⠿⠟⣛⠉⠄⠄⠄\n" +
                                "⣿⡗⣼⣿⣿⣿⣿⡿⢋⡘⠿⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠄⠄\n" +
                                "⣿⠱⢿⣿⣿⠿⢛⠰⣞⡛⠷⣬⣙⡛⠻⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⠿⠛⣓⡀⠄\n" +
                                "⢡⣾⣷⢠⣶⣿⣿⣷⣌⡛⠷⣦⣍⣛⠻⠿⢿⣶⣶⣶⣦⣤⣴⣶⡶⠾⠿⠟⠁⠄\n" +
                                "⣿⡟⣡⣿⣿⣿⣿⣿⣿⣿⣷⣦⣭⣙⡛⠓⠒⠶⠶⠶⠶⠶⠶⠶⠶⠿⠟⠄⠄⠄\n" +
                                "⠿⡐⢬⣛⡻⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡶⠟⠃⠄⠄⠄⠄⠄⠄\n" +
                                "⣾⣿⣷⣶⣭⣝⣒⣒⠶⠬⠭⠭⠭⠭⠭⠭⠭⣐⣒⣤⣄⡀⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠄⠄⠄⠄⠄⠄⠄");
                    }
                    if(ok>=1500){
                        if(a==5){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==5);
                        }

                        nagroda6.setBackground(Color.cyan);
                        nagroda6.setText("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣴⣿⣿⠿⣫⣥⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⠄⠄⠄⠾⢿⢟⣵⣾⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠄⠄⠄⠄⣰⡿⣀⣤⣴⣾⣿⡇⠙⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠄⠄⣠⣾⣿⣿⣿⣿⣿⣿⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠄⣴⣿⣿⠿⠛⠉⢩⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⣀⣀⡀⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠈⠛⠉⠄⠄⠄⠄⢸⣿⣿⡇⠄⠄⠄⠄⠄⠄⢀⣼⡿⣫⣾⠆⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⢀⣶⣶⣶⣶⣶⣶⣿⣿⣿⠇⠄⠄⠄⣠⣎⣠⣴⣶⠎⠛⠁⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⣾⣿⣿⣿⣿⠿⠿⠟⠛⠋⠄⠄⢀⣼⣿⠿⠛⣿⡟⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠛⠉⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠘⠉⠄⠄⢸⣿⡇⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⣿⣿⣿⡿⠿⠃⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠋⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄");
                    }
                    if(ok>=2000){
                        if(a==6){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==6);
                        }

                        nagroda7.setBackground(Color.black);
                        nagroda7.setDisabledTextColor(Color.white);
                        nagroda7.setText("⣿⣿⣿⣿⣿⣿⣿⡿⡛⠟⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⣿⠿⠨⡀⠄⠄⡘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⠿⢁⠼⠊⣱⡃⠄⠈⠹⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⡿⠛⡧⠁⡴⣦⣔⣶⣄⢠⠄⠄⠹⣿⣿⣿⣿⣿⣿⣿⣤⠭⠏⠙⢿⣿⣿⣿⣿⣿\n" +
                                "⣿⡧⠠⠠⢠⣾⣾⣟⠝⠉⠉⠻⡒⡂⠄⠙⠻⣿⣿⣿⣿⣿⡪⠘⠄⠉⡄⢹⣿⣿⣿⣿\n" +
                                "⣿⠃⠁⢐⣷⠉⠿⠐⠑⠠⠠⠄⣈⣿⣄⣱⣠⢻⣿⣿⣿⣿⣯⠷⠈⠉⢀⣾⣿⣿⣿⣿\n" +
                                "⣿⣴⠤⣬⣭⣴⠂⠇⡔⠚⠍⠄⠄⠁⠘⢿⣷⢈⣿⣿⣿⣿⡧⠂⣠⠄⠸⡜⡿⣿⣿⣿\n" +
                                "⣿⣇⠄⡙⣿⣷⣭⣷⠃⣠⠄⠄⡄⠄⠄⠄⢻⣿⣿⣿⣿⣿⣧⣁⣿⡄⠼⡿⣦⣬⣰⣿\n" +
                                "⣿⣷⣥⣴⣿⣿⣿⣿⠷⠲⠄⢠⠄⡆⠄⠄⠄⡨⢿⣿⣿⣿⣿⣿⣎⠐⠄⠈⣙⣩⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⣿⢟⠕⠁⠈⢠⢃⢸⣿⣿⣶⡘⠑⠄⠸⣿⣿⣿⣿⣿⣦⡀⡉⢿⣧⣿⣿\n" +
                                "⣿⣿⣿⣿⡿⠋⠄⠄⢀⠄⠐⢩⣿⣿⣿⣿⣦⡀⠄⠄⠉⠿⣿⣿⣿⣿⣿⣷⣨⣿⣿⣿\n" +
                                "⣿⣿⣿⡟⠄⠄⠄⠄⠄⠋⢀⣼⣿⣿⣿⣿⣿⣿⣿⣶⣦⣀⢟⣻⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⡆⠆⠄⠠⡀⡀⠄⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⡿⡅⠄⠄⢀⡰⠂⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                    }
                    if(ok>=2500){
                        if(a==7){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==7);
                        }

                        nagroda8.setBackground(Color.green);
                        nagroda8.setText("⠄⢀⣀⣤⣴⣶⣶⣤⣄⡀⠄⠄⣀⣤⣤⣤⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⣴⣏⣹⣿⠿⠿⠿⠿⢿⣿⣄⢿⣿⣿⣿⣿⣿⣋⣷⡄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⣿⢟⣩⣶⣾⣿⣿⣿⣶⣮⣭⡂⢛⣭⣭⣭⣭⣭⣍⣛⣂⡀⠄⠄⠄⠄⠄⠄⠄⠄\n" +
                                "⣿⣿⣿⣿⡿⢟⣫⣭⣷⣶⣾⣭⣼⡻⢛⣛⣭⣭⣶⣶⣬⣭⣅⡀⠄⠄⠄⠄⠄⠄\n" +
                                "⣿⡿⢏⣵⣾⣿⣿⣿⡿⢉⡉⠙⢿⣇⢻⣿⣿⣿⣿⡟⠉⠉⢻⡷⠄⠄⠄⠄⠄⠄\n" +
                                "⣿⣷⣾⣍⣛⢿⣿⣿⣿⣤⣁⣤⣿⢏⠸⣿⣿⣿⣿⣷⣬⣥⣾⠁⣿⣿⣷⠄⠄⠄\n" +
                                "⣿⣿⣿⣿⣭⣕⣒⠿⠭⠭⠭⡷⢖⣫⣶⣶⣬⣭⣭⣭⣭⣥⡶⢣⣿⣿⣿⠄⠄⠄\n" +
                                "⣿⣿⣿⣿⣿⣿⣿⡿⣟⣛⣭⣾⣿⣿⣿⣝⡛⣿⢟⣛⣛⣁⣀⣸⣿⣿⣿⣀⣀⣀\n" +
                                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⡿⢛⣛⣛⣛⣙⣛⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣬⣭⣭⠽⣛⢻⣿⣿⣿⠛⠛⠛\n" +
                                "⣿⢰⣿⣿⣿⣿⣟⣛⣛⣶⠶⠶⠶⣦⣭⣭⣭⣭⣶⡶⠶⣾⠟⢸⣿⣿⣿⠄⠄⠄\n" +
                                "⡻⢮⣭⣭⣭⣭⣉⣛⣛⡻⠿⠿⠷⠶⠶⠶⠶⣶⣶⣾⣿⠟⢣⣬⣛⡻⢱⣇⠄⠄\n" +
                                "⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠶⠒⠄⠄⠄⢸⣿⢟⣫⡥⡆⠄⠄\n" +
                                "⢭⣭⣝⣛⣛⣛⣛⣛⣛⣛⣿⣿⡿⢛⣋⡉⠁⠄⠄⠄⠄⠄⢸⣿⢸⣿⣧⡅⠄⠄\n" +
                                "⣶⣶⣶⣭⣭⣭⣭⣭⣭⣵⣶⣶⣶⣿⣿⣿⣦⡀⠄⠄⠄⠄⠈⠡⣿⣿⡯⠁⠄⠄\n");
                    }
                    if(ok>=3000){
                        if(a==8){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==8);
                        }

                        nagroda9.setBackground(Color.green);
                        nagroda9.setText("⣿⣿⣿⣿⣿⡿⠛⠋⠁⠀⠀⠀⠀⠙⠛⠿⠟⠋⠉⠁⠀⠈⠙⠻⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⡿⠋⠀⠸⠄⢀⣀⠠⠤⠤⣀⡀⠐⡄⠀⠀⠀⠀⠀⠾⠂⠈⠻⣿⣿⣿⣿\n" +
                                "⣿⣿⡟⠀⠀⠀⠠⠋⠁⠀⠀⠀⠀⠀⠉⠙⠻⠒⠚⠛⠛⠛⠛⠒⠒⠦⠘⢿⣿⣿\n" +
                                "⣿⠟⠀⠀⡆⠀⠀⠀⠀⢀⣤⣴⣶⣶⣶⣶⣶⣧⣄⢀⣠⣤⣤⣶⣶⣶⣤⣤⣙⢿\n" +
                                "⠁⢸⠀⠸⠅⠀⠀⣴⣾⣿⣿⣿⣿⣿⡏⡉⠙⣿⣿⣼⣿⣿⣿⣿⣿⢋⡉⢻⣿⡆\n" +
                                "⣀⠀⠀⠀⠀⠀⠀⠀⢉⠛⠿⢿⣿⣿⣷⣧⣶⡿⠟⠸⠿⠿⣿⡿⠿⠶⠬⠾⠿⢃\n" +
                                "⠓⠀⠀⠀⠀⠀⠀⠀⠈⠙⠒⠤⠤⠬⠭⠁⣤⠤⠖⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠠⠔⠊⠁⠀⠀⠀⠑⠢⡄⠒⠒⠂⠰⣿⣿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡈⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⣼⣿⣧⣭⣭⣍⣛⣛⣛⡶⠶⠶⢦⣤⣤⣤⣤⣤⣴⣶⠿⠛⣡⣿\n" +
                                "⠀⠀⠀⠀⠰⢄⠈⠉⠉⠉⠉⠉⠉⠙⠛⠛⠿⠿⠿⠷⠶⠶⣶⣶⣶⡶⢟⣸⣿⣿\n" +
                                "⣄⣀⡀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿\n" +
                                "⠀⠀⠈⠉⠓⠒⠢⠤⠤⠤⠤⣤⣤⣤⣤⠤⠄⠀⠀⠀⢴⣶⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢻⣿⣿⣿⣿⣿⣿⣿");
                    }
                    if(ok>=3500){
                        if(a==9){
                            do{
                                a++;
                                tekst.setText("odblokowano obrazek");
                            }while(a==9);
                        }

                        nagroda10.setBackground(Color.green);
                        nagroda10.setText("⣿⣿⣿⣿⣿⣿⣿⣿⡉⠉⠉⠛⠛⠻⠿⣿⡿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠋⠉⠉⠉⠙⠒⠤⣄⠛⠉⢙⡿⠿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠐⠋⢉⣩⣭⣉⡶⡏⣠⣴⡖⠦⣝⢿⣿\n" +
                                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠉⠀⠀⠀⠐⢾⣿⣿⠋⠙⢿⣆⣿⣿⡇⠠⠌⣧⣿\n" +
                                "⣿⣿⣿⣿⣿⣿⠟⠛⠉⠀⠀⠀⠀⠀⠀⢠⢸⣿⡏⠀⠇⣼⡿⠸⠿⠿⠶⠒⣋⣿\n" +
                                "⣿⡿⠋⠹⡏⠀⠀⢀⣊⣉⠀⠀⠀⢰⣀⠘⢄⡙⠛⢖⣛⡋⠐⠳⢬⡭⠽⠛⠉⣿\n" +
                                "⣿⠁⠀⢰⡇⠀⠀⣿⢭⡙⢷⣄⡀⠀⠈⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠁⢀⡀⢠⣿\n" +
                                "⣿⠀⠀⣾⠀⠀⠀⢻⣦⡛⣓⡩⠽⣛⡶⠦⠤⠤⠤⠤⠤⢤⣄⣐⣖⡉⡅⣾⣿⣿\n" +
                                "⣿⠀⠀⢹⡄⠀⠀⠀⠉⠻⢶⣭⣗⣂⠍⠛⠛⠛⢛⣫⣤⣿⣿⠿⢛⣫⣾⣿⣿⣿\n" +
                                "⣿⣄⠀⠀⡉⠂⠀⠀⠀⠀⠀⠀⠉⠉⠛⠛⠉⠉⠉⠁⢰⣶⣶⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣷⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⣿⣿⣿⣿⡇⠀⠀⠀⢶⣶⣤⣤⣤⣤⣶⣶⡄⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿");

                    }


                }
            });
            kolor1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.green);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.cyan);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor3.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.black);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor4.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.red);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor5.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.lightGray);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor6.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.orange);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor7.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.pink);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor8.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.white);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor9.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.yellow);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor10.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.blue);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            kolor1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt){
                    if(k>=500){
                        k=k-500;
                        tekst2.setBackground(Color.green);
                    }
                    else{
                        koszt1.setText("nie masz tyle");

                    }
                }
            });
            ulepszenie1.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){
                    opis2.setText("+1 do klikania");
                }
                public void mouseClicked(MouseEvent evt){

                    if(k>=c1){
                        k=k-c1;
                        u1++;
                        c1=c1+10;
                        poz1++;
                        tekst.setText("ulepszono");
                        if(kol==0){
                            do {
                                kol++;
                                tekst2.setBackground(Color.yellow);
                            }while(kol==0);
                        }

                    }
                    else{
                        tekst.setText("nie masz tyle");
                    }

                }
            });

            ulepszenie2.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){
                    opis2.setText("+10 do klikania");
                }
                public void mouseClicked(MouseEvent evt){

                    if(k>=c2){
                        k=k-c2;
                        u2=u2+10;
                        c2=c2+c2;
                        poz2++;
                        tekst.setText("ulepszono");
                        if(kol==1){
                            do {
                                kol++;
                                tekst2.setBackground(Color.orange);

                            }while(kol==1);
                        }

                    }
                    else{
                        tekst.setText("nie masz tyle");
                    }

                }
            });

            ulepszenie3.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){
                    opis2.setText("zwiększ zakres dodatkowych punktów");
                }
                public void mouseClicked(MouseEvent evt) {
                    if(k>=c3){
                        k=k-c3;
                        c3=c3+c3;
                        los++;
                        poz3++;

                        if(los2>=g) {
                            Random r = new Random();
                            x=r.nextInt(los);
                            k=k+x;
                            tekst.setText("dodano "+x+" bonusu");
                        }
                        if(kol==2){
                            do {
                                kol++;
                                tekst2.setBackground(Color.green);
                            }while(kol==2);
                        }


                    }
                    else{
                        tekst.setText("nie masz tyle");
                    }

                }
            });


            ulepszenie4.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){opis2.setText("zwiększ szanse na bonus");}
                public void mouseClicked(MouseEvent evt){
                    if (k>=c4){
                        k=k-c4;
                        c4=c4+c4;
                        los2--;
                        poz4++;
                        if(kol==3){
                            do {
                                kol++;
                                tekst2.setBackground(Color.blue);
                            }while(kol==3);
                        }

                    }
                    else{
                        tekst.setText("nie masz tyle");
                    }
                }
            });


            ulepszenie5.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){
                    opis2.setText("+100 do klikania");
                }
                public void mouseClicked(MouseEvent evt){

                    if(k>=c5){
                        k=k-c5;
                        u3=u3+100;
                        c5=c5*2;
                        poz5++;
                        tekst.setText("ulepszono");
                        if(kol==4){
                            do {
                                kol++;
                                tekst2.setBackground(Color.DARK_GRAY);
                            }while(kol==4);
                        }

                    }
                    else{
                        tekst.setText("nie masz tyle");
                    }

                }
            });

            ulepszenie6.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){
                    opis2.setText("skróć czas na punkty");
                }
                public void mouseClicked(MouseEvent evt){
                    if(k>=c6){
                        k=k-c6;
                        c6=c6*3;
                        cz=cz+cz;
                        poz6++;
                        java.util.Timer actualizeProgress = new java.util.Timer();
                        actualizeProgress.scheduleAtFixedRate(new TimerTask() {
                            public void run() {
                                tekst2.setText("punkty "+k+"\n"+"\n"+"ulepszenie1 na poziomie "+poz1+"\n"+"ulepszenie2 na poziomie "+poz2+"\n"+"ulepszenie3 na poziomie "+poz3+"\n"+"ulepszenie4 na poziomie "+poz4+"\n"+"ulepszenie5 na poziomie "+poz5+"\n"+"ulepszenie6 na poziomie "+poz6+"\n"+"ulepszenie7 na poziomie "+poz7+"\n"+"ulepszenie8 na poziomie "+poz8+"\n"+"ulepszenie9 na poziomie "+poz9+"\n"+"ulepszenie10 na poziomie "+poz10);
                                k=k+u4;
                            }
                        }, 0, 2000-cz);
                        tekst.setText("ulepszono");
                        if(kol==5){
                            do {
                                kol++;
                                tekst2.setBackground(Color.black);
                            }while(kol==5);
                        }

                    }
                    else{
                        tekst.setText("nie masz tyle");
                    }

                }

            });


            ulepszenie7.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){
                    opis2.setText("zwiększ dodawane punkty o +1");
                }
                public void mouseClicked(MouseEvent evt){
                    if(k>=c7){
                        k=k-c7;
                        u4=u4+1;
                        c7=c7*1000;
                        poz7++;
                        if(kol==6){
                            do {
                                kol++;
                                tekst2.setBackground(Color.PINK);
                            }while(kol==6);
                        }


                    }
                    else{
                        tekst.setText("nie masz tyle");
                    }
                }
            });
            ulepszenie8.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){
                    opis2.setText("zwiększ dodawane punkty o +10");
                }
                public void mouseClicked(MouseEvent evt){
                    if(k>=c8){
                        k=k-c8;
                        u4=u4+10;
                        c8=c8+c8;
                        poz8++;
                        if(kol==7){
                            do {
                                kol++;
                                tekst2.setBackground(Color.red);
                            }while(kol==7);
                        }


                    }
                    else{
                        tekst.setText("nie masz tyle");
                    }
                }
            });
            ulepszenie9.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){
                    opis2.setText("zwiększ dodawane punkty o +100");
                }
                public void mouseClicked(MouseEvent evt){
                    if(k>=c9){
                        k=k-c9;
                        u4=u4+100;
                        c9=c9*2;
                        poz9++;
                        if(kol==8){
                            do {
                                kol++;
                                tekst2.setBackground(Color.lightGray);
                            }while(kol==8);
                        }


                    }
                    else{
                        tekst.setText("nie masz tyle");
                    }
                }
            });
            ulepszenie10.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent evt){
                    opis2.setText("wygrywasz");
                }
                public void mouseClicked(MouseEvent evt){

                    if(k>=c10){
                        k=k-c10;
                        poz10++;
                        tekst.setText("ulepszono");
                        JOptionPane.showMessageDialog(null, "BRAWO przekroczyłeś maksymalną liczbę int"+"\n"+"dzięki za zniszczenie mi gry"+"\n"+"WYGRAŁEŚ");
                        if(kol==9){
                            do {
                                kol++;
                                tekst2.setBackground(Color.cyan);
                            }while(kol==9);
                        }

                    }
                    else{
                        tekst.setText("chciało by się nie masz tyle");
                    }

                }
            });








            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(tekst);
            add(tekst2);
            add(przycisk);
            add(tytuł);
            add(achievement1);
            add(achievement2);
            add(listanagrud);
            add(nagroda1);
            add(nagroda2);
            add(nagroda3);
            add(nagroda4);
            add(nagroda5);
            add(nagroda6);
            add(nagroda7);
            add(nagroda8);
            add(nagroda9);
            add(nagroda10);
            add(ulepszenie1);
            add(ulepszenie2);
            add(ulepszenie3);
            add(ulepszenie4);
            add(ulepszenie5);
            add(ulepszenie6);
            add(ulepszenie7);
            add(ulepszenie8);
            add(ulepszenie9);
            add(ulepszenie10);
            add(ul1);
            add(ul2);
            add(ul3);
            add(ul4);
            add(ul5);
            add(ul6);
            add(ul7);
            add(ul8);
            add(ul9);
            add(ul10);
            add(poziom);
            add(opis1);
            add(opis2);
            add(sklep);
            add(koszt);
            add(koszt1);
            add(kolor1);
            add(kolor2);
            add(kolor3);
            add(kolor4);
            add(kolor5);
            add(kolor6);
            add(kolor7);
            add(kolor8);
            add(kolor9);
            add(kolor10);
            add(autor);

            setSize(2137, 2137);
            setLayout(null);
            setVisible(true);


        }











    public static void main(String[] args) {
        new clicker();
    }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
