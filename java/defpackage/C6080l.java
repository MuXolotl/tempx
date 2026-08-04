package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؘۥؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6080l implements InterfaceC16922l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16851l f12853l = new C16851l();

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        C16851l c16851l = this.f12853l;
        int size = c16851l.size();
        c16851l.yandex(bArr, i);
        reset();
        return size;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "NULL";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f12853l.size();
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        this.f12853l.reset();
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) throws IOException {
        this.f12853l.write(b);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) throws IOException {
        this.f12853l.write(bArr, i, i2);
    }
}
