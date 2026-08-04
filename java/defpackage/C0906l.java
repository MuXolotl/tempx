package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: renamed from: lًؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0906l extends AbstractC9453l {
    public static final Parcelable.Creator<C0906l> CREATOR = new C18485l(14);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f2572l;

    public C0906l(int i) {
        boolean z = false;
        if (i >= 0 && i <= 15) {
            z = true;
        }
        AbstractC1051l.crashlytics(z, "Sequence number should be 4 bits.");
        this.f2572l = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0906l) {
            if (this.f2572l == ((C0906l) obj).f2572l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(19, Integer.valueOf(this.f2572l));
    }

    public final String toString() {
        Locale locale = Locale.US;
        return AbstractC15560l.tapsense("DataElement<type: ContextSequenceNumber, value: ", this.f2572l, ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f2572l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
