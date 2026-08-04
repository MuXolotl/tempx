package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: lٍٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9890l extends AbstractC5223l {
    public final String admob;
    public final SparseIntArray amazon;
    public final int billing;
    public int firebase;
    public int isPro;
    public final int mopub;
    public final Parcel purchase;
    public int subs;

    public C9890l(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C5128l(0), new C5128l(0), new C5128l(0));
    }

    @Override // defpackage.AbstractC5223l
    public final boolean purchase(int i) {
        while (true) {
            int i2 = this.isPro;
            int i3 = this.firebase;
            if (i2 >= this.mopub) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.isPro;
            Parcel parcel = this.purchase;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.firebase = parcel.readInt();
            this.isPro += i5;
        }
    }

    @Override // defpackage.AbstractC5223l
    public final void subs(int i) {
        int i2 = this.subs;
        SparseIntArray sparseIntArray = this.amazon;
        Parcel parcel = this.purchase;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.subs = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // defpackage.AbstractC5223l
    public final C9890l yandex() {
        Parcel parcel = this.purchase;
        int iDataPosition = parcel.dataPosition();
        int i = this.isPro;
        if (i == this.billing) {
            i = this.mopub;
        }
        return new C9890l(parcel, iDataPosition, i, AbstractC0653l.ads(new StringBuilder(), this.admob, "  "), this.yandex, this.loadAd, this.crashlytics);
    }

    public C9890l(Parcel parcel, int i, int i2, String str, C5128l c5128l, C5128l c5128l2, C5128l c5128l3) {
        super(c5128l, c5128l2, c5128l3);
        this.amazon = new SparseIntArray();
        this.subs = -1;
        this.firebase = -1;
        this.purchase = parcel;
        this.billing = i;
        this.mopub = i2;
        this.isPro = i;
        this.admob = str;
    }
}
