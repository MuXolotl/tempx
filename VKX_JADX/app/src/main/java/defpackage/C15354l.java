package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٕؐؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15354l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f30019l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13157l f30020l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ List f30021l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f30022l;

    public C15354l(List list, C13157l c13157l, long j, InterfaceC8714l interfaceC8714l) {
        this.f30021l = list;
        this.f30020l = c13157l;
        this.f30019l = j;
        this.f30022l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C7091l c7091l = (C7091l) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6956l c6956l = (C6956l) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (c6956l.billing(c7091l) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= c6956l.amazon(iIntValue) ? 32 : 16;
        }
        if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
            C9872l c9872l = (C9872l) this.f30021l.get(iIntValue);
            c6956l.m2123default(-819231196);
            boolean zBooleanValue = ((Boolean) c9872l.purchase.invoke((C3597l) this.f30022l.getValue())).booleanValue();
            int i2 = c9872l.yandex;
            int i3 = c9872l.loadAd;
            int i4 = c9872l.crashlytics;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2), 1.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC4927l.amazon(AbstractC9151l.loadAd(AbstractC0019l.crashlytics(interfaceC17242lAmazon, ((C14370l) c6956l.isPro(c10707l)).crashlytics.amazon), false, null, c9872l.amazon, 15), ((C14370l) c6956l.isPro(c10707l)).yandex.ads, AbstractC16837l.yandex);
            long j = this.f30019l;
            boolean zPurchase = c6956l.purchase(j) | c6956l.mopub(zBooleanValue);
            Object objM2132native = c6956l.m2132native();
            if (zPurchase || objM2132native == C1867l.yandex) {
                objM2132native = new C2532l(j, zBooleanValue);
                c6956l.m2147try(objM2132native);
            }
            this.f30020l.m3571abstract(i2, i3, i4, zBooleanValue, AbstractC14289l.firebase(interfaceC17242lAmazon2, (Function1) objM2132native), c6956l, 0);
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
