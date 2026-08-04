package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؙۥ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6882l implements InterfaceC3128l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f14413l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13708l f14414l;

    public C6882l(List list, List list2) {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        AbstractC12442l.admob(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            c16971lMetrica.crashlytics(new C2087l((InterfaceC3128l) list.get(i), (List) list2.get(i)));
        }
        this.f14414l = c16971lMetrica.mopub();
        this.f14413l = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean adcel(C11495l c11495l) {
        boolean zAdcel;
        boolean z = false;
        do {
            long jBilling = billing();
            if (jBilling == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zAdcel = false;
            while (true) {
                C13708l c13708l = this.f14414l;
                if (i >= c13708l.f26765l) {
                    break;
                }
                long jBilling2 = ((C2087l) c13708l.get(i)).f4677l.billing();
                boolean z2 = jBilling2 != Long.MIN_VALUE && jBilling2 <= c11495l.yandex;
                if (jBilling2 == jBilling || z2) {
                    zAdcel |= ((C2087l) c13708l.get(i)).f4677l.adcel(c11495l);
                }
                i++;
            }
            z |= zAdcel;
        } while (zAdcel);
        return z;
    }

    @Override // defpackage.InterfaceC3128l
    public final long ads() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            C13708l c13708l = this.f14414l;
            if (i >= c13708l.f26765l) {
                break;
            }
            C2087l c2087l = (C2087l) c13708l.get(i);
            long jAds = c2087l.f4677l.ads();
            AbstractC1186l abstractC1186l = c2087l.f4676l;
            if ((abstractC1186l.contains(1) || abstractC1186l.contains(2) || abstractC1186l.contains(4)) && jAds != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jAds);
            }
            if (jAds != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jAds);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f14413l = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f14413l;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean amazon() {
        int i = 0;
        while (true) {
            C13708l c13708l = this.f14414l;
            if (i >= c13708l.f26765l) {
                return false;
            }
            if (((C2087l) c13708l.get(i)).f4677l.amazon()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC3128l
    public final long billing() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            C13708l c13708l = this.f14414l;
            if (i >= c13708l.f26765l) {
                break;
            }
            long jBilling = ((C2087l) c13708l.get(i)).f4677l.billing();
            if (jBilling != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jBilling);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.InterfaceC3128l
    public final void license(long j) {
        int i = 0;
        while (true) {
            C13708l c13708l = this.f14414l;
            if (i >= c13708l.f26765l) {
                return;
            }
            ((C2087l) c13708l.get(i)).license(j);
            i++;
        }
    }
}
