package defpackage;

import android.os.Parcel;

/* JADX INFO: renamed from: lٖۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16199l extends AbstractC0895l {
    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public final C17468l[] m4155l(BinderC14844l binderC14844l, C14235l c14235l) {
        Parcel parcelM743l = m743l();
        int i = AbstractC12306l.yandex;
        parcelM743l.writeStrongBinder(binderC14844l);
        parcelM743l.writeInt(1);
        c14235l.writeToParcel(parcelM743l, 0);
        Parcel parcelM746l = m746l(parcelM743l, 1);
        C17468l[] c17468lArr = (C17468l[]) parcelM746l.createTypedArray(C17468l.CREATOR);
        parcelM746l.recycle();
        return c17468lArr;
    }
}
