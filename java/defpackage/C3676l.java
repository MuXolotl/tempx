package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lّؕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3676l extends AbstractC7532l {
    public final C8688l Signature;

    public C3676l(InterfaceC1388l interfaceC1388l) {
        super(3, interfaceC1388l, 2, null);
        this.Signature = new C8688l(new C15687l(1));
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C13939l c13939l = (C13939l) obj;
        c1080l.m788class(c13939l.yandex());
        ((AbstractC7532l) this.Signature.getValue()).subs(c1080l, 4, c13939l.f27227l);
        C8275l c8275l = C7968l.f16614l;
        c8275l.subs(c1080l, 3, c13939l.f27230l);
        c8275l.subs(c1080l, 2, c13939l.f27228l);
        c8275l.subs(c1080l, 1, c13939l.f27229l);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        Object objCrashlytics2 = null;
        Object objCrashlytics3 = null;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C13939l((C7968l) objCrashlytics, (C7968l) objCrashlytics2, (C7968l) objCrashlytics3, linkedHashMap, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                objCrashlytics = C7968l.f16614l.crashlytics(c7084l);
            } else if (iMopub == 2) {
                objCrashlytics2 = C7968l.f16614l.crashlytics(c7084l);
            } else if (iMopub == 3) {
                objCrashlytics3 = C7968l.f16614l.crashlytics(c7084l);
            } else if (iMopub != 4) {
                c7084l.remoteconfig(iMopub);
            } else {
                linkedHashMap.putAll((Map) ((AbstractC7532l) this.Signature.getValue()).crashlytics(c7084l));
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C13939l c13939l = (C13939l) obj;
        int iPurchase = c13939l.yandex().purchase();
        C8275l c8275l = C7968l.f16614l;
        return ((AbstractC7532l) this.Signature.getValue()).firebase(4, c13939l.f27227l) + c8275l.firebase(3, c13939l.f27230l) + c8275l.firebase(2, c13939l.f27228l) + c8275l.firebase(1, c13939l.f27229l) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C13939l c13939l = (C13939l) obj;
        C8275l c8275l = C7968l.f16614l;
        c8275l.admob(c13161l, 1, c13939l.f27229l);
        c8275l.admob(c13161l, 2, c13939l.f27228l);
        c8275l.admob(c13161l, 3, c13939l.f27230l);
        ((AbstractC7532l) this.Signature.getValue()).admob(c13161l, 4, c13939l.f27227l);
        c13161l.m3586switch(c13939l.yandex());
    }
}
