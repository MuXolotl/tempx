package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lًٌؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7754l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C6499l f16264l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3726l f16265l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16266l;

    public /* synthetic */ RunnableC7754l(C3726l c3726l, C6499l c6499l, int i) {
        this.f16266l = i;
        this.f16265l = c3726l;
        this.f16264l = c6499l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set setUnmodifiableSet;
        switch (this.f16266l) {
            case 0:
                C3726l c3726l = this.f16265l;
                C6499l c6499l = this.f16264l;
                if (c3726l.metrica()) {
                    return;
                }
                InterfaceC3270l interfaceC3270l = c6499l.amazon;
                interfaceC3270l.getClass();
                synchronized (c3726l) {
                    try {
                        C2497l c2497l = c3726l.f7787synchronized;
                        Collection collection = (Collection) c2497l.f4808l.remove(interfaceC3270l);
                        if (collection == null) {
                            setUnmodifiableSet = Collections.EMPTY_SET;
                        } else {
                            C17501l c17501lAmazon = C17501l.amazon(c2497l.f5295l);
                            c17501lAmazon.addAll(collection);
                            c2497l.f4809l -= collection.size();
                            collection.clear();
                            setUnmodifiableSet = DesugarCollections.unmodifiableSet(c17501lAmazon);
                        }
                        Iterator it = setUnmodifiableSet.iterator();
                        while (it.hasNext()) {
                            c3726l.f7785package.remove((String) it.next(), c6499l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (c3726l.signatures) {
                    if (C3726l.startapp(c6499l)) {
                        return;
                    }
                    if (c3726l.vip(c6499l)) {
                        c3726l.signatures = false;
                    }
                }
                c3726l.purchase.getClass();
                return;
            case 1:
                this.f16265l.mopub.m1623l(this.f16264l, RecyclerView.UNDEFINED_DURATION, 9, BinderC4841l.m1621l(new C6541l(6)));
                return;
            case 2:
                this.f16265l.mopub.m1623l(this.f16264l, RecyclerView.UNDEFINED_DURATION, 7, BinderC4841l.m1621l(new C6541l(2)));
                return;
            case 3:
                this.f16265l.mopub.m1623l(this.f16264l, RecyclerView.UNDEFINED_DURATION, 12, BinderC4841l.m1621l(new C6541l(5)));
                return;
            case 4:
                this.f16265l.mopub.m1623l(this.f16264l, RecyclerView.UNDEFINED_DURATION, 11, BinderC4841l.m1621l(new C6541l(1)));
                return;
            case 5:
                this.f16265l.mopub.m1623l(this.f16264l, RecyclerView.UNDEFINED_DURATION, 3, BinderC4841l.m1621l(new C6541l(10)));
                return;
            case 6:
                this.f16265l.mopub.m1623l(this.f16264l, RecyclerView.UNDEFINED_DURATION, 1, BinderC4841l.m1621l(new C4875l(28)));
                return;
            case 7:
                this.f16265l.mopub.m1625l(this.f16264l, RecyclerView.UNDEFINED_DURATION);
                return;
            case 8:
                this.f16265l.mopub.m1625l(this.f16264l, RecyclerView.UNDEFINED_DURATION);
                return;
            default:
                this.f16265l.mopub.m1623l(this.f16264l, RecyclerView.UNDEFINED_DURATION, 1, BinderC4841l.m1621l(new C4875l(28)));
                return;
        }
    }
}
