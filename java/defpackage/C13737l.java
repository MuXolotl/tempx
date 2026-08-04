package defpackage;

/* JADX INFO: renamed from: lْۢؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13737l implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ C17923l loadAd;
    public final String yandex;

    public C13737l(C17923l c17923l, String str) {
        this.loadAd = c17923l;
        this.yandex = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        C8118l c8118l = ((C17417l) this.loadAd.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16908l.loadAd(th, this.yandex);
    }
}
