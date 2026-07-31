package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4791l extends AbstractC0306l {
    public boolean Signature;
    public final C0462l ad;
    public ArrayList adcel;
    public List admob;
    public C6295l ads;
    public final InterfaceC12932l advert;
    public final Object amazon;
    public Throwable billing;
    public final C18449l crashlytics;
    public final ArrayList firebase;
    public final C17893l isPro;
    public final C6760l isVip;
    public final C1008l license;
    public final C2552l loadAd;
    public final C13660l metrica;
    public final ArrayList mopub;
    public final C4816l pro;
    public InterfaceC7042l purchase;
    public final C13660l remoteconfig;
    public final ArrayList smaato;
    public final C13660l startapp;
    public C6295l subs;
    public C2397l subscription;
    public final C1008l tapsense;
    public final C13645l vip;
    public long yandex;
    public static final C1008l signatures = AbstractC11190l.yandex(C15084l.f29615l);
    public static final AtomicReference premium = new AtomicReference(Boolean.FALSE);

    public C4791l(InterfaceC12932l interfaceC12932l) {
        C2552l c2552l = new C2552l(new C12689l(this, 0));
        this.loadAd = c2552l;
        this.crashlytics = new C18449l(new C12689l(this, 1));
        this.amazon = new Object();
        this.mopub = new ArrayList();
        this.subs = new C6295l();
        this.isPro = new C17893l(0, new C6931l[16]);
        this.firebase = new ArrayList();
        this.smaato = new ArrayList();
        this.remoteconfig = new C13660l();
        this.vip = new C13645l(5);
        this.metrica = new C13660l();
        this.startapp = new C13660l();
        this.tapsense = AbstractC11190l.yandex(null);
        this.license = AbstractC11190l.yandex(EnumC6767l.f14177l);
        this.pro = new C4816l(6);
        C0462l c0462l = new C0462l((InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l));
        c0462l.mo2154l(new C16931l(7, this));
        this.ad = c0462l;
        this.advert = interfaceC12932l.mo246l(c2552l).mo246l(c0462l);
        this.isVip = new C6760l(8);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[Catch: all -> 0x00a8, LOOP:2: B:12:0x0028->B:25:0x0067, LOOP_END, TryCatch #0 {all -> 0x00a8, blocks: (B:4:0x0005, B:6:0x000e, B:8:0x0016, B:27:0x006b, B:29:0x0093, B:32:0x00aa, B:9:0x0019, B:12:0x0028, B:14:0x0038, B:16:0x0044, B:18:0x004d, B:20:0x0056, B:21:0x005c, B:22:0x005f, B:25:0x0067, B:33:0x00b0), top: B:41:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x006a A[EDGE_INSN: B:45:0x006a->B:26:0x006a BREAK  A[LOOP:2: B:12:0x0028->B:25:0x0067], SYNTHETIC] */
    public static final void ad(C4791l c4791l) {
        int i;
        C12463l c12463l;
        C12463l c12463l2;
        synchronized (c4791l.amazon) {
            try {
                if (c4791l.remoteconfig.isPro()) {
                    C13660l c13660l = c4791l.remoteconfig;
                    if (c13660l.subs()) {
                        c12463l2 = AbstractC3626l.loadAd;
                    } else {
                        C12463l c12463l3 = new C12463l();
                        Object[] objArr = c13660l.crashlytics;
                        long[] jArr = c13660l.yandex;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i2 != length) {
                                        break;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j) < 128) {
                                            Object obj = objArr[(i2 << 3) + i4];
                                            if (obj instanceof C12463l) {
                                                c12463l3.loadAd((C12463l) obj);
                                            } else {
                                                c12463l3.yandex(obj);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i3 != 8) {
                                        break;
                                    } else if (i2 != length) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        c12463l2 = c12463l3;
                    }
                    c4791l.remoteconfig.yandex();
                    C13645l c13645l = c4791l.vip;
                    ((C13660l) c13645l.f26671l).yandex();
                    ((C13660l) c13645l.f26670l).yandex();
                    c4791l.startapp.yandex();
                    c12463l = new C12463l(c12463l2.loadAd);
                    Object[] objArr2 = c12463l2.yandex;
                    int i5 = c12463l2.loadAd;
                    for (int i6 = 0; i6 < i5; i6++) {
                        AbstractC11411l abstractC11411l = (AbstractC11411l) objArr2[i6];
                        c12463l.yandex(new C8195l(abstractC11411l, c4791l.metrica.mopub(abstractC11411l)));
                    }
                    c4791l.metrica.yandex();
                } else {
                    c12463l = AbstractC3626l.loadAd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr3 = c12463l.yandex;
        int i7 = c12463l.loadAd;
        for (i = 0; i < i7; i++) {
            C8195l c8195l = (C8195l) objArr3[i];
        }
    }

    public static final boolean advert(C4791l c4791l) {
        boolean zInmobi;
        synchronized (c4791l.amazon) {
            zInmobi = c4791l.inmobi();
        }
        return zInmobi;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final void m1601extends(ArrayList arrayList, C4791l c4791l, C6931l c6931l) {
        arrayList.clear();
        synchronized (c4791l.amazon) {
            Iterator it = c4791l.smaato.iterator();
            if (it.hasNext()) {
                ((AbstractC11411l) it.next()).getClass();
                throw null;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final List isVip(C4791l c4791l) {
        List listM1610strictfp;
        synchronized (c4791l.amazon) {
            listM1610strictfp = c4791l.m1610strictfp();
        }
        return listM1610strictfp;
    }

    public static void premium(C1852l c1852l) {
        try {
            if (c1852l.pro() instanceof C4728l) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            c1852l.crashlytics();
        } catch (Throwable th) {
            c1852l.crashlytics();
            throw th;
        }
    }

    public static final Object pro(C4791l c4791l, C7621l c7621l) {
        C2397l c2397l;
        if (c4791l.m1612synchronized()) {
            return Unit.INSTANCE;
        }
        C2397l c2397l2 = new C2397l(1, AbstractC17082l.billing(c7621l));
        c2397l2.license();
        synchronized (c4791l.amazon) {
            if (c4791l.m1612synchronized()) {
                c2397l = c2397l2;
            } else {
                c4791l.subscription = c2397l2;
                c2397l = null;
            }
        }
        if (c2397l != null) {
            c2397l.subs(Unit.INSTANCE);
        }
        Object objSignature = c2397l2.Signature();
        return objSignature == EnumC9342l.f19165l ? objSignature : Unit.INSTANCE;
    }

    public static final void signatures(C4791l c4791l, InterfaceC7042l interfaceC7042l) {
        synchronized (c4791l.amazon) {
            try {
                Throwable th = c4791l.billing;
                if (th != null) {
                    throw th;
                }
                if (((EnumC6767l) c4791l.license.getValue()).compareTo(EnumC6767l.f14179l) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (c4791l.purchase != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                c4791l.purchase = interfaceC7042l;
                if (c4791l.appmetrica() != null) {
                    AbstractC2032l.yandex("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.AbstractC0306l
    public final void adcel(C4224l c4224l) {
        C4816l c4816l = this.pro;
        C6295l c6295l = (C6295l) c4816l.get();
        if (c6295l == null) {
            C6295l c6295l2 = AbstractC13087l.yandex;
            c6295l = new C6295l();
            c4816l.firebase(c6295l);
        }
        c6295l.yandex(c4224l);
    }

    @Override // defpackage.AbstractC0306l
    public final InterfaceC12776l admob() {
        return null;
    }

    @Override // defpackage.AbstractC0306l
    public final void ads(C6931l c6931l) {
        synchronized (this.amazon) {
            try {
                C6295l c6295l = this.ads;
                if (c6295l == null) {
                    C6295l c6295l2 = AbstractC13087l.yandex;
                    c6295l = new C6295l();
                    this.ads = c6295l;
                }
                c6295l.yandex(c6931l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC0306l
    public final boolean amazon() {
        return ((Boolean) premium.get()).booleanValue();
    }

    public final void applovin() {
        synchronized (this.amazon) {
            try {
                if (((EnumC6767l) this.license.getValue()).compareTo(EnumC6767l.f14181l) >= 0) {
                    C1008l c1008l = this.license;
                    EnumC6767l enumC6767l = EnumC6767l.f14179l;
                    c1008l.getClass();
                    c1008l.remoteconfig(null, enumC6767l);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.ad.ads(null);
    }

    public final InterfaceC4305l appmetrica() {
        C1008l c1008l = this.license;
        int iCompareTo = ((EnumC6767l) c1008l.getValue()).compareTo(EnumC6767l.f14179l);
        C1008l c1008l2 = this.tapsense;
        ArrayList arrayList = this.smaato;
        ArrayList arrayList2 = this.firebase;
        C17893l c17893l = this.isPro;
        if (iCompareTo > 0) {
            Object value = c1008l2.getValue();
            EnumC6767l enumC6767l = EnumC6767l.f14183l;
            EnumC6767l enumC6767l2 = EnumC6767l.f14177l;
            if (value == null) {
                if (this.purchase == null) {
                    this.subs = new C6295l();
                    c17893l.isPro();
                    if (inmobi() || m1608package()) {
                        enumC6767l2 = EnumC6767l.f14182l;
                    }
                } else {
                    enumC6767l2 = (c17893l.f34846l != 0 || this.subs.subs() || !arrayList2.isEmpty() || !arrayList.isEmpty() || inmobi() || m1608package() || this.remoteconfig.isPro()) ? enumC6767l : EnumC6767l.f14181l;
                }
            }
            c1008l.getClass();
            c1008l.remoteconfig(null, enumC6767l2);
            if (enumC6767l2 != enumC6767l) {
                return null;
            }
            C2397l c2397l = this.subscription;
            this.subscription = null;
            return c2397l;
        }
        List listM1610strictfp = m1610strictfp();
        int size = listM1610strictfp.size();
        for (int i = 0; i < size; i++) {
        }
        this.mopub.clear();
        this.admob = C2580l.f5619l;
        this.subs = new C6295l();
        c17893l.isPro();
        arrayList2.clear();
        arrayList.clear();
        this.adcel = null;
        C2397l c2397l2 = this.subscription;
        if (c2397l2 != null) {
            c2397l2.yandex(null);
        }
        this.subscription = null;
        c1008l2.smaato(null);
        return null;
    }

    @Override // defpackage.AbstractC0306l
    public final boolean billing() {
        return false;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m1602case(C6931l c6931l) {
        ArrayList arrayList = this.adcel;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.adcel = arrayList;
        }
        if (!arrayList.contains(c6931l)) {
            arrayList.add(c6931l);
        }
        if (this.mopub.remove(c6931l)) {
            this.admob = null;
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m1603catch(Throwable th, C6931l c6931l) throws Throwable {
        if (!((Boolean) premium.get()).booleanValue() || (th instanceof C6505l)) {
            synchronized (this.amazon) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                C5440l c5440l = (C5440l) this.tapsense.getValue();
                if (c5440l != null) {
                    throw c5440l.yandex;
                }
                C1008l c1008l = this.tapsense;
                C5440l c5440l2 = new C5440l(th);
                c1008l.getClass();
                c1008l.remoteconfig(null, c5440l2);
                Unit unit = Unit.INSTANCE;
            }
            throw th;
        }
        synchronized (this.amazon) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.firebase.clear();
                this.isPro.isPro();
                this.subs = new C6295l();
                this.smaato.clear();
                this.remoteconfig.yandex();
                this.metrica.yandex();
                C1008l c1008l2 = this.tapsense;
                C5440l c5440l3 = new C5440l(th);
                c1008l2.getClass();
                c1008l2.remoteconfig(null, c5440l3);
                if (c6931l != null) {
                    m1602case(c6931l);
                }
                if (appmetrica() != null) {
                    AbstractC2032l.yandex("expected to go to inactive state due to composition error");
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final Object m1604continue(AbstractC5563l abstractC5563l) throws Throwable {
        Object objFirebase = AbstractC10999l.firebase(this.loadAd, new C0469l(this, new C7621l(this, null), AbstractC1789l.amazon(abstractC5563l.f1295l), (InterfaceC14029l) null, 16), abstractC5563l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objFirebase != enumC9342l) {
            objFirebase = Unit.INSTANCE;
        }
        return objFirebase == enumC9342l ? objFirebase : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final boolean m1605else() {
        boolean zM1614throws;
        synchronized (this.amazon) {
            if (this.subs.admob()) {
                return m1614throws();
            }
            List listM1610strictfp = m1610strictfp();
            C16927l c16927l = new C16927l(this.subs);
            this.subs = new C6295l();
            try {
                int size = listM1610strictfp.size();
                for (int i = 0; i < size; i++) {
                    ((C6931l) listM1610strictfp.get(i)).advert(c16927l);
                    if (((EnumC6767l) this.license.getValue()).compareTo(EnumC6767l.f14179l) <= 0) {
                        break;
                    }
                }
                synchronized (this.amazon) {
                    if (appmetrica() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM1614throws = m1614throws();
                }
                return zM1614throws;
            } catch (Throwable th) {
                synchronized (this.amazon) {
                    C6295l c6295l = this.subs;
                    int i2 = c6295l.amazon;
                    Iterator<E> it = c16927l.iterator();
                    while (it.hasNext()) {
                        c6295l.smaato(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.AbstractC0306l
    public final boolean firebase() {
        return false;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final List m1606for(List list, C6295l c6295l) {
        C1852l c1852lAppmetrica;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((AbstractC11411l) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            C6931l c6931l = (C6931l) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c6931l.f14523l.f14606throws) {
                AbstractC2032l.yandex("Check failed");
            }
            C16931l c16931l = new C16931l(6, c6931l);
            C8854l c8854l = new C8854l(c6931l, c6295l, 28);
            AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
            C1852l c1852l = abstractC18620lIsPro instanceof C1852l ? (C1852l) abstractC18620lIsPro : null;
            if (c1852l == null || (c1852lAppmetrica = c1852l.appmetrica(c16931l, c8854l)) == null) {
                C8339l.smaato("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                AbstractC18620l abstractC18620lIsPro2 = c1852lAppmetrica.isPro();
                try {
                    synchronized (this.amazon) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                AbstractC11411l abstractC11411l = (AbstractC11411l) list2.get(i2);
                                C13660l c13660l = this.remoteconfig;
                                abstractC11411l.getClass();
                                Object objYandex = C13843l.yandex(c13660l);
                                arrayList.add(new C8195l(abstractC11411l, objYandex));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                C8195l c8195l = (C8195l) arrayList.get(i3);
                                if (c8195l.f17097l == null) {
                                    C13645l c13645l = this.vip;
                                    ((AbstractC11411l) c8195l.f17098l).getClass();
                                    if (((C13660l) c13645l.f26671l).loadAd(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            C8195l c8195l2 = (C8195l) arrayList.get(i4);
                                            if (c8195l2.f17097l == null) {
                                                C13645l c13645l2 = this.vip;
                                                ((AbstractC11411l) c8195l2.f17098l).getClass();
                                                C13660l c13660l2 = (C13660l) c13645l2.f26671l;
                                                if (c13660l2.subs()) {
                                                    ((C13660l) c13645l2.f26670l).yandex();
                                                }
                                            }
                                            arrayList3.add(c8195l2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((C8195l) arrayList.get(i5)).f17097l != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((C8195l) arrayList.get(i6)).f17097l == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        C8195l c8195l3 = (C8195l) arrayList.get(i7);
                                        if (c8195l3.f17097l == null) {
                                        }
                                    }
                                    synchronized (this.amazon) {
                                        AbstractC3984l.license(this.smaato, arrayList4);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((C8195l) obj2).f17097l != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    c6931l.ads(arrayList);
                    Unit unit2 = Unit.INSTANCE;
                    AbstractC18620l.adcel(abstractC18620lIsPro2);
                    premium(c1852lAppmetrica);
                } catch (Throwable th2) {
                    AbstractC18620l.adcel(abstractC18620lIsPro2);
                    throw th2;
                }
            } catch (Throwable th3) {
                premium(c1852lAppmetrica);
                throw th3;
            }
        }
        return AbstractC16901l.m4213const(map.keySet());
    }

    public final boolean inmobi() {
        return !this.Signature && (((C12633l) ((C11644l) this.loadAd.f5556l).f23361l).get() & 134217727) > 0;
    }

    @Override // defpackage.AbstractC0306l
    public final InterfaceC12932l isPro() {
        return this.advert;
    }

    @Override // defpackage.AbstractC0306l
    public final void license(C6931l c6931l) {
        synchronized (this.amazon) {
            if (this.mopub.remove(c6931l)) {
                this.admob = null;
            }
            this.isPro.remoteconfig(c6931l);
            this.firebase.remove(c6931l);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC0306l
    public final C6295l loadAd(C6931l c6931l, InterfaceC14382l interfaceC14382l, Function2 function2) {
        C4816l c4816l = this.pro;
        try {
            InterfaceC14382l interfaceC14382l2 = c6931l.f14530l;
            c6931l.f14530l = interfaceC14382l;
            try {
                yandex(c6931l, function2);
                C6295l c6295l = (C6295l) c4816l.get();
                if (c6295l == null) {
                    c6295l = AbstractC13087l.yandex;
                }
                c6931l.f14530l = interfaceC14382l2;
                c4816l.firebase(null);
                return c6295l;
            } catch (Throwable th) {
                c6931l.f14530l = interfaceC14382l2;
                throw th;
            }
        } catch (Throwable th2) {
            c4816l.firebase(null);
            throw th2;
        }
    }

    @Override // defpackage.AbstractC0306l
    public final long mopub() {
        return 1000L;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m1607native() {
        synchronized (this.amazon) {
            this.Signature = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final boolean m1608package() {
        return !this.Signature && (((C12633l) ((C11644l) this.crashlytics.f36009l).f23361l).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m1609private(C6931l c6931l) {
        synchronized (this.amazon) {
            ArrayList arrayList = this.smaato;
            if (arrayList.size() > 0) {
                ((AbstractC11411l) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    @Override // defpackage.AbstractC0306l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.AbstractC0306l
    public final AbstractC5758l remoteconfig(AbstractC11411l abstractC11411l) {
        AbstractC5758l abstractC5758l;
        synchronized (this.amazon) {
            abstractC5758l = (AbstractC5758l) this.metrica.smaato(abstractC11411l);
        }
        return abstractC5758l;
    }

    @Override // defpackage.AbstractC0306l
    public final void smaato(C6931l c6931l) {
        InterfaceC4305l interfaceC4305lAppmetrica;
        synchronized (this.amazon) {
            if (this.isPro.firebase(c6931l)) {
                interfaceC4305lAppmetrica = null;
            } else {
                this.isPro.crashlytics(c6931l);
                interfaceC4305lAppmetrica = appmetrica();
            }
        }
        if (interfaceC4305lAppmetrica != null) {
            ((C2397l) interfaceC4305lAppmetrica).subs(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final List m1610strictfp() {
        List list = this.admob;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.mopub;
        List arrayList2 = arrayList.isEmpty() ? C2580l.f5619l : new ArrayList(arrayList);
        this.admob = arrayList2;
        return arrayList2;
    }

    @Override // defpackage.AbstractC0306l
    public final InterfaceC3263l subscription(C11029l c11029l) {
        C18449l c18449l = this.crashlytics;
        C11644l c11644l = (C11644l) c18449l.f36009l;
        C1397l c1397l = new C1397l();
        c1397l.yandex = c11029l;
        return c11644l.m3156l(c1397l, (C9810l) c18449l.f36012l);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m1611switch() {
        InterfaceC4305l interfaceC4305lAppmetrica;
        synchronized (this.amazon) {
            if (this.Signature) {
                this.Signature = false;
                interfaceC4305lAppmetrica = appmetrica();
            } else {
                interfaceC4305lAppmetrica = null;
            }
        }
        if (interfaceC4305lAppmetrica != null) {
            ((C2397l) interfaceC4305lAppmetrica).subs(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean m1612synchronized() {
        boolean z;
        synchronized (this.amazon) {
            z = this.subs.subs() || this.isPro.f34846l != 0 || inmobi() || m1608package();
        }
        return z;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final C6931l m1613throw(C6931l c6931l, C6295l c6295l) {
        C6295l c6295l2;
        C1852l c1852lAppmetrica;
        if (!c6931l.f14523l.f14606throws && !c6931l.license() && ((c6295l2 = this.ads) == null || !c6295l2.crashlytics(c6931l))) {
            C16931l c16931l = new C16931l(6, c6931l);
            C8854l c8854l = new C8854l(c6931l, c6295l, 28);
            AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
            C1852l c1852l = abstractC18620lIsPro instanceof C1852l ? (C1852l) abstractC18620lIsPro : null;
            if (c1852l == null || (c1852lAppmetrica = c1852l.appmetrica(c16931l, c8854l)) == null) {
                C8339l.smaato("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    AbstractC18620l abstractC18620lIsPro2 = c1852lAppmetrica.isPro();
                    if (c6295l != null) {
                        try {
                            if (c6295l.subs()) {
                                C8652l c8652l = new C8652l(c6295l, c6931l, 9);
                                C6956l c6956l = c6931l.f14523l;
                                if (c6956l.f14606throws) {
                                    AbstractC2032l.yandex("Preparing a composition while composing is not supported");
                                }
                                c6956l.f14606throws = true;
                                try {
                                    c8652l.invoke();
                                    c6956l.f14606throws = false;
                                } catch (Throwable th) {
                                    c6956l.f14606throws = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            AbstractC18620l.adcel(abstractC18620lIsPro2);
                            throw th2;
                        }
                    }
                    boolean zAd = c6931l.ad();
                    AbstractC18620l.adcel(abstractC18620lIsPro2);
                    premium(c1852lAppmetrica);
                    if (zAd) {
                        return c6931l;
                    }
                } catch (Throwable th3) {
                    premium(c1852lAppmetrica);
                    throw th3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m1614throws() {
        return this.isPro.f34846l != 0 || inmobi() || m1608package() || this.remoteconfig.isPro();
    }

    @Override // defpackage.AbstractC0306l
    public final C6295l vip(C6931l c6931l, InterfaceC14382l interfaceC14382l, C6295l c6295l) {
        C4816l c4816l = this.pro;
        try {
            m1605else();
            c6931l.advert(new C16927l(c6295l));
            InterfaceC14382l interfaceC14382l2 = c6931l.f14530l;
            c6931l.f14530l = interfaceC14382l;
            try {
                C6931l c6931lM1613throw = m1613throw(c6931l, null);
                if (c6931lM1613throw != null) {
                    m1609private(c6931l);
                    c6931lM1613throw.purchase();
                    c6931lM1613throw.mopub();
                }
                C6295l c6295l2 = (C6295l) c4816l.get();
                if (c6295l2 == null) {
                    c6295l2 = AbstractC13087l.yandex;
                }
                c6931l.f14530l = interfaceC14382l2;
                c4816l.firebase(null);
                return c6295l2;
            } catch (Throwable th) {
                c6931l.f14530l = interfaceC14382l2;
                throw th;
            }
        } catch (Throwable th2) {
            c4816l.firebase(null);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m1615volatile() {
        InterfaceC4305l interfaceC4305lAppmetrica;
        synchronized (this.amazon) {
            interfaceC4305lAppmetrica = appmetrica();
            if (((EnumC6767l) this.license.getValue()).compareTo(EnumC6767l.f14179l) <= 0) {
                throw AbstractC4952l.yandex("Recomposer shutdown; frame clock awaiter will never resume", this.billing);
            }
        }
        if (interfaceC4305lAppmetrica != null) {
            ((C2397l) interfaceC4305lAppmetrica).subs(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC0306l
    public final void yandex(C6931l c6931l, Function2 function2) throws Throwable {
        EnumC6767l enumC6767l;
        boolean zContains;
        C1852l c1852lAppmetrica;
        boolean z = c6931l.f14523l.f14606throws;
        synchronized (this.amazon) {
            EnumC6767l enumC6767l2 = (EnumC6767l) this.license.getValue();
            enumC6767l = EnumC6767l.f14179l;
            zContains = enumC6767l2.compareTo(enumC6767l) > 0 ? true ^ m1610strictfp().contains(c6931l) : true;
        }
        try {
            C16931l c16931l = new C16931l(6, c6931l);
            C8854l c8854l = new C8854l(c6931l, null, 28);
            AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
            C1852l c1852l = abstractC18620lIsPro instanceof C1852l ? (C1852l) abstractC18620lIsPro : null;
            if (c1852l == null || (c1852lAppmetrica = c1852l.appmetrica(c16931l, c8854l)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC18620l abstractC18620lIsPro2 = c1852lAppmetrica.isPro();
                try {
                    c6931l.firebase(function2);
                    Unit unit = Unit.INSTANCE;
                    AbstractC18620l.adcel(abstractC18620lIsPro2);
                    premium(c1852lAppmetrica);
                    synchronized (this.amazon) {
                        if (((EnumC6767l) this.license.getValue()).compareTo(enumC6767l) > 0 && !m1610strictfp().contains(c6931l)) {
                            this.mopub.add(c6931l);
                            this.admob = null;
                        }
                    }
                    if (!z) {
                        AbstractC9620l.isPro().remoteconfig();
                    }
                    try {
                        m1609private(c6931l);
                        try {
                            c6931l.purchase();
                            c6931l.mopub();
                            if (z) {
                                return;
                            }
                            AbstractC9620l.isPro().remoteconfig();
                        } catch (Throwable th) {
                            m1603catch(th, null);
                        }
                    } catch (Throwable th2) {
                        m1603catch(th2, c6931l);
                    }
                } catch (Throwable th3) {
                    AbstractC18620l.adcel(abstractC18620lIsPro2);
                    throw th3;
                }
            } catch (Throwable th4) {
                premium(c1852lAppmetrica);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.amazon) {
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            m1603catch(th5, c6931l);
        }
    }

    @Override // defpackage.AbstractC0306l
    public final void metrica(Set set) {
    }
}
