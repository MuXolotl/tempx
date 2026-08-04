package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lؔٚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2728l extends AbstractBinderC5395l {
    public static final C0022l remoteconfig = new C0022l("MediaRouterProxy", null);
    public final HashMap admob;
    public final C9961l billing;
    public boolean firebase;
    public final boolean isPro;
    public final C12100l mopub;
    public boolean smaato;
    public final C8181l subs;

    public BinderC2728l(Context context, C9961l c9961l, C12100l c12100l, C7560l c7560l) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 2);
        this.admob = new HashMap();
        this.billing = c9961l;
        this.mopub = c12100l;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        remoteconfig.loadAd("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.subs = new C8181l(c12100l);
        Intent intent = new Intent(context, (Class<?>) AbstractC7639l.class);
        intent.setPackage(context.getPackageName());
        this.isPro = !context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.firebase = true;
        c7560l.admob(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).yandex(new C5321l(this));
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public final boolean m1241l() {
        C12100l c12100l;
        return this.isPro && this.firebase && (c12100l = this.mopub) != null && c12100l.f24030l;
    }

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public final void m1242l(C16710l c16710l) {
        Set set = (Set) this.admob.get(c16710l);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.billing.purchase((AbstractC2660l) it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:56:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lٕؓۡ */
    public final boolean mo1129l(int i, Parcel parcel, Parcel parcel2) {
        C4128l c4128l;
        C16710l c16710l = null;
        Bundle bundle = null;
        C16710l c16710l2 = null;
        C16710l c16710l3 = null;
        C16710l c16710l4 = null;
        HashMap map = this.admob;
        C0022l c0022l = remoteconfig;
        int i2 = 0;
        C9961l c9961l = this.billing;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c4128l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    c4128l = iInterfaceQueryLocalInterface instanceof C4128l ? (C4128l) iInterfaceQueryLocalInterface : new C4128l(strongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 1);
                }
                AbstractC14627l.amazon(parcel);
                if (bundle2 != null) {
                    c16710l = new C16710l(bundle2, null);
                } else {
                    C16710l c16710l5 = C16710l.crashlytics;
                }
                if (c16710l != null) {
                    if (!map.containsKey(c16710l)) {
                        map.put(c16710l, new HashSet());
                    }
                    ((Set) map.get(c16710l)).add(new C13786l(c4128l, this, this.subs));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle3 = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                int i3 = parcel.readInt();
                AbstractC14627l.amazon(parcel);
                if (bundle3 != null) {
                    c16710l4 = new C16710l(bundle3, null);
                } else {
                    C16710l c16710l6 = C16710l.crashlytics;
                }
                if (c16710l4 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        m1244l(c16710l4, i3);
                    } else {
                        new HandlerC4052l(Looper.getMainLooper(), 6).post(new RunnableC16824l(this, c16710l4, i3, 3));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle4 = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                AbstractC14627l.amazon(parcel);
                if (bundle4 != null) {
                    c16710l3 = new C16710l(bundle4, null);
                } else {
                    C16710l c16710l7 = C16710l.crashlytics;
                }
                if (c16710l3 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        m1242l(c16710l3);
                    } else {
                        new HandlerC4052l(Looper.getMainLooper(), 6).post(new RunnableC9929l(this, c16710l3, 29));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle5 = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                int i4 = parcel.readInt();
                AbstractC14627l.amazon(parcel);
                if (bundle5 != null) {
                    c16710l2 = new C16710l(bundle5, null);
                } else {
                    C16710l c16710l8 = C16710l.crashlytics;
                }
                if (c16710l2 != null) {
                    c9961l.getClass();
                    C9961l.loadAd();
                    C17646l c17646lCrashlytics = C9961l.crashlytics();
                    ArrayList arrayList = c17646lCrashlytics.subs;
                    c16710l2.yandex();
                    if (!c16710l2.loadAd.isEmpty()) {
                        if ((i4 & 2) == 0 && c17646lCrashlytics.startapp) {
                            i2 = 1;
                        } else {
                            C9868l c9868l = c17646lCrashlytics.Signature;
                            byte b = c9868l != null && c9868l.loadAd && c17646lCrashlytics.admob();
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                C12736l c12736l = (C12736l) arrayList.get(i5);
                                if (((i4 & 1) == 0 || !c12736l.crashlytics()) && ((!b == true || c12736l.crashlytics() || c12736l.yandex() == c17646lCrashlytics.ads) && c12736l.purchase(c16710l2))) {
                                    i2 = 1;
                                }
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 5:
                Object string = parcel.readString();
                AbstractC14627l.amazon(parcel);
                c0022l.loadAd("select route with routeId = %s", string);
                c9961l.getClass();
                C9961l.loadAd();
                for (C12736l c12736l2 : C9961l.crashlytics().subs) {
                    if (c12736l2.crashlytics.equals(string)) {
                        c0022l.loadAd("media route is found and selected", new Object[0]);
                        c12736l2.mopub(true);
                        parcel2.writeNoException();
                        return true;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                c9961l.getClass();
                C9961l.loadAd();
                C12736l c12736l3 = C9961l.crashlytics().license;
                if (c12736l3 == null) {
                    C8339l.smaato("There is no default route.  The media router has not yet been fully initialized.");
                    return false;
                }
                c12736l3.mopub(true);
                parcel2.writeNoException();
                return true;
            case 7:
                c9961l.getClass();
                C9961l.loadAd();
                C12736l c12736l4 = C9961l.crashlytics().license;
                if (c12736l4 == null) {
                    C8339l.smaato("There is no default route.  The media router has not yet been fully initialized.");
                    return false;
                }
                C9961l.loadAd();
                boolean zEquals = C9961l.crashlytics().mopub().crashlytics.equals(c12736l4.crashlytics);
                parcel2.writeNoException();
                int i6 = AbstractC14627l.yandex;
                parcel2.writeInt(zEquals ? 1 : 0);
                return true;
            case 8:
                String string2 = parcel.readString();
                AbstractC14627l.amazon(parcel);
                c9961l.getClass();
                C9961l.loadAd();
                for (C12736l c12736l5 : C9961l.crashlytics().subs) {
                    if (c12736l5.crashlytics.equals(string2)) {
                        bundle = c12736l5.subscription;
                        parcel2.writeNoException();
                        if (bundle == null) {
                            parcel2.writeInt(0);
                            return true;
                        }
                        parcel2.writeInt(1);
                        bundle.writeToParcel(parcel2, 1);
                        return true;
                    }
                }
                parcel2.writeNoException();
                if (bundle == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            case 9:
                c9961l.getClass();
                C9961l.loadAd();
                String str = C9961l.crashlytics().mopub().crashlytics;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 11:
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        c9961l.purchase((AbstractC2660l) it2.next());
                    }
                }
                map.clear();
                parcel2.writeNoException();
                return true;
            case 12:
                c9961l.getClass();
                C9961l.loadAd();
                C12736l c12736l6 = C9961l.crashlytics().pro;
                if (c12736l6 != null) {
                    C9961l.loadAd();
                    if (C9961l.crashlytics().mopub().crashlytics.equals(c12736l6.crashlytics)) {
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                int i7 = AbstractC14627l.yandex;
                parcel2.writeInt(i2);
                return true;
            case 13:
                int i8 = parcel.readInt();
                AbstractC14627l.amazon(parcel);
                c9961l.getClass();
                C9961l.mopub(i8);
                parcel2.writeNoException();
                return true;
            case 14:
                String string3 = parcel.readString();
                AbstractC14627l.amazon(parcel);
                c9961l.getClass();
                C9961l.loadAd();
                for (C12037l c12037l : C9961l.crashlytics().purchase()) {
                    if (c12037l.crashlytics.equals(string3)) {
                        c0022l.loadAd("clean up the connectedGroupRoute = %s", c12037l);
                        C9961l.loadAd();
                        if (C9961l.crashlytics().isPro.get(c12037l.crashlytics) != null) {
                            C18725l.loadAd();
                            return false;
                        }
                    }
                }
                C9961l.loadAd();
                C12736l c12736lMopub = C9961l.crashlytics().mopub();
                if (c12736lMopub != null && !c12736lMopub.admob && c12736lMopub.crashlytics.equals(string3)) {
                    c0022l.loadAd("clean up the selected route = %s", c12736lMopub);
                    C9961l.mopub(0);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public final void m1243l(C0554l c0554l) {
        C0554l c0554l2;
        this.billing.getClass();
        C9961l.loadAd();
        C17646l c17646lCrashlytics = C9961l.crashlytics();
        if (c0554l != null) {
            c17646lCrashlytics.getClass();
            c0554l2 = new C0554l();
            c0554l2.f1956l = c17646lCrashlytics;
            c0554l2.f1958l = c0554l;
        } else {
            c0554l2 = null;
        }
        C0554l c0554l3 = c17646lCrashlytics.applovin;
        if (c0554l3 != null) {
            c0554l3.advert();
        }
        c17646lCrashlytics.applovin = c0554l2;
        if (c0554l2 != null) {
            c17646lCrashlytics.remoteconfig();
        }
    }

    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public final void m1244l(C16710l c16710l, int i) {
        Set set = (Set) this.admob.get(c16710l);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.billing.yandex(c16710l, (AbstractC2660l) it.next(), i);
        }
    }
}
