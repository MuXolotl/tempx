package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1994l implements InterfaceC14090l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f4507l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f4508l = new ArrayList(1);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f4509l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C2432l f4510l;

    public AbstractC1994l(boolean z) {
        this.f4509l = z;
    }

    public final void adcel() {
        for (int i = 0; i < this.f4507l; i++) {
            ((C7713l) this.f4508l.get(i)).getClass();
        }
    }

    public final void ads(C2432l c2432l) {
        this.f4510l = c2432l;
        for (int i = 0; i < this.f4507l; i++) {
            C7713l c7713l = (C7713l) this.f4508l.get(i);
            boolean z = this.f4509l;
            synchronized (c7713l) {
                try {
                    C13708l c13708l = C7713l.startapp;
                    if (z && (c2432l.subs & 8) != 8) {
                        if (c7713l.mopub == 0) {
                            c7713l.amazon.getClass();
                            c7713l.admob = SystemClock.elapsedRealtime();
                        }
                        c7713l.mopub++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void firebase(int i) {
        C2432l c2432l = this.f4510l;
        String str = AbstractC15323l.yandex;
        for (int i2 = 0; i2 < this.f4507l; i2++) {
            C7713l c7713l = (C7713l) this.f4508l.get(i2);
            boolean z = this.f4509l;
            synchronized (c7713l) {
                C13708l c13708l = C7713l.startapp;
                if (z && (c2432l.subs & 8) != 8) {
                    c7713l.subs += (long) i;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC14090l
    public Map isPro() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.InterfaceC14090l
    public final void metrica(C7713l c7713l) {
        c7713l.getClass();
        ArrayList arrayList = this.f4508l;
        if (arrayList.contains(c7713l)) {
            return;
        }
        arrayList.add(c7713l);
        this.f4507l++;
    }

    public final void startapp() {
        C2432l c2432l = this.f4510l;
        String str = AbstractC15323l.yandex;
        for (int i = 0; i < this.f4507l; i++) {
            C7713l c7713l = (C7713l) this.f4508l.get(i);
            boolean z = this.f4509l;
            synchronized (c7713l) {
                try {
                    C13708l c13708l = C7713l.startapp;
                    if (z && (c2432l.subs & 8) != 8) {
                        AbstractC12442l.subscription(c7713l.mopub > 0);
                        c7713l.amazon.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (jElapsedRealtime - c7713l.admob);
                        c7713l.isPro += (long) i2;
                        long j = c7713l.firebase;
                        long j2 = c7713l.subs;
                        c7713l.firebase = j + j2;
                        if (i2 > 0) {
                            c7713l.billing.yandex((int) Math.sqrt(j2), (j2 * 8000.0f) / i2);
                            if (c7713l.isPro >= 2000 || c7713l.firebase >= 524288) {
                                c7713l.smaato = (long) c7713l.billing.subs();
                            }
                            c7713l.loadAd(i2, c7713l.subs, c7713l.smaato);
                            c7713l.admob = jElapsedRealtime;
                            c7713l.subs = 0L;
                        }
                        c7713l.mopub--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f4510l = null;
    }
}
