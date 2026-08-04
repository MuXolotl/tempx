package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؔۙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2872l {
    public final AbstractComponentCallbacksC4411l crashlytics;
    public final C10038l loadAd;
    public final C3797l yandex;
    public boolean amazon = false;
    public int purchase = -1;

    public C2872l(C3797l c3797l, C10038l c10038l, ClassLoader classLoader, C13439l c13439l, Bundle bundle) {
        this.yandex = c3797l;
        this.loadAd = c10038l;
        C14309l c14309l = (C14309l) bundle.getParcelable("state");
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lYandex = c13439l.yandex(c14309l.f28005l);
        abstractComponentCallbacksC4411lYandex.f8974l = c14309l.f28004l;
        abstractComponentCallbacksC4411lYandex.f8986l = c14309l.f28001l;
        abstractComponentCallbacksC4411lYandex.f8959l = c14309l.f28009l;
        abstractComponentCallbacksC4411lYandex.f8967l = true;
        abstractComponentCallbacksC4411lYandex.f8962l = c14309l.f28008l;
        abstractComponentCallbacksC4411lYandex.f8970l = c14309l.f28012l;
        abstractComponentCallbacksC4411lYandex.f8978l = c14309l.f28002l;
        abstractComponentCallbacksC4411lYandex.f8977l = c14309l.f28003l;
        abstractComponentCallbacksC4411lYandex.f8980l = c14309l.f28011l;
        abstractComponentCallbacksC4411lYandex.f8969l = c14309l.f28006l;
        abstractComponentCallbacksC4411lYandex.f8947l = c14309l.f28013l;
        abstractComponentCallbacksC4411lYandex.f8948l = EnumC8981l.values()[c14309l.f28010l];
        abstractComponentCallbacksC4411lYandex.f8956l = c14309l.f28000l;
        abstractComponentCallbacksC4411lYandex.f8982l = c14309l.f28014l;
        abstractComponentCallbacksC4411lYandex.f8985l = c14309l.f28007l;
        this.crashlytics = abstractComponentCallbacksC4411lYandex;
        abstractComponentCallbacksC4411lYandex.f8964l = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        C13734l c13734l = abstractComponentCallbacksC4411lYandex.f8955l;
        if (c13734l != null && (c13734l.f26812synchronized || c13734l.f26811strictfp)) {
            C8339l.smaato("Fragment already added and state has been saved");
            throw null;
        }
        abstractComponentCallbacksC4411lYandex.f8983l = bundle2;
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC4411lYandex);
        }
    }

    public final void admob() {
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC4411l);
        }
        abstractComponentCallbacksC4411l.f8965l = -1;
        abstractComponentCallbacksC4411l.f8968l = false;
        abstractComponentCallbacksC4411l.tapsense();
        if (!abstractComponentCallbacksC4411l.f8968l) {
            C18262l.isPro(abstractComponentCallbacksC4411l, " did not call through to super.onDetach()");
            return;
        }
        C13734l c13734l = abstractComponentCallbacksC4411l.f8949l;
        if (!c13734l.f26815volatile) {
            c13734l.smaato();
            abstractComponentCallbacksC4411l.f8949l = new C13734l();
        }
        this.yandex.startapp(abstractComponentCallbacksC4411l, false);
        abstractComponentCallbacksC4411l.f8965l = -1;
        abstractComponentCallbacksC4411l.f8954l = null;
        abstractComponentCallbacksC4411l.f8989l = null;
        abstractComponentCallbacksC4411l.f8955l = null;
        if (!abstractComponentCallbacksC4411l.f8980l || abstractComponentCallbacksC4411l.remoteconfig()) {
            C7966l c7966l = (C7966l) this.loadAd.f20465l;
            if (!((c7966l.loadAd.containsKey(abstractComponentCallbacksC4411l.f8974l) && c7966l.purchase) ? c7966l.billing : true)) {
                return;
            }
        }
        if (C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC4411l);
        }
        abstractComponentCallbacksC4411l.isPro();
    }

    public final void amazon() {
        Bundle bundle;
        int i = 3;
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC4411l);
        }
        Bundle bundle2 = abstractComponentCallbacksC4411l.f8964l;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC4411l.f8979l) {
            abstractComponentCallbacksC4411l.f8965l = 1;
            Bundle bundle4 = abstractComponentCallbacksC4411l.f8964l;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC4411l.f8949l.m3731class(bundle);
            C13734l c13734l = abstractComponentCallbacksC4411l.f8949l;
            c13734l.f26812synchronized = false;
            c13734l.f26811strictfp = false;
            c13734l.f26813throw.mopub = false;
            c13734l.Signature(1);
            return;
        }
        C3797l c3797l = this.yandex;
        c3797l.subscription(abstractComponentCallbacksC4411l, false);
        abstractComponentCallbacksC4411l.f8949l.m3730catch();
        abstractComponentCallbacksC4411l.f8965l = 1;
        abstractComponentCallbacksC4411l.f8968l = false;
        abstractComponentCallbacksC4411l.f8957l.yandex(new C12517l(i, abstractComponentCallbacksC4411l));
        abstractComponentCallbacksC4411l.ads(bundle3);
        abstractComponentCallbacksC4411l.f8979l = true;
        if (!abstractComponentCallbacksC4411l.f8968l) {
            C18262l.isPro(abstractComponentCallbacksC4411l, " did not call through to super.onCreate()");
        } else {
            abstractComponentCallbacksC4411l.f8957l.purchase(EnumC14812l.ON_CREATE);
            c3797l.vip(abstractComponentCallbacksC4411l, false);
        }
    }

    public final void billing() {
        boolean z;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lM2847goto;
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC4411l);
        }
        boolean z2 = abstractComponentCallbacksC4411l.f8980l && !abstractComponentCallbacksC4411l.remoteconfig();
        C10038l c10038l = this.loadAd;
        if (z2) {
            c10038l.m2848implements(abstractComponentCallbacksC4411l.f8974l, null);
        }
        if (!z2) {
            C7966l c7966l = (C7966l) c10038l.f20465l;
            if (!((c7966l.loadAd.containsKey(abstractComponentCallbacksC4411l.f8974l) && c7966l.purchase) ? c7966l.billing : true)) {
                String str = abstractComponentCallbacksC4411l.f8956l;
                if (str != null && (abstractComponentCallbacksC4411lM2847goto = c10038l.m2847goto(str)) != null && abstractComponentCallbacksC4411lM2847goto.f8977l) {
                    abstractComponentCallbacksC4411l.f8953l = abstractComponentCallbacksC4411lM2847goto;
                }
                abstractComponentCallbacksC4411l.f8965l = 0;
                return;
            }
        }
        C6239l c6239l = abstractComponentCallbacksC4411l.f8954l;
        if (c6239l != null) {
            z = ((C7966l) c10038l.f20465l).billing;
        } else {
            AbstractActivityC16046l abstractActivityC16046l = c6239l.f13181l;
            z = AbstractC2812l.advert(abstractActivityC16046l) ? !abstractActivityC16046l.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((C7966l) c10038l.f20465l).crashlytics(abstractComponentCallbacksC4411l, false);
        }
        abstractComponentCallbacksC4411l.f8949l.smaato();
        abstractComponentCallbacksC4411l.f8957l.purchase(EnumC14812l.ON_DESTROY);
        abstractComponentCallbacksC4411l.f8965l = 0;
        abstractComponentCallbacksC4411l.f8968l = false;
        abstractComponentCallbacksC4411l.f8979l = false;
        abstractComponentCallbacksC4411l.f8968l = true;
        if (!abstractComponentCallbacksC4411l.f8968l) {
            C18262l.isPro(abstractComponentCallbacksC4411l, " did not call through to super.onDestroy()");
            return;
        }
        this.yandex.metrica(abstractComponentCallbacksC4411l, false);
        for (C2872l c2872l : c10038l.m2849import()) {
            if (c2872l != null) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = c2872l.crashlytics;
                if (abstractComponentCallbacksC4411l.f8974l.equals(abstractComponentCallbacksC4411l2.f8956l)) {
                    abstractComponentCallbacksC4411l2.f8953l = abstractComponentCallbacksC4411l;
                    abstractComponentCallbacksC4411l2.f8956l = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC4411l.f8956l;
        if (str2 != null) {
            abstractComponentCallbacksC4411l.f8953l = c10038l.m2847goto(str2);
        }
        c10038l.m2837break(this);
    }

    public final int crashlytics() {
        C17856l c17856l;
        Object obj;
        Object next;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (abstractComponentCallbacksC4411l.f8955l == null) {
            return abstractComponentCallbacksC4411l.f8965l;
        }
        int iMin = this.purchase;
        int iOrdinal = abstractComponentCallbacksC4411l.f8948l.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC4411l.f8986l) {
            boolean z = abstractComponentCallbacksC4411l.f8973l;
            int i = this.purchase;
            iMin = z ? Math.max(i, 2) : i < 4 ? Math.min(iMin, abstractComponentCallbacksC4411l.f8965l) : Math.min(iMin, 1);
        }
        if (abstractComponentCallbacksC4411l.f8959l && abstractComponentCallbacksC4411l.f8981l == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!abstractComponentCallbacksC4411l.f8984l) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC4411l.f8981l;
        if (viewGroup != null) {
            abstractComponentCallbacksC4411l.admob().m3746synchronized();
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof C17856l) {
                c17856l = (C17856l) tag;
            } else {
                c17856l = new C17856l(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, c17856l);
            }
            Iterator it = c17856l.loadAd.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ((AbstractC18261l) next).getClass();
            } while (!AbstractC8576l.yandex(null, abstractComponentCallbacksC4411l));
            for (Object obj2 : c17856l.crashlytics) {
                ((AbstractC18261l) obj2).getClass();
                if (AbstractC8576l.yandex(null, abstractComponentCallbacksC4411l)) {
                    obj = obj2;
                    break;
                }
            }
        }
        if (abstractComponentCallbacksC4411l.f8980l) {
            iMin = abstractComponentCallbacksC4411l.remoteconfig() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC4411l.f8946l && abstractComponentCallbacksC4411l.f8965l < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC4411l.f8950l) {
            iMin = Math.max(iMin, 3);
        }
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC4411l);
        }
        return iMin;
    }

    public final void firebase() {
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC4411l);
        }
        abstractComponentCallbacksC4411l.f8949l.Signature(5);
        abstractComponentCallbacksC4411l.f8957l.purchase(EnumC14812l.ON_PAUSE);
        abstractComponentCallbacksC4411l.f8965l = 6;
        abstractComponentCallbacksC4411l.f8968l = true;
        this.yandex.adcel(abstractComponentCallbacksC4411l, false);
    }

    public final void isPro() {
        C10038l c10038l = this.loadAd;
        boolean z = this.amazon;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (z) {
            if (C13734l.m3727volatile(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC4411l);
                return;
            }
            return;
        }
        try {
            this.amazon = true;
            boolean z2 = false;
            while (true) {
                int iCrashlytics = crashlytics();
                int i = abstractComponentCallbacksC4411l.f8965l;
                if (iCrashlytics == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC4411l.f8980l && !abstractComponentCallbacksC4411l.remoteconfig()) {
                        if (C13734l.m3727volatile(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC4411l);
                        }
                        ((C7966l) c10038l.f20465l).crashlytics(abstractComponentCallbacksC4411l, true);
                        c10038l.m2837break(this);
                        if (C13734l.m3727volatile(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC4411l);
                        }
                        abstractComponentCallbacksC4411l.isPro();
                    }
                    if (abstractComponentCallbacksC4411l.f8972l) {
                        C13734l c13734l = abstractComponentCallbacksC4411l.f8955l;
                        if (c13734l != null && abstractComponentCallbacksC4411l.f8984l && C13734l.m3725native(abstractComponentCallbacksC4411l)) {
                            c13734l.f26809package = true;
                        }
                        abstractComponentCallbacksC4411l.f8972l = false;
                        abstractComponentCallbacksC4411l.f8949l.metrica();
                    }
                    return;
                }
                if (iCrashlytics <= i) {
                    switch (i - 1) {
                        case -1:
                            admob();
                            break;
                        case 0:
                            billing();
                            break;
                        case 1:
                            mopub();
                            abstractComponentCallbacksC4411l.f8965l = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC4411l.f8973l = false;
                            abstractComponentCallbacksC4411l.f8965l = 2;
                            break;
                        case 3:
                            if (C13734l.m3727volatile(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC4411l);
                            }
                            abstractComponentCallbacksC4411l.f8965l = 3;
                            break;
                        case 4:
                            metrica();
                            break;
                        case 5:
                            abstractComponentCallbacksC4411l.f8965l = 5;
                            break;
                        case 6:
                            firebase();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            loadAd();
                            break;
                        case 1:
                            amazon();
                            break;
                        case 2:
                            subs();
                            purchase();
                            break;
                        case 3:
                            yandex();
                            break;
                        case 4:
                            abstractComponentCallbacksC4411l.f8965l = 4;
                            break;
                        case 5:
                            vip();
                            break;
                        case 6:
                            abstractComponentCallbacksC4411l.f8965l = 6;
                            break;
                        case 7:
                            remoteconfig();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.amazon = false;
        }
    }

    public final void loadAd() {
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC4411l);
        }
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = abstractComponentCallbacksC4411l.f8953l;
        C2872l c2872l = null;
        C10038l c10038l = this.loadAd;
        if (abstractComponentCallbacksC4411l2 != null) {
            C2872l c2872l2 = (C2872l) ((HashMap) c10038l.f20462l).get(abstractComponentCallbacksC4411l2.f8974l);
            if (c2872l2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC4411l);
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l3 = abstractComponentCallbacksC4411l.f8953l;
                sb.append(" declared target fragment ");
                sb.append(abstractComponentCallbacksC4411l3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            abstractComponentCallbacksC4411l.f8956l = abstractComponentCallbacksC4411l.f8953l.f8974l;
            abstractComponentCallbacksC4411l.f8953l = null;
            c2872l = c2872l2;
        } else {
            String str = abstractComponentCallbacksC4411l.f8956l;
            if (str != null && (c2872l = (C2872l) ((HashMap) c10038l.f20462l).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(abstractComponentCallbacksC4411l);
                sb2.append(" declared target fragment ");
                C8339l.smaato(AbstractC0653l.ads(sb2, abstractComponentCallbacksC4411l.f8956l, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (c2872l != null) {
            c2872l.isPro();
        }
        C13734l c13734l = abstractComponentCallbacksC4411l.f8955l;
        abstractComponentCallbacksC4411l.f8954l = c13734l.pro;
        abstractComponentCallbacksC4411l.f8989l = c13734l.advert;
        C3797l c3797l = this.yandex;
        c3797l.ads(abstractComponentCallbacksC4411l, false);
        ArrayList arrayList = abstractComponentCallbacksC4411l.f8963l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6400l) it.next()).yandex();
        }
        arrayList.clear();
        abstractComponentCallbacksC4411l.f8949l.loadAd(abstractComponentCallbacksC4411l.f8954l, abstractComponentCallbacksC4411l.amazon(), abstractComponentCallbacksC4411l);
        abstractComponentCallbacksC4411l.f8965l = 0;
        abstractComponentCallbacksC4411l.f8968l = false;
        abstractComponentCallbacksC4411l.adcel(abstractComponentCallbacksC4411l.f8954l.f13181l);
        if (!abstractComponentCallbacksC4411l.f8968l) {
            C18262l.isPro(abstractComponentCallbacksC4411l, " did not call through to super.onAttach()");
            return;
        }
        Iterator it2 = abstractComponentCallbacksC4411l.f8955l.startapp.iterator();
        while (it2.hasNext()) {
            ((InterfaceC15239l) it2.next()).crashlytics();
        }
        C13734l c13734l2 = abstractComponentCallbacksC4411l.f8949l;
        c13734l2.f26812synchronized = false;
        c13734l2.f26811strictfp = false;
        c13734l2.f26813throw.mopub = false;
        c13734l2.Signature(0);
        c3797l.remoteconfig(abstractComponentCallbacksC4411l, false);
    }

    public final void metrica() {
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC4411l);
        }
        C13734l c13734l = abstractComponentCallbacksC4411l.f8949l;
        c13734l.f26811strictfp = true;
        c13734l.f26813throw.mopub = true;
        c13734l.Signature(4);
        abstractComponentCallbacksC4411l.f8957l.purchase(EnumC14812l.ON_STOP);
        abstractComponentCallbacksC4411l.f8965l = 4;
        abstractComponentCallbacksC4411l.f8968l = false;
        abstractComponentCallbacksC4411l.ad();
        if (abstractComponentCallbacksC4411l.f8968l) {
            this.yandex.pro(abstractComponentCallbacksC4411l, false);
        } else {
            C18262l.isPro(abstractComponentCallbacksC4411l, " did not call through to super.onStop()");
        }
    }

    public final void mopub() {
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC4411l);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC4411l.f8981l;
        abstractComponentCallbacksC4411l.f8949l.Signature(1);
        abstractComponentCallbacksC4411l.f8965l = 1;
        abstractComponentCallbacksC4411l.f8968l = false;
        abstractComponentCallbacksC4411l.subscription();
        if (!abstractComponentCallbacksC4411l.f8968l) {
            C18262l.isPro(abstractComponentCallbacksC4411l, " did not call through to super.onDestroyView()");
            return;
        }
        C18152l c18152l = ((C8011l) new C18396l(abstractComponentCallbacksC4411l, abstractComponentCallbacksC4411l.firebase()).f35933l).loadAd;
        if (c18152l.f35537l > 0) {
            c18152l.billing(0).getClass();
            C18725l.loadAd();
            return;
        }
        abstractComponentCallbacksC4411l.f8988l = false;
        this.yandex.ad(abstractComponentCallbacksC4411l, false);
        abstractComponentCallbacksC4411l.f8981l = null;
        abstractComponentCallbacksC4411l.f8960l.subs(null);
        abstractComponentCallbacksC4411l.f8973l = false;
    }

    public final void purchase() {
        String resourceName;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (abstractComponentCallbacksC4411l.f8986l) {
            return;
        }
        if (C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC4411l);
        }
        Bundle bundle = abstractComponentCallbacksC4411l.f8964l;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterSignature = abstractComponentCallbacksC4411l.Signature(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC4411l.f8981l;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC4411l.f8970l;
            if (i != 0) {
                if (i == -1) {
                    C10754l.startapp(abstractComponentCallbacksC4411l, " for a container view with no id", "Cannot create fragment ");
                    return;
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC4411l.f8955l.ad.admob(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC4411l.f8967l && !abstractComponentCallbacksC4411l.f8959l) {
                        try {
                            resourceName = abstractComponentCallbacksC4411l.isVip().getResources().getResourceName(abstractComponentCallbacksC4411l.f8970l);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC4411l.f8970l) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC4411l);
                    }
                } else if (!(viewGroup instanceof C0025l)) {
                    C18086l c18086l = AbstractC7311l.yandex;
                    AbstractC7311l.loadAd(new C6611l(abstractComponentCallbacksC4411l, "Attempting to add fragment " + abstractComponentCallbacksC4411l + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC7311l.yandex(abstractComponentCallbacksC4411l).getClass();
                }
            }
        }
        abstractComponentCallbacksC4411l.f8981l = viewGroup;
        abstractComponentCallbacksC4411l.advert(layoutInflaterSignature, viewGroup, bundle2);
        abstractComponentCallbacksC4411l.f8965l = 2;
    }

    public final void remoteconfig() {
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC4411l);
        }
        C16447l c16447l = abstractComponentCallbacksC4411l.f8961l;
        View view = c16447l == null ? null : c16447l.isPro;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        abstractComponentCallbacksC4411l.purchase().isPro = null;
        abstractComponentCallbacksC4411l.f8949l.m3730catch();
        abstractComponentCallbacksC4411l.f8949l.signatures(true);
        abstractComponentCallbacksC4411l.f8965l = 7;
        abstractComponentCallbacksC4411l.f8968l = false;
        abstractComponentCallbacksC4411l.f8968l = true;
        if (!abstractComponentCallbacksC4411l.f8968l) {
            C18262l.isPro(abstractComponentCallbacksC4411l, " did not call through to super.onResume()");
            return;
        }
        abstractComponentCallbacksC4411l.f8957l.purchase(EnumC14812l.ON_RESUME);
        C13734l c13734l = abstractComponentCallbacksC4411l.f8949l;
        c13734l.f26812synchronized = false;
        c13734l.f26811strictfp = false;
        c13734l.f26813throw.mopub = false;
        c13734l.Signature(7);
        this.yandex.tapsense(abstractComponentCallbacksC4411l, false);
        this.loadAd.m2848implements(abstractComponentCallbacksC4411l.f8974l, null);
        abstractComponentCallbacksC4411l.f8964l = null;
        abstractComponentCallbacksC4411l.f8952l = null;
        abstractComponentCallbacksC4411l.f8975l = null;
    }

    public final void smaato(ClassLoader classLoader) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        Bundle bundle = abstractComponentCallbacksC4411l.f8964l;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC4411l.f8964l.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC4411l.f8964l.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC4411l.f8952l = abstractComponentCallbacksC4411l.f8964l.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC4411l.f8975l = abstractComponentCallbacksC4411l.f8964l.getBundle("viewRegistryState");
            C14309l c14309l = (C14309l) abstractComponentCallbacksC4411l.f8964l.getParcelable("state");
            if (c14309l != null) {
                abstractComponentCallbacksC4411l.f8956l = c14309l.f28000l;
                abstractComponentCallbacksC4411l.f8982l = c14309l.f28014l;
                abstractComponentCallbacksC4411l.f8985l = c14309l.f28007l;
            }
            if (abstractComponentCallbacksC4411l.f8985l) {
                return;
            }
            abstractComponentCallbacksC4411l.f8946l = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC4411l, e);
        }
    }

    public final void subs() {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (abstractComponentCallbacksC4411l.f8986l && abstractComponentCallbacksC4411l.f8973l && !abstractComponentCallbacksC4411l.f8988l) {
            if (C13734l.m3727volatile(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC4411l);
            }
            Bundle bundle = abstractComponentCallbacksC4411l.f8964l;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC4411l.advert(abstractComponentCallbacksC4411l.Signature(bundle2), null, bundle2);
        }
    }

    public final void vip() {
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC4411l);
        }
        abstractComponentCallbacksC4411l.f8949l.m3730catch();
        abstractComponentCallbacksC4411l.f8949l.signatures(true);
        abstractComponentCallbacksC4411l.f8965l = 5;
        abstractComponentCallbacksC4411l.f8968l = false;
        abstractComponentCallbacksC4411l.pro();
        if (!abstractComponentCallbacksC4411l.f8968l) {
            C18262l.isPro(abstractComponentCallbacksC4411l, " did not call through to super.onStart()");
            return;
        }
        abstractComponentCallbacksC4411l.f8957l.purchase(EnumC14812l.ON_START);
        C13734l c13734l = abstractComponentCallbacksC4411l.f8949l;
        c13734l.f26812synchronized = false;
        c13734l.f26811strictfp = false;
        c13734l.f26813throw.mopub = false;
        c13734l.Signature(5);
        this.yandex.license(abstractComponentCallbacksC4411l, false);
    }

    public final void yandex() {
        boolean zM3727volatile = C13734l.m3727volatile(3);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.crashlytics;
        if (zM3727volatile) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC4411l);
        }
        Bundle bundle = abstractComponentCallbacksC4411l.f8964l;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC4411l.f8949l.m3730catch();
        abstractComponentCallbacksC4411l.f8965l = 3;
        abstractComponentCallbacksC4411l.f8968l = false;
        abstractComponentCallbacksC4411l.vip();
        if (!abstractComponentCallbacksC4411l.f8968l) {
            C18262l.isPro(abstractComponentCallbacksC4411l, " did not call through to super.onActivityCreated()");
            return;
        }
        if (C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC4411l);
        }
        abstractComponentCallbacksC4411l.f8964l = null;
        C13734l c13734l = abstractComponentCallbacksC4411l.f8949l;
        c13734l.f26812synchronized = false;
        c13734l.f26811strictfp = false;
        c13734l.f26813throw.mopub = false;
        c13734l.Signature(4);
        this.yandex.smaato(abstractComponentCallbacksC4411l, false);
    }

    public C2872l(C3797l c3797l, C10038l c10038l, AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        this.yandex = c3797l;
        this.loadAd = c10038l;
        this.crashlytics = abstractComponentCallbacksC4411l;
    }

    public C2872l(C3797l c3797l, C10038l c10038l, AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, Bundle bundle) {
        this.yandex = c3797l;
        this.loadAd = c10038l;
        this.crashlytics = abstractComponentCallbacksC4411l;
        abstractComponentCallbacksC4411l.f8952l = null;
        abstractComponentCallbacksC4411l.f8975l = null;
        abstractComponentCallbacksC4411l.f8966l = 0;
        abstractComponentCallbacksC4411l.f8973l = false;
        abstractComponentCallbacksC4411l.f8984l = false;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = abstractComponentCallbacksC4411l.f8953l;
        abstractComponentCallbacksC4411l.f8956l = abstractComponentCallbacksC4411l2 != null ? abstractComponentCallbacksC4411l2.f8974l : null;
        abstractComponentCallbacksC4411l.f8953l = null;
        abstractComponentCallbacksC4411l.f8964l = bundle;
        abstractComponentCallbacksC4411l.f8983l = bundle.getBundle("arguments");
    }
}
