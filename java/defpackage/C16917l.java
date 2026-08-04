package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: lٗؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16917l extends AbstractC9453l {
    public static final Parcelable.Creator<C16917l> CREATOR = new C18485l(0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ParcelFileDescriptor f32993l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f32994l;

    public static void billing(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16917l) {
            return Arrays.equals(this.f32994l, ((C16917l) obj).f32994l);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f32994l);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009a A[PHI: r7
  0x009a: PHI (r7v4 java.io.DataOutputStream) = (r7v3 java.io.DataOutputStream), (r7v5 java.io.DataOutputStream) binds: [B:42:0x00b3, B:37:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0062: MOVE (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:99), block:B:20:0x0062 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        Closeable closeable;
        DataOutputStream dataOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        byte[] bArr = this.f32994l;
        Closeable closeable2 = null;
        if (bArr != null) {
            try {
                if (this.f32993l == null) {
                    try {
                        try {
                            File file = AbstractC16814l.loadAd;
                            if (file == null) {
                                throw new IllegalStateException("Must set temp dir before writing this object to a parcel");
                            }
                            try {
                                File fileCreateTempFile = File.createTempFile("teleporter" + SystemClock.elapsedRealtime(), ".tmp", file);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                                    fileCreateTempFile.delete();
                                    Pair pairCreate = Pair.create(fileOutputStream, parcelFileDescriptorOpen);
                                    dataOutputStream = new DataOutputStream(new BufferedOutputStream((OutputStream) pairCreate.first));
                                    try {
                                        dataOutputStream.writeInt(bArr.length);
                                        dataOutputStream.write(bArr);
                                        parcelFileDescriptor = (ParcelFileDescriptor) pairCreate.second;
                                        billing(dataOutputStream);
                                    } catch (IOException e) {
                                        e = e;
                                        Log.e("ParcelByteArray", "Could not write into unlinked file. " + e.toString());
                                        if (dataOutputStream != null) {
                                            billing(dataOutputStream);
                                        }
                                        parcelFileDescriptor = null;
                                    } catch (IllegalStateException e2) {
                                        e = e2;
                                        Log.e("ParcelByteArray", "Could not create unlinked file. " + e.toString());
                                        if (dataOutputStream != null) {
                                            billing(dataOutputStream);
                                        }
                                        parcelFileDescriptor = null;
                                    }
                                    this.f32993l = parcelFileDescriptor;
                                } catch (FileNotFoundException e3) {
                                    throw new IllegalStateException("Temporary file is somehow already deleted", e3);
                                }
                            } catch (IOException e4) {
                                throw new IllegalStateException("Could not create temporary file", e4);
                            }
                        } catch (IllegalStateException e5) {
                            e = e5;
                            dataOutputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            if (closeable2 != null) {
                                billing(closeable2);
                            }
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        dataOutputStream = null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
            }
        }
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 1, this.f32993l, i | 1);
        AbstractC9968l.Signature(parcel, iTapsense);
        this.f32993l = null;
    }
}
