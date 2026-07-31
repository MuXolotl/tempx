package defpackage;

/* JADX INFO: renamed from: lَٜٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10427l {
    public double admob;
    public double amazon;
    public double billing;
    public boolean crashlytics;
    public final C4033l isPro;
    public double loadAd;
    public double mopub;
    public double purchase;
    public double subs;
    public double yandex;

    public C10427l() {
        this.yandex = Math.sqrt(1500.0d);
        this.loadAd = 0.5d;
        this.crashlytics = false;
        this.subs = Double.MAX_VALUE;
        this.isPro = new C4033l();
    }

    public final C4033l crashlytics(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.crashlytics) {
            if (this.subs == Double.MAX_VALUE) {
                C8339l.smaato("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d3 = this.loadAd;
            if (d3 > 1.0d) {
                double d4 = this.yandex;
                this.billing = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.loadAd;
                double d6 = this.yandex;
                this.mopub = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.admob = Math.sqrt(1.0d - (d3 * d3)) * this.yandex;
            }
            this.crashlytics = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.subs;
        double d9 = this.loadAd;
        if (d9 > 1.0d) {
            double d10 = this.mopub;
            double d11 = ((d10 * d8) - d2) / (d10 - this.billing);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.billing * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.mopub;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.billing;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.yandex;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.yandex) * d7) * d17;
            double d18 = -this.yandex;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.admob;
            double d20 = this.yandex;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.admob * d7) * d21) + (Math.cos(this.admob * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.yandex;
            double d23 = this.loadAd;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.admob;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.admob;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.subs);
        C4033l c4033l = this.isPro;
        c4033l.f8314l = f;
        c4033l.f8313l = (float) dCos;
        return c4033l;
    }

    public final void loadAd(float f) {
        if (f <= 0.0f) {
            C8339l.metrica("Spring stiffness constant must be positive.");
        } else {
            this.yandex = Math.sqrt(f);
            this.crashlytics = false;
        }
    }

    public final void yandex(float f) {
        if (f < 0.0f) {
            C8339l.metrica("Damping ratio must be non-negative");
        } else {
            this.loadAd = f;
            this.crashlytics = false;
        }
    }

    public C10427l(float f) {
        this.yandex = Math.sqrt(1500.0d);
        this.loadAd = 0.5d;
        this.crashlytics = false;
        this.isPro = new C4033l();
        this.subs = f;
    }
}
