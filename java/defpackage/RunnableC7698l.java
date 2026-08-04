package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lًؐ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7698l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f16148l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16149l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16150l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f16151l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f16152l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f16153l;

    public /* synthetic */ RunnableC7698l(BinderC15526l binderC15526l, C10462l c10462l, Bundle bundle, InterfaceC4992l interfaceC4992l, String str) {
        this.f16150l = 1;
        this.f16152l = binderC15526l;
        this.f16151l = c10462l;
        this.f16149l = bundle;
        this.f16153l = interfaceC4992l;
        this.f16148l = str;
    }

    private final void yandex() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = (AtomicReference) this.f16152l;
        synchronized (atomicReference2) {
            try {
                try {
                    C11860l c11860l = (C11860l) this.f16153l;
                    InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                    if (interfaceC5496l == null) {
                        C8118l c8118l = ((C17417l) c11860l.f833l).f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16908l.amazon("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f16148l, (String) this.f16151l);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(interfaceC5496l.mo1803l((String) this.f16148l, (String) this.f16151l, (C10462l) this.f16149l));
                    } else {
                        atomicReference2.set(interfaceC5496l.mo1807synchronized(null, (String) this.f16148l, (String) this.f16151l));
                    }
                    c11860l.m3266l();
                    atomicReference = (AtomicReference) this.f16152l;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    C8118l c8118l2 = ((C17417l) ((C11860l) this.f16153l).f833l).f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.amazon("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f16148l, e);
                    ((AtomicReference) this.f16152l).set(Collections.EMPTY_LIST);
                    atomicReference = (AtomicReference) this.f16152l;
                }
            } catch (Throwable th) {
                ((AtomicReference) this.f16152l).notify();
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceC16415l serviceC16415l;
        C17410l c17410l;
        switch (this.f16150l) {
            case 0:
                String str = (String) this.f16148l;
                IBinder binder = ((Messenger) ((C15053l) this.f16152l).f29576l).getBinder();
                C5008l c5008l = (C5008l) this.f16153l;
                C7996l c7996l = (C7996l) ((ServiceC16415l) c5008l.f10245l).f32110l.get(binder);
                if (c7996l == null) {
                    AbstractC11043l.remoteconfig("addSubscription for callback that isn't registered id=", str, "MBServiceCompat");
                    return;
                }
                HashMap map = c7996l.billing;
                ServiceC16415l serviceC16415l2 = (ServiceC16415l) c5008l.f10245l;
                IBinder iBinder = (IBinder) this.f16151l;
                Bundle bundle = (Bundle) this.f16149l;
                List<C17879l> arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (C17879l c17879l : arrayList) {
                    if (iBinder == c17879l.yandex) {
                        Bundle bundle2 = (Bundle) c17879l.loadAd;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            bundle2.getClass();
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                arrayList.add(new C17879l(iBinder, bundle));
                map.put(str, arrayList);
                serviceC16415l2.mopub(str, c7996l, bundle, null);
                serviceC16415l2.f32114l = c7996l;
                C6499l c6499lLoadAd = serviceC16415l2.loadAd();
                if (c6499lLoadAd == null) {
                    serviceC16415l = serviceC16415l2;
                } else if (TextUtils.isEmpty(str)) {
                    AbstractC6427l.vip("MLSLegacyStub", "onSubscribe(): Ignoring empty id from " + c6499lLoadAd);
                    serviceC16415l = serviceC16415l2;
                } else {
                    serviceC16415l = serviceC16415l2;
                    AbstractC15323l.m3966final(serviceC16415l2.f32112l.smaato, new RunnableC4063l(serviceC16415l, c6499lLoadAd, bundle, str, 5));
                }
                serviceC16415l.f32114l = null;
                return;
            case 1:
                BinderC15526l binderC15526l = (BinderC15526l) this.f16152l;
                C10462l c10462l = (C10462l) this.f16151l;
                Bundle bundle3 = (Bundle) this.f16149l;
                InterfaceC4992l interfaceC4992l = (InterfaceC4992l) this.f16153l;
                String str2 = (String) this.f16148l;
                C6901l c6901l = binderC15526l.purchase;
                c6901l.m2089continue();
                try {
                    interfaceC4992l.mo1264l(c6901l.m2108super(bundle3, c10462l));
                    return;
                } catch (RemoteException e) {
                    c6901l.mo200else().f16908l.crashlytics(str2, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                yandex();
                return;
            case 3:
                InterfaceC6989l interfaceC6989l = (InterfaceC6989l) this.f16149l;
                String str3 = (String) this.f16152l;
                String str4 = (String) this.f16148l;
                C11860l c11860l = (C11860l) this.f16153l;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                        if (interfaceC5496l == null) {
                            C17417l c17417l = (C17417l) c11860l.f833l;
                            C8118l c8118l = c17417l.f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16908l.crashlytics(str4, str3, "Failed to get conditional properties; not connected to service");
                            c17410l = c17417l.f33949l;
                        } else {
                            arrayList2 = C17410l.m4332l(interfaceC5496l.mo1803l(str4, str3, (C10462l) this.f16151l));
                            c11860l.m3266l();
                            c17410l = ((C17417l) c11860l.f833l).f33949l;
                        }
                    } catch (RemoteException e2) {
                        C8118l c8118l2 = ((C17417l) c11860l.f833l).f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16908l.amazon("Failed to get conditional properties; remote exception", str4, str3, e2);
                    }
                    C17417l.billing(c17410l);
                    c17410l.m4353l(interfaceC6989l, arrayList2);
                    return;
                } catch (Throwable th) {
                    C17410l c17410l2 = ((C17417l) c11860l.f833l).f33949l;
                    C17417l.billing(c17410l2);
                    c17410l2.m4353l(interfaceC6989l, arrayList2);
                    throw th;
                }
            default:
                C1976l c1976l = (C1976l) this.f16152l;
                C5008l c5008l2 = (C5008l) this.f16148l;
                C1770l c1770l = (C1770l) this.f16151l;
                Callable callable = (Callable) this.f16149l;
                C2350l c2350l = (C2350l) this.f16153l;
                try {
                    if (((C3823l) c5008l2.f10245l).firebase()) {
                        c1770l.purchase();
                        return;
                    }
                    try {
                        if (!c1976l.crashlytics.get()) {
                            synchronized (c1976l) {
                                c1976l.subs = c1976l.purchase.mopub();
                            }
                            c1976l.crashlytics.set(true);
                        }
                        if (((C3823l) c5008l2.f10245l).firebase()) {
                            c1770l.purchase();
                            return;
                        }
                        Object objCall = callable.call();
                        if (((C3823l) c5008l2.f10245l).firebase()) {
                            c1770l.purchase();
                            return;
                        } else {
                            c2350l.loadAd(objCall);
                            return;
                        }
                    } catch (RuntimeException e3) {
                        throw new C12397l("Internal error has occurred when executing ML Kit tasks", e3);
                    }
                } catch (Exception e4) {
                    if (((C3823l) c5008l2.f10245l).firebase()) {
                        c1770l.purchase();
                        return;
                    } else {
                        c2350l.yandex(e4);
                        return;
                    }
                }
        }
    }

    public /* synthetic */ RunnableC7698l(Object obj, Object obj2, String str, Object obj3, Parcelable parcelable, int i) {
        this.f16150l = i;
        this.f16153l = obj;
        this.f16152l = obj2;
        this.f16148l = str;
        this.f16151l = obj3;
        this.f16149l = parcelable;
    }

    public /* synthetic */ RunnableC7698l(C1976l c1976l, C5008l c5008l, C1770l c1770l, Callable callable, C2350l c2350l) {
        this.f16150l = 4;
        this.f16152l = c1976l;
        this.f16148l = c5008l;
        this.f16151l = c1770l;
        this.f16149l = callable;
        this.f16153l = c2350l;
    }

    public RunnableC7698l(C11860l c11860l, String str, String str2, C10462l c10462l, InterfaceC6989l interfaceC6989l) {
        this.f16150l = 3;
        this.f16148l = str;
        this.f16152l = str2;
        this.f16151l = c10462l;
        this.f16149l = interfaceC6989l;
        this.f16153l = c11860l;
    }
}
