package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17956l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1026l f34942l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34943l;

    public /* synthetic */ C17956l(C1026l c1026l, int i) {
        this.f34943l = i;
        this.f34942l = c1026l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strMopub;
        int i;
        int i2;
        int i3 = this.f34943l;
        C13863l c13863l = C1867l.yandex;
        C1026l c1026l = this.f34942l;
        switch (i3) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM2132native = c6956l.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = c1026l.f2853l.getLoadAd();
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC0133l.purchase((String) objM2132native, null, 0L, 0L, null, c6956l, 54, 28);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM2132native2 = c6956l2.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = c1026l.f2853l.getCrashlytics();
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC13010l.loadAd((String) objM2132native2, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 6, 24960, 241662);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                c1026l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                c1026l.advert((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    long jAdmob = c1026l.f2852l.admob();
                    if (jAdmob == 0) {
                        i = -987540401;
                        i2 = R.string.library_remove_cache_toggle_not_downloaded;
                    } else if (jAdmob == -1) {
                        i = -987537333;
                        i2 = R.string.library_remove_cache_toggle_processing;
                    } else {
                        if (jAdmob == -2) {
                            i = -987534388;
                            i2 = R.string.library_remove_cache_toggle_unavailable;
                        } else {
                            c6956l3.m2123default(-987531431);
                            c6956l3.startapp(false);
                            strMopub = (String) c1026l.f2854l.getValue();
                        }
                        AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                    }
                    strMopub = AbstractC12900l.mopub(c6956l3, i, i2, c6956l3, false);
                    AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17956l(C1026l c1026l, int i, int i2) {
        this.f34943l = i2;
        this.f34942l = c1026l;
    }
}
