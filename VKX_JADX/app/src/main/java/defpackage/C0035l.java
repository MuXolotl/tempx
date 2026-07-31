package defpackage;

/* JADX INFO: renamed from: lؑؒؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0035l {
    public final C9704l yandex(Object obj, Object obj2) {
        C9704l c9704lCrashlytics = (C9704l) obj;
        C9704l c9704l = (C9704l) obj2;
        if (!c9704l.isEmpty()) {
            if (!c9704lCrashlytics.f19790l) {
                c9704lCrashlytics = c9704lCrashlytics.crashlytics();
            }
            c9704lCrashlytics.loadAd();
            if (!c9704l.isEmpty()) {
                c9704lCrashlytics.putAll(c9704l);
            }
        }
        return c9704lCrashlytics;
    }
}
