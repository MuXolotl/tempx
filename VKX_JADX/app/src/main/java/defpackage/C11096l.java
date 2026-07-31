package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11096l {
    public final C10383l Signature;
    public final ComponentCallbacks2C15128l ad;
    public final InterfaceC1234l adcel;
    public final C16321l admob;
    public final C12192l ads;
    public InterfaceC3177l amazon;
    public InterfaceC0798l billing;
    public AbstractC0306l crashlytics;
    public final C15778l firebase;
    public final InterfaceC8714l isPro;
    public int license;
    public boolean loadAd;
    public final InterfaceC12613l metrica;
    public final C16613l mopub;
    public final C11029l pro;
    public InterfaceC3187l purchase;
    public final C3633l remoteconfig;
    public final C18196l smaato;
    public final InterfaceC8714l startapp;
    public final Configuration subs;
    public final C6742l subscription;
    public final C12771l tapsense;
    public final C8231l vip;
    public final View yandex;

    public C11096l(C11096l c11096l, View view, AbstractC0306l abstractC0306l, InterfaceC3177l interfaceC3177l, InterfaceC3187l interfaceC3187l, InterfaceC0798l interfaceC0798l) {
        InterfaceC12613l c13863l;
        C10383l c10383l;
        C6742l c6742l;
        C16321l c16321l;
        View view2;
        boolean zYandex = AbstractC8576l.yandex((c11096l == null || (view2 = c11096l.yandex) == null) ? null : view2.getContext(), view.getContext());
        this.yandex = view;
        this.crashlytics = abstractC0306l;
        this.amazon = interfaceC3177l;
        this.purchase = interfaceC3187l;
        this.billing = interfaceC0798l;
        this.mopub = zYandex ? c11096l.mopub : new C16613l();
        this.admob = (c11096l == null || (c16321l = c11096l.admob) == null) ? new C16321l() : c16321l;
        Configuration configuration = zYandex ? c11096l.subs : new Configuration(view.getContext().getResources().getConfiguration());
        this.subs = configuration;
        this.isPro = zYandex ? c11096l.isPro : AbstractC8020l.smaato(new Configuration(configuration));
        this.firebase = zYandex ? c11096l.firebase : new C15778l(view.getContext());
        this.smaato = zYandex ? c11096l.smaato : new C18196l(view.getContext());
        C3633l c3633l = zYandex ? c11096l.remoteconfig : new C3633l(view.getContext());
        this.remoteconfig = c3633l;
        this.vip = zYandex ? c11096l.vip : new C8231l(c3633l);
        if (zYandex) {
            c13863l = c11096l.metrica;
        } else {
            view.getContext();
            c13863l = new C13863l(24);
        }
        this.metrica = c13863l;
        this.startapp = zYandex ? c11096l.startapp : new C10086l(AbstractC14770l.loadAd(view.getContext()), C1461l.f3659l);
        this.adcel = view == (c11096l != null ? c11096l.yandex : null) ? c11096l.adcel : new C9421l(view);
        this.ads = zYandex ? c11096l.ads : new C12192l(ViewConfiguration.get(view.getContext()));
        this.subscription = (c11096l == null || (c6742l = c11096l.subscription) == null) ? new C6742l() : c6742l;
        this.tapsense = new C12771l();
        this.Signature = (c11096l == null || (c10383l = c11096l.Signature) == null) ? new C10383l() : c10383l;
        this.pro = new C11029l(5, this);
        this.ad = new ComponentCallbacks2C15128l(this);
    }

    public final void amazon(Configuration configuration) {
        C10086l c10086l;
        int iUpdateFrom = this.subs.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.mopub.yandex.entrySet().iterator();
            while (it.hasNext()) {
                C0269l c0269l = (C0269l) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (c0269l == null || Configuration.needNewResources(iUpdateFrom, c0269l.loadAd)) {
                    it.remove();
                }
            }
            this.isPro.setValue(new Configuration(configuration));
            this.admob.yandex();
            if ((268435456 & iUpdateFrom) != 0) {
                this.startapp.setValue(AbstractC14770l.loadAd(this.yandex.getContext()));
            }
            if ((805248384 & iUpdateFrom) == 0 || (c10086l = this.tapsense.loadAd) == null) {
                return;
            }
            c10086l.setValue(this.pro.invoke());
        }
    }

    public final void crashlytics() {
        int i = this.license + 1;
        this.license = i;
        if (i == 1) {
            View view = this.yandex;
            Context context = view.getContext();
            ComponentCallbacks2C15128l componentCallbacks2C15128l = this.ad;
            context.registerComponentCallbacks(componentCallbacks2C15128l);
            amazon(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            C12771l c12771l = this.tapsense;
            c12771l.crashlytics.setValue(Boolean.valueOf(zHasWindowFocus));
            C10086l c10086l = c12771l.loadAd;
            C11029l c11029l = this.pro;
            if (c10086l == null) {
                c12771l.yandex = c11029l;
            }
            if (c10086l != null) {
                c10086l.setValue(c11029l.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(componentCallbacks2C15128l);
        }
    }

    public final void loadAd() {
        int i = this.license - 1;
        this.license = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.license = 0;
        }
        if (this.license == 0) {
            View view = this.yandex;
            Context context = view.getContext();
            ComponentCallbacks2C15128l componentCallbacks2C15128l = this.ad;
            context.unregisterComponentCallbacks(componentCallbacks2C15128l);
            C12771l c12771l = this.tapsense;
            if (c12771l.loadAd == null) {
                c12771l.yandex = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(componentCallbacks2C15128l);
        }
    }

    public final void purchase() {
        if (this.loadAd) {
            return;
        }
        this.loadAd = true;
        AbstractC0306l abstractC0306l = this.crashlytics;
        View view = this.yandex;
        if (abstractC0306l == null) {
            AbstractC0306l abstractC0306lYandex = AbstractC7980l.yandex(view);
            if (abstractC0306lYandex == null) {
                Object parent = view.getParent();
                while (abstractC0306lYandex == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    abstractC0306lYandex = AbstractC7980l.yandex(view2);
                    parent = AbstractC6710l.billing(view2);
                }
            }
            if (abstractC0306lYandex == null) {
                abstractC0306lYandex = AbstractC7980l.loadAd(view);
            }
            this.crashlytics = abstractC0306lYandex;
        }
        if (this.amazon == null) {
            InterfaceC3177l interfaceC3177lPurchase = AbstractC6889l.purchase(view);
            if (interfaceC3177lPurchase == null) {
                C8339l.smaato("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.amazon = interfaceC3177lPurchase;
        }
        if (this.purchase == null) {
            InterfaceC3187l interfaceC3187lLoadAd = AbstractC17344l.loadAd(view);
            if (interfaceC3187lLoadAd == null) {
                C8339l.smaato("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.purchase = interfaceC3187lLoadAd;
        }
        if (this.billing == null) {
            this.billing = AbstractC1135l.crashlytics(view);
        }
    }

    public final void yandex(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, Function2 function2, C6956l c6956l, int i) {
        char c;
        char c2;
        boolean z;
        c6956l.m2133new(123858079);
        int i2 = (c6956l.admob(viewTreeObserverOnGlobalLayoutListenerC13840l) ? 4 : 2) | i | (c6956l.admob(function2) ? 32 : 16) | (c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC13840l.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC2356l) && !(tag instanceof InterfaceC5281l))) ? null : (Set) tag;
            if (set == null) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC13840l.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC2356l) && !(tag2 instanceof InterfaceC5281l))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(c6956l.license());
                c6956l.adcel = true;
                c6956l.applovin = true;
                c6956l.crashlytics.billing();
                c6956l.f14604synchronized.billing();
                C13006l c13006l = c6956l.f14602strictfp;
                C2859l c2859l = c13006l.yandex;
                c13006l.purchase = c2859l.f6222l;
                c13006l.billing = c2859l.f6227l;
            }
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                purchase();
                InterfaceC3187l interfaceC3187l = this.purchase;
                View view2 = (View) viewTreeObserverOnGlobalLayoutListenerC13840l.getParent();
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strStartapp = AbstractC14814l.startapp("SaveableStateRegistry:", strValueOf);
                C18396l c18396lMetrica = interfaceC3187l.metrica();
                Bundle bundleTapsense = c18396lMetrica.tapsense(strStartapp);
                if (bundleTapsense != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleTapsense.keySet()) {
                        linkedHashMap.put(str, bundleTapsense.getParcelableArrayList(str));
                    }
                }
                c = 4;
                c2 = 2;
                C11192l c11192l = C11192l.f22534l;
                C10707l c10707l = AbstractC16780l.yandex;
                C0504l c0504l = new C0504l(linkedHashMap, c11192l);
                if (c18396lMetrica.applovin(strStartapp) != null) {
                    z = false;
                } else {
                    try {
                        c18396lMetrica.m4528synchronized(strStartapp, new C8955l(i3, c0504l));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                }
                C0907l c0907l = new C0907l(c0504l, new C18371l(z, c18396lMetrica, strStartapp));
                c6956l.m2147try(c0907l);
                objM2132native = c0907l;
            } else {
                c = 4;
                c2 = 2;
            }
            C0907l c0907l2 = (C0907l) objM2132native;
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(c0907l2);
            Object objM2132native2 = c6956l.m2132native();
            int i4 = 12;
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C3006l(i4, c0907l2);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.loadAd(unit, (Function1) objM2132native2, c6956l);
            C8540l c8540l = AbstractC4751l.ad;
            boolean zBooleanValue = ((Boolean) c6956l.isPro(c8540l)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC13840l.getScrollCaptureInProgress$ui();
            boolean zBilling = c6956l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l.getView());
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling || objM2132native3 == c13863l) {
                objM2132native3 = new C6816l(viewTreeObserverOnGlobalLayoutListenerC13840l.getView());
                c6956l.m2147try(objM2132native3);
            }
            C6816l c6816l = (C6816l) objM2132native3;
            boolean zBilling2 = c6956l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l.getView());
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling2 || objM2132native4 == c13863l) {
                objM2132native4 = new C10909l(viewTreeObserverOnGlobalLayoutListenerC13840l.getView());
                c6956l.m2147try(objM2132native4);
            }
            C10707l c10707l2 = AbstractC2431l.yandex;
            purchase();
            C10092l c10092lYandex = c10707l2.yandex(this.amazon);
            AbstractC5189l abstractC5189l = AbstractC11677l.yandex;
            purchase();
            C10092l c10092lYandex2 = abstractC5189l.yandex(this.purchase);
            C10092l c10092lYandex3 = AbstractC1242l.amazon.yandex(this.mopub);
            C10092l c10092lYandex4 = AbstractC1242l.purchase.yandex(this.admob);
            C10092l c10092lYandex5 = AbstractC4751l.license.yandex((InterfaceC4206l) objM2132native4);
            C10092l c10092lYandex6 = AbstractC1242l.loadAd.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getContext());
            C10092l c10092lYandex7 = AbstractC6434l.yandex.yandex(set);
            C10092l c10092lYandex8 = AbstractC1242l.yandex.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getConfiguration());
            C10092l c10092lYandex9 = AbstractC16780l.yandex.yandex(c0907l2);
            C10092l c10092lYandex10 = AbstractC1242l.billing.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getView());
            C10092l c10092lYandex11 = c8540l.yandex(Boolean.valueOf(zBooleanValue));
            C10092l c10092lYandex12 = AbstractC4751l.tapsense.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getViewConfiguration());
            C10092l c10092lYandex13 = AbstractC10527l.yandex.yandex(c6816l);
            C10092l[] c10092lArr = new C10092l[13];
            c10092lArr[0] = c10092lYandex;
            c10092lArr[1] = c10092lYandex2;
            c10092lArr[c2] = c10092lYandex3;
            c10092lArr[3] = c10092lYandex4;
            c10092lArr[c] = c10092lYandex5;
            c10092lArr[5] = c10092lYandex6;
            c10092lArr[6] = c10092lYandex7;
            c10092lArr[7] = c10092lYandex8;
            c10092lArr[8] = c10092lYandex9;
            c10092lArr[9] = c10092lYandex10;
            c10092lArr[10] = c10092lYandex11;
            c10092lArr[11] = c10092lYandex12;
            c10092lArr[12] = c10092lYandex13;
            AbstractC10478l.loadAd(c10092lArr, AbstractC14566l.amazon(1317454175, new C12084l(viewTreeObserverOnGlobalLayoutListenerC13840l, this, function2), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12084l(this, viewTreeObserverOnGlobalLayoutListenerC13840l, function2, i);
        }
    }
}
