package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕٟۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15855l implements InterfaceC10367l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f31105l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f31106l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f31107l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f31108l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f31109l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Object f31110l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f31111l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f31112l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f31113l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f31114l;

    public C15855l(C5384l c5384l) {
        this.f31114l = new ArrayList();
        this.f31106l = new HashMap();
        this.f31107l = new ArrayList();
        this.f31113l = new HashMap();
        this.f31108l = c5384l.f11525l;
        this.f31105l = c5384l.f11521l;
        this.f31112l = c5384l.f11528l;
        this.f31111l = c5384l.f11524l;
        this.f31114l = new ArrayList(c5384l.f11527l);
        this.f31106l = new HashMap(c5384l.f11530l);
        this.f31107l = new ArrayList(c5384l.f11522l);
        this.f31113l = new HashMap(c5384l.f11523l);
        this.f31109l = c5384l.f11529l;
        this.f31110l = c5384l.f11526l;
    }

    @Override // defpackage.InterfaceC10367l
    public void amazon(Executor executor, InterfaceC15984l interfaceC15984l) {
        List listUnmodifiableList;
        Throwable th;
        executor.getClass();
        interfaceC15984l.getClass();
        ((CopyOnWriteArrayList) this.f31105l).add(new C4200l(executor, interfaceC15984l));
        synchronized (this.f31108l) {
            try {
                if (!this.f31109l && !((CopyOnWriteArrayList) this.f31105l).isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.f31109l = true;
                    crashlytics();
                }
                listUnmodifiableList = DesugarCollections.unmodifiableList((List) this.f31112l);
                th = (Throwable) this.f31111l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executor.execute(new RunnableC10613l(th, new C4200l(executor, interfaceC15984l), listUnmodifiableList, 0));
    }

    public void crashlytics() {
        int i = 0;
        int i2 = 1;
        if (!((AtomicBoolean) this.f31107l).compareAndSet(false, true)) {
            Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
        C7504l c7504l = (C7504l) this.f31113l;
        InterfaceC14029l interfaceC14029l = null;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        C9122l c9122l = new C9122l();
        c9122l.f18750l = true;
        this.f31113l = AbstractC0622l.startapp(new C15796l(new C2347l(new C14300l((InterfaceC6942l) this.f31114l, i), new C17949l(this, c9122l, interfaceC14029l, 6), 2), new C13749l(this, interfaceC14029l, 7), i2), (C18662l) this.f31106l);
    }

    public C15855l loadAd(final C4608l c4608l) {
        String str = (String) this.f31108l;
        String str2 = c4608l.yandex;
        if (!AbstractC8576l.yandex(str, str2)) {
            C10754l.metrica(AbstractC0653l.ads(AbstractC14814l.license("Attempting to extend color ", (String) this.f31108l, " with color ", str2, " of different name for spec version "), "SPEC_2025", "."));
            return null;
        }
        boolean z = this.f31109l;
        boolean z2 = c4608l.amazon;
        String str3 = (String) this.f31108l;
        if (z != z2) {
            String str4 = z ? "background" : "foreground";
            String str5 = z2 ? "background" : "foreground";
            StringBuilder sbLicense = AbstractC14814l.license("Attempting to extend color ", str3, " as a ", str4, " with color ");
            AbstractC9361l.appmetrica(sbLicense, str2, " as a ", str5, " for spec version ");
            C10754l.metrica(AbstractC0653l.ads(sbLicense, "SPEC_2025", "."));
            return null;
        }
        C15855l c15855l = new C15855l();
        c15855l.f31108l = str3;
        c15855l.f31109l = z;
        final int i = 0;
        c15855l.f31105l = new Function1() { // from class: lّۦٞ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C8723l c8723l;
                int i2 = i;
                C15855l c15855l2 = this;
                C4608l c4608l2 = c4608l;
                switch (i2) {
                    case 0:
                        Function1 function1 = c4608l2.loadAd;
                        C0187l c0187l = (C0187l) obj;
                        Function1 function2 = c0187l.smaato == 2 ? function1 : (Function1) c15855l2.f31105l;
                        return (function2 == null || (c8723l = (C8723l) function2.invoke(c0187l)) == null) ? (C8723l) function1.invoke(c0187l) : c8723l;
                    case 1:
                        Function1 function3 = c4608l2.crashlytics;
                        C0187l c0187l2 = (C0187l) obj;
                        Function1 function4 = c0187l2.smaato == 2 ? function3 : (Function1) c15855l2.f31112l;
                        return Double.valueOf(((Number) (function4 != null ? function4.invoke(c0187l2) : function3.invoke(c0187l2))).doubleValue());
                    case 2:
                        C0187l c0187l3 = (C0187l) obj;
                        Function1 function5 = c0187l3.smaato == 2 ? c4608l2.purchase : (Function1) c15855l2.f31111l;
                        return function5 != null ? (Double) function5.invoke(c0187l3) : Double.valueOf(1.0d);
                    case 3:
                        C0187l c0187l4 = (C0187l) obj;
                        Function1 function6 = c0187l4.smaato == 2 ? c4608l2.billing : (Function1) c15855l2.f31114l;
                        if (function6 != null) {
                            return (C4608l) function6.invoke(c0187l4);
                        }
                        return null;
                    case 4:
                        C0187l c0187l5 = (C0187l) obj;
                        Function1 function7 = c0187l5.smaato == 2 ? c4608l2.mopub : (Function1) c15855l2.f31106l;
                        if (function7 != null) {
                            return (C4608l) function7.invoke(c0187l5);
                        }
                        return null;
                    case 5:
                        C0187l c0187l6 = (C0187l) obj;
                        Function1 function8 = c0187l6.smaato == 2 ? c4608l2.admob : (Function1) c15855l2.f31107l;
                        if (function8 != null) {
                            return (C9193l) function8.invoke(c0187l6);
                        }
                        return null;
                    case 6:
                        C0187l c0187l7 = (C0187l) obj;
                        Function1 function9 = c0187l7.smaato == 2 ? c4608l2.subs : (Function1) c15855l2.f31113l;
                        if (function9 != null) {
                            return (C3134l) function9.invoke(c0187l7);
                        }
                        return null;
                    default:
                        C0187l c0187l8 = (C0187l) obj;
                        Function1 function10 = c0187l8.smaato == 2 ? c4608l2.isPro : (Function1) c15855l2.f31110l;
                        if (function10 != null) {
                            return (Double) function10.invoke(c0187l8);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        c15855l.f31112l = new Function1() { // from class: lّۦٞ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C8723l c8723l;
                int i3 = i2;
                C15855l c15855l2 = this;
                C4608l c4608l2 = c4608l;
                switch (i3) {
                    case 0:
                        Function1 function1 = c4608l2.loadAd;
                        C0187l c0187l = (C0187l) obj;
                        Function1 function2 = c0187l.smaato == 2 ? function1 : (Function1) c15855l2.f31105l;
                        return (function2 == null || (c8723l = (C8723l) function2.invoke(c0187l)) == null) ? (C8723l) function1.invoke(c0187l) : c8723l;
                    case 1:
                        Function1 function3 = c4608l2.crashlytics;
                        C0187l c0187l2 = (C0187l) obj;
                        Function1 function4 = c0187l2.smaato == 2 ? function3 : (Function1) c15855l2.f31112l;
                        return Double.valueOf(((Number) (function4 != null ? function4.invoke(c0187l2) : function3.invoke(c0187l2))).doubleValue());
                    case 2:
                        C0187l c0187l3 = (C0187l) obj;
                        Function1 function5 = c0187l3.smaato == 2 ? c4608l2.purchase : (Function1) c15855l2.f31111l;
                        return function5 != null ? (Double) function5.invoke(c0187l3) : Double.valueOf(1.0d);
                    case 3:
                        C0187l c0187l4 = (C0187l) obj;
                        Function1 function6 = c0187l4.smaato == 2 ? c4608l2.billing : (Function1) c15855l2.f31114l;
                        if (function6 != null) {
                            return (C4608l) function6.invoke(c0187l4);
                        }
                        return null;
                    case 4:
                        C0187l c0187l5 = (C0187l) obj;
                        Function1 function7 = c0187l5.smaato == 2 ? c4608l2.mopub : (Function1) c15855l2.f31106l;
                        if (function7 != null) {
                            return (C4608l) function7.invoke(c0187l5);
                        }
                        return null;
                    case 5:
                        C0187l c0187l6 = (C0187l) obj;
                        Function1 function8 = c0187l6.smaato == 2 ? c4608l2.admob : (Function1) c15855l2.f31107l;
                        if (function8 != null) {
                            return (C9193l) function8.invoke(c0187l6);
                        }
                        return null;
                    case 6:
                        C0187l c0187l7 = (C0187l) obj;
                        Function1 function9 = c0187l7.smaato == 2 ? c4608l2.subs : (Function1) c15855l2.f31113l;
                        if (function9 != null) {
                            return (C3134l) function9.invoke(c0187l7);
                        }
                        return null;
                    default:
                        C0187l c0187l8 = (C0187l) obj;
                        Function1 function10 = c0187l8.smaato == 2 ? c4608l2.isPro : (Function1) c15855l2.f31110l;
                        if (function10 != null) {
                            return (Double) function10.invoke(c0187l8);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        c15855l.f31111l = new Function1() { // from class: lّۦٞ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C8723l c8723l;
                int i4 = i3;
                C15855l c15855l2 = this;
                C4608l c4608l2 = c4608l;
                switch (i4) {
                    case 0:
                        Function1 function1 = c4608l2.loadAd;
                        C0187l c0187l = (C0187l) obj;
                        Function1 function2 = c0187l.smaato == 2 ? function1 : (Function1) c15855l2.f31105l;
                        return (function2 == null || (c8723l = (C8723l) function2.invoke(c0187l)) == null) ? (C8723l) function1.invoke(c0187l) : c8723l;
                    case 1:
                        Function1 function3 = c4608l2.crashlytics;
                        C0187l c0187l2 = (C0187l) obj;
                        Function1 function4 = c0187l2.smaato == 2 ? function3 : (Function1) c15855l2.f31112l;
                        return Double.valueOf(((Number) (function4 != null ? function4.invoke(c0187l2) : function3.invoke(c0187l2))).doubleValue());
                    case 2:
                        C0187l c0187l3 = (C0187l) obj;
                        Function1 function5 = c0187l3.smaato == 2 ? c4608l2.purchase : (Function1) c15855l2.f31111l;
                        return function5 != null ? (Double) function5.invoke(c0187l3) : Double.valueOf(1.0d);
                    case 3:
                        C0187l c0187l4 = (C0187l) obj;
                        Function1 function6 = c0187l4.smaato == 2 ? c4608l2.billing : (Function1) c15855l2.f31114l;
                        if (function6 != null) {
                            return (C4608l) function6.invoke(c0187l4);
                        }
                        return null;
                    case 4:
                        C0187l c0187l5 = (C0187l) obj;
                        Function1 function7 = c0187l5.smaato == 2 ? c4608l2.mopub : (Function1) c15855l2.f31106l;
                        if (function7 != null) {
                            return (C4608l) function7.invoke(c0187l5);
                        }
                        return null;
                    case 5:
                        C0187l c0187l6 = (C0187l) obj;
                        Function1 function8 = c0187l6.smaato == 2 ? c4608l2.admob : (Function1) c15855l2.f31107l;
                        if (function8 != null) {
                            return (C9193l) function8.invoke(c0187l6);
                        }
                        return null;
                    case 6:
                        C0187l c0187l7 = (C0187l) obj;
                        Function1 function9 = c0187l7.smaato == 2 ? c4608l2.subs : (Function1) c15855l2.f31113l;
                        if (function9 != null) {
                            return (C3134l) function9.invoke(c0187l7);
                        }
                        return null;
                    default:
                        C0187l c0187l8 = (C0187l) obj;
                        Function1 function10 = c0187l8.smaato == 2 ? c4608l2.isPro : (Function1) c15855l2.f31110l;
                        if (function10 != null) {
                            return (Double) function10.invoke(c0187l8);
                        }
                        return null;
                }
            }
        };
        final int i4 = 3;
        c15855l.f31114l = new Function1() { // from class: lّۦٞ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C8723l c8723l;
                int i5 = i4;
                C15855l c15855l2 = this;
                C4608l c4608l2 = c4608l;
                switch (i5) {
                    case 0:
                        Function1 function1 = c4608l2.loadAd;
                        C0187l c0187l = (C0187l) obj;
                        Function1 function2 = c0187l.smaato == 2 ? function1 : (Function1) c15855l2.f31105l;
                        return (function2 == null || (c8723l = (C8723l) function2.invoke(c0187l)) == null) ? (C8723l) function1.invoke(c0187l) : c8723l;
                    case 1:
                        Function1 function3 = c4608l2.crashlytics;
                        C0187l c0187l2 = (C0187l) obj;
                        Function1 function4 = c0187l2.smaato == 2 ? function3 : (Function1) c15855l2.f31112l;
                        return Double.valueOf(((Number) (function4 != null ? function4.invoke(c0187l2) : function3.invoke(c0187l2))).doubleValue());
                    case 2:
                        C0187l c0187l3 = (C0187l) obj;
                        Function1 function5 = c0187l3.smaato == 2 ? c4608l2.purchase : (Function1) c15855l2.f31111l;
                        return function5 != null ? (Double) function5.invoke(c0187l3) : Double.valueOf(1.0d);
                    case 3:
                        C0187l c0187l4 = (C0187l) obj;
                        Function1 function6 = c0187l4.smaato == 2 ? c4608l2.billing : (Function1) c15855l2.f31114l;
                        if (function6 != null) {
                            return (C4608l) function6.invoke(c0187l4);
                        }
                        return null;
                    case 4:
                        C0187l c0187l5 = (C0187l) obj;
                        Function1 function7 = c0187l5.smaato == 2 ? c4608l2.mopub : (Function1) c15855l2.f31106l;
                        if (function7 != null) {
                            return (C4608l) function7.invoke(c0187l5);
                        }
                        return null;
                    case 5:
                        C0187l c0187l6 = (C0187l) obj;
                        Function1 function8 = c0187l6.smaato == 2 ? c4608l2.admob : (Function1) c15855l2.f31107l;
                        if (function8 != null) {
                            return (C9193l) function8.invoke(c0187l6);
                        }
                        return null;
                    case 6:
                        C0187l c0187l7 = (C0187l) obj;
                        Function1 function9 = c0187l7.smaato == 2 ? c4608l2.subs : (Function1) c15855l2.f31113l;
                        if (function9 != null) {
                            return (C3134l) function9.invoke(c0187l7);
                        }
                        return null;
                    default:
                        C0187l c0187l8 = (C0187l) obj;
                        Function1 function10 = c0187l8.smaato == 2 ? c4608l2.isPro : (Function1) c15855l2.f31110l;
                        if (function10 != null) {
                            return (Double) function10.invoke(c0187l8);
                        }
                        return null;
                }
            }
        };
        final int i5 = 4;
        c15855l.f31106l = new Function1() { // from class: lّۦٞ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C8723l c8723l;
                int i6 = i5;
                C15855l c15855l2 = this;
                C4608l c4608l2 = c4608l;
                switch (i6) {
                    case 0:
                        Function1 function1 = c4608l2.loadAd;
                        C0187l c0187l = (C0187l) obj;
                        Function1 function2 = c0187l.smaato == 2 ? function1 : (Function1) c15855l2.f31105l;
                        return (function2 == null || (c8723l = (C8723l) function2.invoke(c0187l)) == null) ? (C8723l) function1.invoke(c0187l) : c8723l;
                    case 1:
                        Function1 function3 = c4608l2.crashlytics;
                        C0187l c0187l2 = (C0187l) obj;
                        Function1 function4 = c0187l2.smaato == 2 ? function3 : (Function1) c15855l2.f31112l;
                        return Double.valueOf(((Number) (function4 != null ? function4.invoke(c0187l2) : function3.invoke(c0187l2))).doubleValue());
                    case 2:
                        C0187l c0187l3 = (C0187l) obj;
                        Function1 function5 = c0187l3.smaato == 2 ? c4608l2.purchase : (Function1) c15855l2.f31111l;
                        return function5 != null ? (Double) function5.invoke(c0187l3) : Double.valueOf(1.0d);
                    case 3:
                        C0187l c0187l4 = (C0187l) obj;
                        Function1 function6 = c0187l4.smaato == 2 ? c4608l2.billing : (Function1) c15855l2.f31114l;
                        if (function6 != null) {
                            return (C4608l) function6.invoke(c0187l4);
                        }
                        return null;
                    case 4:
                        C0187l c0187l5 = (C0187l) obj;
                        Function1 function7 = c0187l5.smaato == 2 ? c4608l2.mopub : (Function1) c15855l2.f31106l;
                        if (function7 != null) {
                            return (C4608l) function7.invoke(c0187l5);
                        }
                        return null;
                    case 5:
                        C0187l c0187l6 = (C0187l) obj;
                        Function1 function8 = c0187l6.smaato == 2 ? c4608l2.admob : (Function1) c15855l2.f31107l;
                        if (function8 != null) {
                            return (C9193l) function8.invoke(c0187l6);
                        }
                        return null;
                    case 6:
                        C0187l c0187l7 = (C0187l) obj;
                        Function1 function9 = c0187l7.smaato == 2 ? c4608l2.subs : (Function1) c15855l2.f31113l;
                        if (function9 != null) {
                            return (C3134l) function9.invoke(c0187l7);
                        }
                        return null;
                    default:
                        C0187l c0187l8 = (C0187l) obj;
                        Function1 function10 = c0187l8.smaato == 2 ? c4608l2.isPro : (Function1) c15855l2.f31110l;
                        if (function10 != null) {
                            return (Double) function10.invoke(c0187l8);
                        }
                        return null;
                }
            }
        };
        final int i6 = 5;
        c15855l.f31107l = new Function1() { // from class: lّۦٞ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C8723l c8723l;
                int i7 = i6;
                C15855l c15855l2 = this;
                C4608l c4608l2 = c4608l;
                switch (i7) {
                    case 0:
                        Function1 function1 = c4608l2.loadAd;
                        C0187l c0187l = (C0187l) obj;
                        Function1 function2 = c0187l.smaato == 2 ? function1 : (Function1) c15855l2.f31105l;
                        return (function2 == null || (c8723l = (C8723l) function2.invoke(c0187l)) == null) ? (C8723l) function1.invoke(c0187l) : c8723l;
                    case 1:
                        Function1 function3 = c4608l2.crashlytics;
                        C0187l c0187l2 = (C0187l) obj;
                        Function1 function4 = c0187l2.smaato == 2 ? function3 : (Function1) c15855l2.f31112l;
                        return Double.valueOf(((Number) (function4 != null ? function4.invoke(c0187l2) : function3.invoke(c0187l2))).doubleValue());
                    case 2:
                        C0187l c0187l3 = (C0187l) obj;
                        Function1 function5 = c0187l3.smaato == 2 ? c4608l2.purchase : (Function1) c15855l2.f31111l;
                        return function5 != null ? (Double) function5.invoke(c0187l3) : Double.valueOf(1.0d);
                    case 3:
                        C0187l c0187l4 = (C0187l) obj;
                        Function1 function6 = c0187l4.smaato == 2 ? c4608l2.billing : (Function1) c15855l2.f31114l;
                        if (function6 != null) {
                            return (C4608l) function6.invoke(c0187l4);
                        }
                        return null;
                    case 4:
                        C0187l c0187l5 = (C0187l) obj;
                        Function1 function7 = c0187l5.smaato == 2 ? c4608l2.mopub : (Function1) c15855l2.f31106l;
                        if (function7 != null) {
                            return (C4608l) function7.invoke(c0187l5);
                        }
                        return null;
                    case 5:
                        C0187l c0187l6 = (C0187l) obj;
                        Function1 function8 = c0187l6.smaato == 2 ? c4608l2.admob : (Function1) c15855l2.f31107l;
                        if (function8 != null) {
                            return (C9193l) function8.invoke(c0187l6);
                        }
                        return null;
                    case 6:
                        C0187l c0187l7 = (C0187l) obj;
                        Function1 function9 = c0187l7.smaato == 2 ? c4608l2.subs : (Function1) c15855l2.f31113l;
                        if (function9 != null) {
                            return (C3134l) function9.invoke(c0187l7);
                        }
                        return null;
                    default:
                        C0187l c0187l8 = (C0187l) obj;
                        Function1 function10 = c0187l8.smaato == 2 ? c4608l2.isPro : (Function1) c15855l2.f31110l;
                        if (function10 != null) {
                            return (Double) function10.invoke(c0187l8);
                        }
                        return null;
                }
            }
        };
        final int i7 = 6;
        c15855l.f31113l = new Function1() { // from class: lّۦٞ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C8723l c8723l;
                int i8 = i7;
                C15855l c15855l2 = this;
                C4608l c4608l2 = c4608l;
                switch (i8) {
                    case 0:
                        Function1 function1 = c4608l2.loadAd;
                        C0187l c0187l = (C0187l) obj;
                        Function1 function2 = c0187l.smaato == 2 ? function1 : (Function1) c15855l2.f31105l;
                        return (function2 == null || (c8723l = (C8723l) function2.invoke(c0187l)) == null) ? (C8723l) function1.invoke(c0187l) : c8723l;
                    case 1:
                        Function1 function3 = c4608l2.crashlytics;
                        C0187l c0187l2 = (C0187l) obj;
                        Function1 function4 = c0187l2.smaato == 2 ? function3 : (Function1) c15855l2.f31112l;
                        return Double.valueOf(((Number) (function4 != null ? function4.invoke(c0187l2) : function3.invoke(c0187l2))).doubleValue());
                    case 2:
                        C0187l c0187l3 = (C0187l) obj;
                        Function1 function5 = c0187l3.smaato == 2 ? c4608l2.purchase : (Function1) c15855l2.f31111l;
                        return function5 != null ? (Double) function5.invoke(c0187l3) : Double.valueOf(1.0d);
                    case 3:
                        C0187l c0187l4 = (C0187l) obj;
                        Function1 function6 = c0187l4.smaato == 2 ? c4608l2.billing : (Function1) c15855l2.f31114l;
                        if (function6 != null) {
                            return (C4608l) function6.invoke(c0187l4);
                        }
                        return null;
                    case 4:
                        C0187l c0187l5 = (C0187l) obj;
                        Function1 function7 = c0187l5.smaato == 2 ? c4608l2.mopub : (Function1) c15855l2.f31106l;
                        if (function7 != null) {
                            return (C4608l) function7.invoke(c0187l5);
                        }
                        return null;
                    case 5:
                        C0187l c0187l6 = (C0187l) obj;
                        Function1 function8 = c0187l6.smaato == 2 ? c4608l2.admob : (Function1) c15855l2.f31107l;
                        if (function8 != null) {
                            return (C9193l) function8.invoke(c0187l6);
                        }
                        return null;
                    case 6:
                        C0187l c0187l7 = (C0187l) obj;
                        Function1 function9 = c0187l7.smaato == 2 ? c4608l2.subs : (Function1) c15855l2.f31113l;
                        if (function9 != null) {
                            return (C3134l) function9.invoke(c0187l7);
                        }
                        return null;
                    default:
                        C0187l c0187l8 = (C0187l) obj;
                        Function1 function10 = c0187l8.smaato == 2 ? c4608l2.isPro : (Function1) c15855l2.f31110l;
                        if (function10 != null) {
                            return (Double) function10.invoke(c0187l8);
                        }
                        return null;
                }
            }
        };
        final int i8 = 7;
        c15855l.f31110l = new Function1() { // from class: lّۦٞ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C8723l c8723l;
                int i9 = i8;
                C15855l c15855l2 = this;
                C4608l c4608l2 = c4608l;
                switch (i9) {
                    case 0:
                        Function1 function1 = c4608l2.loadAd;
                        C0187l c0187l = (C0187l) obj;
                        Function1 function2 = c0187l.smaato == 2 ? function1 : (Function1) c15855l2.f31105l;
                        return (function2 == null || (c8723l = (C8723l) function2.invoke(c0187l)) == null) ? (C8723l) function1.invoke(c0187l) : c8723l;
                    case 1:
                        Function1 function3 = c4608l2.crashlytics;
                        C0187l c0187l2 = (C0187l) obj;
                        Function1 function4 = c0187l2.smaato == 2 ? function3 : (Function1) c15855l2.f31112l;
                        return Double.valueOf(((Number) (function4 != null ? function4.invoke(c0187l2) : function3.invoke(c0187l2))).doubleValue());
                    case 2:
                        C0187l c0187l3 = (C0187l) obj;
                        Function1 function5 = c0187l3.smaato == 2 ? c4608l2.purchase : (Function1) c15855l2.f31111l;
                        return function5 != null ? (Double) function5.invoke(c0187l3) : Double.valueOf(1.0d);
                    case 3:
                        C0187l c0187l4 = (C0187l) obj;
                        Function1 function6 = c0187l4.smaato == 2 ? c4608l2.billing : (Function1) c15855l2.f31114l;
                        if (function6 != null) {
                            return (C4608l) function6.invoke(c0187l4);
                        }
                        return null;
                    case 4:
                        C0187l c0187l5 = (C0187l) obj;
                        Function1 function7 = c0187l5.smaato == 2 ? c4608l2.mopub : (Function1) c15855l2.f31106l;
                        if (function7 != null) {
                            return (C4608l) function7.invoke(c0187l5);
                        }
                        return null;
                    case 5:
                        C0187l c0187l6 = (C0187l) obj;
                        Function1 function8 = c0187l6.smaato == 2 ? c4608l2.admob : (Function1) c15855l2.f31107l;
                        if (function8 != null) {
                            return (C9193l) function8.invoke(c0187l6);
                        }
                        return null;
                    case 6:
                        C0187l c0187l7 = (C0187l) obj;
                        Function1 function9 = c0187l7.smaato == 2 ? c4608l2.subs : (Function1) c15855l2.f31113l;
                        if (function9 != null) {
                            return (C3134l) function9.invoke(c0187l7);
                        }
                        return null;
                    default:
                        C0187l c0187l8 = (C0187l) obj;
                        Function1 function10 = c0187l8.smaato == 2 ? c4608l2.isPro : (Function1) c15855l2.f31110l;
                        if (function10 != null) {
                            return (Double) function10.invoke(c0187l8);
                        }
                        return null;
                }
            }
        };
        return c15855l;
    }

    @Override // defpackage.InterfaceC10367l
    public ListenableFuture mopub() {
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            AbstractC10999l.mopub((C18662l) this.f31106l, null, 0, new C7864l(this, c5807l, (InterfaceC14029l) null, 4), 3);
            c5807l.yandex = "FetchData for PipeCameraPresence0";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        return c16565l;
    }

    public void purchase(List list, Throwable th) {
        int i;
        boolean z;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.f31108l) {
            i = 0;
            try {
                if (th != null) {
                    z = ((Throwable) this.f31111l) == null || !((List) this.f31112l).isEmpty();
                    this.f31111l = th;
                    this.f31112l = Collections.EMPTY_LIST;
                } else {
                    list.getClass();
                    boolean z2 = (((Throwable) this.f31111l) == null && ((List) this.f31112l).equals(list)) ? false : true;
                    this.f31111l = null;
                    this.f31112l = list;
                    z = z2;
                }
                listUnmodifiableList = DesugarCollections.unmodifiableList((List) this.f31112l);
                th2 = (Throwable) this.f31111l;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder("Data changed. Notifying ");
            sb.append(((CopyOnWriteArrayList) this.f31105l).size());
            sb.append(" observers. Error: ");
            sb.append(th2 != null);
            Log.d("CameraPresenceSrc", sb.toString());
            for (C4200l c4200l : (CopyOnWriteArrayList) this.f31105l) {
                c4200l.yandex.execute(new RunnableC10613l(th2, c4200l, listUnmodifiableList, i));
            }
        }
    }

    @Override // defpackage.InterfaceC10367l
    public void remoteconfig(InterfaceC15984l interfaceC15984l) {
        C4200l c4200l;
        interfaceC15984l.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f31105l).iterator();
        do {
            if (!it.hasNext()) {
                c4200l = null;
                break;
            }
            c4200l = (C4200l) it.next();
        } while (!c4200l.loadAd.equals(interfaceC15984l));
        if (c4200l != null) {
            ((CopyOnWriteArrayList) this.f31105l).remove(c4200l);
        }
        synchronized (this.f31108l) {
            try {
                if (this.f31109l && ((CopyOnWriteArrayList) this.f31105l).isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.f31109l = false;
                    Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                    if (((AtomicBoolean) this.f31107l).compareAndSet(true, false)) {
                        C7504l c7504l = (C7504l) this.f31113l;
                        if (c7504l != null) {
                            c7504l.ads(null);
                        }
                        this.f31113l = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C4608l yandex() {
        Function1 function1 = (Function1) this.f31114l;
        if (function1 == null && ((Function1) this.f31106l) != null) {
            C10754l.metrica(AbstractC15560l.Signature("Color ", (String) this.f31108l, " has secondBackground defined, but background is not defined."));
            return null;
        }
        if (function1 == null && ((Function1) this.f31107l) != null) {
            C10754l.metrica(AbstractC15560l.Signature("Color ", (String) this.f31108l, " has contrastCurve defined, but background is not defined."));
            return null;
        }
        if (function1 != null && ((Function1) this.f31107l) == null) {
            C10754l.metrica(AbstractC15560l.Signature("Color ", (String) this.f31108l, " has background defined, but contrastCurve is not defined."));
            return null;
        }
        Function1 c4741l = (Function1) this.f31112l;
        if (c4741l == null) {
            c4741l = function1 == null ? new C4741l(15) : new C0786l(3, function1);
        }
        return new C4608l((String) this.f31108l, (Function1) this.f31105l, c4741l, this.f31109l, (Function1) this.f31111l, function1, (Function1) this.f31106l, (Function1) this.f31107l, (Function1) this.f31113l, (Function1) this.f31110l);
    }

    public C15855l(PKIXParameters pKIXParameters) {
        this.f31114l = new ArrayList();
        this.f31106l = new HashMap();
        this.f31107l = new ArrayList();
        this.f31113l = new HashMap();
        this.f31108l = (PKIXParameters) pKIXParameters.clone();
        CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
        if (targetCertConstraints != null) {
            this.f31111l = new C11618l((CertSelector) targetCertConstraints.clone());
        }
        Date date = pKIXParameters.getDate();
        this.f31105l = date;
        this.f31112l = date == null ? new Date() : date;
        this.f31109l = pKIXParameters.isRevocationEnabled();
        this.f31110l = pKIXParameters.getTrustAnchors();
    }
}
