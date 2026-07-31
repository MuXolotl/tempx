package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: lَٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15202l implements InterfaceC17121l {
    public final CountDownLatch Signature;
    public Map ad;
    public InterfaceC2413l adcel;
    public final C11969l admob;
    public C7752l ads;
    public final LinkedHashMap advert;
    public final C12292l amazon;
    public final C10379l billing;
    public final C3557l crashlytics;
    public final Object firebase;
    public final int isPro;
    public int isVip;
    public boolean license;
    public final InterfaceC0627l loadAd;
    public C9386l metrica;
    public final C5664l mopub;
    public final CountDownLatch pro;
    public final C3945l purchase;
    public final Map remoteconfig;
    public final C11561l smaato;
    public final C16543l startapp;
    public final InterfaceC2262l subs;
    public Map subscription;
    public LinkedHashMap tapsense;
    public final Map vip;
    public final C18548l yandex;

    public C15202l(C18548l c18548l, InterfaceC0627l interfaceC0627l, C3557l c3557l, C12292l c12292l, C3945l c3945l, C10379l c10379l, AbstractC3872l abstractC3872l, C5664l c5664l, C11969l c11969l, InterfaceC2262l interfaceC2262l) {
        this.yandex = c18548l;
        this.loadAd = interfaceC0627l;
        this.crashlytics = c3557l;
        this.amazon = c12292l;
        this.purchase = c3945l;
        this.billing = c10379l;
        this.mopub = c5664l;
        this.admob = c11969l;
        this.subs = interfaceC2262l;
        C11879l c11879l = AbstractC15099l.yandex;
        c11879l.getClass();
        this.isPro = C11879l.loadAd.incrementAndGet(c11879l);
        this.firebase = new Object();
        this.smaato = AbstractC1805l.crashlytics(Boolean.FALSE);
        this.remoteconfig = DesugarCollections.synchronizedMap(new HashMap());
        this.vip = DesugarCollections.synchronizedMap(new HashMap());
        this.startapp = null;
        this.isVip = 1;
        this.Signature = new CountDownLatch(1);
        this.pro = new CountDownLatch(1);
        this.advert = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f A[Catch: all -> 0x01bd, TryCatch #2 {all -> 0x01bd, blocks: (B:55:0x0123, B:61:0x012f, B:63:0x014f, B:65:0x018e, B:66:0x019b, B:68:0x01a1, B:70:0x01b1, B:75:0x01c2, B:77:0x01cc, B:78:0x01ce, B:82:0x01d7, B:83:0x01e8, B:84:0x01e9), top: B:100:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014f A[Catch: all -> 0x01bd, TryCatch #2 {all -> 0x01bd, blocks: (B:55:0x0123, B:61:0x012f, B:63:0x014f, B:65:0x018e, B:66:0x019b, B:68:0x01a1, B:70:0x01b1, B:75:0x01c2, B:77:0x01cc, B:78:0x01ce, B:82:0x01d7, B:83:0x01e8, B:84:0x01e9), top: B:100:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x018e A[Catch: all -> 0x01bd, TryCatch #2 {all -> 0x01bd, blocks: (B:55:0x0123, B:61:0x012f, B:63:0x014f, B:65:0x018e, B:66:0x019b, B:68:0x01a1, B:70:0x01b1, B:75:0x01c2, B:77:0x01cc, B:78:0x01ce, B:82:0x01d7, B:83:0x01e8, B:84:0x01e9), top: B:100:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a1 A[Catch: all -> 0x01bd, TryCatch #2 {all -> 0x01bd, blocks: (B:55:0x0123, B:61:0x012f, B:63:0x014f, B:65:0x018e, B:66:0x019b, B:68:0x01a1, B:70:0x01b1, B:75:0x01c2, B:77:0x01cc, B:78:0x01ce, B:82:0x01d7, B:83:0x01e8, B:84:0x01e9), top: B:100:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d7 A[Catch: all -> 0x01bd, TRY_ENTER, TryCatch #2 {all -> 0x01bd, blocks: (B:55:0x0123, B:61:0x012f, B:63:0x014f, B:65:0x018e, B:66:0x019b, B:68:0x01a1, B:70:0x01b1, B:75:0x01c2, B:77:0x01cc, B:78:0x01ce, B:82:0x01d7, B:83:0x01e8, B:84:0x01e9), top: B:100:0x0123 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0105, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x014f, please report this as an issue */
    public static final Object subs(C15202l c15202l, AbstractC0283l abstractC0283l) {
        C4768l c4768l;
        C10700l c10700l;
        C10700l c10700l2;
        C10700l c10700l3;
        C10700l c10700l4;
        InterfaceC2413l interfaceC2413l;
        String strVip;
        String strLoadAd;
        InterfaceC2413l interfaceC2413l2;
        String strVip2;
        InterfaceC17866l interfaceC17866lYandex;
        int i;
        Map map;
        Map map2;
        LinkedHashMap linkedHashMap;
        c15202l.getClass();
        if (abstractC0283l instanceof C4768l) {
            c4768l = (C4768l) abstractC0283l;
            int i2 = c4768l.f9787l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4768l.f9787l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4768l = new C4768l(c15202l, abstractC0283l);
            }
        } else {
            c4768l = new C4768l(c15202l, abstractC0283l);
        }
        Object obj = c4768l.f9790l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i3 = c4768l.f9787l;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(obj);
                c10700l = new C10700l();
                c10700l2 = new C10700l();
                synchronized (c15202l.firebase) {
                    if (c15202l.isVip != 1) {
                        return Unit.INSTANCE;
                    }
                    c10700l.f21708l = c15202l.ad;
                    InterfaceC2413l interfaceC2413l3 = c15202l.adcel;
                    c10700l2.f21708l = interfaceC2413l3;
                    if (c10700l.f21708l != null && interfaceC2413l3 != null) {
                        c15202l.isVip = 2;
                        c15202l.license = true;
                        c15202l.purchase.getClass();
                        c15202l.metrica = new C9386l(SystemClock.elapsedRealtimeNanos());
                        Unit unit = Unit.INSTANCE;
                        C16543l c16543l = c15202l.startapp;
                        if (c16543l != null) {
                            Log.d("CXCP", "Awaiting session lock");
                            c4768l.f9789l = c10700l;
                            c4768l.f9788l = c10700l2;
                            c4768l.f9787l = 1;
                            if (c16543l.purchase(c4768l) == enumC9342l) {
                                return enumC9342l;
                            }
                            c10700l3 = c10700l;
                            c10700l4 = c10700l2;
                        }
                        StringBuilder sb = new StringBuilder("Creating CameraCaptureSession from ");
                        interfaceC2413l = (InterfaceC2413l) c10700l2.f21708l;
                        if (interfaceC2413l != null) {
                            strVip = interfaceC2413l.vip();
                        } else {
                            strVip = null;
                        }
                        if (strVip == null) {
                            strLoadAd = "null";
                        } else {
                            strLoadAd = C10160l.loadAd(strVip);
                        }
                        sb.append((Object) strLoadAd);
                        sb.append(" using ");
                        sb.append(c15202l);
                        sb.append(" with ");
                        sb.append(c10700l.f21708l);
                        Log.i("CXCP", sb.toString());
                        StringBuilder sb2 = new StringBuilder("CameraDevice-");
                        interfaceC2413l2 = (InterfaceC2413l) c10700l2.f21708l;
                        if (interfaceC2413l2 != null) {
                            strVip2 = interfaceC2413l2.vip();
                        } else {
                            strVip2 = null;
                        }
                        Trace.beginSection(AbstractC0653l.ads(sb2, strVip2, "#createCaptureSession"));
                        interfaceC17866lYandex = c15202l.loadAd.yandex((InterfaceC2413l) c10700l2.f21708l, (Map) c10700l.f21708l, c15202l);
                        Trace.endSection();
                        if (!(interfaceC17866lYandex instanceof C5522l)) {
                            Log.e("CXCP", "Failed to create capture session for " + c15202l + '!');
                            return Unit.INSTANCE;
                        }
                        synchronized (c15202l.firebase) {
                            try {
                                i = c15202l.isVip;
                                if (i != 4 && i != 5) {
                                    if (i == 2) {
                                        throw new IllegalStateException("Unexpected state: ".concat(AbstractC14814l.appmetrica(i)).toString());
                                    }
                                    c15202l.isVip = 3;
                                    c15202l.remoteconfig.putAll((Map) c10700l.f21708l);
                                    c15202l.vip.putAll(((C5522l) interfaceC17866lYandex).f11792l);
                                    map = ((C5522l) interfaceC17866lYandex).f11793l;
                                    if (!map.isEmpty()) {
                                        Log.i("CXCP", "Created " + c15202l + " with " + AbstractC16901l.m4213const(((Map) c10700l.f21708l).keySet()) + ". Waiting to finalize " + AbstractC16901l.m4213const(map.keySet()));
                                        c15202l.subscription = map;
                                        map2 = c15202l.ad;
                                        if (map2 != null) {
                                            linkedHashMap = new LinkedHashMap();
                                            for (Map.Entry entry : map2.entrySet()) {
                                                if (map.containsKey(entry.getKey())) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                        } else {
                                            linkedHashMap = null;
                                        }
                                        if (linkedHashMap != null && linkedHashMap.size() == map.size()) {
                                            c15202l.tapsense = linkedHashMap;
                                        }
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    c15202l.isPro(null);
                                    return Unit.INSTANCE;
                                }
                                Log.i("CXCP", "Warning: " + c15202l + " was " + AbstractC14814l.appmetrica(c15202l.isVip) + " while configuration was in progress.");
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c10700l4 = c4768l.f9788l;
            c10700l3 = c4768l.f9789l;
            AbstractC2829l.crashlytics(obj);
            Trace.beginSection(AbstractC0653l.ads(sb2, strVip2, "#createCaptureSession"));
            interfaceC17866lYandex = c15202l.loadAd.yandex((InterfaceC2413l) c10700l2.f21708l, (Map) c10700l.f21708l, c15202l);
            Trace.endSection();
            if (!(interfaceC17866lYandex instanceof C5522l)) {
                Log.e("CXCP", "Failed to create capture session for " + c15202l + '!');
                return Unit.INSTANCE;
            }
            synchronized (c15202l.firebase) {
                i = c15202l.isVip;
                if (i != 4) {
                    if (i == 2) {
                        throw new IllegalStateException("Unexpected state: ".concat(AbstractC14814l.appmetrica(i)).toString());
                    }
                    c15202l.isVip = 3;
                    c15202l.remoteconfig.putAll((Map) c10700l.f21708l);
                    c15202l.vip.putAll(((C5522l) interfaceC17866lYandex).f11792l);
                    map = ((C5522l) interfaceC17866lYandex).f11793l;
                    if (!map.isEmpty()) {
                        Log.i("CXCP", "Created " + c15202l + " with " + AbstractC16901l.m4213const(((Map) c10700l.f21708l).keySet()) + ". Waiting to finalize " + AbstractC16901l.m4213const(map.keySet()));
                        c15202l.subscription = map;
                        map2 = c15202l.ad;
                        if (map2 != null) {
                            linkedHashMap = new LinkedHashMap();
                            while (r14.hasNext()) {
                                if (map.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap != null) {
                            c15202l.tapsense = linkedHashMap;
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                    c15202l.isPro(null);
                    return Unit.INSTANCE;
                }
                Log.i("CXCP", "Warning: " + c15202l + " was " + AbstractC14814l.appmetrica(c15202l.isVip) + " while configuration was in progress.");
                return Unit.INSTANCE;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
        c10700l = c10700l3;
        c10700l2 = c10700l4;
        StringBuilder sb3 = new StringBuilder("Creating CameraCaptureSession from ");
        interfaceC2413l = (InterfaceC2413l) c10700l2.f21708l;
        if (interfaceC2413l != null) {
            strVip = interfaceC2413l.vip();
        } else {
            strVip = null;
        }
        if (strVip == null) {
            strLoadAd = "null";
        } else {
            strLoadAd = C10160l.loadAd(strVip);
        }
        sb3.append((Object) strLoadAd);
        sb3.append(" using ");
        sb3.append(c15202l);
        sb3.append(" with ");
        sb3.append(c10700l.f21708l);
        Log.i("CXCP", sb3.toString());
        StringBuilder sb4 = new StringBuilder("CameraDevice-");
        interfaceC2413l2 = (InterfaceC2413l) c10700l2.f21708l;
        if (interfaceC2413l2 != null) {
            strVip2 = interfaceC2413l2.vip();
        } else {
            strVip2 = null;
        }
    }

    @Override // defpackage.InterfaceC17121l
    public final void admob() {
        Log.w("CXCP", this + " Configuration Failed");
        Trace.beginSection(this + "#onConfigureFailed");
        this.yandex.yandex(new C11769l(9, false));
        metrica();
        this.pro.countDown();
        C16543l c16543l = this.startapp;
        if (c16543l != null) {
            c16543l.pro();
        }
        Trace.endSection();
    }

    @Override // defpackage.InterfaceC17121l
    public final void amazon() {
        Log.d("CXCP", this + " Closed");
        Trace.beginSection(this + "#onClosed");
        metrica();
        this.pro.countDown();
        C16543l c16543l = this.startapp;
        if (c16543l != null) {
            c16543l.pro();
        }
        Trace.endSection();
    }

    @Override // defpackage.InterfaceC17121l
    public final void billing() {
        Log.d("CXCP", this + " CaptureQueueEmpty");
    }

    @Override // defpackage.InterfaceC17121l
    public final void crashlytics() {
        Log.d("CXCP", this + " Active");
    }

    public final void firebase(Map map) {
        synchronized (this.firebase) {
            try {
                int i = this.isVip;
                if (i != 4 && i != 5) {
                    Map map2 = this.ad;
                    if (map2 == null) {
                        map2 = C14054l.f27396l;
                    }
                    startapp(map2, map);
                    this.ad = map;
                    Map map3 = this.subscription;
                    InterfaceC14029l interfaceC14029l = null;
                    if (map3 != null && this.tapsense == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (map3.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map3.size()) {
                            this.tapsense = linkedHashMap;
                            AbstractC10999l.mopub(this.subs, null, 0, new C14951l(this, interfaceC14029l, 9), 3);
                        }
                    }
                    AbstractC10999l.mopub(this.subs, null, 0, new C12829l(this, null, 1), 3);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void isPro(InterfaceC11450l interfaceC11450l) {
        synchronized (this.firebase) {
            try {
                C7752l c7752l = this.ads;
                if (c7752l == null && interfaceC11450l != null) {
                    C8509l c8509lYandex = this.crashlytics.yandex(interfaceC11450l, this.remoteconfig, this.vip);
                    C7752l c7752l2 = new C7752l(interfaceC11450l, new C9598l(c8509lYandex), c8509lYandex);
                    this.ads = c7752l2;
                    c7752l = c7752l2;
                }
                if (this.isVip == 3 && c7752l != null) {
                    boolean z = (this.subscription == null || this.tapsense == null) ? false : true;
                    Unit unit = Unit.INSTANCE;
                    if (z) {
                        remoteconfig(false);
                    }
                    synchronized (this.firebase) {
                        this.purchase.getClass();
                        Log.i("CXCP", "Configured " + this + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - this.metrica.yandex) / 1000000.0d)}, 1)));
                        this.yandex.loadAd(c7752l.loadAd);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6262l
    public final void loadAd() {
        Log.d("CXCP", this + " session disconnecting");
        Trace.beginSection(this + "#onSessionDisconnected");
        smaato();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.Signature.await();
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0026  */
    public final void metrica() {
        long j;
        boolean z;
        int i;
        smaato();
        synchronized (this.firebase) {
            try {
                j = 0;
                if (this.isVip != 5) {
                    z = true;
                    if (this.adcel != null && this.license && (i = this.billing.crashlytics) != 1) {
                        if (i == 2) {
                            j = 2000;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                this.adcel = null;
                this.isVip = 5;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            vip(j);
        }
    }

    @Override // defpackage.InterfaceC17121l
    public final void mopub(InterfaceC11450l interfaceC11450l) {
        Log.d("CXCP", this + " Configured");
        Trace.beginSection(this + "#configure");
        isPro(interfaceC11450l);
        this.pro.countDown();
        C16543l c16543l = this.startapp;
        if (c16543l != null) {
            c16543l.pro();
        }
        Trace.endSection();
    }

    @Override // defpackage.InterfaceC17121l
    public final void purchase() {
        Log.d("CXCP", this + " Ready");
    }

    public final void remoteconfig(boolean z) {
        C7752l c7752l;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.firebase) {
            c7752l = this.ads;
            map = this.subscription;
            linkedHashMap = this.tapsense;
            Unit unit = Unit.INSTANCE;
        }
        if (c7752l == null || map == null || linkedHashMap == null) {
            return;
        }
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        this.purchase.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            int i = ((C16755l) entry.getKey()).yandex;
            InterfaceC12918l interfaceC12918l = (InterfaceC12918l) entry.getValue();
            Object obj = linkedHashMap.get(new C16755l(i));
            if (obj == null) {
                C8339l.smaato("Required value was null.");
                return;
            }
            ((C5819l) interfaceC12918l).yandex((Surface) obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((InterfaceC12918l) ((Map.Entry) it.next()).getValue());
        }
        c7752l.yandex.mo2280l(AbstractC16901l.m4213const(linkedHashSet));
        synchronized (this.firebase) {
            try {
                z2 = false;
                if (this.isVip == 3) {
                    this.remoteconfig.putAll(linkedHashMap);
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        int i2 = ((C16755l) entry2.getKey()).yandex;
                        Surface surface = (Surface) entry2.getValue();
                        C9494l c9494lYandex = this.mopub.yandex(i2);
                        if (c9494lYandex == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (c9494lYandex.loadAd.size() != 1) {
                            throw new IllegalStateException("Cannot finalize a multi-output stream!");
                        }
                        this.vip.put(new C13172l(((C16853l) AbstractC16901l.m4208abstract(c9494lYandex.loadAd)).yandex), surface);
                    }
                    this.purchase.getClass();
                    long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Finalized ");
                    ArrayList arrayList = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C16755l(((C16755l) ((Map.Entry) it2.next()).getKey()).yandex));
                    }
                    sb.append(arrayList);
                    sb.append(" for ");
                    sb.append(this);
                    sb.append(" in ");
                    sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)));
                    Log.i("CXCP", sb.toString());
                    z2 = true;
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && z) {
            C18548l c18548l = this.yandex;
            Log.d("CXCP", c18548l + " onGraphModified");
            c18548l.loadAd.f28401l.m3144l(C15305l.loadAd);
        }
        Trace.endSection();
    }

    public final void smaato() {
        C7752l c7752l;
        synchronized (this.firebase) {
            try {
                int i = this.isVip;
                if (i != 4 && i != 5) {
                    this.isVip = 4;
                    C7752l c7752l2 = this.ads;
                    InterfaceC14029l interfaceC14029l = null;
                    boolean z = false;
                    if (c7752l2 != null) {
                        this.ads = null;
                    } else {
                        if (this.billing.amazon && this.license) {
                            z = true;
                        }
                        c7752l2 = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    C16543l c16543l = this.startapp;
                    if (c16543l != null) {
                        c16543l.pro();
                    }
                    int i2 = 2;
                    if (z) {
                        Log.d("CXCP", "Waiting for CameraCaptureSession configuration");
                        if (((Unit) this.admob.loadAd(3000L, new C4978l(this, interfaceC14029l, i2))) == null) {
                            Log.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.firebase) {
                            c7752l = this.ads;
                            this.ads = null;
                        }
                        c7752l2 = c7752l;
                    }
                    Trace.beginSection(this.yandex + "#onGraphStopping");
                    C18548l c18548l = this.yandex;
                    Log.d("CXCP", c18548l + " onGraphStopping");
                    C1008l c1008l = c18548l.amazon;
                    C11913l c11913l = C11913l.loadAd;
                    c1008l.getClass();
                    c1008l.remoteconfig(null, c11913l);
                    c18548l.loadAd.m3861package(null);
                    for (C7686l c7686l : c18548l.crashlytics) {
                        C7647l c7647l = c7686l.yandex;
                        C2667l c2667l = c7686l.loadAd;
                        if (c2667l == null) {
                            c2667l = null;
                        }
                        c7647l.loadAd(c2667l, c11913l);
                    }
                    Trace.endSection();
                    if (c7752l2 != null) {
                        C9598l c9598l = c7752l2.loadAd;
                        Log.d("CXCP", this + " Shutdown");
                        Trace.beginSection(this + "#shutdown");
                        if (this.billing.yandex && ((Unit) this.admob.loadAd(2000L, new C1474l(this, c9598l, interfaceC14029l, 3))) == null) {
                            Log.e("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        c7752l2.crashlytics.amazon();
                        Trace.endSection();
                        if (this.billing.amazon && ((Unit) this.admob.loadAd(3000L, new C1474l(this, c7752l2, interfaceC14029l, i2))) == null) {
                            Log.e("CXCP", "Failed to close the capture session in 3000ms");
                        }
                        Trace.beginSection(this.yandex + "#onGraphStopped");
                        this.yandex.crashlytics();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.yandex + "#onGraphStopped");
                        this.yandex.crashlytics();
                        Trace.endSection();
                    }
                    this.Signature.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void startapp(Map map, Map map2) throws Exception {
        Surface surface;
        AutoCloseable autoCloseable;
        Set setM4229l = AbstractC16901l.m4229l(map.values());
        Set setM4229l2 = AbstractC16901l.m4229l(map2.values());
        Iterator it = AbstractC9905l.purchase(setM4229l, setM4229l2).iterator();
        do {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.advert;
            if (!zHasNext) {
                for (Surface surface2 : AbstractC9905l.purchase(setM4229l2, setM4229l)) {
                    linkedHashMap.put(surface2, this.amazon.yandex(surface2));
                }
                return;
            }
            surface = (Surface) it.next();
            autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
            if (autoCloseable == null) {
                autoCloseable = null;
            } else if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                AbstractC14238l.subscription((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    C11983l.crashlytics();
                    return;
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        } while (autoCloseable != null);
        C8936l.firebase(surface, " doesn't have a matching surface token!", "Surface ");
    }

    public final String toString() {
        return "CaptureSessionState-" + this.isPro;
    }

    public final void vip(long j) throws Exception {
        List<AutoCloseable> listM4213const;
        if (j != 0) {
            AbstractC10999l.mopub(this.subs, null, 0, new C10118l(j, this, (InterfaceC14029l) null), 3);
            return;
        }
        Log.d("CXCP", "Finalizing " + this);
        synchronized (this.firebase) {
            listM4213const = AbstractC16901l.m4213const(this.advert.values());
            this.advert.clear();
        }
        for (AutoCloseable autoCloseable : listM4213const) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                AbstractC14238l.subscription((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    C11983l.crashlytics();
                    return;
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
    }

    @Override // defpackage.InterfaceC6262l
    public final void yandex() throws Exception {
        if (this.smaato.yandex(Boolean.FALSE, Boolean.TRUE)) {
            Log.d("CXCP", this + " session finalizing");
            Trace.beginSection(this + "#onSessionFinalized");
            metrica();
            vip(0L);
            Trace.endSection();
        }
    }
}
