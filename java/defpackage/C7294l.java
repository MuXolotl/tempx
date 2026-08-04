package defpackage;

/* JADX INFO: renamed from: lؚٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7294l implements InterfaceC1989l {
    public final /* synthetic */ C6215l amazon;
    public boolean crashlytics;
    public final C16543l yandex = new C16543l(19, this);
    public final C13326l loadAd = new C13326l(65536);

    public C7294l(C6215l c6215l) {
        this.amazon = c6215l;
    }

    @Override // defpackage.InterfaceC1989l
    public final void yandex(AbstractC14384l abstractC14384l, AbstractC10759l abstractC10759l) {
        C6215l c6215l = this.amazon;
        c6215l.f13134l = abstractC10759l;
        if (this.crashlytics) {
            return;
        }
        this.crashlytics = true;
        InterfaceC8782l interfaceC8782lLoadAd = abstractC14384l.loadAd(new C5019l(abstractC10759l.smaato(0)), this.loadAd, 0L);
        c6215l.f13130l = interfaceC8782lLoadAd;
        interfaceC8782lLoadAd.vip(this.yandex, 0L);
    }
}
