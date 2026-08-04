package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؙؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0883l implements InterfaceC18001l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f2533l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ByteBuffer f2534l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2535l = 2;

    public C0883l(int i, ByteBuffer byteBuffer) {
        this.f2533l = i;
        this.f2534l = byteBuffer;
    }

    @Override // defpackage.InterfaceC18001l
    public int ad() {
        switch (this.f2535l) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    @Override // defpackage.InterfaceC18001l
    public ByteBuffer crashlytics() {
        switch (this.f2535l) {
            case 0:
                break;
        }
        return this.f2534l;
    }

    @Override // defpackage.InterfaceC18001l
    public int firebase() {
        switch (this.f2535l) {
            case 0:
                break;
        }
        return this.f2533l;
    }

    public /* synthetic */ C0883l() {
    }

    public C0883l(ByteBuffer byteBuffer, int i) {
        this.f2534l = byteBuffer;
        this.f2533l = i;
    }
}
