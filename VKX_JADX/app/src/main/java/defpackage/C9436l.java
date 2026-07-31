package defpackage;

import android.os.Parcel;

/* JADX INFO: renamed from: lًٍٍ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9436l extends AbstractC0895l {
    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public final InterfaceC3396l m2658l(BinderC14844l binderC14844l, String str, int i) {
        Parcel parcelM743l = m743l();
        AbstractC2020l.loadAd(parcelM743l, binderC14844l);
        parcelM743l.writeString(str);
        parcelM743l.writeInt(i);
        Parcel parcelM748l = m748l(parcelM743l, 4);
        InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcelM748l.readStrongBinder());
        parcelM748l.recycle();
        return interfaceC3396lM3896l;
    }

    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    public final InterfaceC3396l m2659l(BinderC14844l binderC14844l, String str, boolean z, long j) {
        Parcel parcelM743l = m743l();
        AbstractC2020l.loadAd(parcelM743l, binderC14844l);
        parcelM743l.writeString(str);
        parcelM743l.writeInt(z ? 1 : 0);
        parcelM743l.writeLong(j);
        Parcel parcelM748l = m748l(parcelM743l, 7);
        InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcelM748l.readStrongBinder());
        parcelM748l.recycle();
        return interfaceC3396lM3896l;
    }

    /* JADX INFO: renamed from: lؘٞۨ, reason: contains not printable characters */
    public final InterfaceC3396l m2660l(BinderC14844l binderC14844l, String str, int i, BinderC14844l binderC14844l2) {
        Parcel parcelM743l = m743l();
        AbstractC2020l.loadAd(parcelM743l, binderC14844l);
        parcelM743l.writeString(str);
        parcelM743l.writeInt(i);
        AbstractC2020l.loadAd(parcelM743l, binderC14844l2);
        Parcel parcelM748l = m748l(parcelM743l, 8);
        InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcelM748l.readStrongBinder());
        parcelM748l.recycle();
        return interfaceC3396lM3896l;
    }

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public final InterfaceC3396l m2661l(BinderC14844l binderC14844l, String str, int i) {
        Parcel parcelM743l = m743l();
        AbstractC2020l.loadAd(parcelM743l, binderC14844l);
        parcelM743l.writeString(str);
        parcelM743l.writeInt(i);
        Parcel parcelM748l = m748l(parcelM743l, 2);
        InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcelM748l.readStrongBinder());
        parcelM748l.recycle();
        return interfaceC3396lM3896l;
    }
}
