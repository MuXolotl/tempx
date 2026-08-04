package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: renamed from: lٜٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1185l extends AbstractC6285l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C11154l f3178l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f3179l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C11154l f3180l;

    public C1185l(C17417l c17417l) {
        super(c17417l);
        this.f3180l = new C11154l(0);
        this.f3178l = new C11154l(0);
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final void m844l(String str, long j, C6373l c6373l) {
        C17417l c17417l = (C17417l) this.f833l;
        if (c6373l == null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.yandex("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16911l.loadAd(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C17410l.m4338l(c6373l, bundle, true);
            C11675l c11675l = c17417l.f33927l;
            C17417l.mopub(c11675l);
            c11675l.m3196l("am", "_xu", bundle);
        }
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void m845l(long j, C6373l c6373l) {
        C17417l c17417l = (C17417l) this.f833l;
        if (c6373l == null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.yandex("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16911l.loadAd(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C17410l.m4338l(c6373l, bundle, true);
            C11675l c11675l = c17417l.f33927l;
            C17417l.mopub(c11675l);
            c11675l.m3196l("am", "_xa", bundle);
        }
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final void m846l(long j) {
        C11154l c11154l = this.f3178l;
        Iterator it = ((C5386l) c11154l.keySet()).iterator();
        while (it.hasNext()) {
            c11154l.put((String) it.next(), Long.valueOf(j));
        }
        if (c11154l.isEmpty()) {
            return;
        }
        this.f3179l = j;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final void m847l(long j) {
        C3148l c3148l = ((C17417l) this.f833l).f33948l;
        C17417l.mopub(c3148l);
        C6373l c6373lM1294l = c3148l.m1294l(false);
        C11154l c11154l = this.f3178l;
        for (String str : (C5386l) c11154l.keySet()) {
            m844l(str, j - ((Long) c11154l.get(str)).longValue(), c6373lM1294l);
        }
        if (!c11154l.isEmpty()) {
            m845l(j - this.f3179l, c6373lM1294l);
        }
        m846l(j);
    }

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public final void m848l(long j, String str) {
        C17417l c17417l = (C17417l) this.f833l;
        if (str == null || str.length() == 0) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Ad unit id must be a non-empty string");
        } else {
            C17923l c17923l = c17417l.f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(new RunnableC17133l(this, str, j, 1));
        }
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final void m849l(long j, String str) {
        C17417l c17417l = (C17417l) this.f833l;
        if (str == null || str.length() == 0) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Ad unit id must be a non-empty string");
        } else {
            C17923l c17923l = c17417l.f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(new RunnableC17133l(this, str, j, 0));
        }
    }
}
