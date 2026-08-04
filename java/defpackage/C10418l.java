package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lَٛۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10418l extends AbstractC6896l {

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final C1335l f21240throws = new C1335l();
    public C13629l Signature;
    public C15691l ad;
    public int advert;
    public C14739l applovin;
    public C2525l appmetrica;
    public final C7162l inmobi;
    public C10038l isVip;
    public C16774l license;
    public int premium;
    public C16565l pro;
    public Rect signatures;
    public AbstractC0958l subscription;
    public C3716l tapsense;

    public C10418l(C11550l c11550l) {
        super(c11550l);
        this.Signature = C13629l.crashlytics;
        this.license = new C16774l();
        this.pro = null;
        this.advert = 3;
        this.inmobi = new C7162l(2, this);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static InterfaceC13662l m2914case(C4835l c4835l, C5680l c5680l, C1858l c1858l, C15421l c15421l) {
        InterfaceC13662l interfaceC13662lYandex = c4835l.yandex(AbstractC15040l.crashlytics(c1858l, c15421l, c5680l).yandex);
        if (interfaceC13662lYandex != null) {
            return AbstractC3206l.purchase(interfaceC13662lYandex, c5680l != null ? c5680l.billing.yandex() : null);
        }
        AbstractC5088l.tapsense("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static int m2915strictfp(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static void m2916synchronized(HashSet hashSet, int i, int i2, Size size, InterfaceC13662l interfaceC13662l) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) interfaceC13662l.mo1970l(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            AbstractC5088l.Signature("VideoCapture", "No supportedHeights for width: " + i, e);
        }
        try {
            hashSet.add(new Size(((Integer) interfaceC13662l.mo1971l(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            AbstractC5088l.Signature("VideoCapture", "No supportedWidths for height: " + i2, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0160  */
    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l Signature(InterfaceC15879l interfaceC15879l, InterfaceC16651l interfaceC16651l) {
        Object obj;
        C1858l c1858l;
        C5012l c5012l;
        Range range;
        int i;
        ArrayList<C18680l> arrayList;
        List listAppmetrica;
        LinkedHashMap linkedHashMap;
        C1858l c1858l2;
        InterfaceC13662l interfaceC13662lM2914case;
        Iterator it;
        Size size;
        ListenableFuture listenableFutureMopub = m2924throw().crashlytics().mopub();
        if (listenableFutureMopub.isDone()) {
            try {
                obj = listenableFutureMopub.get();
            } catch (InterruptedException | ExecutionException e) {
                C11983l.ads(e);
                return null;
            }
        } else {
            obj = null;
        }
        C1858l c1858l3 = (C1858l) obj;
        if (c1858l3 == null) {
            C8339l.metrica("MediaSpec can't be null");
            return null;
        }
        C16928l c16928l = c1858l3.yandex;
        C10136l c10136lM2920for = m2920for();
        if (c10136lM2920for == null) {
            c10136lM2920for = c16928l.yandex;
        }
        C11550l c11550l = (C11550l) interfaceC16651l.Signature();
        if (((C7420l) c11550l.subs()).mo861strictfp(InterfaceC4089l.f8422native)) {
            AbstractC5641l.loadAd(m2924throw().mopub(), "Custom ordered resolutions and QualitySelector can't both be set");
            AbstractC5641l.loadAd(m2920for() == null, "Can't set both custom ordered resolutions and QualitySelector  through a groupable feature (e.g. GroupableFeatures.UHD_RECORDING)");
        } else {
            C15421l c15421lYandex = AbstractC2812l.yandex(c11550l);
            int iSubs = AbstractC12589l.subs(c11550l);
            Range rangeRemoteconfig = AbstractC12589l.remoteconfig(c11550l, C5464l.admob);
            Objects.requireNonNull(rangeRemoteconfig);
            InterfaceC15853l interfaceC15853lLoadAd = m2924throw().loadAd(iSubs, interfaceC15879l);
            C5012l c5012lYandex = m2924throw().yandex(iSubs, interfaceC15879l);
            AbstractC5088l.yandex("VideoCapture", "Update custom order resolutions: requestedDynamicRange = " + c15421lYandex + ", sessionType = " + iSubs + ", targetFrameRate = " + rangeRemoteconfig);
            List listPro = interfaceC15853lLoadAd.pro(c15421lYandex);
            StringBuilder sb = new StringBuilder("supportedQualities = ");
            sb.append(listPro);
            AbstractC5088l.yandex("VideoCapture", sb.toString());
            if (listPro.isEmpty() && iSubs == 1) {
                C8339l.metrica("No supported quality on the device for high-speed capture.");
                return null;
            }
            if (listPro.isEmpty()) {
                AbstractC5088l.tapsense("VideoCapture", "Can't find any supported quality on the device.");
            } else {
                c10136lM2920for.getClass();
                if (listPro.isEmpty()) {
                    AbstractC5088l.tapsense("QualitySelector", "No supported quality on the device.");
                    arrayList = new ArrayList();
                    c1858l = c1858l3;
                    i = iSubs;
                    range = rangeRemoteconfig;
                    c5012l = c5012lYandex;
                } else {
                    AbstractC5088l.yandex("QualitySelector", "supportedQualities = " + listPro);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = c10136lM2920for.yandex.iterator();
                    while (it2.hasNext()) {
                        C18680l c18680l = (C18680l) it2.next();
                        Iterator it3 = it2;
                        if (c18680l == C18680l.isPro) {
                            linkedHashSet.addAll(listPro);
                            break;
                        }
                        if (c18680l == C18680l.subs) {
                            ArrayList arrayList2 = new ArrayList(listPro);
                            Collections.reverse(arrayList2);
                            linkedHashSet.addAll(arrayList2);
                            break;
                        }
                        if (listPro.contains(c18680l)) {
                            linkedHashSet.add(c18680l);
                        } else {
                            AbstractC5088l.tapsense("QualitySelector", "quality is not supported and will be ignored: " + c18680l);
                        }
                        it2 = it3;
                        c1858l3 = c1858l3;
                    }
                    c1858l = c1858l3;
                    C13811l c13811l = c10136lM2920for.loadAd;
                    if (listPro.isEmpty() || linkedHashSet.containsAll(listPro)) {
                        i = iSubs;
                        range = rangeRemoteconfig;
                        c5012l = c5012lYandex;
                    } else {
                        AbstractC5088l.yandex("QualitySelector", "Select quality by fallbackStrategy = " + c13811l);
                        if (c13811l == C13811l.crashlytics) {
                            i = iSubs;
                            range = rangeRemoteconfig;
                            c5012l = c5012lYandex;
                        } else {
                            AbstractC5641l.purchase("Currently only support type RuleStrategy", c13811l instanceof C13811l);
                            ArrayList arrayList3 = new ArrayList(C18680l.remoteconfig);
                            C18680l c18680l2 = c13811l.yandex;
                            c5012l = c5012lYandex;
                            if (c18680l2 == C18680l.isPro) {
                                c18680l2 = (C18680l) arrayList3.get(0);
                            } else if (c18680l2 == C18680l.subs) {
                                c18680l2 = (C18680l) AbstractC14814l.firebase(1, arrayList3);
                            }
                            int iIndexOf = arrayList3.indexOf(c18680l2);
                            AbstractC5641l.purchase(null, iIndexOf != -1);
                            ArrayList arrayList4 = new ArrayList();
                            int i2 = iIndexOf - 1;
                            while (i2 >= 0) {
                                int i3 = i2;
                                C18680l c18680l3 = (C18680l) arrayList3.get(i2);
                                if (listPro.contains(c18680l3)) {
                                    arrayList4.add(c18680l3);
                                }
                                i2 = i3 - 1;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            range = rangeRemoteconfig;
                            i = iSubs;
                            for (int i4 = iIndexOf + 1; i4 < arrayList3.size(); i4++) {
                                C18680l c18680l4 = (C18680l) arrayList3.get(i4);
                                if (listPro.contains(c18680l4)) {
                                    arrayList5.add(c18680l4);
                                }
                            }
                            AbstractC5088l.yandex("QualitySelector", "sizeSortedQualities = " + arrayList3 + ", fallback quality = " + c18680l2 + ", largerQualities = " + arrayList4 + ", smallerQualities = " + arrayList5);
                            int i5 = c13811l.loadAd;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    C11983l.firebase(c13811l, "Unhandled fallback strategy: ");
                                    return null;
                                }
                                linkedHashSet.addAll(arrayList4);
                                linkedHashSet.addAll(arrayList5);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                AbstractC5088l.yandex("VideoCapture", "Found selectedQualities " + arrayList + " by " + c10136lM2920for);
                if (arrayList.isEmpty()) {
                    C8339l.metrica("Unable to find selected quality");
                    return null;
                }
                C4835l c4835l = (C4835l) AbstractC4338l.firebase(c11550l, C11550l.f23222l);
                Objects.requireNonNull(c4835l);
                int i6 = c16928l.loadAd;
                HashMap map = new HashMap();
                for (C18680l c18680l5 : interfaceC15853lLoadAd.pro(c15421lYandex)) {
                    Size sizeMetrica = interfaceC15853lLoadAd.metrica(c18680l5, c15421lYandex);
                    Objects.requireNonNull(sizeMetrica);
                    map.put(c18680l5, sizeMetrica);
                }
                int i7 = i;
                if (i7 == 1) {
                    Range range2 = range;
                    listAppmetrica = C5464l.admob.equals(range2) ? interfaceC15879l.advert() : interfaceC15879l.isPro(range2);
                } else {
                    listAppmetrica = interfaceC15879l.appmetrica(this.admob.firebase());
                }
                C17479l c17479l = new C17479l(listAppmetrica, map);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (C18680l c18680l6 : arrayList) {
                    List list = (List) c17479l.yandex.get(new C8277l(c18680l6, i6));
                    linkedHashMap2.put(c18680l6, list != null ? new ArrayList(list) : new ArrayList(0));
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it4 = linkedHashMap2.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        ArrayList arrayList6 = new ArrayList((Collection) entry.getValue());
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            Size size2 = (Size) it5.next();
                            if (!map.containsValue(size2)) {
                                C5012l c5012l2 = c5012l;
                                C4805l c4805lYandex = c5012l2.yandex(c15421lYandex);
                                C5680l c5680lYandex = c4805lYandex != null ? c4805lYandex.yandex(size2) : null;
                                if (c5680lYandex != null) {
                                    if (c15421lYandex.loadAd()) {
                                        c1858l2 = c1858l;
                                        interfaceC13662lM2914case = m2914case(c4835l, c5680lYandex, c1858l2, c15421lYandex);
                                    } else {
                                        c1858l2 = c1858l;
                                        int i8 = Integer.MIN_VALUE;
                                        InterfaceC13662l interfaceC13662l = null;
                                        for (C6410l c6410l : c5680lYandex.amazon) {
                                            Iterator it6 = it4;
                                            Map.Entry entry2 = entry;
                                            if (AbstractC12637l.yandex(c6410l, c15421lYandex)) {
                                                it = it5;
                                                int i9 = c6410l.isPro;
                                                HashMap map2 = AbstractC12637l.amazon;
                                                size = size2;
                                                AbstractC5641l.yandex(map2.containsKey(Integer.valueOf(i9)));
                                                Integer num = (Integer) map2.get(Integer.valueOf(i9));
                                                Objects.requireNonNull(num);
                                                int iIntValue = num.intValue();
                                                int i10 = c6410l.admob;
                                                HashMap map3 = AbstractC12637l.crashlytics;
                                                AbstractC5641l.yandex(map3.containsKey(Integer.valueOf(i10)));
                                                Integer num2 = (Integer) map3.get(Integer.valueOf(i10));
                                                Objects.requireNonNull(num2);
                                                InterfaceC13662l interfaceC13662lM2914case2 = m2914case(c4835l, c5680lYandex, c1858l2, new C15421l(iIntValue, num2.intValue()));
                                                if (interfaceC13662lM2914case2 != null) {
                                                    int iIntValue2 = ((Integer) interfaceC13662lM2914case2.mo1975l().getUpper()).intValue();
                                                    int iIntValue3 = ((Integer) interfaceC13662lM2914case2.mo1972l().getUpper()).intValue();
                                                    Size size3 = AbstractC5513l.yandex;
                                                    int i11 = iIntValue2 * iIntValue3;
                                                    if (i11 > i8) {
                                                        interfaceC13662l = interfaceC13662lM2914case2;
                                                        i8 = i11;
                                                    }
                                                }
                                            } else {
                                                it = it5;
                                                size = size2;
                                            }
                                            it4 = it6;
                                            entry = entry2;
                                            it5 = it;
                                            size2 = size;
                                        }
                                        interfaceC13662lM2914case = interfaceC13662l;
                                    }
                                    Iterator it7 = it4;
                                    Map.Entry entry3 = entry;
                                    Iterator it8 = it5;
                                    Size size4 = size2;
                                    if (interfaceC13662lM2914case != null && !interfaceC13662lM2914case.inmobi(size4.getWidth(), size4.getHeight())) {
                                        it8.remove();
                                    }
                                    it4 = it7;
                                    entry = entry3;
                                    c1858l = c1858l2;
                                    map = map;
                                    it5 = it8;
                                }
                                c5012l = c5012l2;
                            }
                        }
                        Iterator it9 = it4;
                        Map.Entry entry4 = entry;
                        C5012l c5012l3 = c5012l;
                        C1858l c1858l4 = c1858l;
                        HashMap map4 = map;
                        if (!arrayList6.isEmpty()) {
                            linkedHashMap3.put((C18680l) entry4.getKey(), arrayList6);
                        }
                        it4 = it9;
                        c1858l = c1858l4;
                        map = map4;
                        c5012l = c5012l3;
                    }
                    linkedHashMap = linkedHashMap3;
                }
                C5012l c5012l4 = c5012l;
                if (i7 == 1) {
                    C5104l c5104lAdcel = interfaceC16651l.adcel();
                    C6916l c6916l = InterfaceC0048l.f930l;
                    HashMap map5 = new HashMap();
                    for (Map.Entry entry5 : linkedHashMap.entrySet()) {
                        C18680l c18680l7 = (C18680l) entry5.getKey();
                        C4805l c4805lYandex2 = c5012l4.yandex(c15421lYandex);
                        C5680l c5680lLoadAd = c4805lYandex2 != null ? c4805lYandex2.loadAd(c18680l7) : null;
                        Objects.requireNonNull(c5680lLoadAd);
                        int i12 = c5680lLoadAd.billing.amazon;
                        Iterator it10 = ((List) entry5.getValue()).iterator();
                        while (it10.hasNext()) {
                            map5.put((Size) it10.next(), Integer.valueOf(i12));
                        }
                    }
                    c5104lAdcel.mopub(c6916l, map5);
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it11 = linkedHashMap.values().iterator();
                while (it11.hasNext()) {
                    arrayList7.addAll((List) it11.next());
                }
                AbstractC5088l.yandex("VideoCapture", "Set custom ordered resolutions = " + arrayList7);
                interfaceC16651l.adcel().mopub(InterfaceC4089l.f8422native, arrayList7);
            }
        }
        return interfaceC16651l.Signature();
    }

    @Override // defpackage.AbstractC6896l
    public final void ad() {
        AbstractC5088l.yandex("VideoCapture", "VideoCapture#onStateDetached");
        AbstractC5641l.purchase("VideoCapture can only be detached on the main thread.", AbstractC12225l.purchase());
        if (this.applovin != null) {
            m2924throw().billing().remoteconfig(this.applovin);
            this.applovin.loadAd();
            this.applovin = null;
        }
        if (3 != this.advert) {
            this.advert = 3;
            m2924throw().amazon(3);
        }
        m2924throw().purchase().remoteconfig(this.inmobi);
        C16565l c16565l = this.pro;
        if (c16565l != null && c16565l.cancel(false)) {
            AbstractC5088l.yandex("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        m2921native();
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l advert(InterfaceC17944l interfaceC17944l) {
        this.license.yandex(interfaceC17944l);
        Object[] objArr = {this.license.crashlytics()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2081throws(DesugarCollections.unmodifiableList(arrayList));
        C5464l c5464l = this.subs;
        Objects.requireNonNull(c5464l);
        C6472l c6472lLoadAd = c5464l.loadAd();
        c6472lLoadAd.f13510l = interfaceC17944l;
        return c6472lLoadAd.yandex();
    }

    @Override // defpackage.AbstractC6896l
    public final void appmetrica(Rect rect) {
        this.firebase = rect;
        m2923switch();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final boolean m2917catch(InterfaceC18690l interfaceC18690l, C11550l c11550l, int i, Rect rect, Size size, C15421l c15421l) {
        if (i == 1) {
            return false;
        }
        if (interfaceC18690l.metrica()) {
            c11550l.getClass();
            Boolean bool = (Boolean) ((C7420l) c11550l.subs()).smaato(C11550l.f23224l, Boolean.FALSE);
            Objects.requireNonNull(bool);
            if (!bool.booleanValue()) {
                if (interfaceC18690l.metrica() || (!AbstractC12589l.m3426throw(AbstractC1469l.yandex) && !AbstractC12589l.m3426throw(interfaceC18690l.adcel().applovin()))) {
                    HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) AbstractC1469l.yandex.loadAd(HdrRepeatingRequestFailureQuirk.class);
                    if (!interfaceC18690l.metrica() && hdrRepeatingRequestFailureQuirk != null) {
                        boolean z = c15421l != C15421l.amazon;
                        if (!"samsung".equalsIgnoreCase(Build.BRAND) || !"pa3q".equalsIgnoreCase(Build.DEVICE) || !z) {
                            if (size.getWidth() == rect.width()) {
                                if (!interfaceC18690l.metrica()) {
                                }
                                this.Signature.getClass();
                                return false;
                            }
                        }
                    } else if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
                        if (!interfaceC18690l.metrica() && vip(interfaceC18690l)) {
                            return true;
                        }
                        this.Signature.getClass();
                        return false;
                    }
                }
            }
        } else if (interfaceC18690l.metrica()) {
            HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk2 = (HdrRepeatingRequestFailureQuirk) AbstractC1469l.yandex.loadAd(HdrRepeatingRequestFailureQuirk.class);
            if (!interfaceC18690l.metrica()) {
                if (size.getWidth() == rect.width()) {
                    if (!interfaceC18690l.metrica()) {
                    }
                    this.Signature.getClass();
                    return false;
                }
            } else if (size.getWidth() == rect.width()) {
                if (!interfaceC18690l.metrica()) {
                }
                this.Signature.getClass();
                return false;
            }
        } else {
            HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk3 = (HdrRepeatingRequestFailureQuirk) AbstractC1469l.yandex.loadAd(HdrRepeatingRequestFailureQuirk.class);
            if (!interfaceC18690l.metrica()) {
                if (size.getWidth() == rect.width()) {
                    if (!interfaceC18690l.metrica()) {
                    }
                    this.Signature.getClass();
                    return false;
                }
            } else if (size.getWidth() == rect.width()) {
                if (!interfaceC18690l.metrica()) {
                }
                this.Signature.getClass();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m2918else() {
        if (amazon() == null) {
            return;
        }
        m2921native();
        C11550l c11550l = (C11550l) this.admob;
        C5464l c5464l = this.subs;
        c5464l.getClass();
        C16774l c16774lM2922private = m2922private(c11550l, c5464l);
        this.license = c16774lM2922private;
        m2925volatile(c16774lM2922private, this.Signature, this.subs);
        Object[] objArr = {this.license.crashlytics()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2081throws(DesugarCollections.unmodifiableList(arrayList));
        adcel();
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final int m2919extends(InterfaceC18690l interfaceC18690l) {
        int iSubs = subs(interfaceC18690l, vip(interfaceC18690l));
        this.Signature.getClass();
        return iSubs;
    }

    @Override // defpackage.AbstractC6896l
    public final Set firebase() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final C10136l m2920for() {
        HashSet<AbstractC5295l> hashSet = this.mopub;
        if (hashSet == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC5295l abstractC5295l : hashSet) {
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C10136l c10136l = C10136l.crashlytics;
        return C10136l.yandex(arrayList, C13811l.crashlytics);
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l isVip(C5464l c5464l, C5464l c5464l2) {
        Size size = c5464l.yandex;
        AbstractC5088l.yandex("VideoCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c5464l + ", secondaryStreamSpec " + c5464l2);
        C11550l c11550l = (C11550l) this.admob;
        c11550l.getClass();
        ArrayList arrayListLoadAd = AbstractC17666l.loadAd(c11550l);
        if (arrayListLoadAd != null && !arrayListLoadAd.contains(size)) {
            AbstractC5088l.tapsense("VideoCapture", "suggested resolution " + size + " is not in custom ordered resolutions " + arrayListLoadAd);
        }
        return c5464l;
    }

    @Override // defpackage.AbstractC6896l
    public final void license(int i) {
        if (applovin(i)) {
            m2923switch();
        }
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l mopub(boolean z, InterfaceC10139l interfaceC10139l) {
        f21240throws.getClass();
        C11550l c11550l = C1335l.yandex;
        c11550l.getClass();
        InterfaceC17944l interfaceC17944lYandex = interfaceC10139l.yandex(AbstractC12589l.loadAd(c11550l), 1);
        if (z) {
            interfaceC17944lYandex = AbstractC11043l.ads(interfaceC17944lYandex, c11550l);
        }
        if (interfaceC17944lYandex == null) {
            return null;
        }
        return new C11550l(C7420l.yandex(((C14929l) smaato(interfaceC17944lYandex)).f29382l));
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m2921native() {
        AbstractC12225l.crashlytics();
        C2525l c2525l = this.appmetrica;
        if (c2525l != null) {
            c2525l.loadAd();
            this.appmetrica = null;
        }
        AbstractC0958l abstractC0958l = this.subscription;
        if (abstractC0958l != null) {
            abstractC0958l.yandex();
            this.subscription = null;
        }
        C10038l c10038l = this.isVip;
        if (c10038l != null) {
            c10038l.m2866transient();
            this.isVip = null;
        }
        C3716l c3716l = this.tapsense;
        if (c3716l != null) {
            c3716l.crashlytics();
            this.tapsense = null;
        }
        this.signatures = null;
        this.ad = null;
        this.Signature = C13629l.crashlytics;
        this.premium = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final C16774l m2922private(C11550l c11550l, C5464l c5464l) {
        Object obj;
        InterfaceC18690l interfaceC18690l;
        int i;
        C15421l c15421l;
        int i2;
        C10038l c10038l;
        EnumC8920l enumC8920l;
        C11550l c11550l2;
        C10418l c10418l = this;
        AbstractC12225l.crashlytics();
        InterfaceC18690l interfaceC18690lAmazon = c10418l.amazon();
        interfaceC18690lAmazon.getClass();
        Size size = c5464l.yandex;
        RunnableC6665l runnableC6665l = new RunnableC6665l(15, c10418l);
        Range range = c5464l.purchase;
        if (Objects.equals(range, C5464l.admob)) {
            range = c5464l.amazon == 1 ? C1335l.crashlytics : C1335l.loadAd;
        }
        Range range2 = range;
        ListenableFuture listenableFutureMopub = c10418l.m2924throw().crashlytics().mopub();
        if (listenableFutureMopub.isDone()) {
            try {
                obj = listenableFutureMopub.get();
            } catch (InterruptedException | ExecutionException e) {
                C11983l.ads(e);
                return null;
            }
        } else {
            obj = null;
        }
        C1858l c1858l = (C1858l) obj;
        Objects.requireNonNull(c1858l);
        int i3 = c5464l.amazon;
        C5012l c5012lYandex = c10418l.m2924throw().yandex(i3, interfaceC18690lAmazon.loadAd());
        C15421l c15421l2 = c5464l.crashlytics;
        C4805l c4805lYandex = c5012lYandex.yandex(c15421l2);
        C5680l c5680lYandex = c4805lYandex != null ? c4805lYandex.yandex(size) : null;
        c11550l.getClass();
        C4835l c4835l = (C4835l) AbstractC4338l.firebase(c11550l, C11550l.f23222l);
        Objects.requireNonNull(c4835l);
        InterfaceC13662l interfaceC13662lM2914case = m2914case(c4835l, c5680lYandex, c1858l, c15421l2);
        c10418l.premium = c10418l.m2919extends(interfaceC18690lAmazon);
        Rect rect = c10418l.firebase;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        int i4 = 3;
        if (interfaceC13662lM2914case == null || interfaceC13662lM2914case.inmobi(rect.width(), rect.height())) {
            interfaceC18690l = interfaceC18690lAmazon;
            i = i3;
            c15421l = c15421l2;
            i2 = 0;
        } else {
            AbstractC5088l.yandex("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", AbstractC18611l.mopub(rect), Integer.valueOf(interfaceC13662lM2914case.mo1976native()), Integer.valueOf(interfaceC13662lM2914case.mo1974l()), interfaceC13662lM2914case.mo1975l(), interfaceC13662lM2914case.mo1972l()));
            InterfaceC13662l c6203l = (!(interfaceC13662lM2914case.mo1975l().contains(Integer.valueOf(rect.width())) && interfaceC13662lM2914case.mo1972l().contains(Integer.valueOf(rect.height()))) && interfaceC13662lM2914case.mo1969default() && interfaceC13662lM2914case.mo1972l().contains(Integer.valueOf(rect.width())) && interfaceC13662lM2914case.mo1975l().contains(Integer.valueOf(rect.height()))) ? new C6203l(interfaceC13662lM2914case) : interfaceC13662lM2914case;
            int iMo1976native = c6203l.mo1976native();
            int iMo1974l = c6203l.mo1974l();
            Range rangeMo1975l = c6203l.mo1975l();
            interfaceC18690l = interfaceC18690lAmazon;
            Range rangeMo1972l = c6203l.mo1972l();
            i = i3;
            int iM2915strictfp = m2915strictfp(true, rect.width(), iMo1976native, rangeMo1975l);
            c15421l = c15421l2;
            int iM2915strictfp2 = m2915strictfp(false, rect.width(), iMo1976native, rangeMo1975l);
            int iM2915strictfp3 = m2915strictfp(true, rect.height(), iMo1974l, rangeMo1972l);
            int iM2915strictfp4 = m2915strictfp(false, rect.height(), iMo1974l, rangeMo1972l);
            HashSet hashSet = new HashSet();
            m2916synchronized(hashSet, iM2915strictfp, iM2915strictfp3, size, c6203l);
            m2916synchronized(hashSet, iM2915strictfp, iM2915strictfp4, size, c6203l);
            m2916synchronized(hashSet, iM2915strictfp2, iM2915strictfp3, size, c6203l);
            m2916synchronized(hashSet, iM2915strictfp2, iM2915strictfp4, size, c6203l);
            if (hashSet.isEmpty()) {
                AbstractC5088l.tapsense("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                AbstractC5088l.yandex("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new C9933l(5, rect));
                AbstractC5088l.yandex("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == rect.width() && height == rect.height()) {
                    AbstractC5088l.yandex("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    AbstractC5641l.purchase(null, width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
                    Rect rect2 = new Rect(rect);
                    if (width != rect.width()) {
                        int iMax = Math.max(0, rect.centerX() - (width / 2));
                        rect2.left = iMax;
                        int i5 = iMax + width;
                        rect2.right = i5;
                        if (i5 > size.getWidth()) {
                            int width2 = size.getWidth();
                            rect2.right = width2;
                            rect2.left = width2 - width;
                        }
                    }
                    if (height != rect.height()) {
                        i2 = 0;
                        int iMax2 = Math.max(0, rect.centerY() - (height / 2));
                        rect2.top = iMax2;
                        int i6 = iMax2 + height;
                        rect2.bottom = i6;
                        if (i6 > size.getHeight()) {
                            int height2 = size.getHeight();
                            rect2.bottom = height2;
                            rect2.top = height2 - height;
                        }
                    } else {
                        i2 = 0;
                    }
                    AbstractC5088l.yandex("VideoCapture", "Adjust cropRect from " + AbstractC18611l.mopub(rect) + " to " + AbstractC18611l.mopub(rect2));
                    rect = rect2;
                }
            }
            i2 = 0;
        }
        c10418l.Signature.getClass();
        c10418l.signatures = rect;
        c10418l.Signature.getClass();
        c10418l.Signature.getClass();
        Rect rect3 = c10418l.signatures;
        int i7 = c10418l.premium;
        InterfaceC18690l interfaceC18690l2 = interfaceC18690l;
        int i8 = i;
        C15421l c15421l3 = c15421l;
        boolean zM2917catch = c10418l.m2917catch(interfaceC18690l2, c11550l, i8, rect3, size, c15421l3);
        if (((SizeCannotEncodeVideoQuirk) AbstractC1469l.yandex.loadAd(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!zM2917catch) {
                i7 = i2;
            }
            Size sizeAdmob = AbstractC18611l.admob(i7, AbstractC18611l.billing(rect3));
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(sizeAdmob)) {
                int iMo1974l2 = interfaceC13662lM2914case != null ? interfaceC13662lM2914case.mo1974l() / 2 : 8;
                Rect rect4 = new Rect(rect3);
                if (rect3.width() == sizeAdmob.getHeight()) {
                    rect4.left += iMo1974l2;
                    rect4.right -= iMo1974l2;
                } else {
                    rect4.top += iMo1974l2;
                    rect4.bottom -= iMo1974l2;
                }
                rect3 = rect4;
            }
        }
        c10418l.signatures = rect3;
        if (c10418l.m2917catch(interfaceC18690l2, c11550l, i8, rect3, size, c15421l3)) {
            AbstractC5088l.yandex("VideoCapture", "Surface processing is enabled.");
            InterfaceC18690l interfaceC18690lAmazon2 = c10418l.amazon();
            Objects.requireNonNull(interfaceC18690lAmazon2);
            c10038l = new C10038l(interfaceC18690lAmazon2, new C8857l(c15421l3), "VideoCapture");
        } else {
            c10038l = null;
        }
        c10418l.isVip = c10038l;
        boolean z = (interfaceC18690l2.metrica() && c10418l.isVip == null) ? false : true;
        EnumC8920l enumC8920lStartapp = (c10418l.isVip == null && interfaceC18690l2.metrica()) ? EnumC8920l.f18385l : interfaceC18690l2.adcel().startapp();
        AbstractC5088l.yandex("VideoCapture", "camera timebase = " + interfaceC18690l2.adcel().startapp() + ", processing timebase = " + enumC8920lStartapp);
        C6472l c6472lLoadAd = c5464l.loadAd();
        c6472lLoadAd.f13512l = size;
        if (range2 == null) {
            C6541l.subs("Null expectedFrameRateRange");
            return null;
        }
        c6472lLoadAd.f13516l = range2;
        C5464l c5464lYandex = c6472lLoadAd.yandex();
        AbstractC5641l.purchase(null, c10418l.tapsense == null);
        C3716l c3716l = new C3716l(2, 34, c5464lYandex, c10418l.smaato, interfaceC18690l2.metrica(), c10418l.signatures, c10418l.premium, ((InterfaceC4089l) c10418l.admob).mo1486this(), interfaceC18690l2.metrica() && c10418l.vip(interfaceC18690l2));
        c10418l.tapsense = c3716l;
        c3716l.yandex(runnableC6665l);
        C10038l c10038l2 = c10418l.isVip;
        C3716l c3716l2 = c10418l.tapsense;
        if (c10038l2 != null) {
            int i9 = c3716l2.billing;
            int i10 = c3716l2.yandex;
            Rect rect5 = c3716l2.amazon;
            C6822l c6822l = new C6822l(UUID.randomUUID(), i9, i10, rect5, AbstractC18611l.admob(c3716l2.subs, AbstractC18611l.billing(rect5)), c3716l2.subs, c3716l2.purchase);
            C3716l c3716l3 = (C3716l) c10418l.isVip.m2853l(new C12512l(c10418l.tapsense, Collections.singletonList(c6822l))).get(c6822l);
            Objects.requireNonNull(c3716l3);
            enumC8920l = enumC8920lStartapp;
            c10418l = this;
            c11550l2 = c11550l;
            c3716l3.yandex(new RunnableC9600l(this, c3716l3, interfaceC18690l2, c11550l, enumC8920l, z, 2));
            c10418l.ad = c3716l3.amazon(interfaceC18690l2, true);
            C3716l c3716l4 = c10418l.tapsense;
            c3716l4.getClass();
            AbstractC12225l.crashlytics();
            c3716l4.loadAd();
            AbstractC5641l.purchase("Consumer can only be linked once.", !c3716l4.isPro);
            c3716l4.isPro = true;
            C10500l c10500l = c3716l4.smaato;
            c10418l.subscription = c10500l;
            AbstractC11356l.admob(c10500l.purchase).yandex(new RunnableC10311l(c10418l, c10500l, 20), AbstractC12272l.admob());
        } else {
            enumC8920l = enumC8920lStartapp;
            c11550l2 = c11550l;
            C15691l c15691lAmazon = c3716l2.amazon(interfaceC18690l2, true);
            c10418l.ad = c15691lAmazon;
            c10418l.subscription = c15691lAmazon.remoteconfig;
        }
        InterfaceC14105l interfaceC14105l = (InterfaceC14105l) AbstractC4338l.firebase(c11550l2, C11550l.f23223l);
        Objects.requireNonNull(interfaceC14105l);
        interfaceC14105l.admob(c10418l.ad, enumC8920l, z);
        c10418l.m2923switch();
        c10418l.subscription.isPro = MediaCodec.class;
        C16774l c16774lAmazon = C16774l.amazon(c11550l2, c5464l.yandex);
        c16774lAmazon.admob = i8;
        c10418l.yandex(c16774lAmazon, c5464l);
        int iStartapp = AbstractC12589l.startapp(c11550l2);
        if (iStartapp != 0) {
            C9598l c9598l = c16774lAmazon.loadAd;
            c9598l.getClass();
            if (iStartapp != 0) {
                ((C5104l) c9598l.f19553l).mopub(InterfaceC0048l.f921l, Integer.valueOf(iStartapp));
            }
        }
        C2525l c2525l = c10418l.appmetrica;
        if (c2525l != null) {
            c2525l.loadAd();
        }
        C2525l c2525l2 = new C2525l(new C12717l(i4, c10418l));
        c10418l.appmetrica = c2525l2;
        c16774lAmazon.billing = c2525l2;
        InterfaceC17944l interfaceC17944l = c5464l.billing;
        if (interfaceC17944l != null) {
            c16774lAmazon.loadAd.license(interfaceC17944l);
        }
        return c16774lAmazon;
    }

    @Override // defpackage.AbstractC6896l
    public final void pro() {
        AbstractC5088l.yandex("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + billing());
        C5464l c5464l = this.subs;
        if (c5464l == null || this.ad != null) {
            return;
        }
        InterfaceC10367l interfaceC10367lPurchase = m2924throw().purchase();
        Object obj = C13629l.crashlytics;
        ListenableFuture listenableFutureMopub = interfaceC10367lPurchase.mopub();
        if (listenableFutureMopub.isDone()) {
            try {
                obj = listenableFutureMopub.get();
            } catch (InterruptedException | ExecutionException e) {
                C11983l.ads(e);
                return;
            }
        }
        this.Signature = (C13629l) obj;
        C16774l c16774lM2922private = m2922private((C11550l) this.admob, c5464l);
        this.license = c16774lM2922private;
        m2925volatile(c16774lM2922private, this.Signature, c5464l);
        Object[] objArr = {this.license.crashlytics()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        m2081throws(DesugarCollections.unmodifiableList(arrayList));
        startapp();
        m2924throw().purchase().amazon(AbstractC12272l.admob(), this.inmobi);
        C14739l c14739l = this.applovin;
        if (c14739l != null) {
            c14739l.loadAd();
        }
        InterfaceC10408l interfaceC10408lPurchase = purchase();
        C14739l c14739l2 = new C14739l();
        c14739l2.loadAd = false;
        c14739l2.yandex = interfaceC10408lPurchase;
        this.applovin = c14739l2;
        m2924throw().billing().amazon(AbstractC12272l.admob(), this.applovin);
        if (2 != this.advert) {
            this.advert = 2;
            m2924throw().amazon(2);
        }
    }

    @Override // defpackage.AbstractC6896l
    public final boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC16651l smaato(InterfaceC17944l interfaceC17944l) {
        return new C14929l(C5104l.amazon(interfaceC17944l), 3);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m2923switch() {
        InterfaceC18690l interfaceC18690lAmazon = amazon();
        C3716l c3716l = this.tapsense;
        if (interfaceC18690lAmazon == null || c3716l == null) {
            return;
        }
        int iM2919extends = m2919extends(interfaceC18690lAmazon);
        this.premium = iM2919extends;
        AbstractC12225l.firebase(new RunnableC7500l(c3716l, iM2919extends, ((InterfaceC4089l) this.admob).mo1486this()));
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final InterfaceC14105l m2924throw() {
        C11550l c11550l = (C11550l) this.admob;
        c11550l.getClass();
        InterfaceC14105l interfaceC14105l = (InterfaceC14105l) AbstractC4338l.firebase(c11550l, C11550l.f23223l);
        Objects.requireNonNull(interfaceC14105l);
        return interfaceC14105l;
    }

    public final String toString() {
        return "VideoCapture:".concat(admob());
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m2925volatile(C16774l c16774l, C13629l c13629l, C5464l c5464l) {
        AbstractC0958l abstractC0958l;
        int i = 0;
        boolean z = c13629l.yandex == -1;
        boolean z2 = c13629l.loadAd == 1;
        if (z && z2) {
            C8339l.smaato("Unexpected stream state, stream is error but active");
            return;
        }
        c16774l.yandex.clear();
        ((HashSet) c16774l.loadAd.f19549l).clear();
        C15421l c15421l = c5464l.crashlytics;
        if (!z && (abstractC0958l = this.subscription) != null) {
            if (z2) {
                c16774l.loadAd(abstractC0958l, c15421l, -1);
            } else {
                C11644l c11644lYandex = C14113l.yandex(abstractC0958l);
                if (c15421l == null) {
                    C6541l.subs("Null dynamicRange");
                    return;
                } else {
                    c11644lYandex.f23362l = c15421l;
                    c16774l.yandex.add(c11644lYandex.m3173l());
                }
            }
        }
        C16565l c16565l = this.pro;
        if (c16565l != null && c16565l.cancel(false)) {
            AbstractC5088l.yandex("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        C16565l c16565lPurchase = AbstractC11064l.purchase(new C4568l(this, c16774l));
        this.pro = c16565lPurchase;
        c16565lPurchase.yandex(new RunnableC9929l(c16565lPurchase, new C8634l(this, c16565lPurchase, z2, 15), i), AbstractC12272l.admob());
    }
}
