package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lۣٗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17509l extends AbstractC9453l {
    public static final Parcelable.Creator<C17509l> CREATOR = new C15160l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C6899l f34112l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C13236l f34113l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f34114l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f34115l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f34116l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f34117l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f34118l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f34119l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C13236l f34120l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String f34121l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C13236l f34122l;

    public C17509l(C17509l c17509l) {
        AbstractC1051l.subs(c17509l);
        this.f34116l = c17509l.f34116l;
        this.f34115l = c17509l.f34115l;
        this.f34112l = c17509l.f34112l;
        this.f34119l = c17509l.f34119l;
        this.f34118l = c17509l.f34118l;
        this.f34121l = c17509l.f34121l;
        this.f34113l = c17509l.f34113l;
        this.f34114l = c17509l.f34114l;
        this.f34120l = c17509l.f34120l;
        this.f34117l = c17509l.f34117l;
        this.f34122l = c17509l.f34122l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f34116l);
        AbstractC9968l.vip(parcel, 3, this.f34115l);
        AbstractC9968l.remoteconfig(parcel, 4, this.f34112l, i);
        long j = this.f34119l;
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.f34118l;
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC9968l.vip(parcel, 7, this.f34121l);
        AbstractC9968l.remoteconfig(parcel, 8, this.f34113l, i);
        long j2 = this.f34114l;
        AbstractC9968l.subscription(parcel, 9, 8);
        parcel.writeLong(j2);
        AbstractC9968l.remoteconfig(parcel, 10, this.f34120l, i);
        AbstractC9968l.subscription(parcel, 11, 8);
        parcel.writeLong(this.f34117l);
        AbstractC9968l.remoteconfig(parcel, 12, this.f34122l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C17509l(String str, String str2, C6899l c6899l, long j, boolean z, String str3, C13236l c13236l, long j2, C13236l c13236l2, long j3, C13236l c13236l3) {
        this.f34116l = str;
        this.f34115l = str2;
        this.f34112l = c6899l;
        this.f34119l = j;
        this.f34118l = z;
        this.f34121l = str3;
        this.f34113l = c13236l;
        this.f34114l = j2;
        this.f34120l = c13236l2;
        this.f34117l = j3;
        this.f34122l = c13236l3;
    }
}
