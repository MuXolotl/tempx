package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: lّٝۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C12736l {
    public C13187l Signature;
    public int adcel;
    public final boolean admob;
    public String amazon;
    public Uri billing;
    public final String crashlytics;
    public boolean isPro;
    public final String loadAd;
    public int metrica;
    public boolean mopub;
    public String purchase;
    public int remoteconfig;
    public int smaato;
    public int startapp;
    public int subs;
    public Bundle subscription;
    public IntentSender tapsense;
    public int vip;
    public final C12545l yandex;
    public final ArrayList firebase = new ArrayList();
    public int ads = -1;
    public ArrayList license = new ArrayList();

    public C12736l(C12545l c12545l, String str, String str2, boolean z) {
        this.yandex = c12545l;
        this.loadAd = str;
        this.crashlytics = str2;
        this.admob = z;
    }

    public final boolean admob(String str) {
        C9961l.loadAd();
        Iterator it = this.firebase.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean amazon() {
        return this.Signature != null && this.mopub;
    }

    public final int billing(C13187l c13187l) {
        int i;
        C12736l c12736l;
        int iCountActions;
        if (this.Signature != c13187l) {
            this.Signature = c13187l;
            if (c13187l != null) {
                Bundle bundle = c13187l.yandex;
                if (Objects.equals(this.amazon, bundle.getString("name"))) {
                    i = 0;
                } else {
                    this.amazon = bundle.getString("name");
                    i = 1;
                }
                if (!Objects.equals(this.purchase, bundle.getString("status"))) {
                    this.purchase = bundle.getString("status");
                    i = 1;
                }
                Uri uri = this.billing;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.billing = string2 == null ? null : Uri.parse(string2);
                    i = 1;
                }
                if (this.mopub != bundle.getBoolean("enabled", true)) {
                    this.mopub = bundle.getBoolean("enabled", true);
                    i = 1;
                }
                if (this.subs != bundle.getInt("connectionState", 0)) {
                    this.subs = bundle.getInt("connectionState", 0);
                    i = 1;
                }
                ArrayList arrayListLoadAd = c13187l.loadAd();
                ArrayList arrayList = this.firebase;
                if (arrayList != arrayListLoadAd) {
                    if (arrayList != null) {
                        ListIterator listIterator = arrayList.listIterator();
                        ListIterator listIterator2 = arrayListLoadAd.listIterator();
                        while (true) {
                            if (listIterator.hasNext() && listIterator2.hasNext()) {
                                IntentFilter intentFilter = (IntentFilter) listIterator.next();
                                IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                                if (intentFilter != intentFilter2) {
                                    if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= iCountActions) {
                                                int iCountCategories = intentFilter.countCategories();
                                                if (iCountCategories == intentFilter2.countCategories()) {
                                                    int i3 = 0;
                                                    while (true) {
                                                        if (i3 >= iCountCategories) {
                                                            continue;
                                                        } else if (intentFilter.getCategory(i3).equals(intentFilter2.getCategory(i3))) {
                                                            i3++;
                                                        }
                                                    }
                                                }
                                            } else if (intentFilter.getAction(i2).equals(intentFilter2.getAction(i2))) {
                                                i2++;
                                            }
                                        }
                                    }
                                }
                            } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                            }
                            arrayList.clear();
                            arrayList.addAll(c13187l.loadAd());
                            i = 1;
                        }
                    } else {
                        arrayList.clear();
                        arrayList.addAll(c13187l.loadAd());
                        i = 1;
                    }
                }
                if (this.smaato != bundle.getInt("playbackType", 1)) {
                    this.smaato = bundle.getInt("playbackType", 1);
                    i = 1;
                }
                if (this.remoteconfig != bundle.getInt("playbackStream", -1)) {
                    this.remoteconfig = bundle.getInt("playbackStream", -1);
                    i = 1;
                }
                if (this.vip != bundle.getInt("deviceType")) {
                    this.vip = bundle.getInt("deviceType");
                    i = 1;
                }
                int i4 = 3;
                if (this.metrica != bundle.getInt("volumeHandling", 0)) {
                    this.metrica = bundle.getInt("volumeHandling", 0);
                    i = 3;
                }
                if (this.startapp != bundle.getInt("volume")) {
                    this.startapp = bundle.getInt("volume");
                    i = 3;
                }
                if (this.adcel != bundle.getInt("volumeMax")) {
                    this.adcel = bundle.getInt("volumeMax");
                } else {
                    i4 = i;
                }
                if (this.ads != bundle.getInt("presentationDisplayId", -1)) {
                    this.ads = bundle.getInt("presentationDisplayId", -1);
                    i4 |= 5;
                }
                if (!Objects.equals(this.subscription, bundle.getBundle("extras"))) {
                    this.subscription = bundle.getBundle("extras");
                    i4 |= 1;
                }
                if (!Objects.equals(this.tapsense, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.tapsense = (IntentSender) bundle.getParcelable("settingsIntent");
                    i4 |= 1;
                }
                if (this.isPro != bundle.getBoolean("canDisconnect", false)) {
                    this.isPro = bundle.getBoolean("canDisconnect", false);
                    i4 |= 5;
                }
                ArrayList<String> arrayListCrashlytics = c13187l.crashlytics();
                ArrayList arrayList2 = new ArrayList();
                boolean z = arrayListCrashlytics.size() != this.license.size();
                if (!arrayListCrashlytics.isEmpty()) {
                    C17646l c17646lCrashlytics = C9961l.crashlytics();
                    for (String str : arrayListCrashlytics) {
                        c17646lCrashlytics.getClass();
                        String str2 = (String) c17646lCrashlytics.firebase.get(new C17879l(((ComponentName) this.yandex.amazon.f10245l).flattenToShortString(), str));
                        Iterator it = c17646lCrashlytics.subs.iterator();
                        do {
                            if (!it.hasNext()) {
                                c12736l = null;
                                break;
                            }
                            c12736l = (C12736l) it.next();
                        } while (!c12736l.crashlytics.equals(str2));
                        if (c12736l != null) {
                            arrayList2.add(c12736l);
                            if (!z && !this.license.contains(c12736l)) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    return i4;
                }
                this.license = arrayList2;
                return i4 | 1;
            }
        }
        return 0;
    }

    public final boolean crashlytics() {
        C9961l.loadAd();
        C12736l c12736l = C9961l.crashlytics().license;
        if (c12736l == null) {
            C8339l.smaato("There is no default route.  The media router has not yet been fully initialized.");
            return false;
        }
        if (c12736l == this || this.vip == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) yandex().f7556l.f10245l).getPackageName(), "android") && admob("android.media.intent.category.LIVE_AUDIO") && !admob("android.media.intent.category.LIVE_VIDEO");
    }

    public final int loadAd() {
        Bundle bundle;
        if (!this.license.isEmpty()) {
            if (C9961l.crashlytics == null) {
                return 0;
            }
            C9868l c9868l = C9961l.crashlytics().Signature;
            if (c9868l != null && (bundle = c9868l.purchase) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
                return 0;
            }
        }
        return this.metrica;
    }

    public final void mopub(boolean z) {
        C9961l.loadAd();
        C9961l.crashlytics().isPro(this, 3, z);
    }

    public final boolean purchase(C16710l c16710l) {
        if (c16710l == null) {
            C8339l.metrica("selector must not be null");
            return false;
        }
        C9961l.loadAd();
        ArrayList<IntentFilter> arrayList = this.firebase;
        if (arrayList != null) {
            c16710l.yandex();
            if (!c16710l.loadAd.isEmpty()) {
                for (IntentFilter intentFilter : arrayList) {
                    if (intentFilter != null) {
                        Iterator it = c16710l.loadAd.iterator();
                        while (it.hasNext()) {
                            if (intentFilter.hasCategory((String) it.next())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.crashlytics);
        sb.append(", name=");
        sb.append(this.amazon);
        sb.append(", description=");
        sb.append(this.purchase);
        sb.append(", iconUri=");
        sb.append(this.billing);
        sb.append(", enabled=");
        sb.append(this.mopub);
        sb.append(", isSystemRoute=");
        sb.append(this.admob);
        sb.append(", connectionState=");
        sb.append(this.subs);
        sb.append(", canDisconnect=");
        sb.append(this.isPro);
        sb.append(", playbackType=");
        sb.append(this.smaato);
        sb.append(", playbackStream=");
        sb.append(this.remoteconfig);
        sb.append(", deviceType=");
        sb.append(this.vip);
        sb.append(", volumeHandling=");
        sb.append(this.metrica);
        sb.append(", volume=");
        sb.append(this.startapp);
        sb.append(", volumeMax=");
        sb.append(this.adcel);
        sb.append(", presentationDisplayId=");
        sb.append(this.ads);
        sb.append(", extras=");
        sb.append(this.subscription);
        sb.append(", settingsIntent=");
        sb.append(this.tapsense);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.yandex.amazon.f10245l).getPackageName());
        if (!this.license.isEmpty()) {
            sb.append(", members=[");
            int size = this.license.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.license.get(i) != this) {
                    sb.append(((C12736l) this.license.get(i)).crashlytics);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }

    public final AbstractC3621l yandex() {
        C12545l c12545l = this.yandex;
        c12545l.getClass();
        C9961l.loadAd();
        return c12545l.yandex;
    }
}
