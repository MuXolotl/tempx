package defpackage;

import java.util.Collections;

/* JADX INFO: renamed from: lٖۛٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16634l extends AbstractC0757l {
    public C16634l(C14700l c14700l) {
        super(new C12744l(c14700l));
    }

    @Override // defpackage.AbstractC0757l
    public final AbstractC18041l yandex(InterfaceC11865l interfaceC11865l) {
        AbstractC18041l abstractC18041lLoadAd;
        C16017l.f31395l.getClass();
        C16017l c16017l = C16017l.f31394l;
        AbstractC16860l abstractC16860lSubs = interfaceC11865l.subs();
        abstractC16860lSubs.getClass();
        InterfaceC17477l interfaceC17477lIsPro = abstractC16860lSubs.isPro(AbstractC3333l.f7087else.subs());
        Object obj = this.yandex;
        AbstractC8154l abstractC8154l = (AbstractC8154l) obj;
        if (abstractC8154l instanceof C4180l) {
            abstractC18041lLoadAd = ((C4180l) obj).yandex;
        } else {
            if (!(abstractC8154l instanceof C12744l)) {
                C18725l.billing();
                return null;
            }
            C14700l c14700l = ((C12744l) obj).yandex;
            C3624l c3624l = c14700l.yandex;
            int i = c14700l.loadAd;
            InterfaceC17477l interfaceC17477lAmazon = AbstractC9033l.amazon(interfaceC11865l, c3624l);
            if (interfaceC17477lAmazon == null) {
                abstractC18041lLoadAd = C8741l.loadAd(EnumC5123l.f11140l, c3624l.toString(), String.valueOf(i));
            } else {
                AbstractC18041l abstractC18041lFirebase = AbstractC12300l.firebase(interfaceC17477lAmazon.ad());
                for (int i2 = 0; i2 < i; i2++) {
                    abstractC18041lFirebase = interfaceC11865l.subs().subs(abstractC18041lFirebase);
                }
                abstractC18041lLoadAd = abstractC18041lFirebase;
            }
        }
        return AbstractC3605l.adcel(c16017l, interfaceC17477lIsPro, Collections.singletonList(new C10636l(abstractC18041lLoadAd)));
    }

    public C16634l(C3624l c3624l, int i) {
        this(new C14700l(c3624l, i));
    }
}
