package defpackage;

/* JADX INFO: renamed from: lٌْؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13128l implements InterfaceC10805l {
    public C3537l amazon;
    public final InterfaceC14185l purchase;
    public final /* synthetic */ int yandex;
    public boolean loadAd = false;
    public boolean crashlytics = false;

    public /* synthetic */ C13128l(InterfaceC14185l interfaceC14185l, int i) {
        this.yandex = i;
        this.purchase = interfaceC14185l;
    }

    @Override // defpackage.InterfaceC10805l
    public final InterfaceC10805l crashlytics(boolean z) {
        int i = this.yandex;
        InterfaceC14185l interfaceC14185l = this.purchase;
        switch (i) {
            case 0:
                if (this.loadAd) {
                    throw new C4726l("Cannot encode a second value in the ValueEncoderContext");
                }
                this.loadAd = true;
                ((C2694l) interfaceC14185l).crashlytics(this.amazon, z ? 1 : 0, this.crashlytics);
                return this;
            case 1:
                if (this.loadAd) {
                    throw new C4726l("Cannot encode a second value in the ValueEncoderContext");
                }
                this.loadAd = true;
                ((C4318l) interfaceC14185l).admob(this.amazon, z ? 1 : 0, this.crashlytics);
                return this;
            default:
                if (this.loadAd) {
                    throw new C4726l("Cannot encode a second value in the ValueEncoderContext");
                }
                this.loadAd = true;
                ((C6455l) interfaceC14185l).admob(this.amazon, z ? 1 : 0, this.crashlytics);
                return this;
        }
    }

    @Override // defpackage.InterfaceC10805l
    public final InterfaceC10805l loadAd(String str) {
        int i = this.yandex;
        InterfaceC14185l interfaceC14185l = this.purchase;
        switch (i) {
            case 0:
                if (this.loadAd) {
                    throw new C4726l("Cannot encode a second value in the ValueEncoderContext");
                }
                this.loadAd = true;
                ((C2694l) interfaceC14185l).subs(this.amazon, str, this.crashlytics);
                return this;
            case 1:
                if (this.loadAd) {
                    throw new C4726l("Cannot encode a second value in the ValueEncoderContext");
                }
                this.loadAd = true;
                ((C4318l) interfaceC14185l).crashlytics(this.amazon, str, this.crashlytics);
                return this;
            default:
                if (this.loadAd) {
                    throw new C4726l("Cannot encode a second value in the ValueEncoderContext");
                }
                this.loadAd = true;
                ((C6455l) interfaceC14185l).crashlytics(this.amazon, str, this.crashlytics);
                return this;
        }
    }
}
