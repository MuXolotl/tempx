package defpackage;

import android.os.Parcel;

/* JADX INFO: renamed from: lؓۥٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2231l implements InterfaceC2227l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f4910l;

    @Override // defpackage.InterfaceC2227l
    public void crashlytics(C11963l c11963l) {
        String str = this.f4910l;
        C13452l c13452l = (C13452l) c11963l.metrica();
        Parcel parcelM743l = c13452l.m743l();
        int i = AbstractC14866l.yandex;
        parcelM743l.writeInt(1);
        int iTapsense = AbstractC9968l.tapsense(parcelM743l, 20293);
        AbstractC9968l.vip(parcelM743l, 1, str);
        AbstractC9968l.subscription(parcelM743l, 2, 4);
        parcelM743l.writeInt(0);
        AbstractC9968l.Signature(parcelM743l, iTapsense);
        c13452l.m742l(parcelM743l, 2009);
    }
}
