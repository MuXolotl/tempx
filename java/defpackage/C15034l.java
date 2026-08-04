package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: lٔٝؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15034l implements InterfaceC9655l {
    public C4684l Signature;
    public C3584l ad;
    public int adcel;
    public final C2011l admob;
    public HandlerThread ads;
    public C16543l advert;
    public final C10975l amazon;
    public final boolean billing;
    public final C3797l crashlytics;
    public final C11919l firebase;
    public final C17849l isPro;
    public C1441l isVip;
    public byte[] license;
    public final InterfaceC6553l loadAd;
    public final Object metrica;
    public final HashMap mopub;
    public byte[] pro;
    public final boolean purchase;
    public final Looper remoteconfig;
    public final UUID smaato;
    public int startapp;
    public final C14513l subs;
    public HandlerC7734l subscription;
    public C11102l tapsense;
    public final HandlerC8616l vip;
    public final List yandex;

    public C15034l(UUID uuid, InterfaceC6553l interfaceC6553l, C3797l c3797l, C10975l c10975l, List list, boolean z, boolean z2, byte[] bArr, HashMap map, C11919l c11919l, Looper looper, C14513l c14513l, C17849l c17849l) {
        this.smaato = uuid;
        this.crashlytics = c3797l;
        this.amazon = c10975l;
        this.loadAd = interfaceC6553l;
        this.purchase = z;
        this.billing = z2;
        if (bArr != null) {
            this.pro = bArr;
            this.yandex = null;
        } else {
            list.getClass();
            this.yandex = DesugarCollections.unmodifiableList(list);
        }
        this.mopub = map;
        this.firebase = c11919l;
        this.admob = new C2011l();
        this.subs = c14513l;
        this.isPro = c17849l;
        this.startapp = 2;
        this.remoteconfig = looper;
        this.vip = new HandlerC8616l(this, looper, 1);
        this.metrica = new Object();
    }

    @Override // defpackage.InterfaceC9655l
    public final C11102l admob() {
        startapp();
        return this.tapsense;
    }

    @Override // defpackage.InterfaceC9655l
    public final void amazon(C13281l c13281l) {
        startapp();
        int i = this.adcel;
        if (i <= 0) {
            AbstractC6427l.admob("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.adcel = i2;
        if (i2 == 0) {
            this.startapp = 0;
            HandlerC8616l handlerC8616l = this.vip;
            String str = AbstractC15323l.yandex;
            handlerC8616l.removeCallbacksAndMessages(null);
            this.subscription.loadAd();
            this.subscription = null;
            this.ads.quit();
            this.ads = null;
            this.tapsense = null;
            this.Signature = null;
            this.ad = null;
            synchronized (this.metrica) {
                this.advert = null;
            }
            this.isVip = null;
            byte[] bArr = this.license;
            if (bArr != null) {
                this.loadAd.smaato(bArr);
                this.license = null;
            }
        }
        if (c13281l != null) {
            this.admob.billing(c13281l);
            if (this.admob.amazon(c13281l) == 0) {
                c13281l.purchase();
            }
        }
        C10975l c10975l = this.amazon;
        int i3 = this.adcel;
        C17339l c17339l = (C17339l) c10975l.f22121l;
        if (i3 == 1 && c17339l.f33690l > 0 && c17339l.f33696l != -9223372036854775807L) {
            c17339l.f33697l.add(this);
            Handler handler = c17339l.f33682l;
            handler.getClass();
            handler.postAtTime(new RunnableC16112l(23, this), this, SystemClock.uptimeMillis() + c17339l.f33696l);
        } else if (i3 == 0) {
            c17339l.f33693l.remove(this);
            if (c17339l.f33688l == this) {
                c17339l.f33688l = null;
            }
            if (c17339l.f33698l == this) {
                c17339l.f33698l = null;
            }
            C3797l c3797l = c17339l.f33683l;
            HashSet hashSet = (HashSet) c3797l.f7903l;
            hashSet.remove(this);
            if (((C15034l) c3797l.f7902l) == this) {
                c3797l.f7902l = null;
                if (!hashSet.isEmpty()) {
                    C15034l c15034l = (C15034l) hashSet.iterator().next();
                    c3797l.f7902l = c15034l;
                    C1441l c1441lCrashlytics = c15034l.loadAd.crashlytics();
                    c15034l.isVip = c1441lCrashlytics;
                    HandlerC7734l handlerC7734l = c15034l.subscription;
                    String str2 = AbstractC15323l.yandex;
                    c1441lCrashlytics.getClass();
                    handlerC7734l.getClass();
                    handlerC7734l.obtainMessage(1, new C5226l(C13071l.mopub.getAndIncrement(), true, SystemClock.elapsedRealtime(), c1441lCrashlytics)).sendToTarget();
                }
            }
            if (c17339l.f33696l != -9223372036854775807L) {
                Handler handler2 = c17339l.f33682l;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c17339l.f33697l.remove(this);
            }
        }
        c17339l.subs();
    }

    @Override // defpackage.InterfaceC9655l
    public final boolean billing(String str) {
        startapp();
        byte[] bArr = this.license;
        bArr.getClass();
        return this.loadAd.subscription(str, bArr);
    }

    @Override // defpackage.InterfaceC9655l
    public final boolean crashlytics() {
        startapp();
        return this.purchase;
    }

    public final boolean firebase() {
        int i = this.startapp;
        return i == 3 || i == 4;
    }

    public final void isPro(boolean z) {
        long jMin;
        long j;
        Set set;
        if (this.billing) {
            return;
        }
        byte[] bArr = this.license;
        String str = AbstractC15323l.yandex;
        boolean z2 = true;
        if (this.pro == null) {
            metrica(1, z, bArr);
            return;
        }
        if (this.startapp != 4) {
            try {
                this.loadAd.firebase(this.license, this.pro);
            } catch (Exception | NoSuchMethodError e) {
                smaato(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (AbstractC17252l.purchase.equals(this.smaato)) {
            startapp();
            byte[] bArr2 = this.license;
            Pair pair = null;
            Map mapYandex = bArr2 == null ? null : this.loadAd.yandex(bArr2);
            if (mapYandex != null) {
                long j2 = -9223372036854775807L;
                try {
                    String str2 = (String) mapYandex.get("LicenseDurationRemaining");
                    j = str2 != null ? Long.parseLong(str2) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str3 = (String) mapYandex.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j2 = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j2));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            AbstractC6427l.billing("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            metrica(2, z, bArr);
            return;
        }
        if (jMin <= 0) {
            smaato(2, new C7768l());
            return;
        }
        this.startapp = 4;
        C2011l c2011l = this.admob;
        synchronized (c2011l.f4535l) {
            set = c2011l.f4533l;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C13281l) it.next()).loadAd();
        }
    }

    @Override // defpackage.InterfaceC9655l
    public final UUID loadAd() {
        startapp();
        return this.smaato;
    }

    public final void metrica(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.metrica) {
                try {
                    this.advert = new C16543l((byte) 0, 15);
                    List list = this.yandex;
                    if (list != null) {
                        AbstractC1186l.Signature(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C3584l c3584lStartapp = this.loadAd.startapp(bArr, this.yandex, i, this.mopub);
            this.ad = c3584lStartapp;
            HandlerC7734l handlerC7734l = this.subscription;
            String str = AbstractC15323l.yandex;
            c3584lStartapp.getClass();
            handlerC7734l.getClass();
            handlerC7734l.obtainMessage(2, new C5226l(C13071l.mopub.getAndIncrement(), z, SystemClock.elapsedRealtime(), c3584lStartapp)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            remoteconfig(e, true);
        }
    }

    @Override // defpackage.InterfaceC9655l
    public final C4684l mopub() {
        startapp();
        if (this.startapp == 1) {
            return this.Signature;
        }
        return null;
    }

    @Override // defpackage.InterfaceC9655l
    public final void purchase(C13281l c13281l) {
        startapp();
        if (this.adcel < 0) {
            AbstractC6427l.admob("DefaultDrmSession", "Session reference count less than zero: " + this.adcel);
            this.adcel = 0;
        }
        if (c13281l != null) {
            C2011l c2011l = this.admob;
            synchronized (c2011l.f4535l) {
                try {
                    ArrayList arrayList = new ArrayList(c2011l.f4536l);
                    arrayList.add(c13281l);
                    c2011l.f4536l = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) c2011l.f4534l.get(c13281l);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c2011l.f4533l);
                        hashSet.add(c13281l);
                        c2011l.f4533l = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    c2011l.f4534l.put(c13281l, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = this.adcel + 1;
        this.adcel = i;
        if (i == 1) {
            AbstractC12442l.subscription(this.startapp == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.ads = handlerThread;
            handlerThread.start();
            this.subscription = new HandlerC7734l(this, this.ads.getLooper());
            if (vip()) {
                isPro(true);
            }
        } else if (c13281l != null && firebase() && this.admob.amazon(c13281l) == 1) {
            c13281l.crashlytics(this.startapp);
        }
        C17339l c17339l = (C17339l) this.amazon.f22121l;
        if (c17339l.f33696l != -9223372036854775807L) {
            c17339l.f33697l.remove(this);
            Handler handler = c17339l.f33682l;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final void remoteconfig(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || AbstractC16670l.subs(th)) {
            this.crashlytics.m1429synchronized(this);
        } else {
            smaato(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final void smaato(int i, Throwable th) {
        int iSignatures;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            iSignatures = AbstractC15323l.signatures(AbstractC15323l.premium(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (th instanceof MediaDrmResetException) {
            iSignatures = 6006;
        } else if ((th instanceof NotProvisionedException) || AbstractC16670l.subs(th)) {
            iSignatures = 6002;
        } else if (th instanceof DeniedByServerException) {
            iSignatures = 6007;
        } else if (th instanceof C18628l) {
            iSignatures = 6001;
        } else if (th instanceof C13976l) {
            iSignatures = 6003;
        } else if (th instanceof C7768l) {
            iSignatures = 6008;
        } else if (i == 1) {
            iSignatures = 6006;
        } else if (i == 2) {
            iSignatures = 6004;
        } else {
            if (i != 3) {
                C11983l.crashlytics();
                return;
            }
            iSignatures = 6002;
        }
        this.Signature = new C4684l(iSignatures, th);
        AbstractC6427l.subs("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            C2011l c2011l = this.admob;
            synchronized (c2011l.f4535l) {
                set = c2011l.f4533l;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C13281l) it.next()).amazon((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            C4875l.remoteconfig("Unexpected Throwable subclass", th);
            return;
        } else if (!AbstractC16670l.isPro(th) && !AbstractC16670l.subs(th)) {
            throw ((Error) th);
        }
        if (this.startapp != 4) {
            this.startapp = 1;
        }
    }

    public final void startapp() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.remoteconfig;
        if (threadCurrentThread != looper.getThread()) {
            AbstractC6427l.metrica("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    public final void subs(InterfaceC18679l interfaceC18679l) {
        Set set;
        C2011l c2011l = this.admob;
        synchronized (c2011l.f4535l) {
            set = c2011l.f4533l;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            interfaceC18679l.accept((C13281l) it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean vip() {
        Set set;
        if (firebase()) {
            return true;
        }
        try {
            byte[] bArrAdmob = this.loadAd.admob();
            this.license = bArrAdmob;
            this.loadAd.ads(bArrAdmob, this.isPro);
            this.tapsense = this.loadAd.amazon(this.license);
            this.startapp = 3;
            C2011l c2011l = this.admob;
            synchronized (c2011l.f4535l) {
                set = c2011l.f4533l;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C13281l) it.next()).crashlytics(3);
            }
            this.license.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.crashlytics.m1429synchronized(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (AbstractC16670l.subs(e)) {
                this.crashlytics.m1429synchronized(this);
                return false;
            }
            smaato(1, e);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (AbstractC16670l.subs(e)) {
                this.crashlytics.m1429synchronized(this);
                return false;
            }
            smaato(1, e);
            return false;
        }
    }

    @Override // defpackage.InterfaceC9655l
    public final int yandex() {
        startapp();
        return this.startapp;
    }
}
