package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: lَؘؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9993l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayList f20392l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f20393l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f20394l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9993l(C8117l c8117l, ByteBuffer byteBuffer) {
        ArrayList arrayList;
        super(0);
        int i = 0;
        this.f33215l = c8117l;
        if (!c8117l.yandex.equals("data")) {
            C8339l.isPro(c8117l.yandex, "Unable to process data box because identifier is:");
            throw null;
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f33214l = byteBufferSlice;
        int iCrashlytics = AbstractC14375l.crashlytics(byteBufferSlice, 1, 3);
        EnumC11981l enumC11981l = EnumC11981l.IMPLICIT;
        if (iCrashlytics == 1) {
            this.f20393l = AbstractC14375l.mopub((ByteBuffer) this.f33214l, 8, c8117l.yandex() - 8, AbstractC12379l.crashlytics);
            return;
        }
        if (iCrashlytics == 0) {
            this.f20392l = new ArrayList();
            int i2 = 0;
            while (true) {
                int iYandex = (c8117l.yandex() - 8) / 2;
                arrayList = this.f20392l;
                if (i2 >= iYandex) {
                    break;
                }
                int i3 = i2 * 2;
                arrayList.add(Short.valueOf((short) AbstractC14375l.crashlytics((ByteBuffer) this.f33214l, i3 + 8, i3 + 9)));
                i2++;
            }
            StringBuilder sb = new StringBuilder(1024);
            int size = arrayList.size() - 1;
            while (i <= size) {
                sb.append(this.f20392l.get(i));
                if (i < size) {
                    sb.append("/");
                }
                i++;
            }
            this.f20393l = sb.toString();
            return;
        }
        if (iCrashlytics != 21) {
            if (iCrashlytics == 13) {
                this.f20393l = AbstractC14375l.mopub((ByteBuffer) this.f33214l, 8, c8117l.yandex() - 8, AbstractC12379l.crashlytics);
                return;
            }
            return;
        }
        this.f20393l = Integer.toString(AbstractC14375l.crashlytics((ByteBuffer) this.f33214l, 8, c8117l.yandex() - 1));
        byte[] bArr = new byte[c8117l.yandex() - 8];
        this.f20394l = bArr;
        int iPosition = byteBuffer.position();
        byteBuffer.position(iPosition + 8);
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        this.f20392l = new ArrayList();
        while (i < (c8117l.yandex() - 8) / 2) {
            int i4 = i * 2;
            this.f20392l.add(Short.valueOf((short) AbstractC14375l.crashlytics((ByteBuffer) this.f33214l, i4 + 8, i4 + 9)));
            i++;
        }
    }
}
