package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import androidx.car.app.navigation.model.Maneuver;
import androidx.versionedparcelable.ParcelImpl;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lِؕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11621l {
    public static final C3384l yandex = new C3384l(0, null);
    public static final C3384l loadAd = new C3384l(1, null);
    public static final C9138l crashlytics = new C9138l(3, "nearby_connections");
    public static final C9138l amazon = new C9138l(2, "nearby_connections_v2");
    public static final C9138l purchase = new C9138l(1, "nearby_connections_v3");
    public static final C9138l billing = new C9138l(1, "nearby_connections_get_local_endpoint_id");
    public static final C9138l mopub = new C9138l(2, "nearby_connections_register_device_provider");
    public static final C9138l admob = new C9138l(1, "nearby_connections_update_advertising_options");
    public static final C9138l subs = new C9138l(1, "nearby_connections_update_connection_options");
    public static final C9138l isPro = new C9138l(1, "nearby_connections_update_discovery_options");
    public static final C9138l firebase = new C9138l(1, "nearby_connections_setting");
    public static final C9138l smaato = new C9138l(1, "nearby_connections_set_downloads_directory");

    public static LinkedHashSet admob(C3498l c3498l, Collection collection, Collection collection2, InterfaceC17477l interfaceC17477l, InterfaceC9407l interfaceC9407l, C14450l c14450l, boolean z) {
        if (c3498l == null) {
            yandex(12);
            throw null;
        }
        if (collection == null) {
            yandex(13);
            throw null;
        }
        if (interfaceC17477l == null) {
            yandex(15);
            throw null;
        }
        if (interfaceC9407l == null) {
            yandex(16);
            throw null;
        }
        if (c14450l == null) {
            yandex(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c14450l.admob(c3498l, collection, collection2, interfaceC17477l, new C5230l(interfaceC9407l, linkedHashSet, z));
        return linkedHashSet;
    }

    public static AbstractC16431l amazon(int i) {
        if (i != 0) {
            return i != 1 ? new C10978l() : new C16563l();
        }
        return new C10978l();
    }

    public static InterfaceC12713l billing(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(AbstractC11621l.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).f477l;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static C4853l crashlytics() {
        return new C4853l(0);
    }

    public static void firebase(View view, C5022l c5022l) {
        C4079l c4079l = c5022l.f10262l.loadAd;
        if (c4079l == null || !c4079l.yandex) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            elevation += ((View) parent).getElevation();
        }
        C18309l c18309l = c5022l.f10262l;
        if (c18309l.smaato != elevation) {
            c18309l.smaato = elevation;
            c5022l.metrica();
        }
    }

    public static LinkedHashSet isPro(C3498l c3498l, Collection collection, AbstractCollection abstractCollection, C18174l c18174l, InterfaceC9407l interfaceC9407l, C14450l c14450l) {
        if (c3498l == null) {
            yandex(6);
            throw null;
        }
        if (collection == null) {
            yandex(7);
            throw null;
        }
        if (c18174l == null) {
            yandex(9);
            throw null;
        }
        if (interfaceC9407l == null) {
            yandex(10);
            throw null;
        }
        if (c14450l != null) {
            return admob(c3498l, collection, abstractCollection, c18174l, interfaceC9407l, c14450l, true);
        }
        yandex(11);
        throw null;
    }

    public static final void loadAd(InterfaceC17242l interfaceC17242l, final long j, final long j2, final Function3 function3, C6956l c6956l, final int i) {
        final InterfaceC17242l interfaceC17242l2;
        InterfaceC17242l interfaceC17242l3;
        InterfaceC6347l interfaceC6347lLoadAd;
        char c;
        c6956l.m2133new(1428256508);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= c6956l.purchase(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.purchase(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            c6956l.m2141switch();
            int i4 = i & 1;
            InterfaceC17242l interfaceC17242lVip = C4346l.f8873l;
            if (i4 == 0 || c6956l.ad()) {
                interfaceC17242l3 = interfaceC17242lVip;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l;
            }
            c6956l.adcel();
            float f = function3 != null ? 16.0f : 6.0f;
            if (function3 != null) {
                c6956l.m2123default(-1051024814);
                interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1050967433);
                interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                c6956l.startapp(false);
            }
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0080l.yandex(interfaceC17242l3, f, f), j, interfaceC6347lLoadAd);
            if (function3 != null) {
                c = ' ';
                interfaceC17242lVip = AbstractC3605l.vip(interfaceC17242lVip, 4.0f, 0.0f, 2);
            } else {
                c = ' ';
            }
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242lAmazon.premium(interfaceC17242lVip);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.purchase, C18450l.f36040l, c6956l, 54);
            long j3 = c6956l.f14595continue;
            int i5 = (int) (j3 ^ (j3 >>> c));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            if (function3 != null) {
                c6956l.m2123default(1345815094);
                AbstractC3383l.billing(j2, AbstractC8644l.yandex(c6956l, 12), AbstractC14566l.amazon(541712501, new C15232l(i3, function3), c6956l), c6956l, ((i2 >> 6) & 14) | 384);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(1346141834);
                c6956l.startapp(false);
            }
            c6956l.startapp(true);
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lُۨٙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC11621l.loadAd(interfaceC17242l2, j, j2, function3, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void mopub(Bundle bundle, InterfaceC12713l interfaceC12713l) {
        if (interfaceC12713l == null) {
            bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(interfaceC12713l));
        bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
    }

    public static C17538l purchase(C3498l c3498l, InterfaceC17477l interfaceC17477l) {
        if (c3498l == null) {
            yandex(19);
            throw null;
        }
        if (interfaceC17477l == null) {
            yandex(20);
            throw null;
        }
        Collection collectionAdcel = interfaceC17477l.adcel();
        if (collectionAdcel.size() != 1) {
            return null;
        }
        for (C17538l c17538l : ((C5786l) collectionAdcel.iterator().next()).mo1007finally()) {
            if (c17538l.getName().equals(c3498l)) {
                return c17538l;
            }
        }
        return null;
    }

    public static LinkedHashSet subs(C3498l c3498l, AbstractCollection abstractCollection, Collection collection, InterfaceC17477l interfaceC17477l, InterfaceC9407l interfaceC9407l, C14450l c14450l) {
        if (c3498l == null) {
            yandex(0);
            throw null;
        }
        if (interfaceC17477l == null) {
            yandex(3);
            throw null;
        }
        if (interfaceC9407l == null) {
            yandex(4);
            throw null;
        }
        if (c14450l != null) {
            return admob(c3498l, abstractCollection, collection, interfaceC17477l, interfaceC9407l, c14450l, false);
        }
        yandex(5);
        throw null;
    }

    public static /* synthetic */ void yandex(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                objArr[0] = "name";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "resolveOverrides";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }
}
