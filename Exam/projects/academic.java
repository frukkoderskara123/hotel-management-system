public class academic{
    static String[] studentNames=new String[0];
    static int[] scores=new int[0];
    public static void GradeEntry(String studentname,int score) {
        for (int i = 0; i < studentNames.length; i++) {
            if (studentname == studentNames[i]) {
                if (score > scores[i]) {
                    scores[i] = score;
                }
                return;
            }
        }
        String[] newstudentNames = new String[studentNames.length + 1];
        int[] newscores = new int[scores.length + 1];
        for (int k = 0; k < studentNames.length; k++) {
            newstudentNames[k] = studentNames[k];
            newscores[k] = scores[k];

        }
        newstudentNames[newstudentNames.length - 1] = studentname;
        studentNames = newstudentNames;
        scores = newscores;
    }
    public static void CleanUp(){

    }
}