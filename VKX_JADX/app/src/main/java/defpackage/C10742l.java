package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: renamed from: lَۨۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10742l extends AbstractC9453l {
    public static final Parcelable.Creator<C10742l> CREATOR = new C10538l(26);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f21751l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Account f21752l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f21753l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final GoogleSignInAccount f21754l;

    public C10742l(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f21753l = i;
        this.f21752l = account;
        this.f21751l = i2;
        this.f21754l = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f21753l);
        AbstractC9968l.remoteconfig(parcel, 2, this.f21752l, i);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f21751l);
        AbstractC9968l.remoteconfig(parcel, 4, this.f21754l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
