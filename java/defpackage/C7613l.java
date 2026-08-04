package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: lؚۤؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7613l extends AbstractC9453l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f15668l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f15669l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Bundle f15670l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Account f15671l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f15672l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f15673l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C9138l[] f15674l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public IBinder f15675l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f15676l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f15677l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C9138l[] f15678l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Scope[] f15679l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final boolean f15680l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final String f15681l;
    public static final Parcelable.Creator<C7613l> CREATOR = new C18485l(23);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final Scope[] f15667l = new Scope[0];

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C9138l[] f15666l = new C9138l[0];

    public C7613l(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C9138l[] c9138lArr, C9138l[] c9138lArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f15667l : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C9138l[] c9138lArr3 = f15666l;
        C9138l[] c9138lArr4 = c9138lArr == null ? c9138lArr3 : c9138lArr;
        c9138lArr3 = c9138lArr2 != null ? c9138lArr2 : c9138lArr3;
        this.f15673l = i;
        this.f15672l = i2;
        this.f15669l = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f15676l = "com.google.android.gms";
        } else {
            this.f15676l = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = AbstractBinderC14321l.billing;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC12652l c1548l = iInterfaceQueryLocalInterface instanceof InterfaceC12652l ? (InterfaceC12652l) iInterfaceQueryLocalInterface : new C1548l(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        C1548l c1548l2 = (C1548l) c1548l;
                        Parcel parcelM748l = c1548l2.m748l(c1548l2.m743l(), 2);
                        Account account3 = (Account) AbstractC2020l.yandex(parcelM748l, Account.CREATOR);
                        parcelM748l.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.f15675l = iBinder;
            account2 = account;
        }
        this.f15671l = account2;
        this.f15679l = scopeArr2;
        this.f15670l = bundle2;
        this.f15678l = c9138lArr4;
        this.f15674l = c9138lArr3;
        this.f15680l = z;
        this.f15677l = i4;
        this.f15668l = z2;
        this.f15681l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C18485l.yandex(this, parcel, i);
    }
}
