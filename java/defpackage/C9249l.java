package defpackage;

/* JADX INFO: renamed from: lٍؑؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9249l implements InterfaceC17472l {
    public final InterfaceC17472l crashlytics;
    public final /* synthetic */ int loadAd;

    public C9249l(long j, int i) {
        this.loadAd = i;
        switch (i) {
            case 1:
                this.crashlytics = new C12802l(j, new C8907l(j));
                break;
            default:
                this.crashlytics = new C9249l(j, 1);
                break;
        }
    }

    @Override // defpackage.InterfaceC17472l
    public final C16380l loadAd(C9489l c9489l) {
        int i = this.loadAd;
        InterfaceC17472l interfaceC17472l = this.crashlytics;
        switch (i) {
            case 0:
                if (((C12802l) ((C9249l) interfaceC17472l).crashlytics).loadAd(c9489l).loadAd) {
                    return C16380l.purchase;
                }
                Throwable th = (Throwable) c9489l.crashlytics;
                if (th instanceof C18281l) {
                    AbstractC5088l.crashlytics("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((C18281l) th).f35778l > 0) {
                        return C16380l.billing;
                    }
                }
                return C16380l.amazon;
            default:
                return ((C12802l) interfaceC17472l).loadAd(c9489l);
        }
    }

    @Override // defpackage.InterfaceC17472l
    public final long yandex() {
        switch (this.loadAd) {
            case 0:
                return ((C12802l) ((C9249l) this.crashlytics).crashlytics).loadAd;
            default:
                return ((C12802l) this.crashlytics).loadAd;
        }
    }
}
