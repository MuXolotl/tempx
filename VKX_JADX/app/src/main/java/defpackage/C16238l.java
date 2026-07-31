package defpackage;

/* JADX INFO: renamed from: lؚٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16238l implements InterfaceC12831l {
    public final /* synthetic */ int loadAd;
    public volatile AbstractC2240l yandex = null;

    public C16238l(int i) {
        this.loadAd = i;
    }

    public final AbstractC2240l loadAd() {
        switch (this.loadAd) {
            case 0:
                return new C10504l();
            case 1:
                C16705l c16705l = new C16705l();
                c16705l.crashlytics = new C13117l();
                c16705l.amazon = new C0118l();
                return c16705l;
            case 2:
                return new C18671l();
            case 3:
                return new C5135l();
            case 4:
                return new C1656l();
            case 5:
                return new C9438l();
            case 6:
                C2983l c2983l = new C2983l();
                c2983l.crashlytics = new C11996l();
                C0514l c0514l = new C0514l();
                c0514l.yandex = new C10241l();
                c2983l.amazon = c0514l;
                return c2983l;
            default:
                C3860l c3860l = new C3860l();
                c3860l.loadAd = new C7929l();
                c3860l.crashlytics = new C7433l();
                return c3860l;
        }
    }

    @Override // defpackage.InterfaceC12831l
    public final AbstractC2240l yandex() {
        if (this.yandex == null) {
            synchronized (this) {
                try {
                    if (this.yandex == null) {
                        this.yandex = loadAd();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.yandex;
    }
}
