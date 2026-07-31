package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؘؔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2430l extends Binder implements InterfaceC10867l {
    public static final /* synthetic */ int billing = 0;
    public final WeakReference purchase;

    public BinderC2430l(C1139l c1139l) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.purchase = new WeakReference(c1139l);
    }

    @Override // defpackage.InterfaceC10867l
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void mo1135finally(InterfaceC3145l interfaceC3145l) {
        C1139l c1139l = (C1139l) this.purchase.get();
        if (c1139l == null || interfaceC3145l == null) {
            return;
        }
        c1139l.billing.unregister(interfaceC3145l);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c1139l.amazon) {
        }
    }

    @Override // defpackage.InterfaceC10867l
    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final void mo1136l(InterfaceC3145l interfaceC3145l) {
        C1139l c1139l = (C1139l) this.purchase.get();
        if (c1139l == null || interfaceC3145l == null) {
            return;
        }
        c1139l.billing.register(interfaceC3145l, new C16701l("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c1139l.amazon) {
        }
    }

    @Override // defpackage.InterfaceC10867l
    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final boolean mo1137l() {
        return false;
    }

    @Override // defpackage.InterfaceC10867l
    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final int mo1138l() {
        C1139l c1139l = (C1139l) this.purchase.get();
        if (c1139l != null) {
            return c1139l.firebase;
        }
        return -1;
    }

    @Override // defpackage.InterfaceC10867l
    public final int mopub() {
        C1139l c1139l = (C1139l) this.purchase.get();
        if (c1139l != null) {
            return c1139l.isPro;
        }
        return -1;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle;
        InterfaceC3145l interfaceC3145l = null;
        bundle = null;
        Bundle bundle2 = null;
        InterfaceC3145l interfaceC3145l2 = null;
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3145l)) {
                    C7971l c7971l = new C7971l();
                    c7971l.purchase = strongBinder;
                    interfaceC3145l = c7971l;
                } else {
                    interfaceC3145l = (InterfaceC3145l) iInterfaceQueryLocalInterface;
                }
            }
            mo1136l(interfaceC3145l);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC3145l)) {
                    C7971l c7971l2 = new C7971l();
                    c7971l2.purchase = strongBinder2;
                    interfaceC3145l2 = c7971l2;
                } else {
                    interfaceC3145l2 = (InterfaceC3145l) iInterfaceQueryLocalInterface2;
                }
            }
            mo1135finally(interfaceC3145l2);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            C16830l c16830lPurchase = purchase();
            parcel2.getClass();
            parcel2.writeNoException();
            if (c16830lPurchase == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            c16830lPurchase.writeToParcel(parcel2, 1);
            return true;
        }
        if (i == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            int iMopub = mopub();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(iMopub);
            return true;
        }
        if (i == 45) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            mo1137l();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        if (i == 47) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            int iMo1138l = mo1138l();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(iMo1138l);
            return true;
        }
        if (i != 50) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        C1139l c1139l = (C1139l) this.purchase.get();
        if (c1139l != null && (bundle = c1139l.purchase) != null) {
            bundle2 = new Bundle(bundle);
        }
        parcel2.getClass();
        parcel2.writeNoException();
        if (bundle2 == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        bundle2.writeToParcel(parcel2, 1);
        return true;
    }

    @Override // defpackage.InterfaceC10867l
    public final C16830l purchase() {
        long j;
        C1139l c1139l = (C1139l) this.purchase.get();
        if (c1139l == null) {
            return null;
        }
        C16830l c16830l = c1139l.mopub;
        C8937l c8937l = c1139l.subs;
        if (c16830l != null) {
            float f = c16830l.f32856l;
            long j2 = c16830l.f32851l;
            int i = c16830l.f32853l;
            long j3 = c16830l.f32852l;
            long jYandex = -1;
            if (j3 != -1 && ((i == 3 || i == 4 || i == 5) && j2 > 0)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = ((long) (f * (jElapsedRealtime - j2))) + j3;
                if (c8937l != null && c8937l.f18410l.containsKey("android.media.metadata.DURATION")) {
                    jYandex = c8937l.yandex("android.media.metadata.DURATION");
                }
                if (jYandex < 0 || j4 <= jYandex) {
                    j = j4 < 0 ? 0L : j4;
                } else {
                    j = jYandex;
                }
                ArrayList arrayList = new ArrayList();
                long j5 = c16830l.f32849l;
                long j6 = c16830l.f32855l;
                int i2 = c16830l.f32859l;
                CharSequence charSequence = c16830l.f32850l;
                List list = c16830l.f32858l;
                if (list != null) {
                    arrayList.addAll(list);
                }
                return new C16830l(c16830l.f32853l, j, j5, c16830l.f32856l, j6, i2, charSequence, jElapsedRealtime, arrayList, c16830l.f32854l, c16830l.f32860l);
            }
        }
        return c16830l;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
