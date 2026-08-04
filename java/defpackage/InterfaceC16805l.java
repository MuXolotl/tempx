package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: lٖۨۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC16805l extends InterfaceC10506l, WritableByteChannel {
    InterfaceC16805l appmetrica(C3844l c3844l);

    C0869l crashlytics();

    /* JADX INFO: renamed from: finally */
    InterfaceC16805l mo706finally(String str);

    @Override // defpackage.InterfaceC10506l, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: for */
    InterfaceC16805l mo707for(int i);

    /* JADX INFO: renamed from: public */
    InterfaceC16805l mo728public(int i, byte[] bArr);

    /* JADX INFO: renamed from: return */
    InterfaceC16805l mo729return(int i, int i2, String str);

    /* JADX INFO: renamed from: throws */
    InterfaceC16805l mo734throws(long j);

    /* JADX INFO: renamed from: volatile */
    long mo736volatile(InterfaceC14991l interfaceC14991l);

    InterfaceC16805l write(byte[] bArr);

    InterfaceC16805l writeByte(int i);

    InterfaceC16805l writeInt(int i);

    InterfaceC16805l writeShort(int i);
}
