package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؙٗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16903l extends AbstractC9453l {
    public static final Parcelable.Creator<C16903l> CREATOR = new C5422l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f32956l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f32957l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32958l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f32959l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f32960l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f32961l;

    public C16903l(int i, boolean z, ArrayList arrayList, int i2, String str, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        this.f32956l = arrayList2;
        this.f32958l = i;
        this.f32957l = z;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.f32960l = i2;
        this.f32959l = str;
        this.f32961l = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f32958l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f32957l ? 1 : 0);
        AbstractC9968l.startapp(parcel, 4, this.f32956l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f32960l);
        AbstractC9968l.vip(parcel, 6, this.f32959l);
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(this.f32961l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
