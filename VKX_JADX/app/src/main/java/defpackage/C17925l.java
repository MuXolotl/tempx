package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l٘ٔ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17925l extends AbstractC3352l {
    public final /* synthetic */ int loadAd;

    public /* synthetic */ C17925l(int i) {
        this.loadAd = i;
    }

    public final ByteBuffer billing(InterfaceC13280l interfaceC13280l, int i) {
        switch (this.loadAd) {
            case 0:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Iterator itIsPro = interfaceC13280l.isPro();
                    boolean z = false;
                    while (itIsPro.hasNext()) {
                        InterfaceC4656l interfaceC4656l = (InterfaceC4656l) itIsPro.next();
                        if (!(interfaceC4656l instanceof C10801l)) {
                            byteArrayOutputStream.write(interfaceC4656l.billing());
                        } else if (!z) {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            C9258l c9258lListIterator = interfaceC13280l.crashlytics(EnumC17969l.COVER_ART).listIterator(0);
                            while (c9258lListIterator.hasNext()) {
                                byteArrayOutputStream2.write(((AbstractC5550l) ((InterfaceC4656l) c9258lListIterator.next())).amazon());
                            }
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            byteArrayOutputStream.write(AbstractC14375l.purchase(byteArray.length + 8));
                            byteArrayOutputStream.write(EnumC16541l.ARTWORK.f32477l.getBytes(AbstractC12379l.loadAd));
                            byteArrayOutputStream.write(byteArray);
                            z = true;
                        }
                    }
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    byteArrayOutputStream3.write(AbstractC14375l.purchase(byteArrayOutputStream.size() + 8));
                    EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
                    byteArrayOutputStream3.write("ilst".getBytes(AbstractC12379l.loadAd));
                    byteArrayOutputStream3.write(byteArrayOutputStream.toByteArray());
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream3.toByteArray());
                    byteBufferWrap.rewind();
                    return byteBufferWrap;
                } catch (IOException e) {
                    C11467l.metrica(e);
                    return null;
                }
            default:
                try {
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    C4391l c4391l = (C4391l) interfaceC13280l;
                    c4391l.getClass();
                    List listAdcel = c4391l.adcel(EnumC14884l.VENDOR.f29270l);
                    String string = listAdcel.size() != 0 ? ((InterfaceC4656l) listAdcel.get(0)).toString() : "";
                    Charset charset = AbstractC12379l.crashlytics;
                    byteArrayOutputStream4.write(AbstractC14375l.billing(string.getBytes(charset).length));
                    byteArrayOutputStream4.write(string.getBytes(charset));
                    byteArrayOutputStream4.write(AbstractC14375l.billing(interfaceC13280l.amazon() - 1));
                    Iterator itIsPro2 = interfaceC13280l.isPro();
                    while (itIsPro2.hasNext()) {
                        InterfaceC4656l interfaceC4656l2 = (InterfaceC4656l) itIsPro2.next();
                        if (!interfaceC4656l2.getId().equals(EnumC14884l.VENDOR.f29270l)) {
                            byteArrayOutputStream4.write(interfaceC4656l2.billing());
                        }
                    }
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(byteArrayOutputStream4.toByteArray());
                    byteBufferWrap2.rewind();
                    return byteBufferWrap2;
                } catch (IOException e2) {
                    C11467l.metrica(e2);
                    return null;
                }
        }
    }
}
