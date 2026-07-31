package defpackage;

import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْؔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2907l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6393l f6316l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6317l;

    public /* synthetic */ C2907l(C6393l c6393l, int i) {
        this.f6317l = i;
        this.f6316l = c6393l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6317l;
        C6393l c6393l = this.f6316l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(c6393l.billing, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    EnumC11113l enumC11113l = c6393l.crashlytics;
                    int i2 = c6393l.amazon;
                    C17383l c17383l = c6393l.yandex;
                    EnumC11113l enumC11113l2 = EnumC11113l.f22321l;
                    C13863l c13863l = C1867l.yandex;
                    if (enumC11113l == enumC11113l2) {
                        c6956l2.m2123default(1406790725);
                        boolean zAmazon = c6956l2.amazon(c17383l.yandex) | c6956l2.amazon(i2);
                        Object objM2132native = c6956l2.m2132native();
                        if (zAmazon || objM2132native == c13863l) {
                            DecimalFormat decimalFormat = C15638l.yandex;
                            objM2132native = AbstractC14205l.amazon(c17383l.yandex - i2, false);
                            c6956l2.m2147try(objM2132native);
                        }
                        AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_left, new Object[]{(String) objM2132native}, c6956l2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(1407119542);
                        boolean zAmazon2 = c6956l2.amazon(c17383l.yandex);
                        Object objM2132native2 = c6956l2.m2132native();
                        if (zAmazon2 || objM2132native2 == c13863l) {
                            DecimalFormat decimalFormat2 = C15638l.yandex;
                            objM2132native2 = AbstractC14205l.amazon(c17383l.yandex, false);
                            c6956l2.m2147try(objM2132native2);
                        }
                        AbstractC13010l.loadAd((String) objM2132native2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                        c6956l2.startapp(false);
                    }
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int iOrdinal = c6393l.crashlytics.ordinal();
                    if (iOrdinal == 0) {
                        c6956l3.m2123default(-1029829194);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l3), null, null, 0L, c6956l3, 56, 12);
                        c6956l3.startapp(false);
                    } else if (iOrdinal == 1) {
                        c6956l3.m2123default(-1029593997);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_timer_24, 0, c6956l3), null, null, 0L, c6956l3, 56, 12);
                        c6956l3.startapp(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw AbstractC12900l.billing(659513282, c6956l3, false);
                        }
                        c6956l3.m2123default(-1029365527);
                        c6956l3.startapp(false);
                    }
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
