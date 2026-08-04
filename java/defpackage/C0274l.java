package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lّؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0274l {
    public static final C0274l crashlytics;
    public static final C0274l loadAd;
    public final C3313l yandex;

    static {
        LinkedHashMap linkedHashMap = null;
        C4610l c4610l = null;
        C5487l c5487l = null;
        C15457l c15457l = null;
        C11700l c11700l = null;
        loadAd = new C0274l(new C3313l(c4610l, c5487l, c15457l, c11700l, linkedHashMap, 127));
        crashlytics = new C0274l(new C3313l(c4610l, c5487l, c15457l, c11700l, linkedHashMap, 95));
    }

    public C0274l(C3313l c3313l) {
        this.yandex = c3313l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0274l) && ((C0274l) obj).yandex.equals(this.yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        if (equals(loadAd)) {
            return "ExitTransition.None";
        }
        if (equals(crashlytics)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        C3313l c3313l = this.yandex;
        C4610l c4610l = c3313l.yandex;
        String string = c4610l != null ? c4610l.toString() : null;
        C5487l c5487l = c3313l.loadAd;
        String string2 = c5487l != null ? c5487l.toString() : null;
        C15457l c15457l = c3313l.crashlytics;
        String string3 = c15457l != null ? c15457l.toString() : null;
        C11700l c11700l = c3313l.amazon;
        String string4 = c11700l != null ? c11700l.toString() : null;
        boolean z = c3313l.purchase;
        StringBuilder sbLicense = AbstractC14814l.license("ExitTransition: \nFade - ", string, ",\nSlide - ", string2, ",\nShrink - ");
        AbstractC9361l.appmetrica(sbLicense, string3, ",\nScale - ", string4, ",\nKeepUntilTransitionsFinished - ");
        sbLicense.append(z);
        return sbLicense.toString();
    }

    public final C0274l yandex(C0274l c0274l) {
        C3313l c3313l = c0274l.yandex;
        C4610l c4610l = c3313l.yandex;
        C3313l c3313l2 = this.yandex;
        if (c4610l == null) {
            c4610l = c3313l2.yandex;
        }
        C5487l c5487l = c3313l.loadAd;
        if (c5487l == null) {
            c5487l = c3313l2.loadAd;
        }
        C15457l c15457l = c3313l.crashlytics;
        if (c15457l == null) {
            c15457l = c3313l2.crashlytics;
        }
        C11700l c11700l = c3313l.amazon;
        if (c11700l == null) {
            c11700l = c3313l2.amazon;
        }
        return new C0274l(new C3313l(c4610l, c5487l, c15457l, c11700l, c3313l.purchase || c3313l2.purchase, AbstractC8676l.metrica(c3313l2.billing, c3313l.billing)));
    }
}
