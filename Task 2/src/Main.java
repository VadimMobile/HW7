public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников\
        int employee = 2;
        boolean cutbacks = true;
        while (cutbacks){
            System.out.println("Уволен айтишник с id " + employee);
            employee = employee + 2;
            if (employee == 102){
                cutbacks = false;
            }
        }
    }
}
