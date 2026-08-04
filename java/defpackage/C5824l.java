package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lؘٜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5824l extends AbstractC9453l {
    public static final Parcelable.Creator<C5824l> CREATOR = new C18485l(13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[][] f12266l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int[] f12267l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[][] f12268l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f12269l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f12270l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final byte[][] f12271l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[][] f12272l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[][] f12273l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int[] f12274l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[][] f12275l;

    public C5824l(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f12270l = str;
        this.f12269l = bArr;
        this.f12266l = bArr2;
        this.f12273l = bArr3;
        this.f12272l = bArr4;
        this.f12275l = bArr5;
        this.f12267l = iArr;
        this.f12268l = bArr6;
        this.f12274l = iArr2;
        this.f12271l = bArr7;
    }

    public static Set admob(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetStartapp = AbstractC5088l.startapp(length);
        for (byte[] bArr2 : bArr) {
            AbstractC1051l.subs(bArr2);
            hashSetStartapp.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetStartapp;
    }

    public static void billing(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            AbstractC1051l.subs(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public static List firebase(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new C7533l(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object objStartapp;
        Object objStartapp2;
        int length;
        int length2;
        if (obj instanceof C5824l) {
            C5824l c5824l = (C5824l) obj;
            if (AbstractC8960l.isPro(this.f12270l, c5824l.f12270l) && AbstractC8960l.isPro(mopub(), c5824l.mopub()) && AbstractC8960l.isPro(admob(this.f12266l), admob(c5824l.f12266l)) && AbstractC8960l.isPro(admob(this.f12273l), admob(c5824l.f12273l)) && AbstractC8960l.isPro(admob(this.f12272l), admob(c5824l.f12272l)) && AbstractC8960l.isPro(admob(this.f12275l), admob(c5824l.f12275l))) {
                int[] iArr = this.f12267l;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    objStartapp = Collections.EMPTY_SET;
                } else {
                    objStartapp = AbstractC5088l.startapp(length2);
                    for (int i : iArr) {
                        objStartapp.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = c5824l.f12267l;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    objStartapp2 = Collections.EMPTY_SET;
                } else {
                    objStartapp2 = AbstractC5088l.startapp(length);
                    for (int i2 : iArr2) {
                        objStartapp2.add(Integer.valueOf(i2));
                    }
                }
                if (AbstractC8960l.isPro(objStartapp, objStartapp2) && AbstractC8960l.isPro(firebase(this.f12274l), firebase(c5824l.f12274l)) && AbstractC8960l.isPro(admob(this.f12271l), admob(c5824l.f12271l))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Set mopub() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f12268l;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f12269l;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return admob((byte[][]) arrayList.toArray(new byte[0][]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.f12270l;
        sb.append(str == null ? "null" : AbstractC9361l.ad(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.f12269l;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        billing(sb, "GAIA=", this.f12266l);
        sb.append(", ");
        billing(sb, "PSEUDO=", this.f12273l);
        sb.append(", ");
        billing(sb, "ALWAYS=", this.f12272l);
        sb.append(", ");
        billing(sb, "OTHER=", this.f12275l);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f12267l));
        sb.append(", ");
        billing(sb, "directs=", this.f12268l);
        sb.append(", genDims=");
        sb.append(Arrays.toString(firebase(this.f12274l).toArray()));
        sb.append(", ");
        billing(sb, "external=", this.f12271l);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f12270l);
        AbstractC9968l.billing(parcel, 3, this.f12269l);
        AbstractC9968l.mopub(parcel, 4, this.f12266l);
        AbstractC9968l.mopub(parcel, 5, this.f12273l);
        AbstractC9968l.mopub(parcel, 6, this.f12272l);
        AbstractC9968l.mopub(parcel, 7, this.f12275l);
        AbstractC9968l.subs(parcel, 8, this.f12267l);
        AbstractC9968l.mopub(parcel, 9, this.f12268l);
        AbstractC9968l.subs(parcel, 10, this.f12274l);
        AbstractC9968l.mopub(parcel, 11, this.f12271l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
