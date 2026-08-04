package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؙ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18032l extends AbstractC9453l {
    public static final Parcelable.Creator<C18032l> CREATOR = new C18485l(29);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f35317l;

    public C18032l(ArrayList arrayList) {
        this.f35317l = arrayList;
    }

    public static C18032l billing(EnumC5250l... enumC5250lArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC5250lArr[0].f11334l));
        return new C18032l(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.isPro(parcel, 1, this.f35317l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
