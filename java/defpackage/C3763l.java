package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2ReplacementOption;

/* JADX INFO: renamed from: lؕۥٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3763l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f7844l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f7845l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7846l = 0;

    public /* synthetic */ C3763l(List list, Function1 function1) {
        this.f7845l = list;
        this.f7844l = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7846l;
        Function1 function1 = this.f7844l;
        List<Catalog2ReplacementOption> list = this.f7845l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (Catalog2ReplacementOption catalog2ReplacementOption : list) {
                        Integer num = catalog2ReplacementOption.amazon;
                        boolean z = num != null && num.intValue() == 1;
                        boolean zBilling = c6956l.billing(catalog2ReplacementOption) | c6956l.billing(function1);
                        Object objM2132native = c6956l.m2132native();
                        if (zBilling || objM2132native == C1867l.yandex) {
                            objM2132native = new C8652l(catalog2ReplacementOption, function1, 26);
                            c6956l.m2147try(objM2132native);
                        }
                        C15578l c15578lAmazon = AbstractC14566l.amazon(1091708555, new C1645l(18, catalog2ReplacementOption), c6956l);
                        C10707l c10707l = AbstractC16964l.yandex;
                        AbstractC12853l.loadAd(z, (Function0) objM2132native, null, false, c15578lAmazon, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c6956l, 24576);
                    }
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC17834l.yandex(list, function1, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3763l(List list, Function1 function1, int i) {
        this.f7845l = list;
        this.f7844l = function1;
    }
}
