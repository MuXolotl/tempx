package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17886l extends AbstractC14971l implements InterfaceC11189l, InterfaceC13202l, InterfaceC16031l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C17150l f34839l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f34840l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C13623l f34841l;

    public AbstractC17886l(C17150l c17150l, C13623l c13623l) {
        this.f34841l = c13623l;
        this.f34839l = c17150l;
    }

    @Override // defpackage.InterfaceC13202l
    public final void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        if (enumC9065l == EnumC9065l.f18653l) {
            List list = c9185l.yandex;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (mo2000l(((C15730l) list.get(i)).subs)) {
                    int i2 = c9185l.billing;
                    if (i2 == 4) {
                        this.f34840l = true;
                        m4440l();
                        return;
                    } else {
                        if (i2 == 5) {
                            m4438l();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void m4438l() {
        if (this.f34840l) {
            this.f34840l = false;
            if (this.f29462l) {
                C10700l c10700l = new C10700l();
                AbstractC13359l.admob(this, new C15121l(c10700l, 1));
                AbstractC17886l abstractC17886l = (AbstractC17886l) c10700l.f21708l;
                if (abstractC17886l != null) {
                    abstractC17886l.m4439l();
                } else {
                    mo1999l(null);
                }
            }
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        m4438l();
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m4439l() {
        C17150l c17150l;
        C10700l c10700l = new C10700l();
        AbstractC13359l.admob(this, new C11177l(c10700l));
        AbstractC17886l abstractC17886l = (AbstractC17886l) c10700l.f21708l;
        if (abstractC17886l == null || (c17150l = abstractC17886l.f34839l) == null) {
            c17150l = this.f34839l;
        }
        mo1999l(c17150l);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo1495l() {
        mo1500throw();
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final void m4440l() {
        C9122l c9122l = new C9122l();
        c9122l.f18750l = true;
        AbstractC13359l.isPro(this, new C3006l(21, c9122l));
        if (c9122l.f18750l) {
            m4439l();
        }
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final /* synthetic */ boolean mo1497l() {
        return false;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final void mo1498l() {
        mo1500throw();
    }

    /* JADX INFO: renamed from: lؘٗۦ */
    public abstract void mo1999l(InterfaceC11325l interfaceC11325l);

    /* JADX INFO: renamed from: l٘ۦۢ */
    public abstract boolean mo2000l(int i);

    @Override // defpackage.InterfaceC13202l
    public final long tapsense() {
        if (this.f34841l == null) {
            return AbstractC10549l.yandex;
        }
        InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
        int i = AbstractC10549l.loadAd;
        return C6760l.startapp(interfaceC13490l.mo870l(10.0f), interfaceC13490l.mo870l(40.0f), interfaceC13490l.mo870l(10.0f), interfaceC13490l.mo870l(40.0f));
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: throw */
    public final void mo1500throw() {
        m4438l();
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: class */
    public final /* synthetic */ void mo1493class() {
    }
}
