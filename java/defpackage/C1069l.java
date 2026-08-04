package defpackage;

/* JADX INFO: renamed from: lٕٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1069l implements InterfaceC10506l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8417l f2948l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f2949l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7013l f2950l;

    public C1069l(C8417l c8417l) {
        this.f2948l = c8417l;
        this.f2950l = new C7013l(((C7167l) c8417l.crashlytics.f20589l).f14999l.isPro());
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) {
        if (this.f2949l) {
            C8339l.smaato("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        C7167l c7167l = (C7167l) this.f2948l.crashlytics.f20589l;
        if (c7167l.f14997l) {
            C8339l.smaato("closed");
            return;
        }
        c7167l.f14998l.m717l(j);
        c7167l.yandex();
        c7167l.mo706finally("\r\n");
        c7167l.mo390break(c0869l, j);
        c7167l.mo706finally("\r\n");
    }

    @Override // defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f2949l) {
            return;
        }
        this.f2949l = true;
        ((C7167l) this.f2948l.crashlytics.f20589l).mo706finally("0\r\n\r\n");
        C7013l c7013l = this.f2950l;
        C3446l c3446l = c7013l.purchase;
        c7013l.purchase = C3446l.amazon;
        c3446l.yandex();
        c3446l.loadAd();
        this.f2948l.amazon = 3;
    }

    @Override // defpackage.InterfaceC10506l, java.io.Flushable
    public final synchronized void flush() {
        if (this.f2949l) {
            return;
        }
        ((C7167l) this.f2948l.crashlytics.f20589l).flush();
    }

    @Override // defpackage.InterfaceC10506l
    public final C3446l isPro() {
        return this.f2950l;
    }
}
