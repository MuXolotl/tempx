package defpackage;

/* JADX INFO: renamed from: lِۘۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12072l implements InterfaceC18216l {
    public final /* synthetic */ C14972l yandex;

    public C12072l(C14972l c14972l) {
        this.yandex = c14972l;
    }

    @Override // defpackage.InterfaceC18216l
    public final void yandex(C11260l c11260l) {
        double dMax = Math.max(0.0d, c11260l.amazon.yandex);
        C14972l c14972l = this.yandex;
        c14972l.f29473l = (float) dMax;
        c14972l.loadAd();
        if (dMax <= 0.0d) {
            c11260l.yandex();
            c14972l.f29464l = false;
            c14972l.f29467l = false;
            c14972l.f29468l = false;
        }
    }
}
