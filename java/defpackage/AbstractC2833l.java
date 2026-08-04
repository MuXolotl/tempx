package defpackage;

/* JADX INFO: renamed from: lؔۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2833l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        c1080l.m790default(((InterfaceC16520l) obj).getValue());
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        int iVip = c7084l.vip();
        InterfaceC16520l interfaceC16520lSmaato = smaato(iVip);
        if (interfaceC16520lSmaato != null) {
            return interfaceC16520lSmaato;
        }
        throw new C12016l(iVip, this.yandex);
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        int value = ((InterfaceC16520l) obj).getValue();
        if ((value & (-128)) == 0) {
            return 1;
        }
        if ((value & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & value) == 0) {
            return 3;
        }
        return (value & (-268435456)) == 0 ? 4 : 5;
    }

    @Override // defpackage.AbstractC7532l
    public final Object loadAd(C2881l c2881l) {
        int iRemoteconfig = c2881l.remoteconfig();
        InterfaceC16520l interfaceC16520lSmaato = smaato(iRemoteconfig);
        if (interfaceC16520lSmaato != null) {
            return interfaceC16520lSmaato;
        }
        throw new C12016l(iRemoteconfig, this.yandex);
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        c13161l.m3578class(((InterfaceC16520l) obj).getValue());
    }

    public abstract InterfaceC16520l smaato(int i);
}
