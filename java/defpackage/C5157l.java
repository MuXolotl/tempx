package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؗۛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5157l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10086l f11205l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11206l;

    public /* synthetic */ C5157l(C10086l c10086l, int i) {
        this.f11206l = i;
        this.f11205l = c10086l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11206l;
        C13863l c13863l = C1867l.yandex;
        C10086l c10086l = this.f11205l;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i4 = AbstractC15548l.yandex;
                    C15087l c15087lYandex = AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                    boolean zBilling = c6956l.billing(c10086l);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = new C13932l(8, c10086l);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13319l.yandex(AbstractC5832l.loadAd, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, AbstractC14566l.amazon(-1090819689, new C5157l(c10086l, i3), c6956l), null, AbstractC14566l.amazon(402364629, new C5157l(c10086l, i2), c6956l), c15087lYandex, c6956l, 199686, 404);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c6956l2.m2124else();
                } else if (((Boolean) c10086l.getValue()).booleanValue()) {
                    c6956l2.m2123default(-886730810);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.libtools_merge_playlist_invert_text_on), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2123default(-886592891);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.libtools_merge_playlist_invert_text_off), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    c6956l2.startapp(false);
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) c10086l.getValue()).booleanValue();
                    boolean zBilling2 = c6956l3.billing(c10086l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C0783l(23, c10086l);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) objM2132native2, null, false, null, c6956l3, 0, 124);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
