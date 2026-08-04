package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: lِٖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16346l extends AbstractC9453l {
    public static final Parcelable.Creator<C16346l> CREATOR = new C18485l(9);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f31960l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final long f31961l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f31962l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f31963l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final TreeMap f31964l = new TreeMap();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C12386l[] f31965l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f31966l;

    public C16346l(String str, String str2, C12386l[] c12386lArr, boolean z, byte[] bArr, long j) {
        this.f31963l = str;
        this.f31960l = str2;
        this.f31965l = c12386lArr;
        this.f31966l = z;
        this.f31962l = bArr;
        this.f31961l = j;
        for (C12386l c12386l : c12386lArr) {
            this.f31964l.put(Integer.valueOf(c12386l.f24475l), c12386l);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16346l)) {
            return false;
        }
        C16346l c16346l = (C16346l) obj;
        return AbstractC8960l.isPro(this.f31963l, c16346l.f31963l) && AbstractC8960l.isPro(this.f31960l, c16346l.f31960l) && this.f31964l.equals(c16346l.f31964l) && this.f31966l == c16346l.f31966l && Arrays.equals(this.f31962l, c16346l.f31962l) && this.f31961l == c16346l.f31961l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31963l, this.f31960l, this.f31964l, Boolean.valueOf(this.f31966l), this.f31962l, Long.valueOf(this.f31961l)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f31963l);
        sb.append("', '");
        sb.append(this.f31960l);
        sb.append("', (");
        Iterator it = this.f31964l.values().iterator();
        while (it.hasNext()) {
            sb.append((C12386l) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f31966l);
        sb.append(", ");
        byte[] bArr = this.f31962l;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        return AbstractC12900l.smaato(sb, this.f31961l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f31963l);
        AbstractC9968l.vip(parcel, 3, this.f31960l);
        AbstractC9968l.adcel(parcel, 4, this.f31965l, i);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f31966l ? 1 : 0);
        AbstractC9968l.billing(parcel, 6, this.f31962l);
        AbstractC9968l.subscription(parcel, 7, 8);
        parcel.writeLong(this.f31961l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
