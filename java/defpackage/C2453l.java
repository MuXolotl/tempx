package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؙٟؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2453l extends AbstractC5550l implements InterfaceC7988l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f5241l;

    public C2453l(String str, String str2) {
        super(str);
        this.f5241l = str2;
    }

    @Override // defpackage.InterfaceC7988l
    public final String admob() {
        return this.f5241l;
    }

    @Override // defpackage.AbstractC5550l
    public EnumC11981l crashlytics() {
        return EnumC11981l.TEXT;
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        return this.f5241l.trim().equals("");
    }

    @Override // defpackage.AbstractC5550l
    public byte[] loadAd() {
        return this.f5241l.getBytes(AbstractC12379l.crashlytics);
    }

    @Override // defpackage.InterfaceC4656l
    public final String toString() {
        return this.f5241l;
    }

    @Override // defpackage.AbstractC5550l
    public void yandex(ByteBuffer byteBuffer) {
        this.f5241l = new C9993l(new C8117l(byteBuffer), byteBuffer).f20393l;
    }
}
