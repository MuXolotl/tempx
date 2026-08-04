package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؙٗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16815l extends AbstractC4829l {
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public C16815l(List list) {
        this.yandex = 0;
        this.loadAd = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) it.next();
            if (!(abstractC4829l instanceof C14737l)) {
                ((ArrayList) this.loadAd).add(abstractC4829l);
            }
        }
    }

    @Override // defpackage.AbstractC4829l
    public void amazon(int i, int i2) {
        switch (this.yandex) {
            case 0:
                Iterator it = ((ArrayList) this.loadAd).iterator();
                while (it.hasNext()) {
                    ((AbstractC4829l) it.next()).amazon(i, i2);
                }
                break;
        }
    }

    @Override // defpackage.AbstractC4829l
    public void crashlytics(int i, C18450l c18450l) {
        switch (this.yandex) {
            case 0:
                Iterator it = ((ArrayList) this.loadAd).iterator();
                while (it.hasNext()) {
                    ((AbstractC4829l) it.next()).crashlytics(i, c18450l);
                }
                break;
        }
    }

    @Override // defpackage.AbstractC4829l
    public final void loadAd(int i, InterfaceC7299l interfaceC7299l) {
        switch (this.yandex) {
            case 0:
                Iterator it = ((ArrayList) this.loadAd).iterator();
                while (it.hasNext()) {
                    ((AbstractC4829l) it.next()).loadAd(i, interfaceC7299l);
                }
                return;
            case 1:
                C9723l c9723l = (C9723l) this.loadAd;
                synchronized (c9723l.f19829l) {
                    try {
                        if (c9723l.f19831l) {
                            return;
                        }
                        c9723l.f19834l.put(interfaceC7299l.crashlytics(), new C15483l(interfaceC7299l));
                        c9723l.mopub();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                C2091l c2091l = (C2091l) ((WeakReference) this.loadAd).get();
                if (c2091l != null) {
                    Iterator it2 = c2091l.f4686l.iterator();
                    while (it2.hasNext()) {
                        C10814l c10814l = ((AbstractC6896l) it2.next()).adcel;
                        Iterator it3 = c10814l.mopub.amazon.iterator();
                        while (it3.hasNext()) {
                            ((AbstractC4829l) it3.next()).loadAd(i, new C8043l(-1L, interfaceC7299l, c10814l.mopub.purchase));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC4829l
    public void purchase(int i) {
        switch (this.yandex) {
            case 0:
                Iterator it = ((ArrayList) this.loadAd).iterator();
                while (it.hasNext()) {
                    ((AbstractC4829l) it.next()).purchase(i);
                }
                break;
        }
    }

    @Override // defpackage.AbstractC4829l
    public void yandex(int i) {
        switch (this.yandex) {
            case 0:
                Iterator it = ((ArrayList) this.loadAd).iterator();
                while (it.hasNext()) {
                    ((AbstractC4829l) it.next()).yandex(i);
                }
                break;
        }
    }

    public C16815l(C2091l c2091l) {
        this.yandex = 2;
        this.loadAd = new WeakReference(c2091l);
    }

    public C16815l(C9723l c9723l) {
        this.yandex = 1;
        this.loadAd = c9723l;
    }
}
