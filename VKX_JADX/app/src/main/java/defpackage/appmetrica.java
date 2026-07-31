package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class appmetrica implements InterfaceC5174l, InterfaceC10952l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final applovin[] f487l = new applovin[0];

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final int[] f488l = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f489l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f490l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f491l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f492l;

    public appmetrica(int i, int i2) {
        this.f491l = i2;
        switch (i2) {
            case 3:
                this.f490l = false;
                this.f492l = EnumC15797l.f31018l;
                this.f489l = i;
                return;
            default:
                if (i < 0) {
                    C8339l.metrica("'initialCapacity' must not be negative");
                    throw null;
                }
                this.f492l = i == 0 ? f487l : new applovin[i];
                this.f489l = 0;
                this.f490l = false;
                return;
        }
    }

    public static ArrayList Signature(C15154l c15154l) {
        ArrayList arrayList = new ArrayList();
        while (!c15154l.advert()) {
            String str = (String) c15154l.amazon;
            String strSubstring = null;
            if (!c15154l.advert()) {
                int i = c15154l.loadAd;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    c15154l.loadAd = i;
                } else {
                    int iAdmob = c15154l.admob();
                    while (true) {
                        if ((iAdmob < 65 || iAdmob > 90) && (iAdmob < 97 || iAdmob > 122)) {
                            break;
                        }
                        iAdmob = c15154l.admob();
                    }
                    strSubstring = str.substring(i, c15154l.loadAd);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(EnumC15797l.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!c15154l.m3110goto()) {
                break;
            }
        }
        return arrayList;
    }

    public static long admob(int i, byte[] bArr) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + ((long) (bArr[i2 + i] & 255));
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object amazon(appmetrica appmetricaVar, C9166l c9166l, AbstractC12050l abstractC12050l) {
        C14856l c14856l;
        LinkedHashMap linkedHashMap;
        C9166l c9166l2;
        byte bAdmob;
        appmetrica appmetricaVar2;
        AbstractC0576l abstractC0576l;
        AbstractC0576l abstractC0576l2 = (AbstractC0576l) appmetricaVar.f492l;
        if (abstractC12050l instanceof C14856l) {
            c14856l = (C14856l) abstractC12050l;
            int i = c14856l.f29097l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14856l.f29097l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14856l = new C14856l(appmetricaVar, abstractC12050l);
            }
        } else {
            c14856l = new C14856l(appmetricaVar, abstractC12050l);
        }
        Object obj = c14856l.f29095l;
        int i2 = c14856l.f29097l;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = c14856l.f29091l;
            String str = c14856l.f29090l;
            linkedHashMap = c14856l.f29096l;
            appmetricaVar2 = c14856l.f29093l;
            c9166l2 = c14856l.f29094l;
            AbstractC2829l.crashlytics(obj);
            linkedHashMap.put(str, (AbstractC9914l) obj);
            bAdmob = ((AbstractC0576l) appmetricaVar2.f492l).admob();
            if (bAdmob == 4) {
                i3 = i4;
                appmetricaVar = appmetricaVar2;
            } else if (bAdmob != 7) {
                AbstractC0576l.tapsense((AbstractC0576l) appmetricaVar2.f492l, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            abstractC0576l = (AbstractC0576l) appmetricaVar2.f492l;
            if (bAdmob == 6) {
                abstractC0576l.subs((byte) 7);
            } else if (bAdmob == 4) {
                AbstractC2238l.billing(abstractC0576l);
                throw null;
            }
            return new C18010l(linkedHashMap);
        }
        AbstractC2829l.crashlytics(obj);
        byte bSubs = abstractC0576l2.subs((byte) 6);
        if (abstractC0576l2.advert() == 4) {
            AbstractC0576l.tapsense(abstractC0576l2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        c9166l2 = c9166l;
        bAdmob = bSubs;
        AbstractC0576l abstractC0576l3 = (AbstractC0576l) appmetricaVar.f492l;
        if (!abstractC0576l3.purchase()) {
            appmetricaVar2 = appmetricaVar;
            abstractC0576l = (AbstractC0576l) appmetricaVar2.f492l;
            if (bAdmob == 6) {
                abstractC0576l.subs((byte) 7);
            } else if (bAdmob == 4) {
                AbstractC2238l.billing(abstractC0576l);
                throw null;
            }
            return new C18010l(linkedHashMap);
        }
        String strMetrica = appmetricaVar.f490l ? abstractC0576l3.metrica() : abstractC0576l3.remoteconfig();
        abstractC0576l3.subs((byte) 5);
        Unit unit = Unit.INSTANCE;
        c14856l.f29094l = c9166l2;
        c14856l.f29093l = appmetricaVar;
        c14856l.f29096l = linkedHashMap;
        c14856l.f29090l = strMetrica;
        c14856l.f29091l = i3;
        c14856l.f29097l = 1;
        c9166l2.f18861l = c14856l;
        c9166l2.f18862l = unit;
        return EnumC9342l.f19165l;
    }

    public static void billing(int i, ArrayList arrayList) {
        if (AbstractC9966l.firebase(i, 0, 7, f488l) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static boolean m149catch(C12799l c12799l, AbstractC12707l abstractC12707l) {
        ArrayList arrayList;
        String str = c12799l.loadAd;
        if (str != null && !str.equals(abstractC12707l.vip().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<C9641l> arrayList2 = c12799l.crashlytics;
        if (arrayList2 != null) {
            for (C9641l c9641l : arrayList2) {
                String str2 = c9641l.yandex;
                String str3 = c9641l.crashlytics;
                if (str2.equals("id")) {
                    if (!str3.equals(abstractC12707l.crashlytics)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = abstractC12707l.mopub) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = c12799l.amazon;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC7658l) it.next()).yandex(abstractC12707l)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static void m150class(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) j;
            j >>>= 8;
        }
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static void m151continue(long[] jArr, long[] jArr2) {
        if (Arrays.equals(jArr, jArr2 == null ? null : jArr2)) {
            return;
        }
        StringBuilder sb = new StringBuilder("CBOR tags ");
        sb.append(jArr2 != null ? AbstractC16901l.m4210case(new C12339l(jArr2), ", ", "[", "]", null, 56) : null);
        sb.append(" do not match expected tags ");
        sb.append(AbstractC16901l.m4210case(new C12339l(jArr), ", ", "[", "]", null, 56));
        throw new C5016l(sb.toString());
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static boolean m152extends(C2291l c2291l, int i, ArrayList arrayList, int i2, AbstractC12707l abstractC12707l) {
        C12799l c12799l = (C12799l) c2291l.yandex.get(i);
        if (!m149catch(c12799l, abstractC12707l)) {
            return false;
        }
        int i3 = c12799l.yandex;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!m159throw(c2291l, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return m159throw(c2291l, i - 1, arrayList, i2);
        }
        int iRemoteconfig = remoteconfig(arrayList, i2, abstractC12707l);
        if (iRemoteconfig <= 0) {
            return false;
        }
        return m152extends(c2291l, i - 1, arrayList, i2, (AbstractC12707l) abstractC12707l.loadAd.getChildren().get(iRemoteconfig - 1));
    }

    public static void firebase(C6129l c6129l, int i) {
        if (i <= c6129l.yandex.length - c6129l.loadAd) {
            return;
        }
        throw new C5016l("Unexpected EOF, available " + (c6129l.yandex.length - c6129l.loadAd) + " bytes, requested: " + i);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static boolean m153for(C2291l c2291l, AbstractC12707l abstractC12707l) {
        ArrayList arrayList = new ArrayList();
        Object obj = abstractC12707l.loadAd;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((AbstractC15046l) obj).loadAd;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c2291l.yandex;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = c2291l.yandex;
        if (size2 == 1) {
            return m149catch((C12799l) arrayList3.get(0), abstractC12707l);
        }
        return m152extends(c2291l, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC12707l);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static void m154interface(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    public static applovin[] isPro(applovin[] applovinVarArr) {
        return applovinVarArr.length < 1 ? f487l : (applovin[]) applovinVarArr.clone();
    }

    public static int mopub(int i, long j, int i2) {
        if (0 <= j && j <= i2) {
            return (int) j;
        }
        String strAmazon = AbstractC15613l.amazon(i);
        if (j < 0) {
            throw new C5016l("negative length value was decoded for " + strAmazon + ": " + j);
        }
        throw new C5016l("length for " + strAmazon + " is too large: " + j);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static long m155native(long j, long j2) {
        long j3 = j2 & 63;
        return (j >>> ((int) (64 - j3))) | (j << ((int) j3));
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static byte[] m156package(C6129l c6129l, int i) {
        firebase(c6129l, i);
        byte[] bArr = new byte[i];
        if (i < 0 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = c6129l.loadAd;
        byte[] bArr2 = c6129l.yandex;
        if (i2 >= bArr2.length || i == 0) {
            return bArr;
        }
        if (bArr2.length - i2 < i) {
            i = bArr2.length - i2;
        }
        AbstractC8669l.advert(bArr2, 0, i2, bArr, i2 + i);
        c6129l.loadAd += i;
        return bArr;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static int m157private(int i, int i2) {
        int i3 = i2 & 31;
        return (i >>> (32 - i3)) | (i << i3);
    }

    public static int remoteconfig(ArrayList arrayList, int i, AbstractC12707l abstractC12707l) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        InterfaceC0308l interfaceC0308l = abstractC12707l.loadAd;
        if (obj != interfaceC0308l) {
            return -1;
        }
        Iterator it = interfaceC0308l.getChildren().iterator();
        while (it.hasNext()) {
            if (((AbstractC15046l) it.next()) == abstractC12707l) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static void signatures(ArrayList arrayList) {
        int iIntValue;
        for (int iSmaato = AbstractC14055l.smaato(arrayList); -1 < iSmaato && (iIntValue = ((Number) arrayList.get(iSmaato)).intValue()) != -1; iSmaato--) {
            if (iIntValue != 1) {
                arrayList.set(iSmaato, Integer.valueOf(((Number) arrayList.get(iSmaato)).intValue() - 1));
                return;
            }
            ((Number) arrayList.remove(iSmaato)).intValue();
        }
    }

    public static int subs(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static boolean m159throw(C2291l c2291l, int i, ArrayList arrayList, int i2) {
        C12799l c12799l = (C12799l) c2291l.yandex.get(i);
        AbstractC12707l abstractC12707l = (AbstractC12707l) arrayList.get(i2);
        if (!m149catch(c12799l, abstractC12707l)) {
            return false;
        }
        int i3 = c12799l.yandex;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (m159throw(c2291l, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return m159throw(c2291l, i - 1, arrayList, i2 - 1);
        }
        int iRemoteconfig = remoteconfig(arrayList, i2, abstractC12707l);
        if (iRemoteconfig <= 0) {
            return false;
        }
        return m152extends(c2291l, i - 1, arrayList, i2, (AbstractC12707l) abstractC12707l.loadAd.getChildren().get(iRemoteconfig - 1));
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static long m160throws(C6129l c6129l, int i) {
        byte[] bArrM156package = m156package(c6129l, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArrM156package[i2] & 255));
        }
        return j;
    }

    public C3927l ad(C15154l c15154l) {
        C3927l c3927l = new C3927l(0);
        while (!c15154l.advert()) {
            try {
                if (!c15154l.license("<!--") && !c15154l.license("-->")) {
                    if (!c15154l.Signature('@')) {
                        if (!pro(c3927l, c15154l)) {
                            break;
                        }
                    } else {
                        subscription(c3927l, c15154l);
                    }
                }
            } catch (C16485l e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return c3927l;
            }
        }
        return c3927l;
    }

    public String adcel(long[] jArr) {
        isVip(jArr);
        int iAdvert = advert();
        if ((iAdvert & 224) != 96) {
            throw AbstractC14231l.yandex(iAdvert, "start of string");
        }
        String strAds = AbstractC16648l.ads(inmobi());
        appmetrica();
        return strAds;
    }

    public C12823l ads() {
        int i;
        long jM160throws;
        long[] jArrIsVip = isVip(null);
        int iAdvert = advert();
        if ((iAdvert & 224) == 96) {
            String strAds = AbstractC16648l.ads(inmobi());
            appmetrica();
            return new C12823l(strAds, null, jArrIsVip != null ? new C12339l(jArrIsVip) : null);
        }
        int iAdvert2 = advert() & 31;
        if (iAdvert2 <= 23) {
            jM160throws = iAdvert2;
        } else {
            switch (iAdvert2) {
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    i = 1;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    i = 2;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i = 4;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i = 8;
                    break;
                default:
                    C18353l.remoteconfig(iAdvert2, AbstractC15613l.amazon(iAdvert), AbstractC14231l.admob(advert()));
                    return null;
            }
            jM160throws = m160throws((C6129l) this.f492l, i);
        }
        appmetrica();
        return new C12823l(null, Long.valueOf(jM160throws), jArrIsVip != null ? new C12339l(jArrIsVip) : null);
    }

    public int advert() {
        int i = this.f489l;
        if (i != -1) {
            return i;
        }
        throw new C5016l("Unexpected end of encoded CBOR document");
    }

    public C18427l applovin() {
        AbstractC0576l abstractC0576l = (AbstractC0576l) this.f492l;
        byte bAdmob = abstractC0576l.admob();
        if (abstractC0576l.advert() == 4) {
            AbstractC0576l.tapsense(abstractC0576l, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractC0576l.purchase()) {
            arrayList.add(premium());
            bAdmob = abstractC0576l.admob();
            if (bAdmob != 4) {
                boolean z = bAdmob == 9;
                int i = abstractC0576l.f1972l;
                if (!z) {
                    AbstractC0576l.tapsense(abstractC0576l, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bAdmob == 8) {
            abstractC0576l.subs((byte) 9);
        } else if (bAdmob == 4) {
            AbstractC2238l.purchase(abstractC0576l, "array");
            throw null;
        }
        return new C18427l(arrayList);
    }

    public void appmetrica() {
        this.f489l = ((C6129l) this.f492l).loadAd();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public int m162case(long[] jArr, int i, int i2, String str) {
        int i3;
        long jM160throws;
        isVip(jArr);
        int iAdvert = advert();
        if (iAdvert == i) {
            int iAdvert2 = advert();
            if (iAdvert2 != i) {
                throw AbstractC14231l.yandex(iAdvert2, "byte ".concat(AbstractC14231l.admob(i)));
            }
            appmetrica();
            return -1;
        }
        int i4 = iAdvert & 224;
        if (i4 != i2) {
            if (i2 != 128 || i4 != 64) {
                throw AbstractC14231l.yandex(iAdvert, "start of ".concat(str));
            }
            throw new C5016l("Expected a start of array, but found " + AbstractC14231l.admob(iAdvert) + ", which corresponds to the start of a byte string. Make sure you correctly set 'alwaysUseByteString' setting and/or 'kotlinx.serialization.cbor.ByteString' annotation.");
        }
        int i5 = i4 == 160 ? 1073741823 : Alert.DURATION_SHOW_INDEFINITELY;
        int iAdvert3 = advert() & 31;
        if (iAdvert3 <= 23) {
            jM160throws = iAdvert3;
        } else {
            switch (iAdvert3) {
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    i3 = 1;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    i3 = 2;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i3 = 4;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i3 = 8;
                    break;
                default:
                    C18353l.remoteconfig(iAdvert3, str.concat(" length"), AbstractC14231l.admob(advert()));
                    return 0;
            }
            jM160throws = m160throws((C6129l) this.f492l, i3);
        }
        int iMopub = mopub(i4, jM160throws, i5);
        appmetrica();
        return iMopub;
    }

    @Override // defpackage.InterfaceC5174l
    public void crashlytics() {
        if (this.f490l) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f492l;
        actionBarContextView.f120l = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f489l);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public void m163default(int i) {
        Object[] objArr = (Object[]) this.f492l;
        int length = objArr.length;
        if (length >= i) {
            if (this.f490l) {
                this.f492l = (Object[]) objArr.clone();
                this.f490l = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        if (i2 < 0) {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        this.f492l = Arrays.copyOf(objArr, i2);
        this.f490l = false;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public void m164else(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr2[i2] = iArr2[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        int[] iArr3 = new int[(this.f489l + 1) * 2];
        this.f492l = iArr3;
        iArr3[0] = -1209970333;
        int i3 = 1;
        while (true) {
            iArr = (int[]) this.f492l;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = iArr[i3 - 1] - 1640531527;
            i3++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int length3 = 0;
        int iM157private = 0;
        int iM157private2 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            int[] iArr4 = (int[]) this.f492l;
            iM157private = m157private(iArr4[length3] + iM157private + iM157private2, 3);
            iArr4[length3] = iM157private;
            iM157private2 = m157private(iArr2[i4] + iM157private + iM157private2, iM157private2 + iM157private);
            iArr2[i4] = iM157private2;
            length3 = (length3 + 1) % ((int[]) this.f492l).length;
            i4 = (i4 + 1) % length;
        }
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public C2673l m165final() {
        this.f490l = true;
        Object[] objArr = (Object[]) this.f492l;
        int i = this.f489l;
        C0507l c0507l = AbstractC14904l.f29349l;
        return i == 0 ? C2673l.f5806l : new C2673l(i, objArr);
    }

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        switch (this.f491l) {
            case 9:
                return "RC5-32";
            default:
                return "RC5-64";
        }
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        switch (this.f491l) {
            case 9:
                if (interfaceC9719l instanceof C9484l) {
                    C9484l c9484l = (C9484l) interfaceC9719l;
                    this.f489l = c9484l.f19372l;
                    m164else(c9484l.f19373l);
                } else if (!(interfaceC9719l instanceof C13886l)) {
                    C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to RC532 init - ", interfaceC9719l));
                } else {
                    m164else(((C13886l) interfaceC9719l).f27156l);
                }
                this.f490l = z;
                if (interfaceC9719l instanceof EnumC2441l) {
                    C8339l.metrica("params should not be CryptoServicePurpose");
                } else {
                    ((C5911l) AbstractC8776l.purchase.get()).getClass();
                }
                break;
            default:
                if (!(interfaceC9719l instanceof C9484l)) {
                    C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to RC564 init - ", interfaceC9719l));
                } else {
                    C9484l c9484l2 = (C9484l) interfaceC9719l;
                    this.f490l = z;
                    this.f489l = c9484l2.f19372l;
                    byte[] bArr = c9484l2.f19373l;
                    int length = (bArr.length + 7) / 8;
                    long[] jArr = new long[length];
                    int i = 0;
                    for (int i2 = 0; i2 != bArr.length; i2++) {
                        int i3 = i2 / 8;
                        jArr[i3] = jArr[i3] + (((long) (bArr[i2] & 255)) << ((i2 % 8) * 8));
                    }
                    boolean z2 = true;
                    long[] jArr2 = new long[(this.f489l + 1) * 2];
                    this.f492l = jArr2;
                    jArr2[0] = -5196783011329398165L;
                    int i4 = 1;
                    while (true) {
                        long[] jArr3 = (long[]) this.f492l;
                        if (i4 >= jArr3.length) {
                            int length2 = length > jArr3.length ? length * 3 : jArr3.length * 3;
                            long jM155native = 0;
                            long jM155native2 = 0;
                            int length3 = 0;
                            int i5 = 0;
                            while (i < length2) {
                                long[] jArr4 = (long[]) this.f492l;
                                int i6 = length3;
                                jM155native = m155native(jArr4[length3] + jM155native + jM155native2, 3L);
                                jArr4[i6] = jM155native;
                                jM155native2 = m155native(jArr[i5] + jM155native + jM155native2, jM155native2 + jM155native);
                                jArr[i5] = jM155native2;
                                length3 = (i6 + 1) % ((long[]) this.f492l).length;
                                i5 = (i5 + 1) % length;
                                i++;
                                z2 = z2;
                            }
                            if (interfaceC9719l instanceof EnumC2441l) {
                                C8339l.metrica("params should not be CryptoServicePurpose");
                            } else {
                                ((C5911l) AbstractC8776l.purchase.get()).getClass();
                            }
                        } else {
                            jArr3[i4] = jArr3[i4 - 1] - 7046029254386353131L;
                            i4++;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public byte[] inmobi() {
        long jM160throws;
        int i;
        long jM160throws2;
        C6129l c6129l = (C6129l) this.f492l;
        int iAdvert = advert();
        int i2 = 1;
        if ((iAdvert & 31) != 31) {
            int i3 = iAdvert & 224;
            int iAdvert2 = advert() & 31;
            if (iAdvert2 <= 23) {
                jM160throws = iAdvert2;
            } else {
                switch (iAdvert2) {
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        jM160throws = m160throws(c6129l, i2);
                        break;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        i2 = 2;
                        jM160throws = m160throws(c6129l, i2);
                        break;
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        i2 = 4;
                        jM160throws = m160throws(c6129l, i2);
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        i2 = 8;
                        jM160throws = m160throws(c6129l, i2);
                        break;
                    default:
                        C18353l.startapp(AbstractC2812l.Signature("Unexpected value encoding when reading length. Expected addition info value < 28, got ", iAdvert2, " (decoded from "), AbstractC14231l.admob(advert()));
                        return null;
                }
            }
            return m156package(c6129l, mopub(i3, jM160throws, Alert.DURATION_SHOW_INDEFINITELY));
        }
        int i4 = iAdvert & 224;
        appmetrica();
        ArrayList<byte[]> arrayList = new ArrayList();
        do {
            int iAdvert3 = advert();
            if ((iAdvert3 & 224) != i4) {
                throw AbstractC14231l.yandex(iAdvert3, "a header of a chunk with a major type bits matching " + i4);
            }
            if ((iAdvert3 & 31) == 31) {
                throw AbstractC14231l.yandex(iAdvert3, "a fixed-length chunk");
            }
            int iAdvert4 = advert() & 31;
            if (iAdvert4 <= 23) {
                jM160throws2 = iAdvert4;
            } else {
                switch (iAdvert4) {
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        i = 1;
                        break;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        i = 2;
                        break;
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        i = 4;
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        i = 8;
                        break;
                    default:
                        C18353l.startapp(AbstractC2812l.Signature("Unexpected value encoding when reading length of a fixed-length chunk. Expected addition info value < 28, got ", iAdvert4, " (decoded from "), AbstractC14231l.admob(advert()));
                        return null;
                }
                jM160throws2 = m160throws(c6129l, i);
            }
            arrayList.add(m156package(c6129l, mopub(i4, jM160throws2, Alert.DURATION_SHOW_INDEFINITELY)));
            appmetrica();
        } while (advert() != 255);
        int i5 = AbstractC15613l.yandex;
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : arrayList) {
            AbstractC8669l.applovin(bArr2, length2, 0, bArr, 0, 12);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public long[] isVip(long[] jArr) {
        long[] jArr2;
        long jM160throws;
        boolean z = this.f490l;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = 1;
            if ((advert() & 224) != 192) {
                if (arrayList.isEmpty()) {
                    jArr2 = null;
                } else {
                    jArr2 = new long[arrayList.size()];
                    Iterator it = arrayList.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        jArr2[i3] = ((C10882l) it.next()).f21996l;
                        i3++;
                    }
                }
                C12339l c12339l = jArr2 != null ? new C12339l(jArr2) : null;
                long[] jArr3 = c12339l != null ? c12339l.f24434l : null;
                if (jArr != null) {
                    if (z) {
                        m151continue(jArr, jArr3);
                    } else if (arrayList.size() < jArr.length || !AbstractC8576l.yandex(arrayList.subList(0, jArr.length), new C10514l(i2, jArr))) {
                        StringBuilder sb = new StringBuilder("CBOR tags ");
                        sb.append(arrayList);
                        String strAmazon = C12339l.amazon(jArr);
                        sb.append(" do not start with specified tags ");
                        sb.append((Object) strAmazon);
                        throw new C5016l(sb.toString());
                    }
                }
                if (c12339l != null) {
                    return c12339l.f24434l;
                }
                return null;
            }
            int iAdvert = advert() & 31;
            if (iAdvert <= 23) {
                jM160throws = iAdvert;
            } else {
                switch (iAdvert) {
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        jM160throws = m160throws((C6129l) this.f492l, i2);
                        break;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        i2 = 2;
                        jM160throws = m160throws((C6129l) this.f492l, i2);
                        break;
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        i2 = 4;
                        jM160throws = m160throws((C6129l) this.f492l, i2);
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        i2 = 8;
                        jM160throws = m160throws((C6129l) this.f492l, i2);
                        break;
                    default:
                        C18353l.startapp(AbstractC2812l.Signature("Unexpected value encoding when reading tag. Expected addition info value < 28, got ", iAdvert, " (decoded from "), AbstractC14231l.admob(advert()));
                        return null;
                }
            }
            arrayList.add(new C10882l(jM160throws));
            if (z && jArr != null) {
                int i4 = i + 1;
                if (i >= jArr.length) {
                    throw new C5016l(AbstractC14814l.remoteconfig(jArr.length, " tags specified", new StringBuilder("More tags found than the ")));
                }
                i = i4;
            }
            appmetrica();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        switch (this.f491l) {
            case 9:
                return 8;
            default:
                return 16;
        }
    }

    @Override // defpackage.InterfaceC5174l
    public void loadAd() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f490l = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public long metrica(long[] jArr) {
        long jM160throws;
        isVip(jArr);
        int iAdvert = advert();
        int i = iAdvert & 224;
        if (i != 32 && i != 0) {
            throw AbstractC14231l.yandex(iAdvert, "an unsigned or negative integer");
        }
        int i2 = 1;
        boolean z = i == 32;
        int iAdvert2 = advert() & 31;
        if (iAdvert2 <= 23) {
            jM160throws = iAdvert2;
        } else {
            switch (iAdvert2) {
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    jM160throws = m160throws((C6129l) this.f492l, i2);
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    i2 = 2;
                    jM160throws = m160throws((C6129l) this.f492l, i2);
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i2 = 4;
                    jM160throws = m160throws((C6129l) this.f492l, i2);
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i2 = 8;
                    jM160throws = m160throws((C6129l) this.f492l, i2);
                    break;
                default:
                    C18353l.remoteconfig(iAdvert2, AbstractC15613l.amazon(i), AbstractC14231l.admob(advert()));
                    return 0L;
            }
        }
        if (z) {
            jM160throws = -(jM160throws + 1);
        }
        appmetrica();
        return jM160throws;
    }

    public AbstractC9914l premium() {
        AbstractC9914l c18010l;
        Object obj;
        AbstractC0576l abstractC0576l = (AbstractC0576l) this.f492l;
        byte bAdvert = abstractC0576l.advert();
        if (bAdvert == 1) {
            return m168synchronized(true);
        }
        if (bAdvert == 0) {
            return m168synchronized(false);
        }
        if (bAdvert != 6) {
            if (bAdvert == 8) {
                return applovin();
            }
            AbstractC0576l.tapsense(abstractC0576l, "Cannot read Json element because of unexpected ".concat(AbstractC14205l.mopub(bAdvert)), 0, null, 6);
            throw null;
        }
        int i = this.f489l + 1;
        this.f489l = i;
        if (i == 200) {
            C10745l c10745l = new C10745l(this, null);
            Unit unit = Unit.INSTANCE;
            C9166l c9166l = new C9166l();
            c9166l.f18863l = c10745l;
            c9166l.f18862l = unit;
            c9166l.f18861l = c9166l;
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            c9166l.f18864l = enumC9342l;
            while (true) {
                obj = c9166l.f18864l;
                InterfaceC14029l interfaceC14029l = c9166l.f18861l;
                if (interfaceC14029l == null) {
                    break;
                }
                if (enumC9342l.equals(obj)) {
                    try {
                        C10745l c10745l2 = c9166l.f18863l;
                        Unit unit2 = c9166l.f18862l;
                        AbstractC9464l.purchase(3, c10745l2);
                        Object objInvoke = c10745l2.invoke(c9166l, unit2, interfaceC14029l);
                        if (objInvoke != enumC9342l) {
                            interfaceC14029l.subs(objInvoke);
                        }
                    } catch (Throwable th) {
                        interfaceC14029l.subs(new C18435l(th));
                    }
                } else {
                    c9166l.f18864l = enumC9342l;
                    interfaceC14029l.subs(obj);
                }
            }
            AbstractC2829l.crashlytics(obj);
            c18010l = (AbstractC9914l) obj;
        } else {
            byte bSubs = abstractC0576l.subs((byte) 6);
            if (abstractC0576l.advert() == 4) {
                AbstractC0576l.tapsense(abstractC0576l, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (abstractC0576l.purchase()) {
                String strMetrica = this.f490l ? abstractC0576l.metrica() : abstractC0576l.remoteconfig();
                abstractC0576l.subs((byte) 5);
                linkedHashMap.put(strMetrica, premium());
                bSubs = abstractC0576l.admob();
                if (bSubs != 4) {
                    if (bSubs == 7) {
                        break;
                    }
                    AbstractC0576l.tapsense(abstractC0576l, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bSubs == 6) {
                abstractC0576l.subs((byte) 7);
            } else if (bSubs == 4) {
                AbstractC2238l.billing(abstractC0576l);
                throw null;
            }
            c18010l = new C18010l(linkedHashMap);
        }
        this.f489l--;
        return c18010l;
    }

    public boolean pro(C3927l c3927l, C15154l c15154l) throws C16485l {
        ArrayList<C2291l> arrayListM3942l = c15154l.m3942l();
        if (arrayListM3942l == null || arrayListM3942l.isEmpty()) {
            return false;
        }
        if (!c15154l.Signature('{')) {
            throw new C16485l("Malformed rule block: expected '{'");
        }
        c15154l.m3122super();
        C2071l c2071l = new C2071l();
        do {
            String strM3941l = c15154l.m3941l();
            c15154l.m3122super();
            if (!c15154l.Signature(':')) {
                throw new C16485l("Expected ':'");
            }
            c15154l.m3122super();
            String str = (String) c15154l.amazon;
            String strSubstring = null;
            if (!c15154l.advert()) {
                int i = c15154l.loadAd;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!C11522l.m3095strictfp(iCharAt)) {
                        i2 = c15154l.loadAd + 1;
                    }
                    iCharAt = c15154l.admob();
                }
                if (c15154l.loadAd > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    c15154l.loadAd = i;
                }
            }
            if (strSubstring == null) {
                throw new C16485l("Expected property value");
            }
            c15154l.m3122super();
            if (c15154l.Signature('!')) {
                c15154l.m3122super();
                if (!c15154l.license("important")) {
                    throw new C16485l("Malformed rule set: found unexpected '!'");
                }
                c15154l.m3122super();
            }
            c15154l.Signature(';');
            C8270l.applovin(c2071l, strM3941l, strSubstring);
            c15154l.m3122super();
            if (c15154l.advert()) {
                break;
            }
        } while (!c15154l.Signature('}'));
        c15154l.m3122super();
        for (C2291l c2291l : arrayListM3942l) {
            int i3 = this.f489l;
            C0398l c0398l = new C0398l();
            c0398l.yandex = c2291l;
            c0398l.loadAd = c2071l;
            c0398l.crashlytics = i3;
            c3927l.yandex(c0398l);
        }
        return true;
    }

    public void purchase(applovin applovinVar) {
        if (applovinVar == null) {
            C6541l.subs("'element' cannot be null");
            return;
        }
        applovin[] applovinVarArr = (applovin[]) this.f492l;
        int length = applovinVarArr.length;
        int i = this.f489l + 1;
        if (this.f490l | (i > length)) {
            applovin[] applovinVarArr2 = new applovin[Math.max(applovinVarArr.length, (i >> 1) + i)];
            System.arraycopy((applovin[]) this.f492l, 0, applovinVarArr2, 0, this.f489l);
            this.f492l = applovinVarArr2;
            this.f490l = false;
        }
        ((applovin[]) this.f492l)[this.f489l] = applovinVar;
        this.f489l = i;
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
        int i = this.f491l;
    }

    public applovin smaato(int i) {
        if (i < this.f489l) {
            return ((applovin[]) this.f492l)[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.f489l);
    }

    public long startapp(long[] jArr, long j, long j2, long j3, String str) {
        long jMetrica = metrica(jArr);
        if ((j <= jMetrica && jMetrica <= j2) || (0 <= jMetrica && jMetrica <= j3)) {
            return jMetrica;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded number " + jMetrica + " is not within the range for type " + str + " ([" + j + ".." + j2 + "])");
        if (j3 >= 0) {
            sb.append(", nor it is within the range for U" + str + " ([0.." + j3 + "])");
        }
        throw new C5016l(sb.toString());
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public void m166static(Object obj) {
        obj.getClass();
        m163default(this.f489l + 1);
        Object[] objArr = (Object[]) this.f492l;
        int i = this.f489l;
        this.f489l = i + 1;
        objArr[i] = obj;
    }

    public void subscription(C3927l c3927l, C15154l c15154l) throws C16485l {
        int iIntValue;
        char cCharAt;
        int iM3940return;
        String strM3941l = c15154l.m3941l();
        c15154l.m3122super();
        if (strM3941l == null) {
            throw new C16485l("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f490l && strM3941l.equals("media")) {
            ArrayList arrayListSignature = Signature(c15154l);
            if (!c15154l.Signature('{')) {
                throw new C16485l("Invalid @media rule: missing rule set");
            }
            c15154l.m3122super();
            EnumC15797l enumC15797l = (EnumC15797l) this.f492l;
            Iterator it = arrayListSignature.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ad(c15154l);
                    break;
                }
                EnumC15797l enumC15797l2 = (EnumC15797l) it.next();
                if (enumC15797l2 == EnumC15797l.f31019l || enumC15797l2 == enumC15797l) {
                    this.f490l = true;
                    c3927l.loadAd(ad(c15154l));
                    this.f490l = false;
                    break;
                }
            }
            if (!c15154l.advert() && !c15154l.Signature('}')) {
                throw new C16485l("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f490l || !strM3941l.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strM3941l + " rule");
            while (!c15154l.advert() && ((iIntValue = c15154l.m3118private().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strM3943l = null;
            if (!c15154l.advert()) {
                int i2 = c15154l.loadAd;
                if (c15154l.license("url(")) {
                    c15154l.m3122super();
                    String strM3943l2 = c15154l.m3943l();
                    if (strM3943l2 == null) {
                        String str = (String) c15154l.amazon;
                        StringBuilder sb = new StringBuilder();
                        while (!c15154l.advert() && (cCharAt = str.charAt(c15154l.loadAd)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !C11522l.m3095strictfp(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            c15154l.loadAd++;
                            if (cCharAt == '\\') {
                                if (!c15154l.advert()) {
                                    int i3 = c15154l.loadAd;
                                    c15154l.loadAd = i3 + 1;
                                    cCharAt = str.charAt(i3);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iM3940return2 = C15154l.m3940return(cCharAt);
                                        if (iM3940return2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !c15154l.advert() && (iM3940return = C15154l.m3940return(str.charAt(c15154l.loadAd))) != -1; i4++) {
                                                c15154l.loadAd++;
                                                iM3940return2 = (iM3940return2 * 16) + iM3940return;
                                            }
                                            sb.append((char) iM3940return2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strM3943l2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strM3943l2 == null) {
                        c15154l.loadAd = i2;
                    } else {
                        c15154l.m3122super();
                        if (c15154l.advert() || c15154l.license(")")) {
                            strM3943l = strM3943l2;
                        } else {
                            c15154l.loadAd = i2;
                        }
                    }
                }
            }
            if (strM3943l == null) {
                strM3943l = c15154l.m3943l();
            }
            if (strM3943l == null) {
                throw new C16485l("Invalid @import rule: expected string or url()");
            }
            c15154l.m3122super();
            Signature(c15154l);
            if (!c15154l.advert() && !c15154l.Signature(';')) {
                throw new C16485l("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c15154l.m3122super();
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public applovin[] m167switch() {
        int i = this.f489l;
        if (i == 0) {
            return f487l;
        }
        applovin[] applovinVarArr = (applovin[]) this.f492l;
        if (applovinVarArr.length == i) {
            this.f490l = true;
            return applovinVarArr;
        }
        applovin[] applovinVarArr2 = new applovin[i];
        System.arraycopy(applovinVarArr, 0, applovinVarArr2, 0, i);
        return applovinVarArr2;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public AbstractC18121l m168synchronized(boolean z) {
        AbstractC0576l abstractC0576l = (AbstractC0576l) this.f492l;
        String strMetrica = (this.f490l || !z) ? abstractC0576l.metrica() : abstractC0576l.remoteconfig();
        return (z || !AbstractC8576l.yandex(strMetrica, "null")) ? new C16192l(strMetrica, z) : C5544l.INSTANCE;
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        boolean z = false;
        char c = '\b';
        switch (this.f491l) {
            case 9:
                if (this.f490l) {
                    int iSubs = subs(i, bArr) + ((int[]) this.f492l)[0];
                    int iSubs2 = subs(i + 4, bArr) + ((int[]) this.f492l)[1];
                    for (int i3 = 1; i3 <= this.f489l; i3++) {
                        int i4 = i3 * 2;
                        iSubs = m157private(iSubs ^ iSubs2, iSubs2) + ((int[]) this.f492l)[i4];
                        iSubs2 = m157private(iSubs2 ^ iSubs, iSubs) + ((int[]) this.f492l)[i4 + 1];
                    }
                    m154interface(iSubs, i2, bArr2);
                    m154interface(iSubs2, i2 + 4, bArr2);
                } else {
                    int iSubs3 = subs(i, bArr);
                    int iSubs4 = subs(i + 4, bArr);
                    int i5 = this.f489l;
                    while (true) {
                        int[] iArr = (int[]) this.f492l;
                        if (i5 >= 1) {
                            int i6 = i5 * 2;
                            int i7 = iSubs4 - iArr[i6 + 1];
                            int i8 = iSubs3 & 31;
                            iSubs4 = ((i7 << (32 - i8)) | (i7 >>> i8)) ^ iSubs3;
                            int i9 = iSubs3 - iArr[i6];
                            int i10 = iSubs4 & 31;
                            iSubs3 = ((i9 << (32 - i10)) | (i9 >>> i10)) ^ iSubs4;
                            i5--;
                        } else {
                            m154interface(iSubs3 - iArr[0], i2, bArr2);
                            m154interface(iSubs4 - ((int[]) this.f492l)[1], i2 + 4, bArr2);
                        }
                    }
                }
                return 8;
            default:
                if (this.f490l) {
                    long jAdmob = admob(i, bArr) + ((long[]) this.f492l)[0];
                    long jAdmob2 = admob(i + 8, bArr) + ((long[]) this.f492l)[1];
                    for (int i11 = 1; i11 <= this.f489l; i11++) {
                        int i12 = i11 * 2;
                        jAdmob = m155native(jAdmob ^ jAdmob2, jAdmob2) + ((long[]) this.f492l)[i12];
                        jAdmob2 = m155native(jAdmob2 ^ jAdmob, jAdmob) + ((long[]) this.f492l)[i12 + 1];
                    }
                    m150class(jAdmob, bArr2, i2);
                    m150class(jAdmob2, bArr2, i2 + 8);
                    return 16;
                }
                long jAdmob3 = admob(i, bArr);
                long jAdmob4 = admob(i + 8, bArr);
                int i13 = this.f489l;
                while (true) {
                    long[] jArr = (long[]) this.f492l;
                    if (i13 < 1) {
                        m150class(jAdmob3 - jArr[z ? 1 : 0], bArr2, i2);
                        m150class(jAdmob4 - ((long[]) this.f492l)[1], bArr2, i2 + 8);
                        return 16;
                    }
                    int i14 = i13 * 2;
                    long j = jAdmob4 - jArr[i14 + 1];
                    boolean z2 = z;
                    long j2 = jAdmob3 & 63;
                    jAdmob4 = ((j << ((int) (64 - j2))) | (j >>> ((int) j2))) ^ jAdmob3;
                    long j3 = jAdmob3 - jArr[i14];
                    long j4 = jAdmob4 & 63;
                    jAdmob3 = ((j3 << ((int) (64 - j4))) | (j3 >>> ((int) j4))) ^ jAdmob4;
                    i13--;
                    z = z2;
                    c = c;
                }
                break;
        }
    }

    public C5978l vip(C5978l c5978l) {
        if (!this.f490l || !((C8565l) this.f492l).mopub(c5978l)) {
            return c5978l;
        }
        C12984l c12984lYandex = c5978l.yandex();
        String str = c5978l.firebase;
        c12984lYandex.vip = AbstractC3825l.vip("application/x-media3-cues");
        c12984lYandex.f25443private = ((C8565l) this.f492l).metrica(c5978l);
        StringBuilder sb = new StringBuilder();
        sb.append(c5978l.metrica);
        sb.append(str != null ? " ".concat(str) : "");
        c12984lYandex.isPro = sb.toString();
        c12984lYandex.subscription = Long.MAX_VALUE;
        return new C5978l(c12984lYandex);
    }

    @Override // defpackage.InterfaceC5174l
    public void yandex() {
        this.f490l = true;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    private final void m158strictfp() {
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    private final void m161volatile() {
    }

    public /* synthetic */ appmetrica(char c, int i) {
        this.f491l = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public appmetrica(byte b, int i) {
        this(10, 0);
        this.f491l = i;
        switch (i) {
            case 9:
                this.f489l = 12;
                this.f492l = null;
                break;
            case 12:
                this.f492l = new Object[4];
                this.f489l = 0;
                break;
            default:
                break;
        }
    }

    public appmetrica(C17752l c17752l, AbstractC0576l abstractC0576l) {
        this.f491l = 8;
        this.f492l = abstractC0576l;
        this.f490l = c17752l.crashlytics;
    }

    public appmetrica(AbstractC15211l abstractC15211l, int i, boolean z) {
        this.f491l = 7;
        this.f492l = abstractC15211l;
        this.f489l = i;
        this.f490l = z;
    }

    public appmetrica(Context context) {
        this.f491l = 6;
        this.f492l = context;
        this.f489l = -1;
    }

    public appmetrica(C6129l c6129l, boolean z) {
        this.f491l = 4;
        this.f492l = c6129l;
        this.f490l = z;
        this.f489l = -1;
        appmetrica();
    }

    public appmetrica(C9943l c9943l) {
        this.f491l = 11;
        C5334l c5334l = C5334l.mopub;
        this.f489l = c9943l.yandex;
        this.f492l = c9943l.loadAd;
        this.f490l = c9943l.crashlytics;
    }

    public appmetrica(ActionBarContextView actionBarContextView) {
        this.f491l = 2;
        this.f492l = actionBarContextView;
        this.f490l = false;
    }
}
