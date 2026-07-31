package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: renamed from: lِٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4153l extends AbstractC9453l implements Comparable {
    public static final Parcelable.Creator<C4153l> CREATOR = new C18485l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f8518l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f8519l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f8520l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f8521l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f8522l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f8523l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final double f8524l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f8525l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f8526l;

    public C4153l(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.f8522l = str;
        this.f8521l = j;
        this.f8518l = z;
        this.f8524l = d;
        this.f8523l = str2;
        this.f8526l = bArr;
        this.f8519l = i;
        this.f8520l = i2;
        this.f8525l = i3;
    }

    public final void billing(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.f8522l;
        sb.append(str);
        sb.append(", ");
        int i = this.f8519l;
        if (i == 1) {
            sb.append(this.f8521l);
        } else if (i == 2) {
            sb.append(this.f8518l);
        } else if (i == 3) {
            sb.append(this.f8524l);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.f8523l;
            AbstractC1051l.subs(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.f8526l;
            AbstractC1051l.subs(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.f8520l);
        sb.append(", ");
        sb.append(this.f8525l);
        sb.append(")");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a3 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        C4153l c4153l = (C4153l) obj;
        int iCompareTo = this.f8522l.compareTo(c4153l.f8522l);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = c4153l.f8519l;
        int i3 = this.f8519l;
        if (i3 < i2) {
            i = -1;
        } else {
            i = i3 != i2 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            long j = this.f8521l;
            long j2 = c4153l.f8521l;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i3 == 2) {
            boolean z = c4153l.f8518l;
            boolean z2 = this.f8518l;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 == 3) {
            return Double.compare(this.f8524l, c4153l.f8524l);
        }
        if (i3 == 4) {
            String str = c4153l.f8523l;
            String str2 = this.f8523l;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 != 5) {
            C8339l.subs(AbstractC9361l.Signature(i3, "Invalid enum value: ", new StringBuilder(String.valueOf(i3).length() + 20)));
            return 0;
        }
        byte[] bArr = c4153l.f8526l;
        byte[] bArr2 = this.f8526l;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4153l) {
            C4153l c4153l = (C4153l) obj;
            if (AbstractC8960l.isPro(this.f8522l, c4153l.f8522l)) {
                int i = c4153l.f8519l;
                int i2 = this.f8519l;
                if (i2 == i && this.f8520l == c4153l.f8520l && this.f8525l == c4153l.f8525l) {
                    if (i2 == 1) {
                        return this.f8521l == c4153l.f8521l;
                    }
                    if (i2 == 2) {
                        return this.f8518l == c4153l.f8518l;
                    }
                    if (i2 == 3) {
                        return this.f8524l == c4153l.f8524l;
                    }
                    if (i2 == 4) {
                        return AbstractC8960l.isPro(this.f8523l, c4153l.f8523l);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.f8526l, c4153l.f8526l);
                    }
                    C8339l.subs(AbstractC9361l.Signature(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                    return false;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        billing(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f8522l;
        boolean z = str == null;
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        if (!z) {
            AbstractC9968l.vip(parcel, 2, str);
        }
        long j = this.f8521l;
        if (j != 0) {
            AbstractC9968l.subscription(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.f8518l) {
            AbstractC9968l.subscription(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.f8524l;
        if (d != 0.0d) {
            AbstractC9968l.subscription(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.f8523l;
        if (str2 != null) {
            AbstractC9968l.vip(parcel, 6, str2);
        }
        byte[] bArr = this.f8526l;
        if (bArr != null) {
            AbstractC9968l.billing(parcel, 7, bArr);
        }
        int i2 = this.f8519l;
        if (i2 != 0) {
            AbstractC9968l.subscription(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.f8520l;
        if (i3 != 0) {
            AbstractC9968l.subscription(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.f8525l;
        if (i4 != 0) {
            AbstractC9968l.subscription(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
