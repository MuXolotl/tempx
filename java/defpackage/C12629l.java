package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: lّٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12629l extends AbstractC2704l {
    public static final Parcelable.Creator<C12629l> CREATOR = new C9499l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f24852l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f24853l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f24854l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f24855l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f24856l;

    public C12629l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f24852l = parcel.readInt();
        this.f24855l = parcel.readInt();
        this.f24854l = parcel.readInt() == 1;
        this.f24856l = parcel.readInt() == 1;
        this.f24853l = parcel.readInt() == 1;
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f24852l);
        parcel.writeInt(this.f24855l);
        parcel.writeInt(this.f24854l ? 1 : 0);
        parcel.writeInt(this.f24856l ? 1 : 0);
        parcel.writeInt(this.f24853l ? 1 : 0);
    }

    public C12629l(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f24852l = bottomSheetBehavior.f645private;
        this.f24855l = bottomSheetBehavior.purchase;
        this.f24854l = bottomSheetBehavior.loadAd;
        this.f24856l = bottomSheetBehavior.f647strictfp;
        this.f24853l = bottomSheetBehavior.f653volatile;
    }
}
