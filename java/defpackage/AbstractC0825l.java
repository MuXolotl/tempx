package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؒؕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0825l {
    public static C14025l admob(int i, String str) {
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return billing().purchase("playlists").purchase(str.concat(".png"));
        }
        if (iInmobi == 1) {
            return billing().purchase("tracks").purchase("audio".concat(str)).purchase("artwork.png");
        }
        if (iInmobi == 2) {
            return billing().purchase("images").purchase("track_" + str + ".png");
        }
        if (iInmobi == 3) {
            return billing().purchase("images").purchase("album_" + str + ".png");
        }
        if (iInmobi == 4) {
            return billing().purchase("images").purchase("playlist_" + str + ".png");
        }
        if (iInmobi != 5) {
            C18725l.billing();
            return null;
        }
        return billing().purchase("images").purchase("podcast_" + str + ".png");
    }

    public static final String amazon(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static C14025l billing() {
        String str = C14025l.f27330l;
        C8688l c8688l = AbstractC0085l.yandex;
        return C6162l.ads(AbstractC8182l.loadAd().loadAd());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object crashlytics(InterfaceC5059l interfaceC5059l, Map map, AbstractC0283l abstractC0283l) {
        C14013l c14013l;
        if (abstractC0283l instanceof C14013l) {
            c14013l = (C14013l) abstractC0283l;
            int i = c14013l.f27322l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14013l.f27322l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14013l = new C14013l(abstractC0283l);
            }
        } else {
            c14013l = new C14013l(abstractC0283l);
        }
        Object objYandex = c14013l.f27320l;
        int i2 = c14013l.f27322l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            if (!interfaceC5059l.firebase()) {
                return interfaceC5059l.isVip(map);
            }
            InterfaceC18672l interfaceC18672lYandex = AbstractC5592l.yandex(interfaceC5059l);
            if (interfaceC18672lYandex == null) {
                C11467l.Signature(interfaceC5059l, "This callable does not support a default call: ");
                return null;
            }
            c14013l.f27321l = interfaceC5059l;
            c14013l.f27322l = 1;
            objYandex = AbstractC7572l.yandex(interfaceC18672lYandex, map, c14013l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5059l = c14013l.f27321l;
            AbstractC2829l.crashlytics(objYandex);
        }
        return (!AbstractC8576l.yandex(interfaceC5059l.smaato().mo1616package(), AbstractC18202l.yandex.loadAd(Unit.class)) || interfaceC5059l.smaato().Signature()) ? objYandex : Unit.INSTANCE;
    }

    public static final Object firebase(Object[] objArr, Function0 function0, C6956l c6956l) {
        return isPro(Arrays.copyOf(objArr, objArr.length), AbstractC17355l.yandex, function0, c6956l, 3456);
    }

    public static final Object isPro(Object[] objArr, InterfaceC10315l interfaceC10315l, Function0 function0, C6956l c6956l, int i) {
        Object[] objArr2;
        InterfaceC10315l interfaceC10315l2;
        Object obj;
        Object objPurchase;
        long j = c6956l.f14595continue;
        AbstractC8576l.loadAd(36);
        String string = Long.toString(j, 36);
        InterfaceC2449l interfaceC2449l = (InterfaceC2449l) c6956l.isPro(AbstractC16780l.yandex);
        Object objM2132native = c6956l.m2132native();
        Object obj2 = C1867l.yandex;
        if (objM2132native == obj2) {
            Object objBilling = (interfaceC2449l == null || (objPurchase = interfaceC2449l.purchase(string)) == null) ? null : interfaceC10315l.billing(objPurchase);
            if (objBilling == null) {
                objBilling = function0.invoke();
            }
            objArr2 = objArr;
            interfaceC10315l2 = interfaceC10315l;
            Object c15543l = new C15543l(interfaceC10315l2, interfaceC2449l, string, objBilling, objArr2);
            c6956l.m2147try(c15543l);
            objM2132native = c15543l;
        } else {
            objArr2 = objArr;
            interfaceC10315l2 = interfaceC10315l;
        }
        C15543l c15543l2 = (C15543l) objM2132native;
        Object objInvoke = Arrays.equals(objArr2, c15543l2.f30379l) ? c15543l2.f30380l : null;
        if (objInvoke == null) {
            objInvoke = function0.invoke();
        }
        boolean zAdmob = c6956l.admob(c15543l2) | ((((i & 112) ^ 48) > 32 && c6956l.admob(interfaceC10315l2)) || (i & 48) == 32) | c6956l.admob(interfaceC2449l) | c6956l.billing(string) | c6956l.admob(objInvoke) | c6956l.admob(objArr2);
        Object objM2132native2 = c6956l.m2132native();
        if (zAdmob || objM2132native2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object c7655l = new C7655l(c15543l2, interfaceC10315l2, interfaceC2449l, string, obj, objArr3, 0);
            c6956l.m2147try(c7655l);
            objM2132native2 = c7655l;
        } else {
            obj = objInvoke;
        }
        AbstractC12311l.billing((Function0) objM2132native2, c6956l);
        return obj;
    }

    public static final boolean loadAd(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = C2580l.f5619l;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iSmaato = AbstractC14055l.smaato(arrayList);
                int i = 0;
                while (i < iSmaato) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    C18666l c18666l = (C18666l) obj2;
                    C18666l c18666l2 = (C18666l) obj;
                    arrayList2.add(new C1187l((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c18666l2.mopub().billing() >> 32)) - Float.intBitsToFloat((int) (c18666l.mopub().billing() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c18666l2.mopub().billing() & 4294967295L)) - Float.intBitsToFloat((int) (c18666l.mopub().billing() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((C1187l) AbstractC16901l.m4231native(list)).yandex;
            } else {
                if (list.isEmpty()) {
                    AbstractC2066l.crashlytics("Empty collection can't be reduced.");
                }
                Object objM4231native = AbstractC16901l.m4231native(list);
                int iSmaato2 = AbstractC14055l.smaato(list);
                if (1 <= iSmaato2) {
                    int i2 = 1;
                    while (true) {
                        objM4231native = new C1187l(C1187l.subs(((C1187l) objM4231native).yandex, ((C1187l) list.get(i2)).yandex));
                        if (i2 == iSmaato2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((C1187l) objM4231native).yandex;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final ArrayList mopub(InterfaceC6902l interfaceC6902l) {
        List parameters = interfaceC6902l.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((AbstractC9707l) obj).premium() == 4) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final AbstractC9707l purchase(InterfaceC5059l interfaceC5059l) {
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        for (Object obj3 : interfaceC5059l.getParameters()) {
            if (((AbstractC9707l) obj3).premium() == 3) {
                if (z) {
                    return (AbstractC9707l) obj;
                }
                z = true;
                obj2 = obj3;
            }
        }
        if (z) {
            obj = obj2;
        }
        return (AbstractC9707l) obj;
    }

    public static final void remoteconfig(C15685l c15685l, C18666l c18666l) {
        AccessibilityNodeInfo accessibilityNodeInfo = c15685l.yandex;
        Object objMopub = c18666l.firebase().f13225l.mopub(AbstractC0424l.billing);
        if (objMopub == null) {
            objMopub = null;
        }
        C11907l c11907l = (C11907l) objMopub;
        if (c11907l != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c11907l.yandex, c11907l.loadAd, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objMopub2 = c18666l.firebase().f13225l.mopub(AbstractC0424l.purchase);
        if ((objMopub2 != null ? objMopub2 : null) != null) {
            List listIsPro = C18666l.isPro(4, c18666l);
            int size = listIsPro.size();
            for (int i = 0; i < size; i++) {
                C18666l c18666l2 = (C18666l) listIsPro.get(i);
                if (c18666l2.firebase().f13225l.crashlytics(AbstractC0424l.f1544native)) {
                    arrayList.add(c18666l2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zLoadAd = loadAd(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zLoadAd ? 1 : arrayList.size(), zLoadAd ? arrayList.size() : 1, false, 0));
    }

    public static final Object smaato(Object[] objArr, InterfaceC10315l interfaceC10315l, Function0 function0, C6956l c6956l, int i) {
        return isPro(Arrays.copyOf(objArr, objArr.length), interfaceC10315l, function0, c6956l, ((i << 3) & 7168) | (i & 112) | 384);
    }

    public static C14025l subs(int i, String str) {
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return billing().purchase("tracks").purchase("audio".concat(str)).purchase("index.m3u8");
        }
        if (iInmobi == 1) {
            return billing().purchase("tracks").purchase("audio".concat(str));
        }
        if (iInmobi == 2) {
            return billing().purchase("tracks").purchase("audio".concat(str)).purchase("audio.mp3");
        }
        if (iInmobi == 3) {
            return billing().purchase("tracks").purchase("audio".concat(str)).purchase("lyrics.json");
        }
        if (iInmobi == 4) {
            return billing().purchase("tracks").purchase("audio".concat(str)).purchase("lyrics.txt");
        }
        C18725l.billing();
        return null;
    }

    public static final void vip(C15685l c15685l, C18666l c18666l) {
        Object objMopub = c18666l.firebase().f13225l.mopub(AbstractC0424l.mopub);
        if (objMopub == null) {
            objMopub = null;
        }
        if (objMopub != null) {
            C18725l.loadAd();
            return;
        }
        C18666l c18666lSmaato = c18666l.smaato();
        if (c18666lSmaato == null) {
            return;
        }
        Object objMopub2 = c18666lSmaato.firebase().f13225l.mopub(AbstractC0424l.purchase);
        if (objMopub2 == null) {
            objMopub2 = null;
        }
        if (objMopub2 != null) {
            Object objMopub3 = c18666lSmaato.firebase().f13225l.mopub(AbstractC0424l.billing);
            C11907l c11907l = (C11907l) (objMopub3 != null ? objMopub3 : null);
            if (c11907l == null || (c11907l.yandex >= 0 && c11907l.loadAd >= 0)) {
                if (c18666l.firebase().f13225l.crashlytics(AbstractC0424l.f1544native)) {
                    ArrayList arrayList = new ArrayList();
                    List listIsPro = C18666l.isPro(4, c18666lSmaato);
                    int size = listIsPro.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        C18666l c18666l2 = (C18666l) listIsPro.get(i2);
                        if (c18666l2.firebase().f13225l.crashlytics(AbstractC0424l.f1544native)) {
                            arrayList.add(c18666l2);
                            if (c18666l2.crashlytics.pro() < c18666l.crashlytics.pro()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zLoadAd = loadAd(arrayList);
                    int i3 = zLoadAd ? 0 : i;
                    int i4 = zLoadAd ? i : 0;
                    Object objMopub4 = c18666l.firebase().f13225l.mopub(AbstractC0424l.f1544native);
                    if (objMopub4 == null) {
                        objMopub4 = Boolean.FALSE;
                    }
                    c15685l.firebase(C10975l.m3010package(((Boolean) objMopub4).booleanValue(), i3, 1, i4, 1));
                }
            }
        }
    }

    public static final void yandex(C6742l c6742l, float f, long j, float f2, float f3, C0404l c0404l, long j2) {
        float fMin = Math.min(c0404l.yandex, c6742l.mo868instanceof(f2));
        float f4 = c0404l.yandex;
        int i = (int) (j >> 32);
        float fIntBitsToFloat = (Float.intBitsToFloat(i) - fMin) - (fMin == f4 ? 0.0f : f4 / 4.0f);
        float fIntBitsToFloat2 = (Float.intBitsToFloat(i) * f) + f3;
        if (fIntBitsToFloat <= fIntBitsToFloat2) {
            fMin = Math.max(0.0f, fMin - (fIntBitsToFloat2 - fIntBitsToFloat));
            fIntBitsToFloat = fIntBitsToFloat2;
        }
        if (fMin > 0.0f) {
            if (c0404l.crashlytics == 1) {
                float f5 = fMin / 2.0f;
                AbstractC9361l.admob(c6742l, j2, f5, (((long) Float.floatToRawIntBits(fIntBitsToFloat + f5)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L), null, 120);
            } else {
                AbstractC9361l.metrica(c6742l, j2, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j & 4294967295L)) - fMin) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMin)) & 4294967295L), 0.0f, null, null, 0, 120);
            }
        }
    }
}
