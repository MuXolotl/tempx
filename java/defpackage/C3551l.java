package defpackage;

import android.net.Uri;
import android.util.LruCache;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٟؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3551l implements InterfaceC14105l {
    public static final Set applovin = DesugarCollections.unmodifiableSet(EnumSet.of(EnumC4375l.f8908l, EnumC4375l.f8905l));
    public static final Set appmetrica = DesugarCollections.unmodifiableSet(EnumSet.of(EnumC4375l.f8909l, EnumC4375l.f8911l, EnumC4375l.f8906l, EnumC4375l.f8913l, EnumC4375l.f8907l));
    public static final C10136l inmobi;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final int f7461native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final C1858l f7462package;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static final long f7463private;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static final C4835l f7464strictfp;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final C11983l f7465synchronized;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final C16928l f7466throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final C11983l f7467volatile;
    public final C17219l Signature;
    public C12158l ad;
    public final C13904l ads;
    public C17651l advert;
    public final ExecutorC7870l amazon;
    public final Executor crashlytics;
    public boolean isVip;
    public ScheduledFuture license;
    public final C13904l loadAd;
    public EnumC8920l metrica;
    public int premium;
    public C12158l pro;
    public final C11983l purchase;
    public C14722l tapsense;
    public C15691l vip;
    public final C13904l yandex;
    public final Object billing = new Object();
    public final C13904l mopub = new C13904l((Object) null);
    public EnumC4375l admob = EnumC4375l.f8909l;
    public EnumC4375l subs = null;
    public int isPro = 0;
    public boolean firebase = false;
    public C5680l smaato = null;
    public final ArrayList remoteconfig = new ArrayList();
    public Surface startapp = null;
    public Surface adcel = null;
    public C7025l subscription = null;
    public int signatures = 1;

    static {
        C18680l c18680l = C18680l.mopub;
        List listAsList = Arrays.asList(c18680l, C18680l.billing, C18680l.purchase);
        C13811l c13811l = C13811l.crashlytics;
        C10136l c10136lYandex = C10136l.yandex(listAsList, new C13811l(c18680l, 1));
        inmobi = c10136lYandex;
        C16928l c16928l = new C16928l(c10136lYandex, -1, "video/*");
        f7466throws = c16928l;
        f7462package = new C1858l(c16928l, -1);
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f7465synchronized = new C11983l();
        f7464strictfp = C15955l.f31327l;
        f7467volatile = new C11983l();
        new ExecutorC7870l(AbstractC12272l.mopub());
        f7461native = 3;
        f7463private = 1000L;
    }

    public C3551l(C1858l c1858l, C11983l c11983l, C11983l c11983l2, C11983l c11983l3) {
        String string;
        int i = 0;
        Uri uri = Uri.EMPTY;
        this.tapsense = null;
        this.Signature = new C17219l(60, (C11586l) null);
        this.premium = 3;
        this.license = null;
        this.ad = null;
        this.advert = null;
        this.isVip = false;
        ExecutorC17086l executorC17086lMopub = AbstractC12272l.mopub();
        this.crashlytics = executorC17086lMopub;
        ExecutorC7870l executorC7870l = new ExecutorC7870l(executorC17086lMopub);
        this.amazon = executorC7870l;
        int i2 = C16928l.amazon;
        C16928l c16928l = c1858l.yandex;
        int i3 = c1858l.loadAd;
        if (c16928l.loadAd == -1) {
            c16928l = new C16928l(c16928l.yandex, f7466throws.loadAd, c16928l.crashlytics);
        }
        this.ads = new C13904l(new C1858l(c16928l, i3));
        this.yandex = new C13904l(new C13629l(this.isPro, smaato(this.admob)));
        this.loadAd = new C13904l(Boolean.FALSE);
        this.purchase = c11983l;
        this.pro = new C12158l(c11983l, executorC7870l, executorC17086lMopub);
        StringBuilder sb = new StringBuilder("mRequiredFreeStorageBytes = ");
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = 5.24288E7d;
        double d2 = 5.24288E7d;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            string = decimalFormat.format(d2) + ' ' + strArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            while (-1 < i) {
                double dPow = Math.pow(1024.0d, i);
                double dFloor = Math.floor(d / dPow);
                if (dFloor > 0.0d) {
                    sb2.append(decimalFormat.format(dFloor));
                    sb2.append(" ");
                    sb2.append(strArr[i]);
                    sb2.append(" ");
                    d -= dFloor * dPow;
                }
                i--;
            }
            string = AbstractC12024l.m3330l(sb2).toString();
        }
        sb.append(string);
        AbstractC5088l.yandex("Recorder", sb.toString());
    }

    public static Object firebase(C13904l c13904l) {
        try {
            return c13904l.mopub().get();
        } catch (InterruptedException | ExecutionException e) {
            C11983l.ads(e);
            return null;
        }
    }

    public static C5012l isPro(int i, InterfaceC15879l interfaceC15879l) {
        C5012l c5012l;
        C4835l c4835l = f7464strictfp;
        LruCache lruCache = AbstractC5106l.yandex;
        C8688l c8688l = new C8688l(new C18695l(interfaceC15879l, i, c4835l, 0));
        if (interfaceC15879l instanceof C16057l) {
            C16057l c16057l = (C16057l) interfaceC15879l;
            InterfaceC15879l interfaceC15879l2 = c16057l.f27125l;
            if (!interfaceC15879l2.amazon() && interfaceC15879l2.metrica() != -1) {
                C2556l c2556l = new C2556l(c16057l.f27125l.mopub(), c16057l.f31460l, i, c4835l);
                LruCache lruCache2 = AbstractC5106l.yandex;
                synchronized (lruCache2) {
                    c5012l = (C5012l) lruCache2.get(c2556l);
                    if (c5012l == null) {
                        c5012l = (C5012l) c8688l.getValue();
                        lruCache2.put(c2556l, c5012l);
                    }
                }
                return c5012l;
            }
        }
        return (C5012l) c8688l.getValue();
    }

    public static int smaato(EnumC4375l enumC4375l) {
        return (enumC4375l == EnumC4375l.f8910l || enumC4375l == EnumC4375l.f8913l) ? 1 : 2;
    }

    public static void vip(C7025l c7025l) {
        if (AbstractC2812l.advert(c7025l)) {
            AbstractC5088l.yandex(c7025l.yandex, "signalSourceStopped");
            c7025l.admob.execute(new RunnableC5229l(c7025l, 3));
        }
    }

    public final void Signature(int i) {
        if (this.isPro == i) {
            return;
        }
        AbstractC5088l.yandex("Recorder", "Transitioning streamId: " + this.isPro + " --> " + i);
        this.isPro = i;
        this.yandex.smaato(new C13629l(i, smaato(this.admob)));
    }

    public final void adcel() {
        if (this.subscription != null) {
            AbstractC5088l.yandex("Recorder", "Releasing video encoder.");
            C12158l c12158l = this.ad;
            if (c12158l != null) {
                AbstractC5641l.purchase(null, ((C7025l) c12158l.billing) == this.subscription);
                AbstractC5088l.yandex("Recorder", "Releasing video encoder: " + this.subscription);
                this.ad.crashlytics();
                this.ad = null;
                this.subscription = null;
                subscription(null);
            } else {
                ads();
            }
        }
        synchronized (this.billing) {
            try {
                switch (this.admob.ordinal()) {
                    case 1:
                    case 2:
                        pro(EnumC4375l.f8909l);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        tapsense(EnumC4375l.f8909l);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C15691l c15691l = this.vip;
        if (c15691l == null || c15691l.admob.f32512l.isDone()) {
            return;
        }
        subs(this.vip, this.metrica, false);
    }

    @Override // defpackage.InterfaceC14105l
    public final void admob(C15691l c15691l, EnumC8920l enumC8920l, boolean z) {
        synchronized (this.billing) {
            try {
                AbstractC5088l.yandex("Recorder", "Surface is requested in state: " + this.admob + ", Current surface: " + this.isPro);
                if (this.admob == EnumC4375l.f8907l) {
                    tapsense(EnumC4375l.f8909l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.amazon.execute(new RunnableC14553l(this, c15691l, enumC8920l, z, 2));
    }

    public final ListenableFuture ads() {
        AbstractC5088l.yandex("Recorder", "Try to safely release video encoder: " + this.subscription);
        C12158l c12158l = this.pro;
        c12158l.yandex();
        return AbstractC11356l.admob((ListenableFuture) c12158l.subs);
    }

    @Override // defpackage.InterfaceC14105l
    public final void amazon(int i) {
        this.amazon.execute(new RunnableC9534l(this, i, 8));
    }

    @Override // defpackage.InterfaceC14105l
    public final InterfaceC10367l billing() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC14105l
    public final InterfaceC10367l crashlytics() {
        return this.ads;
    }

    public final void license(int i, IOException iOException) {
        if (this.firebase) {
            return;
        }
        this.firebase = true;
        if (!remoteconfig()) {
            C14722l c14722l = this.tapsense;
            if (c14722l != null) {
                c14722l.close();
                this.tapsense = null;
            }
            int i2 = 2;
            if (this.premium != 2) {
                RunnableC15875l runnableC15875l = new RunnableC15875l(6);
                this.license = AbstractC12272l.admob().schedule(new RunnableC10311l(this.amazon, runnableC15875l, 7), 1000L, TimeUnit.MILLISECONDS);
            } else {
                vip(this.subscription);
            }
            C7025l c7025l = this.subscription;
            c7025l.admob.execute(new RunnableC2963l(c7025l, c7025l.adcel.crashlytics(), i2));
            return;
        }
        while (true) {
            C17219l c17219l = this.Signature;
            if (c17219l.m4284else()) {
                throw null;
            }
            ((C14722l) c17219l.license()).close();
        }
    }

    @Override // defpackage.InterfaceC14105l
    public final InterfaceC15853l loadAd(int i, InterfaceC15879l interfaceC15879l) {
        int i2 = i == 1 ? 2 : 1;
        String str = ((C1858l) firebase(this.ads)).yandex.crashlytics;
        InterfaceC15879l interfaceC15879l2 = interfaceC15879l;
        return "video/*".equals(str) ? new C10975l(isPro(i2, interfaceC15879l), interfaceC15879l2) : new C18449l(str, interfaceC15879l2, f7464strictfp);
    }

    public final void metrica(int i, IOException iOException) {
        boolean z;
        synchronized (this.billing) {
            try {
                z = false;
                switch (this.admob.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.admob);
                    case 4:
                    case 5:
                        tapsense(EnumC4375l.f8913l);
                        z = true;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            license(i, iOException);
        }
    }

    @Override // defpackage.InterfaceC14105l
    public final boolean mopub() {
        return ((C1858l) firebase(this.ads)).yandex.yandex == inmobi;
    }

    public final void pro(EnumC4375l enumC4375l) {
        if (!applovin.contains(this.admob)) {
            C11983l.license(this.admob, "Can only updated non-pending state from a pending state, but state is ");
            return;
        }
        if (!appmetrica.contains(enumC4375l)) {
            C11983l.firebase(enumC4375l, "Invalid state transition. State is not a valid non-pending state while in a pending state: ");
        } else if (this.subs != enumC4375l) {
            this.subs = enumC4375l;
            this.yandex.smaato(new C13629l(this.isPro, smaato(enumC4375l)));
        }
    }

    @Override // defpackage.InterfaceC14105l
    public final InterfaceC10367l purchase() {
        return this.yandex;
    }

    public final boolean remoteconfig() {
        return this.signatures == 4;
    }

    public final void startapp() {
        boolean z;
        boolean z2;
        synchronized (this.billing) {
            try {
                z = false;
                switch (this.admob.ordinal()) {
                    case 1:
                    case 2:
                        pro(EnumC4375l.f8906l);
                    case 0:
                    case 3:
                    case 8:
                        z2 = false;
                        z = true;
                        break;
                    case 4:
                    case 5:
                        AbstractC5641l.purchase("In-progress recording shouldn't be null when in state " + this.admob, false);
                        tapsense(EnumC4375l.f8906l);
                        z2 = true;
                        break;
                    case 6:
                        tapsense(EnumC4375l.f8906l);
                        z2 = false;
                        break;
                    case 7:
                    default:
                        z2 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            if (z2) {
                license(4, null);
                return;
            }
            return;
        }
        AbstractC5088l.yandex("Recorder", "Transitioning audio state: " + AbstractC4338l.m1530for(this.signatures) + " --> " + AbstractC4338l.m1530for(1));
        this.signatures = 1;
        adcel();
    }

    public final void subs(C15691l c15691l, EnumC8920l enumC8920l, boolean z) {
        if (c15691l.admob.f32512l.isDone()) {
            AbstractC5088l.tapsense("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        C11983l c11983l = new C11983l(this);
        ExecutorC7870l executorC7870l = this.amazon;
        c15691l.loadAd(executorC7870l, c11983l);
        Size size = c15691l.loadAd;
        C4805l c4805lYandex = yandex(c15691l.mopub, c15691l.purchase.loadAd()).yandex(c15691l.crashlytics);
        this.smaato = c4805lYandex != null ? c4805lYandex.yandex(size) : null;
        AbstractC5088l.yandex("Recorder", "mResolvedEncoderProfiles = " + this.smaato);
        C17651l c17651l = this.advert;
        if (c17651l != null && !c17651l.f34334l) {
            c17651l.f34334l = true;
            ScheduledFuture scheduledFuture = (ScheduledFuture) c17651l.f34340l;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                c17651l.f34340l = null;
            }
        }
        boolean z2 = this.isVip;
        int i = z ? f7461native : 0;
        C17651l c17651l2 = new C17651l();
        c17651l2.f34335l = this;
        c17651l2.f34334l = false;
        c17651l2.f34336l = 0;
        c17651l2.f34340l = null;
        c17651l2.f34339l = c15691l;
        c17651l2.f34338l = enumC8920l;
        this.isVip = z2;
        c17651l2.f34337l = i;
        this.advert = c17651l2;
        ads().yandex(new RunnableC15278l(c17651l2, c15691l, enumC8920l, 3), executorC7870l);
    }

    public final void subscription(Surface surface) {
        int iHashCode;
        if (this.startapp == surface) {
            return;
        }
        this.startapp = surface;
        synchronized (this.billing) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            Signature(iHashCode);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    public final void tapsense(EnumC4375l enumC4375l) {
        int iSmaato;
        if (this.admob == enumC4375l) {
            throw new AssertionError("Attempted to transition to state " + enumC4375l + ", but Recorder is already in state " + enumC4375l);
        }
        AbstractC5088l.yandex("Recorder", "Transitioning Recorder internal state: " + this.admob + " --> " + enumC4375l);
        Set set = applovin;
        if (set.contains(enumC4375l)) {
            if (!set.contains(this.admob)) {
                boolean zContains = appmetrica.contains(this.admob);
                EnumC4375l enumC4375l2 = this.admob;
                if (!zContains) {
                    C11983l.firebase(enumC4375l2, "Invalid state transition. Should not be transitioning to a PENDING state from state ");
                    return;
                } else {
                    this.subs = enumC4375l2;
                    iSmaato = smaato(enumC4375l2);
                }
            }
            this.admob = enumC4375l;
            if (iSmaato == 0) {
                iSmaato = smaato(enumC4375l);
            }
            this.yandex.smaato(new C13629l(this.isPro, iSmaato));
        }
        if (this.subs != null) {
            this.subs = null;
        }
        iSmaato = 0;
        this.admob = enumC4375l;
        if (iSmaato == 0) {
            iSmaato = smaato(enumC4375l);
        }
        this.yandex.smaato(new C13629l(this.isPro, iSmaato));
    }

    @Override // defpackage.InterfaceC14105l
    public final C5012l yandex(int i, InterfaceC15879l interfaceC15879l) {
        return isPro(i == 1 ? 2 : 1, interfaceC15879l);
    }
}
