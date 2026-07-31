package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lُٙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11133l extends AbstractC17645l {
    public final InterfaceC16588l yandex;

    public AbstractC11133l(InterfaceC16588l interfaceC16588l) {
        this.yandex = interfaceC16588l;
    }

    @Override // defpackage.InterfaceC16588l
    public void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        int iSubs = subs(obj);
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        InterfaceC0039l interfaceC0039lTapsense = interfaceC17739l.tapsense(interfaceC18035lPurchase, iSubs);
        Iterator itAdmob = admob(obj);
        for (int i = 0; i < iSubs; i++) {
            ((AbstractC4072l) interfaceC0039lTapsense).applovin(purchase(), i, this.yandex, itAdmob.next());
        }
        interfaceC0039lTapsense.yandex(interfaceC18035lPurchase);
    }

    @Override // defpackage.AbstractC17645l
    public void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        vip(i, obj, interfaceC14988l.ads(purchase(), i, this.yandex, null));
    }

    public abstract void vip(int i, Object obj, Object obj2);
}
