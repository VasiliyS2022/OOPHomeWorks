package homework3;

import drugs.Component;
import drugs.paperhw1.components.Azitron;
import drugs.paperhw1.components.Penicillin;
import drugs.paperhw1.components.Water;
import drugs.paperhw1.CatDrug;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//      Доизровки азитромицина
        Component lowWater = new Water("15", 1);
        Component mediumWater = new Water("20", 1);
        Component highWater = new Water("30", 1);

//      Дозировки воды
        Component lowAzitron = new Azitron("2", 4);
        Component mediumAzitron = new Azitron("4", 8);
        Component highAzitron = new Azitron("8", 16);

//      Дозировки пенициллина
        Component lowPenicillin = new Penicillin("18", 3);
//        Для заданий 1 и 2
        Component lowPenicillin1 = new Penicillin("18", 3);
        Component lowPenicillin2 = lowPenicillin1;

//      -------------------Компоненты для всех лекарств-------------------
        List<Component> componentsCat = new ArrayList<>();
        componentsCat.add(lowAzitron);
        componentsCat.add(lowWater);

        List<Component> componentsCat2 = new ArrayList<>();
        componentsCat2.add(lowWater);
        componentsCat2.add(lowPenicillin);

        List<Component> componentsCat3 = new ArrayList<>();
        componentsCat3.add(mediumWater);
        componentsCat3.add(highAzitron);

        List<Component> componentsCat4 = new ArrayList<>();
        componentsCat4.add(highWater);
        componentsCat4.add(highAzitron);

        List<Component> componentsCat5 = new ArrayList<>();
        componentsCat5.add(lowAzitron);

        // Для задания 2
        List<Component> repeatingComponents = new ArrayList<>();
        repeatingComponents.add(lowPenicillin);
        repeatingComponents.add(lowPenicillin1);
        repeatingComponents.add(lowPenicillin2);
//      ------------------------------------------------------------------

//      -------------------Лекарства-------------------
        CatDrug drug = new CatDrug(componentsCat);
        CatDrug drug1 = new CatDrug(componentsCat2);
        CatDrug drug2 = new CatDrug(componentsCat3);
        CatDrug drug4 = new CatDrug(componentsCat4);
        CatDrug drug5 = new CatDrug(componentsCat5);
//      -----------------------------------------------

//      Задание 1
        Set<Component> components = new HashSet<>();
        components.add(lowPenicillin);
        components.add(lowPenicillin1);
        components.add(lowPenicillin2);

        System.out.println(components);

//      Задание 2
        Set<Component> components1 = new HashSet<>(repeatingComponents);

        System.out.println(components1);

//      Задание 3
        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug4);
        drugs.add(drug5);
        System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println(drugs);
    }
}