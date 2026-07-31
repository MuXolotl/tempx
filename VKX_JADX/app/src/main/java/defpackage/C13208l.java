package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: lؚْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C13208l implements InterfaceC11345l {
    public C13708l Signature;
    public C16616l ad;
    public final SurfaceHolderCallbackC0719l admob;
    public PendingIntent ads;
    public C16616l advert;
    public final Context amazon;
    public InterfaceC4725l appmetrica;
    public final Bundle billing;
    public final BinderC11857l crashlytics;
    public final C10834l firebase;
    public MediaController inmobi;
    public final C13568l isPro;
    public C16616l isVip;
    public C13708l license;
    public final C13904l loadAd;
    public ServiceConnectionC5994l metrica;
    public final C13361l mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public long f25986package;
    public SurfaceHolder premium;
    public final C12962l purchase;
    public final Handler remoteconfig;
    public Surface signatures;
    public final SparseArray smaato;
    public boolean startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public Bundle f25987strictfp;
    public final C8961l subs;
    public AbstractC1186l subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C1908l f25988synchronized;
    public AbstractC1186l tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public long f25989throws;
    public C12962l vip;
    public final C16811l yandex;
    public C1908l adcel = C1908l.f4358synchronized;
    public C5989l applovin = C5989l.crashlytics;
    public C14023l pro = C14023l.loadAd;

    /* JADX WARN: Type inference failed for: r4v4, types: [lْٓۜ] */
    public C13208l(Context context, C16811l c16811l, C12962l c12962l, Bundle bundle, Looper looper) {
        C13708l c13708l = C13708l.f26763l;
        this.subscription = c13708l;
        this.tapsense = c13708l;
        this.Signature = c13708l;
        this.license = c13708l;
        C16616l c16616l = C16616l.loadAd;
        this.ad = c16616l;
        this.advert = c16616l;
        this.isVip = m3607l(c16616l, c16616l);
        this.subs = new C8961l(looper, C18527l.yandex, new C16262l(this, 10));
        this.remoteconfig = new Handler(looper);
        this.yandex = c16811l;
        AbstractC12442l.metrica(context, "context must not be null");
        AbstractC12442l.metrica(c12962l, "token must not be null");
        this.amazon = context;
        this.loadAd = new C13904l(4);
        this.crashlytics = new BinderC11857l(this);
        this.firebase = new C10834l(0);
        this.purchase = c12962l;
        this.billing = bundle;
        this.mopub = new IBinder.DeathRecipient() { // from class: lْٓۜ
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                C16811l c16811l2 = this.yandex.yandex;
                Objects.requireNonNull(c16811l2);
                c16811l2.m4197abstract(new RunnableC11297l(18, c16811l2));
            }
        };
        this.admob = new SurfaceHolderCallbackC0719l(this);
        this.f25987strictfp = Bundle.EMPTY;
        this.metrica = c12962l.yandex.yandex() == 0 ? null : new ServiceConnectionC5994l(this, bundle);
        this.isPro = new C13568l(this, looper);
        this.f25989throws = -9223372036854775807L;
        this.f25986package = -9223372036854775807L;
        this.smaato = new SparseArray();
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public static C13708l m3589l(List list, List list2, C14023l c14023l, C16616l c16616l, Bundle bundle) {
        if (list.isEmpty()) {
            list = C14869l.firebase(list2, c16616l, bundle);
        }
        return C14869l.mopub(list, c14023l, c16616l);
    }

    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public static C1908l m3590l(C1908l c1908l, int i, List list, long j, long j2) {
        int size;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        C9009l c9009l = c1908l.crashlytics;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i2 = 0; i2 < abstractC10759l.metrica(); i2++) {
            arrayList.add(abstractC10759l.remoteconfig(i2, new C4322l(), 0L));
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            C2427l c2427l = (C2427l) list.get(i3);
            C4322l c4322l = new C4322l();
            c4322l.loadAd(0, c2427l, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i3 + i, c4322l);
        }
        m3591l(abstractC10759l, arrayList, arrayList2);
        C8150l c8150lM3597l = m3597l(arrayList, arrayList2);
        if (c1908l.isPro.startapp()) {
            size = 0;
        } else {
            int i4 = c9009l.yandex.loadAd;
            size2 = i4 >= i ? list.size() + i4 : i4;
            int i5 = c9009l.yandex.purchase;
            size = i5 >= i ? list.size() + i5 : i5;
        }
        return m3592l(c1908l, c8150lM3597l, size2, size, j, j2, 5);
    }

    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
    public static void m3591l(AbstractC10759l abstractC10759l, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            C4322l c4322l = (C4322l) arrayList.get(i);
            int i2 = c4322l.vip;
            int i3 = c4322l.metrica;
            if (i2 == -1 || i3 == -1) {
                c4322l.vip = arrayList2.size();
                c4322l.metrica = arrayList2.size();
                C3904l c3904l = new C3904l();
                c3904l.subs(null, null, i, -9223372036854775807L, 0L, C12869l.billing, true);
                arrayList2.add(c3904l);
            } else {
                c4322l.vip = arrayList2.size();
                c4322l.metrica = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    C3904l c3904l2 = new C3904l();
                    abstractC10759l.billing(i2, c3904l2, false);
                    c3904l2.crashlytics = i;
                    arrayList2.add(c3904l2);
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
    public static C1908l m3592l(C1908l c1908l, C8150l c8150l, int i, int i2, long j, long j2, int i3) {
        C4322l c4322l = new C4322l();
        c8150l.remoteconfig(i, c4322l, 0L);
        C2427l c2427l = c4322l.crashlytics;
        C4262l c4262l = c1908l.crashlytics.yandex;
        C4262l c4262l2 = new C4262l(null, i, c2427l, null, i2, j, j2, c4262l.admob, c4262l.subs);
        C9009l c9009l = c1908l.crashlytics;
        return m3593l(c1908l, c8150l, c4262l2, new C9009l(c4262l2, c9009l.loadAd, SystemClock.elapsedRealtime(), c9009l.amazon, c9009l.purchase, c9009l.billing, c9009l.mopub, c9009l.admob, c9009l.subs, c9009l.isPro), i3);
    }

    /* JADX INFO: renamed from: lُٔۨ, reason: contains not printable characters */
    public static C1908l m3593l(C1908l c1908l, AbstractC10759l abstractC10759l, C4262l c4262l, C9009l c9009l, int i) {
        C9009l c9009l2;
        C4970l c4970l;
        C1047l c1047l;
        boolean z;
        C14723l c14723l = c1908l.yandex;
        int i2 = c1908l.loadAd;
        C9009l c9009l3 = c1908l.crashlytics;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z2 = c1908l.subs;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z3 = c1908l.Signature;
        boolean z4 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z5 = c1908l.ad;
        boolean z6 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l2 = c1908l.f4366throws;
        C4970l c4970l2 = c1908l.f4365package;
        C4262l c4262l2 = c9009l3.yandex;
        if (!abstractC10759l.startapp()) {
            c9009l2 = c9009l;
            c4970l = c4970l2;
            c1047l = c1047l2;
            if (c9009l2.yandex.loadAd >= abstractC10759l.metrica()) {
                z = false;
            }
            AbstractC12442l.subscription(z);
            return new C1908l(c14723l, i2, c9009l2, c4262l2, c4262l, i, c1372l, i3, z2, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z3, z4, i7, i8, i9, z5, z6, c3852l2, j, j2, j3, c1047l, c4970l);
        }
        c9009l2 = c9009l;
        c4970l = c4970l2;
        c1047l = c1047l2;
        z = true;
        AbstractC12442l.subscription(z);
        return new C1908l(c14723l, i2, c9009l2, c4262l2, c4262l, i, c1372l, i3, z2, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z3, z4, i7, i8, i9, z5, z6, c3852l2, j, j2, j3, c1047l, c4970l);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public static C13708l m3594l(List list, List list2, Bundle bundle, C14023l c14023l, C16616l c16616l, int i) {
        boolean z;
        if (!list2.isEmpty()) {
            return C14869l.mopub(list2, c14023l, c16616l);
        }
        boolean z2 = false;
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            z = false;
        } else {
            if (c16616l.yandex.yandex(6, 7)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            if (!c16616l.yandex.yandex(8, 9)) {
                z2 = true;
            }
        }
        return C14869l.isPro(list, z, z2, i);
    }

    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    public static C1908l m3595l(C1908l c1908l, int i, int i2, boolean z, long j, long j2) {
        int i3;
        int iYandex;
        int i4;
        C1908l c1908lM3592l;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        boolean z2 = c1908l.subs;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        for (int i6 = 0; i6 < abstractC10759l.metrica(); i6++) {
            if (i6 < i || i6 >= i2) {
                arrayList.add(abstractC10759l.remoteconfig(i6, new C4322l(), 0L));
            }
        }
        m3591l(abstractC10759l, arrayList, arrayList2);
        C8150l c8150lM3597l = m3597l(arrayList, arrayList2);
        C4262l c4262l = c1908l.crashlytics.yandex;
        int i7 = c4262l.loadAd;
        int i8 = c4262l.purchase;
        C4322l c4322l = new C4322l();
        boolean z3 = i7 >= i && i7 < i2;
        if (c8150lM3597l.startapp()) {
            i8 = 0;
            iYandex = -1;
            i3 = 1;
        } else {
            if (z3) {
                int i9 = c1908l.admob;
                int iMetrica = abstractC10759l.metrica();
                iYandex = i7;
                i3 = 1;
                while (true) {
                    if (i5 < iMetrica) {
                        iYandex = abstractC10759l.purchase(iYandex, i9, z2);
                        if (iYandex != -1) {
                            if (iYandex < i || iYandex >= i2) {
                                break;
                            }
                            i5++;
                        }
                    }
                    iYandex = -1;
                    break;
                }
                if (iYandex == -1) {
                    iYandex = c8150lM3597l.yandex(z2);
                } else if (iYandex >= i2) {
                    iYandex -= i2 - i;
                }
                c8150lM3597l.remoteconfig(iYandex, c4322l, 0L);
                i4 = c4322l.vip;
            } else {
                i3 = 1;
                if (i7 >= i2) {
                    iYandex = i7 - (i2 - i);
                    if (i8 != -1) {
                        for (int i10 = i; i10 < i2; i10++) {
                            C4322l c4322l2 = new C4322l();
                            abstractC10759l.vip(i10, c4322l2);
                            i8 -= (c4322l2.metrica - c4322l2.vip) + 1;
                        }
                    }
                    i4 = i8;
                } else {
                    iYandex = i7;
                }
            }
            i8 = i4;
        }
        if (!z3) {
            c1908lM3592l = m3592l(c1908l, c8150lM3597l, iYandex, i8, j, j2, 4);
        } else if (iYandex == -1) {
            c1908lM3592l = m3593l(c1908l, c8150lM3597l, C9009l.firebase, C9009l.smaato, 4);
        } else if (z) {
            c1908lM3592l = m3592l(c1908l, c8150lM3597l, iYandex, i8, j, j2, 4);
        } else {
            int i11 = iYandex;
            C4322l c4322l3 = new C4322l();
            c8150lM3597l.remoteconfig(i11, c4322l3, 0L);
            long jM3986try = AbstractC15323l.m3986try(c4322l3.smaato);
            long jM3986try2 = AbstractC15323l.m3986try(c4322l3.remoteconfig);
            C4262l c4262l2 = new C4262l(null, i11, c4322l3.crashlytics, null, i8, jM3986try, jM3986try, -1, -1);
            c1908lM3592l = m3593l(c1908l, c8150lM3597l, c4262l2, new C9009l(c4262l2, false, SystemClock.elapsedRealtime(), jM3986try2, jM3986try, AbstractC8672l.loadAd(jM3986try, jM3986try2), 0L, -9223372036854775807L, jM3986try2, jM3986try), 4);
        }
        int i12 = c1908lM3592l.signatures;
        return (i12 == i3 || i12 == 4 || i >= i2 || i2 != abstractC10759l.metrica() || i7 < i) ? c1908lM3592l : c1908lM3592l.billing(4, null);
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public static int m3596l(C1908l c1908l) {
        return c1908l.crashlytics.yandex.loadAd;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static C8150l m3597l(ArrayList arrayList, ArrayList arrayList2) {
        C16971l c16971l = new C16971l(4);
        c16971l.amazon(arrayList);
        C13708l c13708lMopub = c16971l.mopub();
        C16971l c16971l2 = new C16971l(4);
        c16971l2.amazon(arrayList2);
        C13708l c13708lMopub2 = c16971l2.mopub();
        int size = arrayList.size();
        C2494l c2494l = AbstractC8672l.yandex;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new C8150l(c13708lMopub, c13708lMopub2, iArr);
    }

    @Override // defpackage.InterfaceC11345l
    public final void Signature(InterfaceC13521l interfaceC13521l) {
        this.subs.yandex(interfaceC13521l);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m3598abstract() {
        SurfaceHolder surfaceHolder = this.premium;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.admob);
            this.premium = null;
        }
        if (this.signatures != null) {
            this.signatures = null;
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final int ad() {
        return this.adcel.crashlytics.yandex.purchase;
    }

    @Override // defpackage.InterfaceC11345l
    public final void adcel() {
        if (m3615l(20)) {
            m3619l(new C16262l(this, 6));
            m3613l(0, Alert.DURATION_SHOW_INDEFINITELY);
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final int admob() {
        return this.adcel.tapsense;
    }

    @Override // defpackage.InterfaceC11345l
    public final void ads(boolean z) {
        if (m3615l(14)) {
            m3619l(new C15502l(this, z, 1));
            C1908l c1908l = this.adcel;
            if (c1908l.subs != z) {
                this.adcel = c1908l.firebase(z);
                C7603l c7603l = new C7603l(z, 3);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(9, c7603l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final C15074l advert() {
        return this.adcel.smaato;
    }

    @Override // defpackage.InterfaceC11345l
    public final boolean amazon() {
        return this.adcel.advert;
    }

    @Override // defpackage.InterfaceC11345l
    public final C13736l applovin() {
        return this.adcel.adcel;
    }

    @Override // defpackage.InterfaceC11345l
    public final void appmetrica(int i, boolean z) {
        if (m3615l(34)) {
            m3619l(new C10194l(this, z, i));
            C1908l c1908l = this.adcel;
            if (c1908l.Signature != z) {
                this.adcel = c1908l.crashlytics(c1908l.tapsense, z);
                C15502l c15502l = new C15502l(this, z, 0);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(30, c15502l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final C1372l billing() {
        return this.adcel.mopub;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: break */
    public final void mo291break(C13736l c13736l, boolean z) {
        if (m3615l(35)) {
            m3619l(new C17221l(this, c13736l, z));
            if (this.adcel.adcel.equals(c13736l)) {
                return;
            }
            this.adcel = this.adcel.yandex(c13736l);
            C2741l c2741l = new C2741l(c13736l, 1);
            C8961l c8961l = this.subs;
            c8961l.crashlytics(20, c2741l);
            c8961l.loadAd();
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: case */
    public final void mo292case() {
        if (m3615l(7)) {
            m3619l(new C16262l(this, 4));
            AbstractC10759l abstractC10759l = this.adcel.isPro;
            if (abstractC10759l.startapp() || subs()) {
                return;
            }
            boolean z = license() != -1;
            C4322l c4322lRemoteconfig = abstractC10759l.remoteconfig(m3596l(this.adcel), new C4322l(), 0L);
            if (c4322lRemoteconfig.subs && c4322lRemoteconfig.yandex()) {
                if (z) {
                    m3612l(license(), -9223372036854775807L);
                }
            } else if (!z || mo317l() > this.adcel.inmobi) {
                m3612l(m3596l(this.adcel), 0L);
            } else {
                m3612l(license(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: catch */
    public final void mo293catch(SurfaceHolder surfaceHolder) {
        if (m3615l(27)) {
            if (surfaceHolder == null) {
                if (m3615l(27)) {
                    m3598abstract();
                    m3605l(null, 0, 0);
                    m3604l(0, 0);
                    return;
                }
                return;
            }
            if (this.premium == surfaceHolder) {
                return;
            }
            m3598abstract();
            this.premium = surfaceHolder;
            surfaceHolder.addCallback(this.admob);
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                this.signatures = null;
                m3605l(null, 0, 0);
                m3604l(0, 0);
            } else {
                this.signatures = surface;
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                m3605l(surface, surfaceFrame.width(), surfaceFrame.height());
                m3604l(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: class */
    public final void mo294class(int i) {
        if (m3615l(10)) {
            AbstractC12442l.admob(i >= 0);
            m3619l(new C14311l(this, i, 1));
            m3612l(i, -9223372036854775807L);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: const */
    public final void mo295const(int i) {
        if (m3615l(15)) {
            m3619l(new C14311l(this, i, 6));
            C1908l c1908l = this.adcel;
            if (c1908l.admob != i) {
                this.adcel = c1908l.subs(i);
                C10503l c10503l = new C10503l(i, 2);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(8, c10503l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: continue */
    public final void mo296continue(boolean z) {
        if (m3615l(1)) {
            m3619l(new C15502l(this, z, 4));
            m3600l(z);
        } else if (z) {
            AbstractC6427l.vip("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final void crashlytics(float f) {
        if (m3615l(13)) {
            int i = 0;
            m3619l(new C8304l(this, f, i));
            C1372l c1372l = this.adcel.mopub;
            if (c1372l.yandex != f) {
                C1372l c1372l2 = new C1372l(f, c1372l.loadAd);
                this.adcel = this.adcel.purchase(c1372l2);
                C4404l c4404l = new C4404l(c1372l2, i);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(12, c4404l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: default */
    public final void mo297default(int i, List list) {
        if (m3615l(20)) {
            AbstractC12442l.admob(i >= 0);
            m3619l(new C0743l(this, i, list));
            remoteconfig(i, list);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: else */
    public final void mo298else(float f) {
        if (m3615l(24)) {
            m3619l(new C8304l(this, f, 1));
            C1908l c1908l = this.adcel;
            if (c1908l.vip != f) {
                this.adcel = c1908l.startapp(f);
                C4605l c4605l = new C4605l(1, f);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(22, c4605l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: extends */
    public final void mo299extends(int i) {
        if (m3615l(20)) {
            AbstractC12442l.admob(i >= 0);
            m3619l(new C14311l(this, i, 2));
            m3613l(i, i + 1);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: final */
    public final void mo300final() {
        if (m3615l(24)) {
            float f = this.adcel.metrica;
            m3619l(new C8304l(this, f, 2));
            C1908l c1908l = this.adcel;
            float f2 = c1908l.vip;
            if (f2 == c1908l.metrica || f2 != 0.0f) {
                return;
            }
            this.adcel = c1908l.startapp(f);
            C4605l c4605l = new C4605l(2, f);
            C8961l c8961l = this.subs;
            c8961l.crashlytics(22, c4605l);
            c8961l.loadAd();
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: finally */
    public final boolean mo301finally() {
        return this.adcel.ad;
    }

    @Override // defpackage.InterfaceC11345l
    public final long firebase() {
        return this.adcel.crashlytics.mopub;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: for */
    public final void mo302for(long j) {
        if (m3615l(5)) {
            m3619l(new C9435l(j, this));
            m3612l(m3596l(this.adcel), j);
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final long getDuration() {
        return this.adcel.crashlytics.amazon;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: goto */
    public final void mo303goto() {
        if (m3615l(8)) {
            m3619l(new C16262l(this, 16));
            if (mo362try() != -1) {
                m3612l(mo362try(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: implements */
    public final int mo304implements() {
        return m3596l(this.adcel);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: import */
    public final C1047l mo305import() {
        return this.adcel.f4366throws;
    }

    @Override // defpackage.InterfaceC11345l
    public final C2848l inmobi() {
        return this.adcel.subscription;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: instanceof */
    public final boolean mo306instanceof() {
        return mo362try() != -1;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: interface */
    public final long mo307interface() {
        return this.adcel.appmetrica;
    }

    @Override // defpackage.InterfaceC11345l
    public final long isPro() {
        return this.adcel.crashlytics.admob;
    }

    @Override // defpackage.InterfaceC11345l
    public final void isVip() {
        if (m3615l(6)) {
            m3619l(new C16262l(this, 5));
            if (license() != -1) {
                m3612l(license(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final int license() {
        if (this.adcel.isPro.startapp()) {
            return -1;
        }
        C1908l c1908l = this.adcel;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int iM3596l = m3596l(c1908l);
        C1908l c1908l2 = this.adcel;
        int i = c1908l2.admob;
        if (i == 1) {
            i = 0;
        }
        return abstractC10759l.firebase(iM3596l, i, c1908l2.subs);
    }

    @Override // defpackage.InterfaceC11345l
    public final void loadAd(C1372l c1372l) {
        if (m3615l(13)) {
            m3619l(new C5131l(this, c1372l, 24));
            if (this.adcel.mopub.equals(c1372l)) {
                return;
            }
            this.adcel = this.adcel.purchase(c1372l);
            C4404l c4404l = new C4404l(c1372l, 1);
            C8961l c8961l = this.subs;
            c8961l.crashlytics(12, c4404l);
            c8961l.loadAd();
        }
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void m3599l(InterfaceC11724l interfaceC11724l) {
        C13568l c13568l = this.isPro;
        Handler handler = (Handler) c13568l.f26581l;
        if (((C13208l) c13568l.f26580l).appmetrica != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        ListenableFuture listenableFutureM3609l = m3609l(this.appmetrica, interfaceC11724l, true);
        try {
            AbstractC18585l.license(listenableFutureM3609l);
        } catch (ExecutionException e) {
            C11983l.ads(e);
        } catch (TimeoutException e2) {
            if (listenableFutureM3609l instanceof C14784l) {
                int i = ((C14784l) listenableFutureM3609l).f28905l;
                this.firebase.remove(Integer.valueOf(i));
                this.loadAd.firebase(i, new C5159l(-1));
            }
            AbstractC6427l.metrica("MCImplBase", "Synchronous command takes too long on the session side.", e2);
        }
    }

    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public final void m3600l(boolean z) {
        C1908l c1908l = this.adcel;
        int i = c1908l.isVip;
        int i2 = i == 1 ? 0 : i;
        if (c1908l.license == z && i == i2) {
            return;
        }
        this.f25989throws = AbstractC8672l.crashlytics(c1908l, this.f25989throws, this.f25986package, this.yandex.f32841l);
        this.f25986package = SystemClock.elapsedRealtime();
        m3606l(this.adcel.amazon(1, i2, z), null, 1, null, null);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final void mo309l() {
        if (m3615l(24)) {
            m3619l(new C16262l(this, 15));
            C1908l c1908l = this.adcel;
            if (c1908l.vip != 0.0f) {
                this.adcel = c1908l.startapp(0.0f);
                C4875l c4875l = new C4875l(18);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(22, c4875l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final C4970l mo310l() {
        return this.adcel.f4365package;
    }

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public final void m3601l(int i, ListenableFuture listenableFuture) {
        listenableFuture.yandex(new RunnableC2027l(this, listenableFuture, i, 6), EnumC1535l.f3808l);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final void mo311l(C2427l c2427l) {
        if (m3615l(31)) {
            m3619l(new C9661l(this, c2427l, 0));
            m3614l(Collections.singletonList(c2427l), -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final C14023l mo312l() {
        return this.pro;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final void mo313l(List list) {
        if (m3615l(20)) {
            m3619l(new C8656l(this, list, 1));
            remoteconfig(this.adcel.isPro.metrica(), list);
        }
    }

    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public final void m3602l(int i, int i2, int i3) {
        int i4;
        int i5;
        AbstractC10759l abstractC10759l = this.adcel.isPro;
        int iMetrica = abstractC10759l.metrica();
        int iMin = Math.min(i2, iMetrica);
        int i6 = iMin - i;
        int iMin2 = Math.min(i3, iMetrica - i6);
        if (i >= iMetrica || i == iMin || i == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < iMetrica; i7++) {
            arrayList.add(abstractC10759l.remoteconfig(i7, new C4322l(), 0L));
        }
        AbstractC15323l.m3981switch(arrayList, i, iMin, iMin2);
        m3591l(abstractC10759l, arrayList, arrayList2);
        C8150l c8150lM3597l = m3597l(arrayList, arrayList2);
        if (c8150lM3597l.startapp()) {
            return;
        }
        int iM3596l = m3596l(this.adcel);
        if (iM3596l >= i && iM3596l < iMin) {
            i5 = (iM3596l - i) + iMin2;
        } else {
            if (iMin > iM3596l || iMin2 <= iM3596l) {
                if (iMin <= iM3596l || iMin2 > iM3596l) {
                    i4 = iM3596l;
                } else {
                    i5 = iM3596l + i6;
                }
                C4322l c4322l = new C4322l();
                int i8 = this.adcel.crashlytics.yandex.purchase - abstractC10759l.remoteconfig(iM3596l, c4322l, 0L).vip;
                c8150lM3597l.remoteconfig(i4, c4322l, 0L);
                m3606l(m3592l(this.adcel, c8150lM3597l, i4, c4322l.vip + i8, mo317l(), mo353static(), 5), 0, null, null, null);
            }
            i5 = iM3596l - i6;
        }
        i4 = i5;
        C4322l c4322l2 = new C4322l();
        int i9 = this.adcel.crashlytics.yandex.purchase - abstractC10759l.remoteconfig(iM3596l, c4322l2, 0L).vip;
        c8150lM3597l.remoteconfig(i4, c4322l2, 0L);
        m3606l(m3592l(this.adcel, c8150lM3597l, i4, c4322l2.vip + i9, mo317l(), mo353static(), 5), 0, null, null, null);
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public final void m3603l(int i, int i2, List list) {
        int iMetrica = this.adcel.isPro.metrica();
        if (i > iMetrica) {
            return;
        }
        if (this.adcel.isPro.startapp()) {
            m3614l(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i2, iMetrica);
        C1908l c1908lM3595l = m3595l(m3590l(this.adcel, iMin, list, mo317l(), mo353static()), i, iMin, true, mo317l(), mo353static());
        int i3 = this.adcel.crashlytics.yandex.loadAd;
        boolean z = i3 >= i && i3 < iMin;
        m3606l(c1908lM3595l, 0, null, z ? 4 : null, z ? 3 : null);
    }

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public final void m3604l(int i, int i2) {
        C5989l c5989l = this.applovin;
        if (c5989l.yandex == i && c5989l.loadAd == i2) {
            return;
        }
        this.applovin = new C5989l(i, i2);
        this.subs.mopub(24, new C12153l(i, i2, 1));
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؙؔؑ */
    public final void mo314l(List list) {
        if (m3615l(20)) {
            m3619l(new C8656l(this, list, 0));
            m3614l(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final int mo315l() {
        return this.adcel.isVip;
    }

    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    public final void m3605l(Surface surface, int i, int i2) {
        if (mo319l()) {
            if (m3611l() >= 8) {
                m3599l(new C11118l(this, surface, i, i2, 1));
            } else {
                m3599l(new C5131l(this, surface, 21));
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public final ListenableFuture mo316l(String str, C1673l c1673l) {
        return m3618l(40010, null, new C17706l(this, str, c1673l, 7));
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lّؗؑ */
    public final long mo317l() {
        long jCrashlytics = AbstractC8672l.crashlytics(this.adcel, this.f25989throws, this.f25986package, this.yandex.f32841l);
        this.f25989throws = jCrashlytics;
        return jCrashlytics;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؗۨؑ */
    public final void mo318l() {
        InterfaceC4725l interfaceC4725l;
        C12962l c12962l = this.purchase;
        InterfaceC5259l interfaceC5259l = c12962l.yandex;
        InterfaceC5259l interfaceC5259l2 = c12962l.yandex;
        int iYandex = interfaceC5259l.yandex();
        C16811l c16811l = this.yandex;
        Context context = this.amazon;
        Bundle bundle = this.billing;
        if (iYandex == 0) {
            this.metrica = null;
            Object objAmazon = interfaceC5259l2.amazon();
            objAmazon.getClass();
            IBinder iBinder = (IBinder) objAmazon;
            int i = BinderC4841l.smaato;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4725l)) {
                C0337l c0337l = new C0337l();
                c0337l.purchase = iBinder;
                interfaceC4725l = c0337l;
            } else {
                interfaceC4725l = (InterfaceC4725l) iInterfaceQueryLocalInterface;
            }
            int iBilling = this.loadAd.billing();
            String packageName = context.getPackageName();
            int iMyPid = Process.myPid();
            c16811l.getClass();
            try {
                interfaceC4725l.mo443l(this.crashlytics, iBilling, new C0176l(packageName, iMyPid, bundle).loadAd());
                return;
            } catch (RemoteException e) {
                AbstractC6427l.metrica("MCImplBase", "Failed to call connection request.", e);
            }
        } else {
            this.metrica = new ServiceConnectionC5994l(this, bundle);
            int i2 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(interfaceC5259l2.mopub(), interfaceC5259l2.getServiceName());
            try {
                if (context.bindService(intent, this.metrica, i2)) {
                    return;
                }
                AbstractC6427l.vip("MCImplBase", "bind to " + c12962l + " failed");
            } catch (SecurityException e2) {
                AbstractC6427l.metrica("MCImplBase", "bind to " + c12962l + " not allowed", e2);
            }
        }
        Objects.requireNonNull(c16811l);
        c16811l.m4197abstract(new RunnableC11297l(18, c16811l));
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٍؘؘ */
    public final boolean mo319l() {
        return this.appmetrica != null;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؘِٞ */
    public final void mo320l(int i) {
        if (m3615l(25)) {
            m3619l(new C14311l(this, i, 7));
            C1908l c1908l = this.adcel;
            C2848l c2848l = c1908l.subscription;
            if (c1908l.tapsense == i || c2848l.loadAd > i) {
                return;
            }
            int i2 = c2848l.crashlytics;
            if (i2 == 0 || i <= i2) {
                this.adcel = c1908l.crashlytics(i, c1908l.Signature);
                C14311l c14311l = new C14311l(this, i, 9);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(30, c14311l);
                c8961l.loadAd();
            }
        }
    }

    /* JADX INFO: renamed from: lؘٞۨ, reason: contains not printable characters */
    public final void m3606l(C1908l c1908l, Integer num, Integer num2, Integer num3, Integer num4) {
        C1908l c1908l2 = this.adcel;
        this.adcel = c1908l;
        m3608l(c1908l2, c1908l, num, num2, num3, num4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r7.yandex.yandex(25, 33, 26, 34) == false) goto L11;
     */
    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C16616l m3607l(defpackage.C16616l r7, defpackage.C16616l r8) {
        /*
            r6 = this;
            lٖۚؗ r7 = defpackage.AbstractC8672l.amazon(r7, r8)
            lٖؓ٘ r6 = r6.adcel
            lؔۗۛ r6 = r6.subscription
            int r6 = r6.yandex
            if (r6 != 0) goto Le
            r6 = 1
            goto Lf
        Le:
            r6 = 0
        Lf:
            r8 = 32
            boolean r0 = r7.yandex(r8)
            r1 = 34
            r2 = 26
            r3 = 33
            r4 = 25
            if (r0 == 0) goto L2e
            if (r6 == 0) goto L2d
            int[] r0 = new int[]{r4, r3, r2, r1}
            lْؖۨ r5 = r7.yandex
            boolean r0 = r5.yandex(r0)
            if (r0 != 0) goto L2e
        L2d:
            return r7
        L2e:
            lؘُؕ r0 = new lؘُؕ
            r0.<init>(r7)
            java.lang.Object r7 = r0.f7072l
            lؙۨ٘ r7 = (defpackage.C6921l) r7
            r7.loadAd(r8)
            r0.ads(r4, r6)
            r0.ads(r3, r6)
            r0.ads(r2, r6)
            r0.ads(r1, r6)
            lٖۚؗ r6 = new lٖۚؗ
            lْؖۨ r7 = r7.purchase()
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13208l.m3607l(lٖۚؗ, lٖۚؗ):lٖۚؗ");
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final void mo321l() {
        if (m3615l(11)) {
            m3619l(new C16262l(this, 7));
            m3616l(-this.adcel.applovin);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؙ۟ٙ */
    public final C3852l mo322l() {
        return this.adcel.premium;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final long mo323l() {
        return this.adcel.applovin;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo324l(C2427l c2427l) {
        if (m3615l(31)) {
            m3619l(new C9661l(this, c2427l, 1));
            m3614l(Collections.singletonList(c2427l), -1, -9223372036854775807L, true);
        }
    }

    /* JADX INFO: renamed from: lًَٙ, reason: contains not printable characters */
    public final void m3608l(C1908l c1908l, final C1908l c1908l2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        final int i = 0;
        C8961l c8961l = this.subs;
        if (num != null) {
            c8961l.crashlytics(0, new InterfaceC16975l() { // from class: lَؙؚ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i2 = i;
                    Integer num5 = num;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i2) {
                        case 0:
                            interfaceC13521l.mo2745volatile(c1908l3.isPro, num5.intValue());
                            break;
                        case 1:
                            interfaceC13521l.firebase(c1908l3.amazon, c1908l3.purchase, num5.intValue());
                            break;
                        default:
                            interfaceC13521l.startapp(num5.intValue(), c1908l3.license);
                            break;
                    }
                }
            });
        }
        final int i2 = 11;
        final int i3 = 1;
        if (num3 != null) {
            c8961l.crashlytics(11, new InterfaceC16975l() { // from class: lَؙؚ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i4 = i3;
                    Integer num5 = num3;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i4) {
                        case 0:
                            interfaceC13521l.mo2745volatile(c1908l3.isPro, num5.intValue());
                            break;
                        case 1:
                            interfaceC13521l.firebase(c1908l3.amazon, c1908l3.purchase, num5.intValue());
                            break;
                        default:
                            interfaceC13521l.startapp(num5.intValue(), c1908l3.license);
                            break;
                    }
                }
            });
        }
        C2427l c2427lSubscription = c1908l2.subscription();
        int i4 = 25;
        if (num4 != null) {
            c8961l.crashlytics(1, new C5131l(c2427lSubscription, num4, i4));
        }
        C14723l c14723l = c1908l.yandex;
        C14723l c14723l2 = c1908l2.yandex;
        final int i5 = 10;
        if (c14723l != c14723l2 && (c14723l == null || !c14723l.yandex(c14723l2))) {
            c8961l.crashlytics(10, new C17617l(0, c14723l2));
            if (c14723l2 != null) {
                c8961l.crashlytics(10, new C17617l(1, c14723l2));
            }
        }
        final int i6 = 18;
        final int i7 = 2;
        if (!c1908l.f4366throws.equals(c1908l2.f4366throws)) {
            c8961l.crashlytics(2, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i8 = i6;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i8) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i8 = 19;
        if (!c1908l.premium.equals(c1908l2.premium)) {
            c8961l.crashlytics(14, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i9 = i8;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i9) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i9 = 20;
        final int i10 = 3;
        if (c1908l.advert != c1908l2.advert) {
            c8961l.crashlytics(3, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i11 = i9;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i11) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i11 = 21;
        final int i12 = 4;
        if (c1908l.signatures != c1908l2.signatures) {
            c8961l.crashlytics(4, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i13 = i11;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i13) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i13 = 5;
        if (num2 != null) {
            c8961l.crashlytics(5, new InterfaceC16975l() { // from class: lَؙؚ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i14 = i7;
                    Integer num5 = num2;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i14) {
                        case 0:
                            interfaceC13521l.mo2745volatile(c1908l3.isPro, num5.intValue());
                            break;
                        case 1:
                            interfaceC13521l.firebase(c1908l3.amazon, c1908l3.purchase, num5.intValue());
                            break;
                        default:
                            interfaceC13521l.startapp(num5.intValue(), c1908l3.license);
                            break;
                    }
                }
            });
        }
        final int i14 = 6;
        if (c1908l.isVip != c1908l2.isVip) {
            c8961l.crashlytics(6, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i15 = i;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i15) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i15 = 7;
        if (c1908l.ad != c1908l2.ad) {
            c8961l.crashlytics(7, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i16 = i3;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i16) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i16 = 12;
        if (!c1908l.mopub.equals(c1908l2.mopub)) {
            c8961l.crashlytics(12, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i17 = i7;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i17) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i17 = 8;
        if (c1908l.admob != c1908l2.admob) {
            c8961l.crashlytics(8, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i18 = i10;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i18) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i18 = 9;
        if (c1908l.subs != c1908l2.subs) {
            c8961l.crashlytics(9, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i19 = i12;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i19) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i19 = 15;
        if (!c1908l.remoteconfig.equals(c1908l2.remoteconfig)) {
            c8961l.crashlytics(15, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i13;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        if (c1908l.vip != c1908l2.vip) {
            c8961l.crashlytics(22, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i14;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        if (!c1908l.adcel.equals(c1908l2.adcel)) {
            c8961l.crashlytics(20, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i15;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        if (c1908l.startapp != c1908l2.startapp) {
            c8961l.crashlytics(21, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i17;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        if (!c1908l.ads.yandex.equals(c1908l2.ads.yandex)) {
            c8961l.crashlytics(27, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i18;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
            c8961l.crashlytics(27, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i5;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        if (!c1908l.subscription.equals(c1908l2.subscription)) {
            c8961l.crashlytics(29, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i2;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        if (c1908l.tapsense != c1908l2.tapsense || c1908l.Signature != c1908l2.Signature) {
            c8961l.crashlytics(30, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i16;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        if (!c1908l.smaato.equals(c1908l2.smaato)) {
            final int i20 = 13;
            c8961l.crashlytics(25, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i20;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i21 = 16;
        if (c1908l.applovin != c1908l2.applovin) {
            final int i22 = 14;
            c8961l.crashlytics(16, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i22;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        final int i23 = 17;
        if (c1908l.appmetrica != c1908l2.appmetrica) {
            c8961l.crashlytics(17, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i19;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        if (c1908l.inmobi != c1908l2.inmobi) {
            c8961l.crashlytics(18, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i21;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        if (!c1908l.f4365package.equals(c1908l2.f4365package)) {
            c8961l.crashlytics(19, new InterfaceC16975l() { // from class: lؗۧؗ
                @Override // defpackage.InterfaceC16975l
                public final void invoke(Object obj) {
                    int i110 = i23;
                    C1908l c1908l3 = c1908l2;
                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                    switch (i110) {
                        case 0:
                            interfaceC13521l.mopub(c1908l3.isVip);
                            break;
                        case 1:
                            interfaceC13521l.mo2737interface(c1908l3.ad);
                            break;
                        case 2:
                            interfaceC13521l.mo2732catch(c1908l3.mopub);
                            break;
                        case 3:
                            interfaceC13521l.subs(c1908l3.admob);
                            break;
                        case 4:
                            interfaceC13521l.pro(c1908l3.subs);
                            break;
                        case 5:
                            interfaceC13521l.mo2743synchronized(c1908l3.remoteconfig);
                            break;
                        case 6:
                            interfaceC13521l.adcel(c1908l3.vip);
                            break;
                        case 7:
                            interfaceC13521l.smaato(c1908l3.adcel);
                            break;
                        case 8:
                            interfaceC13521l.tapsense(c1908l3.startapp);
                            break;
                        case 9:
                            interfaceC13521l.mo2735extends(c1908l3.ads.yandex);
                            break;
                        case 10:
                            interfaceC13521l.advert(c1908l3.ads);
                            break;
                        case 11:
                            interfaceC13521l.mo2731case(c1908l3.subscription);
                            break;
                        case 12:
                            interfaceC13521l.inmobi(c1908l3.tapsense, c1908l3.Signature);
                            break;
                        case 13:
                            interfaceC13521l.billing(c1908l3.smaato);
                            break;
                        case 14:
                            interfaceC13521l.mo2744throws(c1908l3.applovin);
                            break;
                        case 15:
                            interfaceC13521l.mo2741strictfp(c1908l3.appmetrica);
                            break;
                        case 16:
                            interfaceC13521l.mo2742switch(c1908l3.inmobi);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC13521l.remoteconfig(c1908l3.f4365package);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC13521l.premium(c1908l3.f4366throws);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC13521l.mo2739package(c1908l3.premium);
                            break;
                        case 20:
                            interfaceC13521l.vip(c1908l3.advert);
                            break;
                        default:
                            interfaceC13521l.Signature(c1908l3.signatures);
                            break;
                    }
                }
            });
        }
        c8961l.loadAd();
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo325l(int i, C2427l c2427l) {
        if (m3615l(20)) {
            int i2 = 1;
            AbstractC12442l.admob(i >= 0);
            m3619l(new C4109l(this, i, c2427l, i2));
            remoteconfig(i, Collections.singletonList(c2427l));
        }
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final ListenableFuture m3609l(InterfaceC4725l interfaceC4725l, InterfaceC11724l interfaceC11724l, boolean z) {
        MediaController mediaController;
        if (interfaceC4725l == null) {
            return AbstractC7151l.purchase(new C5159l(-4));
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.inmobi) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        C5159l c5159l = new C5159l(1);
        C13904l c13904l = this.loadAd;
        C14784l c14784lCrashlytics = c13904l.crashlytics(c5159l);
        int i = c14784lCrashlytics.f28905l;
        C10834l c10834l = this.firebase;
        if (z) {
            if (c10834l.isEmpty()) {
                this.f25988synchronized = this.adcel;
            }
            c10834l.add(Integer.valueOf(i));
        }
        try {
            interfaceC11724l.billing(interfaceC4725l, i);
            return c14784lCrashlytics;
        } catch (RemoteException e) {
            AbstractC6427l.metrica("MCImplBase", "Cannot connect to the service or the session is gone", e);
            c10834l.remove(Integer.valueOf(i));
            c13904l.firebase(i, new C5159l(-100));
            return c14784lCrashlytics;
        }
    }

    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public final void m3610l(C1908l c1908l, C3508l c3508l) {
        C1908l c1908l2;
        C3508l c3508l2;
        if (mo319l()) {
            boolean z = m3611l() < 6;
            C1908l c1908l3 = this.f25988synchronized;
            if (c1908l3 != null) {
                C16616l c16616l = this.isVip;
                C12962l c12962l = this.vip;
                c12962l.getClass();
                this.f25988synchronized = AbstractC8672l.purchase(c1908l3, c1908l, c3508l, c16616l, z, c12962l);
                if (!this.firebase.isEmpty()) {
                    return;
                }
                C1908l c1908l4 = this.f25988synchronized;
                C3508l c3508l3 = C3508l.crashlytics;
                this.f25988synchronized = null;
                c1908l2 = c1908l4;
                c3508l2 = c3508l3;
            } else {
                c1908l2 = c1908l;
                c3508l2 = c3508l;
            }
            C1908l c1908l5 = this.adcel;
            C16616l c16616l2 = this.isVip;
            C12962l c12962l2 = this.vip;
            c12962l2.getClass();
            C1908l c1908lPurchase = AbstractC8672l.purchase(c1908l5, c1908l2, c3508l2, c16616l2, z, c12962l2);
            this.adcel = c1908lPurchase;
            C4262l c4262l = c1908l5.amazon;
            C4262l c4262l2 = c1908l5.purchase;
            Integer numValueOf = (c4262l.equals(c1908l2.amazon) && c4262l2.equals(c1908l2.purchase)) ? null : Integer.valueOf(c1908lPurchase.billing);
            C2427l c2427lSubscription = c1908l5.subscription();
            C2427l c2427lSubscription2 = c1908lPurchase.subscription();
            C4262l c4262l3 = c1908lPurchase.purchase;
            boolean zEquals = Objects.equals(c2427lSubscription, c2427lSubscription2);
            Integer numValueOf2 = !zEquals ? Integer.valueOf(c1908lPurchase.loadAd) : null;
            if (zEquals && numValueOf != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 1)) {
                if (c4262l2.loadAd != c4262l3.loadAd) {
                    numValueOf2 = Integer.valueOf(numValueOf.intValue() != 0 ? 2 : 1);
                } else if (c1908l5.admob != 0 && numValueOf.intValue() == 0 && c1908l5.amazon.admob == -1 && c4262l3.admob == -1) {
                    numValueOf2 = 0;
                }
            }
            Integer numValueOf3 = !c1908l5.isPro.equals(c1908lPurchase.isPro) ? Integer.valueOf(c1908lPurchase.firebase) : null;
            int i = c1908l5.pro;
            int i2 = c1908lPurchase.pro;
            m3608l(c1908l5, c1908lPurchase, numValueOf3, (i == i2 && c1908l5.license == c1908lPurchase.license) ? null : Integer.valueOf(i2), numValueOf, numValueOf2);
        }
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public final int m3611l() {
        C12962l c12962l = this.vip;
        c12962l.getClass();
        return c12962l.yandex.billing();
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public final void m3612l(int i, long j) {
        int i2;
        int i3;
        C1908l c1908lM3593l;
        AbstractC10759l abstractC10759l = this.adcel.isPro;
        if ((abstractC10759l.startapp() || i < abstractC10759l.metrica()) && !subs()) {
            C1908l c1908l = this.adcel;
            C1908l c1908lBilling = c1908l.billing(c1908l.signatures == 1 ? 1 : 2, c1908l.yandex);
            C8128l c8128lM3617l = m3617l(abstractC10759l, i, j);
            if (c8128lM3617l == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                C4262l c4262l = new C4262l(null, i, null, null, i, j3, j2, -1, -1);
                C1908l c1908l2 = this.adcel;
                AbstractC10759l abstractC10759l2 = c1908l2.isPro;
                boolean z = this.adcel.crashlytics.loadAd;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C9009l c9009l = this.adcel.crashlytics;
                c1908lM3593l = m3593l(c1908l2, abstractC10759l2, c4262l, new C9009l(c4262l, z, jElapsedRealtime, c9009l.amazon, j == -9223372036854775807L ? 0L : j, 0, 0L, c9009l.admob, c9009l.subs, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                C9009l c9009l2 = c1908lBilling.crashlytics;
                C4262l c4262l2 = c9009l2.yandex;
                C4262l c4262l3 = c9009l2.yandex;
                int i4 = c4262l2.purchase;
                int i5 = c8128lM3617l.f16932l;
                C3904l c3904l = new C3904l();
                abstractC10759l.billing(i4, c3904l, false);
                C3904l c3904l2 = new C3904l();
                abstractC10759l.billing(i5, c3904l2, false);
                boolean z2 = i4 != i5;
                long j4 = c8128lM3617l.f16931l;
                long jM3962continue = AbstractC15323l.m3962continue(mo317l()) - c3904l.purchase;
                if (z2 || j4 != jM3962continue) {
                    AbstractC12442l.subscription(c4262l3.admob == -1);
                    C4262l c4262l4 = new C4262l(null, c3904l.crashlytics, c4262l3.crashlytics, null, i4, AbstractC15323l.m3986try(c3904l.purchase + jM3962continue), AbstractC15323l.m3986try(c3904l.purchase + jM3962continue), -1, -1);
                    abstractC10759l.billing(i5, c3904l2, false);
                    C4322l c4322l = new C4322l();
                    abstractC10759l.vip(c3904l2.crashlytics, c4322l);
                    long jM3986try = AbstractC15323l.m3986try(c3904l2.purchase + j4);
                    C4262l c4262l5 = new C4262l(null, c3904l2.crashlytics, c4322l.crashlytics, null, i5, jM3986try, jM3986try, -1, -1);
                    C1908l c1908lAdmob = c1908lBilling.admob(c4262l4, c4262l5, 1);
                    if (z2 || j4 < jM3962continue) {
                        c1908lBilling = c1908lAdmob.isPro(new C9009l(c4262l5, false, SystemClock.elapsedRealtime(), AbstractC15323l.m3986try(c4322l.remoteconfig), jM3986try, AbstractC8672l.loadAd(jM3986try, AbstractC15323l.m3986try(c4322l.remoteconfig)), 0L, -9223372036854775807L, -9223372036854775807L, jM3986try));
                    } else {
                        long jMax = Math.max(0L, AbstractC15323l.m3962continue(c1908lAdmob.crashlytics.mopub) - (j4 - jM3962continue));
                        long jM3986try2 = AbstractC15323l.m3986try(c3904l2.purchase + j4 + jMax);
                        c1908lBilling = c1908lAdmob.isPro(new C9009l(c4262l5, false, SystemClock.elapsedRealtime(), AbstractC15323l.m3986try(c4322l.remoteconfig), jM3986try2, AbstractC8672l.loadAd(jM3986try2, AbstractC15323l.m3986try(c4322l.remoteconfig)), AbstractC15323l.m3986try(jMax), -9223372036854775807L, -9223372036854775807L, jM3986try2));
                    }
                }
                c1908lM3593l = c1908lBilling;
            }
            C9009l c9009l3 = c1908lM3593l.crashlytics;
            int i6 = (this.adcel.isPro.startapp() || c9009l3.yandex.loadAd == this.adcel.crashlytics.yandex.loadAd) ? 0 : i2;
            if (i6 == 0 && c9009l3.yandex.billing == this.adcel.crashlytics.yandex.billing) {
                return;
            }
            m3606l(c1908lM3593l, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؘْؒ */
    public final void mo327l(final int i, final long j, final List list) {
        if (m3615l(20)) {
            m3619l(new InterfaceC11724l() { // from class: lٗۙٔ
                @Override // defpackage.InterfaceC11724l
                public final void billing(InterfaceC4725l interfaceC4725l, int i2) {
                    C13208l c13208l = this.f33836l;
                    BinderC11857l binderC11857l = c13208l.crashlytics;
                    C16971l c16971lMetrica = AbstractC1186l.metrica();
                    int i3 = 0;
                    while (true) {
                        List list2 = list;
                        if (i3 >= list2.size()) {
                            interfaceC4725l.mo472volatile(binderC11857l, i2, new BinderC11373l(c16971lMetrica.mopub()), i, j);
                            return;
                        } else {
                            c16971lMetrica.crashlytics(((C2427l) list2.get(i3)).crashlytics(c13208l.m3611l(), true));
                            i3++;
                        }
                    }
                }
            });
            m3614l(list, i, j, false);
        }
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public final void m3613l(int i, int i2) {
        int iMetrica = this.adcel.isPro.metrica();
        int iMin = Math.min(i2, iMetrica);
        if (i >= iMetrica || i == iMin || iMetrica == 0) {
            return;
        }
        boolean z = m3596l(this.adcel) >= i && m3596l(this.adcel) < iMin;
        C1908l c1908lM3595l = m3595l(this.adcel, i, iMin, false, mo317l(), mo353static());
        int i3 = this.adcel.crashlytics.yandex.loadAd;
        m3606l(c1908lM3595l, 0, null, z ? 4 : null, i3 >= i && i3 < iMin ? 3 : null);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؚْٟ */
    public final long mo328l() {
        return this.adcel.crashlytics.isPro;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lْٓؒ */
    public final boolean mo329l() {
        return this.adcel.Signature;
    }

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public final void m3614l(List list, int i, long j, boolean z) {
        int iYandex;
        boolean z2;
        long j2;
        C4262l c4262l;
        C9009l c9009l;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            C2427l c2427l = (C2427l) list.get(i2);
            AbstractC8481l abstractC8481l = AbstractC18585l.yandex;
            C4322l c4322l = new C4322l();
            int i3 = i2;
            c4322l.loadAd(0, c2427l, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i3, i3, 0L);
            arrayList.add(c4322l);
            C3904l c3904l = new C3904l();
            c3904l.subs(null, null, i3, -9223372036854775807L, 0L, C12869l.billing, true);
            arrayList2.add(c3904l);
            i2 = i3 + 1;
        }
        C8150l c8150lM3597l = m3597l(arrayList, arrayList2);
        AbstractC1186l abstractC1186l = c8150lM3597l.purchase;
        if (!c8150lM3597l.startapp() && i >= abstractC1186l.size()) {
            throw new C17072l(5);
        }
        if (z) {
            iYandex = c8150lM3597l.startapp() ? 0 : c8150lM3597l.yandex(this.adcel.subs);
            z2 = false;
            j2 = -9223372036854775807L;
        } else if (i == -1) {
            C4262l c4262l2 = this.adcel.crashlytics.yandex;
            int i4 = c4262l2.loadAd;
            long j3 = c4262l2.billing;
            if (c8150lM3597l.startapp() || i4 < abstractC1186l.size()) {
                z2 = false;
                j2 = j3;
                iYandex = i4;
            } else {
                iYandex = c8150lM3597l.yandex(this.adcel.subs);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            iYandex = i;
            z2 = false;
            j2 = j;
        }
        C8128l c8128lM3617l = m3617l(c8150lM3597l, iYandex, j2);
        if (c8128lM3617l == null) {
            c4262l = new C4262l(null, iYandex, null, null, iYandex, j2 == -9223372036854775807L ? 0L : j2, j2 == -9223372036854775807L ? 0L : j2, -1, -1);
            c9009l = new C9009l(c4262l, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
        } else {
            long j4 = c8128lM3617l.f16931l;
            c4262l = new C4262l(null, iYandex, (C2427l) list.get(iYandex), null, c8128lM3617l.f16932l, AbstractC15323l.m3986try(j4), AbstractC15323l.m3986try(j4), -1, -1);
            c9009l = new C9009l(c4262l, false, SystemClock.elapsedRealtime(), -9223372036854775807L, AbstractC15323l.m3986try(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, AbstractC15323l.m3986try(j4));
        }
        C1908l c1908lM3593l = m3593l(this.adcel, c8150lM3597l, c4262l, c9009l, 4);
        int i5 = c1908lM3593l.signatures;
        if (iYandex != -1 && i5 != 1) {
            i5 = (c8150lM3597l.startapp() || z2) ? 4 : 2;
        }
        C1908l c1908lBilling = c1908lM3593l.billing(i5, this.adcel.yandex);
        m3606l(c1908lBilling, 0, null, !this.adcel.isPro.startapp() ? 4 : null, (this.adcel.isPro.startapp() && c1908lBilling.isPro.startapp()) ? null : 3);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final void mo330l(int i, C2427l c2427l) {
        if (m3615l(20)) {
            AbstractC12442l.admob(i >= 0);
            m3619l(new C4109l(this, i, c2427l, 0));
            m3603l(i, i + 1, AbstractC1186l.isVip(c2427l));
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lْۥٞ */
    public final void mo331l() {
        if (m3615l(9)) {
            m3619l(new C16262l(this, 11));
            AbstractC10759l abstractC10759l = this.adcel.isPro;
            if (abstractC10759l.startapp() || subs()) {
                return;
            }
            if (mo306instanceof()) {
                m3612l(mo362try(), -9223372036854775807L);
                return;
            }
            C4322l c4322lRemoteconfig = abstractC10759l.remoteconfig(m3596l(this.adcel), new C4322l(), 0L);
            if (c4322lRemoteconfig.subs && c4322lRemoteconfig.yandex()) {
                m3612l(m3596l(this.adcel), -9223372036854775807L);
            }
        }
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public final boolean m3615l(int i) {
        if (this.isVip.yandex(i)) {
            return true;
        }
        AbstractC12900l.subscription("Controller isn't allowed to call command= ", i, "MCImplBase");
        return false;
    }

    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public final void m3616l(long j) {
        long jMo317l = mo317l() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jMo317l = Math.min(jMo317l, duration);
        }
        m3612l(m3596l(this.adcel), Math.max(jMo317l, 0L));
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٔٙٝ */
    public final void mo332l() {
        if (m3615l(12)) {
            m3619l(new C16262l(this, 2));
            m3616l(this.adcel.appmetrica);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final void mo333l() {
        if (m3615l(26)) {
            m3619l(new C16262l(this, 9));
            C1908l c1908l = this.adcel;
            int i = c1908l.tapsense + 1;
            int i2 = c1908l.subscription.crashlytics;
            if (i2 == 0 || i <= i2) {
                this.adcel = c1908l.crashlytics(i, c1908l.Signature);
                C14311l c14311l = new C14311l(this, i, 3);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(30, c14311l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final boolean mo334l() {
        return this.adcel.subs;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final AbstractC1186l mo335l() {
        return this.Signature;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lَٖؔ */
    public final void mo336l(final int i, final int i2, final int i3) {
        if (m3615l(20)) {
            AbstractC12442l.admob(i >= 0 && i <= i2 && i3 >= 0);
            m3619l(new InterfaceC11724l() { // from class: lٍؑۤ
                @Override // defpackage.InterfaceC11724l
                public final void billing(InterfaceC4725l interfaceC4725l, int i4) {
                    interfaceC4725l.mo448l(this.f2170l.crashlytics, i4, i, i2, i3);
                }
            });
            m3602l(i, i2, i3);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lَٖؕ */
    public final AbstractC10759l mo338l() {
        return this.adcel.isPro;
    }

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final C8128l m3617l(AbstractC10759l abstractC10759l, int i, long j) {
        if (abstractC10759l.startapp()) {
            return null;
        }
        C4322l c4322l = new C4322l();
        C3904l c3904l = new C3904l();
        if (i == -1 || i >= abstractC10759l.metrica()) {
            i = abstractC10759l.yandex(this.adcel.subs);
            j = AbstractC15323l.m3986try(abstractC10759l.remoteconfig(i, c4322l, 0L).smaato);
        }
        long jM3962continue = AbstractC15323l.m3962continue(j);
        AbstractC12442l.smaato(i, abstractC10759l.metrica());
        abstractC10759l.vip(i, c4322l);
        if (jM3962continue == -9223372036854775807L) {
            jM3962continue = c4322l.smaato;
            if (jM3962continue == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c4322l.vip;
        abstractC10759l.billing(i2, c3904l, false);
        while (i2 < c4322l.metrica && c3904l.purchase != jM3962continue) {
            int i3 = i2 + 1;
            if (abstractC10759l.billing(i3, c3904l, false).purchase > jM3962continue) {
                break;
            }
            i2 = i3;
        }
        abstractC10759l.billing(i2, c3904l, false);
        return new C8128l(i2, jM3962continue - c3904l.purchase, false);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lٖۥۡ */
    public final ListenableFuture mo340l(final C12417l c12417l, final Bundle bundle) {
        final int i = 0;
        if (m3611l() >= 7) {
            return m3611l() < 7 ? mo340l(c12417l, bundle) : m3618l(0, c12417l, new InterfaceC11724l(this) { // from class: lٌْ۠

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C13208l f18689l;

                {
                    this.f18689l = this;
                }

                @Override // defpackage.InterfaceC11724l
                public final void billing(InterfaceC4725l interfaceC4725l, int i2) {
                    int i3 = i;
                    C12417l c12417l2 = c12417l;
                    C13208l c13208l = this.f18689l;
                    switch (i3) {
                        case 0:
                            interfaceC4725l.mo464package(c13208l.crashlytics, i2, c12417l2.loadAd(), bundle, false);
                            break;
                        default:
                            interfaceC4725l.mo460l(c13208l.crashlytics, i2, c12417l2.loadAd(), bundle);
                            break;
                    }
                }
            });
        }
        final int i2 = 1;
        return m3618l(0, c12417l, new InterfaceC11724l(this) { // from class: lٌْ۠

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13208l f18689l;

            {
                this.f18689l = this;
            }

            @Override // defpackage.InterfaceC11724l
            public final void billing(InterfaceC4725l interfaceC4725l, int i3) {
                int i4 = i2;
                C12417l c12417l2 = c12417l;
                C13208l c13208l = this.f18689l;
                switch (i4) {
                    case 0:
                        interfaceC4725l.mo464package(c13208l.crashlytics, i3, c12417l2.loadAd(), bundle, false);
                        break;
                    default:
                        interfaceC4725l.mo460l(c13208l.crashlytics, i3, c12417l2.loadAd(), bundle);
                        break;
                }
            }
        });
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lْٗٔ */
    public final Bundle mo341l() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: lؙٗٙ */
    public final void mo342l(int i, int i2) {
        if (m3615l(20)) {
            AbstractC12442l.admob(i >= 0 && i2 >= 0);
            m3619l(new C1542l(this, i, i2, 2));
            m3602l(i, i + 1, i2);
        }
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final ListenableFuture m3618l(int i, C12417l c12417l, InterfaceC11724l interfaceC11724l) {
        InterfaceC4725l interfaceC4725l = null;
        if (c12417l != null) {
            int i2 = c12417l.yandex;
            String str = c12417l.loadAd;
            AbstractC12442l.admob(i2 == 0);
            if (this.pro.yandex.contains(c12417l) || C14869l.vip(str)) {
                interfaceC4725l = this.appmetrica;
            } else {
                AbstractC6427l.vip("MCImplBase", "Controller isn't allowed to call custom session command:".concat(str));
            }
        } else {
            AbstractC12442l.admob(i != 0);
            if (this.pro.yandex(i)) {
                interfaceC4725l = this.appmetrica;
            } else {
                AbstractC12900l.subscription("Controller isn't allowed to call command, commandCode=", i, "MCImplBase");
            }
        }
        return m3609l(interfaceC4725l, interfaceC11724l, false);
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public final void mo344l(InterfaceC13521l interfaceC13521l) {
        this.subs.purchase(interfaceC13521l);
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final void m3619l(InterfaceC11724l interfaceC11724l) {
        C13568l c13568l = this.isPro;
        Handler handler = (Handler) c13568l.f26581l;
        if (((C13208l) c13568l.f26580l).appmetrica != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        m3609l(this.appmetrica, interfaceC11724l, true);
    }

    @Override // defpackage.InterfaceC11345l
    public final void metrica(C2427l c2427l, long j) {
        if (m3615l(31)) {
            m3619l(new C8000l(j, this, c2427l));
            m3614l(Collections.singletonList(c2427l), -1, j, false);
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final int mopub() {
        return this.adcel.admob;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: native */
    public final void mo346native(int i, int i2, List list) {
        if (m3615l(20)) {
            AbstractC12442l.admob(i >= 0 && i <= i2);
            m3619l(new C11118l(this, list, i, i2, 0));
            m3603l(i, i2, list);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: new */
    public final long mo347new() {
        return this.adcel.crashlytics.purchase;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: package */
    public final void mo348package(int i, int i2) {
        if (m3615l(33)) {
            m3619l(new C1542l(this, i, i2, 1));
            C1908l c1908l = this.adcel;
            C2848l c2848l = c1908l.subscription;
            if (c1908l.tapsense == i || c2848l.loadAd > i) {
                return;
            }
            int i3 = c2848l.crashlytics;
            if (i3 == 0 || i <= i3) {
                this.adcel = c1908l.crashlytics(i, c1908l.Signature);
                C14311l c14311l = new C14311l(this, i, 0);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(30, c14311l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final void premium() {
        if (m3615l(4)) {
            m3619l(new C16262l(this, 3));
            m3612l(m3596l(this.adcel), -9223372036854775807L);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: private */
    public final void mo349private(C4970l c4970l) {
        if (m3615l(29)) {
            m3619l(new C5131l(this, c4970l, 23));
            C1908l c1908l = this.adcel;
            if (c4970l != c1908l.f4365package) {
                this.adcel = c1908l.metrica(c4970l);
                C16998l c16998l = new C16998l(c4970l, 1);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(19, c16998l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final long pro() {
        return this.adcel.crashlytics.subs;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: protected */
    public final void mo350protected() {
        if (!m3615l(1)) {
            AbstractC6427l.vip("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            m3619l(new C16262l(this, 12));
            m3600l(true);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: public */
    public final C3852l mo351public() {
        return this.adcel.remoteconfig;
    }

    @Override // defpackage.InterfaceC11345l
    public final int purchase() {
        return this.adcel.signatures;
    }

    @Override // defpackage.InterfaceC11345l
    public final void release() {
        InterfaceC4725l interfaceC4725l = this.appmetrica;
        if (this.startapp) {
            return;
        }
        int i = 1;
        this.startapp = true;
        this.vip = null;
        this.remoteconfig.removeCallbacksAndMessages(null);
        m3598abstract();
        C13568l c13568l = this.isPro;
        Handler handler = (Handler) c13568l.f26581l;
        if (handler.hasMessages(1)) {
            c13568l.vip();
        }
        handler.removeCallbacksAndMessages(null);
        this.appmetrica = null;
        if (interfaceC4725l != null && interfaceC4725l.asBinder().isBinderAlive()) {
            int iBilling = this.loadAd.billing();
            try {
                interfaceC4725l.asBinder().unlinkToDeath(this.mopub, 0);
                interfaceC4725l.mo441l(this.crashlytics, iBilling);
            } catch (RemoteException unused) {
            }
        }
        this.subs.amazon();
        C13904l c13904l = this.loadAd;
        RunnableC7853l runnableC7853l = new RunnableC7853l(this, i);
        synchronized (c13904l.f27204l) {
            try {
                Handler handlerAds = AbstractC15323l.ads(null);
                c13904l.f27200l = handlerAds;
                c13904l.f27205l = runnableC7853l;
                if (((C11154l) c13904l.f27203l).isEmpty()) {
                    c13904l.admob();
                } else {
                    handlerAds.postDelayed(new RunnableC6665l(i, c13904l), 30000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void remoteconfig(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.adcel.isPro.startapp()) {
            m3614l(list, -1, -9223372036854775807L, false);
        } else {
            m3606l(m3590l(this.adcel, Math.min(i, this.adcel.isPro.metrica()), list, mo317l(), mo353static()), 0, null, null, this.adcel.isPro.startapp() ? 3 : null);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: return */
    public final void mo352return(boolean z) {
        if (m3615l(26)) {
            m3619l(new C15502l(this, z, 2));
            C1908l c1908l = this.adcel;
            if (c1908l.Signature != z) {
                this.adcel = c1908l.crashlytics(c1908l.tapsense, z);
                C15502l c15502l = new C15502l(this, z, 3);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(30, c15502l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final float signatures() {
        return this.adcel.vip;
    }

    @Override // defpackage.InterfaceC11345l
    public final void smaato(int i, long j) {
        if (m3615l(10)) {
            AbstractC12442l.admob(i >= 0);
            m3619l(new C10213l(j, this, i));
            m3612l(i, j);
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final boolean startapp() {
        return this.adcel.license;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: static */
    public final long mo353static() {
        C9009l c9009l = this.adcel.crashlytics;
        return !c9009l.loadAd ? mo317l() : c9009l.yandex.mopub;
    }

    @Override // defpackage.InterfaceC11345l
    public final void stop() {
        if (m3615l(3)) {
            m3619l(new C16262l(this, 13));
            C1908l c1908l = this.adcel;
            C9009l c9009l = this.adcel.crashlytics;
            C4262l c4262l = c9009l.yandex;
            boolean z = c9009l.loadAd;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C9009l c9009l2 = this.adcel.crashlytics;
            long j = c9009l2.amazon;
            long j2 = c9009l2.yandex.billing;
            int iLoadAd = AbstractC8672l.loadAd(j2, j);
            C9009l c9009l3 = this.adcel.crashlytics;
            C1908l c1908lIsPro = c1908l.isPro(new C9009l(c4262l, z, jElapsedRealtime, j, j2, iLoadAd, 0L, c9009l3.admob, c9009l3.subs, c9009l3.yandex.billing));
            this.adcel = c1908lIsPro;
            if (c1908lIsPro.signatures != 1) {
                this.adcel = c1908lIsPro.billing(1, c1908lIsPro.yandex);
                C4875l c4875l = new C4875l(17);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(4, c4875l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: strictfp */
    public final int mo354strictfp() {
        return this.adcel.crashlytics.yandex.subs;
    }

    @Override // defpackage.InterfaceC11345l
    public final boolean subs() {
        return this.adcel.crashlytics.loadAd;
    }

    @Override // defpackage.InterfaceC11345l
    public final int subscription() {
        return this.adcel.crashlytics.billing;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: super */
    public final void mo355super(int i) {
        if (m3615l(34)) {
            m3619l(new C14311l(this, i, 8));
            C1908l c1908l = this.adcel;
            int i2 = c1908l.tapsense - 1;
            if (i2 >= c1908l.subscription.loadAd) {
                this.adcel = c1908l.crashlytics(i2, c1908l.Signature);
                C14311l c14311l = new C14311l(this, i2, 11);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(30, c14311l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: switch */
    public final C14723l mo356switch() {
        return this.adcel.yandex;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: synchronized */
    public final void mo357synchronized(int i) {
        if (m3615l(34)) {
            m3619l(new C14311l(this, i, 4));
            C1908l c1908l = this.adcel;
            int i2 = c1908l.tapsense + 1;
            int i3 = c1908l.subscription.crashlytics;
            if (i3 == 0 || i2 <= i3) {
                this.adcel = c1908l.crashlytics(i2, c1908l.Signature);
                C14311l c14311l = new C14311l(this, i2, 5);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(30, c14311l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    public final long tapsense() {
        return this.adcel.inmobi;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: this */
    public final C16684l mo358this() {
        return this.adcel.ads;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: throw */
    public final void mo359throw(int i, int i2) {
        if (m3615l(20)) {
            AbstractC12442l.admob(i >= 0 && i2 >= i);
            m3619l(new C1542l(this, i, i2, 0));
            m3613l(i, i2);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: throws */
    public final void mo360throws() {
        if (m3615l(26)) {
            m3619l(new C16262l(this, 17));
            C1908l c1908l = this.adcel;
            int i = c1908l.tapsense - 1;
            if (i >= c1908l.subscription.loadAd) {
                this.adcel = c1908l.crashlytics(i, c1908l.Signature);
                C14311l c14311l = new C14311l(this, i, 10);
                C8961l c8961l = this.subs;
                c8961l.crashlytics(30, c14311l);
                c8961l.loadAd();
            }
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: transient */
    public final void mo361transient(C3852l c3852l) {
        if (m3615l(19)) {
            m3619l(new C5131l(this, c3852l, 22));
            if (this.adcel.remoteconfig.equals(c3852l)) {
                return;
            }
            this.adcel = this.adcel.mopub(c3852l);
            C4750l c4750l = new C4750l(c3852l, 1);
            C8961l c8961l = this.subs;
            c8961l.crashlytics(15, c4750l);
            c8961l.loadAd();
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: try */
    public final int mo362try() {
        if (this.adcel.isPro.startapp()) {
            return -1;
        }
        C1908l c1908l = this.adcel;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int iM3596l = m3596l(c1908l);
        C1908l c1908l2 = this.adcel;
        int i = c1908l2.admob;
        if (i == 1) {
            i = 0;
        }
        return abstractC10759l.purchase(iM3596l, i, c1908l2.subs);
    }

    @Override // defpackage.InterfaceC11345l
    public final C16616l vip() {
        return this.isVip;
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: volatile */
    public final void mo363volatile() {
        if (m3615l(1)) {
            m3619l(new C16262l(this, 8));
            m3600l(false);
        }
    }

    @Override // defpackage.InterfaceC11345l
    /* JADX INFO: renamed from: while */
    public final int mo364while() {
        return this.adcel.crashlytics.yandex.admob;
    }

    @Override // defpackage.InterfaceC11345l
    public final void yandex() {
        if (m3615l(2)) {
            m3619l(new C16262l(this, 14));
            C1908l c1908l = this.adcel;
            if (c1908l.signatures == 1) {
                m3606l(c1908l.billing(c1908l.isPro.startapp() ? 4 : 2, null), null, null, null, null);
            }
        }
    }
}
