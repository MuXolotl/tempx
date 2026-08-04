package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lِٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11903l implements InterfaceC4982l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC10139l f23727l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C7518l f23728l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C13568l f23729l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C14671l f23731l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public AbstractC6896l f23732l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16214l f23733l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16214l f23734l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C0458l f23735l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C10245l f23736l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C12130l f23740l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final InterfaceC13235l f23741l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C0458l f23746l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayList f23739l = new ArrayList();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final ArrayList f23743l = new ArrayList();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f23742l = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f23737l = 0;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Range f23744l = C5464l.admob;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final Object f23726l = new Object();

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f23745l = true;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC17944l f23738l = null;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C18396l f23730l = new C18396l(22);

    public C11903l(InterfaceC18690l interfaceC18690l, InterfaceC18690l interfaceC18690l2, C16057l c16057l, C16057l c16057l2, C0458l c0458l, C0458l c0458l2, C7518l c7518l, C13568l c13568l, InterfaceC10139l interfaceC10139l) {
        InterfaceC13235l interfaceC13235l = c16057l.f31460l;
        this.f23741l = interfaceC13235l;
        this.f23734l = new C16214l(interfaceC18690l, c16057l);
        if (interfaceC18690l2 == null || c16057l2 == null) {
            this.f23733l = null;
        } else {
            this.f23733l = new C16214l(interfaceC18690l2, c16057l2);
        }
        this.f23746l = c0458l;
        this.f23735l = c0458l2;
        this.f23728l = c7518l;
        this.f23727l = interfaceC10139l;
        this.f23740l = C12371l.crashlytics(c16057l.f27125l.mopub(), c16057l2 != null ? c16057l2.f27125l.mopub() : null, (C18120l) ((C5138l) interfaceC13235l).f11181l);
        this.f23729l = c13568l;
    }

    public static HashMap isVip(ArrayList arrayList, InterfaceC10139l interfaceC10139l, InterfaceC10139l interfaceC10139l2, int i, Range range) {
        InterfaceC0048l interfaceC0048lMopub;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
            if (abstractC6896l instanceof C10245l) {
                C10245l c10245l = (C10245l) abstractC6896l;
                C8749l c8749l = new C8749l(C7420l.yandex(new C14929l(2).f29382l));
                AbstractC17666l.billing(c8749l);
                C0527l c0527l = new C0527l(c8749l);
                c0527l.tapsense = C0527l.signatures;
                InterfaceC0048l interfaceC0048lMopub2 = c0527l.mopub(false, interfaceC10139l);
                if (interfaceC0048lMopub2 == null) {
                    interfaceC0048lMopub = null;
                } else {
                    C5104l c5104lAmazon = C5104l.amazon(interfaceC0048lMopub2);
                    c5104lAmazon.isPro(InterfaceC15273l.f29872l);
                    interfaceC0048lMopub = ((C10975l) c10245l.smaato(c5104lAmazon)).Signature();
                }
            } else {
                interfaceC0048lMopub = abstractC6896l.mopub(false, interfaceC10139l);
            }
            InterfaceC0048l interfaceC0048lMopub3 = abstractC6896l.mopub(true, interfaceC10139l2);
            C5104l c5104lAmazon2 = interfaceC0048lMopub3 != null ? C5104l.amazon(interfaceC0048lMopub3) : C5104l.crashlytics();
            c5104lAmazon2.mopub(InterfaceC0048l.f925l, Integer.valueOf(i));
            if (!C5464l.admob.equals(range)) {
                c5104lAmazon2.purchase(InterfaceC0048l.f924l, EnumC10534l.f21429l, range);
                c5104lAmazon2.mopub(InterfaceC0048l.f922l, Boolean.TRUE);
            }
            InterfaceC0048l interfaceC0048lSignature = abstractC6896l.smaato(c5104lAmazon2).Signature();
            C9807l c9807l = new C9807l();
            c9807l.yandex = interfaceC0048lMopub;
            c9807l.loadAd = interfaceC0048lSignature;
            map.put(abstractC6896l, c9807l);
        }
        return map;
    }

    public static Matrix license(Rect rect, Size size) {
        AbstractC5641l.loadAd(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap mopub(LinkedHashSet linkedHashSet, C5008l c5008l) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
            map.put(abstractC6896l, abstractC6896l.mopub);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = c5008l != null ? (LinkedHashSet) c5008l.f10245l : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            abstractC6896l.mopub = hashSet;
        }
        return map;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static ArrayList m3287strictfp(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC6896l) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw AbstractC15560l.adcel(it2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static void m3288throws(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                abstractC6896l.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            abstractC6896l.mopub = hashSet;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    public final AbstractC6896l Signature(LinkedHashSet linkedHashSet, C10245l c10245l) {
        AbstractC6896l abstractC6896lYandex;
        synchronized (this.f23726l) {
            try {
                ArrayList<AbstractC6896l> arrayList = new ArrayList(linkedHashSet);
                if (c10245l != null) {
                    arrayList.add(c10245l);
                    arrayList.removeAll(c10245l.tapsense.f4686l);
                }
                if (appmetrica()) {
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    for (AbstractC6896l abstractC6896l : arrayList) {
                        if ((abstractC6896l instanceof C0527l) || (abstractC6896l instanceof C10245l)) {
                            z3 = true;
                        } else if (abstractC6896l instanceof C9731l) {
                            z2 = true;
                        }
                    }
                    if (!z2 || z3) {
                        boolean z4 = false;
                        for (AbstractC6896l abstractC6896l2 : arrayList) {
                            if ((abstractC6896l2 instanceof C0527l) || (abstractC6896l2 instanceof C10245l)) {
                                z = true;
                            } else if (abstractC6896l2 instanceof C9731l) {
                                z4 = true;
                            }
                        }
                        if (!z || z4) {
                            abstractC6896lYandex = null;
                        } else {
                            AbstractC6896l abstractC6896l3 = this.f23732l;
                            if (abstractC6896l3 instanceof C9731l) {
                                abstractC6896lYandex = abstractC6896l3;
                            } else {
                                C14929l c14929l = new C14929l(1);
                                c14929l.f29382l.mopub(InterfaceC15273l.f29871l, "ImageCapture-Extra");
                                abstractC6896lYandex = c14929l.yandex();
                            }
                        }
                    } else {
                        AbstractC6896l abstractC6896l4 = this.f23732l;
                        if (abstractC6896l4 instanceof C0527l) {
                            abstractC6896lYandex = abstractC6896l4;
                        } else {
                            C14929l c14929l2 = new C14929l(2);
                            c14929l2.f29382l.mopub(InterfaceC15273l.f29871l, "Preview-Extra");
                            C8749l c8749l = new C8749l(C7420l.yandex(c14929l2.f29382l));
                            AbstractC17666l.billing(c8749l);
                            C0527l c0527l = new C0527l(c8749l);
                            c0527l.tapsense = C0527l.signatures;
                            c0527l.m624strictfp(new C18353l(15));
                            abstractC6896lYandex = c0527l;
                        }
                    }
                } else {
                    abstractC6896lYandex = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC6896lYandex;
    }

    public final void ad() {
        synchronized (this.f23726l) {
            try {
                if (this.f23745l) {
                    this.f23734l.remoteconfig(new ArrayList(this.f23743l));
                    C16214l c16214l = this.f23733l;
                    if (c16214l != null) {
                        c16214l.remoteconfig(new ArrayList(this.f23743l));
                    }
                    subscription();
                    this.f23745l = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ads() {
        synchronized (this.f23726l) {
            try {
                if (!this.f23745l) {
                    if (!this.f23743l.isEmpty()) {
                        this.f23734l.subs(this.f23741l);
                        C16214l c16214l = this.f23733l;
                        if (c16214l != null) {
                            c16214l.subs(this.f23741l);
                        }
                    }
                    this.f23734l.smaato(this.f23743l);
                    C16214l c16214l2 = this.f23733l;
                    if (c16214l2 != null) {
                        c16214l2.smaato(this.f23743l);
                    }
                    m3290package();
                    Iterator it = this.f23743l.iterator();
                    while (it.hasNext()) {
                        ((AbstractC6896l) it.next()).ads();
                    }
                    this.f23745l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int advert() {
        synchronized (this.f23726l) {
            try {
                return this.f23728l.loadAd() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void applovin() {
        synchronized (this.f23726l) {
            ((C5138l) this.f23741l).m1720public();
        }
    }

    public final boolean appmetrica() {
        boolean z;
        synchronized (this.f23726l) {
            C5138l c5138l = (C5138l) this.f23741l;
            c5138l.getClass();
            int i = AbstractC14352l.yandex;
            z = ((Integer) AbstractC4338l.smaato(c5138l, InterfaceC13235l.amazon, 0)).intValue() == 1;
        }
        return z;
    }

    public final void crashlytics(Collection collection, C5008l c5008l) {
        AbstractC5088l.yandex("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + c5008l);
        synchronized (this.f23726l) {
            try {
                C16214l c16214l = this.f23734l;
                InterfaceC13235l interfaceC13235l = this.f23741l;
                c16214l.subs(interfaceC13235l);
                C16214l c16214l2 = this.f23733l;
                if (c16214l2 != null) {
                    c16214l2.subs(interfaceC13235l);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f23739l);
                linkedHashSet.addAll(collection);
                HashMap mapMopub = mopub(linkedHashSet, c5008l);
                try {
                    purchase(tapsense(linkedHashSet, this.f23733l != null));
                } catch (IllegalArgumentException e) {
                    m3288throws(mapMopub);
                    throw new C14687l(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void inmobi(ArrayList arrayList) {
        synchronized (this.f23726l) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC6896l) it.next()).mopub = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f23739l);
            linkedHashSet.removeAll(arrayList);
            purchase(tapsense(linkedHashSet, this.f23733l != null));
        }
    }

    @Override // defpackage.InterfaceC4982l
    public final InterfaceC15879l loadAd() {
        return this.f23734l.f31730l;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m3289native(int i) {
        synchronized (this.f23726l) {
            this.f23737l = i;
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m3290package() {
        synchronized (this.f23726l) {
            try {
                InterfaceC17944l interfaceC17944l = this.f23738l;
                if (interfaceC17944l != null) {
                    this.f23734l.f31729l.purchase(interfaceC17944l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List premium() {
        ArrayList arrayList;
        synchronized (this.f23726l) {
            arrayList = new ArrayList(this.f23739l);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m3291private(C14671l c14671l) {
        synchronized (this.f23726l) {
            this.f23731l = c14671l;
        }
    }

    public final C10245l pro(LinkedHashSet linkedHashSet, boolean z) {
        boolean z2;
        synchronized (this.f23726l) {
            try {
                HashSet<AbstractC6896l> hashSetSignatures = signatures(linkedHashSet, z);
                if (hashSetSignatures.size() < 2) {
                    applovin();
                    return null;
                }
                C10245l c10245l = this.f23736l;
                if (c10245l != null && c10245l.tapsense.f4686l.equals(hashSetSignatures)) {
                    C10245l c10245l2 = this.f23736l;
                    c10245l2.getClass();
                    HashSet hashSet = ((AbstractC6896l) hashSetSignatures.iterator().next()).mopub;
                    c10245l2.mopub = hashSet != null ? new HashSet(hashSet) : null;
                    C10245l c10245l3 = this.f23736l;
                    Objects.requireNonNull(c10245l3);
                    return c10245l3;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet2 = new HashSet();
                for (AbstractC6896l abstractC6896l : hashSetSignatures) {
                    for (int i = 0; i < 3; i++) {
                        int i2 = iArr[i];
                        Iterator it = abstractC6896l.firebase().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            int iIntValue = ((Integer) it.next()).intValue();
                            if ((i2 & iIntValue) == iIntValue) {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            if (hashSet2.contains(Integer.valueOf(i2))) {
                                return null;
                            }
                            hashSet2.add(Integer.valueOf(i2));
                        }
                    }
                }
                return new C10245l(this.f23734l, this.f23733l, this.f23746l, this.f23735l, hashSetSignatures, this.f23727l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void purchase(C5335l c5335l) {
        Map map = c5335l.subs.yandex;
        ArrayList<AbstractC6896l> arrayList = c5335l.loadAd;
        synchronized (this.f23726l) {
            try {
                if (this.f23731l != null && !arrayList.isEmpty()) {
                    boolean z = this.f23734l.f31730l.f27125l.metrica() == 0;
                    Rect rectFirebase = this.f23734l.f31730l.f27125l.firebase();
                    C14671l c14671l = this.f23731l;
                    Rational rational = c14671l.loadAd;
                    int iTapsense = this.f23734l.f31730l.f27125l.tapsense(c14671l.crashlytics);
                    C14671l c14671l2 = this.f23731l;
                    HashMap mapYandex = AbstractC11356l.yandex(rectFirebase, z, rational, iTapsense, c14671l2.yandex, c14671l2.amazon, map);
                    for (AbstractC6896l abstractC6896l : arrayList) {
                        Rect rect = (Rect) mapYandex.get(abstractC6896l);
                        rect.getClass();
                        abstractC6896l.appmetrica(rect);
                    }
                }
                for (AbstractC6896l abstractC6896l2 : arrayList) {
                    Rect rectFirebase2 = this.f23734l.f31730l.f27125l.firebase();
                    C5464l c5464l = (C5464l) map.get(abstractC6896l2);
                    c5464l.getClass();
                    abstractC6896l2.premium(license(rectFirebase2, c5464l.yandex));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.f23742l;
        ArrayList arrayList2 = c5335l.loadAd;
        LinkedHashSet linkedHashSet = c5335l.yandex;
        ArrayList arrayListM3287strictfp = m3287strictfp(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListM3287strictfp2 = m3287strictfp(arrayList3, arrayListM3287strictfp);
        if (!arrayListM3287strictfp2.isEmpty()) {
            AbstractC5088l.tapsense("CameraUseCaseAdapter", "Unused effects: " + arrayListM3287strictfp2);
        }
        Iterator it = c5335l.purchase.iterator();
        while (it.hasNext()) {
            ((AbstractC6896l) it.next()).inmobi(this.f23734l);
        }
        this.f23734l.remoteconfig(c5335l.purchase);
        if (this.f23733l != null) {
            for (AbstractC6896l abstractC6896l3 : c5335l.purchase) {
                C16214l c16214l = this.f23733l;
                Objects.requireNonNull(c16214l);
                abstractC6896l3.inmobi(c16214l);
            }
            C16214l c16214l2 = this.f23733l;
            Objects.requireNonNull(c16214l2);
            c16214l2.remoteconfig(c5335l.purchase);
        }
        if (c5335l.purchase.isEmpty()) {
            for (AbstractC6896l abstractC6896l4 : c5335l.amazon) {
                Map map2 = c5335l.subs.yandex;
                if (map2.containsKey(abstractC6896l4)) {
                    C5464l c5464l2 = (C5464l) map2.get(abstractC6896l4);
                    Objects.requireNonNull(c5464l2);
                    InterfaceC17944l interfaceC17944l = c5464l2.billing;
                    if (interfaceC17944l != null) {
                        C10814l c10814l = abstractC6896l4.adcel;
                        C7420l c7420l = c10814l.mopub.loadAd;
                        Objects.requireNonNull(interfaceC17944l);
                        if (interfaceC17944l.startapp().size() == c10814l.mopub.loadAd.startapp().size()) {
                            Iterator it2 = interfaceC17944l.startapp().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    C6916l c6916l = (C6916l) it2.next();
                                    if (!c7420l.f15372l.containsKey(c6916l) || !Objects.equals(c7420l.adcel(c6916l), interfaceC17944l.adcel(c6916l))) {
                                    }
                                }
                            }
                        }
                        abstractC6896l4.subs = abstractC6896l4.advert(interfaceC17944l);
                        if (this.f23745l) {
                            this.f23734l.mopub(abstractC6896l4);
                            C16214l c16214l3 = this.f23733l;
                            if (c16214l3 != null) {
                                c16214l3.mopub(abstractC6896l4);
                            }
                        }
                    }
                }
            }
        }
        for (AbstractC6896l abstractC6896l5 : c5335l.crashlytics) {
            C9807l c9807l = (C9807l) c5335l.admob.get(abstractC6896l5);
            Objects.requireNonNull(c9807l);
            C16214l c16214l4 = this.f23733l;
            C16214l c16214l5 = this.f23734l;
            InterfaceC0048l interfaceC0048l = c9807l.yandex;
            if (c16214l4 != null) {
                abstractC6896l5.loadAd(c16214l5, c16214l4, interfaceC0048l, c9807l.loadAd);
                C5464l c5464l3 = (C5464l) c5335l.subs.yandex.get(abstractC6896l5);
                c5464l3.getClass();
                C15002l c15002l = c5335l.isPro;
                c15002l.getClass();
                abstractC6896l5.m2080package(c5464l3, (C5464l) c15002l.yandex.get(abstractC6896l5));
            } else {
                abstractC6896l5.loadAd(c16214l5, null, interfaceC0048l, c9807l.loadAd);
                C5464l c5464l4 = (C5464l) c5335l.subs.yandex.get(abstractC6896l5);
                c5464l4.getClass();
                abstractC6896l5.m2080package(c5464l4, null);
            }
        }
        if (this.f23745l) {
            this.f23734l.smaato(c5335l.crashlytics);
            C16214l c16214l6 = this.f23733l;
            if (c16214l6 != null) {
                c16214l6.smaato(c5335l.crashlytics);
            }
        }
        Iterator it3 = c5335l.crashlytics.iterator();
        while (it3.hasNext()) {
            ((AbstractC6896l) it3.next()).ads();
        }
        this.f23739l.clear();
        this.f23739l.addAll(c5335l.yandex);
        this.f23743l.clear();
        this.f23743l.addAll(c5335l.loadAd);
        this.f23732l = c5335l.mopub;
        this.f23736l = c5335l.billing;
    }

    public final HashSet signatures(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.f23726l) {
            Iterator it = this.f23742l.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) it2.next();
            AbstractC5641l.loadAd(!(abstractC6896l instanceof C10245l), "Only support one level of sharing for now.");
            Iterator it3 = abstractC6896l.firebase().iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                if ((i & iIntValue) == iIntValue) {
                    hashSet.add(abstractC6896l);
                    break;
                }
            }
        }
        return hashSet;
    }

    public final void subscription() {
        synchronized (this.f23726l) {
            C14767l c14767l = this.f23734l.f31729l;
            this.f23738l = c14767l.loadAd.firebase();
            c14767l.smaato();
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m3292synchronized(List list) {
        synchronized (this.f23726l) {
            this.f23742l = list;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x015a, code lost:
    
        if (r3 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        return tapsense(r20, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C5335l tapsense(java.util.LinkedHashSet r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11903l.tapsense(java.util.LinkedHashSet, boolean):lؘّؐ");
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m3293volatile(Range range) {
        synchronized (this.f23726l) {
            this.f23744l = range;
        }
    }
}
