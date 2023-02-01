public class Presenter {
    View view;
    RModel model;
    CModel model2;

    public Presenter(RModel m, View v) {
        model = m;
        view = v;
    }

    public Presenter(CModel m2, View v) {
        model2 = m2;
        view = v;
    }

    public void buttonClick() {
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setA(a);
        model.setB(b);
        int result = model.result();
        view.print(result, "Sum: ");
        int subtruct = model.subtruct();
        view.print(subtruct, "Sub: ");
        int multiply = model.multiply();
        view.print(multiply, "Multi: ");
        int division = model.division();
        view.print(division, "Div: ");
    }

}
