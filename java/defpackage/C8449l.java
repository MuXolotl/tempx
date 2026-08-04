package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8449l extends AbstractC14971l implements InterfaceC11189l, InterfaceC18545l, InterfaceC15641l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C8449l f17455l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public InterfaceC18545l f17456l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final Function1 f17457l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public long f17458l;

    public C8449l(C2977l c2977l, int i) {
        this.f17457l = (i & 2) != 0 ? null : c2977l;
        this.f17458l = 0L;
    }

    @Override // defpackage.InterfaceC4325l
    public final void Signature(long j) {
        this.f17458l = j;
    }

    @Override // defpackage.InterfaceC11189l
    public final Object adcel() {
        return C1083l.f2993l;
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void mo2321implements(C1323l c1323l) {
        InterfaceC18545l interfaceC18545l = this.f17456l;
        if (interfaceC18545l != null) {
            interfaceC18545l.mo2321implements(c1323l);
            return;
        }
        C8449l c8449l = this.f17455l;
        if (c8449l != null) {
            c8449l.mo2321implements(c1323l);
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        this.f17456l = null;
        this.f17455l = null;
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public final boolean mo2322l(C1323l c1323l) {
        C8449l c8449l = this.f17455l;
        if (c8449l != null) {
            return c8449l.mo2322l(c1323l);
        }
        InterfaceC18545l interfaceC18545l = this.f17456l;
        if (interfaceC18545l != null) {
            return interfaceC18545l.mo2322l(c1323l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void mo2323l(C1323l c1323l) {
        InterfaceC11189l interfaceC11189l;
        C8449l c8449l;
        C8449l c8449l2 = this.f17455l;
        if (c8449l2 == null || !AbstractC6616l.yandex(c8449l2, AbstractC0837l.loadAd(c1323l))) {
            if (this.f29454l.f29462l) {
                C10700l c10700l = new C10700l();
                AbstractC13359l.isPro(this, new C12683l(c10700l, this, c1323l, 4));
                interfaceC11189l = (InterfaceC11189l) c10700l.f21708l;
            } else {
                interfaceC11189l = null;
            }
            c8449l = (C8449l) interfaceC11189l;
        } else {
            c8449l = c8449l2;
        }
        if (c8449l != null && c8449l2 == null) {
            c8449l.pro(c1323l);
            c8449l.mo2323l(c1323l);
            InterfaceC18545l interfaceC18545l = this.f17456l;
            if (interfaceC18545l != null) {
                interfaceC18545l.mo2325public(c1323l);
            }
        } else if (c8449l == null && c8449l2 != null) {
            InterfaceC18545l interfaceC18545l2 = this.f17456l;
            if (interfaceC18545l2 != null) {
                interfaceC18545l2.pro(c1323l);
                interfaceC18545l2.mo2323l(c1323l);
            }
            c8449l2.mo2325public(c1323l);
        } else if (!AbstractC8576l.yandex(c8449l, c8449l2)) {
            if (c8449l != null) {
                c8449l.pro(c1323l);
                c8449l.mo2323l(c1323l);
            }
            if (c8449l2 != null) {
                c8449l2.mo2325public(c1323l);
            }
        } else if (c8449l != null) {
            c8449l.mo2323l(c1323l);
        } else {
            InterfaceC18545l interfaceC18545l3 = this.f17456l;
            if (interfaceC18545l3 != null) {
                interfaceC18545l3.mo2323l(c1323l);
            }
        }
        this.f17455l = c8449l;
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void mo2324package(C1323l c1323l) {
        C3006l c3006l = new C3006l(15, c1323l);
        if (c3006l.invoke(this) != EnumC8647l.f17806l) {
            return;
        }
        AbstractC13359l.isPro(this, c3006l);
    }

    @Override // defpackage.InterfaceC18545l
    public final void pro(C1323l c1323l) {
        InterfaceC18545l interfaceC18545l = this.f17456l;
        if (interfaceC18545l != null) {
            interfaceC18545l.pro(c1323l);
            return;
        }
        C8449l c8449l = this.f17455l;
        if (c8449l != null) {
            c8449l.pro(c1323l);
        }
    }

    @Override // defpackage.InterfaceC18545l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void mo2325public(C1323l c1323l) {
        InterfaceC18545l interfaceC18545l = this.f17456l;
        if (interfaceC18545l != null) {
            interfaceC18545l.mo2325public(c1323l);
        }
        C8449l c8449l = this.f17455l;
        if (c8449l != null) {
            c8449l.mo2325public(c1323l);
        }
        this.f17455l = null;
    }

    @Override // defpackage.InterfaceC15641l
    public final /* synthetic */ void startapp(InterfaceC18212l interfaceC18212l) {
    }
}
