package defpackage;

/* JADX INFO: renamed from: lَٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15387l {
    public boolean amazon;
    public final C0536l billing;
    public final C15308l crashlytics;
    public final C15308l loadAd;
    public Object purchase;
    public final /* synthetic */ int yandex;

    public C15387l(int i, int i2, int i3) {
        this.yandex = i3;
        switch (i3) {
            case 1:
                this.loadAd = new C15308l(i);
                this.crashlytics = new C15308l(i2);
                this.billing = new C0536l(i, 30, 100);
                break;
            default:
                this.loadAd = new C15308l(i);
                this.crashlytics = new C15308l(i2);
                this.billing = new C0536l(i, 90, 200);
                break;
        }
    }

    public final void yandex(int i, int i2) {
        int i3 = this.yandex;
        C15308l c15308l = this.crashlytics;
        C0536l c0536l = this.billing;
        C15308l c15308l2 = this.loadAd;
        switch (i3) {
            case 0:
                if (i < 0.0f) {
                    AbstractC14825l.yandex("Index should be non-negative");
                }
                c15308l2.subs(i);
                c0536l.crashlytics(i);
                c15308l.subs(i2);
                break;
            default:
                if (i < 0.0f) {
                    AbstractC14825l.yandex("Index should be non-negative (" + i + ")");
                }
                c15308l2.subs(i);
                c0536l.crashlytics(i);
                c15308l.subs(i2);
                break;
        }
    }
}
