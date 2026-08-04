package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lِؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1566l extends AbstractC12655l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f3885l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC18001l[] f3886l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f3887l;

    public C1566l(InterfaceC11792l interfaceC11792l, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(interfaceC11792l);
        this.f3886l = new InterfaceC18001l[]{new C0883l(i, byteBuffer), new C0883l(byteBuffer2, i), new C0883l(byteBuffer3, i)};
        this.f3885l = i;
        this.f3887l = i2;
    }

    @Override // defpackage.AbstractC12655l, defpackage.InterfaceC11792l
    public final InterfaceC18001l[] license() {
        return this.f3886l;
    }

    @Override // defpackage.AbstractC12655l, defpackage.InterfaceC11792l
    public final int loadAd() {
        return this.f3887l;
    }

    @Override // defpackage.AbstractC12655l, defpackage.InterfaceC11792l
    public final int purchase() {
        return this.f3885l;
    }
}
