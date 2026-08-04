package ua.itaysonlab.vkx;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import androidx.annotation.Keep;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaCover;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import defpackage.AbstractC10413l;
import defpackage.AbstractC11173l;
import defpackage.AbstractC11990l;
import defpackage.AbstractC12872l;
import defpackage.AbstractC14147l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC18643l;
import defpackage.AbstractC3629l;
import defpackage.AbstractC4072l;
import defpackage.C10740l;
import defpackage.C11610l;
import defpackage.C11644l;
import defpackage.C11761l;
import defpackage.C12667l;
import defpackage.C12952l;
import defpackage.C13177l;
import defpackage.C13767l;
import defpackage.C13771l;
import defpackage.C13932l;
import defpackage.C1424l;
import defpackage.C1501l;
import defpackage.C16060l;
import defpackage.C16076l;
import defpackage.C16543l;
import defpackage.C16820l;
import defpackage.C18662l;
import defpackage.C1962l;
import defpackage.C2336l;
import defpackage.C3570l;
import defpackage.C5374l;
import defpackage.C5686l;
import defpackage.C7323l;
import defpackage.C7375l;
import defpackage.C7644l;
import defpackage.C7683l;
import defpackage.C8688l;
import defpackage.EnumC0442l;
import defpackage.InterfaceC12932l;
import defpackage.InterfaceC2262l;
import defpackage.InterfaceC6461l;
import java.util.ArrayList;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lua/itaysonlab/vkx/VKXApplication;", "Landroid/app/Application;", "Llؙٕٔ;", "Llؓۦۨ;", "<init>", "()V", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VKXApplication extends Application implements InterfaceC6461l, InterfaceC2262l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static C5374l f36626l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static C1424l f36627l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static ConnectivityManager f36630l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static VKXApplication f36631l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static C16076l f36632l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static C7644l f36633l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f36634l = AbstractC11990l.loadAd();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final Companion f36628l = new Companion();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Handler f36625l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C12952l f36629l = new C12952l(new C7375l(0));

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkx/VKXApplication$Companion;", "", "Lua/itaysonlab/vkx/VKXApplication;", "javaInstance", "()Lua/itaysonlab/vkx/VKXApplication;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public static void amazon() {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            PackageManager packageManager = vKXApplication.getPackageManager();
            VKXApplication vKXApplication2 = VKXApplication.f36631l;
            if (vKXApplication2 == null) {
                vKXApplication2 = null;
            }
            ComponentName component = packageManager.getLaunchIntentForPackage(vKXApplication2.getPackageName()).getComponent();
            VKXApplication vKXApplication3 = VKXApplication.f36631l;
            (vKXApplication3 != null ? vKXApplication3 : null).startActivity(Intent.makeRestartActivityTask(component));
            Runtime.getRuntime().exit(0);
        }

        public static boolean crashlytics() {
            ConnectivityManager connectivityManager = VKXApplication.f36630l;
            if (connectivityManager == null) {
                connectivityManager = null;
            }
            if (AbstractC11173l.amazon(1)) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
                    return false;
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
            }
            return true;
        }

        public static String loadAd(int i) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            return vKXApplication.getString(i);
        }

        public static int yandex(float f) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            return (int) (f * vKXApplication.getResources().getDisplayMetrics().density);
        }

        @Keep
        public final VKXApplication javaInstance() {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication != null) {
                return vKXApplication;
            }
            return null;
        }
    }

    @Keep
    public static final VKXApplication javaInstance() {
        return f36628l.javaInstance();
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        EnumC0442l[] enumC0442lArrValues = EnumC0442l.values();
        int length = enumC0442lArrValues.length;
        int i = 0;
        while (true) {
            EnumC0442l enumC0442l = EnumC0442l.Default;
            if (i >= length) {
                EnumC0442l[] enumC0442lArrValues2 = EnumC0442l.values();
                int length2 = enumC0442lArrValues2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    EnumC0442l enumC0442l2 = enumC0442lArrValues2[i2];
                    applicationContext.getPackageManager().setComponentEnabledSetting(AbstractC14147l.loadAd(applicationContext, enumC0442l2), enumC0442l2 == enumC0442l ? 1 : 2, 1);
                }
                break;
            }
            EnumC0442l enumC0442l3 = enumC0442lArrValues[i];
            int componentEnabledSetting = applicationContext.getPackageManager().getComponentEnabledSetting(new ComponentName(applicationContext.getPackageName(), "ua.itaysonlab.vkx.VkxIcon" + enumC0442l3.f1621l));
            if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && enumC0442l3 == enumC0442l)) {
                break;
            } else {
                i++;
            }
        }
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().penaltyLog().build());
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        onTrimMemory(10);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f36634l.f36440l;
    }

    @Override // defpackage.InterfaceC6461l
    public final C13177l yandex(Context context) {
        C11644l c11644l = new C11644l(context);
        C16543l c16543l = AbstractC12872l.yandex;
        C16543l c16543l2 = AbstractC10413l.yandex;
        C1962l c1962l = new C1962l(200);
        C13767l c13767l = (C13767l) c11644l.f23362l;
        c13767l.yandex(AbstractC10413l.yandex, c1962l);
        c13767l.yandex(AbstractC10413l.mopub, Boolean.valueOf(AbstractC4072l.inmobi(getApplicationContext())));
        c11644l.f23361l = new C8688l(new C13932l(4, this));
        C11644l c11644l2 = new C11644l(8);
        ArrayList arrayList = (ArrayList) c11644l2.f23362l;
        ArrayList arrayList2 = (ArrayList) c11644l2.f23361l;
        C11610l c11610l = AbstractC3629l.loadAd;
        if (c11610l == null) {
            c11610l = null;
        }
        C3570l c3570l = new C3570l(new C10740l(13, c11610l));
        C2336l c2336l = AbstractC18202l.yandex;
        c11644l2.m3146l(c3570l, c2336l.loadAd(C16060l.class));
        if (Build.VERSION.SDK_INT >= 28) {
            arrayList.add(new C13771l(new C5686l(), 0));
        } else {
            arrayList.add(new C13771l(new C12667l(), 0));
        }
        c11644l2.m3146l(C7683l.loadAd, c2336l.loadAd(C16820l.class));
        c11644l2.m3162l(C1501l.mopub, c2336l.loadAd(CachedTrack.class));
        c11644l2.m3162l(C1501l.billing, c2336l.loadAd(CachedPlaylist.class));
        c11644l2.m3148l(C7323l.amazon, c2336l.loadAd(AudioTrack.class));
        c11644l2.m3162l(C1501l.subs, c2336l.loadAd(AudioTrack.class));
        arrayList2.add(C11761l.amazon);
        c11644l2.m3148l(C7323l.crashlytics, c2336l.loadAd(AudioPlaylist.class));
        c11644l2.m3162l(C1501l.admob, c2336l.loadAd(AudioPlaylist.class));
        arrayList2.add(C11761l.crashlytics);
        c11644l2.m3148l(C7323l.loadAd, c2336l.loadAd(UmaTrack.class));
        c11644l2.m3162l(C1501l.amazon, c2336l.loadAd(UmaTrack.class));
        c11644l2.m3162l(C1501l.crashlytics, c2336l.loadAd(UmaCover.class));
        arrayList2.add(C11761l.loadAd);
        c11644l2.m3162l(C1501l.purchase, c2336l.loadAd(AlbumThumb.class));
        c11644l2.m3162l(C1501l.loadAd, c2336l.loadAd(AbstractC18643l.class));
        c11644l.f23360l = c11644l2.m3143l();
        return c11644l.m3170l();
    }
}
