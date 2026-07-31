package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lًِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7935l extends AbstractC9453l {
    public static final Parcelable.Creator<C7935l> CREATOR = new C18485l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f16520l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC11948l f16521l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte[] f16522l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10293l f16523l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC5700l f16524l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f16525l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f16526l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C13469l f16527l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7935l) {
            C7935l c7935l = (C7935l) obj;
            if (AbstractC7236l.amazon(this.f16524l, c7935l.f16524l) && AbstractC7236l.amazon(this.f16523l, c7935l.f16523l) && AbstractC7236l.amazon(this.f16520l, c7935l.f16520l) && AbstractC7236l.amazon(this.f16526l, c7935l.f16526l) && AbstractC7236l.amazon(Long.valueOf(this.f16525l), Long.valueOf(c7935l.f16525l)) && AbstractC7236l.amazon(this.f16527l, c7935l.f16527l) && AbstractC7236l.amazon(this.f16521l, c7935l.f16521l) && Arrays.equals(this.f16522l, c7935l.f16522l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16524l, this.f16523l, this.f16520l, this.f16526l, Long.valueOf(this.f16525l), this.f16527l, this.f16521l, Integer.valueOf(Arrays.hashCode(this.f16522l))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        InterfaceC5700l interfaceC5700l = this.f16524l;
        AbstractC9968l.admob(parcel, 1, interfaceC5700l == null ? null : interfaceC5700l.asBinder());
        C10293l c10293l = this.f16523l;
        AbstractC9968l.admob(parcel, 2, c10293l == null ? null : c10293l.billing);
        AbstractC9968l.vip(parcel, 3, this.f16520l);
        AbstractC9968l.vip(parcel, 4, this.f16526l);
        long j = this.f16525l;
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeLong(j);
        AbstractC9968l.remoteconfig(parcel, 6, this.f16527l, i);
        InterfaceC11948l interfaceC11948l = this.f16521l;
        AbstractC9968l.admob(parcel, 7, interfaceC11948l != null ? interfaceC11948l.asBinder() : null);
        AbstractC9968l.billing(parcel, 8, this.f16522l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
