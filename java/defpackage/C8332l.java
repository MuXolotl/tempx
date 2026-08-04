package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: renamed from: lًۢؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8332l extends AbstractC9453l {
    public static final Parcelable.Creator<C8332l> CREATOR = new C18485l(5);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f17236l;

    public C8332l(String str) {
        AbstractC1051l.crashlytics(str.length() <= 32, "Cast id should be at most 32 characters.");
        this.f17236l = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8332l)) {
            return false;
        }
        return Objects.equals(this.f17236l, ((C8332l) obj).f17236l);
    }

    public final int hashCode() {
        return Objects.hash(17, this.f17236l);
    }

    public final String toString() {
        Locale locale = Locale.US;
        return AbstractC15560l.Signature("DataElement<type: CastId, Id: ", this.f17236l, ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f17236l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
