package Homework_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class main_ns {
    
    static Set <Object> menu(Set <Object> notebooks, Set <Object> notebooks_cor) {
        Scanner scn = new Scanner(System.in, "Cp866");
        System.out.println("Здравствуйте!\n Давайте выберем подходящий ноутбук)");
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ\n 2 - Объем ЖД\n 3 - Операционная система\n 4 - Цвет");
        Character number = scn.next().charAt(0);
        switch (number){
            case '1':
                for (var element: notebooks){
                    System.out.printf("В наличии: %s", element.getRAM());               
                }
                System.out.println("Введите интересующую конфигурацию: ");
                String scnRam = scn.nextLine();
                for (var element: notebooks){
                    if (scnRam == element.getRAM()){
                        if (!notebooks_cor.contains(element)){
                            notebooks_cor.add (element);
                        }   
                    } else {System.out.println("Введите корректный параметр из представленных в наличии: ");}
                }
                break;
            case '2':
                for (var element: notebooks){
                    System.out.printf("В наличии: %s", element.getHDD());               
                }
                System.out.println("Введите интересующую конфигурацию: ");
                String scnHDD = scn.nextLine();
                for (var element: notebooks){
                    if (scnRam == element.getHDD()){
                        if (!notebooks_cor.contains(element)){
                            notebooks_cor.add (element);
                        }   
                    } else {System.out.println("Введите корректный параметр из представленных в наличии: ");}
                }
                break;
            case '3':
                for (var element: notebooks){
                    System.out.printf("В наличии: %s", element.getOS());               
                }
                System.out.println("Введите интересующую конфигурацию: ");
                String scnOS = scn.nextLine();
                for (var element: notebooks){
                    if (scnRam == element.getOS()){
                        if (!notebooks_cor.contains(element)){
                            notebooks_cor.add (element);
                        }   
                    } else {System.out.println("Введите корректный параметр из представленных в наличии: ");}
                }
                break;
            case '4':
                for (var element: notebooks){
                    System.out.printf("В наличии: %s", element.getColor());               
                }
                System.out.println("Введите интересующую конфигурацию: ");
                String scnColor = scn.nextLine();
                for (var element: notebooks){
                    if (scnRam == element.getColor()){
                        if (!notebooks_cor.contains(element)){
                            notebooks_cor.add (element);
                        }   
                    } else {System.out.println("Введите корректный параметр из представленных в наличии: ");}
                }
                break;
            default:
                System.out.print("Ввод некорректный");
                break;
        }
        scn.close();
        return notebooks_cor;  
    }
   
    public static void main(String[] args) {

    Notebooks notebook1 = new Notebooks();
    notebook1.setRAM ("Static RAM");
    notebook1.setHDD ("512 Gb");
    notebook1.setOS ("Windows");
    notebook1.setColor ("Grey");

    Notebooks notebook2 = new Notebooks();
    notebook2.setRAM ("Dynamic RAM");
    notebook2.setHDD ("1 Tb");
    notebook2.setOS ("Windows");
    notebook2.setColor ("Black");

    Notebooks notebook3 = new Notebooks();
    notebook3.setRAM ("Dynamic RAM");
    notebook3.setHDD ("2 Tb");
    notebook3.setOS ("Linux");
    notebook3.setColor ("Grey");

    Notebooks notebook4 = new Notebooks();
    notebook4.setRAM ("Dynamic RAM");
    notebook4.setHDD ("2 Tb");
    notebook4.setOS ("Windows");
    notebook4.setColor ("Grey");

    Notebooks notebook5 = new Notebooks();
    notebook5.setRAM ("Static RAM");
    notebook5.setHDD ("8 Tb");
    notebook5.setOS ("Linux");
    notebook5.setColor ("White");

    Set <Object> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5));
    Set <Object> notebooks_cor = new HashSet<>();
    menu (notebooks, notebooks_cor);
    System.out.println("Уточните параметры");
    menu (notebooks, notebooks_cor);
    System.out.println("Уточните параметры еще раз");
    menu (notebooks, notebooks_cor);
    System.out.println("У нас в наличии есть следующие ноутбуки:\n");
    for (var element: notebooks_cor){
        element.characteristics();
    }
    System.out.println("Спасибо за выбор!");
    }
}
