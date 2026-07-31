package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.io.Serializable;

/* JADX INFO: renamed from: lۣؓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2106l implements Comparable, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C2106l f4733l = new C2106l(-31557014167219200L, 0);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C2106l f4734l = new C2106l(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f4735l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f4736l;

    public C2106l(long j, int i) {
        this.f4736l = j;
        this.f4735l = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            C8339l.metrica("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    public final long crashlytics() {
        long j = this.f4736l;
        int i = this.f4735l;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = i / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (i / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2106l)) {
            return false;
        }
        C2106l c2106l = (C2106l) obj;
        return this.f4736l == c2106l.f4736l && this.f4735l == c2106l.f4735l;
    }

    public final int hashCode() {
        long j = this.f4736l;
        return (this.f4735l * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final C2106l loadAd(long j) {
        long jAdmob = C9658l.admob(j, EnumC16636l.SECONDS);
        int iPurchase = C9658l.purchase(j);
        if (jAdmob == 0 && iPurchase == 0) {
            return this;
        }
        long j2 = this.f4736l;
        long j3 = j2 + jAdmob;
        if ((j2 ^ j3) >= 0 || (jAdmob ^ j2) < 0) {
            return C16367l.license(j3, this.f4735l + iPurchase);
        }
        return j > 0 ? f4734l : f4733l;
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.f4736l;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + ModuleDescriptor.MODULE_VERSION);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i6 - ModuleDescriptor.MODULE_VERSION);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        AbstractC9549l.loadAd(sb, sb, i4);
        sb.append('-');
        AbstractC9549l.loadAd(sb, sb, i5);
        sb.append('T');
        AbstractC9549l.loadAd(sb, sb, i7);
        sb.append(':');
        AbstractC9549l.loadAd(sb, sb, i9);
        sb.append(':');
        AbstractC9549l.loadAd(sb, sb, i10);
        int i12 = this.f4735l;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                int i13 = i11 + 1;
                iArr = AbstractC9549l.yandex;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            sb.append(String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2106l c2106l) {
        int iIsPro = AbstractC8576l.isPro(this.f4736l, c2106l.f4736l);
        return iIsPro != 0 ? iIsPro : AbstractC8576l.subs(this.f4735l, c2106l.f4735l);
    }
}
