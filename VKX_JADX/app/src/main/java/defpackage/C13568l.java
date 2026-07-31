package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْۖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13568l implements InterfaceC17443l, InterfaceC3263l, InterfaceC15102l, InterfaceC0587l, InterfaceC10466l, InterfaceC14606l, InterfaceC13919l, InterfaceC2353l, InterfaceC7882l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f26580l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f26581l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26582l;

    public C13568l(String str) {
        this.f26582l = 0;
        this.f26581l = str;
        this.f26580l = new ArrayList(0);
        InterfaceC12157l.yandex.getClass();
        List listYandex = C17744l.yandex();
        new ArrayList();
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            ((InterfaceC12157l) it.next()).getClass();
        }
    }

    public static C13904l crashlytics() {
        C13904l c13904l = new C13904l(3);
        c13904l.f27199l = true;
        return c13904l;
    }

    public void Signature() {
        C7504l c7504l = (C7504l) this.f26581l;
        AbstractC2249l abstractC2249l = null;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        this.f26580l = new C6570l(AbstractC3483l.purchase, Float.valueOf(0.0f), abstractC2249l, 60);
    }

    public void ad(float f, InterfaceC13490l interfaceC13490l, InterfaceC2262l interfaceC2262l) {
        if (f <= interfaceC13490l.mo868instanceof(1.0f)) {
            return;
        }
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        InterfaceC14029l interfaceC14029l = null;
        byte b = 0;
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            float fFloatValue = ((Number) ((C6570l) this.f26580l).f13720l.getValue()).floatValue();
            C7504l c7504l = (C7504l) this.f26581l;
            if (c7504l != null) {
                c7504l.ads(null);
            }
            C6570l c6570l = (C6570l) this.f26580l;
            if (c6570l.f13724l) {
                this.f26580l = AbstractC15042l.metrica(c6570l, fFloatValue - f, 0.0f, 30);
            } else {
                this.f26580l = new C6570l(AbstractC3483l.purchase, Float.valueOf(-f), b == true ? 1 : 0, 60);
            }
            this.f26581l = AbstractC10999l.mopub(interfaceC2262l, null, 0, new C8912l(this, interfaceC14029l, 11), 3);
            Unit unit = Unit.INSTANCE;
        } finally {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
        }
    }

    public void adcel(Bundle bundle) {
        C17464l c17464l = (C17464l) this.f26581l;
        Bundle bundleLoadAd = AbstractC1315l.loadAd((C8195l[]) Arrays.copyOf(new C8195l[0], 0));
        Bundle bundle2 = (Bundle) c17464l.admob;
        if (bundle2 != null) {
            bundleLoadAd.putAll(bundle2);
        }
        synchronized (((C4269l) c17464l.billing)) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) c17464l.mopub).entrySet()) {
                    bundleLoadAd.putBundle((String) entry.getKey(), ((InterfaceC3335l) entry.getValue()).yandex());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bundleLoadAd.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleLoadAd);
    }

    @Override // defpackage.InterfaceC7882l
    public InterfaceC14356l admob(InterfaceC14356l interfaceC14356l) {
        AbstractC8859l[] abstractC8859lArr;
        AbstractC8859l[] abstractC8859lArr2;
        C16556l c16556l = interfaceC14356l instanceof C16556l ? (C16556l) interfaceC14356l : null;
        C16556l c16556l2 = (C16556l) this.f26581l;
        int i = c16556l2.billing;
        int length = c16556l2.crashlytics.length;
        if (c16556l != null && c16556l.billing >= i && (abstractC8859lArr = c16556l.crashlytics) != null && abstractC8859lArr.length >= length && (abstractC8859lArr2 = c16556l.amazon) != null && abstractC8859lArr2.length >= length) {
            int i2 = c16556l.yandex;
            if (i2 > 0) {
                c16556l.yandex = i2 - 1;
            }
            return c16556l;
        }
        C16556l c16556l3 = new C16556l();
        c16556l3.yandex = c16556l2.yandex;
        AbstractC8859l abstractC8859l = ((C16556l) this.f26581l).purchase;
        if (abstractC8859l != null) {
            c16556l3.purchase = abstractC8859l.tapsense((AbstractC2426l) ((C7026l) this.f26580l).f14720l);
        }
        AbstractC8859l[] abstractC8859lArr3 = ((C16556l) this.f26581l).crashlytics;
        int length2 = abstractC8859lArr3.length;
        AbstractC8859l[] abstractC8859lArr4 = new AbstractC8859l[length2];
        for (int i3 = 0; i3 < abstractC8859lArr3.length; i3++) {
            abstractC8859lArr4[i3] = abstractC8859lArr3[i3].tapsense((AbstractC2426l) ((C7026l) this.f26580l).f14720l);
        }
        c16556l3.crashlytics = abstractC8859lArr4;
        c16556l3.billing = i;
        AbstractC8859l[] abstractC8859lArr5 = new AbstractC8859l[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            abstractC8859lArr5[i4] = abstractC8859lArr4[i4].metrica();
        }
        c16556l3.amazon = abstractC8859lArr5;
        return c16556l3;
    }

    public C10771l ads(C0350l c0350l) {
        C10771l c10771lInmobi;
        synchronized (this.f26580l) {
            c10771lInmobi = ((C13161l) this.f26581l).inmobi(c0350l);
        }
        return c10771lInmobi;
    }

    public void advert(boolean z, boolean z2) {
        Context context = (Context) this.f26581l;
        boolean z3 = false;
        if (z && ((WifiManager.WifiLock) this.f26580l) == null) {
            if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                AbstractC6427l.vip("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                return;
            }
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                AbstractC6427l.vip("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f26580l = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f26580l;
        if (wifiLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        AbstractC5641l.purchase(null, ((C5807l) this.f26581l).loadAd(null));
    }

    public C15002l billing(int i, InterfaceC15879l interfaceC15879l, ArrayList arrayList, ArrayList arrayList2, InterfaceC13235l interfaceC13235l, int i2, Range range, boolean z) {
        C1557l c1557l;
        ArrayList arrayList3 = new ArrayList();
        String strMopub = interfaceC15879l.mopub();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
            C5464l c5464l = abstractC6896l.subs;
            if (c5464l == null) {
                C8339l.metrica("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
            C0542l c0542l = (C0542l) this.f26580l;
            if (c0542l == null) {
                C8339l.smaato("Required value was null.");
                return null;
            }
            int iFirebase = abstractC6896l.admob.firebase();
            Size sizeCrashlytics = abstractC6896l.crashlytics();
            if (sizeCrashlytics == null) {
                C8339l.metrica("Attached surface resolution cannot be null for already attached use cases.");
                return null;
            }
            EnumC18632l enumC18632lMo257package = abstractC6896l.admob.mo257package();
            AbstractC5641l.loadAd(c0542l.amazon.containsKey(strMopub), "No such camera id in supported combination list: ".concat(strMopub));
            synchronized (c0542l.crashlytics) {
                c1557l = (C1557l) c0542l.amazon.get(strMopub);
            }
            if (c1557l == null) {
                C8339l.metrica("No such camera id in supported combination list: ".concat(strMopub));
                return null;
            }
            EnumC18632l enumC18632l = C2483l.purchase;
            C2483l c2483lSignature = C2582l.Signature(iFirebase, sizeCrashlytics, c1557l.remoteconfig(iFirebase), i, 2, enumC18632lMo257package);
            int iFirebase2 = abstractC6896l.admob.firebase();
            Size sizeCrashlytics2 = abstractC6896l.crashlytics();
            C15421l c15421l = c5464l.crashlytics;
            ArrayList arrayList4 = new ArrayList();
            if (abstractC6896l instanceof C10245l) {
                Iterator it2 = ((C10245l) abstractC6896l).tapsense.f4686l.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((AbstractC6896l) it2.next()).admob.mo256native());
                }
            } else {
                arrayList4.add(abstractC6896l.admob.mo256native());
            }
            InterfaceC17944l interfaceC17944l = c5464l.billing;
            int iMo254for = abstractC6896l.admob.mo254for();
            Range rangeMo251catch = abstractC6896l.admob.mo251catch(C5464l.admob);
            if (rangeMo251catch == null) {
                C8339l.metrica("Required value was null.");
                return null;
            }
            C7314l c7314l = new C7314l(c2483lSignature, iFirebase2, sizeCrashlytics2, c15421l, arrayList4, interfaceC17944l, iMo254for, rangeMo251catch, abstractC6896l.admob.mo253final(), abstractC6896l.admob.mo252extends(abstractC6896l.crashlytics()));
            arrayList3.add(c7314l);
            linkedHashMap2.put(c7314l, abstractC6896l);
            linkedHashMap.put(abstractC6896l, c5464l);
        }
        Pair pair = new Pair(linkedHashMap, linkedHashMap2);
        Map map = (Map) pair.second;
        int i3 = AbstractC14352l.yandex;
        C15002l c15002lIsPro = isPro(i, interfaceC15879l, arrayList, map, C11903l.isVip(arrayList, (InterfaceC10139l) ((C7420l) ((C5138l) interfaceC13235l).subs()).smaato(InterfaceC13235l.crashlytics, InterfaceC10139l.yandex), (C3859l) this.f26581l, i2, range), z);
        return new C15002l(c15002lIsPro.loadAd, AbstractC8676l.metrica((Map) pair.first, c15002lIsPro.yandex));
    }

    @Override // defpackage.InterfaceC3263l
    public void cancel() {
        if (((C12633l) this.f26580l).compareAndSet(1, 1)) {
            return;
        }
        ((Cfinally) this.f26581l).invoke();
    }

    public boolean firebase(C0350l c0350l) {
        boolean zContainsKey;
        synchronized (this.f26580l) {
            zContainsKey = ((LinkedHashMap) ((C13161l) this.f26581l).f25776l).containsKey(c0350l);
        }
        return zContainsKey;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        switch (this.f26582l) {
            case 5:
                return new C2690l((Context) ((C0656l) this.f26581l).f2129l, (C10111l) ((C16543l) this.f26580l).get());
            default:
                return new C8137l((InterfaceC0844l) ((InterfaceC15897l) this.f26581l).get(), (InterfaceC0844l) ((InterfaceC2661l) this.f26580l).get());
        }
    }

    public C15002l isPro(int i, InterfaceC15879l interfaceC15879l, ArrayList arrayList, Map map, HashMap map2, boolean z) {
        int i2;
        Rect rectFirebase;
        boolean z2;
        C1557l c1557l;
        String strMopub = interfaceC15879l.mopub();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            try {
                rectFirebase = interfaceC15879l.firebase();
            } catch (NullPointerException unused) {
                rectFirebase = null;
            }
            C1577l c1577l = new C1577l(interfaceC15879l, rectFirebase != null ? AbstractC18611l.billing(rectFirebase) : null);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
                Object obj = map2.get(abstractC6896l);
                if (obj == null) {
                    C8339l.metrica("Required value was null.");
                    return null;
                }
                C9807l c9807l = (C9807l) obj;
                InterfaceC0048l interfaceC0048lMetrica = abstractC6896l.metrica(interfaceC15879l, c9807l.yandex, c9807l.loadAd);
                linkedHashMap2.put(interfaceC0048lMetrica, abstractC6896l);
                linkedHashMap3.put(interfaceC0048lMetrica, c1577l.admob(interfaceC0048lMetrica));
            }
            int iMopub = AbstractC5641l.mopub(arrayList, new C10207l(map2, interfaceC15879l, 16));
            C0542l c0542l = (C0542l) this.f26580l;
            if (c0542l == null) {
                C8339l.smaato("Required value was null.");
                return null;
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                AbstractC6896l abstractC6896l2 = (AbstractC6896l) it2.next();
                if (abstractC6896l2 != null) {
                    z2 = true;
                    if (AbstractC5641l.admob(abstractC6896l2)) {
                        break;
                    }
                }
            }
            boolean z3 = z2;
            AbstractC5641l.loadAd(c0542l.amazon.containsKey(strMopub), "No such camera id in supported combination list: ".concat(strMopub));
            synchronized (c0542l.crashlytics) {
                c1557l = (C1557l) c0542l.amazon.get(strMopub);
            }
            if (c1557l == null) {
                C8339l.metrica("No such camera id in supported combination list: ".concat(strMopub));
                return null;
            }
            C18093l c18093lFirebase = c1557l.firebase(i, arrayList2, linkedHashMap3, iMopub, z3, z);
            LinkedHashMap linkedHashMap4 = c18093lFirebase.yandex;
            LinkedHashMap linkedHashMap5 = c18093lFirebase.loadAd;
            i2 = c18093lFirebase.crashlytics;
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                Object value = entry.getValue();
                Object obj2 = linkedHashMap4.get(entry.getKey());
                if (obj2 == null) {
                    C8339l.metrica("Required value was null.");
                    return null;
                }
                linkedHashMap.put(value, obj2);
            }
            for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                if (map.containsKey(entry2.getKey())) {
                    Object obj3 = map.get(entry2.getKey());
                    if (obj3 == null) {
                        C8339l.metrica("Required value was null.");
                        return null;
                    }
                    linkedHashMap.put(obj3, entry2.getValue());
                }
            }
        }
        return new C15002l(i2, linkedHashMap);
    }

    public C10771l license(C0350l c0350l) {
        C10771l c10771lM3577catch;
        synchronized (this.f26580l) {
            c10771lM3577catch = ((C13161l) this.f26581l).m3577catch(c0350l);
        }
        return c10771lM3577catch;
    }

    public void loadAd(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f26580l).add(AbstractC9361l.ad(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    public boolean metrica() {
        return !(((Number) ((C6570l) this.f26580l).f13720l.getValue()).floatValue() == 0.0f);
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        if (th instanceof C12424l) {
            AbstractC5641l.purchase(null, ((C16565l) this.f26580l).cancel(false));
        } else {
            AbstractC5641l.purchase(null, ((C5807l) this.f26581l).loadAd(null));
        }
    }

    @Override // defpackage.InterfaceC0587l
    public InterfaceC14090l pro() {
        return new C17038l(((InterfaceC0587l) this.f26581l).pro(), (InterfaceC0737l) this.f26580l);
    }

    @Override // defpackage.InterfaceC13919l
    public void purchase(C13143l c13143l) {
        C7251l c7251l = (C7251l) this.f26580l;
        SparseArray sparseArray = c7251l.admob;
        C5257l c5257l = (C5257l) this.f26581l;
        if (c13143l.signatures() == 0 && (c13143l.signatures() & 128) != 0) {
            c13143l.m3568throw(6);
            int iYandex = c13143l.yandex() / 4;
            for (int i = 0; i < iYandex; i++) {
                c13143l.firebase(0, 4, c5257l.loadAd);
                c5257l.remoteconfig(0);
                int iMopub = c5257l.mopub(16);
                c5257l.metrica(3);
                if (iMopub == 0) {
                    c5257l.metrica(13);
                } else {
                    int iMopub2 = c5257l.mopub(13);
                    if (sparseArray.get(iMopub2) == null) {
                        sparseArray.put(iMopub2, new C14144l(new C9598l(c7251l, iMopub2)));
                        c7251l.vip++;
                    }
                }
            }
            if (c7251l.yandex != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public byte[] remoteconfig(byte[] bArr) {
        int length = bArr.length;
        C13409l c13409l = (C13409l) this.f26580l;
        int i = c13409l.isPro;
        C7972l c7972l = c13409l.yandex;
        if (length != i) {
            C8339l.metrica("encapsulation wrong length");
            return null;
        }
        C10146l c10146l = (C10146l) this.f26581l;
        int i2 = c13409l.subs;
        byte[] encoded = c10146l.getEncoded();
        byte[] bArr2 = new byte[64];
        C13409l c13409l2 = (C13409l) c7972l.f16631l;
        int i3 = c13409l2.loadAd;
        C5138l c5138l = new C5138l(i3);
        C5138l c5138l2 = new C5138l(i3);
        short[] sArr = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        C10685l c10685l = new C10685l(20);
        short[] sArr2 = (short[]) c10685l.f21690l;
        C10685l[] c10685lArr = (C10685l[]) c5138l.f11181l;
        int i4 = 8;
        if (c10685lArr.length == 4) {
            int i5 = 0;
            int i6 = 0;
            while (i5 < c10685lArr.length) {
                int i7 = i5;
                int i8 = 0;
                while (i8 < 32) {
                    int i9 = bArr[i6] & 255;
                    int i10 = i8;
                    int i11 = bArr[i6 + 1] & 255;
                    short s = (short) (i9 | (((short) i11) << 8));
                    int i12 = i11 >> 3;
                    int i13 = bArr[i6 + 2] & 255;
                    short s2 = (short) (i12 | (((short) i13) << 5));
                    int i14 = (i13 >> 6) | (((short) (bArr[i6 + 3] & 255)) << 2);
                    int i15 = bArr[i6 + 4] & 255;
                    short s3 = (short) (i14 | ((short) (i15 << 10)));
                    int i16 = i15 >> 1;
                    int i17 = bArr[i6 + 5] & 255;
                    short s4 = (short) (i16 | (((short) i17) << 7));
                    int i18 = i17 >> 4;
                    int i19 = bArr[i6 + 6] & 255;
                    short s5 = (short) (i18 | (((short) i19) << 4));
                    int i20 = (i19 >> 7) | (((short) (bArr[i6 + 7] & 255)) << 1);
                    int i21 = bArr[i6 + 8] & 255;
                    short s6 = (short) (i20 | ((short) (i21 << 9)));
                    int i22 = i21 >> 2;
                    int i23 = bArr[i6 + 9] & 255;
                    short s7 = (short) (i22 | (((short) i23) << 6));
                    short s8 = (short) ((i23 >> 5) | (((short) (bArr[i6 + 10] & 255)) << 3));
                    short[] sArr3 = new short[i4];
                    sArr3[0] = s;
                    sArr3[1] = s2;
                    sArr3[2] = s3;
                    sArr3[3] = s4;
                    sArr3[4] = s5;
                    sArr3[5] = s6;
                    sArr3[6] = s7;
                    sArr3[7] = s8;
                    i6 += 11;
                    int i24 = 0;
                    while (i24 < 8) {
                        int i25 = i24;
                        ((short[]) c10685lArr[i7].f21690l)[(i10 * 8) + i24] = (short) ((((sArr3[i25] & 2047) * 3329) + 1024) >> 11);
                        i24 = i25 + 1;
                    }
                    i8 = i10 + 1;
                    i4 = 8;
                }
                i5 = i7 + 1;
                i4 = 8;
            }
        } else {
            int i26 = 0;
            int i27 = 0;
            while (i26 < c10685lArr.length) {
                int i28 = i26;
                int i29 = 0;
                while (i29 < 64) {
                    int i30 = bArr[i27] & 255;
                    int i31 = bArr[i27 + 1] & 255;
                    short s9 = (short) (i30 | ((short) (i31 << 8)));
                    int i32 = i31 >> 2;
                    int i33 = bArr[i27 + 2] & 255;
                    short s10 = (short) (i32 | ((short) (i33 << 6)));
                    int i34 = i33 >> 4;
                    int i35 = bArr[i27 + 3] & 255;
                    short s11 = (short) (i34 | ((short) (i35 << 4)));
                    short s12 = (short) ((i35 >> 6) | ((short) ((bArr[i27 + 4] & 255) << 2)));
                    int i36 = i27;
                    short[] sArr4 = {s9, s10, s11, s12};
                    int i37 = i36 + 5;
                    int i38 = 0;
                    for (int i39 = 4; i38 < i39; i39 = 4) {
                        int i40 = i38;
                        ((short[]) c10685lArr[i28].f21690l)[(i29 * 4) + i38] = (short) ((((sArr4[i40] & 1023) * 3329) + AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) >> 10);
                        i38 = i40 + 1;
                        i29 = i29;
                    }
                    i29++;
                    i27 = i37;
                }
                i26 = i28 + 1;
            }
        }
        int i41 = c13409l2.purchase;
        if (i3 == 4) {
            int i42 = 0;
            while (i42 < 32) {
                int i43 = bArr[i41] & 255;
                byte b = (byte) i43;
                int i44 = bArr[i41 + 1] & 255;
                byte b2 = (byte) ((i43 >> 5) | (i44 << 3));
                int i45 = i41;
                byte b3 = (byte) (i44 >> 2);
                int i46 = bArr[i45 + 2] & 255;
                byte b4 = (byte) ((i44 >> 7) | (i46 << 1));
                int i47 = i46 >> 4;
                int i48 = bArr[i45 + 3] & 255;
                byte b5 = (byte) (i47 | (i48 << 4));
                byte b6 = (byte) (i48 >> 1);
                int i49 = i48 >> 6;
                int i50 = bArr[i45 + 4] & 255;
                byte b7 = (byte) (i49 | (i50 << 2));
                byte b8 = (byte) (i50 >> 3);
                int i51 = i42;
                byte[] bArr3 = {b, b2, b3, b4, b5, b6, b7, b8};
                int i52 = i45 + 5;
                int i53 = 0;
                for (int i54 = 8; i53 < i54; i54 = 8) {
                    sArr[(i51 * 8) + i53] = (short) ((((bArr3[i53] & 31) * 3329) + 16) >> 5);
                    i53++;
                }
                i42 = i51 + 1;
                i41 = i52;
            }
        } else {
            for (int i55 = 0; i55 < 128; i55++) {
                int i56 = i55 * 2;
                byte b9 = bArr[i41];
                sArr[i56] = (short) (((((short) (b9 & 15)) * 3329) + 8) >> 4);
                sArr[i56 + 1] = (short) (((((short) ((b9 & 255) >> 4)) * 3329) + 8) >> 4);
                i41++;
            }
        }
        c5138l2.m1710default(0, encoded);
        c5138l.m1719protected();
        C5138l.m1705transient(c10685l, c5138l2, c5138l, c13409l2);
        c10685l.m2957new();
        for (int i57 = 0; i57 < 256; i57++) {
            sArr2[i57] = (short) (sArr[i57] - sArr2[i57]);
        }
        c10685l.m2961super();
        c10685l.m2947case();
        for (int i58 = 0; i58 < 32; i58++) {
            bArr2[i58] = 0;
            for (int i59 = 0; i59 < 8; i59++) {
                short s13 = sArr2[(i58 * 8) + i59];
                bArr2[i58] = (byte) (((byte) ((((s13 - 2497) & (832 - s13)) >>> 31) << i59)) | bArr2[i58]);
            }
        }
        System.arraycopy(encoded, i2 - 64, bArr2, 32, 32);
        byte[] bArr4 = new byte[64];
        C4604l c4604l = new C4604l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        c4604l.billing(0, 64, bArr2);
        c4604l.doFinal(bArr4, 0);
        byte[] bArrM2246throws = c7972l.m2246throws(encoded, c13409l.admob, bArr2, bArr4);
        int length2 = bArrM2246throws.length ^ bArr.length;
        for (int i60 = 0; i60 != bArrM2246throws.length; i60++) {
            length2 |= bArr[i60] ^ bArrM2246throws[i60];
        }
        int i61 = length2 & 255;
        int i62 = 32;
        byte[] bArr5 = new byte[32];
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.billing(i2 - 32, 32, encoded);
        c17951l.billing(0, c13409l.isPro, bArr);
        c17951l.crashlytics(0, 32, bArr5);
        int i63 = (0 - i61) >> 24;
        int i64 = 0;
        while (i64 != i62) {
            bArr4[i64] = (byte) ((bArr5[i64] & i63) | (bArr4[i64] & (~i63)));
            i64++;
            i62 = 32;
        }
        return AbstractC14024l.vip(0, i62, bArr4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0122, code lost:
    
        if (r14 == r10) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object smaato(defpackage.AbstractC11904l r13, defpackage.AbstractC0283l r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13568l.smaato(lِٗۨ, lّؑۧ):java.lang.Object");
    }

    public void startapp(Bundle bundle) {
        C17464l c17464l = (C17464l) this.f26581l;
        InterfaceC3187l interfaceC3187l = (InterfaceC3187l) c17464l.amazon;
        if (!c17464l.yandex) {
            c17464l.purchase();
        }
        if (((C5268l) interfaceC3187l.loadAd()).subs.yandex(EnumC8981l.f18524l)) {
            C18073l.firebase(((C5268l) interfaceC3187l.loadAd()).subs, "performRestore cannot be called when owner is ");
            return;
        }
        if (c17464l.loadAd) {
            C8339l.smaato("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleAmazon = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleAmazon = AbstractC13611l.amazon("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c17464l.admob = bundleAmazon;
        c17464l.loadAd = true;
    }

    public void subscription(int i, Bundle bundle, Messenger messenger) {
        Messenger messenger2 = (Messenger) this.f26581l;
        if (messenger2.getBinder().isBinderAlive()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            messageObtain.replyTo = messenger;
            messenger2.send(messageObtain);
        }
    }

    public void tapsense(InterfaceC13922l interfaceC13922l, Object obj) {
        if (AbstractC8576l.yandex(this.f26580l, obj)) {
            return;
        }
        this.f26580l = obj;
        ((C13932l) this.f26581l).invoke();
    }

    public String toString() {
        int i = 0;
        switch (this.f26582l) {
            case 0:
                return (String) this.f26581l;
            case 7:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f26581l.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f26580l;
                int size = arrayList.size();
                while (i < size) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append('}');
                return sb.toString();
            case 10:
                String string = "[ ";
                if (((C4657l) this.f26581l) != null) {
                    while (i < 9) {
                        StringBuilder sbAd = AbstractC5020l.ad(string);
                        sbAd.append(((C4657l) this.f26581l).f9476l[i]);
                        sbAd.append(" ");
                        string = sbAd.toString();
                        i++;
                    }
                }
                StringBuilder sbAdvert = AbstractC5020l.advert(string, "] ");
                sbAdvert.append((C4657l) this.f26581l);
                return sbAdvert.toString();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return "var " + ((String) this.f26581l) + " = " + ((InterfaceC2353l) this.f26580l) + ';';
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((InterfaceC8396l) this.f26581l) + " + " + ((InterfaceC8396l) this.f26580l);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C1693l) this.f26581l) + " = " + ((InterfaceC2353l) this.f26580l) + ';';
            default:
                return super.toString();
        }
    }

    public void vip() {
        C13208l c13208l = (C13208l) this.f26580l;
        InterfaceC4725l interfaceC4725l = c13208l.appmetrica;
        if (interfaceC4725l == null || !interfaceC4725l.asBinder().isBinderAlive()) {
            return;
        }
        try {
            c13208l.appmetrica.mo444l(c13208l.crashlytics);
        } catch (RemoteException e) {
            AbstractC6427l.metrica("MCImplBase", "Error in sending flushCommandQueue", e);
        }
    }

    @Override // defpackage.InterfaceC15102l
    public void yandex(C14362l c14362l, int i) throws IOException {
        int[] iArr = (int[]) this.f26580l;
        try {
            c14362l.read((byte[]) this.f26581l, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            c14362l.close();
        }
    }

    public /* synthetic */ C13568l(Object obj, Object obj2, int i) {
        this.f26582l = i;
        this.f26581l = obj;
        this.f26580l = obj2;
    }

    public /* synthetic */ C13568l(Object obj) {
        this.f26582l = 7;
        this.f26581l = obj;
        this.f26580l = new ArrayList();
    }

    public C13568l(C17464l c17464l) {
        this.f26582l = 15;
        this.f26581l = c17464l;
        this.f26580l = new C18396l(c17464l);
    }

    public C13568l(Cfinally cfinally) {
        this.f26582l = 8;
        this.f26581l = cfinally;
        this.f26580l = new C12633l(0);
    }

    public C13568l(C10054l c10054l) {
        this.f26582l = 10;
        this.f26580l = c10054l;
    }

    public C13568l(int i) {
        this.f26582l = i;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            default:
                C0010l c0010l = AbstractC3483l.purchase;
                Float fValueOf = Float.valueOf(0.0f);
                this.f26580l = new C6570l(c0010l, fValueOf, (AbstractC2249l) c0010l.yandex.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
        }
    }

    public C13568l(Object obj, C13932l c13932l) {
        this.f26582l = 24;
        this.f26581l = c13932l;
        this.f26580l = obj;
    }

    public C13568l(C13161l c13161l) {
        this.f26582l = 21;
        this.f26581l = c13161l;
        this.f26580l = new Object();
    }

    public C13568l(C3859l c3859l) {
        this.f26582l = 19;
        this.f26581l = c3859l;
        this.f26580l = null;
    }

    public C13568l(Context context) {
        this.f26582l = 29;
        this.f26581l = context;
    }

    public C13568l(C13708l c13708l, int[] iArr) {
        this.f26582l = 6;
        this.f26581l = AbstractC1186l.Signature(c13708l);
        this.f26580l = iArr;
    }

    public C13568l(C10146l c10146l) {
        this.f26582l = 2;
        if (c10146l == null) {
            C6541l.subs("'privateKey' cannot be null");
            throw null;
        }
        this.f26581l = c10146l;
        this.f26580l = C13409l.crashlytics((C18493l) c10146l.f16541l);
    }

    public C13568l(C7251l c7251l) {
        this.f26582l = 22;
        this.f26580l = c7251l;
        this.f26581l = new C5257l(new byte[4], 4);
    }

    public C13568l(IBinder iBinder, Bundle bundle) {
        this.f26582l = 3;
        this.f26581l = new Messenger(iBinder);
        this.f26580l = bundle;
    }

    public C13568l(C13208l c13208l, Looper looper) {
        this.f26582l = 4;
        this.f26580l = c13208l;
        this.f26581l = new Handler(looper, new C6352l(1, this));
    }

    @Override // defpackage.InterfaceC13919l
    public void subs(C16391l c16391l, InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
    }
}
