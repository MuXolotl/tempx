package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓٙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14231l {
    public static final String admob(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("0123456789ABCDEF".charAt((i >> 4) & 15));
        sb.append("0123456789ABCDEF".charAt(i & 15));
        return sb.toString();
    }

    public static final InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, C15389l c15389l, EnumC7283l enumC7283l, Function2 function2) {
        return interfaceC17242l.premium(new C11230l(c15389l, function2, enumC7283l));
    }

    public static C17219l billing(byte[] bArr) {
        UUID[] uuidArr;
        C13143l c13143l = new C13143l(bArr);
        if (c13143l.crashlytics < 32) {
            return null;
        }
        c13143l.m3562for(0);
        int iYandex = c13143l.yandex();
        int iRemoteconfig = c13143l.remoteconfig();
        if (iRemoteconfig != iYandex) {
            AbstractC6427l.vip("PsshAtomUtil", "Advertised atom size (" + iRemoteconfig + ") does not match buffer size: " + iYandex);
            return null;
        }
        int iRemoteconfig2 = c13143l.remoteconfig();
        if (iRemoteconfig2 != 1886614376) {
            AbstractC12900l.subscription("Atom type is not pssh: ", iRemoteconfig2, "PsshAtomUtil");
            return null;
        }
        int iPurchase = AbstractC2686l.purchase(c13143l.remoteconfig());
        if (iPurchase > 1) {
            AbstractC12900l.subscription("Unsupported pssh version: ", iPurchase, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(c13143l.Signature(), c13143l.Signature());
        if (iPurchase == 1) {
            int iInmobi = c13143l.inmobi();
            uuidArr = new UUID[iInmobi];
            for (int i = 0; i < iInmobi; i++) {
                uuidArr[i] = new UUID(c13143l.Signature(), c13143l.Signature());
            }
        } else {
            uuidArr = null;
        }
        int iInmobi2 = c13143l.inmobi();
        int iYandex2 = c13143l.yandex();
        if (iInmobi2 == iYandex2) {
            byte[] bArr2 = new byte[iInmobi2];
            c13143l.firebase(0, iInmobi2, bArr2);
            return new C17219l(uuid, iPurchase, bArr2, uuidArr);
        }
        AbstractC6427l.vip("PsshAtomUtil", "Atom data size (" + iInmobi2 + ") does not match the bytes left: " + iYandex2);
        return null;
    }

    public static byte[] crashlytics(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static final C16918l loadAd(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C16918l(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static byte[] mopub(UUID uuid, byte[] bArr) {
        C17219l c17219lBilling = billing(bArr);
        if (c17219lBilling == null) {
            return null;
        }
        UUID uuid2 = (UUID) c17219lBilling.f33423l;
        if (uuid.equals(uuid2)) {
            return (byte[]) c17219lBilling.f33427l;
        }
        AbstractC6427l.vip("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static final float purchase(float f, float f2, float f3) {
        return AbstractC4338l.Signature(f2, f, f3, f);
    }

    public static final C16918l subs(C8896l c8896l) {
        return new C16918l(Math.round(c8896l.yandex), Math.round(c8896l.loadAd), Math.round(c8896l.crashlytics), Math.round(c8896l.amazon));
    }

    public static final C5016l yandex(int i, String str) {
        StringBuilder sbIsVip = AbstractC5020l.isVip("Expected ", str, ", but found ");
        sbIsVip.append(admob(i));
        return new C5016l(sbIsVip.toString());
    }
}
