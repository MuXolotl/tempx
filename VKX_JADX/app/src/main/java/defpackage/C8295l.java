package defpackage;

import android.os.Trace;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8295l extends AbstractC14971l implements InterfaceC7150l, InterfaceC16388l, InterfaceC3703l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public Map f17182l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public int f17183l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public int f17184l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f17185l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C11090l f17186l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public Function1 f17187l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f17188l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public InterfaceC16061l f17189l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C15999l f17190l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C17005l f17191l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C3625l f17192l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public C3106l f17193l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public Function1 f17194l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public C17232l f17195l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public Function1 f17196l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public List f17197l;

    public C8295l(C3625l c3625l, C11090l c11090l, InterfaceC16061l interfaceC16061l, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, C17005l c17005l, Function1 function3) {
        this.f17192l = c3625l;
        this.f17186l = c11090l;
        this.f17189l = interfaceC16061l;
        this.f17196l = function1;
        this.f17188l = i;
        this.f17185l = z;
        this.f17184l = i2;
        this.f17183l = i3;
        this.f17197l = list;
        this.f17187l = function2;
        this.f17191l = c17005l;
        this.f17194l = function3;
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            C15999l c15999lM2295l = m2295l(interfaceC7448l);
            boolean zCrashlytics = c15999lM2295l.crashlytics(j, interfaceC7448l.getLayoutDirection());
            C0327l c0327l = c15999lM2295l.vip;
            if (c0327l == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + c15999lM2295l);
            }
            long j2 = c0327l.crashlytics;
            c0327l.loadAd.yandex.mo1545l();
            if (zCrashlytics) {
                AbstractC4047l.subs(this);
                Function1 function1 = this.f17196l;
                if (function1 != null) {
                    function1.invoke(c0327l);
                }
                C17005l c17005l = this.f17191l;
                if (c17005l != null) {
                    c17005l.amazon(c0327l);
                }
                Map linkedHashMap = this.f17182l;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(AbstractC12013l.yandex, Integer.valueOf(Math.round(c0327l.amazon)));
                linkedHashMap.put(AbstractC12013l.loadAd, Integer.valueOf(Math.round(c0327l.purchase)));
                this.f17182l = linkedHashMap;
            }
            Function1 function2 = this.f17187l;
            if (function2 != null) {
                function2.invoke(c0327l.billing);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            InterfaceC17792l interfaceC17792lIsVip = interfaceC7448l.isVip(i, i2, this.f17182l, new C10889l(interfaceC6357l.adcel(AbstractC13628l.billing(i, i, i2, i2)), 13));
            Trace.endSection();
            return interfaceC17792lIsVip;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return m2295l(abstractC11754l).yandex(i, abstractC11754l.getLayoutDirection());
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lۣؕؐ] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        C3106l c3106l = this.f17193l;
        ?? r0 = c3106l;
        if (c3106l == null) {
            final int i = 0;
            ?? r1 = new Function1(this) { // from class: lۣؕؐ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C8295l f6648l;

                {
                    this.f6648l = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C0327l c0327l;
                    boolean z;
                    int i2 = i;
                    C8295l c8295l = this.f6648l;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            C0327l c0327l2 = c8295l.m2296l().vip;
                            if (c0327l2 != null) {
                                C17555l c17555l = c0327l2.yandex;
                                c0327l = new C0327l(new C17555l(c17555l.yandex, C11090l.billing(c8295l.f17186l, C9735l.firebase, 0L, null, null, null, 0L, 0, 0L, 16777214), c17555l.crashlytics, c17555l.amazon, c17555l.purchase, c17555l.billing, c17555l.mopub, c17555l.admob, c17555l.subs, c17555l.isPro), c0327l2.loadAd, c0327l2.crashlytics);
                                list.add(c0327l);
                            } else {
                                c0327l = null;
                            }
                            return Boolean.valueOf(c0327l != null);
                        case 1:
                            C3625l c3625l = (C3625l) obj;
                            C17232l c17232l = c8295l.f17195l;
                            C2580l c2580l = C2580l.f5619l;
                            if (c17232l == null) {
                                C17232l c17232l2 = new C17232l(c8295l.f17192l, c3625l);
                                C15999l c15999l = new C15999l(c3625l, c8295l.f17186l, c8295l.f17189l, c8295l.f17188l, c8295l.f17185l, c8295l.f17184l, c8295l.f17183l, c2580l);
                                c15999l.amazon(c8295l.m2296l().isPro);
                                c17232l2.amazon = c15999l;
                                c8295l.f17195l = c17232l2;
                            } else if (!AbstractC8576l.yandex(c3625l, c17232l.loadAd)) {
                                c17232l.loadAd = c3625l;
                                C15999l c15999l2 = c17232l.amazon;
                                if (c15999l2 != null) {
                                    c15999l2.mopub(c3625l, c8295l.f17186l, c8295l.f17189l, c8295l.f17188l, c8295l.f17185l, c8295l.f17184l, c8295l.f17183l, c2580l);
                                }
                            }
                            AbstractC18037l.purchase(c8295l);
                            AbstractC4047l.isPro(c8295l);
                            AbstractC2697l.firebase(c8295l);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            C17232l c17232l3 = c8295l.f17195l;
                            if (c17232l3 == null) {
                                z = false;
                            } else {
                                Function1 function1 = c8295l.f17194l;
                                if (function1 != null) {
                                    function1.invoke(c17232l3);
                                }
                                C17232l c17232l4 = c8295l.f17195l;
                                if (c17232l4 != null) {
                                    c17232l4.crashlytics = zBooleanValue;
                                }
                                AbstractC18037l.purchase(c8295l);
                                AbstractC4047l.isPro(c8295l);
                                AbstractC2697l.firebase(c8295l);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.f17193l = r1;
            r0 = r1;
        }
        C3625l c3625l = this.f17192l;
        InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
        interfaceC17593l.amazon(AbstractC0424l.applovin, Collections.singletonList(c3625l));
        C17232l c17232l = this.f17195l;
        if (c17232l != null) {
            C3625l c3625l2 = c17232l.loadAd;
            C4707l c4707l = AbstractC0424l.appmetrica;
            InterfaceC13922l[] interfaceC13922lArr2 = AbstractC3668l.yandex;
            InterfaceC13922l interfaceC13922l = interfaceC13922lArr2[16];
            interfaceC17593l.amazon(c4707l, c3625l2);
            boolean z = c17232l.crashlytics;
            C4707l c4707l2 = AbstractC0424l.inmobi;
            InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr2[17];
            interfaceC17593l.amazon(c4707l2, Boolean.valueOf(z));
        }
        final int i2 = 1;
        interfaceC17593l.amazon(AbstractC16601l.smaato, new C7629l(null, new Function1(this) { // from class: lۣؕؐ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C8295l f6648l;

            {
                this.f6648l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C0327l c0327l;
                boolean z2;
                int i3 = i2;
                C8295l c8295l = this.f6648l;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        C0327l c0327l2 = c8295l.m2296l().vip;
                        if (c0327l2 != null) {
                            C17555l c17555l = c0327l2.yandex;
                            c0327l = new C0327l(new C17555l(c17555l.yandex, C11090l.billing(c8295l.f17186l, C9735l.firebase, 0L, null, null, null, 0L, 0, 0L, 16777214), c17555l.crashlytics, c17555l.amazon, c17555l.purchase, c17555l.billing, c17555l.mopub, c17555l.admob, c17555l.subs, c17555l.isPro), c0327l2.loadAd, c0327l2.crashlytics);
                            list.add(c0327l);
                        } else {
                            c0327l = null;
                        }
                        return Boolean.valueOf(c0327l != null);
                    case 1:
                        C3625l c3625l3 = (C3625l) obj;
                        C17232l c17232l2 = c8295l.f17195l;
                        C2580l c2580l = C2580l.f5619l;
                        if (c17232l2 == null) {
                            C17232l c17232l3 = new C17232l(c8295l.f17192l, c3625l3);
                            C15999l c15999l = new C15999l(c3625l3, c8295l.f17186l, c8295l.f17189l, c8295l.f17188l, c8295l.f17185l, c8295l.f17184l, c8295l.f17183l, c2580l);
                            c15999l.amazon(c8295l.m2296l().isPro);
                            c17232l3.amazon = c15999l;
                            c8295l.f17195l = c17232l3;
                        } else if (!AbstractC8576l.yandex(c3625l3, c17232l2.loadAd)) {
                            c17232l2.loadAd = c3625l3;
                            C15999l c15999l2 = c17232l2.amazon;
                            if (c15999l2 != null) {
                                c15999l2.mopub(c3625l3, c8295l.f17186l, c8295l.f17189l, c8295l.f17188l, c8295l.f17185l, c8295l.f17184l, c8295l.f17183l, c2580l);
                            }
                        }
                        AbstractC18037l.purchase(c8295l);
                        AbstractC4047l.isPro(c8295l);
                        AbstractC2697l.firebase(c8295l);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C17232l c17232l4 = c8295l.f17195l;
                        if (c17232l4 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = c8295l.f17194l;
                            if (function1 != null) {
                                function1.invoke(c17232l4);
                            }
                            C17232l c17232l5 = c8295l.f17195l;
                            if (c17232l5 != null) {
                                c17232l5.crashlytics = zBooleanValue;
                            }
                            AbstractC18037l.purchase(c8295l);
                            AbstractC4047l.isPro(c8295l);
                            AbstractC2697l.firebase(c8295l);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        interfaceC17593l.amazon(AbstractC16601l.remoteconfig, new C7629l(null, new Function1(this) { // from class: lۣؕؐ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C8295l f6648l;

            {
                this.f6648l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C0327l c0327l;
                boolean z2;
                int i4 = i3;
                C8295l c8295l = this.f6648l;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        C0327l c0327l2 = c8295l.m2296l().vip;
                        if (c0327l2 != null) {
                            C17555l c17555l = c0327l2.yandex;
                            c0327l = new C0327l(new C17555l(c17555l.yandex, C11090l.billing(c8295l.f17186l, C9735l.firebase, 0L, null, null, null, 0L, 0, 0L, 16777214), c17555l.crashlytics, c17555l.amazon, c17555l.purchase, c17555l.billing, c17555l.mopub, c17555l.admob, c17555l.subs, c17555l.isPro), c0327l2.loadAd, c0327l2.crashlytics);
                            list.add(c0327l);
                        } else {
                            c0327l = null;
                        }
                        return Boolean.valueOf(c0327l != null);
                    case 1:
                        C3625l c3625l3 = (C3625l) obj;
                        C17232l c17232l2 = c8295l.f17195l;
                        C2580l c2580l = C2580l.f5619l;
                        if (c17232l2 == null) {
                            C17232l c17232l3 = new C17232l(c8295l.f17192l, c3625l3);
                            C15999l c15999l = new C15999l(c3625l3, c8295l.f17186l, c8295l.f17189l, c8295l.f17188l, c8295l.f17185l, c8295l.f17184l, c8295l.f17183l, c2580l);
                            c15999l.amazon(c8295l.m2296l().isPro);
                            c17232l3.amazon = c15999l;
                            c8295l.f17195l = c17232l3;
                        } else if (!AbstractC8576l.yandex(c3625l3, c17232l2.loadAd)) {
                            c17232l2.loadAd = c3625l3;
                            C15999l c15999l2 = c17232l2.amazon;
                            if (c15999l2 != null) {
                                c15999l2.mopub(c3625l3, c8295l.f17186l, c8295l.f17189l, c8295l.f17188l, c8295l.f17185l, c8295l.f17184l, c8295l.f17183l, c2580l);
                            }
                        }
                        AbstractC18037l.purchase(c8295l);
                        AbstractC4047l.isPro(c8295l);
                        AbstractC2697l.firebase(c8295l);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C17232l c17232l4 = c8295l.f17195l;
                        if (c17232l4 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = c8295l.f17194l;
                            if (function1 != null) {
                                function1.invoke(c17232l4);
                            }
                            C17232l c17232l5 = c8295l.f17195l;
                            if (c17232l5 != null) {
                                c17232l5.crashlytics = zBooleanValue;
                            }
                            AbstractC18037l.purchase(c8295l);
                            AbstractC4047l.isPro(c8295l);
                            AbstractC2697l.firebase(c8295l);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        interfaceC17593l.amazon(AbstractC16601l.vip, new C7629l(null, new C5767l(20, this)));
        AbstractC3668l.loadAd(interfaceC17593l, r0);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final boolean m2293l(C11090l c11090l, List list, int i, int i2, boolean z, InterfaceC16061l interfaceC16061l, int i3) {
        boolean z2 = !this.f17186l.amazon(c11090l);
        this.f17186l = c11090l;
        if (!AbstractC8576l.yandex(this.f17197l, list)) {
            this.f17197l = list;
            z2 = true;
        }
        if (this.f17183l != i) {
            this.f17183l = i;
            z2 = true;
        }
        if (this.f17184l != i2) {
            this.f17184l = i2;
            z2 = true;
        }
        if (this.f17185l != z) {
            this.f17185l = z;
            z2 = true;
        }
        if (!AbstractC8576l.yandex(this.f17189l, interfaceC16061l)) {
            this.f17189l = interfaceC16061l;
            z2 = true;
        }
        if (this.f17188l == i3) {
            return z2;
        }
        this.f17188l = i3;
        return true;
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m2294l(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            m2296l().mopub(this.f17192l, this.f17186l, this.f17189l, this.f17188l, this.f17185l, this.f17184l, this.f17183l, this.f17197l);
        }
        if (this.f29462l) {
            if (z2 || (z && this.f17193l != null)) {
                AbstractC18037l.purchase(this);
            }
            if (z2 || z3 || z4) {
                AbstractC4047l.isPro(this);
                AbstractC2697l.firebase(this);
            }
            if (z) {
                AbstractC2697l.firebase(this);
            }
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) throws Throwable {
        C3242l c3242l;
        C18449l c18449l;
        long j;
        C0327l c0327l;
        C6742l c6742l2 = c6742l;
        if (this.f29462l) {
            C17005l c17005l = this.f17191l;
            if (c17005l != null && (c3242l = (C3242l) c17005l.f33136l.yandex().purchase(c17005l.f33137l)) != null) {
                C15812l c15812l = c3242l.loadAd;
                C15812l c15812l2 = c3242l.yandex;
                boolean z = c3242l.crashlytics;
                int i = !z ? c15812l2.loadAd : c15812l.loadAd;
                int i2 = !z ? c15812l.loadAd : c15812l2.loadAd;
                if (i != i2) {
                    C18329l c18329l = c17005l.f33138l;
                    int iLoadAd = (c18329l == null || (c0327l = (C0327l) c18329l.crashlytics.invoke()) == null) ? 0 : c18329l.loadAd(c0327l);
                    if (i > iLoadAd) {
                        i = iLoadAd;
                    }
                    if (i2 > iLoadAd) {
                        i2 = iLoadAd;
                    }
                    C0327l c0327l2 = (C0327l) c17005l.f33139l.f1957l;
                    C9902l c9902lFirebase = c0327l2 != null ? c0327l2.firebase(i, i2) : null;
                    if (c9902lFirebase != null) {
                        C0327l c0327l3 = (C0327l) c17005l.f33139l.f1957l;
                        if (c0327l3 == null || c0327l3.yandex.billing == 3 || !c0327l3.amazon()) {
                            c6742l2 = c6742l;
                            AbstractC9361l.remoteconfig(c6742l2, c9902lFirebase, c17005l.f33134l, 0.0f, null, 60);
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c6742l2.admob() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c6742l2.admob() & 4294967295L));
                            C18449l c18449l2 = c6742l2.f14144l.f26629l;
                            long jM4551private = c18449l2.m4551private();
                            c18449l2.m4555synchronized().mopub();
                            try {
                                ((C16543l) c18449l2.f36010l).remoteconfig(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                                c18449l = c18449l2;
                                try {
                                    j = jM4551private;
                                    try {
                                        AbstractC9361l.remoteconfig(c6742l2, c9902lFirebase, c17005l.f33134l, 0.0f, null, 60);
                                        AbstractC0653l.license(c18449l, j);
                                        c6742l2 = c6742l;
                                    } catch (Throwable th) {
                                        th = th;
                                        AbstractC0653l.license(c18449l, j);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    j = jM4551private;
                                    AbstractC0653l.license(c18449l, j);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                c18449l = c18449l2;
                            }
                        }
                    }
                }
            }
            InterfaceC14859l interfaceC14859lM4555synchronized = c6742l2.f14144l.f26629l.m4555synchronized();
            C15999l c15999lM2295l = m2295l(c6742l);
            C0327l c0327l4 = c15999lM2295l.vip;
            if (c0327l4 == null) {
                C11983l.ad(c15999lM2295l, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                return;
            }
            C6222l c6222l = c0327l4.loadAd;
            boolean z2 = c0327l4.amazon() && this.f17188l != 3;
            if (z2) {
                long j2 = c0327l4.crashlytics;
                C8896l c8896lIsPro = AbstractC7470l.isPro(0L, (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L));
                interfaceC14859lM4555synchronized.mopub();
                interfaceC14859lM4555synchronized.tapsense(c8896lIsPro);
            }
            try {
                C11090l c11090l = this.f17186l;
                C14264l c14264l = c11090l.yandex;
                C9867l c9867l = c14264l.remoteconfig;
                if (c9867l == null) {
                    c9867l = C9867l.loadAd;
                }
                C9867l c9867l2 = c9867l;
                C0387l c0387l = c14264l.vip;
                if (c0387l == null) {
                    c0387l = C0387l.amazon;
                }
                C0387l c0387l2 = c0387l;
                AbstractC3239l abstractC3239l = c14264l.startapp;
                if (abstractC3239l == null) {
                    abstractC3239l = C5053l.yandex;
                }
                AbstractC3239l abstractC3239l2 = abstractC3239l;
                AbstractC9544l abstractC9544lLoadAd = c11090l.loadAd();
                if (abstractC9544lLoadAd != null) {
                    C6222l.isPro(c6222l, interfaceC14859lM4555synchronized, abstractC9544lLoadAd, this.f17186l.yandex.yandex.yandex(), c0387l2, c9867l2, abstractC3239l2);
                } else {
                    long jCrashlytics = C9735l.firebase;
                    if (jCrashlytics == 16) {
                        jCrashlytics = this.f17186l.crashlytics() != 16 ? this.f17186l.crashlytics() : C9735l.loadAd;
                    }
                    C6222l.subs(c6222l, interfaceC14859lM4555synchronized, jCrashlytics, c0387l2, c9867l2, abstractC3239l2);
                }
                if (z2) {
                    interfaceC14859lM4555synchronized.ads();
                }
                C17232l c17232l = this.f17195l;
                if (!((c17232l == null || !c17232l.crashlytics) ? AbstractC1213l.purchase(this.f17192l) : false)) {
                    List list = this.f17197l;
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                }
                c6742l2.yandex();
            } catch (Throwable th4) {
                if (z2) {
                    interfaceC14859lM4555synchronized.ads();
                }
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final C15999l m2295l(InterfaceC13490l interfaceC13490l) {
        C15999l c15999l;
        C17232l c17232l = this.f17195l;
        if (c17232l != null && c17232l.crashlytics && (c15999l = c17232l.amazon) != null) {
            c15999l.amazon(interfaceC13490l);
            return c15999l;
        }
        C15999l c15999lM2296l = m2296l();
        c15999lM2296l.amazon(interfaceC13490l);
        return c15999lM2296l;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final C15999l m2296l() {
        if (this.f17190l == null) {
            this.f17190l = new C15999l(this.f17192l, this.f17186l, this.f17189l, this.f17188l, this.f17185l, this.f17184l, this.f17183l, this.f17197l);
        }
        return this.f17190l;
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final boolean m2297l(C3625l c3625l) {
        boolean zYandex = AbstractC8576l.yandex(this.f17192l.f7563l, c3625l.f7563l);
        boolean z = (zYandex && AbstractC8576l.yandex(this.f17192l.f7564l, c3625l.f7564l)) ? false : true;
        if (z) {
            this.f17192l = c3625l;
        }
        if (!zYandex) {
            this.f17195l = null;
        }
        return z;
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final boolean m2298l(Function1 function1, Function1 function2, C17005l c17005l, Function1 function3) {
        boolean z;
        if (this.f17196l != function1) {
            this.f17196l = function1;
            z = true;
        } else {
            z = false;
        }
        if (this.f17187l != function2) {
            this.f17187l = function2;
            z = true;
        }
        if (!AbstractC8576l.yandex(this.f17191l, c17005l)) {
            this.f17191l = c17005l;
            z = true;
        }
        if (this.f17194l == function3) {
            return z;
        }
        this.f17194l = function3;
        return true;
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return m2295l(abstractC11754l).yandex(i, abstractC11754l.getLayoutDirection());
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC0509l.loadAd(m2295l(abstractC11754l).purchase(abstractC11754l.getLayoutDirection()).mo1546l());
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC0509l.loadAd(m2295l(abstractC11754l).purchase(abstractC11754l.getLayoutDirection()).mo1547l());
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
