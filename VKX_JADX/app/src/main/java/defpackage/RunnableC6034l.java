package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؘۡۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6034l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f12804l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f12805l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f12806l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12807l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ boolean f12808l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C10462l f12809l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C11860l f12810l;

    public RunnableC6034l(C11860l c11860l, String str, String str2, C10462l c10462l, boolean z, InterfaceC6989l interfaceC6989l) {
        this.f12806l = str;
        this.f12804l = str2;
        this.f12809l = c10462l;
        this.f12808l = z;
        this.f12805l = interfaceC6989l;
        this.f12810l = c11860l;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C17410l c17410l;
        AtomicReference atomicReference;
        switch (this.f12807l) {
            case 0:
                String str = this.f12804l;
                String str2 = this.f12806l;
                InterfaceC6989l interfaceC6989l = (InterfaceC6989l) this.f12805l;
                C11860l c11860l = this.f12810l;
                Bundle bundle = new Bundle();
                try {
                    try {
                        InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                        C17417l c17417l = (C17417l) c11860l.f833l;
                        if (interfaceC5496l == null) {
                            C8118l c8118l = c17417l.f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16908l.crashlytics(str2, str, "Failed to get user properties; not connected to service");
                            c17410l = c17417l.f33949l;
                            C17417l.billing(c17410l);
                            c17410l.m4380l(interfaceC6989l, bundle);
                            return;
                        }
                        List<C6899l> listPremium = interfaceC5496l.premium(str2, str, this.f12808l, this.f12809l);
                        Bundle bundle2 = new Bundle();
                        if (listPremium != null) {
                            for (C6899l c6899l : listPremium) {
                                String str3 = c6899l.f14443l;
                                String str4 = c6899l.f14441l;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = c6899l.f14444l;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = c6899l.f14440l;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            c11860l.m3266l();
                            C17410l c17410l2 = c17417l.f33949l;
                            C17417l.billing(c17410l2);
                            c17410l2.m4380l(interfaceC6989l, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            C8118l c8118l2 = ((C17417l) c11860l.f833l).f33950l;
                            C17417l.admob(c8118l2);
                            c8118l2.f16908l.crashlytics(str2, e, "Failed to get user properties; remote exception");
                            c17410l = ((C17417l) c11860l.f833l).f33949l;
                            C17417l.billing(c17410l);
                            c17410l.m4380l(interfaceC6989l, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            C17410l c17410l3 = ((C17417l) c11860l.f833l).f33949l;
                            C17417l.billing(c17410l3);
                            c17410l3.m4380l(interfaceC6989l, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f12805l;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C11860l c11860l2 = this.f12810l;
                            InterfaceC5496l interfaceC5496l2 = c11860l2.f23690l;
                            if (interfaceC5496l2 == null) {
                                C8118l c8118l3 = ((C17417l) c11860l2.f833l).f33950l;
                                C17417l.admob(c8118l3);
                                c8118l3.f16908l.amazon("(legacy) Failed to get user properties; not connected to service", null, this.f12806l, this.f12804l);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(interfaceC5496l2.premium(this.f12806l, this.f12804l, this.f12808l, this.f12809l));
                            } else {
                                atomicReference2.set(interfaceC5496l2.adcel(null, this.f12806l, this.f12804l, this.f12808l));
                            }
                            c11860l2.m3266l();
                            atomicReference = (AtomicReference) this.f12805l;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            C8118l c8118l4 = ((C17417l) this.f12810l.f833l).f33950l;
                            C17417l.admob(c8118l4);
                            c8118l4.f16908l.amazon("(legacy) Failed to get user properties; remote exception", null, this.f12806l, e3);
                            ((AtomicReference) this.f12805l).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f12805l;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f12805l).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public RunnableC6034l(C11860l c11860l, AtomicReference atomicReference, String str, String str2, C10462l c10462l, boolean z) {
        this.f12805l = atomicReference;
        this.f12806l = str;
        this.f12804l = str2;
        this.f12809l = c10462l;
        this.f12808l = z;
        this.f12810l = c11860l;
    }
}
