package defpackage;

/* JADX INFO: renamed from: l٘ۤۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18328l {
    public final C10228l yandex(Object obj, Object obj2) {
        C10228l c10228lCrashlytics = (C10228l) obj;
        C10228l c10228l = (C10228l) obj2;
        if (!c10228l.isEmpty()) {
            if (!c10228lCrashlytics.f20848l) {
                c10228lCrashlytics = c10228lCrashlytics.crashlytics();
            }
            c10228lCrashlytics.loadAd();
            if (!c10228l.isEmpty()) {
                c10228lCrashlytics.putAll(c10228l);
            }
        }
        return c10228lCrashlytics;
    }
}
