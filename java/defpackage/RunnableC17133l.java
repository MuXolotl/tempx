package defpackage;

/* JADX INFO: renamed from: lٗٔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC17133l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f33316l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f33317l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33318l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C1185l f33319l;

    public /* synthetic */ RunnableC17133l(C1185l c1185l, String str, long j, int i) {
        this.f33318l = i;
        this.f33317l = str;
        this.f33316l = j;
        this.f33319l = c1185l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f33318l;
        long j = this.f33316l;
        String str = this.f33317l;
        C1185l c1185l = this.f33319l;
        switch (i) {
            case 0:
                c1185l.mo211l();
                AbstractC1051l.billing(str);
                C11154l c11154l = c1185l.f3180l;
                if (c11154l.isEmpty()) {
                    c1185l.f3179l = j;
                }
                Integer num = (Integer) c11154l.get(str);
                if (num != null) {
                    c11154l.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (c11154l.f11161l < 100) {
                    c11154l.put(str, 1);
                    c1185l.f3178l.put(str, Long.valueOf(j));
                } else {
                    C8118l c8118l = ((C17417l) c1185l.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16910l.yandex("Too many ads visible");
                }
                break;
            default:
                c1185l.mo211l();
                AbstractC1051l.billing(str);
                C11154l c11154l2 = c1185l.f3180l;
                Integer num2 = (Integer) c11154l2.get(str);
                C17417l c17417l = (C17417l) c1185l.f833l;
                if (num2 == null) {
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.loadAd(str, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    C3148l c3148l = c17417l.f33948l;
                    C8118l c8118l3 = c17417l.f33950l;
                    C17417l.mopub(c3148l);
                    C6373l c6373lM1294l = c3148l.m1294l(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c11154l2.put(str, Integer.valueOf(iIntValue));
                    } else {
                        c11154l2.remove(str);
                        C11154l c11154l3 = c1185l.f3178l;
                        Long l = (Long) c11154l3.get(str);
                        if (l == null) {
                            C17417l.admob(c8118l3);
                            c8118l3.f16908l.yandex("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            c11154l3.remove(str);
                            c1185l.m844l(str, jLongValue, c6373lM1294l);
                        }
                        if (c11154l2.isEmpty()) {
                            long j2 = c1185l.f3179l;
                            if (j2 != 0) {
                                c1185l.m845l(j - j2, c6373lM1294l);
                                c1185l.f3179l = 0L;
                            } else {
                                C17417l.admob(c8118l3);
                                c8118l3.f16908l.yandex("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
