package defpackage;

/* JADX INFO: renamed from: lٖۣ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16740l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static C16740l f32749l;

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final boolean m4195l(int i) {
        if (i <= 0) {
            return false;
        }
        String str = (String) this.f33215l;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i - 1) == '\n') {
            return false;
        }
        String str2 = (String) this.f33215l;
        if (str2 == null) {
            str2 = null;
        }
        if (i == str2.length()) {
            return true;
        }
        String str3 = (String) this.f33215l;
        return (str3 != null ? str3 : null).charAt(i) == '\n';
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؖٙؖ */
    public final int[] mo3082l(int i) {
        String str = (String) this.f33215l;
        if (str == null) {
            str = null;
        }
        int length = str.length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            String str2 = (String) this.f33215l;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i - 1) != '\n' || m4195l(i)) {
                break;
            }
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !m4196l(i2)) {
            i2--;
        }
        return m4261l(i2, i);
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final boolean m4196l(int i) {
        String str = (String) this.f33215l;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i) == '\n') {
            return false;
        }
        if (i != 0) {
            String str2 = (String) this.f33215l;
            if ((str2 != null ? str2 : null).charAt(i - 1) != '\n') {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lِۙٞ */
    public final int[] mo3083l(int i) {
        String str = (String) this.f33215l;
        if (str == null) {
            str = null;
        }
        int length = str.length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length) {
            String str2 = (String) this.f33215l;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i) != '\n' || m4196l(i)) {
                break;
            }
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m4195l(i2)) {
            i2++;
        }
        return m4261l(i, i2);
    }
}
