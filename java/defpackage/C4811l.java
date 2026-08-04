package defpackage;

/* JADX INFO: renamed from: lُؗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4811l extends AbstractC5890l {
    public final byte[] amazon;

    public C4811l(String str) {
        super(3, str);
        this.amazon = str.getBytes(AbstractC9050l.yandex);
    }

    @Override // defpackage.AbstractC5890l
    public final void loadAd(C16535l c16535l) {
        for (byte b : this.amazon) {
            c16535l.admob(b, 8);
        }
    }

    @Override // defpackage.AbstractC5890l
    public final int yandex() {
        return this.amazon.length;
    }
}
