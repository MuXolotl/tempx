package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.car.app.navigation.model.Maneuver;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٌؚٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C8634l implements InterfaceC12679l, InterfaceC11856l, InterfaceC14606l, InterfaceC4930l, InterfaceC1326l, InterfaceC11795l, InterfaceC17435l, InterfaceC2353l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C8634l f17791l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f17792l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f17793l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17794l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f17795l;

    static {
        Object obj = null;
        f17791l = new C8634l(true, obj, obj, 0);
    }

    public C8634l(int i) {
        this.f17794l = i;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f17792l = new Object();
                break;
            default:
                this.f17792l = new ArrayList();
                this.f17795l = new HashMap();
                this.f17793l = false;
                break;
        }
    }

    public static boolean ads(C15421l c15421l, C15421l c15421l2) {
        int i;
        boolean zLoadAd = c15421l2.loadAd();
        int i2 = c15421l2.yandex;
        if (zLoadAd) {
            int i3 = c15421l.yandex;
            return !(i3 == 2 && i2 == 1) && (i3 == 2 || i3 == 0 || i3 == i2) && ((i = c15421l.loadAd) == 0 || i == c15421l2.loadAd);
        }
        C8936l.firebase(c15421l2, " not actually fully specified.", "Fully specified range ");
        return false;
    }

    public static void isVip(Set set, C15421l c15421l, C15053l c15053l) {
        Set set2 = set;
        AbstractC5641l.purchase("Cannot update already-empty constraints.", !set2.isEmpty());
        Set setCrashlytics = ((InterfaceC0553l) c15053l.f29576l).crashlytics(c15421l);
        Set set3 = setCrashlytics;
        if (set3.isEmpty()) {
            return;
        }
        Set setM4229l = AbstractC16901l.m4229l(set);
        set.retainAll(set3);
        if (set2.isEmpty()) {
            throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + c15421l + "\nConstraints:\n  " + setCrashlytics + "\nExisting constraints:\n  " + setM4229l).toString());
        }
    }

    public static C15421l license(C15421l c15421l, LinkedHashSet linkedHashSet, Set set) {
        if (c15421l.yandex != 1) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C15421l c15421l2 = (C15421l) it.next();
                int i = c15421l2.yandex;
                if (!c15421l2.loadAd()) {
                    C8339l.smaato("Fully specified DynamicRange must have fully defined encoding.");
                    break;
                }
                if (i != 1 && subscription(c15421l, c15421l2, set)) {
                    return c15421l2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C8634l m2336package(String str, Exception exc) {
        return new C8634l(false, (Object) str, (Object) exc, (int) (0 == true ? 1 : 0));
    }

    public static boolean subscription(C15421l c15421l, C15421l c15421l2, Set set) {
        if (set.contains(c15421l2)) {
            return ads(c15421l, c15421l2);
        }
        if (!AbstractC5088l.firebase("CXCP")) {
            return false;
        }
        Log.d("CXCP", "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + c15421l + "\nCandidate dynamic range:\n  " + c15421l2);
        return false;
    }

    private final void tapsense() {
        synchronized (this.f17795l) {
            ((ImageReader) this.f17792l).close();
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C8634l m2337throws(String str) {
        return new C8634l(false, (Object) str, (Object) null, (int) (0 == true ? 1 : 0));
    }

    @Override // defpackage.InterfaceC11856l
    /* JADX INFO: renamed from: Signature, reason: merged with bridge method [inline-methods] */
    public C15276l isPro(C1424l c1424l) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        InterfaceC2002l c17578l;
        int i;
        String str = ((C6403l) c1424l.f3603l).yandex;
        C15276l c15276l = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.f17793l || Build.VERSION.SDK_INT < 36) {
                    c17578l = new C17578l(mediaCodecCreateByCodecName, (HandlerThread) ((C9332l) this.f17795l).get());
                    i = 0;
                } else {
                    c17578l = new C7026l(22, mediaCodecCreateByCodecName);
                    i = 4;
                }
                C15276l c15276l2 = new C15276l(mediaCodecCreateByCodecName, (HandlerThread) ((C9332l) this.f17792l).get(), c17578l, (C16957l) c1424l.f3606l);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) c1424l.f3605l;
                    if (surface == null && ((C6403l) c1424l.f3603l).admob && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    C15276l.crashlytics(c15276l2, (MediaFormat) c1424l.f3602l, surface, (MediaCrypto) c1424l.f3604l, i);
                    return c15276l2;
                } catch (Exception e) {
                    e = e;
                    c15276l = c15276l2;
                    if (c15276l != null) {
                        c15276l.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x020d  */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x020d, please report this as an issue */
    public LinkedHashMap ad(ArrayList arrayList, List list, List list2) {
        C15421l c15421l;
        Iterator it;
        Set set;
        Iterator it2;
        C15421l c15421l2;
        C15421l c15421lAdcel;
        C15053l c15053l = (C15053l) this.f17795l;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(((C7314l) it3.next()).amazon);
        }
        Set setLoadAd = ((InterfaceC0553l) c15053l.f29576l).loadAd();
        Set setM4227l = AbstractC16901l.m4227l(setLoadAd);
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            isVip(setM4227l, (C15421l) it4.next(), c15053l);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            InterfaceC0048l interfaceC0048l = (InterfaceC0048l) list.get(((Number) it5.next()).intValue());
            C15421l c15421lLoadAd = interfaceC0048l.loadAd();
            if (c15421lLoadAd.equals(C15421l.crashlytics)) {
                arrayList4.add(interfaceC0048l);
            } else {
                int i = c15421lLoadAd.yandex;
                int i2 = c15421lLoadAd.loadAd;
                if (i == 2 || ((i != 0 && i2 == 0) || (i == 0 && i2 != 0))) {
                    arrayList3.add(interfaceC0048l);
                } else {
                    arrayList2.add(interfaceC0048l);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList2);
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            InterfaceC0048l interfaceC0048l2 = (InterfaceC0048l) it6.next();
            C15421l c15421lLoadAd2 = interfaceC0048l2.loadAd();
            String strMo862switch = interfaceC0048l2.mo862switch();
            if (c15421lLoadAd2.loadAd()) {
                set = setLoadAd;
                it = it6;
                c15421l = setM4227l.contains(c15421lLoadAd2) ? c15421lLoadAd2 : null;
            } else {
                int i3 = c15421lLoadAd2.yandex;
                int i4 = c15421lLoadAd2.loadAd;
                c15421l = C15421l.amazon;
                if (i3 == 1 && i4 == 0) {
                    if (!setM4227l.contains(c15421l)) {
                        c15421l = null;
                    }
                    set = setLoadAd;
                    it = it6;
                } else {
                    C15421l c15421lLicense = license(c15421lLoadAd2, linkedHashSet, setM4227l);
                    it = it6;
                    set = setLoadAd;
                    if (c15421lLicense == null) {
                        c15421lLicense = license(c15421lLoadAd2, linkedHashSet2, setM4227l);
                        if (c15421lLicense == null) {
                            if (!subscription(c15421lLoadAd2, c15421l, setM4227l)) {
                                if (i3 != 2 || (i4 != 10 && i4 != 0)) {
                                    it2 = setM4227l.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            c15421l = null;
                                            break;
                                        }
                                        c15421l2 = (C15421l) it2.next();
                                        if (c15421l2.loadAd()) {
                                            C8339l.smaato("Candidate dynamic range must be fully specified.");
                                            return null;
                                        }
                                        if (!c15421l2.equals(c15421l) && ads(c15421lLoadAd2, c15421l2)) {
                                            if (AbstractC5088l.firebase("CXCP")) {
                                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + strMo862switch + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + c15421lLoadAd2 + "\n->\n" + c15421l2);
                                            }
                                            c15421l = c15421l2;
                                            break;
                                        }
                                    }
                                } else {
                                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        c15421lAdcel = AbstractC2847l.adcel((InterfaceC5389l) this.f17792l);
                                        if (c15421lAdcel != null) {
                                            linkedHashSet3.add(c15421lAdcel);
                                        }
                                    } else {
                                        c15421lAdcel = null;
                                    }
                                    linkedHashSet3.add(C15421l.purchase);
                                    C15421l c15421lLicense2 = license(c15421lLoadAd2, linkedHashSet3, setM4227l);
                                    if (c15421lLicense2 == null) {
                                        it2 = setM4227l.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                c15421l = null;
                                                break;
                                            }
                                            c15421l2 = (C15421l) it2.next();
                                            if (c15421l2.loadAd()) {
                                                C8339l.smaato("Candidate dynamic range must be fully specified.");
                                                return null;
                                            }
                                            if (!c15421l2.equals(c15421l)) {
                                                if (AbstractC5088l.firebase("CXCP")) {
                                                    Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + strMo862switch + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + c15421lLoadAd2 + "\n->\n" + c15421l2);
                                                }
                                                c15421l = c15421l2;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (AbstractC5088l.firebase("CXCP")) {
                                            StringBuilder sbIsVip = AbstractC5020l.isVip("DynamicRangeResolver: Resolved dynamic range for use case ", strMo862switch, "from ");
                                            sbIsVip.append(c15421lLicense2.equals(c15421lAdcel) ? "recommended" : "required");
                                            sbIsVip.append(" 10-bit supported dynamic range.\n");
                                            sbIsVip.append(c15421lLoadAd2);
                                            sbIsVip.append("\n->\n");
                                            sbIsVip.append(c15421lLicense2);
                                            Log.d("CXCP", sbIsVip.toString());
                                        }
                                        c15421l = c15421lLicense2;
                                    }
                                }
                            } else if (AbstractC5088l.firebase("CXCP")) {
                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + strMo862switch + " to no compatible HDR dynamic ranges.\n" + c15421lLoadAd2 + "\n->\n" + c15421l);
                            }
                        } else if (AbstractC5088l.firebase("CXCP")) {
                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + strMo862switch + " from concurrently bound use case.\n" + c15421lLoadAd2 + "\n->\n" + c15421lLicense);
                        }
                    } else if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + strMo862switch + " from existing attached surface.\n" + c15421lLoadAd2 + "\n->\n" + c15421lLicense);
                    }
                    c15421l = c15421lLicense;
                }
            }
            if (c15421l == null) {
                throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + interfaceC0048l2.mo862switch() + "\nRequested dynamic range:\n  " + c15421lLoadAd2 + "\nSupported dynamic ranges:\n  " + set + "\nConstrained set of concurrent dynamic ranges:\n  " + setM4227l);
            }
            isVip(setM4227l, c15421l, c15053l);
            linkedHashMap.put(interfaceC0048l2, c15421l);
            if (!linkedHashSet.contains(c15421l)) {
                linkedHashSet2.add(c15421l);
            }
            it6 = it;
            setLoadAd = set;
        }
        return linkedHashMap;
    }

    public boolean adcel(long j) {
        Object obj;
        List list = (List) ((C13568l) this.f17795l).f26581l;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (AbstractC17265l.purchase(((C0704l) obj).yandex, j)) {
                break;
            }
            i++;
        }
        C0704l c0704l = (C0704l) obj;
        if (c0704l != null) {
            return c0704l.admob;
        }
        return false;
    }

    @Override // defpackage.InterfaceC11795l
    public boolean admob(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        if (this.f17793l) {
            C8339l.smaato("not initialised for verifying");
            return false;
        }
        C4148l c4148l = (C4148l) ((AbstractC2017l) this.f17792l);
        C7838l c7838l = c4148l.f4542l;
        BigInteger bigInteger3 = c7838l.f16362l;
        int iBitLength = bigInteger3.bitLength();
        BigInteger bigInteger4 = new BigInteger(1, bArr);
        if (bigInteger4.bitLength() > iBitLength) {
            C10754l.ad("input too large for ECNR key.");
            return false;
        }
        BigInteger bigInteger5 = c7838l.f16362l;
        BigInteger bigIntegerMod = null;
        if (bigInteger.compareTo(InterfaceC11695l.startapp) >= 0 && bigInteger.compareTo(bigInteger5) < 0 && bigInteger2.compareTo(InterfaceC11695l.metrica) >= 0 && bigInteger2.compareTo(bigInteger5) < 0) {
            AbstractC8859l abstractC8859lStartapp = AbstractC6974l.ads(c7838l.f16358l, bigInteger2, c4148l.f8515l, bigInteger).startapp();
            if (!abstractC8859lStartapp.smaato()) {
                abstractC8859lStartapp.loadAd();
                bigIntegerMod = bigInteger.subtract(abstractC8859lStartapp.loadAd.signatures()).mod(bigInteger5);
            }
        }
        return bigIntegerMod != null && bigIntegerMod.equals(bigInteger4.mod(bigInteger3));
    }

    public void advert(InterfaceC13922l interfaceC13922l, Object obj) {
        ((SharedPreferences) this.f17795l).edit().putBoolean((String) this.f17792l, ((Boolean) obj).booleanValue()).apply();
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        int i;
        int i2 = 2;
        switch (this.f17794l) {
            case 4:
                C12287l c12287l = (C12287l) obj;
                synchronized (this.f17795l) {
                    try {
                        if (this.f17793l) {
                            return;
                        }
                        if (c12287l == null) {
                            return;
                        }
                        AbstractC5088l.yandex("CameraController", "Tap-to-focus onSuccess: " + c12287l.yandex);
                        C13716l c13716l = (C13716l) this.f17792l;
                        if (!c12287l.yandex) {
                            i2 = 3;
                        }
                        c13716l.isPro(new C17690l(i2));
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                C11757l c11757l = (C11757l) this.f17792l;
                if (this.f17793l) {
                    return;
                }
                c11757l.billing(bitmap);
                C0743l c0743l = (C0743l) this.f17795l;
                C16543l c16543l = new C16543l(c11757l.loadAd());
                C9716l c9716l = (C9716l) c0743l.f2242l;
                c9716l.f19808l.execute(new RunnableC3088l(c9716l, (C13572l) c0743l.f2241l, c0743l.f2243l, c16543l, 2));
                return;
            case 13:
                C3726l c3726l = (C3726l) this.f17795l;
                C6499l c6499l = (C6499l) this.f17792l;
                boolean z = this.f17793l;
                AbstractC8672l.billing(c3726l.tapsense, (C9896l) obj);
                AbstractC15323l.m3973native(c3726l.tapsense);
                if (z) {
                    c3726l.signatures(c6499l);
                    return;
                }
                return;
            default:
                C16565l c16565l = (C16565l) this.f17792l;
                C10418l c10418l = (C10418l) this.f17795l;
                if (c16565l != c10418l.pro || (i = c10418l.advert) == 3) {
                    return;
                }
                i2 = this.f17793l ? 1 : 2;
                if (i2 != i) {
                    c10418l.advert = i2;
                    c10418l.m2924throw().amazon(i2);
                    return;
                }
                return;
        }
    }

    public String applovin() {
        return (String) this.f17792l;
    }

    public void appmetrica(InterfaceC8215l interfaceC8215l) {
        synchronized (this.f17792l) {
            try {
                if (((ArrayDeque) this.f17795l) == null) {
                    this.f17795l = new ArrayDeque();
                }
                ((ArrayDeque) this.f17795l).add(interfaceC8215l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC1326l
    public boolean billing(InterfaceC1925l interfaceC1925l, InterfaceC1925l interfaceC1925l2) {
        boolean z = this.f17793l;
        InterfaceC11661l interfaceC11661l = (InterfaceC11661l) this.f17792l;
        InterfaceC11661l interfaceC11661l2 = (InterfaceC11661l) this.f17795l;
        if (interfaceC1925l.equals(interfaceC1925l2)) {
            return true;
        }
        InterfaceC15234l interfaceC15234lPro = interfaceC1925l.pro();
        InterfaceC15234l interfaceC15234lPro2 = interfaceC1925l2.pro();
        if ((interfaceC15234lPro instanceof InterfaceC16902l) && (interfaceC15234lPro2 instanceof InterfaceC16902l)) {
            return C7472l.f15462l.admob((InterfaceC16902l) interfaceC15234lPro, (InterfaceC16902l) interfaceC15234lPro2, z, new C6640l(interfaceC11661l, interfaceC11661l2, 4));
        }
        return false;
    }

    @Override // defpackage.InterfaceC12679l
    public void close() {
        switch (this.f17794l) {
            case 1:
                tapsense();
                return;
            default:
                synchronized (this.f17795l) {
                    this.f17793l = true;
                    break;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC11795l
    public BigInteger[] crashlytics(byte[] bArr) {
        BigInteger bigIntegerCrashlytics;
        C18595l c18595l;
        BigInteger bigIntegerMod;
        if (!this.f17793l) {
            C8339l.smaato("not initialised for signing");
            return null;
        }
        BigInteger order = getOrder();
        BigInteger bigInteger = new BigInteger(1, bArr);
        C8374l c8374l = (C8374l) ((AbstractC2017l) this.f17792l);
        if (bigInteger.compareTo(order) >= 0) {
            C10754l.ad("input too large for ECNR key");
            return null;
        }
        do {
            C7838l c7838l = c8374l.f4542l;
            SecureRandom secureRandomLoadAd = (SecureRandom) this.f17795l;
            c7838l.f16362l.bitLength();
            if (secureRandomLoadAd == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal = AbstractC8776l.yandex;
            }
            SecureRandom secureRandom = secureRandomLoadAd;
            AbstractC16336l.amazon(c7838l.f16360l);
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
            BigInteger bigInteger2 = c7838l.f16362l;
            int iBitLength = bigInteger2.bitLength();
            int i = iBitLength >>> 2;
            while (true) {
                bigIntegerCrashlytics = AbstractC16784l.crashlytics(iBitLength, secureRandom);
                if (bigIntegerCrashlytics.compareTo(InterfaceC11695l.startapp) >= 0 && bigIntegerCrashlytics.compareTo(bigInteger2) < 0 && AbstractC6660l.billing(bigIntegerCrashlytics) >= i) {
                    break;
                }
            }
            c18595l = new C18595l(new C4148l(new C16732l(0).loadAd(c7838l.f16358l, bigIntegerCrashlytics), c7838l), new C8374l(bigIntegerCrashlytics, c7838l), 7);
            AbstractC8859l abstractC8859l = ((C4148l) ((AbstractC8831l) c18595l.f36317l)).f8515l;
            abstractC8859l.loadAd();
            bigIntegerMod = abstractC8859l.loadAd.signatures().add(bigInteger).mod(order);
        } while (bigIntegerMod.equals(InterfaceC11695l.metrica));
        return new BigInteger[]{bigIntegerMod, ((C8374l) ((AbstractC8831l) c18595l.f36316l)).f17335l.subtract(bigIntegerMod.multiply(c8374l.f17335l)).mod(order)};
    }

    @Override // defpackage.InterfaceC17435l
    public boolean firebase(long j, C11379l c11379l, int i) {
        C17812l c17812l;
        C16173l c16173l = (C16173l) this.f17795l;
        if (!c16173l.firebase() || c16173l.vip().yandex.f7563l.length() == 0 || (c17812l = c16173l.amazon) == null || c17812l.amazon() == null) {
            return false;
        }
        C6523l c6523l = c16173l.firebase;
        if (c6523l != null) {
            C6523l.loadAd(c6523l);
        }
        c16173l.vip = j;
        c16173l.subscription = -1;
        c16173l.admob(true);
        long jSignatures = signatures(c16173l.vip(), c16173l.vip, true, c11379l);
        if (i >= 2) {
            this.f17793l = true;
            this.f17792l = new C12814l(jSignatures);
        }
        return true;
    }

    @Override // defpackage.InterfaceC11795l
    public BigInteger getOrder() {
        return ((AbstractC2017l) this.f17792l).f4542l.f16362l;
    }

    @Override // defpackage.InterfaceC12679l
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f17795l) {
            surface = ((ImageReader) this.f17792l).getSurface();
        }
        return surface;
    }

    @Override // defpackage.InterfaceC11795l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        this.f17793l = z;
        SecureRandom secureRandomLoadAd = null;
        if (z) {
            if (interfaceC9719l instanceof C6114l) {
                C6114l c6114l = (C6114l) interfaceC9719l;
                secureRandomLoadAd = c6114l.f12904l;
                interfaceC9719l = c6114l.f12903l;
            }
            this.f17792l = (C8374l) interfaceC9719l;
            if (secureRandomLoadAd == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal = AbstractC8776l.yandex;
            }
        } else {
            this.f17792l = (C4148l) interfaceC9719l;
        }
        this.f17795l = secureRandomLoadAd;
        AbstractC1497l.amazon("ECNR", (AbstractC2017l) this.f17792l, z);
        AbstractC8776l.yandex();
    }

    public void inmobi(C3823l c3823l) {
        InterfaceC8215l interfaceC8215l;
        Object obj = this.f17792l;
        synchronized (obj) {
            if (((ArrayDeque) this.f17795l) != null && !this.f17793l) {
                this.f17793l = true;
                while (true) {
                    synchronized (obj) {
                        try {
                            interfaceC8215l = (InterfaceC8215l) ((ArrayDeque) this.f17795l).poll();
                            if (interfaceC8215l == null) {
                                this.f17793l = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    interfaceC8215l.yandex(c3823l);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC12679l
    public int loadAd() {
        int height;
        synchronized (this.f17795l) {
            height = ((ImageReader) this.f17792l).getHeight();
        }
        return height;
    }

    @Override // defpackage.InterfaceC12679l
    public int metrica() {
        int imageFormat;
        synchronized (this.f17795l) {
            imageFormat = ((ImageReader) this.f17792l).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        switch (this.f17794l) {
            case 4:
                synchronized (this.f17795l) {
                    try {
                        if (this.f17793l) {
                            return;
                        }
                        if (!(th instanceof C6711l)) {
                            AbstractC5088l.loadAd("CameraController", "Tap-to-focus failed.", th);
                            ((C13716l) this.f17792l).isPro(new C17690l(4));
                            return;
                        } else {
                            AbstractC5088l.loadAd("CameraController", "Tap-to-focus canceled", th);
                            ((C13716l) this.f17792l).isPro(new C17690l(0));
                            close();
                            return;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 5:
                if (this.f17793l) {
                    return;
                }
                AbstractC6427l.vip("NotificationProvider", "Failed to load bitmap: " + th.getMessage());
                return;
            case 13:
                C3726l c3726l = (C3726l) this.f17795l;
                if (th instanceof UnsupportedOperationException) {
                    AbstractC6427l.metrica("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    AbstractC6427l.subs("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                AbstractC15323l.m3973native(c3726l.tapsense);
                if (this.f17793l) {
                    c3726l.signatures((C6499l) this.f17792l);
                    return;
                }
                return;
            default:
                if (th instanceof CancellationException) {
                    return;
                }
                AbstractC5088l.amazon("VideoCapture", "Surface update completed with unexpected exception", th);
                return;
        }
    }

    @Override // defpackage.InterfaceC12679l
    /* JADX INFO: renamed from: native */
    public InterfaceC11792l mo1996native() {
        Image imageAcquireNextImage;
        synchronized (this.f17795l) {
            try {
                imageAcquireNextImage = ((ImageReader) this.f17792l).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new C5596l(imageAcquireNextImage);
        }
    }

    @Override // defpackage.InterfaceC12679l
    public void premium(final InterfaceC5755l interfaceC5755l, final Executor executor) {
        synchronized (this.f17795l) {
            this.f17793l = false;
            ((ImageReader) this.f17792l).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: lؑؒۖ
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C8634l c8634l = this.f904l;
                    Executor executor2 = executor;
                    InterfaceC5755l interfaceC5755l2 = interfaceC5755l;
                    synchronized (c8634l.f17795l) {
                        try {
                            if (!c8634l.f17793l) {
                                executor2.execute(new RunnableC7762l(c8634l, interfaceC5755l2, 3));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, AbstractC3308l.subs());
        }
    }

    public Object pro(Object obj) {
        return Boolean.valueOf(((SharedPreferences) this.f17795l).getBoolean((String) this.f17792l, this.f17793l));
    }

    @Override // defpackage.InterfaceC12679l
    public int purchase() {
        int width;
        synchronized (this.f17795l) {
            width = ((ImageReader) this.f17792l).getWidth();
        }
        return width;
    }

    @Override // defpackage.InterfaceC17435l
    public boolean remoteconfig(long j, C11379l c11379l) {
        C17812l c17812l;
        C16173l c16173l = (C16173l) this.f17795l;
        if (!c16173l.firebase() || c16173l.vip().yandex.f7563l.length() == 0 || (c17812l = c16173l.amazon) == null || c17812l.amazon() == null) {
            return false;
        }
        signatures(c16173l.vip(), j, false, c11379l);
        return true;
    }

    public long signatures(C0639l c0639l, long j, boolean z, C11379l c11379l) {
        C16173l c16173l = (C16173l) this.f17795l;
        long jCrashlytics = C16173l.crashlytics(c16173l, c0639l, j, z, false, c11379l, false, null);
        if (!C12814l.loadAd(jCrashlytics, (C12814l) this.f17792l)) {
            this.f17793l = false;
        }
        c16173l.adcel(C12814l.amazon(jCrashlytics) ? EnumC7170l.f15002l : EnumC7170l.f15003l);
        return jCrashlytics;
    }

    @Override // defpackage.InterfaceC12679l
    public InterfaceC11792l smaato() {
        Image imageAcquireLatestImage;
        synchronized (this.f17795l) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.f17792l).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new C5596l(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.InterfaceC12679l
    public void startapp() {
        synchronized (this.f17795l) {
            this.f17793l = true;
            ((ImageReader) this.f17792l).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.InterfaceC12679l
    /* JADX INFO: renamed from: strictfp */
    public int mo1997strictfp() {
        int maxImages;
        synchronized (this.f17795l) {
            maxImages = ((ImageReader) this.f17792l).getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.InterfaceC17435l
    public void subs() {
        if (this.f17793l) {
            C16173l.loadAd((C16173l) this.f17795l, (C12814l) this.f17792l);
        }
    }

    public String toString() {
        switch (this.f17794l) {
            case 11:
                return "JavaTypeEnhancementState(jsr305=" + ((C13807l) this.f17792l) + ", getReportLevelForAnnotation=" + ((C6238l) this.f17795l) + ')';
            case 16:
                String str = (String) this.f17792l;
                C0099l c0099l = (C0099l) this.f17795l;
                if (this.f17793l) {
                    return "API." + str + "({" + c0099l + "});";
                }
                return "API." + str + "({" + c0099l + "})";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17435l
    public boolean vip(long j) {
        C16173l c16173l = (C16173l) this.f17795l;
        C17812l c17812l = c16173l.amazon;
        if (c17812l == null || c17812l.amazon() == null || !c16173l.firebase()) {
            return false;
        }
        c16173l.subscription = -1;
        C6523l c6523l = c16173l.firebase;
        if (c6523l != null) {
            C6523l.loadAd(c6523l);
        }
        signatures(c16173l.vip(), j, false, C1461l.f3667l);
        return true;
    }

    @Override // defpackage.InterfaceC17435l
    public boolean yandex(long j) {
        C17812l c17812l;
        C16173l c16173l = (C16173l) this.f17795l;
        if (!c16173l.firebase() || c16173l.vip().yandex.f7563l.length() == 0 || (c17812l = c16173l.amazon) == null || c17812l.amazon() == null) {
            return false;
        }
        signatures(c16173l.vip(), j, false, C1461l.f3667l);
        return true;
    }

    public /* synthetic */ C8634l(Object obj, Object obj2, int i) {
        this.f17794l = i;
        this.f17792l = obj;
        this.f17795l = obj2;
    }

    public /* synthetic */ C8634l(Object obj, Object obj2, boolean z, int i) {
        this.f17794l = i;
        this.f17795l = obj;
        this.f17792l = obj2;
        this.f17793l = z;
    }

    public /* synthetic */ C8634l(boolean z, Object obj, Object obj2, int i) {
        this.f17794l = i;
        this.f17793l = z;
        this.f17792l = obj;
        this.f17795l = obj2;
    }

    public C8634l(C13807l c13807l, C6238l c6238l) {
        this.f17794l = 11;
        this.f17792l = c13807l;
        this.f17795l = c6238l;
        this.f17793l = c13807l.amazon || c6238l.invoke(AbstractC4753l.yandex) == EnumC5244l.f11322l;
    }

    public C8634l(InterfaceC5389l interfaceC5389l) {
        this.f17794l = 7;
        this.f17792l = interfaceC5389l;
        int[] iArr = (int[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        this.f17793l = iArr != null ? AbstractC8669l.tapsense(iArr, 18) : false;
        this.f17795l = AbstractC2847l.purchase(interfaceC5389l);
    }

    public C8634l(ImageReader imageReader) {
        this.f17794l = 1;
        this.f17795l = new Object();
        this.f17793l = true;
        this.f17792l = imageReader;
    }

    public C8634l(String str, C0099l c0099l, int i) {
        this.f17794l = 16;
        boolean z = (i & 4) == 0;
        this.f17792l = str;
        this.f17795l = c0099l;
        this.f17793l = z;
    }

    public C8634l(C9332l c9332l, C9332l c9332l2) {
        this.f17794l = 2;
        this.f17792l = c9332l;
        this.f17795l = c9332l2;
        this.f17793l = true;
    }

    public /* synthetic */ C8634l(int i, boolean z) {
        this.f17794l = i;
    }

    public C8634l(C16173l c16173l) {
        this.f17794l = 14;
        this.f17795l = c16173l;
        this.f17793l = true;
    }

    public C8634l(C3726l c3726l, C6499l c6499l, boolean z, C16616l c16616l) {
        this.f17794l = 13;
        this.f17795l = c3726l;
        this.f17792l = c6499l;
        this.f17793l = z;
    }

    public C8634l(PointF pointF, C13716l c13716l) {
        this.f17794l = 4;
        this.f17793l = false;
        this.f17795l = new Object();
        this.f17792l = c13716l;
    }
}
