package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: lُؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10857l extends AbstractC15396l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f21951l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f21952l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10857l(int i) {
        super(2048);
        this.f21952l = i;
        this.f21951l = 4098;
    }

    @Override // defpackage.AbstractC15396l
    public final Object billing() {
        switch (this.f21952l) {
            case 0:
                return ByteBuffer.allocate(this.f21951l);
            default:
                return ByteBuffer.allocateDirect(this.f21951l);
        }
    }

    @Override // defpackage.AbstractC15396l
    public final void vip(Object obj) {
        int i = this.f21952l;
        int i2 = this.f21951l;
        switch (i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (byteBuffer.capacity() != i2) {
                    C8339l.smaato("Check failed.");
                    break;
                } else if (byteBuffer.isDirect()) {
                    C8339l.smaato("Check failed.");
                    break;
                }
                break;
            default:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                if (byteBuffer2.capacity() != i2) {
                    C8339l.smaato("Check failed.");
                    break;
                } else if (!byteBuffer2.isDirect()) {
                    C8339l.smaato("Check failed.");
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC15396l
    public final Object yandex(Object obj) {
        switch (this.f21952l) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.clear();
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                return byteBuffer;
            default:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                byteBuffer2.clear();
                byteBuffer2.order(ByteOrder.BIG_ENDIAN);
                return byteBuffer2;
        }
    }
}
