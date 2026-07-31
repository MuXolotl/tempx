package defpackage;

/* JADX INFO: renamed from: lؓۥۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2237l {
    public static final C2237l loadAd;
    public final AbstractC16029l yandex;

    static {
        int i = AbstractC16029l.f31418l;
        loadAd = new C2237l(C13949l.f27246l);
    }

    public C2237l(AbstractC16029l abstractC16029l) {
        this.yandex = abstractC16029l;
    }

    public static C2237l yandex(AbstractC9284l abstractC9284l) throws C9893l {
        String strMo1082interface;
        long j;
        C5748l c5748l;
        int iMo1087public = abstractC9284l.mo1087public();
        if (iMo1087public < 0) {
            C11586l.admob("Negative number of flags");
            return null;
        }
        int i = AbstractC16029l.f31418l;
        C4296l c4296l = new C4296l();
        long j2 = 0;
        for (int i2 = 0; i2 < iMo1087public; i2++) {
            long jMo1077finally = abstractC9284l.mo1077finally();
            int i3 = (int) jMo1077finally;
            long j3 = jMo1077finally >>> 3;
            if (j3 == 0) {
                j = 0;
                strMo1082interface = abstractC9284l.mo1082interface();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    C11586l.admob("Flag name larger than max size");
                    return null;
                }
                strMo1082interface = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                c5748l = new C5748l(j, strMo1082interface, i4, 0L, null);
            } else if (i4 == 2) {
                c5748l = new C5748l(j, strMo1082interface, i4, abstractC9284l.mo1077finally(), null);
            } else if (i4 == 3) {
                c5748l = new C5748l(j, strMo1082interface, i4, Double.doubleToRawLongBits(abstractC9284l.mo1078for()), null);
            } else if (i4 == 4) {
                c5748l = new C5748l(j, strMo1082interface, i4, 0L, abstractC9284l.mo1082interface());
            } else {
                if (i4 != 5) {
                    C11586l.admob(AbstractC9361l.Signature(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                    return null;
                }
                c5748l = new C5748l(j, strMo1082interface, i4, 0L, abstractC9284l.mo1076final());
            }
            long j5 = c5748l.f12141l;
            if (j5 != 0) {
                j2 = j5;
            }
            c4296l.crashlytics(c5748l);
        }
        return new C2237l(c4296l.admob());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2237l)) {
            return false;
        }
        return this.yandex.equals(((C2237l) obj).yandex);
    }

    public final int hashCode() {
        AbstractC16029l abstractC16029l = this.yandex;
        abstractC16029l.getClass();
        return AbstractC5088l.admob(abstractC16029l);
    }
}
