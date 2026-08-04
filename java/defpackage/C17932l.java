package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lۣ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17932l extends AbstractC8637l {
    public final ArrayList license;

    public C17932l(AbstractC14790l abstractC14790l, C6129l c6129l) {
        super(abstractC14790l, c6129l);
        this.license = AbstractC14055l.metrica(new C2640l(c6129l, -1));
    }

    @Override // defpackage.InterfaceC17739l
    public final InterfaceC0039l crashlytics(InterfaceC18035l interfaceC18035l) {
        this.license.add(new C2640l(new C6129l(), 0));
        return this;
    }

    @Override // defpackage.AbstractC8637l
    /* JADX INFO: renamed from: package */
    public final void mo1862package() {
        ((C2640l) AbstractC16901l.m4214continue(this.license)).loadAd++;
    }

    @Override // defpackage.AbstractC8637l
    /* JADX INFO: renamed from: throws */
    public final C6129l mo1863throws() {
        return ((C2640l) AbstractC16901l.m4214continue(this.license)).yandex;
    }

    @Override // defpackage.InterfaceC0039l
    public final void yandex(InterfaceC18035l interfaceC18035l) {
        long[] jArrBilling;
        C2640l c2640l = (C2640l) AbstractC3984l.isVip(this.license);
        C6129l c6129lMo1863throws = mo1863throws();
        int i = c2640l.loadAd;
        if (this.ads.yandex.amazon && (jArrBilling = AbstractC1295l.billing(interfaceC18035l)) != null) {
            int i2 = 0;
            while (true) {
                if (!(i2 < jArrBilling.length)) {
                    break;
                }
                if (i2 >= jArrBilling.length) {
                    C1759l.firebase(String.valueOf(i2));
                    return;
                } else {
                    AbstractC18323l.loadAd(c6129lMo1863throws, new C10882l(jArrBilling[i2]).f21996l, 192);
                    i2++;
                }
            }
        }
        if (AbstractC1295l.admob(interfaceC18035l)) {
            AbstractC18323l.loadAd(c6129lMo1863throws, i, 128);
        } else {
            AbstractC2021l abstractC2021lBilling = interfaceC18035l.billing();
            if (AbstractC8576l.yandex(abstractC2021lBilling, C9164l.amazon) || (abstractC2021lBilling instanceof C0196l)) {
                AbstractC18323l.loadAd(c6129lMo1863throws, i, 128);
            } else if (abstractC2021lBilling instanceof C2861l) {
                AbstractC18323l.loadAd(c6129lMo1863throws, i / 2, 160);
            } else {
                AbstractC18323l.loadAd(c6129lMo1863throws, i, 160);
            }
        }
        C6129l c6129l = c2640l.yandex;
        C6129l.subs(c6129lMo1863throws, c6129l.yandex, c6129l.loadAd, 2);
    }
}
