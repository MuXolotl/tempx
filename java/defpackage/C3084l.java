package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: lؔۨ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3084l extends AbstractC2704l {
    public static final Parcelable.Creator<C3084l> CREATOR = new C11384l(4);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f6619l;

    public C3084l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6619l = parcel.readInt();
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6619l);
    }

    public C3084l(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f6619l = sideSheetBehavior.admob;
    }
}
