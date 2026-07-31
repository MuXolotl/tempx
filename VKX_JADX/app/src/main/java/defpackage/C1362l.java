package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٍؒ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1362l extends AbstractC9453l {
    public static final Parcelable.Creator<C1362l> CREATOR = new C18485l(10);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f3491l;

    public C1362l(int i) {
        this.f3491l = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1362l) && this.f3491l == ((C1362l) obj).f3491l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3491l)});
    }

    public final String toString() {
        return AbstractC0653l.adcel(new StringBuilder("PresenceAction[action="), this.f3491l, ']');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f3491l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
