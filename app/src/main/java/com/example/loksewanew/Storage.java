package com.example.loksewanew;

public class Storage {
    public String[] engineering() {
        final String[] subject = {"Aeronautical Engineering", "Architect Engineer", "Automobile Engineering", "Civil Engineering", "Computer Engineering", "Electrical Engineering", "Electronics Engineering", "IT Engineering", "Mechanical Engineering"};
        return subject;
    }

    public String[] SubSubjects(int pos1){
        final String[][] subject = {{"Airlines"},{"NTC"},{"Airlines"},{"ADBL","NEA","NTC","PSC"},{"Airlines","NEA","NTC","NTV","PSC"},{"NEA","NTC","NTV","PSC"},{"Airlines","NTC","NTV","PSC"},{"ADBL","NBL","NRB","RBB"},{"Airlines","NEA","PSC"}};
        return subject[pos1];
    }

    public String[] DisplayThird(int pos1, int pos2){
        final String[][][] subject={{{"Operations Engineer","Senior Technical Officer"}},{{"Architech Engineering,LVL 7"}},{{"Senior Technical Officer","Senior Technician"}},{{"Civil Ovearseer"},{"Civil Level-4","Civil Level-5","Civil Level-7"},{"Civil Engineer(First Paper)","Civil Engineer(Second Paper)"},{"Building","General","Highway","Hydrology","Hydropower","Irrigation","Mining","Sanitary"}}  ,  {{"Computer Engineer"},{"Computer Engineer"},{"Computer Engineer (First paper)","Computer Engineer (Second paper)"},{"Assistant Computer Engineering Level-5","Computer Engineering Level-6"},{"First Paper","Second Paper"}},{{"Level 3","Level 4","Level 5","Level 7"},{"First Paper","Second Paper"},{"Assistant Technician","Electrical Engineering","Senior Assistant Technician"},{"First Paper","Second Paper"}},{{"Electical Enigneering"},{"First Paper","Second Paper"},{"Assistant Technical","Electronic Engineer","Senior Assistant Technician"},{"First Paper","Second Paper"}},{{"Senior IT Enigneer"},{"Assistant IT Engineer"},{"Senior IT Engineer-Level-5"},{"Senior IT Engineer-Level-5"}},{{"Senio Technical Officer","Senior Technical Officer-Automobile","Senior Technician-Automobile"},{"Mechnical-Level-3","Mechnical-Level-4","Mechnical-Level-5","Mechnical-Level-7"},{"Mechnical Engineer(First Paper)","Mechnical Engineer(Second Paper)"}}};
        return subject [pos1][pos2];
    }
    public String PdfFile(int pos1,int pos2,int pos3){
        final String[][][] subject={{{"Operations Engineer, level 7","Senior Technical Officer, level 7"}},{{"Architect Engineer, level 7"}},{{"Senior Technical Officer, Automobile, Level 7","Senior Technician, Automobile, level 5"}},{{"Civil Overseer, LVL 5"},{"Civil - level 4","Civil - level 5","Civil Engineer - Level 7"},{"Civil Engineer (First Paper), level 7","Civil Engineer (Second Paper), level 7"},{"Building","General","Highway","Hydrology","Hydropower","Irrigation","Mining","Sanitary"}}   ,  {{"Computer Engineering Level 7"},{"Computer Engineer - level 7_"},{"Computer Engineer (First paper) - level 7","Computer Engineer (Second paper) - level 7"},{"Assistant Computer Engineer - level 5","Computer Engineer - level 6_"},{"Computer Engineer (First Paper) - level 7_","Computer Engineer (First Paper) - level 7_"}},{{"Electrical Engineer, LVL 3","Electrical Engineer, LVL 4","Electrical Engineer, LVL 5","Electrical Engineer, LVL 7"},{"Electrical Engineer (First paper), LVL 7","Electrical Engineer (Second paper), LVL 7"},{"Assistant Technician, LVL 4","Electrical Engineer, LVL 7","Senior Assistant Technician, LVL 5"},{"Electrical Engineer (First Paper), LEVEL 7","Electrical Engineer (Second Paper), LEVEL 7"}},{{"Electronic Engineer, LVL 7"},{"Electronic Engineer (First paper), LVL 7","Electronic Engineer (Second paper), LVL 7"},{"Assistant Technician, LVL-4","Electronics Engineer, LEVEL-7","Senior Assistant Technician, LVL-5"},{"Electronic Engineer (First Paper), LEVEL 7","Electronic Engineer (Second Paper), LEVEL 7"}},{{"Senior  IT Engineer, LVL-7"},{"Assistant IT Engineer, LVL-4"},{"Senior IT Engineer, LVL 5"},{"Senior IT Engineer- LVL 5"}},{{"Senior Technical Officer, LVL-7","Senior Technical Officer, Automobile - Level 7","Senior Technician, Automobile - level 5"},{"Mechanical - level 3","Mechanical - level 4","Mechanical - level 5","Mechanical Engineer - level 7"},{"Mechanical Engineer (First Paper) - level 6_","Mechanical Engineer (Second paper)- level 6_"}}};
        return subject[pos1][pos2][pos3];
    }
    public String[] Civil(int pos){
        String[][] subject={{"Building(First Paper)","Building(Second Paper)"},{"General (First Paper)","General (Second Paper)"},{"Highway(First Paper)","Highway(Second Paper)"},{"Hydrology (First Paper)","Hydrology (Second Paper)"},{"Hydropower(First Paper)","Hydropower(Second Paper)"},{"IIrrigation(First Paper)","Irrigation(Second Paper)"},{"Mining(First Paper)","Mining(Second Paper)"},{"Sanitary(First Paper)","Sanitary(Second Paper)"}};
        return subject[pos];
    }
    public String Civilsub(int pos1,int pos2){
        String[][] subject={{"Building(First Paper)","Building(Second Paper)"},{"General (First Paper)","General (Second Paper)"},{"Highway(First Paper)","Highway(Second Paper)"},{"Hydrology (First Paper)","Hydrology (Second Paper)"},{"Hydropower(First Paper)","Hydropower(Second Paper)"},{"IIrrigation(First Paper)","Irrigation(Second Paper)"},{"Mining(First Paper)","Mining(Second Paper)"},{"Sanitary(First Paper)","Sanitary(Second Paper)"}};
        return subject[pos1][pos2];
    }
}
