package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؒؐۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0760l extends AbstractC5288l {
    public final C4983l amazon;
    public boolean purchase;

    public C0760l(C4983l c4983l, C9282l c9282l) {
        super(c9282l, c4983l.loadAd);
        this.amazon = c4983l;
        this.purchase = true;
    }

    public final void admob(boolean z) {
        this.purchase = z;
        mopub(z && this.amazon.loadAd);
    }

    @Override // defpackage.AbstractC5288l
    public final void amazon(C0005l c0005l) {
        C0560l c0560l = new C0560l(c0005l);
        C4983l c4983l = this.amazon;
        int i = c4983l.amazon;
        float f = c0560l.crashlytics;
        switch (i) {
            case 1:
                ((AbstractC17054l) c4983l.purchase).mo2012l(c0560l);
                return;
            case 2:
                C13734l c13734l = (C13734l) c4983l.purchase;
                if (C13734l.m3727volatile(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + c13734l);
                }
                if (c13734l.admob != null) {
                    for (C17856l c17856l : c13734l.billing(new ArrayList(Collections.singletonList(c13734l.admob)), 0, 1)) {
                        c17856l.getClass();
                        if (C13734l.m3727volatile(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + f);
                        }
                        ArrayList arrayList = c17856l.crashlytics;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((AbstractC18261l) it.next()).getClass();
                            AbstractC3984l.license(arrayList2, null);
                        }
                        List listM4213const = AbstractC16901l.m4213const(AbstractC16901l.m4229l(arrayList2));
                        int size = listM4213const.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((AbstractC3772l) listM4213const.get(i2)).loadAd(c0560l);
                        }
                    }
                    Iterator it2 = c13734l.vip.iterator();
                    if (it2.hasNext()) {
                        throw AbstractC15560l.adcel(it2);
                    }
                    return;
                }
                return;
            case 6:
                C3464l c3464l = (C3464l) c4983l.purchase;
                int i3 = c0560l.amazon;
                c3464l.mopub(new C15830l(f, c0560l.yandex, c0560l.loadAd, i3 != 0 ? i3 != 1 ? 1 : 3 : 2));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC5288l
    public final void crashlytics() {
        C14472l c14472l;
        C9967l c9967l;
        C4983l c4983l = this.amazon;
        switch (c4983l.amazon) {
            case 0:
                ArrayList arrayList = ((AppActivity) c4983l.purchase).f36639l;
                AbstractC2338l abstractC2338l = (AbstractC2338l) AbstractC16901l.m4220for(arrayList.size() - 1, arrayList);
                if (abstractC2338l == null) {
                    c4983l.purchase(false);
                    return;
                }
                if (!(abstractC2338l instanceof C14472l) || (c9967l = (c14472l = (C14472l) abstractC2338l).f28339l) == null || c9967l.getFragmentStack().size() <= 1) {
                    abstractC2338l.subs();
                    return;
                }
                C9967l c9967l2 = c14472l.f28339l;
                if (c9967l2 != null) {
                    c9967l2.billing(true, true);
                    return;
                }
                return;
            case 1:
                ((AbstractC17054l) c4983l.purchase).mo2013l();
                return;
            case 2:
                C13734l c13734l = (C13734l) c4983l.purchase;
                if (C13734l.m3727volatile(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + c13734l);
                }
                C4983l c4983l2 = c13734l.isPro;
                ArrayList arrayList2 = c13734l.vip;
                c13734l.subs = true;
                c13734l.signatures(true);
                c13734l.subs = false;
                if (c13734l.admob == null) {
                    if (c4983l2.loadAd) {
                        if (C13734l.m3727volatile(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        c13734l.m3734else();
                        return;
                    } else {
                        if (C13734l.m3727volatile(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        c13734l.mopub.loadAd().yandex();
                        return;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C13734l.inmobi(c13734l.admob));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C18725l.loadAd();
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = c13734l.admob.yandex.iterator();
                while (it3.hasNext()) {
                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = ((C10937l) it3.next()).loadAd;
                    if (abstractComponentCallbacksC4411l != null) {
                        abstractComponentCallbacksC4411l.f8950l = false;
                    }
                }
                for (C17856l c17856l : c13734l.billing(new ArrayList(Collections.singletonList(c13734l.admob)), 0, 1)) {
                    ArrayList arrayList3 = c17856l.crashlytics;
                    if (C13734l.m3727volatile(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    c17856l.billing(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        ((AbstractC18261l) it4.next()).getClass();
                        AbstractC3984l.license(arrayList4, null);
                    }
                    List listM4213const = AbstractC16901l.m4213const(AbstractC16901l.m4229l(arrayList4));
                    int size = listM4213const.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC3772l) listM4213const.get(i)).yandex(c17856l.yandex);
                    }
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        c17856l.yandex((AbstractC18261l) arrayList3.get(i2));
                    }
                    List listM4213const2 = AbstractC16901l.m4213const(arrayList3);
                    if (listM4213const2.size() > 0) {
                        ((AbstractC18261l) listM4213const2.get(0)).getClass();
                        throw null;
                    }
                }
                Iterator it5 = c13734l.admob.yandex.iterator();
                while (it5.hasNext()) {
                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = ((C10937l) it5.next()).loadAd;
                    if (abstractComponentCallbacksC4411l2 != null && abstractComponentCallbacksC4411l2.f8981l == null) {
                        c13734l.mopub(abstractComponentCallbacksC4411l2).isPro();
                    }
                }
                c13734l.admob = null;
                c13734l.m3738instanceof();
                if (C13734l.m3727volatile(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + c4983l2.loadAd + " for  FragmentManager " + c13734l);
                    return;
                }
                return;
            case 3:
                AbstractActivityC2569l abstractActivityC2569l = (AbstractActivityC2569l) c4983l.purchase;
                if (abstractActivityC2569l.f5599l.getFragmentStack().size() > 1) {
                    abstractActivityC2569l.f5599l.billing(true, true);
                    return;
                }
                return;
            case 4:
                ((C13530l) c4983l.purchase).yandex();
                return;
            case 5:
                C7711l c7711l = (C7711l) c4983l.purchase;
                C10740l c10740l = c7711l.f16189l;
                if (c10740l != null) {
                    ((C18480l) c10740l.f21748l).admob();
                }
                c7711l.m2197abstract();
                return;
            case 6:
                ((C3464l) c4983l.purchase).amazon();
                return;
            case 7:
                ((C16195l) c4983l.purchase).invoke(c4983l);
                return;
            default:
                C1008l c1008l = ((C4261l) c4983l.purchase).f8751l;
                c1008l.getClass();
                c1008l.remoteconfig(null, "");
                return;
        }
    }

    @Override // defpackage.AbstractC5288l
    public final void loadAd() {
        C8108l c8108l;
        Function0 function0;
        C4983l c4983l = this.amazon;
        switch (c4983l.amazon) {
            case 1:
                ((AbstractC17054l) c4983l.purchase).mo2014l();
                break;
            case 2:
                C13734l c13734l = (C13734l) c4983l.purchase;
                if (C13734l.m3727volatile(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + c13734l);
                }
                if (C13734l.m3727volatile(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + c13734l.admob);
                }
                C6821l c6821l = c13734l.admob;
                if (c6821l != null) {
                    c6821l.ads = false;
                    c6821l.amazon();
                    C6821l c6821l2 = c13734l.admob;
                    RunnableC11297l runnableC11297l = new RunnableC11297l(8, c13734l);
                    if (c6821l2.startapp == null) {
                        c6821l2.startapp = new ArrayList();
                    }
                    c6821l2.startapp.add(runnableC11297l);
                    c13734l.admob.purchase(false, true);
                    c13734l.subs = true;
                    c13734l.signatures(true);
                    c13734l.appmetrica();
                    c13734l.subs = false;
                    c13734l.admob = null;
                }
                break;
            case 6:
                C3464l c3464l = (C3464l) c4983l.purchase;
                C10023l c10023l = c3464l.loadAd;
                if (c10023l != null && (c8108l = (C8108l) c10023l.f20418l) != null && (function0 = c8108l.billing) != null) {
                    function0.invoke();
                }
                c3464l.loadAd = null;
                break;
        }
    }

    @Override // defpackage.AbstractC5288l
    public final void purchase(C0005l c0005l) {
        C0560l c0560l = new C0560l(c0005l);
        C4983l c4983l = this.amazon;
        boolean z = false;
        int i = 3;
        switch (c4983l.amazon) {
            case 1:
                ((AbstractC17054l) c4983l.purchase).mo2015l();
                break;
            case 2:
                C13734l c13734l = (C13734l) c4983l.purchase;
                if (C13734l.m3727volatile(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + c13734l);
                }
                c13734l.ad();
                c13734l.advert(new C12604l(c13734l), false);
                break;
            case 6:
                C3464l c3464l = (C3464l) c4983l.purchase;
                int i2 = c0560l.amazon;
                if (i2 == 0) {
                    i = 2;
                } else if (i2 != 1) {
                    i = 1;
                }
                C15830l c15830l = new C15830l(c0560l.crashlytics, c0560l.yandex, c0560l.loadAd, i);
                C8108l c8108lBilling = AbstractC0555l.billing(c3464l.yandex);
                if (c8108lBilling != null) {
                    c3464l.loadAd = new C10023l(c15830l, c8108lBilling, z);
                    Function1 function1 = c8108lBilling.amazon;
                    if (function1 != null) {
                        function1.invoke(c15830l);
                    }
                    break;
                }
                break;
        }
    }
}
