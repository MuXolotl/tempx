package defpackage;

/* JADX INFO: renamed from: lؘٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13843l {
    public final C13660l yandex;

    public static final Object yandex(C13660l c13660l) {
        Object objMopub = c13660l.mopub(null);
        if (objMopub == null) {
            return null;
        }
        if (!(objMopub instanceof C12463l)) {
            c13660l.smaato(null);
            return objMopub;
        }
        C12463l c12463l = (C12463l) objMopub;
        if (c12463l.isPro()) {
            C1759l.firebase("List is empty.");
            return null;
        }
        int i = c12463l.loadAd - 1;
        Object objAdmob = c12463l.admob(i);
        c12463l.remoteconfig(i);
        if (c12463l.isPro()) {
            c13660l.smaato(null);
        }
        if (c12463l.loadAd == 1) {
            c13660l.vip(null, c12463l.mopub());
        }
        return objAdmob;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13843l) {
            return this.yandex.equals(((C13843l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.yandex + ")";
    }
}
