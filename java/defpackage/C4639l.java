package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗؔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4639l implements InterfaceC5763l, InterfaceC15446l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9439l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6168l f9437l = new C6168l(25);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C2782l f9436l = new C2782l(26);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C4639l f9438l = new C4639l(2);

    public /* synthetic */ C4639l(int i) {
        this.f9439l = i;
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        switch (this.f9439l) {
            case 0:
                return f9437l;
            case 1:
                return f9436l;
            default:
                return this;
        }
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final /* bridge */ InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        switch (this.f9439l) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final /* bridge */ InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        switch (this.f9439l) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        switch (this.f9439l) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        switch (this.f9439l) {
            case 0:
                break;
            case 1:
                break;
        }
        return function2.invoke(obj, this);
    }
}
