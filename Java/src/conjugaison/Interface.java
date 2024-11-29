package conjugaison;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Interface {
    
    public static void main(String[]args){ 
        String[][] conj_sub = {{"aie","aies","ait","ayons","ayez","aient"},
            {"eusse","eusses","eût","eussions","eussiez","eussent"}};
        
        String[][] sujet = {
            {"je","tu","il/elle/on","nous","vous","ils/elles"},
            {"que je","que tu","qu'il","que nous","que vous","qu'ils"},
            {"je m'","tu t'","il/elle/on s'","nous nous","vous vous","ils/elles s'"},
            {"que je m'","que tu t'","il/elle/on s'","nous nous","vous vous","ils/elles"}};  
        
        String [][]etre = {
                {"suis","es","est","sommes","êtes","sont"},
                {"étais","étais","était","étions","étiez","étaient"},
                {"fus","fus","fut","fûmes","fûtes","furent"},
                {"serai","seras","sera","serons","serez","seront"},
                {"ai été","as été","a été","avons été","avez été","ont été"},
                {"avais été","avais été","avait été","avions été","aviez été","avaient été"},
                {"eus été","eus été","eut été","eûmes été","eûtes été","eurent été"},
                {"aurai été","auras été","aura été","aurons été","aurez été","auront été"},
                {"sois","sois","soit","soyons","soyez","soient"},
                {"fusse","fusses","fût","fussions","fussiez","fussent"},
                {"aie été","aies été","ait été","ayons été","ayez été","aient été"},
                {"eusse été","eusses été","eût été","eussions été","eussiez été","eussent été"}};
        
        String [][] avoir = {
                    {"ai","as","a","avons","avez","ont"},//
                    {"avais","avais","avait","avions","aviez","avaient"},//Ces 4 lignes seront pour les 4 autres temps de l'indicatif
                    {"eus","eus","eut","eûmes","eûtes","eurent"},//
                    {"aurai","auras","aura","aurons","aurez","auront"},//
                    {"ai eu","as eu","a eu","avons eu","avez eu","ont eu"},
                    {"avais eu","avais eu","avait eu","avions eu","aviez eu","avaient eu"},
                    {"eus eu","eus eu","eut eu","eûmes eu","eûtes eu","eurent eu"},
                    {"aurai eu","auras eu","aura eu","aurons eu","aurez eu","auront eu"},
                    {"aie","aies","ait","ayons","ayez","aient"},
                    {"eusse","eusses","eût","eussions","eussiez","eussent"},  
                    {"aie eu","aies eu","ait eu","ayons eu","ayez eu","aient eu"},
                    {"eusse eu","eusses eu","eût eu","eussions eu","eussiez eu","eussent eu"}};
        
        String[][] gr1 = {
            {"e","es","e","ons","ez","ent"},
            {"ais","ais","ait","ions","iez","aient"},
            {"ai","as","a","âmes","âtes","èrent"},
            {"erai","eras","era","erons","erez","eront"},
            {"e","es","e","ions","iez","ent"},
            {"asse","asses","ât","assions","assiez","assent"}};
        
        String[][] gr1_oyer = {
            {"ye","yes","ye","ions","iez","yent"},
            {"yais","yais","yait","yions","yiez","yaient"},
            {"yai","yas","ya","yâmes","yâtes","yèrent"},
            {"ierai","ieras","iera","ierons","ierez","ieront"},
            {"ai","as","a","avons","avez","ont"},
            {"avais","avais","avait","avions","aviez","avaient"},
            {"eus","eus","eût","eûmes","eûtes","eurent"},
            {"aurai","auras","aura","aurons","aurez","auront"},
            {"isse","isses","isse","issions","issiez","issent"},
            {"aie","aies","ait","ayons","ayez","aient"},
            {"isse","isses","ît","issions","issiez","issent"},
            {"eusse","eusses","eût","eussions","eussiez","eussent"}};
       
        String[][] gr2 = {
            {"is","is","it","issons","issez","issent"},
            {"issais","issais","issait","issions","issiez","issaient"},
            {"is","is","it","îmes","îtes","irent"},
            {"irai","iras","ira","irons","irez","iront"},
            {"ai","as","a","avons","avez","ont"},//Tu ne prends plus la terminaison puisqu'ils ont le participe passé
            {"avais","avais","avait","avions","aviez","avaient"},//Idem
            {"eus","eus","eût","eûmes","eûtes","eurent"},//idem 
            {"aurai","auras","aura","aurons","aurez","auront"},//idem
            {"isse","isses","isse","issions","issiez","issent"},//Là on reprend la terminaison
            {"aie","aies","ait","ayons","ayez","aient"},//Là on l'utilise pour le participe passé
            {"isse","isses","ît","issions","issiez","issent"},//Terminaison
            {"eusse","eusses","eût","eussions","eussiez","eussent"}};//A utiliser avec le participe passé
        
        JFrame affiche = new JFrame("Conjugaison");
        affiche.setBounds(480,210,640,560);  
        //Mets l'emplacement de l'interface en tel x, tel y puis donne la dimension (x et y).
        affiche.setVisible(true);
        //Le programme a un ordre à respecter. Je crée d'abord l'interface puis je l'affiche et seulement après j'ajoute ce que je veux et je fais ce que je veux.
        affiche.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //C'est pour dire que lorsque je ferme la fenêtre, le programme s'arrête.
        affiche.setLayout(null); // Utilisation d'un layout null pour pouvoir définir les positions manuellement
        
        JTextField enter = new javax.swing.JTextField("Verbe");
        affiche.add(enter);
        enter.setBounds(70,5,90,30);
        
        JLabel type = new javax.swing.JLabel("Verbe");
        affiche.add(type);
        type.setBounds(365,-6,90,50); 
        
        JLabel indicatif = new javax.swing.JLabel("Indicatif");
        affiche.add(indicatif);
        indicatif.setBounds(290,27, 45,45);        
        
        JLabel présent = new javax.swing.JLabel("Présent");
        affiche.add(présent);
        présent.setBounds(60,55, 45,45);
        
        JLabel imparfait = new javax.swing.JLabel("Imparfait");
        affiche.add(imparfait);
        imparfait.setBounds(205,55,65,45);
        
        JLabel passé_simple = new javax.swing.JLabel("Passé simple");
        affiche.add(passé_simple);
        passé_simple.setBounds(340,55,80,45);
        
        JLabel futur_simple = new javax.swing.JLabel("Futur simple");
        affiche.add(futur_simple);
        futur_simple.setBounds(490,55,80,40);
        
        JLabel passé_composé = new javax.swing.JLabel("Passé composé");
        affiche.add(passé_composé);
        passé_composé.setBounds(40,190,100,45);
        
        JLabel plus_que_parfait = new javax.swing.JLabel("Plus que parfait");
        affiche.add(plus_que_parfait);
        plus_que_parfait.setBounds(190,190,100,45);
        
        JLabel passé_antérieur = new javax.swing.JLabel("Passé antérieur");
        affiche.add(passé_antérieur);
        passé_antérieur.setBounds(335,190,100,45);
        
        JLabel futur_antérieur = new javax.swing.JLabel("Futur antérieur");
        affiche.add(futur_antérieur);
        futur_antérieur.setBounds(480,190,100,45);
        
        JLabel subjonctif = new javax.swing.JLabel("Subjonctif");
        affiche.add(subjonctif);
        subjonctif.setBounds(275,330,100,45);
        
        
        JLabel Sprésent = new javax.swing.JLabel("Présent");
        affiche.add(Sprésent);
        Sprésent.setBounds(60,365,100,45);
        
        JLabel subj_imparfait = new javax.swing.JLabel("Imparfait");
        affiche.add(subj_imparfait);
        subj_imparfait.setBounds(205,365,100,45);
        
        JLabel passé = new javax.swing.JLabel("Passé");
        affiche.add(passé);
        passé.setBounds(355,365,100,45);
        
        JLabel plq = new javax.swing.JLabel("Plus que parfait");
        affiche.add(plq);
        plq.setBounds(475,365,100,45);
        
        JButton action = new javax.swing.JButton("Conjuguer");
        affiche.add(action);
        action.setBounds(200,(int) 4.6,100,30);   
        
        Label gr = new java.awt.Label("Groupe :");
        affiche.add(gr);
        gr.setBounds(480,0,150,40);
        
        JTextArea Ipresent = new javax.swing.JTextArea();
        affiche.add(Ipresent);
        Ipresent.setEditable(false);
        Ipresent.setLineWrap(false);
        Ipresent.setWrapStyleWord(false);
        Ipresent.setBounds(20,90,135,100);
        
        JTextArea Iimparfait = new javax.swing.JTextArea();
        affiche.add(Iimparfait);
        Iimparfait.setEditable(false);
        Iimparfait.setLineWrap(false);
        Iimparfait.setWrapStyleWord(false);
        Iimparfait.setBounds(165,90,135,100);
        
        JTextArea psimple = new javax.swing.JTextArea();
        affiche.add(psimple);
        psimple.setEditable(false);
        psimple.setLineWrap(false);
        psimple.setWrapStyleWord(false);
        psimple.setBounds(310,90,135,100);
        
        JTextArea fsimple = new javax.swing.JTextArea();
        affiche.add(fsimple);
        fsimple.setEditable(false);
        fsimple.setLineWrap(false);
        fsimple.setWrapStyleWord(false);
        fsimple.setBounds(455,90,135,100);
        
        JTextArea pcompose = new javax.swing.JTextArea();
        affiche.add(pcompose);
        pcompose.setEditable(false);
        pcompose.setLineWrap(false);
        pcompose.setWrapStyleWord(false);
        pcompose.setBounds(20,230,135,100);
        
        JTextArea Ipqp = new javax.swing.JTextArea();
        affiche.add(Ipqp);
        Ipqp.setEditable(false);
        Ipqp.setLineWrap(false);
        Ipqp.setWrapStyleWord(false);
        Ipqp.setBounds(165,230,135,100);
     
        JTextArea panterieur = new javax.swing.JTextArea();
        affiche.add(panterieur);
        panterieur.setEditable(false);
        panterieur.setLineWrap(false);
        panterieur.setWrapStyleWord(false);
        panterieur.setBounds(310,230,135,100);
        
        JTextArea fanterieur = new javax.swing.JTextArea();
        affiche.add(fanterieur);
        fanterieur.setEditable(false);
        fanterieur.setLineWrap(false);
        fanterieur.setWrapStyleWord(false);
        fanterieur.setBounds(455,230,135,100);
        
        JTextArea Spresent = new javax.swing.JTextArea();
        affiche.add(Spresent);
        Spresent.setEditable(false);
        Spresent.setLineWrap(false);
        Spresent.setWrapStyleWord(false);
        Spresent.setBounds(20,405,135,100);
        
        JTextArea Simparfait = new javax.swing.JTextArea();
        affiche.add(Simparfait);
        Simparfait.setEditable(false);
        Simparfait.setLineWrap(false);
        Simparfait.setWrapStyleWord(false);
        Simparfait.setBounds(165,405,135,100);
        
        JTextArea Spasse = new javax.swing.JTextArea();
        affiche.add(Spasse);
        Spasse.setEditable(false);
        Spasse.setLineWrap(false);
        Spasse.setWrapStyleWord(false);
        Spasse.setBounds(310,405,135,100);
        
        JTextArea Spqp = new javax.swing.JTextArea();
        affiche.add(Spqp);
        Spqp.setEditable(false);
        Spqp.setLineWrap(false);
        Spqp.setWrapStyleWord(false);
        Spqp.setBounds(455,405,135,100);
        
        ArrayList<JTextArea> listeZones= new ArrayList<JTextArea>();
        listeZones.add(Ipresent);
        listeZones.add(Iimparfait);
        listeZones.add(psimple);
        listeZones.add(fsimple);
        listeZones.add(pcompose);
        listeZones.add(Ipqp);
        listeZones.add(panterieur);
        listeZones.add(fanterieur);
        listeZones.add(Spresent);
        listeZones.add(Simparfait);
        listeZones.add(Spasse);
        listeZones.add(Spqp);
        
        action.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                ArrayList<String> ligne = new ArrayList<>();
                String mot = enter.getText();                
                String txt = "";
                gr.setText("Groupe :");
                int taille = mot.length();
                char last = ' ';
                int x= 1;
                for( x=1;x<3;x++)
                    {
                        last = mot.charAt(taille-x);
                    }
                x=1;
                /*ici on va vérifier si le verbe qu'on a inséré fait bien partie de la langue française 
                et non du texte random.
                On va le faire grâce à la lecture des fichiers.*/
                
                
                
    File ref = new File("Tous les verbes.txt"); 
    String line;
    BufferedReader br = null;
    FileReader fr = null;
    ArrayList<String> lecture = new ArrayList<>();
    try
    {
        fr = new FileReader(ref);
        br = new BufferedReader(fr);         
        while( (line = br.readLine()) != null)
        {         
            lecture.add(line);
            x++;
            if(line.equals(mot))
            {
                type.setText(mot);
//Grâce au numéro de ligne, je dis à quel groupe le verbe appartient et je fais sa conjugaison.
                if(x>1 && x<5)
                {
                    gr.setText("Groupe :");
                    gr.setText(gr.getText()+" Auxiliare");
                    switch(mot)
                    {
                        case"Etre": 
                        mot = mot.replaceAll(mot,"");                        
                        String texte = "";
                        int a=0;
                        int y=0;                            
                        for(a=0;a<12;a++)
                        {                                
                            for(y=0;y<6;y++)
                            {                    
                                if(a<8)
                                {   
                                    if(a>3)
                                    {
                                        sujet[0][0]="j'";
                                        texte=texte+sujet[0][y]+" "+etre[a][y]+"\n";
                                    }
                                    texte=texte+sujet[0][y]+" "+etre[a][y]+"\n";
                                }                                    
                                else
                                {
                                    if(x==10)
                                    {
                                        sujet[1][0]="que j'";
                                        texte=texte+sujet[1][y]+" "+etre[a][y]+"\n";
                                    }
                                    texte=texte+sujet[1][y]+" "+etre[a][y]+"\n";                               
                                }
                            }                                        
                            listeZones.get(a).setText(texte);
                            texte="";           
                        }
                        sujet[0][0]="je";
                        sujet[1][0]="que je";  
                        break;
                                            
                        case"Avoir":
                            mot = mot.replaceAll(mot,"");                        
                            String text = "";
                            int xx=0;
                            int yy=0;                     
                            for(xx=0;xx<12;xx++)
                            {                                
                                for(yy=0;yy<6;yy++)
                                {                    
                                    if(xx<8)
                                    {  
                                        sujet[0][0]="j'";
                                        text=text+sujet[0][yy]+" "+avoir[xx][yy]+"\n";
                                    } 
                                    else
                                    {
                                        if(xx==10)
                                        {
                                            sujet[1][0]="que j'";
                                            text=text+sujet[1][yy]+" "+avoir[8][yy]+" eu\n";   
                                        }
                                        if(xx==11)
                                        {
                                            sujet[1][0]="que j'";
                                            text=text+sujet[1][yy]+" "+avoir[9][yy]+" eu\n";    
                                        }
                                        sujet[1][0]="que j'";
                                        text=text+sujet[1][yy]+" "+avoir[xx][yy]+"\n";   
                                    }
                                } 
                                listeZones.get(xx).setText(text);
                                text="";           
                            }
                        sujet[0][0]="je";
                        sujet[1][0]="que je"; 
                        break;
                    }
                }
                
                
                
                
                
//Premier groupe
                else if(x>=5 && x<6837)
                {
                    int a = 0;
                    int b = 0;
                    mot = mot.toLowerCase();
                    gr.setText("Groupe :");
                    gr.setText(gr.getText()+" 1");
                    String pcp = mot.substring(0,taille-1);
                    mot = mot.substring(0,taille-2);
                    a = 0;
                    b=0;
                    for(a=0;a<12;a++)
                    {                                
                        for(b=0;b<6;b++)
                        {   
                            if('a'== mot.charAt(0)|'e'== mot.charAt(0)|'é'== mot.charAt(0)|'i'== mot.charAt(0)|'o'== mot.charAt(0)|'u'== mot.charAt(0))
                            {
                                
                            }  
                            else
                            {
                                if(a<4)
                                {  
                                    txt=txt+sujet[0][b]+" "+mot+gr1[a][b]+"\n";
                                }
                                else if(a>=4 && a<8)
                                {
                                    sujet[0][0]="j'";
                                    txt=txt+sujet[0][b]+" "+gr1[a][b]+" "+pcp+"\n";  
                                }
                                else if (a == 8 | a == 10)
                                {
                                    sujet[1][0]="que je";
                                    txt=txt+sujet[1][b]+" "+mot+gr1[a][b]+"\n"; 
                                }
                                else if (a == 9 | a == 11)
                                {
                                    sujet[1][0]="que j'";
                                    txt=txt+sujet[1][b]+" "+gr1[a][b]+" "+pcp+"\n";
                                }
                            }
                        } 
                        listeZones.get(a).setText(txt);
                        txt="";
                    }
                }
                


//Deuxième groupe
                else if(x>=6838 && x<7199)
                {
                    mot = mot.toLowerCase();
                    gr.setText("Groupe :");
                    gr.setText(gr.getText()+" 2");
                    String pcp = mot.substring(0,taille-1);
                    mot = mot.substring(0,taille-2);
                    int a=0;
                    int b=0;                     
                    for(a=0;a<12;a++)
                    {                                
                        for(b=0;b<6;b++)
                        {   
                            if('a'== mot.charAt(0)|'e'== mot.charAt(0)|'é'== mot.charAt(0)|'i'== mot.charAt(0)|'o'== mot.charAt(0)|'u'== mot.charAt(0))
                            {
                                if(a<4)
                                {  
                                    sujet[0][0]="j'";
                                    txt=txt+sujet[0][b]+" "+mot+gr2[a][b]+"\n";
                                } 
                                else if(a>=4 && a<8)
                                {
                                    sujet[0][0]="j'";
                                    txt=txt+sujet[0][b]+" "+gr2[a][b]+" "+pcp+"\n";  
                                }
                                else if (a == 8 | a == 10)
                                {
                                    sujet[1][0]="que j'";
                                    txt=txt+sujet[1][b]+" "+mot+gr2[a][b]+"\n"; 
                                }
                                else if (a == 9 | a == 11)
                                {
                                    sujet[1][0]="que j'";
                                    txt=txt+sujet[1][b]+" "+gr2[a][b]+" "+pcp+"\n"; 
                                }
                            }  
                            else
                            {
                                if(a<4)
                                {  
                                    txt=txt+sujet[0][b]+" "+mot+gr2[a][b]+"\n";
                                }
                                else if(a>=4 && a<8)
                                {
                                    sujet[0][0]="j'";
                                    txt=txt+sujet[0][b]+" "+gr2[a][b]+" "+pcp+"\n";  
                                }
                                else if (a == 8 | a == 10)
                                {
                                    sujet[1][0]="que je";
                                    txt=txt+sujet[1][b]+" "+mot+gr2[a][b]+"\n"; 
                                }
                                else if (a == 9 | a == 11)
                                {
                                    sujet[1][0]="que j'";
                                    txt=txt+sujet[1][b]+" "+gr2[a][b]+" "+pcp+"\n";
                                }
                            }
                        } 
                        listeZones.get(a).setText(txt);
                        //System.out.println(text);
                        txt="";
                    }
                    sujet[0][0]="je";
                    sujet[1][0]="que je"; 
                    break;                
                }



//Troisième groupe
                else if(x>=7199 && x<=7590)
                {
                    gr.setText("Groupe :");
                    gr.setText(gr.getText()+" 3");
                    for(int i = 0;i<12;i++)
                    {
                        txt = "";
                        listeZones.get(i).setText(txt);
                    }
                    
                }
            }
         }
        if(!lecture.contains(line) && (mot.equals("Avoir") |mot.equals("Etre")))
        {
            JOptionPane.showMessageDialog(null,"Ton verbe n'est pas dedans");
        } 
    }
    
    
    
    catch(FileNotFoundException e)
    {
        System.err.printf("Le fichier n'a pas ete trouve "+ref.toString());
         e.printStackTrace();
    }
    catch(IOException e)
    {
        System.err.printf("Impossible de lire le fichier ");
         e.printStackTrace();
    } 
    
    try
    {
        br.close();
    }
    
    catch(IOException e)
    {
        System.err.println("Impossible de fermer le fichier");
         e.printStackTrace();
    }
    
    catch(NullPointerException e)
    {
        System.err.println("Impossible d'ouvrir le fichier");
         e.printStackTrace();
    }                            
            }       
        });
    }
}    
   
