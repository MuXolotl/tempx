package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4838l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13264l f9880l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9881l;

    public /* synthetic */ C4838l(AbstractC13264l abstractC13264l, int i) {
        this.f9881l = i;
        this.f9880l = abstractC13264l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iSmaato;
        int iAdmob;
        int i = this.f9881l;
        AbstractC13264l abstractC13264l = this.f9880l;
        switch (i) {
            case 0:
                iSmaato = abstractC13264l.smaato();
                break;
            case 1:
                iSmaato = abstractC13264l.smaato();
                break;
            case 2:
                iSmaato = abstractC13264l.metrica();
                break;
            case 3:
                return Integer.valueOf(abstractC13264l.firebase.yandex() ? abstractC13264l.ads.admob() : ((C15308l) abstractC13264l.amazon.f32506l).admob());
            case 4:
                C15308l c15308l = abstractC13264l.adcel;
                boolean zYandex = abstractC13264l.firebase.yandex();
                C16557l c16557l = abstractC13264l.amazon;
                if (!zYandex) {
                    iAdmob = ((C15308l) c16557l.f32506l).admob();
                } else if (c15308l.admob() != -1) {
                    iAdmob = c15308l.admob();
                } else {
                    float fAbs = Math.abs(((C13765l) c16557l.f32505l).admob());
                    InterfaceC13490l interfaceC13490l = abstractC13264l.vip;
                    C6157l c6157l = AbstractC10521l.yandex;
                    if (fAbs >= Math.abs(Math.min(interfaceC13490l.mo868instanceof(56.0f), abstractC13264l.remoteconfig() / 2.0f) / abstractC13264l.remoteconfig())) {
                        boolean zBooleanValue = ((Boolean) abstractC13264l.inmobi.getValue()).booleanValue();
                        int i2 = abstractC13264l.purchase;
                        iAdmob = zBooleanValue ? i2 + 1 : i2;
                    } else {
                        iAdmob = ((C15308l) c16557l.f32506l).admob();
                    }
                }
                iSmaato = abstractC13264l.isPro(iAdmob);
                break;
            default:
                iSmaato = abstractC13264l.smaato();
                break;
        }
        return Integer.valueOf(iSmaato);
    }
}
