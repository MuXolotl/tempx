package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lّٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15115l {
    public static final /* synthetic */ int vip = 0;
    public final int admob;
    public final int amazon;
    public final boolean billing;
    public final int crashlytics;
    public final boolean firebase;
    public final boolean isPro;
    public final boolean loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public String remoteconfig;
    public final boolean smaato;
    public final int subs;
    public final boolean yandex;

    static {
        C6760l c6760l = C9658l.f19699l;
        EnumC16636l enumC16636l = EnumC16636l.SECONDS;
        long jAdmob = C9658l.admob(AbstractC15918l.tapsense(Alert.DURATION_SHOW_INDEFINITELY, enumC16636l), enumC16636l);
        if (jAdmob >= 0) {
            return;
        }
        C10754l.metrica(AbstractC2812l.ads(jAdmob, "maxStale < 0: "));
    }

    public C15115l(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = z3;
        this.billing = z4;
        this.mopub = z5;
        this.admob = i3;
        this.subs = i4;
        this.isPro = z6;
        this.firebase = z7;
        this.smaato = z8;
        this.remoteconfig = str;
    }

    public final String toString() {
        String str = this.remoteconfig;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.yandex) {
            sb.append("no-cache, ");
        }
        if (this.loadAd) {
            sb.append("no-store, ");
        }
        int i = this.crashlytics;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.amazon;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.purchase) {
            sb.append("private, ");
        }
        if (this.billing) {
            sb.append("public, ");
        }
        if (this.mopub) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.admob;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.subs;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.isPro) {
            sb.append("only-if-cached, ");
        }
        if (this.firebase) {
            sb.append("no-transform, ");
        }
        if (this.smaato) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.remoteconfig = string;
        return string;
    }
}
