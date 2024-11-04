package Inheritance;

public class GradStudent extends Student {
    private String source;
    private double rate;

    public GradStudent(String _name, int _num_courses, String _support, double _pay_rate) {
        super(_name, _num_courses);
        source = _support;
        rate = _pay_rate;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += STR."\nSupport Source: \{source}";
        result += STR."\nHour Pay Rate: \{rate}";
        return result;
        // return super.toString();
    }
}
