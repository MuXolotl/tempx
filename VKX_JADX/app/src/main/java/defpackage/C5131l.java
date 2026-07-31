package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.car.app.IStartCarApp;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.MigrationCallback;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؗۙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5131l implements InterfaceC6610l, InterfaceC18517l, InterfaceC15244l, MigrationCallback, InterfaceC16975l, InterfaceC8671l, InterfaceC6384l, InterfaceC2792l, InterfaceC10162l, InterfaceC0737l, InterfaceC11459l, InterfaceC11724l, InterfaceC12052l, InterfaceC0119l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f11164l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f11165l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11166l;

    public /* synthetic */ C5131l(C5597l c5597l, Object obj, long j) {
        this.f11166l = 13;
        this.f11165l = c5597l;
        this.f11164l = obj;
    }

    @Override // defpackage.InterfaceC2792l
    public void admob(C13808l c13808l) {
        C8857l c8857l = (C8857l) this.f11165l;
        EnumC15109l enumC15109l = (((C15691l) this.f11164l).crashlytics.yandex() && c13808l.amazon) ? EnumC15109l.f29639l : EnumC15109l.f29640l;
        C10628l c10628l = c8857l.f18211l;
        AbstractC6123l.amazon((AtomicBoolean) c10628l.f21563l, true);
        AbstractC6123l.crashlytics((Thread) c10628l.f21569l);
        if (((EnumC15109l) c10628l.f21562l) != enumC15109l) {
            c10628l.f21562l = enumC15109l;
            c10628l.metrica(c10628l.f21567l);
        }
    }

    @Override // defpackage.InterfaceC12052l
    public void amazon(C13208l c13208l) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f11166l;
        Object obj = this.f11164l;
        Object obj2 = this.f11165l;
        switch (i) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                c13208l.m3610l((C1908l) obj2, (C3508l) obj);
                break;
            default:
                C14023l c14023l = (C14023l) obj2;
                C16616l c16616l = (C16616l) obj;
                C16811l c16811l = c13208l.yandex;
                if (c13208l.mo319l()) {
                    boolean zEquals = Objects.equals(c13208l.ad, c16616l);
                    boolean zEquals2 = Objects.equals(c13208l.pro, c14023l);
                    if (!zEquals || !zEquals2) {
                        c13208l.pro = c14023l;
                        byte b = 0;
                        if (zEquals) {
                            z = false;
                        } else {
                            c13208l.ad = c16616l;
                            C16616l c16616l2 = c13208l.isVip;
                            C16616l c16616lM3607l = c13208l.m3607l(c16616l, c13208l.advert);
                            c13208l.isVip = c16616lM3607l;
                            z = !c16616lM3607l.equals(c16616l2);
                        }
                        if (!zEquals2 || z) {
                            C13708l c13708l = c13208l.Signature;
                            C13708l c13708l2 = c13208l.license;
                            C13708l c13708lM3589l = C13208l.m3589l(c13208l.tapsense, c13208l.subscription, c14023l, c13208l.isVip, c13208l.f25987strictfp);
                            c13208l.Signature = c13708lM3589l;
                            c13208l.license = C13208l.m3594l(c13708lM3589l, c13208l.subscription, c13208l.f25987strictfp, c14023l, c13208l.isVip, c13208l.m3611l());
                            z2 = !c13208l.Signature.equals(c13708l);
                            z3 = !c13208l.license.equals(c13708l2);
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                        if (z) {
                            c13208l.subs.mopub(13, new C16262l(c13208l, b == true ? 1 : 0));
                        }
                        if (!zEquals2) {
                            c16811l.getClass();
                            AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
                            c16811l.f32840l.amazon();
                        }
                        if (z3) {
                            c16811l.getClass();
                            AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
                            c16811l.f32840l.getClass();
                        }
                        if (z2) {
                            c16811l.getClass();
                            AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
                            c16811l.f32840l.isVip();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f11166l;
        Object obj = this.f11164l;
        C13208l c13208l = (C13208l) this.f11165l;
        switch (i2) {
            case 21:
                interfaceC4725l.mo442l(c13208l.crashlytics, i, (Surface) obj);
                break;
            case 22:
                interfaceC4725l.mo462l(c13208l.crashlytics, i, ((C3852l) obj).crashlytics(c13208l.m3611l()));
                break;
            case 23:
                interfaceC4725l.mo425case(c13208l.crashlytics, i, ((C4970l) obj).crashlytics());
                break;
            default:
                C1372l c1372l = (C1372l) obj;
                BinderC11857l binderC11857l = c13208l.crashlytics;
                c1372l.getClass();
                Bundle bundle = new Bundle();
                bundle.putFloat(C1372l.purchase, c1372l.yandex);
                bundle.putFloat(C1372l.billing, c1372l.loadAd);
                interfaceC4725l.mo439l(binderC11857l, i, bundle);
                break;
        }
    }

    @Override // defpackage.InterfaceC6610l
    public Object call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.f11165l;
        Intent intent = (Intent) this.f11164l;
        int i = CarAppNotificationBroadcastReceiver.yandex;
        iStartCarApp.startCarApp(intent);
        return null;
    }

    @Override // defpackage.InterfaceC0119l
    public void crashlytics(C6499l c6499l) {
        C13350l c13350l = (C13350l) this.f11165l;
        AbstractC7778l abstractC7778l = (AbstractC7778l) this.f11164l;
        C3726l c3726l = c13350l.admob;
        C2427l c2427lM4567l = c3726l.tapsense.m4567l();
        if (c2427lM4567l == null) {
            return;
        }
        String str = c2427lM4567l.yandex;
        C15035l c15035l = c3726l.purchase;
        c3726l.m1421volatile(c6499l);
        AbstractC12442l.metrica(AbstractC16840l.purchase(3, null, c15035l.yandex, new C0932l(c15035l, str, abstractC7778l, (InterfaceC14029l) null, 12)), "Callback.onSetRating must return non-null future");
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f11166l;
        Object obj2 = this.f11164l;
        Object obj3 = this.f11165l;
        switch (i) {
            case 5:
                ((InterfaceC5252l) obj).billing((C5597l) obj3, (C1372l) obj2);
                break;
            case 7:
                ((InterfaceC5252l) obj).ads((C5597l) obj3, (C13736l) obj2);
                break;
            case 8:
                ((InterfaceC5252l) obj).remoteconfig((C5597l) obj3, (C7417l) obj2);
                break;
            case 9:
                ((InterfaceC5252l) obj).mo1738catch((C5597l) obj3, (C1047l) obj2);
                break;
            case 10:
                ((InterfaceC5252l) obj).mo1739class((C5597l) obj3, (C14723l) obj2);
                break;
            case 11:
                ((InterfaceC5252l) obj).mo1753volatile((C5597l) obj3, (C9294l) obj2);
                break;
            case 12:
                C15074l c15074l = (C15074l) obj2;
                ((InterfaceC5252l) obj).Signature((C5597l) obj3, c15074l);
                int i2 = c15074l.yandex;
                break;
            case 13:
                ((InterfaceC5252l) obj).isPro((C5597l) obj3, obj2);
                break;
            case 14:
                ((InterfaceC5252l) obj).mo1741else((C5597l) obj3, (Exception) obj2);
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((InterfaceC13521l) obj).ads(((Integer) obj2).intValue(), (C2427l) obj3);
                break;
            default:
                ((InterfaceC13521l) obj).ads(((Integer) obj2).intValue(), ((C1908l) ((C1424l) obj3).f3603l).subscription());
                break;
        }
    }

    @Override // defpackage.InterfaceC18517l
    public void isPro(Object obj) {
        CarAppPermissionActivity carAppPermissionActivity = (CarAppPermissionActivity) this.f11165l;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = (IOnRequestPermissionsListener) this.f11164l;
        int i = CarAppPermissionActivity.f276l;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool == null || !bool.booleanValue()) {
                arrayList2.add((String) entry.getKey());
            } else {
                arrayList.add((String) entry.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
        } catch (RemoteException e) {
            Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
        }
        carAppPermissionActivity.finish();
    }

    @Override // defpackage.InterfaceC10162l
    public void metrica(C3823l c3823l) {
        ((FirebaseMessagingService) this.f11165l).yandex((Intent) this.f11164l);
    }

    @Override // io.realm.kotlin.internal.interop.MigrationCallback
    public void migrate(NativePointer nativePointer, NativePointer nativePointer2, NativePointer nativePointer3) {
        C12125l c12125l = (C12125l) this.f11165l;
        C15452l c15452l = (C15452l) this.f11164l;
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_begin_read(ptr$cinterop_release);
        realmcJNI.realm_begin_read(((LongPointerWrapper) nativePointer2).getPtr$cinterop_release());
        C9529l c9529l = new C9529l(new C6659l(c12125l, nativePointer, 1), new C6659l(c12125l, nativePointer2, 0));
        C6336l c6336l = c15452l.f30209l;
        System.currentTimeMillis();
        C6336l c6336l2 = C6336l.yandex;
        C6336l.amazon(c9529l, 3L, new C3151l(1, C7085l.yandex, C7085l.class, "migrate", "migrate(Lio/realm/kotlin/migration/AutomaticSchemaMigration$MigrationContext;)V", 0, 0, 16));
        long ptr$cinterop_release2 = ((LongPointerWrapper) c9529l.yandex.remoteconfig().mo1845l()).getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        if (4 > realmcJNI.realm_get_schema_version(ptr$cinterop_release2)) {
            c9529l.yandex("CachedAlbum", new C4951l(25, c9529l.loadAd));
            Unit unit = Unit.INSTANCE;
        }
        C6336l.amazon(c9529l, 8L, new C3151l(1, C17416l.yandex, C17416l.class, "migrate", "migrate(Lio/realm/kotlin/migration/AutomaticSchemaMigration$MigrationContext;)V", 0, 0, 17));
        System.currentTimeMillis();
    }

    @Override // defpackage.InterfaceC0737l
    public C2432l mopub(C2432l c2432l) {
        Function0 function0 = (Function0) this.f11165l;
        C18073l c18073l = (C18073l) this.f11164l;
        if (((Boolean) function0.invoke()).booleanValue()) {
            C3304l c3304lYandex = c2432l.yandex();
            c3304lYandex.isPro = 1;
            return c3304lYandex.yandex();
        }
        Uri uri = c2432l.yandex;
        c18073l.getClass();
        C18659l c18659l = C18659l.yandex;
        Uri uri2 = null;
        String str = (AbstractC8576l.yandex(uri.getScheme(), "vkx") && uri.getPathSegments().size() == 2) ? (String) AbstractC16901l.m4214continue(uri.getPathSegments()) : null;
        if (str != null) {
            List listM3338public = AbstractC12024l.m3338public(str, new String[]{"_"}, 6);
            String str2 = (String) AbstractC16901l.m4220for(0, listM3338public);
            if (str2 != null) {
                long j = Long.parseLong(str2);
                String str3 = (String) AbstractC16901l.m4220for(1, listM3338public);
                if (str3 != null) {
                    int i = Integer.parseInt(str3);
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    sb.append('_');
                    sb.append(i);
                    String string = sb.toString();
                    C5198l c5198lM3161l = C6336l.loadAd.m3161l();
                    CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{string}, 1))) : null;
                    if (cachedTrack != null && cachedTrack.appmetrica() && AbstractC5921l.f12465l.isVip(AbstractC5309l.purchase(cachedTrack))) {
                        uri2 = Uri.parse(AbstractC5309l.purchase(cachedTrack).f27331l.tapsense());
                    }
                }
            }
        }
        if (uri2 == null) {
            return c2432l;
        }
        C3304l c3304lYandex2 = c2432l.yandex();
        c3304lYandex2.yandex = uri2;
        c3304lYandex2.isPro = 1;
        return c3304lYandex2.yandex();
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        int i = this.f11166l;
        Object obj = this.f11164l;
        String str = (String) this.f11165l;
        switch (i) {
            case 3:
                C4652l c4652l = (C4652l) obj;
                try {
                    Trace.beginSection(str);
                    return c4652l.billing.remoteconfig(c11644l);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) c11644l.remoteconfig(Context.class);
                int i2 = ((C8876l) obj).f18244l;
                String strValueOf = "";
                switch (i2) {
                    case 23:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        strValueOf = FirebaseCommonRegistrar.yandex(context);
                        break;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.loadAd(installerPackageName);
                        }
                        break;
                }
                return new C4662l(str, strValueOf);
        }
    }

    @Override // defpackage.InterfaceC8671l
    public void smaato(Object obj, C4094l c4094l) {
        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
        interfaceC5252l.mo1744interface((InterfaceC9814l) this.f11164l, new C3797l(c4094l, ((C17505l) this.f11165l).f34107l));
    }

    @Override // defpackage.InterfaceC11459l
    public int subs(Object obj) {
        Context context = (Context) this.f11165l;
        C5978l c5978l = (C5978l) this.f11164l;
        C6403l c6403l = (C6403l) obj;
        String str = c6403l.loadAd;
        return ((str.equals(c5978l.metrica) || str.equals(AbstractC4727l.crashlytics(c5978l))) && c6403l.crashlytics(context, c5978l, false) && c6403l.amazon(c5978l)) ? 1 : 0;
    }

    @Override // defpackage.InterfaceC6384l
    public InterfaceC14833l[] vip(Uri uri, Map map) {
        C15291l c15291l = (C15291l) this.f11165l;
        C5978l c5978l = (C5978l) this.f11164l;
        return new InterfaceC14833l[]{c15291l.crashlytics.mopub(c5978l) ? new C4880l(c15291l.crashlytics.isPro(c5978l)) : new C4112l(c5978l)};
    }

    public /* synthetic */ C5131l(Object obj, Object obj2, int i) {
        this.f11166l = i;
        this.f11165l = obj;
        this.f11164l = obj2;
    }

    @Override // defpackage.InterfaceC6384l
    public InterfaceC6384l firebase(boolean z) {
        return this;
    }

    @Override // defpackage.InterfaceC6384l
    public InterfaceC6384l loadAd(int i) {
        return this;
    }

    @Override // defpackage.InterfaceC0737l
    public Uri purchase(Uri uri) {
        return uri;
    }

    @Override // defpackage.InterfaceC6384l
    public InterfaceC6384l yandex(C8565l c8565l) {
        return this;
    }
}
