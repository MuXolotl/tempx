package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٍُْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9522l extends AbstractC1281l implements InterfaceC13847l, InterfaceC10607l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C5557l f19407l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C6561l f19408l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public List f19409l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public AbstractC15211l f19410l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public List f19411l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C1512l f19412l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public AbstractC15211l f19413l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C14965l f19414l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C12021l f19415l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C16412l f19416l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final InterfaceC3588l f19417l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final InterfaceC8850l f19418l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public AbstractC15211l f19419l;

    public C9522l(C16412l c16412l, InterfaceC8371l interfaceC8371l, InterfaceC3841l interfaceC3841l, C3498l c3498l, C6561l c6561l, C1512l c1512l, InterfaceC3588l interfaceC3588l, C14965l c14965l, C5557l c5557l, InterfaceC8850l interfaceC8850l) {
        super(interfaceC8371l, interfaceC3841l, c3498l, InterfaceC5706l.f12087l);
        this.f19416l = c16412l;
        this.f19408l = c6561l;
        c16412l.yandex(new C7646l(0, this));
        this.f19415l = new C12021l(this);
        this.f19412l = c1512l;
        this.f19417l = interfaceC3588l;
        this.f19414l = c14965l;
        this.f19407l = c5557l;
        this.f19418l = interfaceC8850l;
    }

    @Override // defpackage.InterfaceC15234l
    public final AbstractC15211l ad() {
        AbstractC15211l abstractC15211l = this.f19419l;
        if (abstractC15211l == null) {
            return null;
        }
        return abstractC15211l;
    }

    @Override // defpackage.InterfaceC5436l, defpackage.InterfaceC10389l
    public final C6561l admob() {
        return this.f19408l;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return false;
    }

    @Override // defpackage.InterfaceC13847l
    /* JADX INFO: renamed from: goto */
    public final C14965l mo678goto() {
        return this.f19414l;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.smaato(this, obj);
    }

    @Override // defpackage.InterfaceC10900l
    public final InterfaceC10233l isPro(C2201l c2201l) {
        if (c2201l.yandex.purchase()) {
            return this;
        }
        C9522l c9522l = new C9522l(this.f19416l, Signature(), getAnnotations(), getName(), this.f19408l, this.f19412l, this.f19417l, this.f19414l, this.f19407l, this.f19418l);
        List list = this.f19409l;
        if (list == null) {
            list = null;
        }
        AbstractC15211l abstractC15211l = this.f19413l;
        if (abstractC15211l == null) {
            abstractC15211l = null;
        }
        AbstractC15211l abstractC15211lSubs = AbstractC6419l.subs(c2201l.billing(1, abstractC15211l));
        AbstractC15211l abstractC15211l2 = this.f19410l;
        c9522l.m2676l(list, abstractC15211lSubs, AbstractC6419l.subs(c2201l.billing(1, abstractC15211l2 != null ? abstractC15211l2 : null)));
        return c9522l;
    }

    @Override // defpackage.InterfaceC10607l
    public final List isVip() {
        List list = this.f19409l;
        if (list == null) {
            return null;
        }
        return list;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void m2676l(List list, AbstractC15211l abstractC15211l, AbstractC15211l abstractC15211l2) {
        InterfaceC7637l interfaceC7637lMo2890l;
        AbstractC15211l abstractC15211lTapsense;
        this.f19409l = list;
        this.f19413l = abstractC15211l;
        this.f19410l = abstractC15211l2;
        this.f19411l = AbstractC17653l.loadAd(this);
        InterfaceC17477l interfaceC17477lM2677l = m2677l();
        if (interfaceC17477lM2677l == null || (interfaceC7637lMo2890l = interfaceC17477lM2677l.mo2890l()) == null) {
            interfaceC7637lMo2890l = C3198l.loadAd;
        }
        InterfaceC7637l interfaceC7637l = interfaceC7637lMo2890l;
        C2911l c2911l = new C2911l(2, this);
        C14487l c14487l = AbstractC12008l.yandex;
        if (C8741l.purchase(this)) {
            abstractC15211lTapsense = C8741l.loadAd(EnumC5123l.f11147l, toString());
        } else {
            InterfaceC1925l interfaceC1925lMetrica = metrica();
            if (interfaceC1925lMetrica == null) {
                AbstractC12008l.yandex(12);
                throw null;
            }
            List listAmazon = AbstractC12008l.amazon(((C12021l) interfaceC1925lMetrica).getParameters());
            C16017l.f31395l.getClass();
            abstractC15211lTapsense = AbstractC3605l.tapsense(C16017l.f31394l, interfaceC1925lMetrica, listAmazon, false, interfaceC7637l, c2911l);
        }
        this.f19419l = abstractC15211lTapsense;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final InterfaceC17477l m2677l() {
        AbstractC15211l abstractC15211l = this.f19410l;
        if (abstractC15211l == null) {
            abstractC15211l = null;
        }
        if (!AbstractC11748l.subs(abstractC15211l)) {
            AbstractC15211l abstractC15211l2 = this.f19410l;
            if (abstractC15211l2 == null) {
                abstractC15211l2 = null;
            }
            InterfaceC15234l interfaceC15234lPro = abstractC15211l2.mo1339native().pro();
            if (interfaceC15234lPro instanceof InterfaceC17477l) {
                return (InterfaceC17477l) interfaceC15234lPro;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final boolean mo754l() {
        return false;
    }

    @Override // defpackage.InterfaceC15234l
    public final InterfaceC1925l metrica() {
        return this.f19415l;
    }

    @Override // defpackage.InterfaceC13847l
    /* JADX INFO: renamed from: private */
    public final AbstractC14080l mo682private() {
        return this.f19412l;
    }

    @Override // defpackage.InterfaceC10607l
    public final boolean subscription() {
        AbstractC15211l abstractC15211l = this.f19413l;
        if (abstractC15211l == null) {
            abstractC15211l = null;
        }
        return AbstractC12008l.crashlytics(abstractC15211l, new C6238l(4, this), null);
    }

    @Override // defpackage.InterfaceC13847l
    /* JADX INFO: renamed from: this */
    public final InterfaceC3588l mo683this() {
        return this.f19417l;
    }

    @Override // defpackage.AbstractC2775l, defpackage.Cgoto
    public final String toString() {
        return "typealias " + getName().loadAd();
    }

    @Override // defpackage.InterfaceC13847l
    /* JADX INFO: renamed from: try */
    public final InterfaceC8850l mo684try() {
        return this.f19418l;
    }

    @Override // defpackage.InterfaceC5436l
    public final boolean vip() {
        return false;
    }

    @Override // defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC8371l mo864l() {
        return this;
    }

    @Override // defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC15234l mo864l() {
        return this;
    }

    @Override // defpackage.AbstractC1281l
    /* JADX INFO: renamed from: lًٔۘ */
    public final InterfaceC10233l mo864l() {
        return this;
    }
}
