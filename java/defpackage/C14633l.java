package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٔؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C14633l extends AbstractC6035l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final ArrayList f28639l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final ArrayList f28640l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final MediaRouter.RouteCategory f28641l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f28642l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final ArrayList f28643l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final MediaRouter f28644l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f28645l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C8301l f28646l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C17646l f28647l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C8435l f28648l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f28649l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final ArrayList f28650l;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        f28640l = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        f28639l = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public C14633l(Context context, C17646l c17646l) {
        super(context, new C5008l(15, new ComponentName("android", AbstractC6035l.class.getName())));
        this.f28643l = new ArrayList();
        this.f28650l = new ArrayList();
        this.f28647l = c17646l;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f28644l = mediaRouter;
        this.f28648l = new C8435l(this);
        this.f28646l = new C8301l(this);
        this.f28641l = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        subscription();
    }

    public static C5211l remoteconfig(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof C5211l) {
            return (C5211l) tag;
        }
        return null;
    }

    public static void tapsense(C5211l c5211l) {
        MediaRouter.UserRouteInfo userRouteInfo = c5211l.loadAd;
        C12736l c12736l = c5211l.yandex;
        userRouteInfo.setName(c12736l.amazon);
        userRouteInfo.setPlaybackType(c12736l.smaato);
        userRouteInfo.setPlaybackStream(c12736l.remoteconfig);
        userRouteInfo.setVolume(c12736l.startapp);
        userRouteInfo.setVolumeMax(c12736l.adcel);
        userRouteInfo.setVolumeHandling(c12736l.loadAd());
        userRouteInfo.setDescription(c12736l.purchase);
    }

    public final void adcel(C12736l c12736l) {
        c12736l.getClass();
        C9961l.loadAd();
        if (C9961l.crashlytics().mopub() == c12736l) {
            AbstractC3621l abstractC3621lYandex = c12736l.yandex();
            MediaRouter mediaRouter = this.f28644l;
            if (abstractC3621lYandex != this) {
                int iFirebase = firebase(c12736l);
                if (iFirebase >= 0) {
                    mediaRouter.selectRoute(8388611, ((C5211l) this.f28650l.get(iFirebase)).loadAd);
                    return;
                }
                return;
            }
            int iIsPro = isPro(c12736l.loadAd);
            if (iIsPro >= 0) {
                mediaRouter.selectRoute(8388611, ((C4152l) this.f28643l.get(iIsPro)).yandex);
            }
        }
    }

    public final boolean admob(MediaRouter.RouteInfo routeInfo) {
        String str;
        if (remoteconfig(routeInfo) != null || subs(routeInfo) >= 0) {
            return false;
        }
        String str2 = this.f28644l.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(smaato(routeInfo).hashCode()));
        if (isPro(str2) >= 0) {
            int i = 2;
            while (true) {
                Locale locale = Locale.US;
                str = str2 + "_" + i;
                if (isPro(str) < 0) {
                    break;
                }
                i++;
            }
            str2 = str;
        }
        C4152l c4152l = new C4152l(routeInfo, str2);
        C10038l c10038l = new C10038l(str2, smaato(routeInfo));
        vip(c4152l, c10038l);
        c4152l.crashlytics = c10038l.m2840class();
        this.f28643l.add(c4152l);
        return true;
    }

    public final void ads() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f28643l;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C13187l c13187l = ((C4152l) arrayList2.get(i)).crashlytics;
            if (c13187l == null) {
                C8339l.metrica("route must not be null");
                return;
            } else {
                if (arrayList.contains(c13187l)) {
                    C8339l.metrica("route descriptor already added");
                    return;
                }
                arrayList.add(c13187l);
            }
        }
        billing(new C4300l(arrayList, false));
    }

    public final int firebase(C12736l c12736l) {
        ArrayList arrayList = this.f28650l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C5211l) arrayList.get(i)).yandex == c12736l) {
                return i;
            }
        }
        return -1;
    }

    public final int isPro(String str) {
        ArrayList arrayList = this.f28643l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C4152l) arrayList.get(i)).loadAd.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC3621l
    public final AbstractC16531l loadAd(String str) {
        int iIsPro = isPro(str);
        if (iIsPro >= 0) {
            return new C3691l(((C4152l) this.f28643l.get(iIsPro)).yandex);
        }
        return null;
    }

    public final void metrica(C12736l c12736l) {
        AbstractC3621l abstractC3621lYandex = c12736l.yandex();
        MediaRouter mediaRouter = this.f28644l;
        if (abstractC3621lYandex == this) {
            int iSubs = subs(mediaRouter.getSelectedRoute(8388611));
            if (iSubs < 0 || !((C4152l) this.f28643l.get(iSubs)).loadAd.equals(c12736l.loadAd)) {
                return;
            }
            c12736l.mopub(false);
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.f28641l);
        C5211l c5211l = new C5211l(c12736l, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(c5211l);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.f28646l);
        tapsense(c5211l);
        this.f28650l.add(c5211l);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    @Override // defpackage.AbstractC3621l
    public final void purchase(C4658l c4658l) {
        boolean zLoadAd;
        int i = 0;
        if (c4658l != null) {
            c4658l.yandex();
            ArrayList arrayListLoadAd = c4658l.loadAd.loadAd();
            int size = arrayListLoadAd.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) arrayListLoadAd.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                }
                i++;
            }
            zLoadAd = c4658l.loadAd();
            i = i2;
        } else {
            zLoadAd = false;
        }
        if (this.f28649l == i && this.f28645l == zLoadAd) {
            return;
        }
        this.f28649l = i;
        this.f28645l = zLoadAd;
        subscription();
    }

    public final String smaato(MediaRouter.RouteInfo routeInfo) {
        int i;
        Context context = this.f7557l;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return "";
        }
        int deviceType = Build.VERSION.SDK_INT >= 24 ? routeInfo.getDeviceType() : 0;
        if (deviceType == 1) {
            i = R.string.mr_route_name_tv;
        } else if (deviceType != 2) {
            i = deviceType != 3 ? R.string.mr_route_name_unknown : R.string.mr_route_name_bluetooth;
        } else {
            i = R.string.mr_route_name_speaker;
        }
        return context.getString(i);
    }

    public final void startapp(C12736l c12736l) {
        int iFirebase;
        if (c12736l.yandex() == this || (iFirebase = firebase(c12736l)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((C5211l) this.f28650l.remove(iFirebase)).loadAd;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.f28644l.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    public final int subs(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.f28643l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C4152l) arrayList.get(i)).yandex == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final void subscription() {
        boolean z = this.f28642l;
        C8435l c8435l = this.f28648l;
        MediaRouter mediaRouter = this.f28644l;
        if (z) {
            mediaRouter.removeCallback(c8435l);
        }
        this.f28642l = true;
        mediaRouter.addCallback(this.f28649l, c8435l, (this.f28645l ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zAdmob = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zAdmob |= admob((MediaRouter.RouteInfo) it.next());
        }
        if (zAdmob) {
            ads();
        }
    }

    public void vip(C4152l c4152l, C10038l c10038l) {
        Bundle bundle = (Bundle) c10038l.f20463l;
        MediaRouter.RouteInfo routeInfo = c4152l.yandex;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            c10038l.m2846for(f28640l);
        }
        if ((supportedTypes & 2) != 0) {
            c10038l.m2846for(f28639l);
        }
        bundle.putInt("playbackType", routeInfo.getPlaybackType());
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (8388608 & supportedTypes) == 0);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (routeInfo.isConnecting()) {
            bundle.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
    }
}
