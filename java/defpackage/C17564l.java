package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: renamed from: lٌٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17564l implements Comparator, Parcelable {
    public static final Parcelable.Creator<C17564l> CREATOR = new C17440l(8);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f34188l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f34189l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C12687l[] f34190l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f34191l;

    public C17564l(Parcel parcel) {
        this.f34188l = parcel.readString();
        C12687l[] c12687lArr = (C12687l[]) parcel.createTypedArray(C12687l.CREATOR);
        String str = AbstractC15323l.yandex;
        this.f34190l = c12687lArr;
        this.f34191l = c12687lArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C12687l c12687l = (C12687l) obj;
        C12687l c12687l2 = (C12687l) obj2;
        UUID uuid = AbstractC17252l.loadAd;
        if (uuid.equals(c12687l.f25008l)) {
            return uuid.equals(c12687l2.f25008l) ? 0 : 1;
        }
        return c12687l.f25008l.compareTo(c12687l2.f25008l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17564l.class == obj.getClass()) {
            C17564l c17564l = (C17564l) obj;
            if (Objects.equals(this.f34188l, c17564l.f34188l) && Arrays.equals(this.f34190l, c17564l.f34190l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f34189l == 0) {
            String str = this.f34188l;
            this.f34189l = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f34190l);
        }
        return this.f34189l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34188l);
        parcel.writeTypedArray(this.f34190l, 0);
    }

    public final C17564l yandex(String str) {
        return Objects.equals(this.f34188l, str) ? this : new C17564l(str, false, this.f34190l);
    }

    public C17564l(String str, boolean z, C12687l... c12687lArr) {
        this.f34188l = str;
        c12687lArr = z ? (C12687l[]) c12687lArr.clone() : c12687lArr;
        this.f34190l = c12687lArr;
        this.f34191l = c12687lArr.length;
        Arrays.sort(c12687lArr, this);
    }
}
