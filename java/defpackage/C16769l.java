package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٖۥۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16769l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15308l f32778l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32779l;

    public /* synthetic */ C16769l(C15308l c15308l, int i) {
        this.f32779l = i;
        this.f32778l = c15308l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strMopub;
        String strMopub2;
        int i = this.f32779l;
        C15308l c15308l = this.f32778l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                    if (c15308l.admob() > 0) {
                        c6956l.m2123default(-747634571);
                        c6956l.startapp(false);
                        strMopub = c15308l.admob() + "...";
                    } else {
                        strMopub = AbstractC12900l.mopub(c6956l, -747549321, R.string.vkx_hold_on_act, c6956l, false);
                    }
                    AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    if (c15308l.admob() > 0) {
                        c6956l2.m2123default(1087176465);
                        c6956l2.startapp(false);
                        strMopub2 = c15308l.admob() + "...";
                    } else {
                        strMopub2 = AbstractC12900l.mopub(c6956l2, 1087261715, R.string.vkx_hold_on_act, c6956l2, false);
                    }
                    AbstractC13010l.loadAd(strMopub2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
