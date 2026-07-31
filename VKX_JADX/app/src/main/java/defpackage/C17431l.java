package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٗ۟ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17431l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8188l f33964l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33965l;

    public /* synthetic */ C17431l(C8188l c8188l, int i) {
        this.f33965l = i;
        this.f33964l = c8188l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.f33965l;
        C8188l c8188l = this.f33964l;
        switch (i2) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(c8188l.f17087l, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, 0, 24960, 241662);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C4426l c4426l = c8188l.f17090l;
                    String str = c4426l != null ? c4426l.f9015l : null;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC13010l.loadAd(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 0, 24960, 241662);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int iOrdinal = c8188l.f17089l.ordinal();
                    if (iOrdinal != 0) {
                        i = R.drawable.ic_sync_outline_28;
                        if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                i = R.drawable.ic_newsfeed_outline_28;
                            } else if (iOrdinal == 3) {
                                i = R.drawable.ic_error_outline_28;
                            } else if (iOrdinal == 4) {
                                i = R.drawable.ic_gift_outline_28;
                            } else if (iOrdinal != 5) {
                                C18725l.billing();
                                return null;
                            }
                        }
                    } else {
                        i = R.drawable.ic_mail_outline_28;
                    }
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i, 0, c6956l3), null, null, 0L, c6956l3, 56, 12);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
