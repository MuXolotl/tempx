package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْۡ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13734l {
    public final C17591l Signature;
    public AbstractC5473l ad;
    public final C4896l adcel;
    public final C4896l ads;
    public AbstractComponentCallbacksC4411l advert;
    public C12840l applovin;
    public C12840l appmetrica;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final RunnableC5360l f26805catch;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public ArrayList f26806extends;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public ArrayList f26807for;
    public C12840l inmobi;
    public AbstractComponentCallbacksC4411l isVip;
    public int license;
    public boolean loadAd;
    public final C3797l metrica;
    public C16390l mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public boolean f26808native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean f26809package;
    public final C6162l premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public ArrayList f26810private;
    public C6239l pro;
    public ArrayList purchase;
    public final C13439l signatures;
    public final CopyOnWriteArrayList startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public boolean f26811strictfp;
    public final C4896l subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public boolean f26812synchronized;
    public final C4896l tapsense;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public C7966l f26813throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public ArrayDeque f26814throws;
    public final ArrayList vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public boolean f26815volatile;
    public final ArrayList yandex = new ArrayList();
    public final C10038l crashlytics = new C10038l(14);
    public ArrayList amazon = new ArrayList();
    public final LayoutInflaterFactory2C6983l billing = new LayoutInflaterFactory2C6983l(0, this);
    public C6821l admob = null;
    public boolean subs = false;
    public final C4983l isPro = new C4983l(2, this);
    public final AtomicInteger firebase = new AtomicInteger();
    public final Map smaato = DesugarCollections.synchronizedMap(new HashMap());
    public final Map remoteconfig = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [lٕؗٓ] */
    /* JADX WARN: Type inference failed for: r0v17, types: [lٕؗٓ] */
    /* JADX WARN: Type inference failed for: r0v18, types: [lٕؗٓ] */
    /* JADX WARN: Type inference failed for: r0v19, types: [lٕؗٓ] */
    public C13734l() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.vip = new ArrayList();
        this.metrica = new C3797l(this);
        this.startapp = new CopyOnWriteArrayList();
        final int i = 0;
        this.adcel = new InterfaceC13241l(this) { // from class: lٕؗٓ
            public final /* synthetic */ C13734l loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC13241l
            public final void accept(Object obj) {
                int i2 = i;
                C13734l c13734l = this.loadAd;
                switch (i2) {
                    case 0:
                        if (c13734l.m3742private()) {
                            c13734l.subs(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c13734l.m3742private() && num.intValue() == 80) {
                            c13734l.remoteconfig(false);
                            break;
                        }
                        break;
                    case 2:
                        C13933l c13933l = (C13933l) obj;
                        if (c13734l.m3742private()) {
                            boolean z = c13933l.yandex;
                            c13734l.vip(false);
                        }
                        break;
                    default:
                        C12739l c12739l = (C12739l) obj;
                        if (c13734l.m3742private()) {
                            boolean z2 = c12739l.yandex;
                            c13734l.subscription(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.ads = new InterfaceC13241l(this) { // from class: lٕؗٓ
            public final /* synthetic */ C13734l loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC13241l
            public final void accept(Object obj) {
                int i3 = i2;
                C13734l c13734l = this.loadAd;
                switch (i3) {
                    case 0:
                        if (c13734l.m3742private()) {
                            c13734l.subs(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c13734l.m3742private() && num.intValue() == 80) {
                            c13734l.remoteconfig(false);
                            break;
                        }
                        break;
                    case 2:
                        C13933l c13933l = (C13933l) obj;
                        if (c13734l.m3742private()) {
                            boolean z = c13933l.yandex;
                            c13734l.vip(false);
                        }
                        break;
                    default:
                        C12739l c12739l = (C12739l) obj;
                        if (c13734l.m3742private()) {
                            boolean z2 = c12739l.yandex;
                            c13734l.subscription(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.subscription = new InterfaceC13241l(this) { // from class: lٕؗٓ
            public final /* synthetic */ C13734l loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC13241l
            public final void accept(Object obj) {
                int i4 = i3;
                C13734l c13734l = this.loadAd;
                switch (i4) {
                    case 0:
                        if (c13734l.m3742private()) {
                            c13734l.subs(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c13734l.m3742private() && num.intValue() == 80) {
                            c13734l.remoteconfig(false);
                            break;
                        }
                        break;
                    case 2:
                        C13933l c13933l = (C13933l) obj;
                        if (c13734l.m3742private()) {
                            boolean z = c13933l.yandex;
                            c13734l.vip(false);
                        }
                        break;
                    default:
                        C12739l c12739l = (C12739l) obj;
                        if (c13734l.m3742private()) {
                            boolean z2 = c12739l.yandex;
                            c13734l.subscription(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.tapsense = new InterfaceC13241l(this) { // from class: lٕؗٓ
            public final /* synthetic */ C13734l loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC13241l
            public final void accept(Object obj) {
                int i5 = i4;
                C13734l c13734l = this.loadAd;
                switch (i5) {
                    case 0:
                        if (c13734l.m3742private()) {
                            c13734l.subs(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c13734l.m3742private() && num.intValue() == 80) {
                            c13734l.remoteconfig(false);
                            break;
                        }
                        break;
                    case 2:
                        C13933l c13933l = (C13933l) obj;
                        if (c13734l.m3742private()) {
                            boolean z = c13933l.yandex;
                            c13734l.vip(false);
                        }
                        break;
                    default:
                        C12739l c12739l = (C12739l) obj;
                        if (c13734l.m3742private()) {
                            boolean z2 = c12739l.yandex;
                            c13734l.subscription(false);
                        }
                        break;
                }
            }
        };
        this.Signature = new C17591l(this);
        this.license = -1;
        this.signatures = new C13439l(this);
        this.premium = new C6162l(2);
        this.f26814throws = new ArrayDeque();
        this.f26805catch = new RunnableC5360l(10, this);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static boolean m3723extends(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (abstractComponentCallbacksC4411l == null) {
            return true;
        }
        if (abstractComponentCallbacksC4411l.f8987l) {
            return abstractComponentCallbacksC4411l.f8955l == null || m3723extends(abstractComponentCallbacksC4411l.f8989l);
        }
        return false;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static boolean m3724for(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (abstractComponentCallbacksC4411l == null) {
            return true;
        }
        C13734l c13734l = abstractComponentCallbacksC4411l.f8955l;
        return abstractComponentCallbacksC4411l == c13734l.isVip && m3724for(c13734l.advert);
    }

    public static HashSet inmobi(C6821l c6821l) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c6821l.yandex.size(); i++) {
            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = ((C10937l) c6821l.yandex.get(i)).loadAd;
            if (abstractComponentCallbacksC4411l != null && c6821l.mopub) {
                hashSet.add(abstractComponentCallbacksC4411l);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static boolean m3725native(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        abstractComponentCallbacksC4411l.getClass();
        boolean zM3725native = false;
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 : abstractComponentCallbacksC4411l.f8949l.crashlytics.m2850instanceof()) {
            if (abstractComponentCallbacksC4411l2 != null) {
                zM3725native = m3725native(abstractComponentCallbacksC4411l2);
            }
            if (zM3725native) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static void m3726super(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (m3727volatile(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC4411l);
        }
        if (abstractComponentCallbacksC4411l.f8947l) {
            abstractComponentCallbacksC4411l.f8947l = false;
            abstractComponentCallbacksC4411l.f8972l = !abstractComponentCallbacksC4411l.f8972l;
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static boolean m3727volatile(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public final void Signature(int i) {
        try {
            this.loadAd = true;
            for (C2872l c2872l : ((HashMap) this.crashlytics.f20462l).values()) {
                if (c2872l != null) {
                    c2872l.purchase = i;
                }
            }
            m3747throw(i, false);
            Iterator it = purchase().iterator();
            while (it.hasNext()) {
                ((C17856l) it.next()).amazon();
            }
            this.loadAd = false;
            signatures(true);
        } catch (Throwable th) {
            this.loadAd = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m3728abstract(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C2959l());
        C6239l c6239l = this.pro;
        if (c6239l == null) {
            try {
                pro("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c6239l.f13180l.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void ad() {
        Iterator it = purchase().iterator();
        while (it.hasNext()) {
            ((C17856l) it.next()).amazon();
        }
    }

    public final void adcel() {
        if (this.license < 1) {
            return;
        }
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
            if (abstractComponentCallbacksC4411l != null && !abstractComponentCallbacksC4411l.f8947l) {
                abstractComponentCallbacksC4411l.f8949l.adcel();
            }
        }
    }

    public final void admob(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (m3727volatile(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC4411l);
        }
        if (abstractComponentCallbacksC4411l.f8969l) {
            return;
        }
        abstractComponentCallbacksC4411l.f8969l = true;
        if (abstractComponentCallbacksC4411l.f8984l) {
            if (m3727volatile(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC4411l);
            }
            C10038l c10038l = this.crashlytics;
            synchronized (((ArrayList) c10038l.f20463l)) {
                ((ArrayList) c10038l.f20463l).remove(abstractComponentCallbacksC4411l);
            }
            abstractComponentCallbacksC4411l.f8984l = false;
            if (m3725native(abstractComponentCallbacksC4411l)) {
                this.f26809package = true;
            }
            m3736goto(abstractComponentCallbacksC4411l);
        }
    }

    public final void ads(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (abstractComponentCallbacksC4411l != null) {
            if (abstractComponentCallbacksC4411l != this.crashlytics.m2847goto(abstractComponentCallbacksC4411l.f8974l)) {
                return;
            }
            abstractComponentCallbacksC4411l.f8955l.getClass();
            boolean zM3724for = m3724for(abstractComponentCallbacksC4411l);
            Boolean bool = abstractComponentCallbacksC4411l.f8971l;
            if (bool == null || bool.booleanValue() != zM3724for) {
                abstractComponentCallbacksC4411l.f8971l = Boolean.valueOf(zM3724for);
                C13734l c13734l = abstractComponentCallbacksC4411l.f8949l;
                c13734l.m3738instanceof();
                c13734l.ads(c13734l.isVip);
            }
        }
    }

    public final void advert(InterfaceC13362l interfaceC13362l, boolean z) {
        if (!z) {
            if (this.pro == null) {
                if (this.f26815volatile) {
                    C8339l.smaato("FragmentManager has been destroyed");
                    return;
                } else {
                    C8339l.smaato("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.f26812synchronized || this.f26811strictfp) {
                C8339l.smaato("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.yandex) {
            try {
                if (this.pro == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.yandex.add(interfaceC13362l);
                    m3743static();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void amazon() {
        this.loadAd = false;
        this.f26806extends.clear();
        this.f26810private.clear();
    }

    public final AbstractComponentCallbacksC4411l applovin(int i) {
        C10038l c10038l = this.crashlytics;
        ArrayList arrayList = (ArrayList) c10038l.f20463l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = (AbstractComponentCallbacksC4411l) arrayList.get(size);
            if (abstractComponentCallbacksC4411l != null && abstractComponentCallbacksC4411l.f8962l == i) {
                return abstractComponentCallbacksC4411l;
            }
        }
        for (C2872l c2872l : ((HashMap) c10038l.f20462l).values()) {
            if (c2872l != null) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = c2872l.crashlytics;
                if (abstractComponentCallbacksC4411l2.f8962l == i) {
                    return abstractComponentCallbacksC4411l2;
                }
            }
        }
        return null;
    }

    public final void appmetrica() {
        for (C17856l c17856l : purchase()) {
            if (c17856l.billing) {
                if (m3727volatile(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c17856l.billing = false;
                c17856l.crashlytics();
            }
        }
    }

    public final HashSet billing(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        C17856l c17856l;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((C6821l) arrayList.get(i)).yandex.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = ((C10937l) it.next()).loadAd;
                if (abstractComponentCallbacksC4411l != null && (viewGroup = abstractComponentCallbacksC4411l.f8981l) != null) {
                    m3746synchronized();
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof C17856l) {
                        c17856l = (C17856l) tag;
                    } else {
                        c17856l = new C17856l(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, c17856l);
                    }
                    hashSet.add(c17856l);
                }
            }
            i++;
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final boolean m3729case(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.amazon.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.amazon.size() - 1;
            } else {
                int size2 = this.amazon.size() - 1;
                while (size2 >= 0) {
                    C6821l c6821l = (C6821l) this.amazon.get(size2);
                    if (i >= 0 && i == c6821l.subscription) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C6821l c6821l2 = (C6821l) this.amazon.get(size - 1);
                        if (i < 0 || i != c6821l2.subscription) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.amazon.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.amazon.size() - 1; size3 >= size; size3--) {
            arrayList.add((C6821l) this.amazon.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m3730catch() {
        if (this.pro == null) {
            return;
        }
        this.f26812synchronized = false;
        this.f26811strictfp = false;
        this.f26813throw.mopub = false;
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
            if (abstractComponentCallbacksC4411l != null) {
                abstractComponentCallbacksC4411l.f8949l.m3730catch();
            }
        }
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m3731class(Bundle bundle) {
        C3797l c3797l;
        int i;
        boolean z;
        int i2;
        C2872l c2872l;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.pro.f13181l.getClassLoader());
                this.remoteconfig.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.pro.f13181l.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C10038l c10038l = this.crashlytics;
        HashMap map2 = (HashMap) c10038l.f20466l;
        HashMap map3 = (HashMap) c10038l.f20462l;
        map2.clear();
        map2.putAll(map);
        C13585l c13585l = (C13585l) bundle.getParcelable("state");
        if (c13585l == null) {
            return;
        }
        map3.clear();
        Iterator it = c13585l.f26603l.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c3797l = this.metrica;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM2848implements = c10038l.m2848implements((String) it.next(), null);
            if (bundleM2848implements != null) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = (AbstractComponentCallbacksC4411l) this.f26813throw.loadAd.get(((C14309l) bundleM2848implements.getParcelable("state")).f28004l);
                if (abstractComponentCallbacksC4411l != null) {
                    if (m3727volatile(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC4411l);
                    }
                    c2872l = new C2872l(c3797l, c10038l, abstractComponentCallbacksC4411l, bundleM2848implements);
                } else {
                    c2872l = new C2872l(this.metrica, this.crashlytics, this.pro.f13181l.getClassLoader(), m3741package(), bundleM2848implements);
                }
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = c2872l.crashlytics;
                abstractComponentCallbacksC4411l2.f8964l = bundleM2848implements;
                abstractComponentCallbacksC4411l2.f8955l = this;
                if (m3727volatile(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC4411l2.f8974l + "): " + abstractComponentCallbacksC4411l2);
                }
                c2872l.smaato(this.pro.f13181l.getClassLoader());
                c10038l.m2867try(c2872l);
                c2872l.purchase = this.license;
            }
        }
        C7966l c7966l = this.f26813throw;
        c7966l.getClass();
        Iterator it2 = new ArrayList(c7966l.loadAd.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l3 = (AbstractComponentCallbacksC4411l) it2.next();
            if (map3.get(abstractComponentCallbacksC4411l3.f8974l) == null) {
                if (m3727volatile(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC4411l3 + " that was not found in the set of active Fragments " + c13585l.f26603l);
                }
                this.f26813throw.billing(abstractComponentCallbacksC4411l3);
                abstractComponentCallbacksC4411l3.f8955l = this;
                C2872l c2872l2 = new C2872l(c3797l, c10038l, abstractComponentCallbacksC4411l3);
                c2872l2.purchase = 1;
                c2872l2.isPro();
                abstractComponentCallbacksC4411l3.f8980l = true;
                c2872l2.isPro();
            }
        }
        ArrayList<String> arrayList = c13585l.f26602l;
        ((ArrayList) c10038l.f20463l).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lM2847goto = c10038l.m2847goto(str3);
                if (abstractComponentCallbacksC4411lM2847goto == null) {
                    C8339l.smaato(AbstractC15560l.Signature("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (m3727volatile(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC4411lM2847goto);
                }
                c10038l.m2865throw(abstractComponentCallbacksC4411lM2847goto);
            }
        }
        if (c13585l.f26599l != null) {
            this.amazon = new ArrayList(c13585l.f26599l.length);
            int i3 = 0;
            while (true) {
                C12862l[] c12862lArr = c13585l.f26599l;
                if (i3 >= c12862lArr.length) {
                    break;
                }
                C12862l c12862l = c12862lArr[i3];
                ArrayList arrayList2 = c12862l.f25303l;
                C6821l c6821l = new C6821l(this);
                int[] iArr = c12862l.f25304l;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    C10937l c10937l = new C10937l();
                    int i6 = i4 + 1;
                    int i7 = i;
                    c10937l.yandex = iArr[i4];
                    if (m3727volatile(i7)) {
                        Log.v("FragmentManager", "Instantiate " + c6821l + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    c10937l.admob = EnumC8981l.values()[c12862l.f25300l[i5]];
                    c10937l.subs = EnumC8981l.values()[c12862l.f25307l[i5]];
                    int i8 = i4 + 2;
                    c10937l.crashlytics = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    c10937l.amazon = i9;
                    int i10 = iArr[i4 + 3];
                    c10937l.purchase = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    c10937l.billing = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    c10937l.mopub = i13;
                    c6821l.loadAd = i9;
                    c6821l.crashlytics = i10;
                    c6821l.amazon = i12;
                    c6821l.purchase = i13;
                    c6821l.loadAd(c10937l);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                c6821l.billing = c12862l.f25306l;
                c6821l.admob = c12862l.f25310l;
                c6821l.mopub = true;
                c6821l.subs = c12862l.f25302l;
                c6821l.isPro = c12862l.f25309l;
                c6821l.firebase = c12862l.f25305l;
                c6821l.smaato = c12862l.f25311l;
                c6821l.remoteconfig = c12862l.f25308l;
                c6821l.vip = c12862l.f25299l;
                c6821l.metrica = c12862l.f25312l;
                c6821l.subscription = c12862l.f25301l;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((C10937l) c6821l.yandex.get(i15)).loadAd = c10038l.m2847goto(str4);
                    }
                }
                c6821l.crashlytics(1);
                if (m3727volatile(i14)) {
                    StringBuilder sbSignature = AbstractC2812l.Signature("restoreAllState: back stack #", i3, " (index ");
                    sbSignature.append(c6821l.subscription);
                    sbSignature.append("): ");
                    sbSignature.append(c6821l);
                    Log.v("FragmentManager", sbSignature.toString());
                    PrintWriter printWriter = new PrintWriter(new C2959l());
                    c6821l.mopub("  ", printWriter, false);
                    printWriter.close();
                }
                this.amazon.add(c6821l);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.amazon = new ArrayList();
        }
        this.firebase.set(c13585l.f26605l);
        String str5 = c13585l.f26604l;
        if (str5 != null) {
            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lM2847goto2 = c10038l.m2847goto(str5);
            this.isVip = abstractComponentCallbacksC4411lM2847goto2;
            ads(abstractComponentCallbacksC4411lM2847goto2);
        }
        ArrayList arrayList3 = c13585l.f26606l;
        if (arrayList3 != null) {
            for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                this.smaato.put((String) arrayList3.get(i16), (C13746l) c13585l.f26600l.get(i16));
            }
        }
        this.f26814throws = new ArrayDeque(c13585l.f26601l);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m3732continue(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            C8339l.smaato("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C6821l) arrayList.get(i)).metrica) {
                if (i2 != i) {
                    premium(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C6821l) arrayList.get(i2)).metrica) {
                        i2++;
                    }
                }
                premium(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            premium(arrayList, arrayList2, i2, size);
        }
    }

    public final void crashlytics(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (m3727volatile(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC4411l);
        }
        if (abstractComponentCallbacksC4411l.f8969l) {
            abstractComponentCallbacksC4411l.f8969l = false;
            if (abstractComponentCallbacksC4411l.f8984l) {
                return;
            }
            this.crashlytics.m2865throw(abstractComponentCallbacksC4411l);
            if (m3727volatile(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC4411l);
            }
            if (m3725native(abstractComponentCallbacksC4411l)) {
                this.f26809package = true;
            }
        }
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m3733default(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        ViewGroup viewGroupM3748throws = m3748throws(abstractComponentCallbacksC4411l);
        if (viewGroupM3748throws == null || !(viewGroupM3748throws instanceof C0025l)) {
            return;
        }
        ((C0025l) viewGroupM3748throws).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final boolean m3734else() {
        signatures(false);
        isVip(true);
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.isVip;
        if (abstractComponentCallbacksC4411l != null && abstractComponentCallbacksC4411l.billing().m3734else()) {
            return true;
        }
        boolean zM3729case = m3729case(this.f26810private, this.f26806extends, -1, 0);
        if (zM3729case) {
            this.loadAd = true;
            try {
                m3732continue(this.f26810private, this.f26806extends);
                amazon();
            } catch (Throwable th) {
                amazon();
                throw th;
            }
        }
        m3738instanceof();
        license();
        ((HashMap) this.crashlytics.f20462l).values().removeAll(Collections.singleton(null));
        return zM3729case;
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m3735final(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, EnumC8981l enumC8981l) {
        if (abstractComponentCallbacksC4411l == this.crashlytics.m2847goto(abstractComponentCallbacksC4411l.f8974l) && (abstractComponentCallbacksC4411l.f8954l == null || abstractComponentCallbacksC4411l.f8955l == this)) {
            abstractComponentCallbacksC4411l.f8948l = enumC8981l;
        } else {
            C1759l.smaato("Fragment ", abstractComponentCallbacksC4411l, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final boolean firebase() {
        if (this.license < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
            if (abstractComponentCallbacksC4411l != null && m3723extends(abstractComponentCallbacksC4411l)) {
                if (!abstractComponentCallbacksC4411l.f8947l ? abstractComponentCallbacksC4411l.f8949l.firebase() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC4411l);
                    z = true;
                }
            }
        }
        if (this.purchase != null) {
            for (int i = 0; i < this.purchase.size(); i++) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = (AbstractComponentCallbacksC4411l) this.purchase.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC4411l2)) {
                    abstractComponentCallbacksC4411l2.getClass();
                }
            }
        }
        this.purchase = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m3736goto(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        ViewGroup viewGroupM3748throws = m3748throws(abstractComponentCallbacksC4411l);
        if (viewGroupM3748throws != null) {
            C16447l c16447l = abstractComponentCallbacksC4411l.f8961l;
            if ((c16447l == null ? 0 : c16447l.purchase) + (c16447l == null ? 0 : c16447l.amazon) + (c16447l == null ? 0 : c16447l.crashlytics) + (c16447l == null ? 0 : c16447l.loadAd) > 0) {
                if (viewGroupM3748throws.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM3748throws.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC4411l);
                }
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = (AbstractComponentCallbacksC4411l) viewGroupM3748throws.getTag(R.id.visible_removing_fragment_view_tag);
                C16447l c16447l2 = abstractComponentCallbacksC4411l.f8961l;
                boolean z = c16447l2 != null ? c16447l2.yandex : false;
                if (abstractComponentCallbacksC4411l2.f8961l == null) {
                    return;
                }
                abstractComponentCallbacksC4411l2.purchase().yandex = z;
            }
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m3737import() {
        for (C2872l c2872l : this.crashlytics.m2849import()) {
            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c2872l.crashlytics;
            if (abstractComponentCallbacksC4411l.f8946l) {
                if (this.loadAd) {
                    this.f26808native = true;
                } else {
                    abstractComponentCallbacksC4411l.f8946l = false;
                    c2872l.isPro();
                }
            }
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m3738instanceof() {
        synchronized (this.yandex) {
            try {
                if (!this.yandex.isEmpty()) {
                    this.isPro.purchase(true);
                    if (m3727volatile(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.amazon.size() + (this.admob != null ? 1 : 0) > 0 && m3724for(this.advert);
                if (m3727volatile(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.isPro.purchase(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final Bundle m3739interface() {
        int i;
        ArrayList arrayList;
        C12862l[] c12862lArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        appmetrica();
        ad();
        signatures(true);
        this.f26812synchronized = true;
        this.f26813throw.mopub = true;
        C10038l c10038l = this.crashlytics;
        c10038l.getClass();
        HashMap map = (HashMap) c10038l.f20462l;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2872l c2872l = (C2872l) it.next();
            if (c2872l != null) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c2872l.crashlytics;
                String str = abstractComponentCallbacksC4411l.f8974l;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = c2872l.crashlytics;
                if (abstractComponentCallbacksC4411l2.f8965l == -1 && (bundle = abstractComponentCallbacksC4411l2.f8964l) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new C14309l(abstractComponentCallbacksC4411l2));
                if (abstractComponentCallbacksC4411l2.f8965l > 0) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC4411l2.license(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c2872l.yandex.Signature(abstractComponentCallbacksC4411l2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC4411l2.f8951l.adcel(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM3739interface = abstractComponentCallbacksC4411l2.f8949l.m3739interface();
                    if (!bundleM3739interface.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM3739interface);
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC4411l2.f8952l;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC4411l2.f8975l;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC4411l2.f8983l;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c10038l.m2848implements(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC4411l.f8974l);
                if (m3727volatile(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC4411l + ": " + abstractComponentCallbacksC4411l.f8964l);
                }
            }
        }
        HashMap map2 = (HashMap) this.crashlytics.f20466l;
        if (!map2.isEmpty()) {
            C10038l c10038l2 = this.crashlytics;
            synchronized (((ArrayList) c10038l2.f20463l)) {
                try {
                    if (((ArrayList) c10038l2.f20463l).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c10038l2.f20463l).size());
                        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l3 : (ArrayList) c10038l2.f20463l) {
                            arrayList.add(abstractComponentCallbacksC4411l3.f8974l);
                            if (m3727volatile(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC4411l3.f8974l + "): " + abstractComponentCallbacksC4411l3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.amazon.size();
            if (size > 0) {
                c12862lArr = new C12862l[size];
                for (i = 0; i < size; i++) {
                    c12862lArr[i] = new C12862l((C6821l) this.amazon.get(i));
                    if (m3727volatile(2)) {
                        StringBuilder sbSignature = AbstractC2812l.Signature("saveAllState: adding back stack #", i, ": ");
                        sbSignature.append(this.amazon.get(i));
                        Log.v("FragmentManager", sbSignature.toString());
                    }
                }
            } else {
                c12862lArr = null;
            }
            C13585l c13585l = new C13585l();
            c13585l.f26604l = null;
            ArrayList arrayList3 = new ArrayList();
            c13585l.f26606l = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            c13585l.f26600l = arrayList4;
            c13585l.f26603l = arrayList2;
            c13585l.f26602l = arrayList;
            c13585l.f26599l = c12862lArr;
            c13585l.f26605l = this.firebase.get();
            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l4 = this.isVip;
            if (abstractComponentCallbacksC4411l4 != null) {
                c13585l.f26604l = abstractComponentCallbacksC4411l4.f8974l;
            }
            arrayList3.addAll(this.smaato.keySet());
            arrayList4.addAll(this.smaato.values());
            c13585l.f26601l = new ArrayList(this.f26814throws);
            bundle2.putParcelable("state", c13585l);
            for (String str2 : this.remoteconfig.keySet()) {
                bundle2.putBundle(AbstractC14814l.startapp("result_", str2), (Bundle) this.remoteconfig.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(AbstractC14814l.startapp("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (m3727volatile(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final boolean isPro() {
        if (this.license >= 1) {
            for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
                if (abstractComponentCallbacksC4411l != null) {
                    if (!abstractComponentCallbacksC4411l.f8947l ? abstractComponentCallbacksC4411l.f8949l.isPro() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void isVip(boolean z) {
        if (this.loadAd) {
            C8339l.smaato("FragmentManager is already executing transactions");
            return;
        }
        if (this.pro == null) {
            if (this.f26815volatile) {
                C8339l.smaato("FragmentManager has been destroyed");
                return;
            } else {
                C8339l.smaato("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.pro.f13177l.getLooper()) {
            C8339l.smaato("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.f26812synchronized || this.f26811strictfp)) {
            C8339l.smaato("Can not perform this action after onSaveInstanceState");
        } else if (this.f26810private == null) {
            this.f26810private = new ArrayList();
            this.f26806extends = new ArrayList();
        }
    }

    public final void license() {
        if (this.f26808native) {
            this.f26808native = false;
            m3737import();
        }
    }

    public final void loadAd(C6239l c6239l, AbstractC5473l abstractC5473l, AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (this.pro != null) {
            C8339l.smaato("Already attached");
            return;
        }
        this.pro = c6239l;
        this.ad = abstractC5473l;
        this.advert = abstractComponentCallbacksC4411l;
        CopyOnWriteArrayList copyOnWriteArrayList = this.startapp;
        if (abstractComponentCallbacksC4411l != null) {
            copyOnWriteArrayList.add(new C7895l(abstractComponentCallbacksC4411l));
        } else if (c6239l != null) {
            copyOnWriteArrayList.add(c6239l);
        }
        if (this.advert != null) {
            m3738instanceof();
        }
        if (c6239l != null) {
            C16390l c16390lYandex = c6239l.f13180l.yandex();
            this.mopub = c16390lYandex;
            c16390lYandex.yandex(this.isPro, abstractComponentCallbacksC4411l != null ? abstractComponentCallbacksC4411l : c6239l);
        }
        if (abstractComponentCallbacksC4411l != null) {
            C7966l c7966l = abstractComponentCallbacksC4411l.f8955l.f26813throw;
            HashMap map = c7966l.crashlytics;
            C7966l c7966l2 = (C7966l) map.get(abstractComponentCallbacksC4411l.f8974l);
            if (c7966l2 == null) {
                c7966l2 = new C7966l(c7966l.purchase);
                map.put(abstractComponentCallbacksC4411l.f8974l, c7966l2);
            }
            this.f26813throw = c7966l2;
        } else if (c6239l != null) {
            C7502l c7502l = new C7502l(c6239l.f13180l.firebase(), C7966l.admob, C12214l.loadAd);
            InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C7966l.class);
            String strBilling = interfaceC1388lLoadAd.billing();
            if (strBilling == null) {
                C8339l.metrica("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.f26813throw = (C7966l) c7502l.crashlytics(interfaceC1388lLoadAd, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strBilling));
        } else {
            this.f26813throw = new C7966l(false);
        }
        C7966l c7966l3 = this.f26813throw;
        c7966l3.mopub = this.f26812synchronized || this.f26811strictfp;
        this.crashlytics.f20465l = c7966l3;
        C6239l c6239l2 = this.pro;
        if (c6239l2 != null && abstractComponentCallbacksC4411l == null) {
            C18396l c18396lMetrica = c6239l2.metrica();
            c18396lMetrica.m4528synchronized("android:support:fragments", new C8955l(3, this));
            Bundle bundleTapsense = c18396lMetrica.tapsense("android:support:fragments");
            if (bundleTapsense != null) {
                m3731class(bundleTapsense);
            }
        }
        C6239l c6239l3 = this.pro;
        if (c6239l3 != null) {
            C16166l c16166l = c6239l3.f13180l.f28690l;
            String strConcat = "FragmentManager:".concat(abstractComponentCallbacksC4411l != null ? AbstractC0653l.ads(new StringBuilder(), abstractComponentCallbacksC4411l.f8974l, ":") : "");
            this.applovin = c16166l.crashlytics(strConcat.concat("StartActivityForResult"), new C17423l(4), new C13161l(this));
            this.appmetrica = c16166l.crashlytics(strConcat.concat("StartIntentSenderForResult"), new C17423l(5), new C5138l(14, this));
            this.inmobi = c16166l.crashlytics(strConcat.concat("RequestPermissions"), new C17423l(2), new C10685l(this));
        }
        C6239l c6239l4 = this.pro;
        if (c6239l4 != null) {
            c6239l4.f13180l.admob(this.adcel);
        }
        C6239l c6239l5 = this.pro;
        if (c6239l5 != null) {
            c6239l5.f13180l.f28692l.add(this.ads);
        }
        C6239l c6239l6 = this.pro;
        if (c6239l6 != null) {
            c6239l6.f13180l.f28676l.add(this.subscription);
        }
        C6239l c6239l7 = this.pro;
        if (c6239l7 != null) {
            c6239l7.f13180l.f28693l.add(this.tapsense);
        }
        C6239l c6239l8 = this.pro;
        if (c6239l8 == null || abstractComponentCallbacksC4411l != null) {
            return;
        }
        C10111l c10111l = c6239l8.f13180l.f28677l;
        ((CopyOnWriteArrayList) c10111l.f20586l).add(this.Signature);
        ((Runnable) c10111l.f20587l).run();
    }

    public final void metrica() {
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2850instanceof()) {
            if (abstractComponentCallbacksC4411l != null) {
                abstractComponentCallbacksC4411l.smaato();
                abstractComponentCallbacksC4411l.f8949l.metrica();
            }
        }
    }

    public final C2872l mopub(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        String str = abstractComponentCallbacksC4411l.f8974l;
        C10038l c10038l = this.crashlytics;
        C2872l c2872l = (C2872l) ((HashMap) c10038l.f20462l).get(str);
        if (c2872l != null) {
            return c2872l;
        }
        C2872l c2872l2 = new C2872l(this.metrica, c10038l, abstractComponentCallbacksC4411l);
        c2872l2.smaato(this.pro.f13181l.getClassLoader());
        c2872l2.purchase = this.license;
        return c2872l2;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void m3740new(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (abstractComponentCallbacksC4411l != null) {
            if (abstractComponentCallbacksC4411l != this.crashlytics.m2847goto(abstractComponentCallbacksC4411l.f8974l) || (abstractComponentCallbacksC4411l.f8954l != null && abstractComponentCallbacksC4411l.f8955l != this)) {
                C1759l.smaato("Fragment ", abstractComponentCallbacksC4411l, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = this.isVip;
        this.isVip = abstractComponentCallbacksC4411l;
        ads(abstractComponentCallbacksC4411l2);
        ads(this.isVip);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C13439l m3741package() {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.advert;
        return abstractComponentCallbacksC4411l != null ? abstractComponentCallbacksC4411l.f8955l.m3741package() : this.signatures;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x022f A[PHI: r15
  0x022f: PHI (r15v21 int) = (r15v20 int), (r15v23 int) binds: [B:105:0x021c, B:109:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    public final void premium(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5 = i;
        C10038l c10038l = this.crashlytics;
        ArrayList arrayList4 = this.vip;
        boolean z4 = ((C6821l) arrayList.get(i5)).metrica;
        ArrayList arrayList5 = this.f26807for;
        if (arrayList5 == null) {
            this.f26807for = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.f26807for.addAll(c10038l.m2858public());
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.isVip;
        int i6 = i5;
        boolean z5 = false;
        while (i6 < i2) {
            C6821l c6821l = (C6821l) arrayList.get(i6);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList6 = this.f26807for;
            if (zBooleanValue) {
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
                int i7 = 1;
                ArrayList arrayList7 = c6821l.yandex;
                int size = arrayList7.size() - 1;
                while (size >= 0) {
                    C10937l c10937l = (C10937l) arrayList7.get(size);
                    int i8 = c10937l.yandex;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 6:
                                    arrayList6.add(c10937l.loadAd);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC4411l = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC4411l = c10937l.loadAd;
                                    break;
                                case 10:
                                    c10937l.subs = c10937l.admob;
                                    break;
                            }
                        } else {
                            arrayList6.add(c10937l.loadAd);
                        }
                        size--;
                        i7 = 1;
                    }
                    arrayList6.remove(c10937l.loadAd);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList8 = c6821l.yandex;
                int i9 = 0;
                while (i9 < arrayList8.size()) {
                    C10937l c10937l2 = (C10937l) arrayList8.get(i9);
                    boolean z6 = z4;
                    int i10 = c10937l2.yandex;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        z3 = z5;
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                arrayList6.remove(c10937l2.loadAd);
                                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = c10937l2.loadAd;
                                if (abstractComponentCallbacksC4411l2 == abstractComponentCallbacksC4411l) {
                                    arrayList8.add(i9, new C10937l(9, abstractComponentCallbacksC4411l2));
                                    i9++;
                                    abstractComponentCallbacksC4411l = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 == 8) {
                                arrayList8.add(i9, new C10937l(9, abstractComponentCallbacksC4411l, 0));
                                c10937l2.crashlytics = true;
                                i9++;
                                abstractComponentCallbacksC4411l = c10937l2.loadAd;
                            }
                            i12 = 1;
                        } else {
                            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l3 = c10937l2.loadAd;
                            int i13 = abstractComponentCallbacksC4411l3.f8970l;
                            int size2 = arrayList6.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l4 = (AbstractComponentCallbacksC4411l) arrayList6.get(size2);
                                ArrayList arrayList9 = arrayList4;
                                if (abstractComponentCallbacksC4411l4.f8970l != i13) {
                                    i13 = i13;
                                } else if (abstractComponentCallbacksC4411l4 == abstractComponentCallbacksC4411l3) {
                                    i13 = i13;
                                    z7 = true;
                                } else {
                                    if (abstractComponentCallbacksC4411l4 == abstractComponentCallbacksC4411l) {
                                        arrayList8.add(i9, new C10937l(9, abstractComponentCallbacksC4411l4, 0));
                                        i9++;
                                        i4 = 0;
                                        abstractComponentCallbacksC4411l = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    C10937l c10937l3 = new C10937l(3, abstractComponentCallbacksC4411l4, i4);
                                    c10937l3.amazon = c10937l2.amazon;
                                    c10937l3.billing = c10937l2.billing;
                                    c10937l3.purchase = c10937l2.purchase;
                                    c10937l3.mopub = c10937l2.mopub;
                                    arrayList8.add(i9, c10937l3);
                                    arrayList6.remove(abstractComponentCallbacksC4411l4);
                                    i9++;
                                    abstractComponentCallbacksC4411l = abstractComponentCallbacksC4411l;
                                }
                                size2 = i14 - 1;
                                i13 = i13;
                                arrayList4 = arrayList9;
                            }
                            arrayList4 = arrayList4;
                            i12 = 1;
                            if (z7) {
                                arrayList8.remove(i9);
                                i9--;
                            } else {
                                c10937l2.yandex = 1;
                                c10937l2.crashlytics = true;
                                arrayList6.add(abstractComponentCallbacksC4411l3);
                            }
                        }
                        i9 += i12;
                        z4 = z6;
                        i6 = i11;
                        z5 = z3;
                        arrayList4 = arrayList4;
                    } else {
                        z3 = z5;
                    }
                    arrayList4 = arrayList4;
                    arrayList6.add(c10937l2.loadAd);
                    i9 += i12;
                    z4 = z6;
                    i6 = i11;
                    z5 = z3;
                    arrayList4 = arrayList4;
                }
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
            }
            z5 = z2 || c6821l.mopub;
            i6 = i3 + 1;
            z4 = z;
            arrayList4 = arrayList3;
        }
        ArrayList arrayList10 = arrayList4;
        boolean z8 = z4;
        boolean z9 = z5;
        this.f26807for.clear();
        if (!z8 && this.license >= 1) {
            for (int i15 = i5; i15 < i2; i15++) {
                Iterator it = ((C6821l) arrayList.get(i15)).yandex.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l5 = ((C10937l) it.next()).loadAd;
                    if (abstractComponentCallbacksC4411l5 != null && abstractComponentCallbacksC4411l5.f8955l != null) {
                        c10038l.m2867try(mopub(abstractComponentCallbacksC4411l5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i5;
        while (i16 < i2) {
            C6821l c6821l2 = (C6821l) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                c6821l2.crashlytics(-1);
                C13734l c13734l = c6821l2.adcel;
                ArrayList arrayList11 = c6821l2.yandex;
                boolean z10 = true;
                for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                    C10937l c10937l4 = (C10937l) arrayList11.get(size3);
                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l6 = c10937l4.loadAd;
                    if (abstractComponentCallbacksC4411l6 != null) {
                        if (abstractComponentCallbacksC4411l6.f8961l != null) {
                            abstractComponentCallbacksC4411l6.purchase().yandex = z10;
                        }
                        int i17 = c6821l2.billing;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i18 = 4100;
                                if (i17 != 8197) {
                                    i19 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    } else {
                                        i18 = i19;
                                    }
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (abstractComponentCallbacksC4411l6.f8961l != null || i18 != 0) {
                            abstractComponentCallbacksC4411l6.purchase();
                            abstractComponentCallbacksC4411l6.f8961l.billing = i18;
                        }
                        abstractComponentCallbacksC4411l6.purchase();
                        abstractComponentCallbacksC4411l6.f8961l.getClass();
                    }
                    switch (c10937l4.yandex) {
                        case 1:
                            abstractComponentCallbacksC4411l6.signatures(c10937l4.amazon, c10937l4.purchase, c10937l4.billing, c10937l4.mopub);
                            z10 = true;
                            c13734l.m3733default(abstractComponentCallbacksC4411l6, true);
                            c13734l.m3745switch(abstractComponentCallbacksC4411l6);
                            break;
                        case 2:
                        default:
                            C10754l.smaato(c10937l4.yandex, str);
                            return;
                        case 3:
                            abstractComponentCallbacksC4411l6.signatures(c10937l4.amazon, c10937l4.purchase, c10937l4.billing, c10937l4.mopub);
                            c13734l.yandex(abstractComponentCallbacksC4411l6);
                            z10 = true;
                            break;
                        case 4:
                            abstractComponentCallbacksC4411l6.signatures(c10937l4.amazon, c10937l4.purchase, c10937l4.billing, c10937l4.mopub);
                            c13734l.getClass();
                            m3726super(abstractComponentCallbacksC4411l6);
                            z10 = true;
                            break;
                        case 5:
                            abstractComponentCallbacksC4411l6.signatures(c10937l4.amazon, c10937l4.purchase, c10937l4.billing, c10937l4.mopub);
                            c13734l.m3733default(abstractComponentCallbacksC4411l6, true);
                            c13734l.m3744strictfp(abstractComponentCallbacksC4411l6);
                            z10 = true;
                            break;
                        case 6:
                            abstractComponentCallbacksC4411l6.signatures(c10937l4.amazon, c10937l4.purchase, c10937l4.billing, c10937l4.mopub);
                            c13734l.crashlytics(abstractComponentCallbacksC4411l6);
                            z10 = true;
                            break;
                        case 7:
                            abstractComponentCallbacksC4411l6.signatures(c10937l4.amazon, c10937l4.purchase, c10937l4.billing, c10937l4.mopub);
                            c13734l.m3733default(abstractComponentCallbacksC4411l6, true);
                            c13734l.admob(abstractComponentCallbacksC4411l6);
                            z10 = true;
                            break;
                        case 8:
                            c13734l.m3740new(null);
                            z10 = true;
                            break;
                        case 9:
                            c13734l.m3740new(abstractComponentCallbacksC4411l6);
                            z10 = true;
                            break;
                        case 10:
                            c10937l4.subs = abstractComponentCallbacksC4411l6.f8948l;
                            c13734l.m3735final(abstractComponentCallbacksC4411l6, c10937l4.admob);
                            z10 = true;
                            break;
                    }
                }
            } else {
                c6821l2.crashlytics(1);
                C13734l c13734l2 = c6821l2.adcel;
                ArrayList arrayList12 = c6821l2.yandex;
                int size4 = arrayList12.size();
                int i20 = 0;
                while (i20 < size4) {
                    C10937l c10937l5 = (C10937l) arrayList12.get(i20);
                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l7 = c10937l5.loadAd;
                    if (abstractComponentCallbacksC4411l7 != null) {
                        if (abstractComponentCallbacksC4411l7.f8961l != null) {
                            abstractComponentCallbacksC4411l7.purchase().yandex = false;
                        }
                        int i21 = c6821l2.billing;
                        if (abstractComponentCallbacksC4411l7.f8961l != null || i21 != 0) {
                            abstractComponentCallbacksC4411l7.purchase();
                            abstractComponentCallbacksC4411l7.f8961l.billing = i21;
                        }
                        abstractComponentCallbacksC4411l7.purchase();
                        abstractComponentCallbacksC4411l7.f8961l.getClass();
                    }
                    switch (c10937l5.yandex) {
                        case 1:
                            abstractComponentCallbacksC4411l7.signatures(c10937l5.amazon, c10937l5.purchase, c10937l5.billing, c10937l5.mopub);
                            c13734l2.m3733default(abstractComponentCallbacksC4411l7, false);
                            c13734l2.yandex(abstractComponentCallbacksC4411l7);
                            i20++;
                            str = str;
                            break;
                        case 2:
                        default:
                            C10754l.smaato(c10937l5.yandex, str);
                            return;
                        case 3:
                            abstractComponentCallbacksC4411l7.signatures(c10937l5.amazon, c10937l5.purchase, c10937l5.billing, c10937l5.mopub);
                            c13734l2.m3745switch(abstractComponentCallbacksC4411l7);
                            i20++;
                            str = str;
                            break;
                        case 4:
                            abstractComponentCallbacksC4411l7.signatures(c10937l5.amazon, c10937l5.purchase, c10937l5.billing, c10937l5.mopub);
                            c13734l2.m3744strictfp(abstractComponentCallbacksC4411l7);
                            i20++;
                            str = str;
                            break;
                        case 5:
                            abstractComponentCallbacksC4411l7.signatures(c10937l5.amazon, c10937l5.purchase, c10937l5.billing, c10937l5.mopub);
                            c13734l2.m3733default(abstractComponentCallbacksC4411l7, false);
                            m3726super(abstractComponentCallbacksC4411l7);
                            i20++;
                            str = str;
                            break;
                        case 6:
                            abstractComponentCallbacksC4411l7.signatures(c10937l5.amazon, c10937l5.purchase, c10937l5.billing, c10937l5.mopub);
                            c13734l2.admob(abstractComponentCallbacksC4411l7);
                            i20++;
                            str = str;
                            break;
                        case 7:
                            abstractComponentCallbacksC4411l7.signatures(c10937l5.amazon, c10937l5.purchase, c10937l5.billing, c10937l5.mopub);
                            c13734l2.m3733default(abstractComponentCallbacksC4411l7, false);
                            c13734l2.crashlytics(abstractComponentCallbacksC4411l7);
                            i20++;
                            str = str;
                            break;
                        case 8:
                            c13734l2.m3740new(abstractComponentCallbacksC4411l7);
                            i20++;
                            str = str;
                            break;
                        case 9:
                            c13734l2.m3740new(null);
                            i20++;
                            str = str;
                            break;
                        case 10:
                            c10937l5.admob = abstractComponentCallbacksC4411l7.f8948l;
                            c13734l2.m3735final(abstractComponentCallbacksC4411l7, c10937l5.subs);
                            i20++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList10.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(inmobi((C6821l) it2.next()));
            }
            if (this.admob == null) {
                Iterator it3 = arrayList10.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        C18725l.loadAd();
                        return;
                    }
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = arrayList10.iterator();
                while (it5.hasNext()) {
                    if (it5.next() != null) {
                        C18725l.loadAd();
                        return;
                    }
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i22 = i5; i22 < i2; i22++) {
            C6821l c6821l3 = (C6821l) arrayList.get(i22);
            if (zBooleanValue2) {
                for (int size5 = c6821l3.yandex.size() - 1; size5 >= 0; size5--) {
                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l8 = ((C10937l) c6821l3.yandex.get(size5)).loadAd;
                    if (abstractComponentCallbacksC4411l8 != null) {
                        mopub(abstractComponentCallbacksC4411l8).isPro();
                    }
                }
            } else {
                Iterator it7 = c6821l3.yandex.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l9 = ((C10937l) it7.next()).loadAd;
                    if (abstractComponentCallbacksC4411l9 != null) {
                        mopub(abstractComponentCallbacksC4411l9).isPro();
                    }
                }
            }
        }
        m3747throw(this.license, true);
        for (C17856l c17856l : billing(arrayList, i5, i2)) {
            c17856l.purchase = zBooleanValue2;
            synchronized (c17856l.loadAd) {
                c17856l.mopub();
                ArrayList arrayList13 = c17856l.loadAd;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    ((AbstractC18261l) listIterator.previous()).getClass();
                    throw null;
                }
                c17856l.billing = false;
                Unit unit = Unit.INSTANCE;
            }
            c17856l.crashlytics();
        }
        while (i5 < i2) {
            C6821l c6821l4 = (C6821l) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && c6821l4.subscription >= 0) {
                c6821l4.subscription = -1;
            }
            if (c6821l4.startapp != null) {
                for (int i23 = 0; i23 < c6821l4.startapp.size(); i23++) {
                    ((Runnable) c6821l4.startapp.get(i23)).run();
                }
                c6821l4.startapp = null;
            }
            i5++;
        }
        if (!z9 || arrayList10.size() <= 0) {
            return;
        }
        arrayList10.get(0).getClass();
        C18725l.loadAd();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final boolean m3742private() {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.advert;
        if (abstractComponentCallbacksC4411l == null) {
            return true;
        }
        return abstractComponentCallbacksC4411l.f8954l != null && abstractComponentCallbacksC4411l.f8984l && abstractComponentCallbacksC4411l.admob().m3742private();
    }

    public final void pro(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strFirebase = AbstractC12900l.firebase(str, "    ");
        C10038l c10038l = this.crashlytics;
        ArrayList arrayList = (ArrayList) c10038l.f20463l;
        String strFirebase2 = AbstractC12900l.firebase(str, "    ");
        HashMap map = (HashMap) c10038l.f20462l;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C2872l c2872l : map.values()) {
                printWriter.print(str);
                if (c2872l != null) {
                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c2872l.crashlytics;
                    printWriter.println(abstractComponentCallbacksC4411l);
                    abstractComponentCallbacksC4411l.getClass();
                    printWriter.print(strFirebase2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC4411l.f8962l));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC4411l.f8970l));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC4411l.f8978l);
                    printWriter.print(strFirebase2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC4411l.f8965l);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC4411l.f8974l);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC4411l.f8966l);
                    printWriter.print(strFirebase2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC4411l.f8984l);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC4411l.f8980l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC4411l.f8986l);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC4411l.f8973l);
                    printWriter.print(strFirebase2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC4411l.f8947l);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC4411l.f8969l);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC4411l.f8987l);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strFirebase2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC4411l.f8977l);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC4411l.f8985l);
                    if (abstractComponentCallbacksC4411l.f8955l != null) {
                        printWriter.print(strFirebase2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC4411l.f8955l);
                    }
                    if (abstractComponentCallbacksC4411l.f8954l != null) {
                        printWriter.print(strFirebase2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC4411l.f8954l);
                    }
                    if (abstractComponentCallbacksC4411l.f8989l != null) {
                        printWriter.print(strFirebase2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC4411l.f8989l);
                    }
                    if (abstractComponentCallbacksC4411l.f8983l != null) {
                        printWriter.print(strFirebase2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC4411l.f8983l);
                    }
                    if (abstractComponentCallbacksC4411l.f8964l != null) {
                        printWriter.print(strFirebase2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC4411l.f8964l);
                    }
                    if (abstractComponentCallbacksC4411l.f8952l != null) {
                        printWriter.print(strFirebase2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC4411l.f8952l);
                    }
                    if (abstractComponentCallbacksC4411l.f8975l != null) {
                        printWriter.print(strFirebase2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC4411l.f8975l);
                    }
                    Object objM2847goto = abstractComponentCallbacksC4411l.f8953l;
                    if (objM2847goto == null) {
                        C13734l c13734l = abstractComponentCallbacksC4411l.f8955l;
                        objM2847goto = (c13734l == null || (str2 = abstractComponentCallbacksC4411l.f8956l) == null) ? null : c13734l.crashlytics.m2847goto(str2);
                    }
                    if (objM2847goto != null) {
                        printWriter.print(strFirebase2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM2847goto);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC4411l.f8982l);
                    }
                    printWriter.print(strFirebase2);
                    printWriter.print("mPopDirection=");
                    C16447l c16447l = abstractComponentCallbacksC4411l.f8961l;
                    printWriter.println(c16447l == null ? false : c16447l.yandex);
                    C16447l c16447l2 = abstractComponentCallbacksC4411l.f8961l;
                    if ((c16447l2 == null ? 0 : c16447l2.loadAd) != 0) {
                        printWriter.print(strFirebase2);
                        printWriter.print("getEnterAnim=");
                        C16447l c16447l3 = abstractComponentCallbacksC4411l.f8961l;
                        printWriter.println(c16447l3 == null ? 0 : c16447l3.loadAd);
                    }
                    C16447l c16447l4 = abstractComponentCallbacksC4411l.f8961l;
                    if ((c16447l4 == null ? 0 : c16447l4.crashlytics) != 0) {
                        printWriter.print(strFirebase2);
                        printWriter.print("getExitAnim=");
                        C16447l c16447l5 = abstractComponentCallbacksC4411l.f8961l;
                        printWriter.println(c16447l5 == null ? 0 : c16447l5.crashlytics);
                    }
                    C16447l c16447l6 = abstractComponentCallbacksC4411l.f8961l;
                    if ((c16447l6 == null ? 0 : c16447l6.amazon) != 0) {
                        printWriter.print(strFirebase2);
                        printWriter.print("getPopEnterAnim=");
                        C16447l c16447l7 = abstractComponentCallbacksC4411l.f8961l;
                        printWriter.println(c16447l7 == null ? 0 : c16447l7.amazon);
                    }
                    C16447l c16447l8 = abstractComponentCallbacksC4411l.f8961l;
                    if ((c16447l8 == null ? 0 : c16447l8.purchase) != 0) {
                        printWriter.print(strFirebase2);
                        printWriter.print("getPopExitAnim=");
                        C16447l c16447l9 = abstractComponentCallbacksC4411l.f8961l;
                        printWriter.println(c16447l9 == null ? 0 : c16447l9.purchase);
                    }
                    if (abstractComponentCallbacksC4411l.f8981l != null) {
                        printWriter.print(strFirebase2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC4411l.f8981l);
                    }
                    C6239l c6239l = abstractComponentCallbacksC4411l.f8954l;
                    if ((c6239l == null ? null : c6239l.f13181l) != null) {
                        C7502l c7502l = new C7502l(abstractComponentCallbacksC4411l.firebase(), C8011l.crashlytics, C12214l.loadAd);
                        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C8011l.class);
                        String strBilling = interfaceC1388lLoadAd.billing();
                        if (strBilling != null) {
                            C18152l c18152l = ((C8011l) c7502l.crashlytics(interfaceC1388lLoadAd, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strBilling))).loadAd;
                            if (c18152l.f35537l > 0) {
                                printWriter.print(strFirebase2);
                                printWriter.println("Loaders:");
                                if (c18152l.f35537l > 0) {
                                    if (c18152l.billing(0) == null) {
                                        printWriter.print(strFirebase2);
                                        printWriter.print("  #");
                                        printWriter.print(c18152l.amazon(0));
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                    C18725l.loadAd();
                                }
                            }
                        } else {
                            C8339l.metrica("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(strFirebase2);
                    printWriter.println("Child " + abstractComponentCallbacksC4411l.f8949l + ":");
                    abstractComponentCallbacksC4411l.f8949l.pro(strFirebase2.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = (AbstractComponentCallbacksC4411l) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC4411l2.toString());
            }
        }
        ArrayList arrayList2 = this.purchase;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l3 = (AbstractComponentCallbacksC4411l) this.purchase.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC4411l3.toString());
            }
        }
        int size3 = this.amazon.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C6821l c6821l = (C6821l) this.amazon.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c6821l.toString());
                c6821l.mopub(strFirebase, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.firebase.get());
        synchronized (this.yandex) {
            try {
                int size4 = this.yandex.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC13362l) this.yandex.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.pro);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.ad);
        if (this.advert != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.advert);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.license);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f26812synchronized);
        printWriter.print(" mStopped=");
        printWriter.print(this.f26811strictfp);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f26815volatile);
        if (this.f26809package) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f26809package);
        }
    }

    public final HashSet purchase() {
        C17856l c17856l;
        HashSet hashSet = new HashSet();
        Iterator it = this.crashlytics.m2849import().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C2872l) it.next()).crashlytics.f8981l;
            if (viewGroup != null) {
                m3746synchronized();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C17856l) {
                    c17856l = (C17856l) tag;
                } else {
                    c17856l = new C17856l(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c17856l);
                }
                hashSet.add(c17856l);
            }
        }
        return hashSet;
    }

    public final void remoteconfig(boolean z) {
        if (z && this.pro != null) {
            m3728abstract(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
            if (abstractComponentCallbacksC4411l != null) {
                abstractComponentCallbacksC4411l.f8968l = true;
                if (z) {
                    abstractComponentCallbacksC4411l.f8949l.remoteconfig(true);
                }
            }
        }
    }

    public final boolean signatures(boolean z) {
        boolean zYandex;
        ArrayList arrayList;
        C6821l c6821l;
        isVip(z);
        if (!this.subs && (c6821l = this.admob) != null) {
            c6821l.ads = false;
            c6821l.amazon();
            if (m3727volatile(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.admob + " as part of execPendingActions for actions " + this.yandex);
            }
            this.admob.purchase(false, false);
            this.yandex.add(0, this.admob);
            Iterator it = this.admob.yandex.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = ((C10937l) it.next()).loadAd;
                if (abstractComponentCallbacksC4411l != null) {
                    abstractComponentCallbacksC4411l.f8950l = false;
                }
            }
            this.admob = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.f26810private;
            ArrayList arrayList3 = this.f26806extends;
            synchronized (this.yandex) {
                if (this.yandex.isEmpty()) {
                    zYandex = false;
                } else {
                    try {
                        int size = this.yandex.size();
                        int i = 0;
                        zYandex = false;
                        while (true) {
                            arrayList = this.yandex;
                            if (i >= size) {
                                break;
                            }
                            zYandex |= ((InterfaceC13362l) arrayList.get(i)).yandex(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.pro.f13177l.removeCallbacks(this.f26805catch);
                    } catch (Throwable th) {
                        this.yandex.clear();
                        this.pro.f13177l.removeCallbacks(this.f26805catch);
                        throw th;
                    }
                }
            }
            if (!zYandex) {
                m3738instanceof();
                license();
                ((HashMap) this.crashlytics.f20462l).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.loadAd = true;
            try {
                m3732continue(this.f26810private, this.f26806extends);
                amazon();
            } catch (Throwable th2) {
                amazon();
                throw th2;
            }
        }
    }

    public final void smaato() {
        boolean z;
        this.f26815volatile = true;
        signatures(true);
        ad();
        C6239l c6239l = this.pro;
        C10038l c10038l = this.crashlytics;
        if (c6239l != null) {
            z = ((C7966l) c10038l.f20465l).billing;
        } else {
            AbstractActivityC16046l abstractActivityC16046l = c6239l.f13181l;
            z = AbstractC2812l.advert(abstractActivityC16046l) ? !abstractActivityC16046l.isChangingConfigurations() : true;
        }
        if (z) {
            Iterator it = this.smaato.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C13746l) it.next()).f26841l.iterator();
                while (it2.hasNext()) {
                    ((C7966l) c10038l.f20465l).amazon((String) it2.next(), false);
                }
            }
        }
        Signature(-1);
        C6239l c6239l2 = this.pro;
        if (c6239l2 != null) {
            c6239l2.f13180l.f28692l.remove(this.ads);
        }
        C6239l c6239l3 = this.pro;
        if (c6239l3 != null) {
            c6239l3.f13180l.f28685l.remove(this.adcel);
        }
        C6239l c6239l4 = this.pro;
        if (c6239l4 != null) {
            c6239l4.f13180l.f28676l.remove(this.subscription);
        }
        C6239l c6239l5 = this.pro;
        if (c6239l5 != null) {
            c6239l5.f13180l.f28693l.remove(this.tapsense);
        }
        C6239l c6239l6 = this.pro;
        if ((c6239l6 != null) && this.advert == null) {
            C10111l c10111l = c6239l6.f13180l.f28677l;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c10111l.f20586l;
            C17591l c17591l = this.Signature;
            copyOnWriteArrayList.remove(c17591l);
            if (((HashMap) c10111l.f20589l).remove(c17591l) == null) {
                ((Runnable) c10111l.f20587l).run();
            } else {
                C18725l.loadAd();
            }
        }
        this.pro = null;
        this.ad = null;
        this.advert = null;
        if (this.mopub != null) {
            this.isPro.amazon();
            this.mopub = null;
        }
        C12840l c12840l = this.applovin;
        if (c12840l != null) {
            c12840l.subs();
            this.appmetrica.subs();
            this.inmobi.subs();
        }
    }

    public final boolean startapp() {
        if (this.license >= 1) {
            for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
                if (abstractComponentCallbacksC4411l != null) {
                    if (!abstractComponentCallbacksC4411l.f8947l ? abstractComponentCallbacksC4411l.f8949l.startapp() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final void m3743static() {
        synchronized (this.yandex) {
            try {
                if (this.yandex.size() == 1) {
                    this.pro.f13177l.removeCallbacks(this.f26805catch);
                    this.pro.f13177l.post(this.f26805catch);
                    m3738instanceof();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m3744strictfp(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (m3727volatile(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC4411l);
        }
        if (abstractComponentCallbacksC4411l.f8947l) {
            return;
        }
        abstractComponentCallbacksC4411l.f8947l = true;
        abstractComponentCallbacksC4411l.f8972l = true ^ abstractComponentCallbacksC4411l.f8972l;
        m3736goto(abstractComponentCallbacksC4411l);
    }

    public final void subs(boolean z) {
        if (z && this.pro != null) {
            m3728abstract(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
            if (abstractComponentCallbacksC4411l != null) {
                abstractComponentCallbacksC4411l.f8968l = true;
                if (z) {
                    abstractComponentCallbacksC4411l.f8949l.subs(true);
                }
            }
        }
    }

    public final void subscription(boolean z) {
        if (z && this.pro != null) {
            m3728abstract(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
            if (abstractComponentCallbacksC4411l != null && z) {
                abstractComponentCallbacksC4411l.f8949l.subscription(true);
            }
        }
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m3745switch(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (m3727volatile(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC4411l + " nesting=" + abstractComponentCallbacksC4411l.f8966l);
        }
        boolean zRemoteconfig = abstractComponentCallbacksC4411l.remoteconfig();
        if (abstractComponentCallbacksC4411l.f8969l && zRemoteconfig) {
            return;
        }
        C10038l c10038l = this.crashlytics;
        synchronized (((ArrayList) c10038l.f20463l)) {
            ((ArrayList) c10038l.f20463l).remove(abstractComponentCallbacksC4411l);
        }
        abstractComponentCallbacksC4411l.f8984l = false;
        if (m3725native(abstractComponentCallbacksC4411l)) {
            this.f26809package = true;
        }
        abstractComponentCallbacksC4411l.f8980l = true;
        m3736goto(abstractComponentCallbacksC4411l);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C6162l m3746synchronized() {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.advert;
        return abstractComponentCallbacksC4411l != null ? abstractComponentCallbacksC4411l.f8955l.m3746synchronized() : this.premium;
    }

    public final boolean tapsense() {
        if (this.license < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
            if (abstractComponentCallbacksC4411l != null && m3723extends(abstractComponentCallbacksC4411l)) {
                if (!abstractComponentCallbacksC4411l.f8947l ? abstractComponentCallbacksC4411l.f8949l.tapsense() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m3747throw(int i, boolean z) {
        C6239l c6239l;
        if (this.pro == null && i != -1) {
            C8339l.smaato("No activity");
            return;
        }
        if (z || i != this.license) {
            this.license = i;
            C10038l c10038l = this.crashlytics;
            HashMap map = (HashMap) c10038l.f20462l;
            Iterator it = ((ArrayList) c10038l.f20463l).iterator();
            while (it.hasNext()) {
                C2872l c2872l = (C2872l) map.get(((AbstractComponentCallbacksC4411l) it.next()).f8974l);
                if (c2872l != null) {
                    c2872l.isPro();
                }
            }
            for (C2872l c2872l2 : map.values()) {
                if (c2872l2 != null) {
                    c2872l2.isPro();
                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c2872l2.crashlytics;
                    if (abstractComponentCallbacksC4411l.f8980l && !abstractComponentCallbacksC4411l.remoteconfig()) {
                        c10038l.m2837break(c2872l2);
                    }
                }
            }
            m3737import();
            if (this.f26809package && (c6239l = this.pro) != null && this.license == 7) {
                c6239l.f13180l.invalidateOptionsMenu();
                this.f26809package = false;
            }
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final ViewGroup m3748throws(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        ViewGroup viewGroup = abstractComponentCallbacksC4411l.f8981l;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC4411l.f8970l <= 0 || !this.ad.subs()) {
            return null;
        }
        View viewAdmob = this.ad.admob(abstractComponentCallbacksC4411l.f8970l);
        if (viewAdmob instanceof ViewGroup) {
            return (ViewGroup) viewAdmob;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.advert;
        if (abstractComponentCallbacksC4411l != null) {
            sb.append(abstractComponentCallbacksC4411l.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.advert)));
            sb.append("}");
        } else {
            C6239l c6239l = this.pro;
            if (c6239l != null) {
                sb.append(c6239l.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.pro)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void vip(boolean z) {
        if (z && this.pro != null) {
            m3728abstract(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : this.crashlytics.m2858public()) {
            if (abstractComponentCallbacksC4411l != null && z) {
                abstractComponentCallbacksC4411l.f8949l.vip(true);
            }
        }
    }

    public final C2872l yandex(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        String str = abstractComponentCallbacksC4411l.f8958l;
        if (str != null) {
            AbstractC7311l.crashlytics(abstractComponentCallbacksC4411l, str);
        }
        if (m3727volatile(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC4411l);
        }
        C2872l c2872lMopub = mopub(abstractComponentCallbacksC4411l);
        abstractComponentCallbacksC4411l.f8955l = this;
        C10038l c10038l = this.crashlytics;
        c10038l.m2867try(c2872lMopub);
        if (!abstractComponentCallbacksC4411l.f8969l) {
            c10038l.m2865throw(abstractComponentCallbacksC4411l);
            abstractComponentCallbacksC4411l.f8980l = false;
            abstractComponentCallbacksC4411l.f8972l = false;
            if (m3725native(abstractComponentCallbacksC4411l)) {
                this.f26809package = true;
            }
        }
        return c2872lMopub;
    }
}
