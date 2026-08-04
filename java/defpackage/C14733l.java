package defpackage;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙٔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14733l implements InterfaceC16588l {
    public final C16413l amazon;
    public final /* synthetic */ int crashlytics;
    public final InterfaceC16588l loadAd;
    public final InterfaceC16588l yandex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14733l(InterfaceC16588l interfaceC16588l, InterfaceC16588l interfaceC16588l2, int i) {
        this(interfaceC16588l, interfaceC16588l2, (byte) 0);
        this.crashlytics = i;
        switch (i) {
            case 1:
                this(interfaceC16588l, interfaceC16588l2, (byte) 0);
                InterfaceC18035l[] interfaceC18035lArr = new InterfaceC18035l[0];
                if (AbstractC12024l.m3315catch("kotlin.Pair")) {
                    C8339l.metrica("Blank serial names are prohibited");
                    throw null;
                }
                C14416l c14416l = new C14416l("kotlin.Pair");
                c14416l.yandex(interfaceC16588l.purchase(), "first");
                c14416l.yandex(interfaceC16588l2.purchase(), "second");
                Unit unit = Unit.INSTANCE;
                this.amazon = new C16413l("kotlin.Pair", C16015l.amazon, c14416l.crashlytics.size(), AbstractC8669l.m2415super(interfaceC18035lArr), c14416l);
                return;
            default:
                C8854l c8854l = new C8854l(interfaceC16588l, interfaceC16588l2, 3);
                this.amazon = AbstractC16814l.amazon("kotlin.collections.Map.Entry", C2861l.amazon, new InterfaceC18035l[0], c8854l);
                return;
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        Object key;
        Object value;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(purchase());
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        InterfaceC16588l interfaceC16588l = this.yandex;
        int i = this.crashlytics;
        switch (i) {
            case 0:
                key = ((Map.Entry) obj).getKey();
                break;
            default:
                key = ((C8195l) obj).f17098l;
                break;
        }
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035lPurchase, 0, interfaceC16588l, key);
        InterfaceC18035l interfaceC18035lPurchase2 = purchase();
        InterfaceC16588l interfaceC16588l2 = this.loadAd;
        switch (i) {
            case 0:
                value = ((Map.Entry) obj).getValue();
                break;
            default:
                value = ((C8195l) obj).f17097l;
                break;
        }
        abstractC4072l.applovin(interfaceC18035lPurchase2, 1, interfaceC16588l2, value);
        abstractC4072l.yandex(purchase());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        Object c7177l;
        Object obj = AbstractC9905l.loadAd;
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035lPurchase);
        Object objAds = obj;
        Object objAds2 = objAds;
        while (true) {
            int iAdmob = interfaceC14988lCrashlytics.admob(purchase());
            if (iAdmob == -1) {
                if (objAds == obj) {
                    C6541l.firebase("Element 'key' is missing");
                    return null;
                }
                if (objAds2 == obj) {
                    C6541l.firebase("Element 'value' is missing");
                    return null;
                }
                switch (this.crashlytics) {
                    case 0:
                        c7177l = new C7177l(objAds, objAds2);
                        break;
                    default:
                        c7177l = new C8195l(objAds, objAds2);
                        break;
                }
                interfaceC14988lCrashlytics.yandex(interfaceC18035lPurchase);
                return c7177l;
            }
            if (iAdmob == 0) {
                objAds = interfaceC14988lCrashlytics.ads(purchase(), 0, this.yandex, null);
            } else {
                if (iAdmob != 1) {
                    C6541l.firebase(AbstractC0653l.vip(iAdmob, "Invalid index: "));
                    return null;
                }
                objAds2 = interfaceC14988lCrashlytics.ads(purchase(), 1, this.loadAd, null);
            }
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        switch (this.crashlytics) {
            case 0:
                break;
        }
        return this.amazon;
    }

    public C14733l(InterfaceC16588l interfaceC16588l, InterfaceC16588l interfaceC16588l2, byte b) {
        this.yandex = interfaceC16588l;
        this.loadAd = interfaceC16588l2;
    }
}
