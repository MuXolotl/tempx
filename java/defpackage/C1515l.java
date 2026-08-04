package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؒۨٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1515l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10170l f3782l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3783l;

    public /* synthetic */ C1515l(AbstractC10170l abstractC10170l, int i) {
        this.f3783l = i;
        this.f3782l = abstractC10170l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f3783l;
        AbstractC10170l abstractC10170l = this.f3782l;
        switch (i) {
            case 0:
                InterfaceC7637l interfaceC7637lMo2890l = abstractC10170l.mo2890l();
                C6238l c6238l = new C6238l(1, this);
                C14487l c14487l = AbstractC12008l.yandex;
                if (C8741l.purchase(abstractC10170l)) {
                    return C8741l.loadAd(EnumC5123l.f11147l, abstractC10170l.toString());
                }
                InterfaceC1925l interfaceC1925lMetrica = abstractC10170l.metrica();
                if (interfaceC1925lMetrica == null) {
                    AbstractC12008l.yandex(12);
                    throw null;
                }
                if (interfaceC7637lMo2890l == null) {
                    AbstractC12008l.yandex(13);
                    throw null;
                }
                List listAmazon = AbstractC12008l.amazon(interfaceC1925lMetrica.getParameters());
                C16017l.f31395l.getClass();
                return AbstractC3605l.tapsense(C16017l.f31394l, interfaceC1925lMetrica, listAmazon, false, interfaceC7637lMo2890l, c6238l);
            case 1:
                return new C0177l(abstractC10170l.mo2890l());
            default:
                return new C7073l(abstractC10170l);
        }
    }
}
