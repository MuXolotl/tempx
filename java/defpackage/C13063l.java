package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lْؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13063l extends AbstractC9453l {
    public static final Parcelable.Creator<C13063l> CREATOR = new C1800l(14);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f25575l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C10128l[] f25576l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f25577l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C3382l f25578l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C17118l[] f25579l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C8992l[] f25580l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String[] f25581l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 2, this.f25578l, i);
        AbstractC9968l.vip(parcel, 3, this.f25577l);
        AbstractC9968l.vip(parcel, 4, this.f25575l);
        AbstractC9968l.adcel(parcel, 5, this.f25580l, i);
        AbstractC9968l.adcel(parcel, 6, this.f25579l, i);
        AbstractC9968l.metrica(parcel, 7, this.f25581l);
        AbstractC9968l.adcel(parcel, 8, this.f25576l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
