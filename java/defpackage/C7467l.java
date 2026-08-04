package defpackage;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: renamed from: lؘؚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7467l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final HashMap f15445l = new HashMap();

    static {
        for (EnumC13484l enumC13484l : EnumC13484l.values()) {
            f15445l.put(enumC13484l.f26479l, enumC13484l);
        }
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public static C7467l m2188l() {
        EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
        C8117l c8117l = new C8117l("hdlr");
        c8117l.purchase(34);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(26);
        byteBufferAllocate.put(8, (byte) 109);
        byteBufferAllocate.put(9, (byte) 100);
        byteBufferAllocate.put(10, (byte) 105);
        byteBufferAllocate.put(11, (byte) 114);
        byteBufferAllocate.put(12, (byte) 97);
        byteBufferAllocate.put(13, (byte) 112);
        byteBufferAllocate.put(14, (byte) 112);
        byteBufferAllocate.put(15, (byte) 108);
        byteBufferAllocate.rewind();
        C7467l c7467l = new C7467l(0);
        c7467l.f33215l = c8117l;
        c7467l.f33214l = byteBufferAllocate;
        return c7467l;
    }

    @Override // defpackage.AbstractC17054l
    public final String toString() {
        throw null;
    }
}
