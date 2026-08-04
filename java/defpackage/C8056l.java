package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* JADX INFO: renamed from: lً٘ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8056l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CustomCatalogBlockItem f16784l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16785l;

    public /* synthetic */ C8056l(CustomCatalogBlockItem customCatalogBlockItem, int i) {
        this.f16785l = i;
        this.f16784l = customCatalogBlockItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16785l;
        CustomCatalogBlockItem customCatalogBlockItem = this.f16784l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC3383l.yandex(AbstractC0080l.isPro(C4346l.f8873l, 48.0f), ((C14370l) c6956l.isPro(c10707l)).crashlytics.loadAd, AbstractC13880l.yandex(C9735l.loadAd(0.25f, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex), ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, 0L, 0L, c6956l, 0, 12), null, null, AbstractC14566l.amazon(-23302180, new C1350l(12, customCatalogBlockItem), c6956l), c6956l, 196614, 24);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(customCatalogBlockItem.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC7876l.yandex(null, AbstractC14566l.amazon(1147803484, new C8056l(customCatalogBlockItem, 3), c6956l3), c6956l3, 48, 1);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zAdmob = c6956l4.admob(customCatalogBlockItem);
                    Object objM2132native = c6956l4.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C15541l(customCatalogBlockItem, 1);
                        c6956l4.m2147try(objM2132native);
                    }
                    AbstractC1295l.loadAd(customCatalogBlockItem, (Function0) objM2132native, c6956l4, 0);
                } else {
                    c6956l4.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
