package defpackage;

/* JADX INFO: renamed from: lًؑٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C0187l {
    public final C8723l admob;
    public final double amazon;
    public final C8723l billing;
    public final boolean crashlytics;
    public final C8723l firebase;
    public final int isPro;
    public final int loadAd;
    public final C8723l mopub;
    public final C8723l purchase;
    public final int smaato;
    public final C8723l subs;
    public final C14997l yandex;

    public C0187l(C14997l c14997l, int i, boolean z, double d, C8723l c8723l, C8723l c8723l2, C8723l c8723l3, C8723l c8723l4, C8723l c8723l5, int i2, int i3, C8723l c8723l6) {
        this.yandex = c14997l;
        this.loadAd = i;
        this.crashlytics = z;
        this.amazon = d;
        this.purchase = c8723l;
        this.billing = c8723l2;
        this.mopub = c8723l3;
        this.admob = c8723l4;
        this.subs = c8723l5;
        this.isPro = i2;
        this.firebase = c8723l6;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                i3 = 1;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                C18725l.billing();
                throw null;
        }
        this.smaato = i3;
    }

    public C0187l(C14997l c14997l, int i, boolean z, double d, int i2, int i3, C8723l c8723l, C8723l c8723l2, C8723l c8723l3, C8723l c8723l4, C8723l c8723l5, C8723l c8723l6) {
        this(c14997l, i, z, d, c8723l, c8723l2, c8723l3, c8723l4, c8723l5, i2, i3, c8723l6 == null ? AbstractC7837l.crashlytics(25.0d, 84.0d) : c8723l6);
    }
}
