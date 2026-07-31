package defpackage;

/* JADX INFO: renamed from: lُّ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11007l {
    public static final C6096l billing = new C6096l(12);
    public final boolean amazon;
    public final boolean crashlytics;
    public final C11090l loadAd;
    public final boolean purchase;
    public final C16328l yandex;

    public C11007l(C16328l c16328l, C11090l c11090l, boolean z, boolean z2, boolean z3) {
        this.yandex = c16328l;
        this.loadAd = c11090l;
        this.crashlytics = z;
        this.amazon = z2;
        this.purchase = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.yandex);
        sb.append(", textStyle=");
        sb.append(this.loadAd);
        sb.append(", singleLine=");
        sb.append(this.crashlytics);
        sb.append(", softWrap=");
        sb.append(this.amazon);
        sb.append(", isKeyboardTypePhone=");
        return AbstractC5020l.Signature(sb, this.purchase, ")");
    }
}
