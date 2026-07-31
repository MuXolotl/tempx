package defpackage;

import android.os.Trace;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔٛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2754l extends AbstractC14971l implements InterfaceC7150l, InterfaceC16388l, InterfaceC3703l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public HashMap f5949l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public int f5950l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f5951l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C11090l f5952l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C17347l f5953l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f5954l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public InterfaceC16061l f5955l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C13174l f5956l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public String f5957l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f5958l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public C16836l f5959l;

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0033, B:20:0x003a, B:21:0x0042, B:22:0x0071, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        C16836l c16836lM1245l;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            C13174l c13174l = this.f5956l;
            if (c13174l == null) {
                c16836lM1245l = m1245l();
            } else {
                if (!c13174l.crashlytics) {
                    c13174l = null;
                }
                if (c13174l == null || (c16836lM1245l = c13174l.amazon) == null) {
                    c16836lM1245l = m1245l();
                }
            }
            c16836lM1245l.amazon(interfaceC7448l);
            boolean zLoadAd = c16836lM1245l.loadAd(j, interfaceC7448l.getLayoutDirection());
            InterfaceC4452l interfaceC4452l = c16836lM1245l.vip;
            if (interfaceC4452l != null) {
                interfaceC4452l.mo1545l();
            }
            Unit unit = Unit.INSTANCE;
            C7546l c7546l = c16836lM1245l.isPro;
            long j2 = c16836lM1245l.smaato;
            if (zLoadAd) {
                AbstractC4047l.subs(this);
                HashMap map = this.f5949l;
                if (map == null) {
                    map = new HashMap(2);
                    this.f5949l = map;
                }
                map.put(AbstractC12013l.yandex, Integer.valueOf(Math.round(((C18118l) c7546l.f15549l).amazon(0))));
                C17857l c17857l = AbstractC12013l.loadAd;
                C18118l c18118l = (C18118l) c7546l.f15549l;
                map.put(c17857l, Integer.valueOf(Math.round(c18118l.amazon(c18118l.mopub - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            return interfaceC7448l.isVip(i, i2, this.f5949l, new C10889l(interfaceC6357l.adcel(AbstractC13628l.billing(i, i, i2, i2)), 17));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        C16836l c16836lM1245l;
        C13174l c13174l = this.f5956l;
        if (c13174l == null) {
            c16836lM1245l = m1245l();
        } else {
            if (!c13174l.crashlytics) {
                c13174l = null;
            }
            if (c13174l == null || (c16836lM1245l = c13174l.amazon) == null) {
                c16836lM1245l = m1245l();
            }
        }
        c16836lM1245l.amazon(abstractC11754l);
        return c16836lM1245l.yandex(i, abstractC11754l.getLayoutDirection());
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lٗۗۨ] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        C17347l c17347l = this.f5953l;
        ?? r0 = c17347l;
        if (c17347l == null) {
            final int i = 0;
            ?? r1 = new Function1(this) { // from class: lٗۗۨ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C2754l f33807l;

                {
                    this.f33807l = this;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    InterfaceC13490l interfaceC13490l;
                    C0327l c0327l;
                    int i2 = i;
                    boolean z = true;
                    C2754l c2754l = this.f33807l;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            C16836l c16836lM1245l = c2754l.m1245l();
                            C11090l c11090lBilling = C11090l.billing(c2754l.f5952l, C9735l.firebase, 0L, null, null, null, 0L, 0, 0L, 16777214);
                            EnumC9931l enumC9931l = c16836lM1245l.metrica;
                            C0327l c0327l2 = null;
                            if (enumC9931l == null || (interfaceC13490l = c16836lM1245l.subs) == null) {
                                c0327l = null;
                            } else {
                                C3625l c3625l = new C3625l(c16836lM1245l.yandex);
                                if (c16836lM1245l.isPro == null || c16836lM1245l.vip == null) {
                                    c0327l = null;
                                } else {
                                    long j = c16836lM1245l.startapp & (-8589934589L);
                                    int i3 = c16836lM1245l.billing;
                                    boolean z2 = c16836lM1245l.purchase;
                                    int i4 = c16836lM1245l.amazon;
                                    InterfaceC16061l interfaceC16061l = c16836lM1245l.crashlytics;
                                    C2580l c2580l = C2580l.f5619l;
                                    c0327l = new C0327l(new C17555l(c3625l, c11090lBilling, c2580l, i3, z2, i4, interfaceC13490l, enumC9931l, interfaceC16061l, j), new C6222l(new C11644l(c3625l, c11090lBilling, c2580l, interfaceC13490l, interfaceC16061l), j, c16836lM1245l.billing, c16836lM1245l.amazon), c16836lM1245l.smaato);
                                }
                            }
                            if (c0327l != null) {
                                list.add(c0327l);
                                c0327l2 = c0327l;
                            }
                            return Boolean.valueOf(c0327l2 != null);
                        case 1:
                            String str = ((C3625l) obj).f7563l;
                            C13174l c13174l = c2754l.f5956l;
                            if (c13174l == null) {
                                C13174l c13174l2 = new C13174l(c2754l.f5957l, str);
                                C16836l c16836l = new C16836l(str, c2754l.f5952l, c2754l.f5955l, c2754l.f5958l, c2754l.f5954l, c2754l.f5951l, c2754l.f5950l);
                                c16836l.amazon(c2754l.m1245l().subs);
                                c13174l2.amazon = c16836l;
                                c2754l.f5956l = c13174l2;
                            } else if (!AbstractC8576l.yandex(str, c13174l.loadAd)) {
                                c13174l.loadAd = str;
                                C16836l c16836l2 = c13174l.amazon;
                                if (c16836l2 != null) {
                                    C11090l c11090l = c2754l.f5952l;
                                    InterfaceC16061l interfaceC16061l2 = c2754l.f5955l;
                                    int i5 = c2754l.f5958l;
                                    boolean z3 = c2754l.f5954l;
                                    int i6 = c2754l.f5951l;
                                    int i7 = c2754l.f5950l;
                                    c16836l2.yandex = str;
                                    c16836l2.loadAd = c11090l;
                                    c16836l2.crashlytics = interfaceC16061l2;
                                    c16836l2.amazon = i5;
                                    c16836l2.purchase = z3;
                                    c16836l2.billing = i6;
                                    c16836l2.mopub = i7;
                                    c16836l2.subscription = (c16836l2.subscription << 2) | 2;
                                    c16836l2.crashlytics();
                                }
                            }
                            AbstractC18037l.purchase(c2754l);
                            AbstractC4047l.isPro(c2754l);
                            AbstractC2697l.firebase(c2754l);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            C13174l c13174l3 = c2754l.f5956l;
                            if (c13174l3 == null) {
                                z = false;
                            } else {
                                c13174l3.crashlytics = zBooleanValue;
                                AbstractC18037l.purchase(c2754l);
                                AbstractC4047l.isPro(c2754l);
                                AbstractC2697l.firebase(c2754l);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.f5953l = r1;
            r0 = r1;
        }
        C3625l c3625l = new C3625l(this.f5957l);
        InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
        interfaceC17593l.amazon(AbstractC0424l.applovin, Collections.singletonList(c3625l));
        C13174l c13174l = this.f5956l;
        if (c13174l != null) {
            boolean z = c13174l.crashlytics;
            C4707l c4707l = AbstractC0424l.inmobi;
            InterfaceC13922l[] interfaceC13922lArr2 = AbstractC3668l.yandex;
            InterfaceC13922l interfaceC13922l = interfaceC13922lArr2[17];
            interfaceC17593l.amazon(c4707l, Boolean.valueOf(z));
            C3625l c3625l2 = new C3625l(c13174l.loadAd);
            C4707l c4707l2 = AbstractC0424l.appmetrica;
            InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr2[16];
            interfaceC17593l.amazon(c4707l2, c3625l2);
        }
        final int i2 = 1;
        interfaceC17593l.amazon(AbstractC16601l.smaato, new C7629l(null, new Function1(this) { // from class: lٗۗۨ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C2754l f33807l;

            {
                this.f33807l = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC13490l interfaceC13490l;
                C0327l c0327l;
                int i3 = i2;
                boolean z2 = true;
                C2754l c2754l = this.f33807l;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        C16836l c16836lM1245l = c2754l.m1245l();
                        C11090l c11090lBilling = C11090l.billing(c2754l.f5952l, C9735l.firebase, 0L, null, null, null, 0L, 0, 0L, 16777214);
                        EnumC9931l enumC9931l = c16836lM1245l.metrica;
                        C0327l c0327l2 = null;
                        if (enumC9931l == null || (interfaceC13490l = c16836lM1245l.subs) == null) {
                            c0327l = null;
                        } else {
                            C3625l c3625l3 = new C3625l(c16836lM1245l.yandex);
                            if (c16836lM1245l.isPro == null || c16836lM1245l.vip == null) {
                                c0327l = null;
                            } else {
                                long j = c16836lM1245l.startapp & (-8589934589L);
                                int i4 = c16836lM1245l.billing;
                                boolean z3 = c16836lM1245l.purchase;
                                int i5 = c16836lM1245l.amazon;
                                InterfaceC16061l interfaceC16061l = c16836lM1245l.crashlytics;
                                C2580l c2580l = C2580l.f5619l;
                                c0327l = new C0327l(new C17555l(c3625l3, c11090lBilling, c2580l, i4, z3, i5, interfaceC13490l, enumC9931l, interfaceC16061l, j), new C6222l(new C11644l(c3625l3, c11090lBilling, c2580l, interfaceC13490l, interfaceC16061l), j, c16836lM1245l.billing, c16836lM1245l.amazon), c16836lM1245l.smaato);
                            }
                        }
                        if (c0327l != null) {
                            list.add(c0327l);
                            c0327l2 = c0327l;
                        }
                        return Boolean.valueOf(c0327l2 != null);
                    case 1:
                        String str = ((C3625l) obj).f7563l;
                        C13174l c13174l2 = c2754l.f5956l;
                        if (c13174l2 == null) {
                            C13174l c13174l3 = new C13174l(c2754l.f5957l, str);
                            C16836l c16836l = new C16836l(str, c2754l.f5952l, c2754l.f5955l, c2754l.f5958l, c2754l.f5954l, c2754l.f5951l, c2754l.f5950l);
                            c16836l.amazon(c2754l.m1245l().subs);
                            c13174l3.amazon = c16836l;
                            c2754l.f5956l = c13174l3;
                        } else if (!AbstractC8576l.yandex(str, c13174l2.loadAd)) {
                            c13174l2.loadAd = str;
                            C16836l c16836l2 = c13174l2.amazon;
                            if (c16836l2 != null) {
                                C11090l c11090l = c2754l.f5952l;
                                InterfaceC16061l interfaceC16061l2 = c2754l.f5955l;
                                int i6 = c2754l.f5958l;
                                boolean z4 = c2754l.f5954l;
                                int i7 = c2754l.f5951l;
                                int i8 = c2754l.f5950l;
                                c16836l2.yandex = str;
                                c16836l2.loadAd = c11090l;
                                c16836l2.crashlytics = interfaceC16061l2;
                                c16836l2.amazon = i6;
                                c16836l2.purchase = z4;
                                c16836l2.billing = i7;
                                c16836l2.mopub = i8;
                                c16836l2.subscription = (c16836l2.subscription << 2) | 2;
                                c16836l2.crashlytics();
                            }
                        }
                        AbstractC18037l.purchase(c2754l);
                        AbstractC4047l.isPro(c2754l);
                        AbstractC2697l.firebase(c2754l);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C13174l c13174l4 = c2754l.f5956l;
                        if (c13174l4 == null) {
                            z2 = false;
                        } else {
                            c13174l4.crashlytics = zBooleanValue;
                            AbstractC18037l.purchase(c2754l);
                            AbstractC4047l.isPro(c2754l);
                            AbstractC2697l.firebase(c2754l);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        interfaceC17593l.amazon(AbstractC16601l.remoteconfig, new C7629l(null, new Function1(this) { // from class: lٗۗۨ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C2754l f33807l;

            {
                this.f33807l = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC13490l interfaceC13490l;
                C0327l c0327l;
                int i4 = i3;
                boolean z2 = true;
                C2754l c2754l = this.f33807l;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        C16836l c16836lM1245l = c2754l.m1245l();
                        C11090l c11090lBilling = C11090l.billing(c2754l.f5952l, C9735l.firebase, 0L, null, null, null, 0L, 0, 0L, 16777214);
                        EnumC9931l enumC9931l = c16836lM1245l.metrica;
                        C0327l c0327l2 = null;
                        if (enumC9931l == null || (interfaceC13490l = c16836lM1245l.subs) == null) {
                            c0327l = null;
                        } else {
                            C3625l c3625l3 = new C3625l(c16836lM1245l.yandex);
                            if (c16836lM1245l.isPro == null || c16836lM1245l.vip == null) {
                                c0327l = null;
                            } else {
                                long j = c16836lM1245l.startapp & (-8589934589L);
                                int i5 = c16836lM1245l.billing;
                                boolean z3 = c16836lM1245l.purchase;
                                int i6 = c16836lM1245l.amazon;
                                InterfaceC16061l interfaceC16061l = c16836lM1245l.crashlytics;
                                C2580l c2580l = C2580l.f5619l;
                                c0327l = new C0327l(new C17555l(c3625l3, c11090lBilling, c2580l, i5, z3, i6, interfaceC13490l, enumC9931l, interfaceC16061l, j), new C6222l(new C11644l(c3625l3, c11090lBilling, c2580l, interfaceC13490l, interfaceC16061l), j, c16836lM1245l.billing, c16836lM1245l.amazon), c16836lM1245l.smaato);
                            }
                        }
                        if (c0327l != null) {
                            list.add(c0327l);
                            c0327l2 = c0327l;
                        }
                        return Boolean.valueOf(c0327l2 != null);
                    case 1:
                        String str = ((C3625l) obj).f7563l;
                        C13174l c13174l2 = c2754l.f5956l;
                        if (c13174l2 == null) {
                            C13174l c13174l3 = new C13174l(c2754l.f5957l, str);
                            C16836l c16836l = new C16836l(str, c2754l.f5952l, c2754l.f5955l, c2754l.f5958l, c2754l.f5954l, c2754l.f5951l, c2754l.f5950l);
                            c16836l.amazon(c2754l.m1245l().subs);
                            c13174l3.amazon = c16836l;
                            c2754l.f5956l = c13174l3;
                        } else if (!AbstractC8576l.yandex(str, c13174l2.loadAd)) {
                            c13174l2.loadAd = str;
                            C16836l c16836l2 = c13174l2.amazon;
                            if (c16836l2 != null) {
                                C11090l c11090l = c2754l.f5952l;
                                InterfaceC16061l interfaceC16061l2 = c2754l.f5955l;
                                int i7 = c2754l.f5958l;
                                boolean z4 = c2754l.f5954l;
                                int i8 = c2754l.f5951l;
                                int i9 = c2754l.f5950l;
                                c16836l2.yandex = str;
                                c16836l2.loadAd = c11090l;
                                c16836l2.crashlytics = interfaceC16061l2;
                                c16836l2.amazon = i7;
                                c16836l2.purchase = z4;
                                c16836l2.billing = i8;
                                c16836l2.mopub = i9;
                                c16836l2.subscription = (c16836l2.subscription << 2) | 2;
                                c16836l2.crashlytics();
                            }
                        }
                        AbstractC18037l.purchase(c2754l);
                        AbstractC4047l.isPro(c2754l);
                        AbstractC2697l.firebase(c2754l);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C13174l c13174l4 = c2754l.f5956l;
                        if (c13174l4 == null) {
                            z2 = false;
                        } else {
                            c13174l4.crashlytics = zBooleanValue;
                            AbstractC18037l.purchase(c2754l);
                            AbstractC4047l.isPro(c2754l);
                            AbstractC2697l.firebase(c2754l);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        interfaceC17593l.amazon(AbstractC16601l.vip, new C7629l(null, new C5767l(26, this)));
        AbstractC3668l.loadAd(interfaceC17593l, r0);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final C16836l m1245l() {
        C11090l c11090l = this.f5952l;
        if (this.f5959l == null) {
            this.f5959l = new C16836l(this.f5957l, c11090l, this.f5955l, this.f5958l, this.f5954l, this.f5951l, this.f5950l);
        }
        return this.f5959l;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        C16836l c16836lM1245l;
        if (this.f29462l) {
            C13174l c13174l = this.f5956l;
            if (c13174l == null) {
                c16836lM1245l = m1245l();
            } else {
                if (!c13174l.crashlytics) {
                    c13174l = null;
                }
                if (c13174l == null || (c16836lM1245l = c13174l.amazon) == null) {
                    c16836lM1245l = m1245l();
                }
            }
            C7546l c7546l = c16836lM1245l.isPro;
            if (c7546l == null) {
                AbstractC14825l.loadAd("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f5959l + ", textSubstitution=" + this.f5956l + ")");
                C17132l.firebase();
                return;
            }
            InterfaceC14859l interfaceC14859lM4555synchronized = c6742l.f14144l.f26629l.m4555synchronized();
            boolean z = c16836lM1245l.firebase;
            if (z) {
                long j = c16836lM1245l.smaato;
                interfaceC14859lM4555synchronized.mopub();
                interfaceC14859lM4555synchronized.metrica(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                C11090l c11090l = this.f5952l;
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
                    c7546l.isVip(interfaceC14859lM4555synchronized, abstractC9544lLoadAd, c11090l.yandex.yandex.yandex(), c0387l2, c9867l2, abstractC3239l2);
                } else {
                    long jCrashlytics = C9735l.firebase;
                    if (jCrashlytics == 16) {
                        jCrashlytics = c11090l.crashlytics() != 16 ? c11090l.crashlytics() : C9735l.loadAd;
                    }
                    c7546l.advert(interfaceC14859lM4555synchronized, jCrashlytics, c0387l2, c9867l2, abstractC3239l2);
                }
            } finally {
                if (z) {
                    interfaceC14859lM4555synchronized.ads();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        C16836l c16836lM1245l;
        C13174l c13174l = this.f5956l;
        if (c13174l == null) {
            c16836lM1245l = m1245l();
        } else {
            if (!c13174l.crashlytics) {
                c13174l = null;
            }
            if (c13174l == null || (c16836lM1245l = c13174l.amazon) == null) {
                c16836lM1245l = m1245l();
            }
        }
        c16836lM1245l.amazon(abstractC11754l);
        return c16836lM1245l.yandex(i, abstractC11754l.getLayoutDirection());
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        C16836l c16836lM1245l;
        C13174l c13174l = this.f5956l;
        if (c13174l == null) {
            c16836lM1245l = m1245l();
        } else {
            if (!c13174l.crashlytics) {
                c13174l = null;
            }
            if (c13174l == null || (c16836lM1245l = c13174l.amazon) == null) {
                c16836lM1245l = m1245l();
            }
        }
        c16836lM1245l.amazon(abstractC11754l);
        return AbstractC0509l.loadAd(c16836lM1245l.purchase(abstractC11754l.getLayoutDirection()).mo1546l());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        C16836l c16836lM1245l;
        C13174l c13174l = this.f5956l;
        if (c13174l == null) {
            c16836lM1245l = m1245l();
        } else {
            if (!c13174l.crashlytics) {
                c13174l = null;
            }
            if (c13174l == null || (c16836lM1245l = c13174l.amazon) == null) {
                c16836lM1245l = m1245l();
            }
        }
        c16836lM1245l.amazon(abstractC11754l);
        return AbstractC0509l.loadAd(c16836lM1245l.purchase(abstractC11754l.getLayoutDirection()).mo1547l());
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
