package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٟؕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3800l implements InterfaceC2262l, InterfaceC6752l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C4639l f7910l = new C4639l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile InterfaceC12932l f7911l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C3800l f7912l = this;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12932l f7913l;

    public C3800l(InterfaceC12932l interfaceC12932l) {
        this.f7913l = interfaceC12932l;
    }

    public final void amazon() {
        synchronized (this.f7912l) {
            try {
                InterfaceC12932l interfaceC12932l = this.f7911l;
                if (interfaceC12932l == null) {
                    this.f7911l = f7910l;
                } else {
                    AbstractC11174l.crashlytics(interfaceC12932l, new C10029l(0));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        amazon();
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        InterfaceC12932l interfaceC12932lMo246l;
        InterfaceC12932l interfaceC12932l = this.f7911l;
        if (interfaceC12932l != null && interfaceC12932l != f7910l) {
            return interfaceC12932l;
        }
        C13154l c13154l = (C13154l) this.f7913l.mo245l(C13154l.f25749l);
        InterfaceC12932l c16909l = c13154l != null ? new C16909l(c13154l, this) : C17218l.f33421l;
        synchronized (this.f7912l) {
            try {
                interfaceC12932lMo246l = this.f7911l;
                if (interfaceC12932lMo246l == null) {
                    InterfaceC12932l interfaceC12932l2 = this.f7913l;
                    interfaceC12932lMo246l = interfaceC12932l2.mo246l(new C0462l((InterfaceC7042l) interfaceC12932l2.mo245l(C1083l.f2996l))).mo246l(C17218l.f33421l).mo246l(c16909l);
                } else if (interfaceC12932lMo246l == f7910l) {
                    InterfaceC12932l interfaceC12932l3 = this.f7913l;
                    C0462l c0462l = new C0462l((InterfaceC7042l) interfaceC12932l3.mo245l(C1083l.f2996l));
                    c0462l.pro(new C10029l(0));
                    interfaceC12932lMo246l = interfaceC12932l3.mo246l(c0462l).mo246l(C17218l.f33421l).mo246l(c16909l);
                }
                this.f7911l = interfaceC12932lMo246l;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC12932lMo246l;
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
        amazon();
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
    }
}
