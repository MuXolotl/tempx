package defpackage;

/* JADX INFO: renamed from: lِٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC11976l implements InterfaceC16520l {
    IN_PROGRESS(0),
    COMPLETED(1),
    FAILED(2),
    REFUNDED(3);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f23868l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3562l f23864l = new C3562l(1, AbstractC18202l.yandex.loadAd(EnumC11976l.class), 2, IN_PROGRESS);

    EnumC11976l(int i) {
        this.f23868l = i;
    }

    @Override // defpackage.InterfaceC16520l
    public final int getValue() {
        return this.f23868l;
    }
}
