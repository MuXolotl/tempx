package defpackage;

import android.util.Size;

/* JADX INFO: renamed from: lُٕٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15607l extends AbstractC12655l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f30460l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC11699l f30461l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f30462l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f30463l;

    public C15607l(InterfaceC11792l interfaceC11792l, Size size, InterfaceC11699l interfaceC11699l) {
        super(interfaceC11792l);
        this.f30462l = new Object();
        if (size == null) {
            this.f30463l = this.f24884l.purchase();
            this.f30460l = this.f24884l.loadAd();
        } else {
            this.f30463l = size.getWidth();
            this.f30460l = size.getHeight();
        }
        this.f30461l = interfaceC11699l;
    }

    @Override // defpackage.AbstractC12655l, defpackage.InterfaceC11792l
    /* JADX INFO: renamed from: const */
    public final InterfaceC11699l mo1829const() {
        return this.f30461l;
    }

    @Override // defpackage.AbstractC12655l, defpackage.InterfaceC11792l
    public final int loadAd() {
        return this.f30460l;
    }

    @Override // defpackage.AbstractC12655l, defpackage.InterfaceC11792l
    public final int purchase() {
        return this.f30463l;
    }
}
