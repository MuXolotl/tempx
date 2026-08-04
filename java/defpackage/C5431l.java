package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘِؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5431l extends AbstractC1091l implements Handler.Callback {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C7417l f11633l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C15608l f11634l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final Handler f11635l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final SurfaceHolderCallbackC18330l f11636l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public boolean f11637l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C6168l f11638l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public long f11639l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public boolean f11640l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public long f11641l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public AbstractC6791l f11642l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5431l(SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l, Looper looper) {
        Handler handler;
        super(5);
        C6168l c6168l = C6168l.f13000l;
        this.f11636l = surfaceHolderCallbackC18330l;
        if (looper == null) {
            handler = null;
        } else {
            String str = AbstractC15323l.yandex;
            handler = new Handler(looper, this);
        }
        this.f11635l = handler;
        this.f11638l = c6168l;
        this.f11634l = new C15608l(1);
        this.f11639l = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC1091l
    public final void Signature(C5978l[] c5978lArr, long j, long j2, C5019l c5019l) {
        this.f11642l = this.f11638l.remoteconfig(c5978lArr[0]);
        C7417l c7417l = this.f11633l;
        if (c7417l != null) {
            long j3 = c7417l.loadAd;
            long j4 = (this.f11639l + j3) - j2;
            if (j3 != j4) {
                c7417l = new C7417l(j4, c7417l.yandex);
            }
            this.f11633l = c7417l;
        }
        this.f11639l = j2;
    }

    @Override // defpackage.AbstractC1091l
    public final void ad(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f11637l && this.f11633l == null) {
                C15608l c15608l = this.f11634l;
                c15608l.remoteconfig();
                C10023l c10023l = this.f3008l;
                c10023l.Signature();
                int iPro = pro(c10023l, c15608l, 0);
                if (iPro == -4) {
                    if (c15608l.crashlytics(4)) {
                        this.f11637l = true;
                    } else if (c15608l.f8496l >= this.f3019l) {
                        c15608l.f30464l = this.f11641l;
                        c15608l.adcel();
                        AbstractC6791l abstractC6791l = this.f11642l;
                        String str = AbstractC15323l.yandex;
                        C7417l c7417lAdmob = abstractC6791l.admob(c15608l);
                        if (c7417lAdmob != null) {
                            ArrayList arrayList = new ArrayList(c7417lAdmob.yandex.length);
                            inmobi(c7417lAdmob, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f11633l = new C7417l(m1776throws(c15608l.f8496l), (InterfaceC1525l[]) arrayList.toArray(new InterfaceC1525l[0]));
                            }
                        }
                    }
                } else if (iPro == -5) {
                    C5978l c5978l = (C5978l) c10023l.f20418l;
                    c5978l.getClass();
                    this.f11641l = c5978l.tapsense;
                }
            }
            C7417l c7417l = this.f11633l;
            if (c7417l == null || c7417l.loadAd > m1776throws(j)) {
                z = false;
            } else {
                C7417l c7417l2 = this.f11633l;
                Handler handler = this.f11635l;
                if (handler != null) {
                    handler.obtainMessage(1, c7417l2).sendToTarget();
                } else {
                    m1775package(c7417l2);
                }
                this.f11633l = null;
                z = true;
            }
            if (this.f11637l && this.f11633l == null) {
                this.f11640l = true;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            m1775package((C7417l) message.obj);
            return true;
        }
        C18073l.admob();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final void inmobi(C7417l c7417l, ArrayList arrayList) {
        int i = 0;
        while (true) {
            InterfaceC1525l[] interfaceC1525lArr = c7417l.yandex;
            if (i >= interfaceC1525lArr.length) {
                return;
            }
            C5978l c5978lYandex = interfaceC1525lArr[i].yandex();
            if (c5978lYandex != null) {
                C6168l c6168l = this.f11638l;
                if (c6168l.appmetrica(c5978lYandex)) {
                    AbstractC6791l abstractC6791lRemoteconfig = c6168l.remoteconfig(c5978lYandex);
                    byte[] bArrCrashlytics = interfaceC1525lArr[i].crashlytics();
                    bArrCrashlytics.getClass();
                    C15608l c15608l = this.f11634l;
                    c15608l.remoteconfig();
                    c15608l.startapp(bArrCrashlytics.length);
                    c15608l.f8498l.put(bArrCrashlytics);
                    c15608l.adcel();
                    C7417l c7417lAdmob = abstractC6791lRemoteconfig.admob(c15608l);
                    if (c7417lAdmob != null) {
                        inmobi(c7417lAdmob, arrayList);
                    }
                } else {
                    arrayList.add(interfaceC1525lArr[i]);
                }
            } else {
                arrayList.add(interfaceC1525lArr[i]);
            }
            i++;
        }
    }

    @Override // defpackage.AbstractC1091l
    public final String isPro() {
        return "MetadataRenderer";
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m1775package(C7417l c7417l) {
        SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = this.f11636l;
        C17804l c17804l = surfaceHolderCallbackC18330l.yandex;
        C3852l c3852l = c17804l.f34728l;
        C8961l c8961l = c17804l.f34677l;
        C3117l c3117lYandex = c3852l.yandex();
        int i = 0;
        while (true) {
            InterfaceC1525l[] interfaceC1525lArr = c7417l.yandex;
            if (i >= interfaceC1525lArr.length) {
                break;
            }
            interfaceC1525lArr[i].loadAd(c3117lYandex);
            i++;
        }
        c17804l.f34728l = new C3852l(c3117lYandex);
        C3852l c3852lM4411abstract = c17804l.m4411abstract();
        if (!c3852lM4411abstract.equals(c17804l.f34717l)) {
            c17804l.f34717l = c3852lM4411abstract;
            c8961l.crashlytics(14, new C2683l(25, surfaceHolderCallbackC18330l));
        }
        c8961l.crashlytics(28, new C2683l(26, c7417l));
        c8961l.loadAd();
    }

    @Override // defpackage.AbstractC1091l
    public final int premium(C5978l c5978l) {
        if (this.f11638l.appmetrica(c5978l)) {
            return AbstractC4338l.ads(c5978l.f12614catch == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC4338l.ads(0, 0, 0, 0);
    }

    @Override // defpackage.AbstractC1091l
    public final boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.AbstractC1091l
    public final boolean smaato() {
        return this.f11640l;
    }

    @Override // defpackage.AbstractC1091l
    public final void startapp(long j, boolean z, boolean z2) {
        this.f11633l = null;
        this.f11637l = false;
        this.f11640l = false;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final long m1776throws(long j) {
        AbstractC12442l.subscription(j != -9223372036854775807L);
        AbstractC12442l.subscription(this.f11639l != -9223372036854775807L);
        return j - this.f11639l;
    }

    @Override // defpackage.AbstractC1091l
    public final void vip() {
        this.f11633l = null;
        this.f11642l = null;
        this.f11639l = -9223372036854775807L;
    }
}
