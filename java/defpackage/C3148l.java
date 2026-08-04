package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lؕؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3148l extends AbstractC10618l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final Object f6763l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final ConcurrentHashMap f6764l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C8066l f6765l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public volatile C6373l f6766l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile C6373l f6767l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public volatile C6373l f6768l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f6769l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public volatile boolean f6770l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C6373l f6771l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C6373l f6772l;

    public C3148l(C17417l c17417l) {
        super(c17417l);
        this.f6763l = new Object();
        this.f6764l = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final void m1292l(String str, C6373l c6373l, boolean z) {
        C6373l c6373l2;
        C6373l c6373l3 = this.f6768l == null ? this.f6767l : this.f6768l;
        if (c6373l.loadAd == null) {
            c6373l2 = new C6373l(c6373l.yandex, str != null ? m1293l(str) : null, c6373l.crashlytics, c6373l.purchase, c6373l.billing, c6373l.mopub);
        } else {
            c6373l2 = c6373l;
        }
        this.f6767l = this.f6768l;
        this.f6768l = c6373l2;
        C17417l c17417l = (C17417l) this.f833l;
        c17417l.f33951l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC12206l(this, c6373l2, c6373l3, jElapsedRealtime, z));
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final String m1293l(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        C17417l c17417l = (C17417l) this.f833l;
        int length2 = str2.length();
        c17417l.f33945l.getClass();
        if (length2 <= 500) {
            return str2;
        }
        c17417l.f33945l.getClass();
        return str2.substring(0, 500);
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final C6373l m1294l(boolean z) {
        m2935l();
        mo211l();
        C6373l c6373l = this.f6771l;
        return (z && c6373l == null) ? this.f6772l : c6373l;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final void m1295l(C6373l c6373l, C6373l c6373l2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        long jElapsedRealtime;
        Bundle bundle2;
        boolean z3 = c6373l.purchase;
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        boolean z4 = false;
        if (c6373l2 != null) {
            if (c6373l2.crashlytics == c6373l.crashlytics && Objects.equals(c6373l2.loadAd, c6373l.loadAd) && Objects.equals(c6373l2.yandex, c6373l.yandex)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.f6771l != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            C17410l.m4338l(c6373l, bundle3, true);
            if (c6373l2 != null) {
                String str = c6373l2.yandex;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = c6373l2.loadAd;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", c6373l2.crashlytics);
            }
            if (z4) {
                C11569l c11569l = c17417l.f33932l;
                C17417l.mopub(c11569l);
                C16528l c16528l = c11569l.f23238l;
                long j3 = j - c16528l.f32306l;
                c16528l.f32306l = j;
                if (j3 > 0) {
                    C17410l c17410l = c17417l.f33949l;
                    C17417l.billing(c17410l);
                    c17410l.m4355l(bundle3, j3);
                }
            }
            C5051l c5051l = c17417l.f33945l;
            C18450l c18450l = c17417l.f33951l;
            if (!c5051l.m1677l()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            c18450l.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = c6373l.billing;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12677l)) {
                c18450l.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime();
            } else {
                jElapsedRealtime = 0;
            }
            if (z3) {
                bundle2 = bundle3;
                long j5 = c6373l.mopub;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            C11675l c11675l = c17417l.f33927l;
            C17417l.mopub(c11675l);
            c11675l.m3186l(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            m1298l(this.f6771l, true, j);
        }
        this.f6771l = c6373l;
        if (z3) {
            this.f6772l = c6373l;
        }
        C11860l c11860lFirebase = c17417l.firebase();
        c11860lFirebase.mo211l();
        c11860lFirebase.m2935l();
        c11860lFirebase.m3267l(new RunnableC16301l(c11860lFirebase, c6373l));
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final C6373l m1296l(C8066l c8066l) {
        AbstractC1051l.subs(c8066l);
        Integer numValueOf = Integer.valueOf(c8066l.f16803l);
        ConcurrentHashMap concurrentHashMap = this.f6764l;
        C6373l c6373l = (C6373l) concurrentHashMap.get(numValueOf);
        if (c6373l == null) {
            String strM1293l = m1293l(c8066l.f16802l);
            C17410l c17410l = ((C17417l) this.f833l).f33949l;
            C17417l.billing(c17410l);
            C6373l c6373l2 = new C6373l(c17410l.m4378l(), null, strM1293l);
            concurrentHashMap.put(numValueOf, c6373l2);
            c6373l = c6373l2;
        }
        return this.f6766l != null ? this.f6766l : c6373l;
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final void m1297l(C8066l c8066l, Bundle bundle) {
        Bundle bundle2;
        if (!((C17417l) this.f833l).f33945l.m1677l() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f6764l.put(Integer.valueOf(c8066l.f16803l), new C6373l(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final void m1298l(C6373l c6373l, boolean z, long j) {
        C17417l c17417l = (C17417l) this.f833l;
        C1185l c1185l = c17417l.f33952l;
        C17417l.purchase(c1185l);
        c17417l.f33951l.getClass();
        c1185l.m847l(SystemClock.elapsedRealtime());
        boolean z2 = c6373l != null && c6373l.amazon;
        C11569l c11569l = c17417l.f33932l;
        C17417l.mopub(c11569l);
        if (!c11569l.f23238l.subs(j, z2, z) || c6373l == null) {
            return;
        }
        c6373l.amazon = false;
    }

    @Override // defpackage.AbstractC10618l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final boolean mo1234l() {
        return false;
    }
}
