package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* JADX INFO: renamed from: lِٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11835l implements InterfaceC18477l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C8322l f23669l;

    public C11835l(C8322l c8322l) {
        this.f23669l = c8322l;
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final Object mo2330l() {
        return new C6539l(this.f23669l.yandex(null), null, null);
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public final Object mo2331l(InputStream inputStream) throws C16916l {
        try {
            C15913l c15913l = AbstractC8237l.amazon;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
            AbstractC11036l.purchase(inputStream, byteArrayOutputStream);
            String strAds = AbstractC16648l.ads(byteArrayOutputStream.toByteArray());
            c15913l.getClass();
            return (C6539l) c15913l.loadAd(C6539l.Companion.serializer(), strAds);
        } catch (Exception e) {
            throw new C16916l("Cannot parse session data", e);
        }
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٌّۡ */
    public final Unit mo2332l(OutputStream outputStream, Object obj) throws IOException {
        outputStream.write(AbstractC8237l.amazon.crashlytics(C6539l.Companion.serializer(), (C6539l) obj).getBytes(AbstractC9050l.yandex));
        return Unit.INSTANCE;
    }
}
