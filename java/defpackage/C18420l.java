package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* JADX INFO: renamed from: lٚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18420l extends AbstractC2697l {
    public final RunnableC9543l tapsense(String str) {
        boolean z;
        InterfaceC14094l interfaceC14094lMo767static;
        AbstractC15076l abstractC15076l = C13185l.purchase;
        C9226l c9226lLoadAd = AbstractC10540l.loadAd();
        InterfaceC14094l interfaceC14094l = c9226lLoadAd.loadAd;
        int i = 1;
        if (interfaceC14094l == C4933l.f10053l) {
            interfaceC14094l = null;
            AbstractC10540l.yandex(c9226lLoadAd, null);
            z = true;
        } else {
            z = false;
        }
        if (interfaceC14094l == null) {
            UUID uuidLoadAd = C9019l.crashlytics.loadAd();
            String strYandex = AbstractC17970l.yandex(uuidLoadAd);
            C10756l c10756l = C10368l.f21167l;
            AbstractC8481l abstractC8481l = (AbstractC8481l) AbstractC10540l.yandex.get();
            if (!abstractC8481l.isEmpty()) {
                Iterable$EL.forEach(abstractC8481l, new C17620l(i));
            }
            interfaceC14094lMo767static = new C0998l(uuidLoadAd, strYandex, str, abstractC15076l, c10756l, c9226lLoadAd);
        } else {
            interfaceC14094lMo767static = interfaceC14094l instanceof InterfaceC18293l ? ((InterfaceC18293l) interfaceC14094l).mo767static(str, abstractC15076l, false, c9226lLoadAd) : interfaceC14094l.mo766l(str, abstractC15076l, c9226lLoadAd);
        }
        AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094lMo767static);
        return new RunnableC9543l(interfaceC14094lMo767static, z);
    }
}
