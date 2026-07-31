package defpackage;

import android.graphics.RectF;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.OpenSSLProvider;

/* JADX INFO: renamed from: lًٕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC15560l {
    public static String Signature(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object ad(InterfaceC9955l interfaceC9955l, C11310l c11310l, AbstractC0283l abstractC0283l) throws C14504l {
        C8944l c8944l;
        if (abstractC0283l instanceof C8944l) {
            c8944l = (C8944l) abstractC0283l;
            int i = c8944l.f18420l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8944l.f18420l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8944l = new C8944l(interfaceC9955l, abstractC0283l);
            }
        } else {
            c8944l = new C8944l(interfaceC9955l, abstractC0283l);
        }
        Object objLoadAd = c8944l.f18421l;
        int i2 = c8944l.f18420l;
        C11643l c11643l = C11643l.yandex;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            C17535l attributes = interfaceC9955l.getAttributes();
            C11911l c11911l = AbstractC3248l.loadAd;
            Object objStartapp = (C11643l) attributes.billing(c11911l);
            if (objStartapp == null) {
                interfaceC9955l.getAttributes().mopub(c11911l, c11643l);
            }
            C11911l c11911l2 = AbstractC11626l.yandex;
            interfaceC9955l.getAttributes().mopub(AbstractC11626l.yandex, c11310l);
            if (objStartapp == null) {
                objStartapp = interfaceC9955l.billing().startapp();
            }
            C8403l c8403lAd = interfaceC9955l.billing().ad();
            c8944l.f18422l = c11310l;
            c8944l.f18420l = 1;
            objLoadAd = c8403lAd.loadAd(interfaceC9955l, objStartapp, c8944l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c11310l = c8944l.f18422l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        if (AbstractC8576l.yandex(objLoadAd, C6130l.yandex)) {
            return null;
        }
        if (objLoadAd == c11643l) {
            throw new C17072l("Request body has already been consumed (received).", 8);
        }
        if (c11310l.yandex.mo886strictfp(objLoadAd)) {
            return objLoadAd;
        }
        throw new C14504l(c11310l.loadAd);
    }

    public static ClassCastException adcel(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static InterfaceC17242l admob(InterfaceC17242l interfaceC17242l, InterfaceC17242l interfaceC17242l2) {
        return interfaceC17242l2 == C4346l.f8873l ? interfaceC17242l : new C9839l(interfaceC17242l, interfaceC17242l2);
    }

    public static String ads(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ String advert(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static int amazon(InterfaceC5344l interfaceC5344l, InterfaceC12822l interfaceC12822l, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            List list = (List) arrayList.get(i3);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(new C11030l((InterfaceC6357l) list.get(i4), 2, 1, i2));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC5344l.loadAd(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), arrayList2, AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }

    public static int billing(InterfaceC5344l interfaceC5344l, InterfaceC12822l interfaceC12822l, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            List list = (List) arrayList.get(i3);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                int i5 = 1;
                arrayList3.add(new C11030l((InterfaceC6357l) list.get(i4), i5, i5, i2));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC5344l.loadAd(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), arrayList2, AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }

    public static int crashlytics(InterfaceC5344l interfaceC5344l, InterfaceC12822l interfaceC12822l, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            List list = (List) arrayList.get(i3);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                int i5 = 2;
                arrayList3.add(new C11030l((InterfaceC6357l) list.get(i4), i5, i5, i2));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC5344l.loadAd(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), arrayList2, AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    public static void firebase(C9902l c9902l, C3903l c3903l) {
        if (c9902l.loadAd == null) {
            c9902l.loadAd = new RectF();
        }
        RectF rectF = c9902l.loadAd;
        float f = c3903l.yandex;
        long j = c3903l.admob;
        long j2 = c3903l.mopub;
        long j3 = c3903l.billing;
        long j4 = c3903l.purchase;
        rectF.set(f, c3903l.loadAd, c3903l.crashlytics, c3903l.amazon);
        if (c9902l.crashlytics == null) {
            c9902l.crashlytics = new float[8];
        }
        float[] fArr = c9902l.crashlytics;
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        c9902l.yandex.addRoundRect(c9902l.loadAd, c9902l.crashlytics, AbstractC3478l.loadAd(1));
    }

    public static void isPro(C9902l c9902l, C8896l c8896l) {
        c9902l.getClass();
        float f = c8896l.yandex;
        float f2 = c8896l.amazon;
        float f3 = c8896l.crashlytics;
        float f4 = c8896l.loadAd;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            AbstractC3478l.crashlytics("Invalid rectangle, make sure no value is NaN");
        }
        if (c9902l.loadAd == null) {
            c9902l.loadAd = new RectF();
        }
        c9902l.loadAd.set(f, f4, f3, f2);
        c9902l.yandex.addRect(c9902l.loadAd, AbstractC3478l.loadAd(1));
    }

    public static /* synthetic */ String isVip(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "INEXACT";
        }
        return "EXACT";
    }

    public static StringBuilder license(OpenSSLProvider openSSLProvider, String str, String str2, String str3, String str4) {
        openSSLProvider.put(str, str2);
        openSSLProvider.put(str3, str4);
        return new StringBuilder();
    }

    public static C12059l loadAd(int i, int i2, C3956l c3956l, C3006l c3006l, C16441l c16441l, InterfaceC7448l interfaceC7448l, Map map) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC0081l.crashlytics("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C12059l(i, i2, c3956l, c3006l, c16441l, interfaceC7448l, map);
    }

    public static int metrica(LinkedHashMap linkedHashMap, int i, int i2) {
        return (linkedHashMap.hashCode() + i) * i2;
    }

    public static Object mopub(InterfaceC9955l interfaceC9955l, Object obj, C11310l c11310l, AbstractC0283l abstractC0283l) {
        interfaceC9955l.adcel().crashlytics().getAttributes().mopub(AbstractC17961l.yandex, c11310l);
        C8403l c8403lFirebase = interfaceC9955l.adcel().firebase();
        if (obj == null) {
            obj = C6130l.yandex;
        }
        Object objLoadAd = c8403lFirebase.loadAd(interfaceC9955l, obj, abstractC0283l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    public static void pro(StringBuilder sb, String str, String str2, OpenSSLProvider openSSLProvider, String str3) {
        sb.append(str);
        sb.append(str2);
        openSSLProvider.put(str3, sb.toString());
    }

    public static int purchase(InterfaceC5344l interfaceC5344l, InterfaceC12822l interfaceC12822l, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            List list = (List) arrayList.get(i3);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(new C11030l((InterfaceC6357l) list.get(i4), 1, 2, i2));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC5344l.loadAd(new C9709l(interfaceC12822l, interfaceC12822l.getLayoutDirection()), arrayList2, AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    public static int remoteconfig(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static /* synthetic */ String smaato(int i) {
        switch (i) {
            case 1:
                return "default media data must be auto selected";
            case 2:
                return "bad format found for an EXT tag";
            case 3:
                return "CHANNELS is empty";
            case 4:
                return "CHARACTERISTICS is empty";
            case 5:
                return "GROUP-ID is empty";
            case 6:
                return "NAME is empty";
            case 7:
                return "found illegal whitespace";
            case 8:
                return "there was an unrecoverable problem";
            case 9:
                return "invalid attribute name";
            case 10:
                return "invalid compatibility version";
            case 11:
                return "invalid encryption method";
            case 12:
                return "a hexadecimal string was not properly formatted";
            case 13:
                return "the initialization vector is the wrong size";
            case 14:
                return "invalid KEYFORMATVERSIONS";
            case 15:
                return "invalid media INSTREAM-ID";
            case 16:
                return "invalid media TYPE";
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return "a resolution was not formatted properly";
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return "a quoted string was not properly formatted";
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return "a date-time string was not properly formatted";
            case 20:
                return "a byte range string was not properly formatted";
            case 21:
                return "master playlist tags we found in a media playlist";
            case 22:
                return "media playlist tags we found in a master playlist";
            case 23:
                return "missing the name of an attribute";
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "missing the value of an attribute";
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return "missing the separator in an attribute";
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return "missing the URI for encrypted media segments";
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return "missing the colon after an EXT tag";
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return "missing EXTINF for a track in an extended media playlist";
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return "multiple instances of an attribute name found in an attribute list";
            case 30:
                return "multiple instances of an EXT tag found for which only one is allowed";
            case 31:
                return "only java integers are supported";
            case 32:
                return "only specific values are supported";
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return "only java floats are supported";
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return "the only valid values are YES and NO";
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return "a quoted string was not closed";
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                return "unable to determine playlist type";
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                return "open m3u8 does not support this version";
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return "unsupported ext tag detected";
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return "whitespace was found surrounding a track";
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return "A Media Playlist REQUIRES protocol version 4 or higher";
            default:
                throw null;
        }
    }

    public static Cfor startapp(String str) {
        return new Cfor(str).m194package();
    }

    public static String subscription(Object obj, String str) {
        return str + obj;
    }

    public static String tapsense(String str, int i, String str2) {
        return str + i + str2;
    }

    public static int vip(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [lٌٌؙ, l٘ۗ۠] */
    public static Object yandex(InterfaceC18141l interfaceC18141l, C5138l c5138l) {
        C18289l c18289l;
        AbstractC14971l abstractC14971l = (AbstractC14971l) interfaceC18141l;
        if (!abstractC14971l.f29454l.f29462l) {
            AbstractC0081l.yandex("ModifierLocal accessed from an unattached node");
        }
        if (!abstractC14971l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29454l.f29456l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(interfaceC18141l);
        while (c3654lMetrica != null) {
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 32) != 0) {
                while (abstractC14971l2 != null) {
                    if ((abstractC14971l2.f29450l & 32) != 0) {
                        ?? LoadAd = abstractC14971l2;
                        ?? c17893l = 0;
                        while (LoadAd != 0) {
                            if (LoadAd instanceof InterfaceC18141l) {
                                InterfaceC18141l interfaceC18141l2 = (InterfaceC18141l) LoadAd;
                                if (interfaceC18141l2.mo1499new().crashlytics(c5138l)) {
                                    return interfaceC18141l2.mo1499new().billing(c5138l);
                                }
                            } else if ((LoadAd.f29450l & 32) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                AbstractC14971l abstractC14971l3 = ((AbstractC11340l) LoadAd).f22875l;
                                int i = 0;
                                LoadAd = LoadAd;
                                c17893l = c17893l;
                                while (abstractC14971l3 != null) {
                                    if ((abstractC14971l3.f29450l & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            c17893l = c17893l;
                                            LoadAd = abstractC14971l3;
                                        } else {
                                            if (c17893l == 0) {
                                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (LoadAd != 0) {
                                                c17893l.crashlytics(LoadAd);
                                                LoadAd = 0;
                                            }
                                            c17893l.crashlytics(abstractC14971l3);
                                        }
                                    }
                                    abstractC14971l3 = abstractC14971l3.f29460l;
                                    LoadAd = LoadAd;
                                    c17893l = c17893l;
                                }
                                if (i == 1) {
                                }
                            }
                            LoadAd = AbstractC5573l.loadAd(c17893l);
                        }
                    }
                    abstractC14971l2 = abstractC14971l2.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l2 = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
        return ((Function0) c5138l.f11181l).invoke();
    }
}
