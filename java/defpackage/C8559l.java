package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٌؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8559l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C13849l f17644l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f17645l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ List f17646l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C2391l f17647l;

    public C8559l(List list, boolean z, C13849l c13849l, C2391l c2391l) {
        this.f17646l = list;
        this.f17645l = z;
        this.f17644l = c13849l;
        this.f17647l = c2391l;
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
            C6393l c6393l = (C6393l) this.f17646l.get(iIntValue);
            c6956l.m2123default(-1628279854);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            C13849l c13849l = this.f17644l;
            boolean zAdmob = c6956l.admob(c13849l);
            C2391l c2391l = this.f17647l;
            boolean zAdmob2 = zAdmob | c6956l.admob(c2391l) | c6956l.admob(c6393l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob2 || objM2132native == C1867l.yandex) {
                objM2132native = new C17749l(c13849l, c2391l, c6393l, 1);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-1243656430, new C2907l(c6393l, 0), c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, this.f17645l, null, (Function0) objM2132native, 14), null, AbstractC14566l.amazon(1818030421, new C2907l(c6393l, 1), c6956l), null, AbstractC14566l.amazon(-1867468073, new C2907l(c6393l, 2), c6956l), null, c6956l, 199686, 468);
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
