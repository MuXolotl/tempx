package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: lٔۦٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15316l implements InterfaceC15402l, InterfaceC1534l, InterfaceC18230l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final String f29932l = C14513l.applovin("GreedyScheduler");

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C3307l f29933l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C0375l f29934l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C5648l f29935l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C5633l f29936l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f29938l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f29941l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C14637l f29942l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C12211l f29943l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Boolean f29945l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C10038l f29946l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HashMap f29937l = new HashMap();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f29940l = new Object();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C13568l f29944l = new C13568l(new C13161l(27, false));

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final HashMap f29939l = new HashMap();

    public C15316l(Context context, C12211l c12211l, C13312l c13312l, C5648l c5648l, C5633l c5633l, C3307l c3307l) {
        this.f29938l = context;
        C5008l c5008l = c12211l.mopub;
        this.f29934l = new C0375l(this, c5008l, c12211l.amazon);
        this.f29946l = new C10038l(c5008l, c5633l);
        this.f29933l = c3307l;
        this.f29942l = new C14637l(c13312l);
        this.f29943l = c12211l;
        this.f29935l = c5648l;
        this.f29936l = c5633l;
    }

    @Override // defpackage.InterfaceC15402l
    public final void amazon(String str) {
        List<C10771l> listM3587throws;
        Runnable runnable;
        String str2 = f29932l;
        if (this.f29945l == null) {
            this.f29945l = Boolean.valueOf(AbstractC12901l.yandex(this.f29938l));
        }
        if (!this.f29945l.booleanValue()) {
            C14513l.tapsense().isVip(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f29941l) {
            this.f29935l.yandex(this);
            this.f29941l = true;
        }
        C14513l.tapsense().vip(str2, "Cancelling work ID " + str);
        C0375l c0375l = this.f29934l;
        if (c0375l != null && (runnable = (Runnable) c0375l.amazon.remove(str)) != null) {
            ((Handler) c0375l.loadAd.f10245l).removeCallbacks(runnable);
        }
        C13568l c13568l = this.f29944l;
        synchronized (c13568l.f26580l) {
            listM3587throws = ((C13161l) c13568l.f26581l).m3587throws(str);
        }
        for (C10771l c10771l : listM3587throws) {
            this.f29946l.m2851interface(c10771l);
            this.f29936l.loadAd(c10771l, -512);
        }
    }

    public final void billing(C0350l c0350l) {
        InterfaceC7042l interfaceC7042l;
        synchronized (this.f29940l) {
            interfaceC7042l = (InterfaceC7042l) this.f29937l.remove(c0350l);
        }
        if (interfaceC7042l != null) {
            C14513l.tapsense().vip(f29932l, "Stopping tracking for " + c0350l);
            interfaceC7042l.ads(null);
        }
    }

    @Override // defpackage.InterfaceC15402l
    public final boolean crashlytics() {
        return false;
    }

    @Override // defpackage.InterfaceC18230l
    public final void loadAd(C0350l c0350l, boolean z) {
        C10771l c10771lAds = this.f29944l.ads(c0350l);
        if (c10771lAds != null) {
            this.f29946l.m2851interface(c10771lAds);
        }
        billing(c0350l);
        if (z) {
            return;
        }
        synchronized (this.f29940l) {
            this.f29939l.remove(c0350l);
        }
    }

    public final long mopub(C7718l c7718l) {
        long jMax;
        synchronized (this.f29940l) {
            try {
                C0350l c0350lIsPro = AbstractC3605l.isPro(c7718l);
                C17470l c17470l = (C17470l) this.f29939l.get(c0350lIsPro);
                if (c17470l == null) {
                    int i = c7718l.firebase;
                    this.f29943l.amazon.getClass();
                    c17470l = new C17470l(i, System.currentTimeMillis());
                    this.f29939l.put(c0350lIsPro, c17470l);
                }
                jMax = (((long) Math.max((c7718l.firebase - c17470l.yandex) - 5, 0)) * 30000) + c17470l.loadAd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }

    @Override // defpackage.InterfaceC15402l
    public final void purchase(C7718l... c7718lArr) {
        InterfaceC14029l interfaceC14029l;
        C15316l c15316l;
        if (this.f29945l == null) {
            this.f29945l = Boolean.valueOf(AbstractC12901l.yandex(this.f29938l));
        }
        if (!this.f29945l.booleanValue()) {
            C14513l.tapsense().isVip(f29932l, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f29941l) {
            this.f29935l.yandex(this);
            this.f29941l = true;
        }
        HashSet<C7718l> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int length = c7718lArr.length;
        int i = 0;
        while (true) {
            interfaceC14029l = null;
            if (i >= length) {
                break;
            }
            C7718l c7718l = c7718lArr[i];
            if (!this.f29944l.firebase(AbstractC3605l.isPro(c7718l))) {
                long jMax = Math.max(c7718l.yandex(), mopub(c7718l));
                this.f29943l.amazon.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c7718l.loadAd == EnumC9176l.f18878l) {
                    if (jCurrentTimeMillis < jMax) {
                        C0375l c0375l = this.f29934l;
                        if (c0375l != null) {
                            C5008l c5008l = c0375l.loadAd;
                            HashMap map = c0375l.amazon;
                            Runnable runnable = (Runnable) map.remove(c7718l.yandex);
                            if (runnable != null) {
                                ((Handler) c5008l.f10245l).removeCallbacks(runnable);
                            }
                            RunnableC9929l runnableC9929l = new RunnableC9929l(c0375l, c7718l, false, 8);
                            map.put(c7718l.yandex, runnableC9929l);
                            c0375l.crashlytics.getClass();
                            ((Handler) c5008l.f10245l).postDelayed(runnableC9929l, jMax - System.currentTimeMillis());
                        }
                    } else if (!AbstractC8576l.yandex(C13152l.isPro, c7718l.isPro)) {
                        C13152l c13152l = c7718l.isPro;
                        if (c13152l.amazon) {
                            C14513l.tapsense().vip(f29932l, "Ignoring " + c7718l + ". Requires device idle.");
                        } else if (Build.VERSION.SDK_INT < 24 || !c13152l.loadAd()) {
                            hashSet.add(c7718l);
                            hashSet2.add(c7718l.yandex);
                        } else {
                            C14513l.tapsense().vip(f29932l, "Ignoring " + c7718l + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f29944l.firebase(AbstractC3605l.isPro(c7718l))) {
                        C14513l.tapsense().vip(f29932l, "Starting work for " + c7718l.yandex);
                        C13568l c13568l = this.f29944l;
                        c13568l.getClass();
                        C10771l c10771lLicense = c13568l.license(AbstractC3605l.isPro(c7718l));
                        this.f29946l.m2852l(c10771lLicense);
                        this.f29936l.yandex(c10771lLicense, null);
                    }
                }
            }
            i++;
        }
        synchronized (this.f29940l) {
            try {
                if (!hashSet.isEmpty()) {
                    String strJoin = TextUtils.join(",", hashSet2);
                    C14513l.tapsense().vip(f29932l, "Starting tracking for " + strJoin);
                    for (C7718l c7718l2 : hashSet) {
                        C0350l c0350lIsPro = AbstractC3605l.isPro(c7718l2);
                        if (this.f29937l.containsKey(c0350lIsPro)) {
                            c15316l = this;
                        } else {
                            C14637l c14637l = this.f29942l;
                            AbstractC1872l abstractC1872l = this.f29933l.loadAd;
                            String str = AbstractC10076l.yandex;
                            c15316l = this;
                            c15316l.f29937l.put(c0350lIsPro, AbstractC10999l.mopub(AbstractC11990l.yandex(abstractC1872l), null, 0, new C0932l(c14637l, c7718l2, c15316l, interfaceC14029l, 16), 3));
                        }
                        this = c15316l;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC1534l
    public final void yandex(C7718l c7718l, AbstractC13306l abstractC13306l) {
        C0350l c0350lIsPro = AbstractC3605l.isPro(c7718l);
        boolean z = abstractC13306l instanceof C13487l;
        C5633l c5633l = this.f29936l;
        C10038l c10038l = this.f29946l;
        String str = f29932l;
        C13568l c13568l = this.f29944l;
        if (z) {
            if (c13568l.firebase(c0350lIsPro)) {
                return;
            }
            C14513l.tapsense().vip(str, "Constraints met: Scheduling work ID " + c0350lIsPro);
            C10771l c10771lLicense = c13568l.license(c0350lIsPro);
            c10038l.m2852l(c10771lLicense);
            c5633l.yandex(c10771lLicense, null);
            return;
        }
        C14513l.tapsense().vip(str, "Constraints not met: Cancelling work ID " + c0350lIsPro);
        C10771l c10771lAds = c13568l.ads(c0350lIsPro);
        if (c10771lAds != null) {
            c10038l.m2851interface(c10771lAds);
            c5633l.loadAd(c10771lAds, ((C7685l) abstractC13306l).yandex);
        }
    }
}
