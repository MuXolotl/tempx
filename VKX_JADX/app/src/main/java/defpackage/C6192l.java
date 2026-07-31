package defpackage;

import android.os.Bundle;
import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؙُؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6192l {
    public final SharedMemory yandex;

    public C6192l(SharedMemory sharedMemory) {
        this.yandex = sharedMemory;
    }

    public static byte[] loadAd(Bundle bundle) throws Throwable {
        ByteBuffer byteBufferMapReadOnly;
        SharedMemory sharedMemory = (SharedMemory) bundle.getParcelable(C16523l.billing);
        try {
            if (sharedMemory == null) {
                return null;
            }
            try {
                byteBufferMapReadOnly = sharedMemory.mapReadOnly();
                try {
                    byte[] bArr = new byte[sharedMemory.getSize()];
                    byteBufferMapReadOnly.get(bArr);
                    SharedMemory.unmap(byteBufferMapReadOnly);
                    sharedMemory.close();
                    return bArr;
                } catch (Exception e) {
                    e = e;
                    AbstractC6427l.metrica("BundleableByteArray", "Failed to read byte array from shared memory", e);
                    if (byteBufferMapReadOnly != null) {
                        SharedMemory.unmap(byteBufferMapReadOnly);
                    }
                    sharedMemory.close();
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                byteBufferMapReadOnly = null;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    SharedMemory.unmap(null);
                }
                sharedMemory.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static C6192l yandex(byte[] bArr) {
        SharedMemory sharedMemoryCreate;
        try {
            sharedMemoryCreate = SharedMemory.create("BundleableByteArray", bArr.length);
            try {
                ByteBuffer byteBufferMapReadWrite = sharedMemoryCreate.mapReadWrite();
                byteBufferMapReadWrite.put(bArr);
                SharedMemory.unmap(byteBufferMapReadWrite);
                sharedMemoryCreate.setProtect(OsConstants.PROT_READ);
                return new C6192l(sharedMemoryCreate);
            } catch (Exception e) {
                e = e;
                AbstractC6427l.metrica("BundleableByteArray", "Failed to allocate shared memory for byte array, size=" + bArr.length, e);
                if (sharedMemoryCreate != null) {
                    sharedMemoryCreate.close();
                }
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            sharedMemoryCreate = null;
        }
    }
}
