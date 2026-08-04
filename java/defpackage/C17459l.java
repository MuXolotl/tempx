package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: renamed from: lٗ۠ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17459l extends AbstractC9453l {
    public static final Parcelable.Creator<C17459l> CREATOR = new C18485l(8);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f34018l;

    public C17459l(int i) {
        this.f34018l = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17459l) {
            if (this.f34018l == ((C17459l) obj).f34018l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(22, Integer.valueOf(this.f34018l));
    }

    public final String toString() {
        Locale locale = Locale.US;
        return AbstractC15560l.tapsense("DataElement<type: DeviceType, value: ", this.f34018l, ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f34018l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
