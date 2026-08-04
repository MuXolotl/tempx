package defpackage;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lؙٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13985l {
    public final ArrayDeque admob;
    public ArrayList amazon;
    public final C11228l billing;
    public final C17186l crashlytics;
    public BasePendingResult firebase;
    public final C0446l isPro;
    public long loadAd;
    public final ArrayList mopub;
    public final SparseIntArray purchase;
    public BasePendingResult smaato;
    public final HandlerC4052l subs;
    public final Set remoteconfig = DesugarCollections.synchronizedSet(new HashSet());
    public final C0022l yandex = new C0022l("MediaQueue", null);

    public C13985l(C17186l c17186l) {
        this.crashlytics = c17186l;
        Math.max(20, 1);
        this.amazon = new ArrayList();
        this.purchase = new SparseIntArray();
        this.mopub = new ArrayList();
        this.admob = new ArrayDeque(20);
        this.subs = new HandlerC4052l(Looper.getMainLooper(), 6);
        this.isPro = new C0446l(this);
        C7801l c7801l = new C7801l(0, this);
        AbstractC1051l.purchase("Must be called from the main thread.");
        c17186l.admob.add(c7801l);
        this.billing = new C11228l(this);
        this.loadAd = purchase();
        loadAd();
    }

    public final void admob() {
        Set set = this.remoteconfig;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void amazon() {
        Set set = this.remoteconfig;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void billing() {
        Set set = this.remoteconfig;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void crashlytics() {
        SparseIntArray sparseIntArray = this.purchase;
        sparseIntArray.clear();
        for (int i = 0; i < this.amazon.size(); i++) {
            sparseIntArray.put(((Integer) this.amazon.get(i)).intValue(), i);
        }
    }

    public final void loadAd() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResultStartapp;
        AbstractC1051l.purchase("Must be called from the main thread.");
        if (this.loadAd != 0 && (basePendingResult = this.smaato) == null) {
            if (basePendingResult != null) {
                basePendingResult.yandex();
                this.smaato = null;
            }
            BasePendingResult basePendingResult2 = this.firebase;
            if (basePendingResult2 != null) {
                basePendingResult2.yandex();
                this.firebase = null;
            }
            C17186l c17186l = this.crashlytics;
            c17186l.getClass();
            AbstractC1051l.purchase("Must be called from the main thread.");
            if (c17186l.adcel()) {
                C6528l c6528l = new C6528l(c17186l, 2);
                C17186l.ads(c6528l);
                basePendingResultStartapp = c6528l;
            } else {
                basePendingResultStartapp = C17186l.startapp();
            }
            this.smaato = basePendingResultStartapp;
            basePendingResultStartapp.mopub(new C3988l(this, 1));
        }
    }

    public final void mopub() {
        Set set = this.remoteconfig;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final long purchase() {
        C10184l c10184lCrashlytics = this.crashlytics.crashlytics();
        if (c10184lCrashlytics == null) {
            return 0L;
        }
        MediaInfo mediaInfo = c10184lCrashlytics.f20756l;
        int i = mediaInfo == null ? -1 : mediaInfo.f550l;
        int i2 = c10184lCrashlytics.f20761l;
        int i3 = c10184lCrashlytics.f20765l;
        int i4 = c10184lCrashlytics.f20763l;
        if (i2 == 1) {
            if (i3 == 1) {
                if (i4 == 0) {
                    return 0L;
                }
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return 0L;
                }
                if (i4 == 0) {
                    return 0L;
                }
            } else if (i != 2) {
                return 0L;
            }
        }
        return c10184lCrashlytics.f20755l;
    }

    public final void yandex() {
        billing();
        this.amazon.clear();
        this.purchase.clear();
        this.billing.evictAll();
        this.mopub.clear();
        this.subs.removeCallbacks(this.isPro);
        this.admob.clear();
        BasePendingResult basePendingResult = this.smaato;
        if (basePendingResult != null) {
            basePendingResult.yandex();
            this.smaato = null;
        }
        BasePendingResult basePendingResult2 = this.firebase;
        if (basePendingResult2 != null) {
            basePendingResult2.yandex();
            this.firebase = null;
        }
        admob();
        mopub();
    }
}
