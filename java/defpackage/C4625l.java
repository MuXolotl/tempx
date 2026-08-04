package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4625l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4456l f9399l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9400l;

    public /* synthetic */ C4625l(C4456l c4456l, int i) {
        this.f9400l = i;
        this.f9399l = c4456l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue;
        String strMopub;
        int i;
        int i2;
        int i3 = this.f9400l;
        C4456l c4456l = this.f9399l;
        switch (i3) {
            case 0:
                C10086l c10086l = c4456l.f9067l;
                C6956l c6956l = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l.m2127for(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) c10086l.getValue()).booleanValue();
                    InterfaceC13508l interfaceC13508l = c4456l.f9075l;
                    boolean zMopub = c6956l.mopub(zBooleanValue);
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zMopub || objM2132native == c13863l) {
                        Integer numLoadAd = interfaceC13508l.loadAd();
                        if (numLoadAd != null) {
                            iIntValue = numLoadAd.intValue();
                        } else {
                            boolean zYandex = interfaceC13508l.yandex();
                            boolean zBooleanValue2 = ((Boolean) c10086l.getValue()).booleanValue();
                            if (zYandex) {
                                iIntValue = zBooleanValue2 ? R.drawable.ic_like_36 : R.drawable.ic_check;
                            } else {
                                iIntValue = zBooleanValue2 ? R.drawable.ic_like_outline_36 : R.drawable.ic_add;
                            }
                        }
                        objM2132native = Integer.valueOf(iIntValue);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(((Number) objM2132native).intValue(), 0, c6956l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = Integer.valueOf(interfaceC13508l.yandex() ? R.string.action_audio_remove : R.string.action_audio_add);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, AbstractC11999l.purchase(c6956l, ((Number) objM2132native2).intValue()), null, 0L, c6956l, 8, 12);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c4456l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                c4456l.appmetrica((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    long jAdmob = c4456l.f9066l.admob();
                    if (jAdmob == 0) {
                        i = 770555461;
                        i2 = R.string.library_remove_cache_toggle_not_downloaded;
                    } else if (jAdmob == -1) {
                        i = 770558785;
                        i2 = R.string.library_remove_cache_toggle_processing;
                    } else {
                        if (jAdmob == -2) {
                            i = 770561986;
                            i2 = R.string.library_remove_cache_toggle_unavailable;
                        } else {
                            c6956l2.m2123default(770565199);
                            c6956l2.startapp(false);
                            strMopub = (String) c4456l.f9072l.getValue();
                        }
                        AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    }
                    strMopub = AbstractC12900l.mopub(c6956l2, i, i2, c6956l2, false);
                    AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4625l(C4456l c4456l, int i, int i2) {
        this.f9400l = i2;
        this.f9399l = c4456l;
    }
}
