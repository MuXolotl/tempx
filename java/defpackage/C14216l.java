package defpackage;

/* JADX INFO: renamed from: lٓ٘۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14216l extends AbstractC11340l implements InterfaceC3703l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C16173l f27809l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public InterfaceC4005l f27810l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f27811l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C6523l f27812l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C17812l f27813l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C4991l f27814l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C0639l f27815l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public C14966l f27816l;

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public static void m3836l(C17812l c17812l, String str, boolean z) {
        if (z) {
            C12983l c12983l = c17812l.purchase;
            C10403l c10403l = c17812l.license;
            if (c12983l == null) {
                int length = str.length();
                c10403l.invoke(new C0639l(AbstractC2296l.loadAd(length, length), 4, str));
            } else {
                C0639l c0639lLoadAd = c17812l.amazon.loadAd(AbstractC14055l.remoteconfig(new C16536l(), new C0597l(str, 1)));
                c12983l.yandex(null, c0639lLoadAd);
                c10403l.invoke(c0639lLoadAd);
            }
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        C3625l c3625l = this.f27815l.yandex;
        InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
        C4707l c4707l = AbstractC0424l.f1551throws;
        InterfaceC13922l[] interfaceC13922lArr2 = AbstractC3668l.yandex;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr2[18];
        interfaceC17593l.amazon(c4707l, c3625l);
        C3625l c3625l2 = this.f27814l.yandex;
        C4707l c4707l2 = AbstractC0424l.f1545package;
        InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr2[19];
        interfaceC17593l.amazon(c4707l2, c3625l2);
        long j = this.f27815l.loadAd;
        C4707l c4707l3 = AbstractC0424l.f1549synchronized;
        int i = 20;
        InterfaceC13922l interfaceC13922l3 = interfaceC13922lArr2[20];
        interfaceC17593l.amazon(c4707l3, new C12814l(j));
        AbstractC3668l.billing(interfaceC17593l, C11485l.f23085l);
        C5828l c5828lRemoteconfig = AbstractC5941l.remoteconfig(this.f27815l.yandex);
        if (c5828lRemoteconfig != null) {
            AbstractC3668l.subs(interfaceC17593l, c5828lRemoteconfig);
        }
        AbstractC3668l.amazon(interfaceC17593l, new C9668l(this, 0));
        int i2 = this.f27816l.amazon;
        if (i2 == 6) {
            InterfaceC6348l.yandex.getClass();
            AbstractC3668l.admob(interfaceC17593l, C2056l.amazon);
        } else if (i2 == 7 || i2 == 8) {
            InterfaceC6348l.yandex.getClass();
            AbstractC3668l.admob(interfaceC17593l, C2056l.crashlytics);
        } else if (i2 == 4) {
            InterfaceC6348l.yandex.getClass();
            AbstractC3668l.admob(interfaceC17593l, C2056l.purchase);
        }
        if (!this.f27811l) {
            AbstractC3668l.yandex(interfaceC17593l);
        }
        boolean z = this.f27811l;
        C4707l c4707l4 = AbstractC0424l.f1541else;
        InterfaceC13922l interfaceC13922l4 = interfaceC13922lArr2[28];
        interfaceC17593l.amazon(c4707l4, Boolean.valueOf(z));
        AbstractC3668l.loadAd(interfaceC17593l, new C9668l(this, 1));
        int i3 = 2;
        if (z) {
            interfaceC17593l.amazon(AbstractC16601l.firebase, new C7629l(null, new C9668l(this, i3)));
            interfaceC17593l.amazon(AbstractC16601l.metrica, new C7629l(null, new C9668l(this, interfaceC17593l)));
        }
        interfaceC17593l.amazon(AbstractC16601l.isPro, new C7629l(null, new C1350l(i, this)));
        AbstractC3668l.purchase(interfaceC17593l, this.f27816l.purchase, new C4331l(this, 6));
        AbstractC3668l.crashlytics(interfaceC17593l, new C4331l(this, 7));
        interfaceC17593l.amazon(AbstractC16601l.crashlytics, new C7629l(null, new C4331l(this, 1)));
        if (!C12814l.amazon(this.f27815l.loadAd)) {
            interfaceC17593l.amazon(AbstractC16601l.adcel, new C7629l(null, new C4331l(this, 2)));
            if (this.f27811l) {
                interfaceC17593l.amazon(AbstractC16601l.ads, new C7629l(null, new C4331l(this, 3)));
            }
        }
        if (this.f27811l) {
            interfaceC17593l.amazon(AbstractC16601l.subscription, new C7629l(null, new C4331l(this, 5)));
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final boolean mo491l() {
        return true;
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }
}
