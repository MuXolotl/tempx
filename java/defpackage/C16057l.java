package defpackage;

/* JADX INFO: renamed from: lٕۥۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16057l extends AbstractC13868l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC13235l f31460l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC15879l f31461l;

    public C16057l(InterfaceC15879l interfaceC15879l, InterfaceC13235l interfaceC13235l) {
        super(interfaceC15879l);
        this.f31461l = interfaceC15879l;
        this.f31460l = interfaceC13235l;
        C5138l c5138l = (C5138l) interfaceC13235l;
        c5138l.m1720public();
        int i = AbstractC14352l.yandex;
        C6916l c6916l = InterfaceC13235l.billing;
        Boolean bool = Boolean.FALSE;
        ((Boolean) ((C7420l) c5138l.subs()).smaato(c6916l, bool)).getClass();
        ((Boolean) ((C7420l) c5138l.subs()).smaato(InterfaceC13235l.mopub, bool)).getClass();
    }

    @Override // defpackage.AbstractC13868l, defpackage.InterfaceC15879l
    public final AbstractC8769l admob() {
        return this.f31461l.admob();
    }

    @Override // defpackage.AbstractC13868l, defpackage.InterfaceC15879l
    public final boolean purchase() {
        return this.f27125l.purchase();
    }

    @Override // defpackage.AbstractC13868l, defpackage.InterfaceC15879l
    public final InterfaceC15879l subs() {
        return this.f31461l;
    }

    @Override // defpackage.AbstractC13868l, defpackage.InterfaceC15879l
    /* JADX INFO: renamed from: throws */
    public final AbstractC8769l mo3792throws() {
        return this.f31461l.mo3792throws();
    }
}
