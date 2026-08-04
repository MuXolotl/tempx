package defpackage;

/* JADX INFO: renamed from: lَؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14739l implements InterfaceC15984l {
    public boolean loadAd;
    public InterfaceC10408l yandex;

    public final void loadAd() {
        AbstractC5641l.purchase("SourceStreamRequirementObserver can be closed from main thread only", AbstractC12225l.purchase());
        AbstractC5088l.yandex("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.loadAd);
        InterfaceC10408l interfaceC10408l = this.yandex;
        if (interfaceC10408l == null) {
            AbstractC5088l.yandex("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            return;
        }
        if (this.loadAd) {
            this.loadAd = false;
            if (interfaceC10408l != null) {
                interfaceC10408l.crashlytics();
            } else {
                AbstractC5088l.yandex("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            }
        }
        this.yandex = null;
    }

    @Override // defpackage.InterfaceC15984l
    public final void onError(Throwable th) {
        AbstractC5088l.Signature("VideoCapture", "SourceStreamRequirementObserver#onError", th);
    }

    @Override // defpackage.InterfaceC15984l
    public final void yandex(Object obj) {
        AbstractC5641l.purchase("SourceStreamRequirementObserver can be updated from main thread only", AbstractC12225l.purchase());
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.loadAd == zEquals) {
            return;
        }
        this.loadAd = zEquals;
        InterfaceC10408l interfaceC10408l = this.yandex;
        if (interfaceC10408l == null) {
            AbstractC5088l.yandex("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
        } else if (zEquals) {
            interfaceC10408l.remoteconfig();
        } else {
            interfaceC10408l.crashlytics();
        }
    }
}
