package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَؘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10680l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14476l f21685l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21686l;

    public /* synthetic */ C10680l(C14476l c14476l, int i) {
        this.f21686l = i;
        this.f21685l = c14476l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        String str;
        int i = this.f21686l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        Set<Map.Entry> setEntrySet = null;
        strAdvert = null;
        String strAdvert = null;
        C14476l c14476l = this.f21685l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lMopub = AbstractC0080l.mopub(c4346l, 0.0f, 400.0f, 1);
                    boolean zAdmob = c6956l.admob(c14476l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C17015l(11, c14476l);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 6, 510);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C18508l c18508l = c14476l.f28344l.f17084l;
                    String strMopub = c18508l != null ? c18508l.f36133l : null;
                    if (strMopub == null) {
                        strMopub = AbstractC12900l.mopub(c6956l2, 1133620377, R.string.close, c6956l2, false);
                    } else {
                        c6956l2.m2123default(1133619726);
                        c6956l2.startapp(false);
                    }
                    AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    Object objM2132native2 = c6956l3.m2132native();
                    if (objM2132native2 == c13863l) {
                        C4426l c4426l = c14476l.f28344l.f17090l;
                        if (c4426l != null && (str = c4426l.f9015l) != null) {
                            Map map = c4426l.f9014l;
                            if (map != null) {
                                obj4 = objM2132native2;
                                setEntrySet = map.entrySet();
                            }
                            if (setEntrySet == null) {
                                setEntrySet = C5746l.f12138l;
                            }
                            strAdvert = str;
                            for (Map.Entry entry : setEntrySet) {
                                strAdvert = AbstractC16648l.advert(strAdvert, AbstractC2812l.tapsense(new StringBuilder("$"), (String) entry.getKey(), '$'), (String) entry.getValue(), false);
                            }
                        }
                        String str2 = strAdvert == null ? "" : strAdvert;
                        c6956l3.m2147try(str2);
                        obj4 = str2;
                    }
                    obj4 = objM2132native2;
                    AbstractC13010l.loadAd((String) obj4, AbstractC3605l.smaato(c4346l, 16.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).loadAd.firebase, c6956l3, 54, 0, 131068);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
