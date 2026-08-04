package defpackage;

/* JADX INFO: renamed from: lٍۥۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9943l {
    public static final C9943l amazon;
    public final boolean crashlytics;
    public final C5334l loadAd;
    public final int yandex;

    static {
        appmetrica appmetricaVar = new appmetrica((char) 0, 11);
        appmetricaVar.f492l = C5334l.mopub;
        appmetricaVar.f489l = 0;
        appmetricaVar.f492l = C5334l.admob;
        appmetricaVar.f490l = false;
        appmetrica appmetricaVar2 = new appmetrica(new C9943l(appmetricaVar));
        appmetricaVar2.f489l = 2;
        appmetricaVar2.f492l = C5334l.subs;
        appmetricaVar2.f490l = false;
        amazon = new C9943l(appmetricaVar2);
        C5334l c5334l = C5334l.mopub;
        C5334l c5334l2 = C5334l.mopub;
        C5334l c5334l3 = C5334l.mopub;
        C5334l c5334l4 = C5334l.mopub;
        C5334l c5334l5 = C5334l.mopub;
        C5334l c5334l6 = C5334l.mopub;
    }

    public C9943l(appmetrica appmetricaVar) {
        this.yandex = appmetricaVar.f489l;
        this.loadAd = (C5334l) appmetricaVar.f492l;
        this.crashlytics = appmetricaVar.f490l;
    }
}
