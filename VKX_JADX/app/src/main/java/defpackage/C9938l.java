package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍۥۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9938l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12885l f20230l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20231l;

    public /* synthetic */ C9938l(C12885l c12885l, int i) {
        this.f20231l = i;
        this.f20230l = c12885l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.f20231l;
        C12885l c12885l = this.f20230l;
        switch (i2) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iInmobi = AbstractC5020l.inmobi(c12885l.yandex);
                    if (iInmobi == 0) {
                        i = R.string.mixes_v2_by_album;
                    } else if (iInmobi == 1) {
                        i = R.string.mixes_v2_by_playlist;
                    } else if (iInmobi == 2) {
                        i = R.string.mixes_v2_by_track;
                    } else {
                        if (iInmobi != 3) {
                            C18725l.billing();
                            return null;
                        }
                        i = R.string.mixes_v2_by_artist;
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, i), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(c12885l.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
