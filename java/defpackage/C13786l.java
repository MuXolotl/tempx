package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lْۥْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13786l extends AbstractC2660l {
    public static final C0022l amazon = new C0022l("MediaRouterCallback", null);
    public final C8181l crashlytics;
    public final BinderC2728l loadAd;
    public final C4128l yandex;

    public C13786l(C4128l c4128l, BinderC2728l binderC2728l, C8181l c8181l) {
        AbstractC1051l.subs(c4128l);
        this.yandex = c4128l;
        this.loadAd = binderC2728l;
        this.crashlytics = c8181l;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    public final void admob(C9961l c9961l) {
        C0189l c0189l;
        C8181l c8181l = this.crashlytics;
        if (c8181l != null && c8181l.purchase && c8181l.yandex.f24037l) {
            C17667l c17667l = c8181l.billing;
            if (c17667l != null) {
                AbstractC1051l.purchase("Must be called from the main thread.");
                AbstractC11229l abstractC11229lCrashlytics = c17667l.crashlytics();
                if (abstractC11229lCrashlytics == null || !(abstractC11229lCrashlytics instanceof C0189l)) {
                    c0189l = null;
                } else {
                    c0189l = (C0189l) abstractC11229lCrashlytics;
                }
            } else {
                c0189l = null;
            }
            if (c0189l == null) {
                c9961l.getClass();
                C9961l.billing(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            c9961l.getClass();
            C9961l.loadAd();
            for (C12736l c12736l : C9961l.crashlytics().subs) {
                if (CastDevice.billing(c12736l.subscription) != null) {
                    arrayList.add(new C4126l(new C3185l(c12736l.crashlytics, 3, (char) 0)));
                }
            }
            C8181l.mopub.loadAd("updateRouteListingPreference with %d available routes", Integer.valueOf(arrayList.size()));
            C4300l c4300l = new C4300l();
            c4300l.loadAd = Collections.EMPTY_LIST;
            c4300l.crashlytics = true;
            c4300l.loadAd = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
            C9961l.billing(new C1536l(c4300l));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.AbstractC2660l
    public final void amazon(C12736l c12736l, C12736l c12736l2, int i) {
        String str = c12736l2.crashlytics;
        C0022l c0022l = amazon;
        if (c12736l != null) {
            String str2 = c12736l.crashlytics;
            if (c12736l.smaato == 1) {
                Log.i(c0022l.yandex, c0022l.amazon("onRouteDisconnected with disconnectedRouteId = %s, requestedRouteId = %s, reason = %d", str2, str, Integer.valueOf(i)));
                this.loadAd.smaato = false;
                try {
                    C4128l c4128l = this.yandex;
                    Parcel parcelM746l = c4128l.m746l(c4128l.m743l(), 7);
                    int i2 = parcelM746l.readInt();
                    parcelM746l.recycle();
                    if (i2 < 251600000) {
                        Bundle bundle = c12736l.subscription;
                        Parcel parcelM743l = c4128l.m743l();
                        parcelM743l.writeString(str2);
                        AbstractC14627l.loadAd(parcelM743l, bundle);
                        parcelM743l.writeInt(i);
                        c4128l.m741l(parcelM743l, 6);
                        return;
                    }
                    Bundle bundle2 = c12736l.subscription;
                    Parcel parcelM743l2 = c4128l.m743l();
                    parcelM743l2.writeString(str);
                    parcelM743l2.writeString(str2);
                    AbstractC14627l.loadAd(parcelM743l2, bundle2);
                    parcelM743l2.writeInt(i);
                    c4128l.m741l(parcelM743l2, 10);
                    return;
                } catch (RemoteException e) {
                    c0022l.yandex(e, "Unable to call %s on %s.", "onRouteDisconnected", C4128l.class.getSimpleName());
                    return;
                }
            }
        }
        Log.i(c0022l.yandex, c0022l.amazon("ignore onRouteDisconnected for invalid or non-remote disconnected route", new Object[0]));
    }

    @Override // defpackage.AbstractC2660l
    public final void billing(C9961l c9961l, C12736l c12736l, int i, C12736l c12736l2) {
        int i2 = c12736l.smaato;
        String str = c12736l.crashlytics;
        C0022l c0022l = amazon;
        if (i2 != 1) {
            Log.i(c0022l.yandex, c0022l.amazon("ignore onRouteSelected for non-remote selected routeId: %s", str));
            return;
        }
        Log.i(c0022l.yandex, c0022l.amazon("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i), str));
        try {
            C4128l c4128l = this.yandex;
            Parcel parcelM746l = c4128l.m746l(c4128l.m743l(), 7);
            int i3 = parcelM746l.readInt();
            parcelM746l.recycle();
            if (i3 >= 220400000) {
                String str2 = c12736l2.crashlytics;
                Bundle bundle = c12736l.subscription;
                Parcel parcelM743l = c4128l.m743l();
                parcelM743l.writeString(str2);
                parcelM743l.writeString(str);
                AbstractC14627l.loadAd(parcelM743l, bundle);
                c4128l.m741l(parcelM743l, 8);
            } else {
                String str3 = c12736l2.crashlytics;
                Bundle bundle2 = c12736l.subscription;
                Parcel parcelM743l2 = c4128l.m743l();
                parcelM743l2.writeString(str3);
                AbstractC14627l.loadAd(parcelM743l2, bundle2);
                c4128l.m741l(parcelM743l2, 4);
            }
        } catch (RemoteException e) {
            c0022l.yandex(e, "Unable to call %s on %s.", "onRouteSelected", C4128l.class.getSimpleName());
        }
        admob(c9961l);
    }

    @Override // defpackage.AbstractC2660l
    public final void crashlytics(C12736l c12736l, C12736l c12736l2) {
        int i = c12736l.smaato;
        String str = c12736l.crashlytics;
        C0022l c0022l = amazon;
        if (i != 1) {
            Log.i(c0022l.yandex, c0022l.amazon("ignore onRouteConnected for non-remote connected routeId: %s", str));
            return;
        }
        Log.i(c0022l.yandex, c0022l.amazon("onRouteConnected with connectedRouteId = %s", str));
        this.loadAd.smaato = true;
        try {
            C4128l c4128l = this.yandex;
            Parcel parcelM746l = c4128l.m746l(c4128l.m743l(), 7);
            int i2 = parcelM746l.readInt();
            parcelM746l.recycle();
            String str2 = c12736l2.crashlytics;
            if (i2 >= 251600000) {
                Bundle bundle = c12736l.subscription;
                Parcel parcelM743l = c4128l.m743l();
                parcelM743l.writeString(str2);
                parcelM743l.writeString(str);
                AbstractC14627l.loadAd(parcelM743l, bundle);
                c4128l.m741l(parcelM743l, 9);
                return;
            }
            Bundle bundle2 = c12736l.subscription;
            Parcel parcelM743l2 = c4128l.m743l();
            parcelM743l2.writeString(str2);
            parcelM743l2.writeString(str);
            AbstractC14627l.loadAd(parcelM743l2, bundle2);
            c4128l.m741l(parcelM743l2, 8);
        } catch (RemoteException e) {
            c0022l.yandex(e, "Unable to call %s on %s.", "onRouteConnected", C4128l.class.getSimpleName());
        }
    }

    @Override // defpackage.AbstractC2660l
    public final void loadAd(C9961l c9961l, C12736l c12736l) {
        C9961l.loadAd();
        if (C9961l.crashlytics().mopub() == c12736l) {
            try {
                C4128l c4128l = this.yandex;
                String str = c12736l.crashlytics;
                Bundle bundle = c12736l.subscription;
                Parcel parcelM743l = c4128l.m743l();
                parcelM743l.writeString(str);
                AbstractC14627l.loadAd(parcelM743l, bundle);
                c4128l.m741l(parcelM743l, 2);
            } catch (RemoteException e) {
                amazon.yandex(e, "Unable to call %s on %s.", "onRouteChanged", C4128l.class.getSimpleName());
            }
            admob(c9961l);
        }
    }

    @Override // defpackage.AbstractC2660l
    public final void mopub(C9961l c9961l, C12736l c12736l, int i) {
        int i2 = c12736l.smaato;
        String str = c12736l.crashlytics;
        C0022l c0022l = amazon;
        if (i2 != 1) {
            Log.i(c0022l.yandex, c0022l.amazon("ignore onRouteUnselected for non-remote routeId: %s", str));
            return;
        }
        Log.i(c0022l.yandex, c0022l.amazon("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), str));
        try {
            C4128l c4128l = this.yandex;
            Bundle bundle = c12736l.subscription;
            Parcel parcelM743l = c4128l.m743l();
            parcelM743l.writeString(str);
            AbstractC14627l.loadAd(parcelM743l, bundle);
            parcelM743l.writeInt(i);
            c4128l.m741l(parcelM743l, 6);
        } catch (RemoteException e) {
            c0022l.yandex(e, "Unable to call %s on %s.", "onRouteUnselected", C4128l.class.getSimpleName());
        }
        admob(c9961l);
    }

    @Override // defpackage.AbstractC2660l
    public final void purchase(C9961l c9961l, C12736l c12736l) {
        try {
            C4128l c4128l = this.yandex;
            String str = c12736l.crashlytics;
            Bundle bundle = c12736l.subscription;
            Parcel parcelM743l = c4128l.m743l();
            parcelM743l.writeString(str);
            AbstractC14627l.loadAd(parcelM743l, bundle);
            c4128l.m741l(parcelM743l, 3);
        } catch (RemoteException e) {
            amazon.yandex(e, "Unable to call %s on %s.", "onRouteRemoved", C4128l.class.getSimpleName());
        }
        admob(c9961l);
    }

    @Override // defpackage.AbstractC2660l
    public final void yandex(C9961l c9961l, C12736l c12736l) {
        try {
            C4128l c4128l = this.yandex;
            String str = c12736l.crashlytics;
            Bundle bundle = c12736l.subscription;
            Parcel parcelM743l = c4128l.m743l();
            parcelM743l.writeString(str);
            AbstractC14627l.loadAd(parcelM743l, bundle);
            c4128l.m741l(parcelM743l, 1);
        } catch (RemoteException e) {
            amazon.yandex(e, "Unable to call %s on %s.", "onRouteAdded", C4128l.class.getSimpleName());
        }
        admob(c9961l);
    }
}
