package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lًۥٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8395l extends AbstractC9453l {
    public static final Parcelable.Creator<C8395l> CREATOR = new C13546l(21);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f17351l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f17352l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f17353l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f17354l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f17355l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f17356l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C14125l f17357l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f17358l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f17359l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f17360l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8395l)) {
            return false;
        }
        C8395l c8395l = (C8395l) obj;
        return TextUtils.equals(this.f17355l, c8395l.f17355l) && TextUtils.equals(this.f17354l, c8395l.f17354l) && this.f17351l == c8395l.f17351l && TextUtils.equals(this.f17358l, c8395l.f17358l) && AbstractC7236l.amazon(this.f17357l, c8395l.f17357l) && this.f17360l == c8395l.f17360l && AbstractC7236l.amazon(this.f17352l, c8395l.f17352l) && this.f17353l == c8395l.f17353l && this.f17359l == c8395l.f17359l && this.f17356l == c8395l.f17356l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17355l, this.f17354l, Integer.valueOf(this.f17351l), this.f17358l, this.f17357l, Integer.valueOf(this.f17360l), this.f17352l, Integer.valueOf(this.f17353l), Long.valueOf(this.f17359l), Boolean.valueOf(this.f17356l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f17355l);
        AbstractC9968l.vip(parcel, 3, this.f17354l);
        int i2 = this.f17351l;
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(i2);
        AbstractC9968l.vip(parcel, 5, this.f17358l);
        AbstractC9968l.remoteconfig(parcel, 6, this.f17357l, i);
        int i3 = this.f17360l;
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(i3);
        List list = this.f17352l;
        AbstractC9968l.ads(parcel, 8, list == null ? null : DesugarCollections.unmodifiableList(list));
        int i4 = this.f17353l;
        AbstractC9968l.subscription(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.f17359l;
        AbstractC9968l.subscription(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.f17356l;
        AbstractC9968l.subscription(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
