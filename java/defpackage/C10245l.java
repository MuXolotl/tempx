package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lَّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10245l extends AbstractC6896l {
    public final C0458l Signature;
    public C11644l ad;
    public C3716l advert;
    public C16774l applovin;
    public C16774l appmetrica;
    public C2525l inmobi;
    public C3716l isVip;
    public final C0458l license;
    public C3716l premium;
    public C10038l pro;
    public C3716l signatures;
    public final C5307l subscription;
    public final C2091l tapsense;

    public C10245l(InterfaceC18690l interfaceC18690l, InterfaceC18690l interfaceC18690l2, C0458l c0458l, C0458l c0458l2, HashSet hashSet, InterfaceC10139l interfaceC10139l) {
        super(m2903private(hashSet));
        this.subscription = m2903private(hashSet);
        this.Signature = c0458l;
        this.license = c0458l2;
        this.tapsense = new C2091l(interfaceC18690l, interfaceC18690l2, hashSet, interfaceC10139l, new C18262l(7));
        HashSet hashSet2 = ((AbstractC6896l) hashSet.iterator().next()).mopub;
        this.mopub = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static C5307l m2903private(HashSet hashSet) {
        C5104l c5104lCrashlytics = C5104l.crashlytics();
        new C10975l(c5104lCrashlytics);
        c5104lCrashlytics.mopub(InterfaceC16352l.advert, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
            if (abstractC6896l.admob.mo861strictfp(InterfaceC0048l.f919l)) {
                arrayList.add(abstractC6896l.admob.mo256native());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        c5104lCrashlytics.mopub(C5307l.f11424l, arrayList);
        c5104lCrashlytics.mopub(InterfaceC4089l.inmobi, 2);
        c5104lCrashlytics.mopub(InterfaceC0048l.f926l, EnumC18632l.PREVIEW_VIDEO_STILL);
        return new C5307l(C7420l.yandex(c5104lCrashlytics));
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01c8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l Signature(InterfaceC15879l interfaceC15879l, InterfaceC16651l interfaceC16651l) {
        InterfaceC0048l interfaceC0048l;
        Object c15421l;
        ?? r6;
        ?? r5;
        C5104l c5104lAdcel = interfaceC16651l.adcel();
        C2091l c2091l = this.tapsense;
        HashSet hashSet = c2091l.f4691l;
        C12642l c12642l = c2091l.f4693l;
        List listAppmetrica = c12642l.billing.appmetrica(34);
        HashSet<InterfaceC0048l> hashSet2 = c12642l.amazon;
        for (InterfaceC0048l interfaceC0048l2 : hashSet2) {
            if (!interfaceC0048l2.license() && (interfaceC0048l2 instanceof InterfaceC4089l)) {
                ((InterfaceC4089l) interfaceC0048l2).ad();
            }
        }
        InterfaceC0048l interfaceC0048l3 = null;
        List list = (List) c5104lAdcel.smaato(InterfaceC4089l.f8424strictfp, null);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    listAppmetrica = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).equals(34)) {
                    listAppmetrica = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
        }
        Rational rational = c12642l.crashlytics;
        ArrayList arrayList = new ArrayList();
        HashSet<Size> hashSet3 = new HashSet();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            hashSet3.addAll(c12642l.crashlytics((InterfaceC0048l) it2.next()));
        }
        for (Size size : hashSet3) {
            Rational rational2 = AbstractC14608l.yandex;
            if (!AbstractC14608l.yandex(size, rational, AbstractC5513l.crashlytics)) {
                arrayList.addAll(c12642l.mopub(c12642l.loadAd, listAppmetrica, false));
                break;
            }
        }
        int size2 = arrayList.size();
        if (!hashSet2.isEmpty()) {
            Iterator it3 = hashSet2.iterator();
            loop9: while (true) {
                if (!it3.hasNext()) {
                    interfaceC0048l = interfaceC0048l3;
                    size2 = 0;
                    break;
                }
                boolean z = false;
                boolean z2 = false;
                for (Size size3 : c12642l.crashlytics((InterfaceC0048l) it3.next())) {
                    Rational rational3 = AbstractC14608l.yandex;
                    interfaceC0048l = interfaceC0048l3;
                    boolean zYandex = AbstractC14608l.yandex(size3, rational, AbstractC5513l.crashlytics);
                    if (zYandex) {
                        z = true;
                    }
                    if (z2 && zYandex) {
                        break loop9;
                    }
                    if (!zYandex) {
                        z2 = true;
                    }
                    interfaceC0048l3 = interfaceC0048l;
                }
                interfaceC0048l = interfaceC0048l3;
                if (!z) {
                    break;
                }
                interfaceC0048l3 = interfaceC0048l;
            }
        } else {
            interfaceC0048l = null;
        }
        arrayList.addAll(size2, c12642l.mopub(rational, listAppmetrica, false));
        arrayList.addAll(c12642l.billing(listAppmetrica, false));
        if (arrayList.isEmpty()) {
            AbstractC5088l.tapsense("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(c12642l.billing(listAppmetrica, true));
        }
        AbstractC5088l.yandex("ResolutionsMerger", "Parent resolutions: " + arrayList);
        c5104lAdcel.mopub(InterfaceC4089l.f8422native, arrayList);
        C6916l c6916l = InterfaceC0048l.f920l;
        Iterator it4 = hashSet.iterator();
        int iMax = 0;
        while (it4.hasNext()) {
            iMax = Math.max(iMax, ((InterfaceC0048l) it4.next()).subscription());
        }
        c5104lAdcel.mopub(c6916l, Integer.valueOf(iMax));
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((InterfaceC0048l) it5.next()).loadAd());
        }
        if (arrayList2.isEmpty()) {
            c15421l = interfaceC0048l;
            break;
        }
        C15421l c15421l2 = (C15421l) arrayList2.get(0);
        Integer numValueOf = Integer.valueOf(c15421l2.yandex);
        int i = 1;
        ?? ValueOf = Integer.valueOf(c15421l2.loadAd);
        ?? r7 = numValueOf;
        while (true) {
            if (i >= arrayList2.size()) {
                c15421l = new C15421l(r7.intValue(), ValueOf.intValue());
                break;
            }
            C15421l c15421l3 = (C15421l) arrayList2.get(i);
            Integer numValueOf2 = Integer.valueOf(c15421l3.yandex);
            if (r7.equals(0)) {
                r6 = r7;
                r6 = numValueOf2;
            } else if (!numValueOf2.equals(0)) {
                if (!r7.equals(2) || numValueOf2.equals(1)) {
                    r6 = r7;
                    r6 = r7;
                    if (!numValueOf2.equals(2) || r7.equals(1)) {
                        r6 = r7;
                        boolean zEquals = r7.equals(numValueOf2);
                        r6 = r7;
                        if (!zEquals) {
                            r6 = interfaceC0048l;
                        }
                    }
                } else {
                    r6 = r7;
                    r6 = numValueOf2;
                }
            }
            r6 = r7;
            r6 = r7;
            Integer numValueOf3 = Integer.valueOf(c15421l3.loadAd);
            if (ValueOf.equals(0)) {
                r5 = numValueOf3;
            } else if (!numValueOf3.equals(0) && !ValueOf.equals(numValueOf3)) {
                r5 = ValueOf;
                r5 = ValueOf;
                r5 = interfaceC0048l;
            }
            if (r6 == 0 || r5 == 0) {
                c15421l = interfaceC0048l;
                break;
            }
            i++;
            ValueOf = r5;
            r7 = r6;
        }
        if (c15421l == null) {
            C8339l.metrica("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return interfaceC0048l;
        }
        c5104lAdcel.mopub(InterfaceC16352l.signatures, c15421l);
        C6916l c6916l2 = InterfaceC0048l.f924l;
        Range rangeExtend = C5464l.admob;
        Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            Range rangeMo251catch = ((InterfaceC0048l) it6.next()).mo251catch(rangeExtend);
            Objects.requireNonNull(rangeMo251catch);
            if (C5464l.admob.equals(rangeExtend)) {
                rangeExtend = rangeMo251catch;
            } else {
                try {
                    rangeExtend = rangeExtend.intersect(rangeMo251catch);
                } catch (IllegalArgumentException unused) {
                    AbstractC5088l.yandex("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeExtend + " <<>> " + rangeMo251catch);
                    rangeExtend = rangeExtend.extend(rangeMo251catch);
                }
            }
        }
        c5104lAdcel.mopub(c6916l2, rangeExtend);
        Iterator it7 = c2091l.f4686l.iterator();
        while (it7.hasNext()) {
            InterfaceC0048l interfaceC0048l4 = (InterfaceC0048l) c2091l.f4687l.get((AbstractC6896l) it7.next());
            Objects.requireNonNull(interfaceC0048l4);
            if (interfaceC0048l4.mo258private() != 0) {
                c5104lAdcel.mopub(InterfaceC0048l.f921l, Integer.valueOf(interfaceC0048l4.mo258private()));
            }
            if (interfaceC0048l4.mo259static() != 0) {
                c5104lAdcel.mopub(InterfaceC0048l.f918l, Integer.valueOf(interfaceC0048l4.mo259static()));
            }
        }
        return interfaceC16651l.Signature();
    }

    @Override // defpackage.AbstractC6896l
    public final void ad() {
        Iterator it = this.tapsense.f4686l.iterator();
        while (it.hasNext()) {
            ((AbstractC6896l) it.next()).ad();
        }
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l advert(InterfaceC17944l interfaceC17944l) {
        this.applovin.yandex(interfaceC17944l);
        Object[] objArr = {this.applovin.crashlytics()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2081throws(DesugarCollections.unmodifiableList(arrayList));
        C6472l c6472lLoadAd = this.subs.loadAd();
        c6472lLoadAd.f13510l = interfaceC17944l;
        return c6472lLoadAd.yandex();
    }

    @Override // defpackage.AbstractC6896l
    public final Set firebase() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l isVip(C5464l c5464l, C5464l c5464l2) {
        AbstractC5088l.yandex("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c5464l + ", secondaryStreamSpec " + c5464l2);
        m2081throws(m2905strictfp(billing(), isPro() == null ? null : isPro().adcel().mopub(), this.admob, c5464l, c5464l2));
        startapp();
        return c5464l;
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l mopub(boolean z, InterfaceC10139l interfaceC10139l) {
        C5307l c5307l = this.subscription;
        c5307l.getClass();
        InterfaceC17944l interfaceC17944lYandex = interfaceC10139l.yandex(AbstractC12589l.loadAd(c5307l), 1);
        if (z) {
            interfaceC17944lYandex = AbstractC11043l.ads(interfaceC17944lYandex, c5307l.f11425l);
        }
        if (interfaceC17944lYandex == null) {
            return null;
        }
        return ((C10975l) smaato(interfaceC17944lYandex)).Signature();
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final C16774l m2904native(C3716l c3716l, InterfaceC0048l interfaceC0048l, C5464l c5464l) {
        C16774l c16774lAmazon = C16774l.amazon(interfaceC0048l, c5464l.yandex);
        C9598l c9598l = c16774lAmazon.loadAd;
        C2091l c2091l = this.tapsense;
        Iterator it = c2091l.f4686l.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((AbstractC6896l) it.next()).admob.ads().mopub.crashlytics;
            List list = C10814l.isPro;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            c9598l.f19550l = i;
        }
        Size size = c5464l.yandex;
        Iterator it2 = c2091l.f4686l.iterator();
        while (it2.hasNext()) {
            C10814l c10814lCrashlytics = C16774l.amazon(((AbstractC6896l) it2.next()).admob, size).crashlytics();
            C0665l c0665l = c10814lCrashlytics.mopub;
            c9598l.billing(c0665l.amazon);
            List<AbstractC4829l> list2 = c10814lCrashlytics.purchase;
            ArrayList arrayList = c16774lAmazon.purchase;
            for (AbstractC4829l abstractC4829l : list2) {
                c9598l.tapsense(abstractC4829l);
                if (!arrayList.contains(abstractC4829l)) {
                    arrayList.add(abstractC4829l);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c10814lCrashlytics.amazon) {
                ArrayList arrayList2 = c16774lAmazon.amazon;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c10814lCrashlytics.crashlytics) {
                ArrayList arrayList3 = c16774lAmazon.crashlytics;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            c9598l.license(c0665l.loadAd);
        }
        c3716l.getClass();
        AbstractC12225l.crashlytics();
        c3716l.loadAd();
        AbstractC5641l.purchase("Consumer can only be linked once.", !c3716l.isPro);
        c3716l.isPro = true;
        c16774lAmazon.loadAd(c3716l.smaato, c5464l.crashlytics, -1);
        c9598l.tapsense(c2091l.f4684l);
        InterfaceC17944l interfaceC17944l = c5464l.billing;
        if (interfaceC17944l != null) {
            c9598l.license(interfaceC17944l);
        }
        c16774lAmazon.admob = c5464l.amazon;
        yandex(c16774lAmazon, c5464l);
        return c16774lAmazon;
    }

    @Override // defpackage.AbstractC6896l
    public final void pro() {
        Iterator it = this.tapsense.f4686l.iterator();
        while (it.hasNext()) {
            ((AbstractC6896l) it.next()).pro();
        }
    }

    @Override // defpackage.AbstractC6896l
    public final void signatures() {
        m2906synchronized();
        C2091l c2091l = this.tapsense;
        for (AbstractC6896l abstractC6896l : c2091l.f4686l) {
            C8599l c8599l = (C8599l) c2091l.f4682l.get(abstractC6896l);
            Objects.requireNonNull(c8599l);
            abstractC6896l.inmobi(c8599l);
        }
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC16651l smaato(InterfaceC17944l interfaceC17944l) {
        return new C10975l(C5104l.amazon(interfaceC17944l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final List m2905strictfp(String str, String str2, InterfaceC0048l interfaceC0048l, C5464l c5464l, C5464l c5464l2) {
        C15421l c15421l = c5464l.crashlytics;
        AbstractC12225l.crashlytics();
        C2091l c2091l = this.tapsense;
        if (c5464l2 == null) {
            C3716l c3716lM2907volatile = m2907volatile(str, str2, interfaceC0048l, c5464l, null);
            InterfaceC18690l interfaceC18690lAmazon = amazon();
            Objects.requireNonNull(interfaceC18690lAmazon);
            C10038l c10038l = new C10038l(interfaceC18690lAmazon, new C8857l(c15421l), "StreamSharing");
            this.pro = c10038l;
            boolean z = this.firebase != null;
            int iMo1483finally = ((InterfaceC4089l) this.admob).mo1483finally(0);
            c2091l.getClass();
            HashMap map = new HashMap();
            for (AbstractC6896l abstractC6896l : c2091l.f4686l) {
                C12642l c12642l = c2091l.f4693l;
                InterfaceC18690l interfaceC18690l = c2091l.f4692l;
                C2091l c2091l2 = c2091l;
                boolean z2 = z;
                C6822l c6822lSubscription = c2091l2.subscription(abstractC6896l, c12642l, interfaceC18690l, c3716lM2907volatile, iMo1483finally, z2);
                int iTapsense = c2091l2.f4692l.loadAd().tapsense(((InterfaceC4089l) abstractC6896l.admob).mo1483finally(0));
                C8599l c8599l = (C8599l) c2091l2.f4682l.get(abstractC6896l);
                Objects.requireNonNull(c8599l);
                c8599l.f17733l.f27855l = iTapsense;
                map.put(abstractC6896l, c6822lSubscription);
                z = z2;
                c2091l = c2091l2;
            }
            C2091l c2091l3 = c2091l;
            boolean z3 = z;
            C0376l c0376lM2853l = c10038l.m2853l(new C12512l(c3716lM2907volatile, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((AbstractC6896l) entry.getKey(), (C3716l) c0376lM2853l.get(entry.getValue()));
            }
            c2091l3.advert(map2, c2091l3.license(c3716lM2907volatile, z3));
            Object[] objArr = {this.applovin.crashlytics()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return DesugarCollections.unmodifiableList(arrayList);
        }
        C2091l c2091l4 = c2091l;
        C3716l c3716lM2907volatile2 = m2907volatile(str, str2, interfaceC0048l, c5464l, c5464l2);
        Matrix matrix = this.smaato;
        InterfaceC18690l interfaceC18690lIsPro = isPro();
        Objects.requireNonNull(interfaceC18690lIsPro);
        boolean zMetrica = interfaceC18690lIsPro.metrica();
        Size size = c5464l2.yandex;
        Rect rect = this.firebase;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        InterfaceC18690l interfaceC18690lIsPro2 = isPro();
        Objects.requireNonNull(interfaceC18690lIsPro2);
        int iSubs = subs(interfaceC18690lIsPro2, false);
        InterfaceC18690l interfaceC18690lIsPro3 = isPro();
        Objects.requireNonNull(interfaceC18690lIsPro3);
        C3716l c3716l = new C3716l(3, 34, c5464l2, matrix, zMetrica, rect2, iSubs, -1, vip(interfaceC18690lIsPro3));
        this.isVip = c3716l;
        Objects.requireNonNull(isPro());
        this.premium = c3716l;
        C16774l c16774lM2904native = m2904native(this.isVip, interfaceC0048l, c5464l2);
        this.appmetrica = c16774lM2904native;
        C2525l c2525l = this.inmobi;
        if (c2525l != null) {
            c2525l.loadAd();
        }
        C2525l c2525l2 = new C2525l(new C11558l(this, str, str2, interfaceC0048l, c5464l, c5464l2));
        this.inmobi = c2525l2;
        c16774lM2904native.billing = c2525l2;
        C3716l c3716l2 = this.premium;
        this.ad = new C11644l(amazon(), isPro(), new C0284l(c15421l, this.Signature, this.license));
        boolean z4 = this.firebase != null;
        int iMo1483finally2 = ((InterfaceC4089l) this.admob).mo1483finally(0);
        c2091l4.getClass();
        HashMap map3 = new HashMap();
        for (AbstractC6896l abstractC6896l2 : c2091l4.f4686l) {
            C2091l c2091l5 = c2091l4;
            C3716l c3716l3 = c3716lM2907volatile2;
            C6822l c6822lSubscription2 = c2091l5.subscription(abstractC6896l2, c2091l4.f4693l, c2091l4.f4692l, c3716l3, iMo1483finally2, z4);
            C12642l c12642l2 = c2091l5.f4690l;
            Objects.requireNonNull(c12642l2);
            InterfaceC18690l interfaceC18690l2 = c2091l5.f4683l;
            Objects.requireNonNull(interfaceC18690l2);
            C3716l c3716l4 = c3716l2;
            C6822l c6822lSubscription3 = c2091l5.subscription(abstractC6896l2, c12642l2, interfaceC18690l2, c3716l4, iMo1483finally2, z4);
            int iTapsense2 = c2091l5.f4692l.loadAd().tapsense(((InterfaceC4089l) abstractC6896l2.admob).mo1483finally(0));
            C8599l c8599l2 = (C8599l) c2091l5.f4682l.get(abstractC6896l2);
            Objects.requireNonNull(c8599l2);
            c8599l2.f17733l.f27855l = iTapsense2;
            map3.put(abstractC6896l2, new C18187l(c6822lSubscription2, c6822lSubscription3));
            c3716l2 = c3716l4;
            c3716lM2907volatile2 = c3716l3;
            c2091l4 = c2091l5;
        }
        C3716l c3716l5 = c3716l2;
        C2091l c2091l6 = c2091l4;
        C3716l c3716l6 = c3716lM2907volatile2;
        C11644l c11644l = this.ad;
        ArrayList arrayList2 = new ArrayList(map3.values());
        C12276l c12276l = new C12276l(c3716l6, c3716l5, arrayList2);
        c11644l.getClass();
        AbstractC12225l.crashlytics();
        StringBuilder sb = new StringBuilder("[StreamSharing] DualSurfaceProcessorNode Transform Processor = ");
        InterfaceC13989l interfaceC13989l = (InterfaceC13989l) c11644l.f23358l;
        sb.append(interfaceC13989l);
        sb.append("\n   primary input = ");
        sb.append(c3716l6);
        sb.append("\n   secondary input = ");
        sb.append(c3716l5);
        AbstractC5088l.yandex("DualSurfaceProcessorNode", sb.toString());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC5088l.yandex("SurfaceProcessorNode", "   outputConfig = " + ((C18187l) it.next()));
        }
        c11644l.f23362l = c12276l;
        c11644l.f23360l = new C0376l();
        C12276l c12276l2 = (C12276l) c11644l.f23362l;
        C3716l c3716l7 = c12276l2.yandex;
        C3716l c3716l8 = c12276l2.loadAd;
        Iterator it2 = c12276l2.crashlytics.iterator();
        while (it2.hasNext()) {
            C18187l c18187l = (C18187l) it2.next();
            C0376l c0376l = (C0376l) c11644l.f23360l;
            C6822l c6822l = c18187l.yandex;
            Rect rect3 = c6822l.amazon;
            int i = c6822l.billing;
            boolean z5 = c6822l.mopub;
            Iterator it3 = it2;
            HashMap map4 = map3;
            Matrix matrix2 = new Matrix(c3716l7.loadAd);
            RectF rectF = new RectF(rect3);
            Size size2 = c6822l.purchase;
            matrix2.postConcat(AbstractC18611l.yandex(rectF, AbstractC18611l.subs(size2), i, z5));
            AbstractC5641l.yandex(AbstractC18611l.amazon(AbstractC18611l.admob(i, AbstractC18611l.billing(rect3)), false, size2));
            Rect rect4 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
            C6472l c6472lLoadAd = c3716l7.mopub.loadAd();
            c6472lLoadAd.f13512l = size2;
            c0376l.put(c18187l, new C3716l(c6822l.loadAd, c6822l.crashlytics, c6472lLoadAd.yandex(), matrix2, false, rect4, c3716l7.subs - i, -1, c3716l7.purchase != z5));
            it2 = it3;
            map3 = map4;
        }
        HashMap map5 = map3;
        interfaceC13989l.yandex(c3716l7.amazon((InterfaceC18690l) c11644l.f23357l, true));
        interfaceC13989l.yandex(c3716l8.amazon((InterfaceC18690l) c11644l.f23361l, false));
        InterfaceC18690l interfaceC18690l3 = (InterfaceC18690l) c11644l.f23357l;
        InterfaceC18690l interfaceC18690l4 = (InterfaceC18690l) c11644l.f23361l;
        for (Map.Entry entry2 : ((C0376l) c11644l.f23360l).entrySet()) {
            C3716l c3716l9 = c3716l7;
            C3716l c3716l10 = c3716l8;
            c11644l.m3149l(interfaceC18690l3, interfaceC18690l4, c3716l9, c3716l10, entry2);
            C3716l c3716l11 = (C3716l) entry2.getValue();
            InterfaceC18690l interfaceC18690l5 = interfaceC18690l4;
            InterfaceC18690l interfaceC18690l6 = interfaceC18690l3;
            C11644l c11644l2 = c11644l;
            RunnableC2218l runnableC2218l = new RunnableC2218l(c11644l2, interfaceC18690l6, interfaceC18690l5, c3716l9, c3716l10, entry2);
            c11644l = c11644l2;
            interfaceC18690l3 = interfaceC18690l6;
            interfaceC18690l4 = interfaceC18690l5;
            c3716l11.yandex(runnableC2218l);
            c3716l7 = c3716l9;
            c3716l8 = c3716l10;
        }
        C0376l c0376l2 = (C0376l) c11644l.f23360l;
        HashMap map6 = new HashMap();
        for (Map.Entry entry3 : map5.entrySet()) {
            map6.put((AbstractC6896l) entry3.getKey(), (C3716l) c0376l2.get(entry3.getValue()));
        }
        c2091l6.advert(map6, c2091l6.license(c3716l6, z4));
        Object[] objArr2 = {this.applovin.crashlytics(), this.appmetrica.crashlytics()};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj2 = objArr2[i2];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    @Override // defpackage.AbstractC6896l
    public final void subscription() {
        C2091l c2091l = this.tapsense;
        for (AbstractC6896l abstractC6896l : c2091l.f4686l) {
            C8599l c8599l = (C8599l) c2091l.f4682l.get(abstractC6896l);
            Objects.requireNonNull(c8599l);
            abstractC6896l.loadAd(c8599l, null, null, abstractC6896l.mopub(true, c2091l.f4688l));
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m2906synchronized() {
        C2525l c2525l = this.inmobi;
        if (c2525l != null) {
            c2525l.loadAd();
            this.inmobi = null;
        }
        C3716l c3716l = this.advert;
        if (c3716l != null) {
            c3716l.crashlytics();
            this.advert = null;
        }
        C3716l c3716l2 = this.isVip;
        if (c3716l2 != null) {
            c3716l2.crashlytics();
            this.isVip = null;
        }
        C3716l c3716l3 = this.signatures;
        if (c3716l3 != null) {
            c3716l3.crashlytics();
            this.signatures = null;
        }
        C3716l c3716l4 = this.premium;
        if (c3716l4 != null) {
            c3716l4.crashlytics();
            this.premium = null;
        }
        C10038l c10038l = this.pro;
        if (c10038l != null) {
            c10038l.m2866transient();
            this.pro = null;
        }
        C11644l c11644l = this.ad;
        if (c11644l != null) {
            ((InterfaceC13989l) c11644l.f23358l).release();
            AbstractC12225l.firebase(new RunnableC11297l(3, c11644l));
            this.ad = null;
        }
    }

    @Override // defpackage.AbstractC6896l
    public final void tapsense() {
        Iterator it = this.tapsense.f4686l.iterator();
        while (it.hasNext()) {
            ((AbstractC6896l) it.next()).tapsense();
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final C3716l m2907volatile(String str, String str2, InterfaceC0048l interfaceC0048l, C5464l c5464l, C5464l c5464l2) {
        Matrix matrix = this.smaato;
        InterfaceC18690l interfaceC18690lAmazon = amazon();
        Objects.requireNonNull(interfaceC18690lAmazon);
        boolean zMetrica = interfaceC18690lAmazon.metrica();
        Size size = c5464l.yandex;
        Rect rect = this.firebase;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        InterfaceC18690l interfaceC18690lAmazon2 = amazon();
        Objects.requireNonNull(interfaceC18690lAmazon2);
        int iSubs = subs(interfaceC18690lAmazon2, false);
        InterfaceC18690l interfaceC18690lAmazon3 = amazon();
        Objects.requireNonNull(interfaceC18690lAmazon3);
        C3716l c3716l = new C3716l(3, 34, c5464l, matrix, zMetrica, rect, iSubs, -1, vip(interfaceC18690lAmazon3));
        this.advert = c3716l;
        Objects.requireNonNull(amazon());
        this.signatures = c3716l;
        C16774l c16774lM2904native = m2904native(this.advert, interfaceC0048l, c5464l);
        this.applovin = c16774lM2904native;
        C2525l c2525l = this.inmobi;
        if (c2525l != null) {
            c2525l.loadAd();
        }
        C2525l c2525l2 = new C2525l(new C11558l(this, str, str2, interfaceC0048l, c5464l, c5464l2));
        this.inmobi = c2525l2;
        c16774lM2904native.billing = c2525l2;
        return this.signatures;
    }
}
