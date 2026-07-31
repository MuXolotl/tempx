package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Trace;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًِٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15615l implements InterfaceC0478l, InterfaceC17215l, InterfaceC0589l, InterfaceC10820l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f30480l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f30481l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f30482l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f30483l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30484l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f30485l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f30486l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f30487l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C15616l f30478l = new C15616l(0);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final byte[] f30476l = {0, 7, 8, 15};

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final byte[] f30479l = {0, 119, -120, -1};

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final byte[] f30477l = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    public C15615l(Executor executor, ArrayList arrayList, ArrayList arrayList2, InterfaceC17087l interfaceC17087l) {
        int i = 0;
        this.f30484l = 0;
        this.f30483l = new HashMap();
        this.f30480l = new HashMap();
        this.f30486l = new HashMap();
        this.f30485l = new HashSet();
        this.f30481l = new AtomicReference();
        C2825l c2825l = new C2825l(executor);
        this.f30487l = c2825l;
        this.f30482l = interfaceC17087l;
        ArrayList<C4652l> arrayList3 = new ArrayList();
        arrayList3.add(C4652l.crashlytics(c2825l, C2825l.class, InterfaceC14242l.class, InterfaceC1677l.class));
        arrayList3.add(C4652l.crashlytics(this, C15615l.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C4652l c4652l = (C4652l) it.next();
            if (c4652l != null) {
                arrayList3.add(c4652l);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC15189l) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((InterfaceC17087l) this.f30482l).loadAd(componentRegistrar));
                        it3.remove();
                    }
                } catch (C8090l e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((C4652l) it4.next()).loadAd.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) this.f30485l).contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        ((HashSet) this.f30485l).add(obj.toString());
                    }
                }
            }
            if (((HashMap) this.f30483l).isEmpty()) {
                AbstractC15212l.amazon(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.f30483l).keySet());
                arrayList6.addAll(arrayList3);
                AbstractC15212l.amazon(arrayList6);
            }
            for (C4652l c4652l2 : arrayList3) {
                ((HashMap) this.f30483l).put(c4652l2, new C13252l(new C16865l(this, c4652l2, i)));
            }
            arrayList5.addAll(pro(arrayList3));
            arrayList5.addAll(ad());
            license();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f30481l).get();
        if (bool != null) {
            mopub((HashMap) this.f30483l, bool.booleanValue());
        }
    }

    public static C15605l Signature(C5257l c5257l) {
        byte[] bArr;
        int iMopub = c5257l.mopub(16);
        c5257l.metrica(4);
        int iMopub2 = c5257l.mopub(2);
        boolean zBilling = c5257l.billing();
        c5257l.metrica(1);
        byte[] bArr2 = AbstractC15323l.loadAd;
        if (iMopub2 != 1) {
            if (iMopub2 == 0) {
                int iMopub3 = c5257l.mopub(16);
                int iMopub4 = c5257l.mopub(16);
                if (iMopub3 > 0) {
                    bArr2 = new byte[iMopub3];
                    c5257l.isPro(iMopub3, bArr2);
                }
                if (iMopub4 > 0) {
                    bArr = new byte[iMopub4];
                    c5257l.isPro(iMopub4, bArr);
                }
            }
            return new C15605l(bArr2, bArr, iMopub, zBilling);
        }
        c5257l.metrica(c5257l.mopub(8) * 16);
        bArr = bArr2;
        return new C15605l(bArr2, bArr, iMopub, zBilling);
    }

    public static int[] admob() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = smaato(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = smaato(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[Catch: all -> 0x00ab, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00ab, blocks: (B:12:0x0074, B:14:0x0087, B:16:0x0093, B:18:0x0097, B:24:0x00a5, B:25:0x00a8, B:29:0x00ae), top: B:65:0x0074, outer: #1 }] */
    public static C7930l amazon(C15615l c15615l, InterfaceC3177l interfaceC3177l, C7542l c7542l, C1869l c1869l) {
        C16057l c16057lFirebase;
        InterfaceC18690l interfaceC18690lCrashlytics;
        C7930l c7930lLoadAd;
        C16214l c16214l;
        C0458l c0458l = C0458l.f1689l;
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            AbstractC12225l.crashlytics();
            C8195l c8195l = new C8195l(c7542l, null);
            C7542l c7542l2 = (C7542l) c8195l.f17098l;
            C7542l c7542l3 = (C7542l) c8195l.f17097l;
            InterfaceC18690l interfaceC18690lCrashlytics2 = c7542l2.crashlytics(((C5762l) c15615l.f30481l).yandex.amazon());
            interfaceC18690lCrashlytics2.startapp(true);
            C16057l c16057lFirebase2 = c15615l.firebase(c7542l2);
            char c = 0;
            if (c7542l3 != null) {
                interfaceC18690lCrashlytics = c7542l3.crashlytics(((C5762l) c15615l.f30481l).yandex.amazon());
                interfaceC18690lCrashlytics.startapp(false);
                c16057lFirebase = c15615l.firebase(c7542l3);
            } else {
                c16057lFirebase = null;
                interfaceC18690lCrashlytics = null;
            }
            C12130l c12130lCrashlytics = C12371l.crashlytics(c16057lFirebase2.f27125l.mopub(), c16057lFirebase != null ? c16057lFirebase.f27125l.mopub() : null, (C18120l) ((C5138l) c16057lFirebase2.f31460l).f11181l);
            C15974l c15974l = (C15974l) c15615l.f30482l;
            synchronized (c15974l.yandex) {
                try {
                    C7930l c7930l = (C7930l) c15974l.loadAd.get(new C7381l(System.identityHashCode(interfaceC3177l), c12130lCrashlytics));
                    if (c7930l != null) {
                        C11903l c11903l = c7930l.f16512l;
                        if (c11903l.f23734l.f31731l.firebase() || ((c16214l = c11903l.f23733l) != null && c16214l.f31731l.firebase())) {
                            c15974l.remoteconfig(c7930l);
                            c7930lLoadAd = null;
                        } else {
                            c7930lLoadAd = c7930l;
                        }
                    } else {
                        c7930lLoadAd = c7930l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Collection<C7930l> collectionAmazon = ((C15974l) c15615l.f30482l).amazon();
            for (AbstractC6896l abstractC6896l : c1869l.billing) {
                for (C7930l c7930l2 : collectionAmazon) {
                    char c2 = c;
                    if (c7930l2.Signature(abstractC6896l) && !AbstractC8576l.yandex(c7930l2.subscription(), interfaceC3177l)) {
                        Object[] objArr = new Object[1];
                        objArr[c2] = abstractC6896l;
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(objArr, 1)));
                    }
                    c = c2;
                }
            }
            if (c7930lLoadAd == null) {
                C15974l c15974l2 = (C15974l) c15615l.f30482l;
                C10038l c10038l = ((C5762l) c15615l.f30481l).firebase;
                if (c10038l == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                c7930lLoadAd = c15974l2.loadAd(interfaceC3177l, new C11903l(interfaceC18690lCrashlytics2, interfaceC18690lCrashlytics, c16057lFirebase2, c16057lFirebase, c0458l, c0458l, (C7518l) c10038l.f20462l, (C13568l) c10038l.f20465l, (InterfaceC10139l) c10038l.f20466l), (C17485l) ((C5762l) c15615l.f30481l).metrica.getValue());
            }
            if (!c1869l.billing.isEmpty()) {
                C15974l c15974l3 = (C15974l) c15615l.f30482l;
                C6655l c6655l = ((C5762l) c15615l.f30481l).mopub;
                if (c6655l == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                c15974l3.yandex(c7930lLoadAd, c1869l, c6655l.purchase);
                ((HashSet) c15615l.f30485l).add(new C7381l(System.identityHashCode(interfaceC3177l), c12130lCrashlytics));
            }
            Trace.endSection();
            return c7930lLoadAd;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static final InterfaceC17477l applovin(C15615l c15615l, C18128l c18128l, int i) {
        C7644l c7644l = (C7644l) c15615l.f30483l;
        C3624l c3624lSubs = AbstractC18719l.subs((InterfaceC3588l) c7644l.f15737l, i);
        ArrayList arrayListAds = AbstractC17587l.ads(new C11100l(AbstractC17587l.remoteconfig(c18128l, new C12141l(c15615l, 2)), C12844l.f25263l));
        Iterator it = AbstractC17587l.remoteconfig(c3624lSubs, C7759l.f16283l).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                AbstractC14055l.ads();
                throw null;
            }
        }
        while (arrayListAds.size() < i2) {
            arrayListAds.add(0);
        }
        return ((C12014l) ((C0511l) c7644l.f15738l).firebase).tapsense(c3624lSubs, arrayListAds);
    }

    public static AbstractC15211l billing(AbstractC15211l abstractC15211l, AbstractC18041l abstractC18041l) {
        AbstractC16860l abstractC16860lBilling = AbstractC12300l.billing(abstractC15211l);
        InterfaceC3841l annotations = abstractC15211l.getAnnotations();
        AbstractC18041l abstractC18041lAdmob = AbstractC10000l.admob(abstractC15211l);
        List listBilling = AbstractC10000l.billing(abstractC15211l);
        List listM4242synchronized = AbstractC16901l.m4242synchronized(1, AbstractC10000l.subs(abstractC15211l));
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listM4242synchronized, 10));
        Iterator it = listM4242synchronized.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC4946l) it.next()).loadAd());
        }
        return AbstractC10000l.amazon(abstractC16860lBilling, annotations, abstractC18041lAdmob, listBilling, arrayList, abstractC18041l, true).mo8static(abstractC15211l.mo1342throw());
    }

    public static final void crashlytics(C15615l c15615l, int i) {
        C2974l c2974l;
        C5762l c5762l = (C5762l) c15615l.f30481l;
        if (c5762l != null) {
            C6655l c6655l = c5762l.mopub;
            if (c6655l == null) {
                C8339l.smaato("CameraX not initialized yet.");
                return;
            }
            C7518l c7518l = c6655l.purchase;
            synchronized (c7518l.loadAd) {
                c7518l.purchase = i;
                c2974l = c7518l.crashlytics;
            }
            if (c2974l == null) {
                return;
            }
            c7518l.billing = i == 2;
            for (InterfaceC18690l interfaceC18690l : c2974l.amazon()) {
                C14275l c14275l = interfaceC18690l instanceof C14275l ? (C14275l) interfaceC18690l : null;
                if (c14275l != null) {
                    if (i == 1) {
                        c14275l.subscription(true);
                    } else if (i == 2) {
                        c14275l.subscription(false);
                    }
                }
            }
        }
    }

    public static final ArrayList isVip(C18128l c18128l, C15615l c15615l) {
        List list = c18128l.f35434l;
        C18128l c18128lBilling = AbstractC7310l.billing(c18128l, (C14965l) ((C7644l) c15615l.f30483l).f15740l);
        Iterable iterableIsVip = c18128lBilling != null ? isVip(c18128lBilling, c15615l) : null;
        if (iterableIsVip == null) {
            iterableIsVip = C2580l.f5619l;
        }
        return AbstractC16901l.m4232new(list, iterableIsVip);
    }

    public static final int loadAd(C15615l c15615l) {
        C5762l c5762l = (C5762l) c15615l.f30481l;
        if (c5762l != null) {
            C6655l c6655l = c5762l.mopub;
            if (c6655l != null) {
                return c6655l.purchase.loadAd();
            }
            C8339l.smaato("CameraX not initialized yet.");
        }
        return 0;
    }

    public static byte[] purchase(int i, int i2, C5257l c5257l) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c5257l.mopub(i2);
        }
        return bArr;
    }

    public static C16017l signatures(List list, InterfaceC3841l interfaceC3841l, InterfaceC1925l interfaceC1925l, InterfaceC8371l interfaceC8371l) {
        C16017l c16017lAds;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C8382l) it.next()).getClass();
            if (interfaceC3841l.isEmpty()) {
                C16017l.f31395l.getClass();
                c16017lAds = C16017l.f31394l;
            } else {
                C13645l c13645l = C16017l.f31395l;
                List listSingletonList = Collections.singletonList(new C7687l(interfaceC3841l));
                c13645l.getClass();
                c16017lAds = C13645l.ads(listSingletonList);
            }
            arrayList.add(c16017lAds);
        }
        ArrayList arrayListIsPro = AbstractC14055l.isPro(arrayList);
        C16017l.f31395l.getClass();
        return C13645l.ads(arrayListIsPro);
    }

    public static int smaato(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int[] subs() {
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = smaato(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = smaato(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = smaato(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = smaato(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = smaato(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void subscription(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c;
        char c2;
        int iMopub;
        int iMopub2;
        boolean z;
        int iMopub3;
        int iMopub4;
        int iMopub5;
        int i4;
        int i5;
        boolean z2;
        int iMopub6;
        C5257l c5257l = new C5257l(bArr, bArr.length);
        int i6 = i2;
        int i7 = i3;
        byte[] bArrPurchase = null;
        byte[] bArrPurchase2 = null;
        byte[] bArrPurchase3 = null;
        while (c5257l.loadAd() != 0) {
            int i8 = 8;
            int iMopub7 = c5257l.mopub(8);
            if (iMopub7 != 240) {
                int i9 = 3;
                int i10 = 2;
                int i11 = 4;
                switch (iMopub7) {
                    case 16:
                        if (i == 3) {
                            bArr2 = bArrPurchase == null ? f30479l : bArrPurchase;
                        } else if (i == 2) {
                            bArr2 = bArrPurchase3 == null ? f30476l : bArrPurchase3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z3 = false;
                        while (true) {
                            int iMopub8 = c5257l.mopub(2);
                            if (iMopub8 != 0) {
                                iMopub = iMopub8;
                                iMopub2 = 1;
                            } else {
                                if (c5257l.billing()) {
                                    int iMopub9 = c5257l.mopub(3) + 3;
                                    iMopub = c5257l.mopub(2);
                                    iMopub2 = iMopub9;
                                } else {
                                    if (c5257l.billing()) {
                                        iMopub2 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        int iMopub10 = c5257l.mopub(2);
                                        if (iMopub10 == 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z3 = true;
                                        } else if (iMopub10 == 1) {
                                            c = '\b';
                                            c2 = 4;
                                            iMopub2 = 2;
                                        } else if (iMopub10 == 2) {
                                            c = '\b';
                                            c2 = 4;
                                            iMopub2 = c5257l.mopub(4) + 12;
                                            iMopub = c5257l.mopub(2);
                                            z3 = z3;
                                        } else if (iMopub10 != 3) {
                                            z3 = z3;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int iMopub11 = c5257l.mopub(8) + 29;
                                            iMopub = c5257l.mopub(2);
                                            z3 = z3;
                                            iMopub2 = iMopub11;
                                            c2 = 4;
                                        }
                                        iMopub = 0;
                                        iMopub2 = 0;
                                    }
                                    iMopub = 0;
                                }
                                if (iMopub2 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iMopub = bArr2[iMopub];
                                    }
                                    paint.setColor(iArr[iMopub]);
                                    canvas.drawRect(i6, i7, i6 + iMopub2, i7 + 1, paint);
                                }
                                i6 += iMopub2;
                                if (z3) {
                                    c5257l.crashlytics();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (iMopub2 == 0) {
                            }
                            i6 += iMopub2;
                            if (z3) {
                                c5257l.crashlytics();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        byte[] bArr3 = i == 3 ? bArrPurchase2 == null ? f30477l : bArrPurchase2 : null;
                        boolean z4 = false;
                        while (true) {
                            int iMopub12 = c5257l.mopub(i11);
                            if (iMopub12 != 0) {
                                z = z4;
                                iMopub5 = iMopub12;
                                iMopub3 = 1;
                            } else if (c5257l.billing()) {
                                if (c5257l.billing()) {
                                    int iMopub13 = c5257l.mopub(i10);
                                    if (iMopub13 == 0) {
                                        z = z4;
                                        iMopub3 = 1;
                                    } else if (iMopub13 != 1) {
                                        if (iMopub13 == i10) {
                                            iMopub3 = c5257l.mopub(i11) + 9;
                                            iMopub4 = c5257l.mopub(i11);
                                        } else if (iMopub13 != i9) {
                                            z = z4;
                                            iMopub3 = 0;
                                        } else {
                                            iMopub3 = c5257l.mopub(i8) + 25;
                                            iMopub4 = c5257l.mopub(i11);
                                        }
                                        iMopub5 = iMopub4;
                                    } else {
                                        z = z4;
                                        iMopub3 = i10;
                                    }
                                    iMopub5 = 0;
                                } else {
                                    iMopub3 = c5257l.mopub(i10) + 4;
                                    iMopub5 = c5257l.mopub(i11);
                                }
                                z = z4;
                            } else {
                                int iMopub14 = c5257l.mopub(i9);
                                if (iMopub14 != 0) {
                                    iMopub3 = iMopub14 + 2;
                                    z = z4;
                                } else {
                                    z = true;
                                    iMopub3 = 0;
                                }
                                iMopub5 = 0;
                            }
                            if (iMopub3 == 0 || paint == 0) {
                                i4 = i9;
                                i5 = i10;
                            } else {
                                if (bArr3 != 0) {
                                    iMopub5 = bArr3[iMopub5];
                                }
                                paint.setColor(iArr[iMopub5]);
                                i4 = i9;
                                i5 = 2;
                                canvas.drawRect(i6, i7, i6 + iMopub3, i7 + 1, paint);
                            }
                            i6 += iMopub3;
                            if (z) {
                                c5257l.crashlytics();
                            } else {
                                z4 = z;
                                i9 = i4;
                                i10 = i5;
                                i11 = 4;
                                i8 = 8;
                            }
                            break;
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        boolean z5 = false;
                        while (true) {
                            int iMopub15 = c5257l.mopub(8);
                            if (iMopub15 != 0) {
                                z2 = z5;
                                iMopub6 = 1;
                            } else if (c5257l.billing()) {
                                z2 = z5;
                                iMopub6 = c5257l.mopub(7);
                                iMopub15 = c5257l.mopub(8);
                            } else {
                                int iMopub16 = c5257l.mopub(7);
                                if (iMopub16 != 0) {
                                    z2 = z5;
                                    iMopub6 = iMopub16;
                                    iMopub15 = 0;
                                } else {
                                    z2 = true;
                                    iMopub15 = 0;
                                    iMopub6 = 0;
                                }
                            }
                            if (iMopub6 != 0 && paint != 0) {
                                paint.setColor(iArr[iMopub15]);
                                canvas.drawRect(i6, i7, i6 + iMopub6, i7 + 1, paint);
                            }
                            i6 += iMopub6;
                            if (!z2) {
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iMopub7) {
                            case 32:
                                bArrPurchase3 = purchase(4, 4, c5257l);
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                bArrPurchase = purchase(4, 8, c5257l);
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                bArrPurchase2 = purchase(16, 8, c5257l);
                                break;
                        }
                        break;
                }
            } else {
                i7 += 2;
                i6 = i2;
            }
        }
    }

    public static C4798l tapsense(C5257l c5257l, int i) {
        int[] iArr;
        int iMopub;
        int i2;
        int iMopub2;
        int iMopub3;
        int iMopub4;
        int i3 = 8;
        int iMopub5 = c5257l.mopub(8);
        c5257l.metrica(8);
        int i4 = 2;
        int i5 = i - 2;
        int i6 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrAdmob = admob();
        int[] iArrSubs = subs();
        while (i5 > 0) {
            int iMopub6 = c5257l.mopub(i3);
            int iMopub7 = c5257l.mopub(i3);
            if ((iMopub7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iMopub7 & 64) != 0 ? iArrAdmob : iArrSubs;
            }
            if ((iMopub7 & 1) != 0) {
                iMopub3 = c5257l.mopub(i3);
                iMopub4 = c5257l.mopub(i3);
                iMopub = c5257l.mopub(i3);
                iMopub2 = c5257l.mopub(i3);
                i2 = i5 - 6;
            } else {
                int iMopub8 = c5257l.mopub(6) << i4;
                int iMopub9 = c5257l.mopub(4) << 4;
                iMopub = c5257l.mopub(4) << 4;
                i2 = i5 - 4;
                iMopub2 = c5257l.mopub(i4) << 6;
                iMopub3 = iMopub8;
                iMopub4 = iMopub9;
            }
            if (iMopub3 == 0) {
                iMopub4 = i6;
                iMopub = iMopub4;
                iMopub2 = 255;
            }
            double d = iMopub3;
            double d2 = iMopub4 - 128;
            double d3 = iMopub - 128;
            iArr[iMopub6] = smaato((byte) (255 - (iMopub2 & 255)), AbstractC15323l.isPro((int) ((1.402d * d2) + d), 0, 255), AbstractC15323l.isPro((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), AbstractC15323l.isPro((int) ((d3 * 1.772d) + d), 0, 255));
            i5 = i2;
            i6 = 0;
            iMopub5 = iMopub5;
            iArrSubs = iArrSubs;
            i3 = 8;
            i4 = 2;
        }
        return new C4798l(iMopub5, iArr2, iArrAdmob, iArrSubs);
    }

    public static final C5138l yandex(C15615l c15615l, C7542l c7542l) {
        for (C13893l c13893l : c7542l.yandex) {
            C18120l c18120l = C13893l.loadAd;
            if (!AbstractC8576l.yandex(c18120l, c18120l)) {
                synchronized (AbstractC5817l.yandex) {
                }
            }
        }
        return AbstractC15078l.yandex;
    }

    public ArrayList ad() {
        HashMap map = (HashMap) this.f30486l;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f30483l).entrySet()) {
            C4652l c4652l = (C4652l) entry.getKey();
            if (c4652l.purchase != 0) {
                InterfaceC15189l interfaceC15189l = (InterfaceC15189l) entry.getValue();
                for (C12638l c12638l : c4652l.loadAd) {
                    if (!map2.containsKey(c12638l)) {
                        map2.put(c12638l, new HashSet());
                    }
                    ((Set) map2.get(c12638l)).add(interfaceC15189l);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                C9531l c9531l = (C9531l) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC7762l(c9531l, (InterfaceC15189l) it.next(), 24));
                }
            } else {
                C12638l c12638l2 = (C12638l) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C9531l c9531l2 = new C9531l();
                c9531l2.loadAd = null;
                c9531l2.yandex = Collections.newSetFromMap(new ConcurrentHashMap());
                c9531l2.yandex.addAll(set);
                map.put(c12638l2, c9531l2);
            }
        }
        return arrayList;
    }

    public void adcel(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.f30481l;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.f30483l);
        }
        mopub(map, z);
    }

    public InterfaceC16902l ads(int i) {
        InterfaceC16902l interfaceC16902l = (InterfaceC16902l) ((Map) this.f30482l).get(Integer.valueOf(i));
        if (interfaceC16902l != null) {
            return interfaceC16902l;
        }
        C15615l c15615l = (C15615l) this.f30480l;
        if (c15615l != null) {
            return c15615l.ads(i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029f  */
    /* JADX WARN: Code duplicated, block: B:103:0x02af  */
    /* JADX WARN: Code duplicated, block: B:105:0x02be  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:110:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:112:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:122:0x030c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0329  */
    /* JADX WARN: Code duplicated, block: B:130:0x032e  */
    /* JADX WARN: Code duplicated, block: B:133:0x033a  */
    /* JADX WARN: Code duplicated, block: B:140:0x035d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0360  */
    /* JADX WARN: Code duplicated, block: B:143:0x0364  */
    /* JADX WARN: Code duplicated, block: B:144:0x0369  */
    /* JADX WARN: Code duplicated, block: B:147:0x0373  */
    /* JADX WARN: Code duplicated, block: B:148:0x0378  */
    /* JADX WARN: Code duplicated, block: B:150:0x037e  */
    /* JADX WARN: Code duplicated, block: B:151:0x038a  */
    /* JADX WARN: Code duplicated, block: B:152:0x038c  */
    /* JADX WARN: Code duplicated, block: B:154:0x039e  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:161:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:162:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:164:0x03be  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:167:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:171:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x0139  */
    /* JADX WARN: Code duplicated, block: B:49:0x016d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x018b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0199  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8  */
    public AbstractC15211l advert(C18128l c18128l, boolean z) {
        InterfaceC1925l interfaceC1925lCrashlytics;
        InterfaceC15234l interfaceC15234lApplovin;
        Object next;
        C16017l c16017lSignatures;
        ArrayList arrayList;
        int i;
        List listM4213const;
        boolean zBooleanValue;
        boolean z2;
        AbstractC15211l abstractC15211lAds;
        C15110l c15110lTapsense;
        int size;
        AbstractC15211l abstractC15211lAds2;
        InterfaceC15234l interfaceC15234lPro;
        AbstractC1514l abstractC1514lMopub;
        AbstractC4946l abstractC4946l;
        AbstractC18041l abstractC18041lLoadAd;
        InterfaceC15234l interfaceC15234lPro2;
        C2312l c2312lMopub;
        AbstractC18041l abstractC18041lLoadAd2;
        InterfaceC11661l interfaceC11661l;
        C2312l c2312lCrashlytics;
        int size2;
        int i2;
        C18128l c18128lMopub;
        int i3;
        C16093l c16093l;
        InterfaceC16902l interfaceC16902l;
        EnumC14176l enumC14176l;
        int iOrdinal;
        int i4;
        int i5;
        C18128l c18128lMopub2;
        InterfaceC0218l c10636l;
        InterfaceC0218l c10636l2;
        C7644l c7644l = (C7644l) this.f30483l;
        C14965l c14965l = (C14965l) c7644l.f15740l;
        C0511l c0511l = (C0511l) c7644l.f15738l;
        InterfaceC8371l interfaceC8371l = (InterfaceC8371l) c7644l.f15734l;
        if (c18128l.startapp()) {
            if (AbstractC18719l.subs((InterfaceC3588l) c7644l.f15737l, c18128l.f35436l).crashlytics) {
                ((C7472l) ((C0511l) c7644l.f15738l).mopub).getClass();
            }
        } else if ((c18128l.f35423l & 128) == 128) {
            if (AbstractC18719l.subs((InterfaceC3588l) c7644l.f15737l, c18128l.f35435l).crashlytics) {
                ((C7472l) ((C0511l) c7644l.f15738l).mopub).getClass();
            }
        }
        if (!c18128l.startapp()) {
            int i6 = c18128l.f35423l;
            if ((i6 & 32) == 32) {
                interfaceC15234lApplovin = ads(c18128l.f35431l);
                if (interfaceC15234lApplovin == null) {
                    C8741l c8741l = C8741l.yandex;
                    interfaceC1925lCrashlytics = C8741l.crashlytics(EnumC5123l.f11138l, String.valueOf(c18128l.f35431l), (String) this.f30485l);
                }
            } else if ((i6 & 64) == 64) {
                String string = ((InterfaceC3588l) c7644l.f15737l).getString(c18128l.f35438l);
                Iterator it = vip().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC8576l.yandex(((InterfaceC16902l) next).getName().loadAd(), string));
                InterfaceC16902l interfaceC16902l2 = (InterfaceC16902l) next;
                if (interfaceC16902l2 == null) {
                    C8741l c8741l2 = C8741l.yandex;
                    interfaceC1925lCrashlytics = C8741l.crashlytics(EnumC5123l.f11130l, string, interfaceC8371l.toString());
                } else {
                    interfaceC15234lApplovin = interfaceC16902l2;
                }
            } else if ((i6 & 128) == 128) {
                interfaceC15234lApplovin = (InterfaceC15234l) ((C18028l) this.f30481l).invoke(Integer.valueOf(c18128l.f35435l));
                if (interfaceC15234lApplovin == null) {
                    interfaceC15234lApplovin = applovin(this, c18128l, c18128l.f35435l);
                }
            } else {
                C8741l c8741l3 = C8741l.yandex;
                interfaceC1925lCrashlytics = C8741l.crashlytics(EnumC5123l.f11150l, new String[0]);
            }
            boolean z3 = true;
            if (C8741l.purchase(interfaceC1925lCrashlytics.pro())) {
                C8741l c8741l4 = C8741l.yandex;
                return C8741l.amazon(EnumC5123l.f11151l, C2580l.f5619l, interfaceC1925lCrashlytics, (String[]) Arrays.copyOf(new String[]{interfaceC1925lCrashlytics.toString()}, 1));
            }
            C0846l c0846l = new C0846l((C16412l) c0511l.yandex, new C11239l(this, c18128l, 29));
            c16017lSignatures = signatures((List) c0511l.adcel, c0846l, interfaceC1925lCrashlytics, interfaceC8371l);
            ArrayList arrayListIsVip = isVip(c18128l, this);
            arrayList = new ArrayList(AbstractC14055l.billing(arrayListIsVip, 10));
            i = 0;
            for (Object obj : arrayListIsVip) {
                i3 = i + 1;
                if (i >= 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                c16093l = (C16093l) obj;
                interfaceC16902l = (InterfaceC16902l) AbstractC16901l.m4220for(i, interfaceC1925lCrashlytics.getParameters());
                enumC14176l = c16093l.f31533l;
                if (enumC14176l == EnumC14176l.STAR) {
                    iOrdinal = enumC14176l.ordinal();
                    if (iOrdinal != 0) {
                        i4 = 3;
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    C18725l.billing();
                                    return null;
                                }
                                C1759l.ads(enumC14176l, "Only IN, OUT and INV are supported. Actual argument: ");
                                return null;
                            }
                            i4 = 1;
                        }
                    } else {
                        i4 = 2;
                    }
                    i5 = c16093l.f31535l;
                    if ((i5 & 2) == 2) {
                        c18128lMopub2 = c16093l.f31538l;
                    } else if ((i5 & 4) == 4) {
                        c18128lMopub2 = c14965l.mopub(c16093l.f31537l);
                    } else {
                        c18128lMopub2 = null;
                    }
                    if (c18128lMopub2 == null) {
                        c10636l2 = new C10636l(1, C8741l.loadAd(EnumC5123l.f11135l, c16093l.toString()));
                    } else {
                        c10636l = new C10636l(i4, premium(c18128lMopub2));
                        c10636l2 = c10636l;
                    }
                } else if (interfaceC16902l == null) {
                    c10636l2 = new C18612l(((InterfaceC11865l) c0511l.loadAd).subs());
                } else {
                    c10636l = new C12768l(interfaceC16902l);
                    c10636l2 = c10636l;
                }
                arrayList.add(c10636l2);
                i = i3;
            }
            Object obj2 = null;
            listM4213const = AbstractC16901l.m4213const(arrayList);
            InterfaceC15234l interfaceC15234lPro3 = interfaceC1925lCrashlytics.pro();
            if (z || !(interfaceC15234lPro3 instanceof C9522l)) {
                zBooleanValue = AbstractC1305l.yandex.purchase(c18128l.f35430l).booleanValue();
                z2 = c18128l.f35433l;
                if (zBooleanValue) {
                    size = interfaceC1925lCrashlytics.getParameters().size() - listM4213const.size();
                    if (size == 0) {
                        abstractC15211lAds2 = AbstractC3605l.ads(c16017lSignatures, interfaceC1925lCrashlytics, listM4213const, z2);
                        interfaceC15234lPro = abstractC15211lAds2.mo1339native().pro();
                        if (interfaceC15234lPro == null && (interfaceC15234lPro instanceof InterfaceC17477l) && AbstractC16860l.m4205strictfp(interfaceC15234lPro)) {
                            int i7 = AbstractC3759l.yandex;
                            abstractC1514lMopub = AbstractC10000l.mopub(AbstractC11125l.billing(interfaceC15234lPro));
                        } else {
                            abstractC1514lMopub = null;
                        }
                        if (AbstractC8576l.yandex(abstractC1514lMopub, C1015l.amazon) || (abstractC4946l = (AbstractC4946l) AbstractC16901l.m4212class(AbstractC10000l.subs(abstractC15211lAds2))) == null || (abstractC18041lLoadAd = abstractC4946l.loadAd()) == null) {
                            abstractC15211lAds2 = null;
                        } else {
                            interfaceC15234lPro2 = abstractC18041lLoadAd.mo1339native().pro();
                            if (interfaceC15234lPro2 != null) {
                                c2312lMopub = AbstractC3759l.mopub(interfaceC15234lPro2);
                            } else {
                                c2312lMopub = null;
                            }
                            if (abstractC18041lLoadAd.inmobi().size() == 1 && (AbstractC8576l.yandex(c2312lMopub, AbstractC3974l.mopub) || AbstractC8576l.yandex(c2312lMopub, AbstractC6307l.yandex))) {
                                abstractC18041lLoadAd2 = ((AbstractC4946l) AbstractC16901l.m4208abstract(abstractC18041lLoadAd.inmobi())).loadAd();
                                if (interfaceC8371l instanceof InterfaceC11661l) {
                                    interfaceC11661l = (InterfaceC11661l) interfaceC8371l;
                                } else {
                                    interfaceC11661l = null;
                                }
                                if (interfaceC11661l != null) {
                                    c2312lCrashlytics = AbstractC3759l.crashlytics(interfaceC11661l);
                                } else {
                                    c2312lCrashlytics = null;
                                }
                                if (AbstractC8576l.yandex(c2312lCrashlytics, AbstractC16403l.yandex)) {
                                    abstractC15211lAds2 = billing(abstractC15211lAds2, abstractC18041lLoadAd2);
                                } else {
                                    abstractC15211lAds2 = billing(abstractC15211lAds2, abstractC18041lLoadAd2);
                                }
                            }
                        }
                    } else if (size != 1 && (size2 = listM4213const.size() - 1) >= 0) {
                        abstractC15211lAds2 = AbstractC3605l.ads(c16017lSignatures, interfaceC1925lCrashlytics.subs().license(size2).metrica(), listM4213const, z2);
                    } else {
                        abstractC15211lAds2 = null;
                    }
                    if (abstractC15211lAds2 == null) {
                        C8741l c8741l5 = C8741l.yandex;
                        abstractC15211lAds = C8741l.amazon(EnumC5123l.f11133l, listM4213const, interfaceC1925lCrashlytics, new String[0]);
                    } else {
                        abstractC15211lAds = abstractC15211lAds2;
                    }
                } else {
                    abstractC15211lAds = AbstractC3605l.ads(c16017lSignatures, interfaceC1925lCrashlytics, listM4213const, z2);
                    if (AbstractC1305l.loadAd.purchase(c18128l.f35430l).booleanValue()) {
                        c15110lTapsense = C1083l.tapsense(abstractC15211lAds, true);
                        if (c15110lTapsense == null) {
                            C1759l.subs(39, abstractC15211lAds, "null DefinitelyNotNullType for '");
                            return null;
                        }
                        abstractC15211lAds = c15110lTapsense;
                    }
                }
            } else {
                C9522l c9522l = (C9522l) interfaceC15234lPro3;
                C16936l c16936l = new C16936l(13);
                List parameters = c9522l.f19415l.getParameters();
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(parameters, 10));
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((InterfaceC16902l) it2.next()).mo864l());
                }
                C12014l c12014l = new C12014l(obj2, c9522l, listM4213const, AbstractC8676l.subscription(AbstractC16901l.m4226l(listM4213const, arrayList2)), 28);
                C16017l.f31395l.getClass();
                AbstractC15211l abstractC15211lIsPro = c16936l.isPro(c12014l, C16017l.f31394l, false, 0, true);
                List list = (List) c0511l.adcel;
                ArrayList arrayListM4238static = AbstractC16901l.m4238static(c0846l, abstractC15211lIsPro.getAnnotations());
                C16017l c16017lSignatures2 = signatures(list, arrayListM4238static.isEmpty() ? C2782l.f6058l : new C2172l(0, arrayListM4238static), interfaceC1925lCrashlytics, interfaceC8371l);
                if (!AbstractC12008l.purchase(abstractC15211lIsPro) && !c18128l.f35433l) {
                    z3 = false;
                }
                abstractC15211lAds = abstractC15211lIsPro.mo8static(z3).mo686abstract(c16017lSignatures2);
            }
            i2 = c18128l.f35423l;
            if ((i2 & 1024) == 1024) {
                c18128lMopub = c18128l.f35432l;
            } else if ((i2 & 2048) == 2048) {
                c18128lMopub = c14965l.mopub(c18128l.f35427l);
            } else {
                c18128lMopub = null;
            }
            if (c18128lMopub != null) {
                return AbstractC14506l.isPro(abstractC15211lAds, advert(c18128lMopub, false));
            }
            return abstractC15211lAds;
        }
        interfaceC15234lApplovin = (InterfaceC15234l) ((C18028l) this.f30487l).invoke(Integer.valueOf(c18128l.f35436l));
        if (interfaceC15234lApplovin == null) {
            interfaceC15234lApplovin = applovin(this, c18128l, c18128l.f35436l);
        }
        interfaceC1925lCrashlytics = interfaceC15234lApplovin.metrica();
        boolean z4 = true;
        if (C8741l.purchase(interfaceC1925lCrashlytics.pro())) {
            C8741l c8741l6 = C8741l.yandex;
            return C8741l.amazon(EnumC5123l.f11151l, C2580l.f5619l, interfaceC1925lCrashlytics, (String[]) Arrays.copyOf(new String[]{interfaceC1925lCrashlytics.toString()}, 1));
        }
        C0846l c0846l2 = new C0846l((C16412l) c0511l.yandex, new C11239l(this, c18128l, 29));
        c16017lSignatures = signatures((List) c0511l.adcel, c0846l2, interfaceC1925lCrashlytics, interfaceC8371l);
        ArrayList arrayListIsVip2 = isVip(c18128l, this);
        arrayList = new ArrayList(AbstractC14055l.billing(arrayListIsVip2, 10));
        i = 0;
        while (r10.hasNext()) {
            i3 = i + 1;
            if (i >= 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            c16093l = (C16093l) obj;
            interfaceC16902l = (InterfaceC16902l) AbstractC16901l.m4220for(i, interfaceC1925lCrashlytics.getParameters());
            enumC14176l = c16093l.f31533l;
            if (enumC14176l == EnumC14176l.STAR) {
                iOrdinal = enumC14176l.ordinal();
                if (iOrdinal != 0) {
                    i4 = 3;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                C18725l.billing();
                                return null;
                            }
                            C1759l.ads(enumC14176l, "Only IN, OUT and INV are supported. Actual argument: ");
                            return null;
                        }
                        i4 = 1;
                    }
                } else {
                    i4 = 2;
                }
                i5 = c16093l.f31535l;
                if ((i5 & 2) == 2) {
                    c18128lMopub2 = c16093l.f31538l;
                } else if ((i5 & 4) == 4) {
                    c18128lMopub2 = c14965l.mopub(c16093l.f31537l);
                } else {
                    c18128lMopub2 = null;
                }
                if (c18128lMopub2 == null) {
                    c10636l2 = new C10636l(1, C8741l.loadAd(EnumC5123l.f11135l, c16093l.toString()));
                } else {
                    c10636l = new C10636l(i4, premium(c18128lMopub2));
                    c10636l2 = c10636l;
                }
            } else if (interfaceC16902l == null) {
                c10636l2 = new C18612l(((InterfaceC11865l) c0511l.loadAd).subs());
            } else {
                c10636l = new C12768l(interfaceC16902l);
                c10636l2 = c10636l;
            }
            arrayList.add(c10636l2);
            i = i3;
        }
        Object obj3 = null;
        listM4213const = AbstractC16901l.m4213const(arrayList);
        InterfaceC15234l interfaceC15234lPro4 = interfaceC1925lCrashlytics.pro();
        if (z) {
            zBooleanValue = AbstractC1305l.yandex.purchase(c18128l.f35430l).booleanValue();
            z2 = c18128l.f35433l;
            if (zBooleanValue) {
                size = interfaceC1925lCrashlytics.getParameters().size() - listM4213const.size();
                if (size == 0) {
                    abstractC15211lAds2 = AbstractC3605l.ads(c16017lSignatures, interfaceC1925lCrashlytics, listM4213const, z2);
                    interfaceC15234lPro = abstractC15211lAds2.mo1339native().pro();
                    if (interfaceC15234lPro == null) {
                        abstractC1514lMopub = null;
                    } else {
                        abstractC1514lMopub = null;
                    }
                    if (AbstractC8576l.yandex(abstractC1514lMopub, C1015l.amazon)) {
                        abstractC15211lAds2 = null;
                    } else {
                        interfaceC15234lPro2 = abstractC18041lLoadAd.mo1339native().pro();
                        if (interfaceC15234lPro2 != null) {
                            c2312lMopub = AbstractC3759l.mopub(interfaceC15234lPro2);
                        } else {
                            c2312lMopub = null;
                        }
                        if (abstractC18041lLoadAd.inmobi().size() == 1) {
                            abstractC18041lLoadAd2 = ((AbstractC4946l) AbstractC16901l.m4208abstract(abstractC18041lLoadAd.inmobi())).loadAd();
                            if (interfaceC8371l instanceof InterfaceC11661l) {
                                interfaceC11661l = (InterfaceC11661l) interfaceC8371l;
                            } else {
                                interfaceC11661l = null;
                            }
                            if (interfaceC11661l != null) {
                                c2312lCrashlytics = AbstractC3759l.crashlytics(interfaceC11661l);
                            } else {
                                c2312lCrashlytics = null;
                            }
                            if (AbstractC8576l.yandex(c2312lCrashlytics, AbstractC16403l.yandex)) {
                                abstractC15211lAds2 = billing(abstractC15211lAds2, abstractC18041lLoadAd2);
                            } else {
                                abstractC15211lAds2 = billing(abstractC15211lAds2, abstractC18041lLoadAd2);
                            }
                        }
                    }
                } else if (size != 1) {
                    abstractC15211lAds2 = null;
                } else {
                    abstractC15211lAds2 = AbstractC3605l.ads(c16017lSignatures, interfaceC1925lCrashlytics.subs().license(size2).metrica(), listM4213const, z2);
                }
                if (abstractC15211lAds2 == null) {
                    C8741l c8741l7 = C8741l.yandex;
                    abstractC15211lAds = C8741l.amazon(EnumC5123l.f11133l, listM4213const, interfaceC1925lCrashlytics, new String[0]);
                } else {
                    abstractC15211lAds = abstractC15211lAds2;
                }
            } else {
                abstractC15211lAds = AbstractC3605l.ads(c16017lSignatures, interfaceC1925lCrashlytics, listM4213const, z2);
                if (AbstractC1305l.loadAd.purchase(c18128l.f35430l).booleanValue()) {
                    c15110lTapsense = C1083l.tapsense(abstractC15211lAds, true);
                    if (c15110lTapsense == null) {
                        C1759l.subs(39, abstractC15211lAds, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    abstractC15211lAds = c15110lTapsense;
                }
            }
        } else {
            zBooleanValue = AbstractC1305l.yandex.purchase(c18128l.f35430l).booleanValue();
            z2 = c18128l.f35433l;
            if (zBooleanValue) {
                size = interfaceC1925lCrashlytics.getParameters().size() - listM4213const.size();
                if (size == 0) {
                    abstractC15211lAds2 = AbstractC3605l.ads(c16017lSignatures, interfaceC1925lCrashlytics, listM4213const, z2);
                    interfaceC15234lPro = abstractC15211lAds2.mo1339native().pro();
                    if (interfaceC15234lPro == null) {
                        abstractC1514lMopub = null;
                    } else {
                        abstractC1514lMopub = null;
                    }
                    if (AbstractC8576l.yandex(abstractC1514lMopub, C1015l.amazon)) {
                        abstractC15211lAds2 = null;
                    } else {
                        interfaceC15234lPro2 = abstractC18041lLoadAd.mo1339native().pro();
                        if (interfaceC15234lPro2 != null) {
                            c2312lMopub = AbstractC3759l.mopub(interfaceC15234lPro2);
                        } else {
                            c2312lMopub = null;
                        }
                        if (abstractC18041lLoadAd.inmobi().size() == 1) {
                            abstractC18041lLoadAd2 = ((AbstractC4946l) AbstractC16901l.m4208abstract(abstractC18041lLoadAd.inmobi())).loadAd();
                            if (interfaceC8371l instanceof InterfaceC11661l) {
                                interfaceC11661l = (InterfaceC11661l) interfaceC8371l;
                            } else {
                                interfaceC11661l = null;
                            }
                            if (interfaceC11661l != null) {
                                c2312lCrashlytics = AbstractC3759l.crashlytics(interfaceC11661l);
                            } else {
                                c2312lCrashlytics = null;
                            }
                            if (AbstractC8576l.yandex(c2312lCrashlytics, AbstractC16403l.yandex)) {
                                abstractC15211lAds2 = billing(abstractC15211lAds2, abstractC18041lLoadAd2);
                            } else {
                                abstractC15211lAds2 = billing(abstractC15211lAds2, abstractC18041lLoadAd2);
                            }
                        }
                    }
                } else if (size != 1) {
                    abstractC15211lAds2 = null;
                } else {
                    abstractC15211lAds2 = AbstractC3605l.ads(c16017lSignatures, interfaceC1925lCrashlytics.subs().license(size2).metrica(), listM4213const, z2);
                }
                if (abstractC15211lAds2 == null) {
                    C8741l c8741l8 = C8741l.yandex;
                    abstractC15211lAds = C8741l.amazon(EnumC5123l.f11133l, listM4213const, interfaceC1925lCrashlytics, new String[0]);
                } else {
                    abstractC15211lAds = abstractC15211lAds2;
                }
            } else {
                abstractC15211lAds = AbstractC3605l.ads(c16017lSignatures, interfaceC1925lCrashlytics, listM4213const, z2);
                if (AbstractC1305l.loadAd.purchase(c18128l.f35430l).booleanValue()) {
                    c15110lTapsense = C1083l.tapsense(abstractC15211lAds, true);
                    if (c15110lTapsense == null) {
                        C1759l.subs(39, abstractC15211lAds, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    abstractC15211lAds = c15110lTapsense;
                }
            }
        }
        i2 = c18128l.f35423l;
        if ((i2 & 1024) == 1024) {
            c18128lMopub = c18128l.f35432l;
        } else if ((i2 & 2048) == 2048) {
            c18128lMopub = c14965l.mopub(c18128l.f35427l);
        } else {
            c18128lMopub = null;
        }
        if (c18128lMopub != null) {
            return AbstractC14506l.isPro(abstractC15211lAds, advert(c18128lMopub, false));
        }
        return abstractC15211lAds;
    }

    public void appmetrica() {
        Trace.beginSection("CX:unbindAll");
        try {
            AbstractC12225l.crashlytics();
            crashlytics(this, 0);
            ((C15974l) this.f30482l).smaato((HashSet) this.f30485l);
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    public C16057l firebase(C7542l c7542l) {
        Object c16057l;
        Trace.beginSection("CX:getCameraInfo");
        try {
            InterfaceC15879l interfaceC15879lAdcel = c7542l.crashlytics(((C5762l) this.f30481l).yandex.amazon()).adcel();
            C5138l c5138lYandex = yandex(this, c7542l);
            C12130l c12130lCrashlytics = C12371l.crashlytics(interfaceC15879lAdcel.mopub(), null, (C18120l) c5138lYandex.f11181l);
            synchronized (this.f30480l) {
                try {
                    c16057l = ((HashMap) this.f30483l).get(c12130lCrashlytics);
                    if (c16057l == null) {
                        c16057l = new C16057l(interfaceC15879lAdcel, c5138lYandex);
                        ((HashMap) this.f30483l).put(c12130lCrashlytics, c16057l);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C16057l c16057l2 = (C16057l) c16057l;
            Trace.endSection();
            return c16057l2;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC10820l
    public Object get() {
        String str = (String) this.f30483l;
        Size size = (Size) this.f30485l;
        C6410l c6410l = (C6410l) this.f30487l;
        LinkedHashMap linkedHashMap = AbstractC15040l.yandex;
        C16672l c16672lLoadAd = AbstractC15040l.loadAd((C16928l) this.f30486l, (Range) this.f30482l);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = c16672lLoadAd.yandex;
        sb.append(i);
        sb.append("fps. Encode frame rate = ");
        int i2 = c16672lLoadAd.loadAd;
        sb.append(i2);
        sb.append("fps.");
        AbstractC5088l.yandex("VidEncVdPrflRslvr", sb.toString());
        AbstractC5088l.yandex("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iAmazon = AbstractC15040l.amazon(c6410l.crashlytics, ((C15421l) this.f30481l).loadAd, c6410l.admob, c16672lLoadAd.loadAd, c6410l.amazon, size.getWidth(), c6410l.purchase, size.getHeight(), c6410l.billing);
        int i3 = c6410l.mopub;
        C8581l c8581lYandex = AbstractC15040l.yandex(i3, str);
        C18289l c18289lAmazon = C5274l.amazon();
        c18289lAmazon.loadAd = str;
        EnumC8920l enumC8920l = (EnumC8920l) this.f30480l;
        if (enumC8920l == null) {
            C6541l.subs("Null inputTimebase");
            return null;
        }
        c18289lAmazon.amazon = enumC8920l;
        if (size == null) {
            C6541l.subs("Null resolution");
            return null;
        }
        c18289lAmazon.purchase = size;
        c18289lAmazon.firebase = Integer.valueOf(iAmazon);
        c18289lAmazon.admob = Integer.valueOf(i);
        c18289lAmazon.subs = Integer.valueOf(i2);
        c18289lAmazon.crashlytics = Integer.valueOf(i3);
        c18289lAmazon.mopub = c8581lYandex;
        return c18289lAmazon.amazon();
    }

    @Override // defpackage.InterfaceC0589l
    public View getRoot() {
        return (FrameLayout) this.f30483l;
    }

    public void inmobi(ContentResolver contentResolver) {
        HashMap map = (HashMap) this.f30483l;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f30485l;
        if (map == null) {
            atomicBoolean.set(false);
            this.f30483l = new HashMap(16, 1.0f);
            this.f30482l = new Object();
            contentResolver.registerContentObserver(AbstractC4586l.yandex, true, new C5848l(this));
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            ((HashMap) this.f30483l).clear();
            ((HashMap) this.f30480l).clear();
            ((HashMap) this.f30486l).clear();
            ((HashMap) this.f30487l).clear();
            ((HashMap) this.f30481l).clear();
            this.f30482l = new Object();
        }
    }

    @Override // defpackage.InterfaceC17215l
    public /* synthetic */ InterfaceC2743l isPro(int i, int i2, byte[] bArr) {
        return AbstractC0653l.billing(this, bArr, i2);
    }

    public void license() {
        HashMap map = (HashMap) this.f30480l;
        HashMap map2 = (HashMap) this.f30486l;
        for (C4652l c4652l : ((HashMap) this.f30483l).keySet()) {
            for (C12186l c12186l : c4652l.crashlytics) {
                boolean z = c12186l.loadAd == 2;
                C12638l c12638l = c12186l.yandex;
                if (z && !map2.containsKey(c12638l)) {
                    Set set = Collections.EMPTY_SET;
                    C9531l c9531l = new C9531l();
                    c9531l.loadAd = null;
                    c9531l.yandex = Collections.newSetFromMap(new ConcurrentHashMap());
                    c9531l.yandex.addAll(set);
                    map2.put(c12638l, c9531l);
                } else if (map.containsKey(c12638l)) {
                    continue;
                } else {
                    int i = c12186l.loadAd;
                    if (i == 1) {
                        throw new C17071l("Unsatisfied dependency for component " + c4652l + ": " + c12638l, 2, (byte) 0);
                    }
                    if (i != 2) {
                        map.put(c12638l, new C1263l(C1263l.crashlytics, C1263l.amazon));
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public InterfaceC15189l mo619l(Class cls) {
        return mo621l(C12638l.yandex(cls));
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: lٕٕۤ */
    public Set mo620l(C12638l c12638l) {
        InterfaceC15189l interfaceC15189l;
        synchronized (this) {
            interfaceC15189l = (C9531l) ((HashMap) this.f30486l).get(c12638l);
            if (interfaceC15189l == null) {
                interfaceC15189l = f30478l;
            }
        }
        return (Set) interfaceC15189l.get();
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: lٌٖؖ */
    public synchronized InterfaceC15189l mo621l(C12638l c12638l) {
        AbstractC11064l.loadAd(c12638l, "Null interface requested.");
        return (InterfaceC15189l) ((HashMap) this.f30480l).get(c12638l);
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: lٖۡٓ */
    public Object mo622l(C12638l c12638l) {
        InterfaceC15189l interfaceC15189lMo621l = mo621l(c12638l);
        if (interfaceC15189lMo621l == null) {
            return null;
        }
        return interfaceC15189lMo621l.get();
    }

    @Override // defpackage.InterfaceC0478l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public C1263l mo623l(C12638l c12638l) {
        InterfaceC15189l interfaceC15189lMo621l = mo621l(c12638l);
        if (interfaceC15189lMo621l == null) {
            return new C1263l(C1263l.crashlytics, C1263l.amazon);
        }
        return interfaceC15189lMo621l instanceof C1263l ? (C1263l) interfaceC15189lMo621l : new C1263l(null, interfaceC15189lMo621l);
    }

    public void metrica(C5762l c5762l, Context context) {
        C2112l c2112l;
        synchronized (this.f30480l) {
            this.f30481l = c5762l;
            if (c5762l != null && (c2112l = c5762l.vip) != null) {
                ScheduledExecutorServiceC10335l scheduledExecutorServiceC10335lAdmob = AbstractC12272l.admob();
                c2112l.vip.add(new C16080l(this, scheduledExecutorServiceC10335lAdmob));
                scheduledExecutorServiceC10335lAdmob.execute(new RunnableC2936l(c2112l, this));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public void mopub(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C4652l c4652l = (C4652l) entry.getKey();
            InterfaceC15189l interfaceC15189l = (InterfaceC15189l) entry.getValue();
            int i = c4652l.amazon;
            if (i == 1 || (i == 2 && z)) {
                interfaceC15189l.get();
            }
        }
        C2825l c2825l = (C2825l) this.f30487l;
        synchronized (c2825l) {
            try {
                arrayDeque = c2825l.loadAd;
                if (arrayDeque != null) {
                    c2825l.loadAd = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
        }
    }

    public AbstractC18041l premium(C18128l c18128l) {
        C18128l c18128lMopub;
        C7644l c7644l = (C7644l) this.f30483l;
        if ((c18128l.f35423l & 2) != 2) {
            return advert(c18128l, true);
        }
        String string = ((InterfaceC3588l) c7644l.f15737l).getString(c18128l.f35437l);
        AbstractC15211l abstractC15211lAdvert = advert(c18128l, true);
        C14965l c14965l = (C14965l) c7644l.f15740l;
        int i = c18128l.f35423l;
        if ((i & 4) == 4) {
            c18128lMopub = c18128l.f35424l;
        } else {
            c18128lMopub = (i & 8) == 8 ? c14965l.mopub(c18128l.f35426l) : null;
        }
        return ((InterfaceC10599l) ((C0511l) c7644l.f15738l).subs).ads(c18128l, string, abstractC15211lAdvert, advert(c18128lMopub, true));
    }

    public ArrayList pro(ArrayList arrayList) {
        HashMap map = (HashMap) this.f30480l;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4652l c4652l = (C4652l) it.next();
            if (c4652l.purchase == 0) {
                InterfaceC15189l interfaceC15189l = (InterfaceC15189l) ((HashMap) this.f30483l).get(c4652l);
                for (C12638l c12638l : c4652l.loadAd) {
                    if (map.containsKey(c12638l)) {
                        arrayList2.add(new RunnableC7762l((C1263l) ((InterfaceC15189l) map.get(c12638l)), interfaceC15189l, 23));
                    } else {
                        map.put(c12638l, interfaceC15189l);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // defpackage.InterfaceC0478l
    public Object remoteconfig(Class cls) {
        return mo622l(C12638l.yandex(cls));
    }

    @Override // defpackage.InterfaceC17215l
    public void reset() {
        C10348l c10348l = (C10348l) this.f30481l;
        ((SparseArray) c10348l.f21132l).clear();
        ((SparseArray) c10348l.f21138l).clear();
        ((SparseArray) c10348l.f21137l).clear();
        ((SparseArray) c10348l.f21140l).clear();
        ((SparseArray) c10348l.f21133l).clear();
        c10348l.f21134l = null;
        c10348l.f21139l = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x031a  */
    /* JADX WARN: Code duplicated, block: B:103:0x031e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0333  */
    /* JADX WARN: Code duplicated, block: B:108:0x0339  */
    /* JADX WARN: Code duplicated, block: B:110:0x033c  */
    /* JADX WARN: Code duplicated, block: B:111:0x033f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0363  */
    /* JADX WARN: Code duplicated, block: B:117:0x038f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0394  */
    /* JADX WARN: Code duplicated, block: B:120:0x039c  */
    /* JADX WARN: Code duplicated, block: B:122:0x039f  */
    /* JADX WARN: Code duplicated, block: B:123:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:125:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0289  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:96:0x0308  */
    /* JADX WARN: Code duplicated, block: B:99:0x0316  */
    @Override // defpackage.InterfaceC17215l
    public void startapp(byte[] bArr, int i, int i2, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        int i3;
        ArrayList arrayList;
        SparseArray sparseArray;
        int i4;
        C8755l c8755l;
        C3567l c3567l;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C4798l c4798l;
        SparseArray sparseArray2;
        int i11;
        C3567l c3567l2;
        int i12;
        int i13;
        char c;
        char c2;
        int i14;
        int i15;
        char c3;
        int i16;
        int iKeyAt;
        C7243l c7243l;
        C15605l c15605l;
        C15605l c15605l2;
        C3567l c3567l3;
        int i17;
        int i18;
        int i19;
        Paint paint;
        int i20;
        int[] iArr;
        C3567l c3567l4;
        int iMopub;
        int iMopub2;
        int i21;
        int iMopub3;
        C5257l c5257l = new C5257l(bArr, i + i2);
        c5257l.remoteconfig(i);
        Paint paint2 = (Paint) this.f30480l;
        Canvas canvas = (Canvas) this.f30486l;
        C10348l c10348l = (C10348l) this.f30481l;
        while (c5257l.loadAd() >= 48 && c5257l.mopub(8) == 15) {
            int iMopub4 = c5257l.mopub(8);
            int i22 = 16;
            int iMopub5 = c5257l.mopub(16);
            int iMopub6 = c5257l.mopub(16);
            int iAmazon = c5257l.amazon() + iMopub6;
            if (iMopub6 * 8 > c5257l.loadAd()) {
                AbstractC6427l.vip("DvbParser", "Data field length exceeds limit");
                c5257l.metrica(c5257l.loadAd());
            } else {
                int i23 = 4;
                switch (iMopub4) {
                    case 16:
                        if (iMopub5 == c10348l.f21136l) {
                            C5601l c5601l = (C5601l) c10348l.f21139l;
                            int i24 = 8;
                            c5257l.mopub(8);
                            int iMopub7 = c5257l.mopub(4);
                            int iMopub8 = c5257l.mopub(2);
                            c5257l.metrica(2);
                            int i25 = iMopub6 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i25 > 0) {
                                int iMopub9 = c5257l.mopub(i24);
                                c5257l.metrica(i24);
                                i25 -= 6;
                                sparseArray3.put(iMopub9, new C14621l(c5257l.mopub(16), c5257l.mopub(16)));
                                i24 = 8;
                            }
                            C5601l c5601l2 = new C5601l(sparseArray3, iMopub7, iMopub8, 5);
                            if (iMopub8 != 0) {
                                c10348l.f21139l = c5601l2;
                                ((SparseArray) c10348l.f21132l).clear();
                                ((SparseArray) c10348l.f21138l).clear();
                                ((SparseArray) c10348l.f21137l).clear();
                            } else if (c5601l != null && c5601l.f11897l != iMopub7) {
                                c10348l.f21139l = c5601l2;
                            }
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        C5601l c5601l3 = (C5601l) c10348l.f21139l;
                        SparseArray sparseArray4 = (SparseArray) c10348l.f21132l;
                        if (iMopub5 == c10348l.f21136l && c5601l3 != null) {
                            int iMopub10 = c5257l.mopub(8);
                            c5257l.metrica(4);
                            boolean zBilling = c5257l.billing();
                            c5257l.metrica(3);
                            int iMopub11 = c5257l.mopub(16);
                            int iMopub12 = c5257l.mopub(16);
                            c5257l.mopub(3);
                            int iMopub13 = c5257l.mopub(3);
                            c5257l.metrica(2);
                            int iMopub14 = c5257l.mopub(8);
                            int iMopub15 = c5257l.mopub(8);
                            int iMopub16 = c5257l.mopub(4);
                            int iMopub17 = c5257l.mopub(2);
                            c5257l.metrica(2);
                            int i26 = iMopub6 - 10;
                            SparseArray sparseArray5 = new SparseArray();
                            while (i26 > 0) {
                                int iMopub18 = c5257l.mopub(i22);
                                int iMopub19 = c5257l.mopub(2);
                                c5257l.mopub(2);
                                int iMopub20 = c5257l.mopub(12);
                                c5257l.metrica(i23);
                                int iMopub21 = c5257l.mopub(12);
                                int i27 = i26 - 6;
                                if (iMopub19 == 1 || iMopub19 == 2) {
                                    c5257l.mopub(8);
                                    c5257l.mopub(8);
                                    i26 -= 8;
                                } else {
                                    i26 = i27;
                                }
                                sparseArray5.put(iMopub18, new C7243l(iMopub20, iMopub21));
                                i23 = 4;
                                i22 = 16;
                            }
                            C3567l c3567l5 = new C3567l(iMopub10, zBilling, iMopub11, iMopub12, iMopub13, iMopub14, iMopub15, iMopub16, iMopub17, sparseArray5);
                            if (c5601l3.f11896l == 0 && (c3567l4 = (C3567l) sparseArray4.get(iMopub10)) != null) {
                                SparseArray sparseArray6 = c3567l4.isPro;
                                for (int i28 = 0; i28 < sparseArray6.size(); i28++) {
                                    c3567l5.isPro.put(sparseArray6.keyAt(i28), (C7243l) sparseArray6.valueAt(i28));
                                }
                            }
                            sparseArray4.put(c3567l5.yandex, c3567l5);
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (iMopub5 == c10348l.f21136l) {
                            C4798l c4798lTapsense = tapsense(c5257l, iMopub6);
                            ((SparseArray) c10348l.f21138l).put(c4798lTapsense.yandex, c4798lTapsense);
                        } else if (iMopub5 == c10348l.f21135l) {
                            C4798l c4798lTapsense2 = tapsense(c5257l, iMopub6);
                            ((SparseArray) c10348l.f21140l).put(c4798lTapsense2.yandex, c4798lTapsense2);
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        if (iMopub5 == c10348l.f21136l) {
                            C15605l c15605lSignature = Signature(c5257l);
                            ((SparseArray) c10348l.f21137l).put(c15605lSignature.yandex, c15605lSignature);
                        } else if (iMopub5 == c10348l.f21135l) {
                            C15605l c15605lSignature2 = Signature(c5257l);
                            ((SparseArray) c10348l.f21133l).put(c15605lSignature2.yandex, c15605lSignature2);
                        }
                        break;
                    case 20:
                        if (iMopub5 == c10348l.f21136l) {
                            c5257l.metrica(4);
                            boolean zBilling2 = c5257l.billing();
                            c5257l.metrica(3);
                            int iMopub22 = c5257l.mopub(16);
                            int iMopub23 = c5257l.mopub(16);
                            if (zBilling2) {
                                int iMopub24 = c5257l.mopub(16);
                                iMopub = c5257l.mopub(16);
                                iMopub3 = c5257l.mopub(16);
                                iMopub2 = c5257l.mopub(16);
                                i21 = iMopub24;
                            } else {
                                iMopub = iMopub22;
                                iMopub2 = iMopub23;
                                i21 = 0;
                                iMopub3 = 0;
                            }
                            c10348l.f21134l = new C5034l(iMopub22, iMopub23, i21, iMopub, iMopub3, iMopub2);
                        }
                        break;
                }
                c5257l.startapp(iAmazon - c5257l.amazon());
            }
        }
        C5601l c5601l4 = (C5601l) c10348l.f21139l;
        if (c5601l4 == null) {
            C9258l c9258l = AbstractC1186l.f3181l;
            c8755l = new C8755l(-9223372036854775807L, -9223372036854775807L, C13708l.f26763l);
        } else {
            C5034l c5034l = (C5034l) c10348l.f21134l;
            if (c5034l == null) {
                c5034l = (C5034l) this.f30485l;
            }
            Bitmap bitmap = (Bitmap) this.f30482l;
            if (bitmap != null) {
                i3 = 1;
                if (c5034l.yandex + 1 != bitmap.getWidth() || c5034l.loadAd + 1 != ((Bitmap) this.f30482l).getHeight()) {
                }
                arrayList = new ArrayList();
                sparseArray = (SparseArray) c5601l4.f11899l;
                i4 = 0;
                while (i4 < sparseArray.size()) {
                    canvas.save();
                    C14621l c14621l = (C14621l) sparseArray.valueAt(i4);
                    c3567l = (C3567l) ((SparseArray) c10348l.f21132l).get(sparseArray.keyAt(i4));
                    i5 = c14621l.yandex + c5034l.crashlytics;
                    i6 = c14621l.loadAd + c5034l.purchase;
                    i7 = c3567l.crashlytics;
                    int i29 = c3567l.billing;
                    i8 = c3567l.amazon;
                    i9 = i5 + i7;
                    i10 = i6 + i8;
                    SparseArray sparseArray7 = sparseArray;
                    canvas.clipRect(i5, i6, Math.min(i9, c5034l.amazon), Math.min(i10, c5034l.billing));
                    c4798l = (C4798l) ((SparseArray) c10348l.f21138l).get(i29);
                    if (c4798l == null && (c4798l = (C4798l) ((SparseArray) c10348l.f21140l).get(i29)) == null) {
                        c4798l = (C4798l) this.f30487l;
                    }
                    sparseArray2 = c3567l.isPro;
                    C5034l c5034l2 = c5034l;
                    i11 = 0;
                    while (i11 < sparseArray2.size()) {
                        iKeyAt = sparseArray2.keyAt(i11);
                        int i30 = i4;
                        c7243l = (C7243l) sparseArray2.valueAt(i11);
                        SparseArray sparseArray8 = sparseArray2;
                        c15605l = (C15605l) ((SparseArray) c10348l.f21137l).get(iKeyAt);
                        if (c15605l == null) {
                            c15605l = (C15605l) ((SparseArray) c10348l.f21133l).get(iKeyAt);
                        }
                        c15605l2 = c15605l;
                        if (c15605l2 != null) {
                            if (c15605l2.loadAd) {
                                paint = null;
                            } else {
                                paint = (Paint) this.f30483l;
                            }
                            int i31 = i5;
                            i20 = c3567l.purchase;
                            int i32 = i31 + c7243l.yandex;
                            int i33 = c7243l.loadAd + i6;
                            if (i20 == 3) {
                                iArr = c4798l.amazon;
                            } else if (i20 == 2) {
                                iArr = c4798l.crashlytics;
                            } else {
                                iArr = c4798l.loadAd;
                            }
                            int i34 = i8;
                            Paint paint3 = paint;
                            C3567l c3567l6 = c3567l;
                            int[] iArr2 = iArr;
                            c3567l3 = c3567l6;
                            i17 = i31;
                            i18 = i11;
                            i19 = i34;
                            subscription(c15605l2.crashlytics, iArr2, i20, i32, i33, paint3, canvas);
                            subscription(c15605l2.amazon, iArr2, i20, i32, i33 + 1, paint3, canvas);
                        } else {
                            c3567l3 = c3567l;
                            i17 = i5;
                            i18 = i11;
                            i19 = i8;
                        }
                        i11 = i18 + 1;
                        c3567l = c3567l3;
                        i5 = i17;
                        sparseArray2 = sparseArray8;
                        i4 = i30;
                        c10348l = c10348l;
                        i7 = i7;
                        i8 = i19;
                    }
                    C10348l c10348l2 = c10348l;
                    int i35 = i4;
                    c3567l2 = c3567l;
                    i12 = i5;
                    int i36 = i7;
                    int i37 = i8;
                    if (c3567l2.loadAd) {
                        i15 = c3567l2.purchase;
                        if (i15 == 3) {
                            i16 = c4798l.amazon[c3567l2.mopub];
                            c3 = 2;
                        } else {
                            c3 = 2;
                            if (i15 == 2) {
                                i16 = c4798l.crashlytics[c3567l2.admob];
                            } else {
                                i16 = c4798l.loadAd[c3567l2.subs];
                            }
                        }
                        paint2.setColor(i16);
                        i13 = i12;
                        c2 = c3;
                        i14 = 0;
                        c = 3;
                        canvas.drawRect(i13, i6, i9, i10, paint2);
                    } else {
                        i13 = i12;
                        c = 3;
                        c2 = 2;
                        i14 = 0;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((Bitmap) this.f30482l, i13, i6, i36, i37);
                    float f = c5034l2.yandex;
                    float f2 = i6;
                    float f3 = c5034l2.loadAd;
                    arrayList.add(new C17456l(null, null, null, bitmapCreateBitmap, f2 / f3, 0, 0, i13 / f, 0, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, i36 / f, i37 / f3, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0));
                    canvas.drawColor(i14, PorterDuff.Mode.CLEAR);
                    canvas.restore();
                    i4 = i35 + 1;
                    c5034l = c5034l2;
                    arrayList = arrayList;
                    sparseArray = sparseArray7;
                    c10348l = c10348l2;
                }
                c8755l = new C8755l(-9223372036854775807L, -9223372036854775807L, arrayList);
            } else {
                i3 = 1;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(c5034l.yandex + i3, c5034l.loadAd + i3, Bitmap.Config.ARGB_8888);
            this.f30482l = bitmapCreateBitmap2;
            canvas.setBitmap(bitmapCreateBitmap2);
            arrayList = new ArrayList();
            sparseArray = (SparseArray) c5601l4.f11899l;
            i4 = 0;
            while (i4 < sparseArray.size()) {
                canvas.save();
                C14621l c14621l2 = (C14621l) sparseArray.valueAt(i4);
                c3567l = (C3567l) ((SparseArray) c10348l.f21132l).get(sparseArray.keyAt(i4));
                i5 = c14621l2.yandex + c5034l.crashlytics;
                i6 = c14621l2.loadAd + c5034l.purchase;
                i7 = c3567l.crashlytics;
                int i210 = c3567l.billing;
                i8 = c3567l.amazon;
                i9 = i5 + i7;
                i10 = i6 + i8;
                SparseArray sparseArray9 = sparseArray;
                canvas.clipRect(i5, i6, Math.min(i9, c5034l.amazon), Math.min(i10, c5034l.billing));
                c4798l = (C4798l) ((SparseArray) c10348l.f21138l).get(i210);
                if (c4798l == null) {
                    c4798l = (C4798l) this.f30487l;
                }
                sparseArray2 = c3567l.isPro;
                C5034l c5034l3 = c5034l;
                i11 = 0;
                while (i11 < sparseArray2.size()) {
                    iKeyAt = sparseArray2.keyAt(i11);
                    int i38 = i4;
                    c7243l = (C7243l) sparseArray2.valueAt(i11);
                    SparseArray sparseArray10 = sparseArray2;
                    c15605l = (C15605l) ((SparseArray) c10348l.f21137l).get(iKeyAt);
                    if (c15605l == null) {
                        c15605l = (C15605l) ((SparseArray) c10348l.f21133l).get(iKeyAt);
                    }
                    c15605l2 = c15605l;
                    if (c15605l2 != null) {
                        if (c15605l2.loadAd) {
                            paint = null;
                        } else {
                            paint = (Paint) this.f30483l;
                        }
                        int i39 = i5;
                        i20 = c3567l.purchase;
                        int i310 = i39 + c7243l.yandex;
                        int i311 = c7243l.loadAd + i6;
                        if (i20 == 3) {
                            iArr = c4798l.amazon;
                        } else if (i20 == 2) {
                            iArr = c4798l.crashlytics;
                        } else {
                            iArr = c4798l.loadAd;
                        }
                        int i312 = i8;
                        Paint paint4 = paint;
                        C3567l c3567l7 = c3567l;
                        int[] iArr3 = iArr;
                        c3567l3 = c3567l7;
                        i17 = i39;
                        i18 = i11;
                        i19 = i312;
                        subscription(c15605l2.crashlytics, iArr3, i20, i310, i311, paint4, canvas);
                        subscription(c15605l2.amazon, iArr3, i20, i310, i311 + 1, paint4, canvas);
                    } else {
                        c3567l3 = c3567l;
                        i17 = i5;
                        i18 = i11;
                        i19 = i8;
                    }
                    i11 = i18 + 1;
                    c3567l = c3567l3;
                    i5 = i17;
                    sparseArray2 = sparseArray10;
                    i4 = i38;
                    c10348l = c10348l;
                    i7 = i7;
                    i8 = i19;
                }
                C10348l c10348l3 = c10348l;
                int i313 = i4;
                c3567l2 = c3567l;
                i12 = i5;
                int i314 = i7;
                int i315 = i8;
                if (c3567l2.loadAd) {
                    i15 = c3567l2.purchase;
                    if (i15 == 3) {
                        i16 = c4798l.amazon[c3567l2.mopub];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        if (i15 == 2) {
                            i16 = c4798l.crashlytics[c3567l2.admob];
                        } else {
                            i16 = c4798l.loadAd[c3567l2.subs];
                        }
                    }
                    paint2.setColor(i16);
                    i13 = i12;
                    c2 = c3;
                    i14 = 0;
                    c = 3;
                    canvas.drawRect(i13, i6, i9, i10, paint2);
                } else {
                    i13 = i12;
                    c = 3;
                    c2 = 2;
                    i14 = 0;
                }
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap((Bitmap) this.f30482l, i13, i6, i314, i315);
                float f4 = c5034l3.yandex;
                float f5 = i6;
                float f6 = c5034l3.loadAd;
                arrayList.add(new C17456l(null, null, null, bitmapCreateBitmap3, f5 / f6, 0, 0, i13 / f4, 0, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, i314 / f4, i315 / f6, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0));
                canvas.drawColor(i14, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i4 = i313 + 1;
                c5034l = c5034l3;
                arrayList = arrayList;
                sparseArray = sparseArray9;
                c10348l = c10348l3;
            }
            c8755l = new C8755l(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        interfaceC18679l.accept(c8755l);
    }

    public String toString() {
        switch (this.f30484l) {
            case 4:
                String str = (String) this.f30486l;
                C15615l c15615l = (C15615l) this.f30480l;
                return str.concat(c15615l == null ? "" : ". Child of ".concat((String) c15615l.f30486l));
            default:
                return super.toString();
        }
    }

    public List vip() {
        return AbstractC16901l.m4213const(((Map) this.f30482l).values());
    }

    public C15615l(C7644l c7644l, C15615l c15615l, List list, String str, String str2) {
        Map linkedHashMap;
        this.f30484l = 4;
        this.f30483l = c7644l;
        this.f30480l = c15615l;
        this.f30486l = str;
        this.f30485l = str2;
        C16412l c16412l = (C16412l) ((C0511l) c7644l.f15738l).yandex;
        int i = 0;
        this.f30487l = c16412l.crashlytics(new C12141l(this, i));
        this.f30481l = c16412l.crashlytics(new C12141l(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = C14054l.f27396l;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17586l c17586l = (C17586l) it.next();
                linkedHashMap.put(Integer.valueOf(c17586l.f34243l), new C12865l((C7644l) this.f30483l, c17586l, i));
                i++;
            }
        }
        this.f30482l = linkedHashMap;
    }

    public C15615l(int i) {
        this.f30484l = i;
        switch (i) {
            case 6:
                this.f30485l = new AtomicBoolean();
                this.f30483l = null;
                this.f30480l = new HashMap(16, 1.0f);
                this.f30486l = new HashMap(16, 1.0f);
                this.f30487l = new HashMap(16, 1.0f);
                this.f30481l = new HashMap(16, 1.0f);
                this.f30482l = null;
                break;
            default:
                this.f30480l = new Object();
                this.f30487l = C11077l.f22285l;
                this.f30483l = new HashMap();
                this.f30485l = new HashSet();
                break;
        }
    }

    public /* synthetic */ C15615l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f30484l = i;
        this.f30483l = obj;
        this.f30480l = obj2;
        this.f30486l = obj3;
        this.f30485l = obj4;
        this.f30487l = obj5;
        this.f30481l = obj6;
        this.f30482l = obj7;
    }

    public C15615l(List list) {
        this.f30484l = 1;
        C13143l c13143l = new C13143l((byte[]) list.get(0));
        int iM3567synchronized = c13143l.m3567synchronized();
        int iM3567synchronized2 = c13143l.m3567synchronized();
        Paint paint = new Paint();
        this.f30483l = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f30480l = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f30486l = new Canvas();
        this.f30485l = new C5034l(719, 575, 0, 719, 0, 575);
        this.f30487l = new C4798l(0, new int[]{0, -1, -16777216, -8421505}, admob(), subs());
        this.f30481l = new C10348l(iM3567synchronized, iM3567synchronized2);
    }
}
