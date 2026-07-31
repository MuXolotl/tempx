package defpackage;

/* JADX INFO: renamed from: lُٖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16315l {
    public static final C12609l loadAd;
    public static final C3884l yandex;

    static {
        C3884l c3884l = new C3884l();
        c3884l.f8024l = -1;
        yandex = c3884l;
        C12609l c12609l = new C12609l();
        c12609l.f24835l = -1;
        loadAd = c12609l;
    }

    public static C3884l yandex(appmetrica appmetricaVar) {
        if (appmetricaVar.f489l < 1) {
            return yandex;
        }
        C3884l c3884l = new C3884l(appmetricaVar);
        c3884l.f8024l = -1;
        return c3884l;
    }
}
