package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: lًٛؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8105l extends AbstractC2704l {
    public static final Parcelable.Creator<C8105l> CREATOR = new C11384l(5);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public CharSequence f16889l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f16890l;

    public C8105l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16889l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f16890l = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f16889l) + "}";
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f16889l, parcel, i);
        parcel.writeInt(this.f16890l ? 1 : 0);
    }
}
