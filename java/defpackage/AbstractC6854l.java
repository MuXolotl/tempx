package defpackage;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: renamed from: lؙۤؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6854l {
    public static final /* synthetic */ int yandex = 0;

    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static final C3013l loadAd(InterfaceC12538l interfaceC12538l) {
        C9226l c9226lLoadAd = AbstractC10540l.loadAd();
        Object objBilling = c9226lLoadAd.loadAd;
        if (objBilling == null || objBilling == C4933l.f10053l) {
            objBilling = C10368l.billing(c9226lLoadAd);
        }
        return new C3013l(objBilling, interfaceC12538l, 4);
    }

    public static final C17516l yandex(InterfaceC9526l interfaceC9526l) {
        C9226l c9226lLoadAd = AbstractC10540l.loadAd();
        Object objBilling = c9226lLoadAd.loadAd;
        if (objBilling == null || objBilling == C4933l.f10053l) {
            objBilling = C10368l.billing(c9226lLoadAd);
        }
        return new C17516l(objBilling, interfaceC9526l, 8);
    }
}
