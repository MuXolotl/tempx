package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؓۜۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2138l implements applovin, InterfaceC12254l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstatic f4778l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4779l;

    public C2138l(Cstatic cstatic) {
        this.f4779l = 2;
        this.f4778l = cstatic;
    }

    public static C4848l yandex(Cstatic cstatic) throws Cthrows {
        C3884l c3884l = new C3884l(cstatic.purchase());
        c3884l.f8024l = -1;
        try {
            return new C4848l(c3884l, 1);
        } catch (IllegalArgumentException e) {
            throw new Cthrows("corrupted stream detected", e, 0);
        }
    }

    @Override // defpackage.applovin
    public final Ccase billing() {
        switch (this.f4779l) {
            case 0:
                try {
                    return new C16472l(this.f4778l.purchase());
                } catch (IOException e) {
                    C8339l.smaato(e.getMessage());
                    return null;
                }
            case 1:
                try {
                    return new C1894l(this.f4778l.purchase(), false);
                } catch (IOException e2) {
                    throw new Celse(e2.getMessage(), e2, 0);
                }
            case 2:
                try {
                    return yandex(this.f4778l);
                } catch (IOException e3) {
                    throw new Celse("unable to get DER object", e3, 0);
                } catch (IllegalArgumentException e4) {
                    throw new Celse("unable to get DER object", e4, 0);
                }
            case 3:
                try {
                    return smaato();
                } catch (IOException e5) {
                    C8339l.smaato(e5.getMessage());
                    return null;
                }
            default:
                try {
                    return smaato();
                } catch (IOException e6) {
                    throw new Celse(e6.getMessage(), e6, 0);
                }
        }
    }

    @Override // defpackage.InterfaceC12254l
    public final Ccase smaato() throws IOException {
        switch (this.f4779l) {
            case 0:
                return new C16472l(this.f4778l.purchase());
            case 1:
                return new C1894l(this.f4778l.purchase(), false);
            case 2:
                return yandex(this.f4778l);
            case 3:
                return AbstractC16315l.yandex(this.f4778l.purchase());
            default:
                appmetrica appmetricaVarPurchase = this.f4778l.purchase();
                C3884l c3884l = AbstractC16315l.yandex;
                if (appmetricaVarPurchase.f489l < 1) {
                    return AbstractC16315l.loadAd;
                }
                C12609l c12609l = new C12609l(appmetricaVarPurchase, false);
                c12609l.f24835l = -1;
                return c12609l;
        }
    }

    public /* synthetic */ C2138l(int i) {
        this.f4779l = i;
    }
}
