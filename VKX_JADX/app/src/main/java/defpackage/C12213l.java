package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lِۣۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12213l extends AbstractC7532l {
    public final C8688l Signature;

    public C12213l(InterfaceC1388l interfaceC1388l) {
        super(3, interfaceC1388l, 2, null);
        this.Signature = new C8688l(new C8241l(21));
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C4426l c4426l = (C4426l) obj;
        c1080l.m788class(c4426l.yandex());
        ((AbstractC7532l) this.Signature.getValue()).subs(c1080l, 2, c4426l.f9014l);
        String str = c4426l.f9015l;
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        AbstractC7532l.startapp.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C4426l(strSmaato, linkedHashMap, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                AbstractC7532l.startapp.getClass();
                strSmaato = c7084l.smaato();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                linkedHashMap.putAll((Map) ((AbstractC7532l) this.Signature.getValue()).crashlytics(c7084l));
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C4426l c4426l = (C4426l) obj;
        int iPurchase = c4426l.yandex().purchase();
        String str = c4426l.f9015l;
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += AbstractC7532l.startapp.firebase(1, str);
        }
        return ((AbstractC7532l) this.Signature.getValue()).firebase(2, c4426l.f9014l) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C4426l c4426l = (C4426l) obj;
        String str = c4426l.f9015l;
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 1, str);
        }
        ((AbstractC7532l) this.Signature.getValue()).admob(c13161l, 2, c4426l.f9014l);
        c13161l.m3586switch(c4426l.yandex());
    }
}
