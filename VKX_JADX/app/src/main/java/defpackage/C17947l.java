package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٕ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17947l implements InterfaceC3270l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16701l f34928l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ ServiceC16415l f34930l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f34929l = new Object();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f34927l = new ArrayList();

    public C17947l(ServiceC16415l serviceC16415l, C16701l c16701l) {
        this.f34930l = serviceC16415l;
        this.f34928l = c16701l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17947l) {
            return Objects.equals(this.f34928l, ((C17947l) obj).f34928l);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34928l);
    }

    @Override // defpackage.InterfaceC3270l
    public final void metrica(int i, C17425l c17425l, String str) {
        Bundle bundle = c17425l != null ? c17425l.yandex : null;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        C16701l c16701l = this.f34928l;
        if (c16701l == null) {
            C8339l.metrica("remoteUserInfo cannot be null in notifyChildrenChanged");
            return;
        }
        if (str == null) {
            C8339l.metrica("parentId cannot be null in notifyChildrenChanged");
        } else {
            if (bundle2 == null) {
                C8339l.metrica("options cannot be null in notifyChildrenChanged");
                return;
            }
            C12014l c12014l = this.f34930l.f32108l;
            c12014l.getClass();
            ((ServiceC16415l) c12014l.f23943l).f32105l.post(new RunnableC16843l(c12014l, c16701l, str, bundle2, 1));
        }
    }

    @Override // defpackage.InterfaceC3270l
    public final void subs(int i, C17425l c17425l, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34929l) {
            try {
                for (int size = this.f34927l.size() - 1; size >= 0; size--) {
                    C11814l c11814l = (C11814l) this.f34927l.get(size);
                    if (Objects.equals(this.f34928l, c11814l.loadAd) && c11814l.crashlytics.equals(str)) {
                        arrayList.add(c11814l);
                        this.f34927l.remove(size);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AbstractC15323l.m3966final(this.f34930l.f32112l.smaato, new RunnableC12388l(this, arrayList, 12));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void yandex() {
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void loadAd(int i) {
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void firebase(int i, C9201l c9201l) {
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void isPro(int i, List list) {
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void purchase(int i, C12417l c12417l) {
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void remoteconfig(int i, C5159l c5159l) {
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void smaato(int i, C16616l c16616l) {
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void admob(int i, int i2, int i3) {
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void adcel(int i, C9009l c9009l, boolean z, boolean z2, int i2) {
    }

    @Override // defpackage.InterfaceC3270l
    public final /* synthetic */ void startapp(int i, C1908l c1908l, C16616l c16616l, boolean z, boolean z2) {
    }
}
