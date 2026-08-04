package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lٕ۠ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15974l {
    public C7518l purchase;
    public final Object yandex = new Object();
    public final HashMap loadAd = new HashMap();
    public final HashMap crashlytics = new HashMap();
    public final ArrayDeque amazon = new ArrayDeque();

    public final void admob(InterfaceC3177l interfaceC3177l) {
        synchronized (this.yandex) {
            try {
                if (purchase(interfaceC3177l)) {
                    if (this.amazon.isEmpty()) {
                        this.amazon.push(interfaceC3177l);
                    } else {
                        C7518l c7518l = this.purchase;
                        if (c7518l == null || c7518l.loadAd() != 2) {
                            InterfaceC3177l interfaceC3177l2 = (InterfaceC3177l) this.amazon.peek();
                            if (!interfaceC3177l.equals(interfaceC3177l2)) {
                                isPro(interfaceC3177l2);
                                this.amazon.remove(interfaceC3177l);
                                this.amazon.push(interfaceC3177l);
                            }
                        }
                    }
                    metrica(interfaceC3177l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Collection amazon() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.yandex) {
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(this.loadAd.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final void billing(InterfaceC3177l interfaceC3177l) {
        HashMap map;
        C16214l c16214l;
        C4150l c4150lCrashlytics = crashlytics(interfaceC3177l);
        if (c4150lCrashlytics == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set set = (Set) this.crashlytics.get(c4150lCrashlytics);
        Objects.requireNonNull(set);
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.loadAd;
            if (!zHasNext) {
                break;
            }
            C7381l c7381l = (C7381l) it.next();
            C7930l c7930l = (C7930l) map.get(c7381l);
            if (c7930l != null) {
                C11903l c11903l = c7930l.f16512l;
                if (c11903l.f23734l.f31731l.firebase() || ((c16214l = c11903l.f23733l) != null && c16214l.f31731l.firebase())) {
                    hashSet.add(c7381l);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        AbstractC5088l.tapsense("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C7930l c7930l2 = (C7930l) map.get((C7381l) it2.next());
            Objects.requireNonNull(c7930l2);
            remoteconfig(c7930l2);
        }
    }

    public final C4150l crashlytics(InterfaceC3177l interfaceC3177l) {
        synchronized (this.yandex) {
            try {
                for (C4150l c4150l : this.crashlytics.keySet()) {
                    if (interfaceC3177l.equals(c4150l.f8516l)) {
                        return c4150l;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void firebase(C1869l c1869l, HashSet hashSet) {
        Set<C7381l> setKeySet = hashSet;
        synchronized (this.yandex) {
            if (hashSet == null) {
                try {
                    setKeySet = this.loadAd.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (C7381l c7381l : setKeySet) {
                if (this.loadAd.containsKey(c7381l)) {
                    C7930l c7930l = (C7930l) this.loadAd.get(c7381l);
                    boolean zIsEmpty = c7930l.tapsense().isEmpty();
                    c7930l.ad(c1869l);
                    if (!zIsEmpty && c7930l.tapsense().isEmpty()) {
                        subs(c7930l.subscription());
                    }
                }
            }
        }
    }

    public final void isPro(InterfaceC3177l interfaceC3177l) {
        synchronized (this.yandex) {
            try {
                C4150l c4150lCrashlytics = crashlytics(interfaceC3177l);
                if (c4150lCrashlytics == null) {
                    return;
                }
                Iterator it = ((Set) this.crashlytics.get(c4150lCrashlytics)).iterator();
                while (it.hasNext()) {
                    C7930l c7930l = (C7930l) this.loadAd.get((C7381l) it.next());
                    c7930l.getClass();
                    c7930l.pro();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C7930l loadAd(InterfaceC3177l interfaceC3177l, C11903l c11903l, C17485l c17485l) {
        synchronized (this.yandex) {
            try {
                AbstractC5641l.loadAd(this.loadAd.get(new C7381l(System.identityHashCode(interfaceC3177l), c11903l.f23740l)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                C7930l c7930l = new C7930l(interfaceC3177l, c11903l, c17485l);
                if (((ArrayList) c11903l.premium()).isEmpty()) {
                    c7930l.pro();
                }
                if (((C5268l) interfaceC3177l.loadAd()).subs == EnumC8981l.f18522l) {
                    return c7930l;
                }
                mopub(c7930l);
                return c7930l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void metrica(InterfaceC3177l interfaceC3177l) {
        synchronized (this.yandex) {
            try {
                Iterator it = ((Set) this.crashlytics.get(crashlytics(interfaceC3177l))).iterator();
                while (it.hasNext()) {
                    C7930l c7930l = (C7930l) this.loadAd.get((C7381l) it.next());
                    c7930l.getClass();
                    if (!c7930l.tapsense().isEmpty()) {
                        c7930l.isVip();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void mopub(C7930l c7930l) {
        synchronized (this.yandex) {
            try {
                InterfaceC3177l interfaceC3177lSubscription = c7930l.subscription();
                C7381l c7381l = new C7381l(System.identityHashCode(interfaceC3177lSubscription), c7930l.f16512l.f23740l);
                C4150l c4150lCrashlytics = crashlytics(interfaceC3177lSubscription);
                Set hashSet = c4150lCrashlytics != null ? (Set) this.crashlytics.get(c4150lCrashlytics) : new HashSet();
                hashSet.add(c7381l);
                this.loadAd.put(c7381l, c7930l);
                if (c4150lCrashlytics == null) {
                    C4150l c4150l = new C4150l(interfaceC3177lSubscription, this);
                    this.crashlytics.put(c4150l, hashSet);
                    interfaceC3177lSubscription.loadAd().yandex(c4150l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean purchase(InterfaceC3177l interfaceC3177l) {
        synchronized (this.yandex) {
            try {
                C4150l c4150lCrashlytics = crashlytics(interfaceC3177l);
                if (c4150lCrashlytics == null) {
                    return false;
                }
                Iterator it = ((Set) this.crashlytics.get(c4150lCrashlytics)).iterator();
                while (it.hasNext()) {
                    C7930l c7930l = (C7930l) this.loadAd.get((C7381l) it.next());
                    c7930l.getClass();
                    if (!c7930l.tapsense().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void remoteconfig(C7930l c7930l) {
        synchronized (this.yandex) {
            try {
                InterfaceC3177l interfaceC3177lSubscription = c7930l.subscription();
                C7381l c7381l = new C7381l(System.identityHashCode(interfaceC3177lSubscription), c7930l.f16512l.f23740l);
                this.loadAd.remove(c7381l);
                HashSet hashSet = new HashSet();
                for (C4150l c4150l : this.crashlytics.keySet()) {
                    if (interfaceC3177lSubscription.equals(c4150l.f8516l)) {
                        Set set = (Set) this.crashlytics.get(c4150l);
                        set.remove(c7381l);
                        if (set.isEmpty()) {
                            hashSet.add(c4150l.f8516l);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    vip((InterfaceC3177l) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void smaato(HashSet hashSet) {
        Set setKeySet = hashSet;
        synchronized (this.yandex) {
            if (hashSet == null) {
                try {
                    setKeySet = this.loadAd.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                C7930l c7930l = (C7930l) this.loadAd.get((C7381l) it.next());
                if (c7930l != null) {
                    c7930l.advert();
                    subs(c7930l.subscription());
                }
            }
        }
    }

    public final void subs(InterfaceC3177l interfaceC3177l) {
        synchronized (this.yandex) {
            try {
                this.amazon.remove(interfaceC3177l);
                isPro(interfaceC3177l);
                if (!this.amazon.isEmpty()) {
                    metrica((InterfaceC3177l) this.amazon.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip(InterfaceC3177l interfaceC3177l) {
        synchronized (this.yandex) {
            try {
                C4150l c4150lCrashlytics = crashlytics(interfaceC3177l);
                if (c4150lCrashlytics == null) {
                    return;
                }
                subs(interfaceC3177l);
                Iterator it = ((Set) this.crashlytics.get(c4150lCrashlytics)).iterator();
                while (it.hasNext()) {
                    this.loadAd.remove((C7381l) it.next());
                }
                this.crashlytics.remove(c4150lCrashlytics);
                c4150lCrashlytics.f8516l.loadAd().loadAd(c4150lCrashlytics);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void yandex(C7930l c7930l, C1869l c1869l, C7518l c7518l) {
        synchronized (this.yandex) {
            try {
                AbstractC5641l.yandex(!c1869l.billing.isEmpty());
                this.purchase = c7518l;
                InterfaceC3177l interfaceC3177lSubscription = c7930l.subscription();
                billing(interfaceC3177lSubscription);
                C4150l c4150lCrashlytics = crashlytics(interfaceC3177lSubscription);
                if (c4150lCrashlytics == null) {
                    return;
                }
                Set set = (Set) this.crashlytics.get(c4150lCrashlytics);
                C7518l c7518l2 = this.purchase;
                if (c7518l2 == null || c7518l2.loadAd() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        C7930l c7930l2 = (C7930l) this.loadAd.get((C7381l) it.next());
                        c7930l2.getClass();
                        if (!c7930l2.equals(c7930l) && !c7930l2.tapsense().isEmpty()) {
                            if (c7930l2.license() || c1869l.loadAd()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            c7930l2.advert();
                        }
                    }
                }
                try {
                    c7930l.crashlytics(c1869l);
                    if (((C5268l) interfaceC3177lSubscription.loadAd()).subs.yandex(EnumC8981l.f18524l)) {
                        admob(interfaceC3177lSubscription);
                    }
                } catch (C14687l e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
