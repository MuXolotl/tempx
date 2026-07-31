package androidx.recyclerview.widget;

import android.os.Trace;
import defpackage.AbstractC14366l;
import defpackage.C13617l;
import defpackage.C16225l;
import defpackage.C5932l;
import defpackage.C8339l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class amazon implements Runnable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final ThreadLocal f453l = new ThreadLocal();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C13617l f454l = new C13617l(23);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f455l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f456l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f457l = new ArrayList();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayList f458l = new ArrayList();

    public static metrica crashlytics(RecyclerView recyclerView, int i, long j) {
        int iAdmob = recyclerView.mChildHelper.admob();
        for (int i2 = 0; i2 < iAdmob; i2++) {
            metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mopub(i2));
            if (childViewHolderInt.crashlytics == i && !childViewHolderInt.admob()) {
                return null;
            }
        }
        firebase firebaseVar = recyclerView.mRecycler;
        if (j == Long.MAX_VALUE) {
            try {
                if (AbstractC14366l.yandex()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        metrica metricaVarSmaato = firebaseVar.smaato(i, j);
        if (metricaVarSmaato != null) {
            if (!metricaVarSmaato.mopub() || metricaVarSmaato.admob()) {
                firebaseVar.yandex(metricaVarSmaato, false);
            } else {
                firebaseVar.subs(metricaVarSmaato.yandex);
            }
        }
        return metricaVarSmaato;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void loadAd(long j) {
        C16225l c16225l;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C16225l c16225l2;
        ArrayList arrayList = this.f457l;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.loadAd(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.amazon;
            }
        }
        ArrayList arrayList2 = this.f458l;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                crashlytics crashlyticsVar = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(crashlyticsVar.loadAd) + Math.abs(crashlyticsVar.yandex);
                for (?? r11 = z; r11 < crashlyticsVar.amazon * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        c16225l2 = new C16225l();
                        arrayList2.add(c16225l2);
                    } else {
                        c16225l2 = (C16225l) arrayList2.get(i4);
                    }
                    int[] iArr = crashlyticsVar.crashlytics;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    c16225l2.yandex = z;
                    c16225l2.loadAd = iAbs;
                    c16225l2.crashlytics = i5;
                    c16225l2.amazon = recyclerView4;
                    c16225l2.purchase = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f454l);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (c16225l = (C16225l) arrayList2.get(i6)).amazon) != null; i6++) {
            metrica metricaVarCrashlytics = crashlytics(recyclerView, c16225l.purchase, c16225l.yandex ? Long.MAX_VALUE : j);
            if (metricaVarCrashlytics != null && metricaVarCrashlytics.loadAd != null && metricaVarCrashlytics.mopub() && !metricaVarCrashlytics.admob() && (recyclerView2 = (RecyclerView) metricaVarCrashlytics.loadAd.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.admob() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                crashlytics crashlyticsVar2 = recyclerView2.mPrefetchRegistry;
                crashlyticsVar2.loadAd(recyclerView2, true);
                if (crashlyticsVar2.amazon != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C5932l c5932l = recyclerView2.mState;
                        subs subsVar = recyclerView2.mAdapter;
                        c5932l.amazon = 1;
                        c5932l.purchase = subsVar.mopub();
                        c5932l.mopub = false;
                        c5932l.admob = false;
                        c5932l.subs = false;
                        for (int i7 = 0; i7 < crashlyticsVar2.amazon * 2; i7 += 2) {
                            crashlytics(recyclerView2, crashlyticsVar2.crashlytics[i7], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c16225l.yandex = false;
            c16225l.loadAd = 0;
            c16225l.crashlytics = 0;
            c16225l.amazon = null;
            c16225l.purchase = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f457l;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    loadAd(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f455l);
                }
            }
        } finally {
            this.f456l = 0L;
            Trace.endSection();
        }
    }

    public final void yandex(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f457l.contains(recyclerView)) {
                C8339l.smaato("attempting to post unregistered view!");
                return;
            } else if (this.f456l == 0) {
                this.f456l = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        crashlytics crashlyticsVar = recyclerView.mPrefetchRegistry;
        crashlyticsVar.yandex = i;
        crashlyticsVar.loadAd = i2;
    }
}
