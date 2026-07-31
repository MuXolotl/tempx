package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3288l extends AbstractC3621l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C3141l f7025l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f7026l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public String f7027l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public ArrayList f7028l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C7026l f7029l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final ExecutorC10366l f7030l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final MediaRouter2$RouteCallback f7031l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final MediaRouter2 f7032l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final ArrayMap f7033l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C2061l f7034l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final ArrayMap f7035l;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public C3288l(Context context, C7026l c7026l) {
        super(context, null);
        this.f7033l = new ArrayMap();
        this.f7025l = new C3141l(this);
        this.f7034l = new C2061l(1, this);
        this.f7028l = new ArrayList();
        this.f7035l = new ArrayMap();
        this.f7032l = MediaRouter2.getInstance(context);
        this.f7029l = c7026l;
        this.f7030l = new ExecutorC10366l(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.f7031l = new C1764l(this, 1);
        } else {
            this.f7031l = new C1764l(this, 0);
        }
    }

    public static Messenger admob(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String subs(AbstractC16531l abstractC16531l) {
        MediaRouter2.RoutingController routingController;
        if ((abstractC16531l instanceof C1636l) && (routingController = ((C1636l) abstractC16531l).mopub) != null) {
            return routingController.getId();
        }
        return null;
    }

    @Override // defpackage.AbstractC3621l
    public final AbstractC16531l amazon(String str, String str2) {
        String str3 = (String) this.f7035l.get(str);
        for (C1636l c1636l : this.f7033l.values()) {
            if (TextUtils.equals(str2, c1636l.firebase())) {
                return new C6524l(str3, c1636l);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new C6524l(str3, null);
    }

    public final void firebase(MediaRouter2.RoutingController routingController) {
        C10038l c10038l;
        C1636l c1636l = (C1636l) this.f7033l.get(routingController);
        if (c1636l == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList arrayListMopub = AbstractC5121l.mopub(selectedRoutes);
        C13187l c13187lPro = AbstractC5121l.pro(C17132l.subs(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f7557l.getString(R.string.mr_dialog_default_group_name);
        C13187l c13187l = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    c13187l = new C13187l(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (c13187l == null) {
            c10038l = new C10038l(routingController.getId(), string);
            Bundle bundle2 = (Bundle) c10038l.f20463l;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            c10038l = new C10038l(c13187l);
        }
        Bundle bundle3 = (Bundle) c10038l.f20463l;
        bundle3.putInt("volume", routingController.getVolume());
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        ((ArrayList) c10038l.f20466l).clear();
        c10038l.m2846for(c13187lPro.loadAd());
        ((ArrayList) c10038l.f20462l).clear();
        c10038l.m2839catch(arrayListMopub);
        C13187l c13187lM2840class = c10038l.m2840class();
        ArrayList arrayListMopub2 = AbstractC5121l.mopub(routingController.getSelectableRoutes());
        ArrayList arrayListMopub3 = AbstractC5121l.mopub(routingController.getDeselectableRoutes());
        C4300l c4300l = this.f7554l;
        if (c4300l == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<C13187l> list = c4300l.loadAd;
        if (!list.isEmpty()) {
            for (C13187l c13187l2 : list) {
                String strAmazon = c13187l2.amazon();
                int i = arrayListMopub.contains(strAmazon) ? 3 : 1;
                arrayListMopub2.contains(strAmazon);
                arrayListMopub3.contains(strAmazon);
                arrayList.add(new C5717l(c13187l2, i));
            }
        }
        c1636l.metrica = c13187lM2840class;
        c1636l.isPro(c13187lM2840class, arrayList);
    }

    public final void isPro() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.f7032l.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoSubs = C17132l.subs(it.next());
            if (mediaRoute2InfoSubs != null && !arraySet.contains(mediaRoute2InfoSubs) && !mediaRoute2InfoSubs.isSystemRoute()) {
                if (this.f7026l) {
                    if (!mediaRoute2InfoSubs.getId().startsWith(this.f7557l.getPackageName() + "/")) {
                    }
                }
                arraySet.add(mediaRoute2InfoSubs);
                arrayList.add(mediaRoute2InfoSubs);
            }
        }
        if (arrayList.equals(this.f7028l)) {
            return;
        }
        this.f7028l = arrayList;
        ArrayMap arrayMap = this.f7035l;
        arrayMap.clear();
        Iterator it2 = this.f7028l.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoSubs2 = C17132l.subs(it2.next());
            Bundle extras = mediaRoute2InfoSubs2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2InfoSubs2);
            } else {
                arrayMap.put(mediaRoute2InfoSubs2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList<C13187l> arrayList2 = new ArrayList();
        Iterator it3 = this.f7028l.iterator();
        while (it3.hasNext()) {
            C13187l c13187lPro = AbstractC5121l.pro(C17132l.subs(it3.next()));
            if (c13187lPro != null) {
                arrayList2.add(c13187lPro);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            for (C13187l c13187l : arrayList2) {
                if (c13187l == null) {
                    C8339l.metrica("route must not be null");
                    return;
                } else {
                    if (arrayList3.contains(c13187l)) {
                        C8339l.metrica("route descriptor already added");
                        return;
                    }
                    arrayList3.add(c13187l);
                }
            }
        }
        billing(new C4300l(arrayList3, true));
    }

    @Override // defpackage.AbstractC3621l
    public final AbstractC16531l loadAd(String str) {
        return new C6524l((String) this.f7035l.get(str), null);
    }

    @Override // defpackage.AbstractC3621l
    public final void purchase(C4658l c4658l) {
        ArrayList<String> arrayList;
        C16710l c16710l;
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        int i = C9961l.crashlytics == null ? 0 : C9961l.crashlytics().premium;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.f7031l;
        C2061l c2061l = this.f7034l;
        C3141l c3141l = this.f7025l;
        if (i <= 0) {
            this.f7032l.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.f7032l.unregisterTransferCallback(c3141l);
            this.f7032l.unregisterControllerCallback(c2061l);
            return;
        }
        C9868l c9868l = C9961l.crashlytics().Signature;
        boolean z = c9868l == null ? false : c9868l.crashlytics;
        if (c4658l == null) {
            c4658l = new C4658l(C16710l.crashlytics, false);
        }
        c4658l.yandex();
        ArrayList<String> arrayListLoadAd = c4658l.loadAd.loadAd();
        if (!z) {
            arrayListLoadAd.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!arrayListLoadAd.contains("android.media.intent.category.LIVE_AUDIO")) {
            arrayListLoadAd.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (arrayListLoadAd.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = null;
            for (String str : arrayListLoadAd) {
                if (str == null) {
                    C8339l.metrica("category must not be null");
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList == null) {
            c16710l = C16710l.crashlytics;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            c16710l = new C16710l(bundle, arrayList);
        }
        boolean zLoadAd = c4658l.loadAd();
        if (c16710l == null) {
            C8339l.metrica("selector must not be null");
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", c16710l.yandex);
        bundle2.putBoolean("activeScan", zLoadAd);
        MediaRouter2 mediaRouter2 = this.f7032l;
        c16710l.yandex();
        if (c16710l.loadAd.contains(null)) {
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean z2 = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : c16710l.loadAd()) {
                str2.getClass();
                switch (str2) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str2 = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str2 = "android.media.route.feature.LIVE_VIDEO";
                        break;
                    case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                        break;
                    case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                        break;
                }
                arrayList2.add(str2);
            }
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(arrayList2, z2).build();
        }
        ExecutorC10366l executorC10366l = this.f7030l;
        mediaRouter2.registerRouteCallback(executorC10366l, mediaRouter2$RouteCallback, routeDiscoveryPreferenceBuild);
        this.f7032l.registerTransferCallback(executorC10366l, c3141l);
        this.f7032l.registerControllerCallback(executorC10366l, c2061l);
    }

    public final void smaato(String str) {
        MediaRoute2Info mediaRoute2Info = null;
        if (str != null) {
            Iterator it = this.f7028l.iterator();
            while (it.hasNext()) {
                MediaRoute2Info mediaRoute2InfoSubs = C17132l.subs(it.next());
                if (TextUtils.equals(mediaRoute2InfoSubs.getId(), str)) {
                    mediaRoute2Info = mediaRoute2InfoSubs;
                    break;
                }
            }
        }
        if (mediaRoute2Info == null) {
            Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
        } else if (!TextUtils.equals(this.f7027l, str)) {
            this.f7027l = str;
            this.f7032l.transferTo(mediaRoute2Info);
        } else {
            Log.w("MR2Provider", "Ignoring attempt to transfer to pending transfer route: " + mediaRoute2Info);
        }
    }

    @Override // defpackage.AbstractC3621l
    public final AbstractC11653l yandex(String str, C15536l c15536l) {
        Iterator it = this.f7033l.entrySet().iterator();
        while (it.hasNext()) {
            C1636l c1636l = (C1636l) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, c1636l.billing)) {
                return c1636l;
            }
        }
        return null;
    }
}
