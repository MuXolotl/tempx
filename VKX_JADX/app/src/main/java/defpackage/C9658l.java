package defpackage;

/* JADX INFO: renamed from: lٍٚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9658l implements Comparable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f19702l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6760l f19699l = new C6760l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final long f19698l = AbstractC15918l.isPro(4611686018427387903L);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final long f19701l = AbstractC15918l.isPro(-4611686018427387903L);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final long f19700l = 9223372036854759646L;

    public static final long admob(long j, EnumC16636l enumC16636l) {
        if (j == f19698l) {
            return Long.MAX_VALUE;
        }
        if (j == f19701l) {
            return Long.MIN_VALUE;
        }
        return enumC16636l.f32612l.convert(j >> 1, ((((int) j) & 1) == 0 ? EnumC16636l.NANOSECONDS : EnumC16636l.MILLISECONDS).f32612l);
    }

    public static final long amazon(long j) {
        return ((((int) j) & 1) != 1 || billing(j)) ? admob(j, EnumC16636l.MILLISECONDS) : j >> 1;
    }

    public static final boolean billing(long j) {
        return j == f19698l || j == f19701l;
    }

    public static int crashlytics(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return AbstractC8576l.isPro(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final long isPro(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = AbstractC11960l.yandex;
        return j2;
    }

    public static final void loadAd(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strM3340static = AbstractC12024l.m3340static(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strM3340static.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM3340static.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strM3340static, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM3340static, 0, i6);
            }
        }
        sb.append(str);
    }

    public static final long mopub(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? yandex(j >> 1, j2 >> 1) : yandex(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? AbstractC15918l.isPro(j3 / 1000000) : AbstractC15918l.smaato(j3);
        }
        long jMopub = AbstractC15918l.mopub(j >> 1, j2 >> 1);
        if (jMopub != 9223372036854759646L) {
            return (jMopub == 4611686018427387903L || jMopub == -4611686018427387903L) ? AbstractC15918l.isPro(jMopub) : AbstractC15918l.firebase(jMopub);
        }
        C8339l.metrica("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    public static final int purchase(long j) {
        if (billing(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static String subs(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f19698l) {
            return "Infinity";
        }
        if (j == f19701l) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = isPro(j);
        }
        long jAdmob = admob(j, EnumC16636l.DAYS);
        int iAdmob = billing(j) ? 0 : (int) (admob(j, EnumC16636l.HOURS) % 24);
        int iAdmob2 = billing(j) ? 0 : (int) (admob(j, EnumC16636l.MINUTES) % 60);
        int iAdmob3 = billing(j) ? 0 : (int) (admob(j, EnumC16636l.SECONDS) % 60);
        int iPurchase = purchase(j);
        boolean z2 = jAdmob != 0;
        boolean z3 = iAdmob != 0;
        boolean z4 = iAdmob2 != 0;
        boolean z5 = (iAdmob3 == 0 && iPurchase == 0) ? false : true;
        if (z2) {
            sb.append(jAdmob);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iAdmob);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iAdmob2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iAdmob3 != 0 || z2 || z3 || z4) {
                loadAd(sb, iAdmob3, iPurchase, 9, "s", false);
            } else if (iPurchase >= 1000000) {
                loadAd(sb, iPurchase / 1000000, iPurchase % 1000000, 6, "ms", false);
            } else if (iPurchase >= 1000) {
                loadAd(sb, iPurchase / 1000, iPurchase % 1000, 3, "us", false);
            } else {
                sb.append(iPurchase);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long yandex(long j, long j2) {
        long j3 = j2 / 1000000;
        long jMopub = AbstractC15918l.mopub(j, j3);
        if (-4611686018426L > jMopub || jMopub >= 4611686018427L) {
            return AbstractC15918l.isPro(jMopub);
        }
        return AbstractC15918l.smaato((jMopub * 1000000) + (j2 - (j3 * 1000000)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return crashlytics(this.f19702l, ((C9658l) obj).f19702l);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9658l) {
            return this.f19702l == ((C9658l) obj).f19702l;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19702l;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return subs(this.f19702l);
    }
}
