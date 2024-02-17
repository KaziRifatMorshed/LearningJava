package RationalNumberVognangsho;

public class Vognangsho {
    public int upor, nich;

    public Vognangsho(int _upor, int _nich) {
        if (_nich == 0) {
            _nich = 1;
        }
        if (_nich < 0) { // সুন্দর বুদ্ধি
            _nich *= -1;
            _upor *= -1;
        }
        // খেয়াল করো
        this.nich = _nich / GCD(_upor, _nich);
        this.upor = _upor / GCD(_upor, _nich);
    }

    public Vognangsho(int _upor) {
        this.upor = _upor;
        this.nich = 1;
    }

    private int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }

    public int getUpor() {
        return this.upor;
    }

    public int getNich() {
        return this.nich;
    }

    public Vognangsho inverse() {
        return new Vognangsho(this.nich, this.upor);
    }

    public Vognangsho add(Vognangsho second) {
        int commonDenominator = this.nich * second.nich;
        int sum = (this.upor * second.nich) + (this.nich * second.upor);
        return new Vognangsho(sum, commonDenominator);
    }

    public Vognangsho subtract(Vognangsho second) {
        int commonDenominator = this.nich * second.nich;
        int Numerator = (this.upor * second.nich) - (this.nich * second.upor);
        return new Vognangsho(Numerator, commonDenominator);
    }

    public Vognangsho mutiply(Vognangsho second) {
        return new Vognangsho(this.upor * second.upor, this.nich * second.nich);
    }

    public Vognangsho divide(Vognangsho second) {
        return mutiply(second.inverse());
    }

    public boolean isEqual(Vognangsho second) {
        return (this.nich == second.nich) && (this.upor == second.upor);
    }

    public String toString() {
        return STR."ভগ্নাংশটি ছিলোঃ \{upor}/\{nich} যেখানে হর \{upor} এনং লব \{nich} ।";
    }

    // end
}
